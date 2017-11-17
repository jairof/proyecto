package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000002DTO;

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
public class Tg000002View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000002View.class);
    private InputText txtDesCiudad;
    private InputText txtCodDepto_Tg000004;
    private InputText txtCodCiudad;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000002DTO> data;
    private Tg000002DTO selectedTg000002;
    private Tg000002 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000002View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000002 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000002 = null;

        if (txtDesCiudad != null) {
            txtDesCiudad.setValue(null);
            txtDesCiudad.setDisabled(true);
        }

        if (txtCodDepto_Tg000004 != null) {
            txtCodDepto_Tg000004.setValue(null);
            txtCodDepto_Tg000004.setDisabled(true);
        }

        if (txtCodCiudad != null) {
            txtCodCiudad.setValue(null);
            txtCodCiudad.setDisabled(false);
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
            String codCiudad = FacesUtils.checkString(txtCodCiudad);
            entity = (codCiudad != null)
                ? businessDelegatorView.getTg000002(codCiudad) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesCiudad.setDisabled(false);
            txtCodDepto_Tg000004.setDisabled(false);
            txtCodCiudad.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesCiudad.setValue(entity.getDesCiudad());
            txtDesCiudad.setDisabled(false);
            txtCodDepto_Tg000004.setValue(entity.getTg000004().getCodDepto());
            txtCodDepto_Tg000004.setDisabled(false);
            txtCodCiudad.setValue(entity.getCodCiudad());
            txtCodCiudad.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000002 = (Tg000002DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000002"));
        txtDesCiudad.setValue(selectedTg000002.getDesCiudad());
        txtDesCiudad.setDisabled(false);
        txtCodDepto_Tg000004.setValue(selectedTg000002.getCodDepto_Tg000004());
        txtCodDepto_Tg000004.setDisabled(false);
        txtCodCiudad.setValue(selectedTg000002.getCodCiudad());
        txtCodCiudad.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000002 == null) && (entity == null)) {
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
            entity = new Tg000002();

            String codCiudad = FacesUtils.checkString(txtCodCiudad);

            entity.setCodCiudad(codCiudad);
            entity.setDesCiudad(FacesUtils.checkString(txtDesCiudad));
            entity.setTg000004((FacesUtils.checkString(txtCodDepto_Tg000004) != null)
                ? businessDelegatorView.getTg000004(FacesUtils.checkString(
                        txtCodDepto_Tg000004)) : null);
            businessDelegatorView.saveTg000002(entity);
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
                String codCiudad = new String(selectedTg000002.getCodCiudad());
                entity = businessDelegatorView.getTg000002(codCiudad);
            }

            entity.setDesCiudad(FacesUtils.checkString(txtDesCiudad));
            entity.setTg000004((FacesUtils.checkString(txtCodDepto_Tg000004) != null)
                ? businessDelegatorView.getTg000004(FacesUtils.checkString(
                        txtCodDepto_Tg000004)) : null);
            businessDelegatorView.updateTg000002(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000002 = (Tg000002DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000002"));

            String codCiudad = new String(selectedTg000002.getCodCiudad());
            entity = businessDelegatorView.getTg000002(codCiudad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codCiudad = FacesUtils.checkString(txtCodCiudad);
            entity = businessDelegatorView.getTg000002(codCiudad);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000002(entity);
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

    public String action_modifyWitDTO(String codCiudad, String desCiudad,
        String codDepto_Tg000004) throws Exception {
        try {
            entity.setDesCiudad(FacesUtils.checkString(desCiudad));
            businessDelegatorView.updateTg000002(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000002View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesCiudad() {
        return txtDesCiudad;
    }

    public void setTxtDesCiudad(InputText txtDesCiudad) {
        this.txtDesCiudad = txtDesCiudad;
    }

    public InputText getTxtCodDepto_Tg000004() {
        return txtCodDepto_Tg000004;
    }

    public void setTxtCodDepto_Tg000004(InputText txtCodDepto_Tg000004) {
        this.txtCodDepto_Tg000004 = txtCodDepto_Tg000004;
    }

    public InputText getTxtCodCiudad() {
        return txtCodCiudad;
    }

    public void setTxtCodCiudad(InputText txtCodCiudad) {
        this.txtCodCiudad = txtCodCiudad;
    }

    public List<Tg000002DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000002();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000002DTO> tg000002DTO) {
        this.data = tg000002DTO;
    }

    public Tg000002DTO getSelectedTg000002() {
        return selectedTg000002;
    }

    public void setSelectedTg000002(Tg000002DTO tg000002) {
        this.selectedTg000002 = tg000002;
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
