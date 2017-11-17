package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000012DTO;

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
public class Tg000012View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000012View.class);
    private InputText txtDesProfesion;
    private InputText txtCodProfesion;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000012DTO> data;
    private Tg000012DTO selectedTg000012;
    private Tg000012 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000012View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000012 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000012 = null;

        if (txtDesProfesion != null) {
            txtDesProfesion.setValue(null);
            txtDesProfesion.setDisabled(true);
        }

        if (txtCodProfesion != null) {
            txtCodProfesion.setValue(null);
            txtCodProfesion.setDisabled(false);
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
            String codProfesion = FacesUtils.checkString(txtCodProfesion);
            entity = (codProfesion != null)
                ? businessDelegatorView.getTg000012(codProfesion) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesProfesion.setDisabled(false);
            txtCodProfesion.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesProfesion.setValue(entity.getDesProfesion());
            txtDesProfesion.setDisabled(false);
            txtCodProfesion.setValue(entity.getCodProfesion());
            txtCodProfesion.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000012 = (Tg000012DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000012"));
        txtDesProfesion.setValue(selectedTg000012.getDesProfesion());
        txtDesProfesion.setDisabled(false);
        txtCodProfesion.setValue(selectedTg000012.getCodProfesion());
        txtCodProfesion.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000012 == null) && (entity == null)) {
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
            entity = new Tg000012();

            String codProfesion = FacesUtils.checkString(txtCodProfesion);

            entity.setCodProfesion(codProfesion);
            entity.setDesProfesion(FacesUtils.checkString(txtDesProfesion));
            businessDelegatorView.saveTg000012(entity);
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
                String codProfesion = new String(selectedTg000012.getCodProfesion());
                entity = businessDelegatorView.getTg000012(codProfesion);
            }

            entity.setDesProfesion(FacesUtils.checkString(txtDesProfesion));
            businessDelegatorView.updateTg000012(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000012 = (Tg000012DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000012"));

            String codProfesion = new String(selectedTg000012.getCodProfesion());
            entity = businessDelegatorView.getTg000012(codProfesion);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codProfesion = FacesUtils.checkString(txtCodProfesion);
            entity = businessDelegatorView.getTg000012(codProfesion);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000012(entity);
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

    public String action_modifyWitDTO(String codProfesion, String desProfesion)
        throws Exception {
        try {
            entity.setDesProfesion(FacesUtils.checkString(desProfesion));
            businessDelegatorView.updateTg000012(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000012View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesProfesion() {
        return txtDesProfesion;
    }

    public void setTxtDesProfesion(InputText txtDesProfesion) {
        this.txtDesProfesion = txtDesProfesion;
    }

    public InputText getTxtCodProfesion() {
        return txtCodProfesion;
    }

    public void setTxtCodProfesion(InputText txtCodProfesion) {
        this.txtCodProfesion = txtCodProfesion;
    }

    public List<Tg000012DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000012();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000012DTO> tg000012DTO) {
        this.data = tg000012DTO;
    }

    public Tg000012DTO getSelectedTg000012() {
        return selectedTg000012;
    }

    public void setSelectedTg000012(Tg000012DTO tg000012) {
        this.selectedTg000012 = tg000012;
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
