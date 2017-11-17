package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000001DTO;

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
public class Tg000001View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000001View.class);
    private InputText txtNomBanco;
    private InputText txtCodBanco;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000001DTO> data;
    private Tg000001DTO selectedTg000001;
    private Tg000001 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000001View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000001 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000001 = null;

        if (txtNomBanco != null) {
            txtNomBanco.setValue(null);
            txtNomBanco.setDisabled(true);
        }

        if (txtCodBanco != null) {
            txtCodBanco.setValue(null);
            txtCodBanco.setDisabled(false);
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
            String codBanco = FacesUtils.checkString(txtCodBanco);
            entity = (codBanco != null)
                ? businessDelegatorView.getTg000001(codBanco) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtNomBanco.setDisabled(false);
            txtCodBanco.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtNomBanco.setValue(entity.getNomBanco());
            txtNomBanco.setDisabled(false);
            txtCodBanco.setValue(entity.getCodBanco());
            txtCodBanco.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000001 = (Tg000001DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000001"));
        txtNomBanco.setValue(selectedTg000001.getNomBanco());
        txtNomBanco.setDisabled(false);
        txtCodBanco.setValue(selectedTg000001.getCodBanco());
        txtCodBanco.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000001 == null) && (entity == null)) {
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
            entity = new Tg000001();

            String codBanco = FacesUtils.checkString(txtCodBanco);

            entity.setCodBanco(codBanco);
            entity.setNomBanco(FacesUtils.checkString(txtNomBanco));
            businessDelegatorView.saveTg000001(entity);
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
                String codBanco = new String(selectedTg000001.getCodBanco());
                entity = businessDelegatorView.getTg000001(codBanco);
            }

            entity.setNomBanco(FacesUtils.checkString(txtNomBanco));
            businessDelegatorView.updateTg000001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000001 = (Tg000001DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000001"));

            String codBanco = new String(selectedTg000001.getCodBanco());
            entity = businessDelegatorView.getTg000001(codBanco);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codBanco = FacesUtils.checkString(txtCodBanco);
            entity = businessDelegatorView.getTg000001(codBanco);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000001(entity);
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

    public String action_modifyWitDTO(String codBanco, String nomBanco)
        throws Exception {
        try {
            entity.setNomBanco(FacesUtils.checkString(nomBanco));
            businessDelegatorView.updateTg000001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000001View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtNomBanco() {
        return txtNomBanco;
    }

    public void setTxtNomBanco(InputText txtNomBanco) {
        this.txtNomBanco = txtNomBanco;
    }

    public InputText getTxtCodBanco() {
        return txtCodBanco;
    }

    public void setTxtCodBanco(InputText txtCodBanco) {
        this.txtCodBanco = txtCodBanco;
    }

    public List<Tg000001DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000001();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000001DTO> tg000001DTO) {
        this.data = tg000001DTO;
    }

    public Tg000001DTO getSelectedTg000001() {
        return selectedTg000001;
    }

    public void setSelectedTg000001(Tg000001DTO tg000001) {
        this.selectedTg000001 = tg000001;
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
