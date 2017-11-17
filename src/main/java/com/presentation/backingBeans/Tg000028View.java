package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000028DTO;

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
public class Tg000028View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000028View.class);
    private InputText txtNombTipoCotizante;
    private InputText txtCodTipoCotizante;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000028DTO> data;
    private Tg000028DTO selectedTg000028;
    private Tg000028 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000028View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000028 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000028 = null;

        if (txtNombTipoCotizante != null) {
            txtNombTipoCotizante.setValue(null);
            txtNombTipoCotizante.setDisabled(true);
        }

        if (txtCodTipoCotizante != null) {
            txtCodTipoCotizante.setValue(null);
            txtCodTipoCotizante.setDisabled(false);
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
            String codTipoCotizante = FacesUtils.checkString(txtCodTipoCotizante);
            entity = (codTipoCotizante != null)
                ? businessDelegatorView.getTg000028(codTipoCotizante) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtNombTipoCotizante.setDisabled(false);
            txtCodTipoCotizante.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtNombTipoCotizante.setValue(entity.getNombTipoCotizante());
            txtNombTipoCotizante.setDisabled(false);
            txtCodTipoCotizante.setValue(entity.getCodTipoCotizante());
            txtCodTipoCotizante.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000028 = (Tg000028DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000028"));
        txtNombTipoCotizante.setValue(selectedTg000028.getNombTipoCotizante());
        txtNombTipoCotizante.setDisabled(false);
        txtCodTipoCotizante.setValue(selectedTg000028.getCodTipoCotizante());
        txtCodTipoCotizante.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000028 == null) && (entity == null)) {
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
            entity = new Tg000028();

            String codTipoCotizante = FacesUtils.checkString(txtCodTipoCotizante);

            entity.setCodTipoCotizante(codTipoCotizante);
            entity.setNombTipoCotizante(FacesUtils.checkString(
                    txtNombTipoCotizante));
            businessDelegatorView.saveTg000028(entity);
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
                String codTipoCotizante = new String(selectedTg000028.getCodTipoCotizante());
                entity = businessDelegatorView.getTg000028(codTipoCotizante);
            }

            entity.setNombTipoCotizante(FacesUtils.checkString(
                    txtNombTipoCotizante));
            businessDelegatorView.updateTg000028(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000028 = (Tg000028DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000028"));

            String codTipoCotizante = new String(selectedTg000028.getCodTipoCotizante());
            entity = businessDelegatorView.getTg000028(codTipoCotizante);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codTipoCotizante = FacesUtils.checkString(txtCodTipoCotizante);
            entity = businessDelegatorView.getTg000028(codTipoCotizante);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000028(entity);
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

    public String action_modifyWitDTO(String codTipoCotizante,
        String nombTipoCotizante) throws Exception {
        try {
            entity.setNombTipoCotizante(FacesUtils.checkString(
                    nombTipoCotizante));
            businessDelegatorView.updateTg000028(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000028View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtNombTipoCotizante() {
        return txtNombTipoCotizante;
    }

    public void setTxtNombTipoCotizante(InputText txtNombTipoCotizante) {
        this.txtNombTipoCotizante = txtNombTipoCotizante;
    }

    public InputText getTxtCodTipoCotizante() {
        return txtCodTipoCotizante;
    }

    public void setTxtCodTipoCotizante(InputText txtCodTipoCotizante) {
        this.txtCodTipoCotizante = txtCodTipoCotizante;
    }

    public List<Tg000028DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000028();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000028DTO> tg000028DTO) {
        this.data = tg000028DTO;
    }

    public Tg000028DTO getSelectedTg000028() {
        return selectedTg000028;
    }

    public void setSelectedTg000028(Tg000028DTO tg000028) {
        this.selectedTg000028 = tg000028;
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
