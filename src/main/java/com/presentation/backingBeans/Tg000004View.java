package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000004DTO;

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
public class Tg000004View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000004View.class);
    private InputText txtNomDepto;
    private InputText txtCodDepto;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000004DTO> data;
    private Tg000004DTO selectedTg000004;
    private Tg000004 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000004View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000004 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000004 = null;

        if (txtNomDepto != null) {
            txtNomDepto.setValue(null);
            txtNomDepto.setDisabled(true);
        }

        if (txtCodDepto != null) {
            txtCodDepto.setValue(null);
            txtCodDepto.setDisabled(false);
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
            String codDepto = FacesUtils.checkString(txtCodDepto);
            entity = (codDepto != null)
                ? businessDelegatorView.getTg000004(codDepto) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtNomDepto.setDisabled(false);
            txtCodDepto.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtNomDepto.setValue(entity.getNomDepto());
            txtNomDepto.setDisabled(false);
            txtCodDepto.setValue(entity.getCodDepto());
            txtCodDepto.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000004 = (Tg000004DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000004"));
        txtNomDepto.setValue(selectedTg000004.getNomDepto());
        txtNomDepto.setDisabled(false);
        txtCodDepto.setValue(selectedTg000004.getCodDepto());
        txtCodDepto.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000004 == null) && (entity == null)) {
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
            entity = new Tg000004();

            String codDepto = FacesUtils.checkString(txtCodDepto);

            entity.setCodDepto(codDepto);
            entity.setNomDepto(FacesUtils.checkString(txtNomDepto));
            businessDelegatorView.saveTg000004(entity);
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
                String codDepto = new String(selectedTg000004.getCodDepto());
                entity = businessDelegatorView.getTg000004(codDepto);
            }

            entity.setNomDepto(FacesUtils.checkString(txtNomDepto));
            businessDelegatorView.updateTg000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000004 = (Tg000004DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000004"));

            String codDepto = new String(selectedTg000004.getCodDepto());
            entity = businessDelegatorView.getTg000004(codDepto);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codDepto = FacesUtils.checkString(txtCodDepto);
            entity = businessDelegatorView.getTg000004(codDepto);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000004(entity);
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

    public String action_modifyWitDTO(String codDepto, String nomDepto)
        throws Exception {
        try {
            entity.setNomDepto(FacesUtils.checkString(nomDepto));
            businessDelegatorView.updateTg000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000004View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtNomDepto() {
        return txtNomDepto;
    }

    public void setTxtNomDepto(InputText txtNomDepto) {
        this.txtNomDepto = txtNomDepto;
    }

    public InputText getTxtCodDepto() {
        return txtCodDepto;
    }

    public void setTxtCodDepto(InputText txtCodDepto) {
        this.txtCodDepto = txtCodDepto;
    }

    public List<Tg000004DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000004();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000004DTO> tg000004DTO) {
        this.data = tg000004DTO;
    }

    public Tg000004DTO getSelectedTg000004() {
        return selectedTg000004;
    }

    public void setSelectedTg000004(Tg000004DTO tg000004) {
        this.selectedTg000004 = tg000004;
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
