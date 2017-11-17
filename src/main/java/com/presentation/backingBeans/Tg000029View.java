package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000029DTO;

import com.utilities.*;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;

import org.primefaces.event.RowEditEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 * @author Zathura Code Generator http://zathuracode.org
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class Tg000029View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000029View.class);
    private InputText txtNombSubTipoCotizante;
    private InputText txtCodSubTipoCotizante;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000029DTO> data;
    private Tg000029DTO selectedTg000029;
    private Tg000029 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000029View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000029 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000029 = null;

        if (txtNombSubTipoCotizante != null) {
            txtNombSubTipoCotizante.setValue(null);
            txtNombSubTipoCotizante.setDisabled(true);
        }

        if (txtCodSubTipoCotizante != null) {
            txtCodSubTipoCotizante.setValue(null);
            txtCodSubTipoCotizante.setDisabled(false);
        }

        if (btnSave != null) {
            btnSave.setDisabled(true);
        }

        if (btnDelete != null) {
            btnDelete.setDisabled(true);
        }

        return "";
    }

    public void listener_txtId() {
        try {
            String codSubTipoCotizante = FacesUtils.checkString(txtCodSubTipoCotizante);
            entity = (codSubTipoCotizante != null)
                ? businessDelegatorView.getTg000029(codSubTipoCotizante) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtNombSubTipoCotizante.setDisabled(false);
            txtCodSubTipoCotizante.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtNombSubTipoCotizante.setValue(entity.getNombSubTipoCotizante());
            txtNombSubTipoCotizante.setDisabled(false);
            txtCodSubTipoCotizante.setValue(entity.getCodSubTipoCotizante());
            txtCodSubTipoCotizante.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000029 = (Tg000029DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000029"));
        txtNombSubTipoCotizante.setValue(selectedTg000029.getNombSubTipoCotizante());
        txtNombSubTipoCotizante.setDisabled(false);
        txtCodSubTipoCotizante.setValue(selectedTg000029.getCodSubTipoCotizante());
        txtCodSubTipoCotizante.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000029 == null) && (entity == null)) {
                action_create();
            } else {
                action_modify();
            }

            data = null;
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_create() {
        try {
            entity = new Tg000029();

            String codSubTipoCotizante = FacesUtils.checkString(txtCodSubTipoCotizante);

            entity.setCodSubTipoCotizante(codSubTipoCotizante);
            entity.setNombSubTipoCotizante(FacesUtils.checkString(
                    txtNombSubTipoCotizante));
            businessDelegatorView.saveTg000029(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);
            action_clear();
        } catch (Exception e) {
            entity = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_modify() {
        try {
            if (entity == null) {
                String codSubTipoCotizante = new String(selectedTg000029.getCodSubTipoCotizante());
                entity = businessDelegatorView.getTg000029(codSubTipoCotizante);
            }

            entity.setNombSubTipoCotizante(FacesUtils.checkString(
                    txtNombSubTipoCotizante));
            businessDelegatorView.updateTg000029(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000029 = (Tg000029DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000029"));

            String codSubTipoCotizante = new String(selectedTg000029.getCodSubTipoCotizante());
            entity = businessDelegatorView.getTg000029(codSubTipoCotizante);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codSubTipoCotizante = FacesUtils.checkString(txtCodSubTipoCotizante);
            entity = businessDelegatorView.getTg000029(codSubTipoCotizante);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000029(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
            action_clear();
            data = null;
        } catch (Exception e) {
            throw e;
        }
    }

    public String action_closeDialog() {
        setShowDialog(false);
        action_clear();

        return "";
    }

    public String action_modifyWitDTO(String codSubTipoCotizante,
        String nombSubTipoCotizante) throws Exception {
        try {
            entity.setNombSubTipoCotizante(FacesUtils.checkString(
                    nombSubTipoCotizante));
            businessDelegatorView.updateTg000029(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000029View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtNombSubTipoCotizante() {
        return txtNombSubTipoCotizante;
    }

    public void setTxtNombSubTipoCotizante(InputText txtNombSubTipoCotizante) {
        this.txtNombSubTipoCotizante = txtNombSubTipoCotizante;
    }

    public InputText getTxtCodSubTipoCotizante() {
        return txtCodSubTipoCotizante;
    }

    public void setTxtCodSubTipoCotizante(InputText txtCodSubTipoCotizante) {
        this.txtCodSubTipoCotizante = txtCodSubTipoCotizante;
    }

    public List<Tg000029DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000029();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000029DTO> tg000029DTO) {
        this.data = tg000029DTO;
    }

    public Tg000029DTO getSelectedTg000029() {
        return selectedTg000029;
    }

    public void setSelectedTg000029(Tg000029DTO tg000029) {
        this.selectedTg000029 = tg000029;
    }

    public CommandButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(CommandButton btnSave) {
        this.btnSave = btnSave;
    }

    public CommandButton getBtnModify() {
        return btnModify;
    }

    public void setBtnModify(CommandButton btnModify) {
        this.btnModify = btnModify;
    }

    public CommandButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(CommandButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public CommandButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(CommandButton btnClear) {
        this.btnClear = btnClear;
    }

    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }

    public IBusinessDelegatorView getBusinessDelegatorView() {
        return businessDelegatorView;
    }

    public void setBusinessDelegatorView(
        IBusinessDelegatorView businessDelegatorView) {
        this.businessDelegatorView = businessDelegatorView;
    }

    public boolean isShowDialog() {
        return showDialog;
    }

    public void setShowDialog(boolean showDialog) {
        this.showDialog = showDialog;
    }
}
