package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000003DTO;

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
public class Tp000003View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000003View.class);
    private InputText txtCodigoEps;
    private InputText txtDireccionEps;
    private InputText txtDveps;
    private InputText txtEmailEps;
    private InputText txtFaxEps;
    private InputText txtNitEps;
    private InputText txtNomContactoEps;
    private InputText txtNombreEps;
    private InputText txtNumPerPlaniEps;
    private InputText txtTelefonoEps;
    private InputText txtTipoDocumentoEps;
    private InputText txtCodEps;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tp000003DTO> data;
    private Tp000003DTO selectedTp000003;
    private Tp000003 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tp000003View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTp000003 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTp000003 = null;

        if (txtCodigoEps != null) {
            txtCodigoEps.setValue(null);
            txtCodigoEps.setDisabled(true);
        }

        if (txtDireccionEps != null) {
            txtDireccionEps.setValue(null);
            txtDireccionEps.setDisabled(true);
        }

        if (txtDveps != null) {
            txtDveps.setValue(null);
            txtDveps.setDisabled(true);
        }

        if (txtEmailEps != null) {
            txtEmailEps.setValue(null);
            txtEmailEps.setDisabled(true);
        }

        if (txtFaxEps != null) {
            txtFaxEps.setValue(null);
            txtFaxEps.setDisabled(true);
        }

        if (txtNitEps != null) {
            txtNitEps.setValue(null);
            txtNitEps.setDisabled(true);
        }

        if (txtNomContactoEps != null) {
            txtNomContactoEps.setValue(null);
            txtNomContactoEps.setDisabled(true);
        }

        if (txtNombreEps != null) {
            txtNombreEps.setValue(null);
            txtNombreEps.setDisabled(true);
        }

        if (txtNumPerPlaniEps != null) {
            txtNumPerPlaniEps.setValue(null);
            txtNumPerPlaniEps.setDisabled(true);
        }

        if (txtTelefonoEps != null) {
            txtTelefonoEps.setValue(null);
            txtTelefonoEps.setDisabled(true);
        }

        if (txtTipoDocumentoEps != null) {
            txtTipoDocumentoEps.setValue(null);
            txtTipoDocumentoEps.setDisabled(true);
        }

        if (txtCodEps != null) {
            txtCodEps.setValue(null);
            txtCodEps.setDisabled(false);
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
            String codEps = FacesUtils.checkString(txtCodEps);
            entity = (codEps != null)
                ? businessDelegatorView.getTp000003(codEps) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtCodigoEps.setDisabled(false);
            txtDireccionEps.setDisabled(false);
            txtDveps.setDisabled(false);
            txtEmailEps.setDisabled(false);
            txtFaxEps.setDisabled(false);
            txtNitEps.setDisabled(false);
            txtNomContactoEps.setDisabled(false);
            txtNombreEps.setDisabled(false);
            txtNumPerPlaniEps.setDisabled(false);
            txtTelefonoEps.setDisabled(false);
            txtTipoDocumentoEps.setDisabled(false);
            txtCodEps.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtCodigoEps.setValue(entity.getCodigoEps());
            txtCodigoEps.setDisabled(false);
            txtDireccionEps.setValue(entity.getDireccionEps());
            txtDireccionEps.setDisabled(false);
            txtDveps.setValue(entity.getDveps());
            txtDveps.setDisabled(false);
            txtEmailEps.setValue(entity.getEmailEps());
            txtEmailEps.setDisabled(false);
            txtFaxEps.setValue(entity.getFaxEps());
            txtFaxEps.setDisabled(false);
            txtNitEps.setValue(entity.getNitEps());
            txtNitEps.setDisabled(false);
            txtNomContactoEps.setValue(entity.getNomContactoEps());
            txtNomContactoEps.setDisabled(false);
            txtNombreEps.setValue(entity.getNombreEps());
            txtNombreEps.setDisabled(false);
            txtNumPerPlaniEps.setValue(entity.getNumPerPlaniEps());
            txtNumPerPlaniEps.setDisabled(false);
            txtTelefonoEps.setValue(entity.getTelefonoEps());
            txtTelefonoEps.setDisabled(false);
            txtTipoDocumentoEps.setValue(entity.getTipoDocumentoEps());
            txtTipoDocumentoEps.setDisabled(false);
            txtCodEps.setValue(entity.getCodEps());
            txtCodEps.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTp000003 = (Tp000003DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTp000003"));
        txtCodigoEps.setValue(selectedTp000003.getCodigoEps());
        txtCodigoEps.setDisabled(false);
        txtDireccionEps.setValue(selectedTp000003.getDireccionEps());
        txtDireccionEps.setDisabled(false);
        txtDveps.setValue(selectedTp000003.getDveps());
        txtDveps.setDisabled(false);
        txtEmailEps.setValue(selectedTp000003.getEmailEps());
        txtEmailEps.setDisabled(false);
        txtFaxEps.setValue(selectedTp000003.getFaxEps());
        txtFaxEps.setDisabled(false);
        txtNitEps.setValue(selectedTp000003.getNitEps());
        txtNitEps.setDisabled(false);
        txtNomContactoEps.setValue(selectedTp000003.getNomContactoEps());
        txtNomContactoEps.setDisabled(false);
        txtNombreEps.setValue(selectedTp000003.getNombreEps());
        txtNombreEps.setDisabled(false);
        txtNumPerPlaniEps.setValue(selectedTp000003.getNumPerPlaniEps());
        txtNumPerPlaniEps.setDisabled(false);
        txtTelefonoEps.setValue(selectedTp000003.getTelefonoEps());
        txtTelefonoEps.setDisabled(false);
        txtTipoDocumentoEps.setValue(selectedTp000003.getTipoDocumentoEps());
        txtTipoDocumentoEps.setDisabled(false);
        txtCodEps.setValue(selectedTp000003.getCodEps());
        txtCodEps.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTp000003 == null) && (entity == null)) {
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
            entity = new Tp000003();

            String codEps = FacesUtils.checkString(txtCodEps);

            entity.setCodEps(codEps);
            entity.setCodigoEps(FacesUtils.checkString(txtCodigoEps));
            entity.setDireccionEps(FacesUtils.checkString(txtDireccionEps));
            entity.setDveps(FacesUtils.checkString(txtDveps));
            entity.setEmailEps(FacesUtils.checkString(txtEmailEps));
            entity.setFaxEps(FacesUtils.checkString(txtFaxEps));
            entity.setNitEps(FacesUtils.checkString(txtNitEps));
            entity.setNomContactoEps(FacesUtils.checkString(txtNomContactoEps));
            entity.setNombreEps(FacesUtils.checkString(txtNombreEps));
            entity.setNumPerPlaniEps(FacesUtils.checkString(txtNumPerPlaniEps));
            entity.setTelefonoEps(FacesUtils.checkString(txtTelefonoEps));
            entity.setTipoDocumentoEps(FacesUtils.checkString(
                    txtTipoDocumentoEps));
            businessDelegatorView.saveTp000003(entity);
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
                String codEps = new String(selectedTp000003.getCodEps());
                entity = businessDelegatorView.getTp000003(codEps);
            }

            entity.setCodigoEps(FacesUtils.checkString(txtCodigoEps));
            entity.setDireccionEps(FacesUtils.checkString(txtDireccionEps));
            entity.setDveps(FacesUtils.checkString(txtDveps));
            entity.setEmailEps(FacesUtils.checkString(txtEmailEps));
            entity.setFaxEps(FacesUtils.checkString(txtFaxEps));
            entity.setNitEps(FacesUtils.checkString(txtNitEps));
            entity.setNomContactoEps(FacesUtils.checkString(txtNomContactoEps));
            entity.setNombreEps(FacesUtils.checkString(txtNombreEps));
            entity.setNumPerPlaniEps(FacesUtils.checkString(txtNumPerPlaniEps));
            entity.setTelefonoEps(FacesUtils.checkString(txtTelefonoEps));
            entity.setTipoDocumentoEps(FacesUtils.checkString(
                    txtTipoDocumentoEps));
            businessDelegatorView.updateTp000003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTp000003 = (Tp000003DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTp000003"));

            String codEps = new String(selectedTp000003.getCodEps());
            entity = businessDelegatorView.getTp000003(codEps);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codEps = FacesUtils.checkString(txtCodEps);
            entity = businessDelegatorView.getTp000003(codEps);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTp000003(entity);
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

    public String action_modifyWitDTO(String codEps, String codigoEps,
        String direccionEps, String dveps, String emailEps, String faxEps,
        String nitEps, String nomContactoEps, String nombreEps,
        String numPerPlaniEps, String telefonoEps, String tipoDocumentoEps)
        throws Exception {
        try {
            entity.setCodigoEps(FacesUtils.checkString(codigoEps));
            entity.setDireccionEps(FacesUtils.checkString(direccionEps));
            entity.setDveps(FacesUtils.checkString(dveps));
            entity.setEmailEps(FacesUtils.checkString(emailEps));
            entity.setFaxEps(FacesUtils.checkString(faxEps));
            entity.setNitEps(FacesUtils.checkString(nitEps));
            entity.setNomContactoEps(FacesUtils.checkString(nomContactoEps));
            entity.setNombreEps(FacesUtils.checkString(nombreEps));
            entity.setNumPerPlaniEps(FacesUtils.checkString(numPerPlaniEps));
            entity.setTelefonoEps(FacesUtils.checkString(telefonoEps));
            entity.setTipoDocumentoEps(FacesUtils.checkString(tipoDocumentoEps));
            businessDelegatorView.updateTp000003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tp000003View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtCodigoEps() {
        return txtCodigoEps;
    }

    public void setTxtCodigoEps(InputText txtCodigoEps) {
        this.txtCodigoEps = txtCodigoEps;
    }

    public InputText getTxtDireccionEps() {
        return txtDireccionEps;
    }

    public void setTxtDireccionEps(InputText txtDireccionEps) {
        this.txtDireccionEps = txtDireccionEps;
    }

    public InputText getTxtDveps() {
        return txtDveps;
    }

    public void setTxtDveps(InputText txtDveps) {
        this.txtDveps = txtDveps;
    }

    public InputText getTxtEmailEps() {
        return txtEmailEps;
    }

    public void setTxtEmailEps(InputText txtEmailEps) {
        this.txtEmailEps = txtEmailEps;
    }

    public InputText getTxtFaxEps() {
        return txtFaxEps;
    }

    public void setTxtFaxEps(InputText txtFaxEps) {
        this.txtFaxEps = txtFaxEps;
    }

    public InputText getTxtNitEps() {
        return txtNitEps;
    }

    public void setTxtNitEps(InputText txtNitEps) {
        this.txtNitEps = txtNitEps;
    }

    public InputText getTxtNomContactoEps() {
        return txtNomContactoEps;
    }

    public void setTxtNomContactoEps(InputText txtNomContactoEps) {
        this.txtNomContactoEps = txtNomContactoEps;
    }

    public InputText getTxtNombreEps() {
        return txtNombreEps;
    }

    public void setTxtNombreEps(InputText txtNombreEps) {
        this.txtNombreEps = txtNombreEps;
    }

    public InputText getTxtNumPerPlaniEps() {
        return txtNumPerPlaniEps;
    }

    public void setTxtNumPerPlaniEps(InputText txtNumPerPlaniEps) {
        this.txtNumPerPlaniEps = txtNumPerPlaniEps;
    }

    public InputText getTxtTelefonoEps() {
        return txtTelefonoEps;
    }

    public void setTxtTelefonoEps(InputText txtTelefonoEps) {
        this.txtTelefonoEps = txtTelefonoEps;
    }

    public InputText getTxtTipoDocumentoEps() {
        return txtTipoDocumentoEps;
    }

    public void setTxtTipoDocumentoEps(InputText txtTipoDocumentoEps) {
        this.txtTipoDocumentoEps = txtTipoDocumentoEps;
    }

    public InputText getTxtCodEps() {
        return txtCodEps;
    }

    public void setTxtCodEps(InputText txtCodEps) {
        this.txtCodEps = txtCodEps;
    }

    public List<Tp000003DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTp000003();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tp000003DTO> tp000003DTO) {
        this.data = tp000003DTO;
    }

    public Tp000003DTO getSelectedTp000003() {
        return selectedTp000003;
    }

    public void setSelectedTp000003(Tp000003DTO tp000003) {
        this.selectedTp000003 = tp000003;
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
