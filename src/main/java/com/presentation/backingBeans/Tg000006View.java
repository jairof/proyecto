package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000006DTO;

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
public class Tg000006View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000006View.class);
    private InputText txtDesCargo;
    private InputText txtCodCargo;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000006DTO> data;
    private Tg000006DTO selectedTg000006;
    private Tg000006 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000006View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000006 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000006 = null;

        if (txtDesCargo != null) {
            txtDesCargo.setValue(null);
            txtDesCargo.setDisabled(true);
        }

        if (txtCodCargo != null) {
            txtCodCargo.setValue(null);
            txtCodCargo.setDisabled(false);
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
            String codCargo = FacesUtils.checkString(txtCodCargo);
            entity = (codCargo != null)
                ? businessDelegatorView.getTg000006(codCargo) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesCargo.setDisabled(false);
            txtCodCargo.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesCargo.setValue(entity.getDesCargo());
            txtDesCargo.setDisabled(false);
            txtCodCargo.setValue(entity.getCodCargo());
            txtCodCargo.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000006 = (Tg000006DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000006"));
        txtDesCargo.setValue(selectedTg000006.getDesCargo());
        txtDesCargo.setDisabled(false);
        txtCodCargo.setValue(selectedTg000006.getCodCargo());
        txtCodCargo.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000006 == null) && (entity == null)) {
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
            entity = new Tg000006();

            String codCargo = FacesUtils.checkString(txtCodCargo);

            entity.setCodCargo(codCargo);
            entity.setDesCargo(FacesUtils.checkString(txtDesCargo));
            businessDelegatorView.saveTg000006(entity);
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
                String codCargo = new String(selectedTg000006.getCodCargo());
                entity = businessDelegatorView.getTg000006(codCargo);
            }

            entity.setDesCargo(FacesUtils.checkString(txtDesCargo));
            businessDelegatorView.updateTg000006(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000006 = (Tg000006DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000006"));

            String codCargo = new String(selectedTg000006.getCodCargo());
            entity = businessDelegatorView.getTg000006(codCargo);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codCargo = FacesUtils.checkString(txtCodCargo);
            entity = businessDelegatorView.getTg000006(codCargo);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000006(entity);
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

    public String action_modifyWitDTO(String codCargo, String desCargo)
        throws Exception {
        try {
            entity.setDesCargo(FacesUtils.checkString(desCargo));
            businessDelegatorView.updateTg000006(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000006View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesCargo() {
        return txtDesCargo;
    }

    public void setTxtDesCargo(InputText txtDesCargo) {
        this.txtDesCargo = txtDesCargo;
    }

    public InputText getTxtCodCargo() {
        return txtCodCargo;
    }

    public void setTxtCodCargo(InputText txtCodCargo) {
        this.txtCodCargo = txtCodCargo;
    }

    public List<Tg000006DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000006();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000006DTO> tg000006DTO) {
        this.data = tg000006DTO;
    }

    public Tg000006DTO getSelectedTg000006() {
        return selectedTg000006;
    }

    public void setSelectedTg000006(Tg000006DTO tg000006) {
        this.selectedTg000006 = tg000006;
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
