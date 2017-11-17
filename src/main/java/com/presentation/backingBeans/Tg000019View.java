package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000019DTO;

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
public class Tg000019View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000019View.class);
    private InputText txtDesIdentidad;
    private InputText txtCodIdentidad;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000019DTO> data;
    private Tg000019DTO selectedTg000019;
    private Tg000019 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000019View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000019 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000019 = null;

        if (txtDesIdentidad != null) {
            txtDesIdentidad.setValue(null);
            txtDesIdentidad.setDisabled(true);
        }

        if (txtCodIdentidad != null) {
            txtCodIdentidad.setValue(null);
            txtCodIdentidad.setDisabled(false);
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
            String codIdentidad = FacesUtils.checkString(txtCodIdentidad);
            entity = (codIdentidad != null)
                ? businessDelegatorView.getTg000019(codIdentidad) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesIdentidad.setDisabled(false);
            txtCodIdentidad.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesIdentidad.setValue(entity.getDesIdentidad());
            txtDesIdentidad.setDisabled(false);
            txtCodIdentidad.setValue(entity.getCodIdentidad());
            txtCodIdentidad.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000019 = (Tg000019DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000019"));
        txtDesIdentidad.setValue(selectedTg000019.getDesIdentidad());
        txtDesIdentidad.setDisabled(false);
        txtCodIdentidad.setValue(selectedTg000019.getCodIdentidad());
        txtCodIdentidad.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000019 == null) && (entity == null)) {
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
            entity = new Tg000019();

            String codIdentidad = FacesUtils.checkString(txtCodIdentidad);

            entity.setCodIdentidad(codIdentidad);
            entity.setDesIdentidad(FacesUtils.checkString(txtDesIdentidad));
            businessDelegatorView.saveTg000019(entity);
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
                String codIdentidad = new String(selectedTg000019.getCodIdentidad());
                entity = businessDelegatorView.getTg000019(codIdentidad);
            }

            entity.setDesIdentidad(FacesUtils.checkString(txtDesIdentidad));
            businessDelegatorView.updateTg000019(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000019 = (Tg000019DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000019"));

            String codIdentidad = new String(selectedTg000019.getCodIdentidad());
            entity = businessDelegatorView.getTg000019(codIdentidad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codIdentidad = FacesUtils.checkString(txtCodIdentidad);
            entity = businessDelegatorView.getTg000019(codIdentidad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000019(entity);
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

    public String action_modifyWitDTO(String codIdentidad, String desIdentidad)
        throws Exception {
        try {
            entity.setDesIdentidad(FacesUtils.checkString(desIdentidad));
            businessDelegatorView.updateTg000019(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000019View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesIdentidad() {
        return txtDesIdentidad;
    }

    public void setTxtDesIdentidad(InputText txtDesIdentidad) {
        this.txtDesIdentidad = txtDesIdentidad;
    }

    public InputText getTxtCodIdentidad() {
        return txtCodIdentidad;
    }

    public void setTxtCodIdentidad(InputText txtCodIdentidad) {
        this.txtCodIdentidad = txtCodIdentidad;
    }

    public List<Tg000019DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000019();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000019DTO> tg000019DTO) {
        this.data = tg000019DTO;
    }

    public Tg000019DTO getSelectedTg000019() {
        return selectedTg000019;
    }

    public void setSelectedTg000019(Tg000019DTO tg000019) {
        this.selectedTg000019 = tg000019;
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
