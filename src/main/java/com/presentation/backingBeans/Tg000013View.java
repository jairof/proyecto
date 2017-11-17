package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000013DTO;

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
public class Tg000013View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000013View.class);
    private InputText txtDesActividad;
    private InputText txtNivelRiesgo;
    private InputText txtCodActividad;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000013DTO> data;
    private Tg000013DTO selectedTg000013;
    private Tg000013 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000013View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000013 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000013 = null;

        if (txtDesActividad != null) {
            txtDesActividad.setValue(null);
            txtDesActividad.setDisabled(true);
        }

        if (txtNivelRiesgo != null) {
            txtNivelRiesgo.setValue(null);
            txtNivelRiesgo.setDisabled(true);
        }

        if (txtCodActividad != null) {
            txtCodActividad.setValue(null);
            txtCodActividad.setDisabled(false);
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
            String codActividad = FacesUtils.checkString(txtCodActividad);
            entity = (codActividad != null)
                ? businessDelegatorView.getTg000013(codActividad) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesActividad.setDisabled(false);
            txtNivelRiesgo.setDisabled(false);
            txtCodActividad.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesActividad.setValue(entity.getDesActividad());
            txtDesActividad.setDisabled(false);
            txtNivelRiesgo.setValue(entity.getNivelRiesgo());
            txtNivelRiesgo.setDisabled(false);
            txtCodActividad.setValue(entity.getCodActividad());
            txtCodActividad.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000013 = (Tg000013DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000013"));
        txtDesActividad.setValue(selectedTg000013.getDesActividad());
        txtDesActividad.setDisabled(false);
        txtNivelRiesgo.setValue(selectedTg000013.getNivelRiesgo());
        txtNivelRiesgo.setDisabled(false);
        txtCodActividad.setValue(selectedTg000013.getCodActividad());
        txtCodActividad.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000013 == null) && (entity == null)) {
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
            entity = new Tg000013();

            String codActividad = FacesUtils.checkString(txtCodActividad);

            entity.setCodActividad(codActividad);
            entity.setDesActividad(FacesUtils.checkString(txtDesActividad));
            entity.setNivelRiesgo(FacesUtils.checkString(txtNivelRiesgo));
            businessDelegatorView.saveTg000013(entity);
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
                String codActividad = new String(selectedTg000013.getCodActividad());
                entity = businessDelegatorView.getTg000013(codActividad);
            }

            entity.setDesActividad(FacesUtils.checkString(txtDesActividad));
            entity.setNivelRiesgo(FacesUtils.checkString(txtNivelRiesgo));
            businessDelegatorView.updateTg000013(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000013 = (Tg000013DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000013"));

            String codActividad = new String(selectedTg000013.getCodActividad());
            entity = businessDelegatorView.getTg000013(codActividad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codActividad = FacesUtils.checkString(txtCodActividad);
            entity = businessDelegatorView.getTg000013(codActividad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000013(entity);
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

    public String action_modifyWitDTO(String codActividad, String desActividad,
        String nivelRiesgo) throws Exception {
        try {
            entity.setDesActividad(FacesUtils.checkString(desActividad));
            entity.setNivelRiesgo(FacesUtils.checkString(nivelRiesgo));
            businessDelegatorView.updateTg000013(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000013View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesActividad() {
        return txtDesActividad;
    }

    public void setTxtDesActividad(InputText txtDesActividad) {
        this.txtDesActividad = txtDesActividad;
    }

    public InputText getTxtNivelRiesgo() {
        return txtNivelRiesgo;
    }

    public void setTxtNivelRiesgo(InputText txtNivelRiesgo) {
        this.txtNivelRiesgo = txtNivelRiesgo;
    }

    public InputText getTxtCodActividad() {
        return txtCodActividad;
    }

    public void setTxtCodActividad(InputText txtCodActividad) {
        this.txtCodActividad = txtCodActividad;
    }

    public List<Tg000013DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000013();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000013DTO> tg000013DTO) {
        this.data = tg000013DTO;
    }

    public Tg000013DTO getSelectedTg000013() {
        return selectedTg000013;
    }

    public void setSelectedTg000013(Tg000013DTO tg000013) {
        this.selectedTg000013 = tg000013;
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
