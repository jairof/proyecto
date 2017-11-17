package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000005DTO;

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
public class Tp000005View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000005View.class);
    private InputText txtCodigoAfp;
    private InputText txtDireccionAfp;
    private InputText txtDvafp;
    private InputText txtEmailAfp;
    private InputText txtFaxAfp;
    private InputText txtNitAfp;
    private InputText txtNomContactoAfp;
    private InputText txtNombreAfp;
    private InputText txtNumPerPlaniAfp;
    private InputText txtTelefonoAfp;
    private InputText txtTipoDocumentoAfp;
    private InputText txtCodAfp;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tp000005DTO> data;
    private Tp000005DTO selectedTp000005;
    private Tp000005 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tp000005View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTp000005 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTp000005 = null;

        if (txtCodigoAfp != null) {
            txtCodigoAfp.setValue(null);
            txtCodigoAfp.setDisabled(true);
        }

        if (txtDireccionAfp != null) {
            txtDireccionAfp.setValue(null);
            txtDireccionAfp.setDisabled(true);
        }

        if (txtDvafp != null) {
            txtDvafp.setValue(null);
            txtDvafp.setDisabled(true);
        }

        if (txtEmailAfp != null) {
            txtEmailAfp.setValue(null);
            txtEmailAfp.setDisabled(true);
        }

        if (txtFaxAfp != null) {
            txtFaxAfp.setValue(null);
            txtFaxAfp.setDisabled(true);
        }

        if (txtNitAfp != null) {
            txtNitAfp.setValue(null);
            txtNitAfp.setDisabled(true);
        }

        if (txtNomContactoAfp != null) {
            txtNomContactoAfp.setValue(null);
            txtNomContactoAfp.setDisabled(true);
        }

        if (txtNombreAfp != null) {
            txtNombreAfp.setValue(null);
            txtNombreAfp.setDisabled(true);
        }

        if (txtNumPerPlaniAfp != null) {
            txtNumPerPlaniAfp.setValue(null);
            txtNumPerPlaniAfp.setDisabled(true);
        }

        if (txtTelefonoAfp != null) {
            txtTelefonoAfp.setValue(null);
            txtTelefonoAfp.setDisabled(true);
        }

        if (txtTipoDocumentoAfp != null) {
            txtTipoDocumentoAfp.setValue(null);
            txtTipoDocumentoAfp.setDisabled(true);
        }

        if (txtCodAfp != null) {
            txtCodAfp.setValue(null);
            txtCodAfp.setDisabled(false);
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
            String codAfp = FacesUtils.checkString(txtCodAfp);
            entity = (codAfp != null)
                ? businessDelegatorView.getTp000005(codAfp) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtCodigoAfp.setDisabled(false);
            txtDireccionAfp.setDisabled(false);
            txtDvafp.setDisabled(false);
            txtEmailAfp.setDisabled(false);
            txtFaxAfp.setDisabled(false);
            txtNitAfp.setDisabled(false);
            txtNomContactoAfp.setDisabled(false);
            txtNombreAfp.setDisabled(false);
            txtNumPerPlaniAfp.setDisabled(false);
            txtTelefonoAfp.setDisabled(false);
            txtTipoDocumentoAfp.setDisabled(false);
            txtCodAfp.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtCodigoAfp.setValue(entity.getCodigoAfp());
            txtCodigoAfp.setDisabled(false);
            txtDireccionAfp.setValue(entity.getDireccionAfp());
            txtDireccionAfp.setDisabled(false);
            txtDvafp.setValue(entity.getDvafp());
            txtDvafp.setDisabled(false);
            txtEmailAfp.setValue(entity.getEmailAfp());
            txtEmailAfp.setDisabled(false);
            txtFaxAfp.setValue(entity.getFaxAfp());
            txtFaxAfp.setDisabled(false);
            txtNitAfp.setValue(entity.getNitAfp());
            txtNitAfp.setDisabled(false);
            txtNomContactoAfp.setValue(entity.getNomContactoAfp());
            txtNomContactoAfp.setDisabled(false);
            txtNombreAfp.setValue(entity.getNombreAfp());
            txtNombreAfp.setDisabled(false);
            txtNumPerPlaniAfp.setValue(entity.getNumPerPlaniAfp());
            txtNumPerPlaniAfp.setDisabled(false);
            txtTelefonoAfp.setValue(entity.getTelefonoAfp());
            txtTelefonoAfp.setDisabled(false);
            txtTipoDocumentoAfp.setValue(entity.getTipoDocumentoAfp());
            txtTipoDocumentoAfp.setDisabled(false);
            txtCodAfp.setValue(entity.getCodAfp());
            txtCodAfp.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTp000005 = (Tp000005DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTp000005"));
        txtCodigoAfp.setValue(selectedTp000005.getCodigoAfp());
        txtCodigoAfp.setDisabled(false);
        txtDireccionAfp.setValue(selectedTp000005.getDireccionAfp());
        txtDireccionAfp.setDisabled(false);
        txtDvafp.setValue(selectedTp000005.getDvafp());
        txtDvafp.setDisabled(false);
        txtEmailAfp.setValue(selectedTp000005.getEmailAfp());
        txtEmailAfp.setDisabled(false);
        txtFaxAfp.setValue(selectedTp000005.getFaxAfp());
        txtFaxAfp.setDisabled(false);
        txtNitAfp.setValue(selectedTp000005.getNitAfp());
        txtNitAfp.setDisabled(false);
        txtNomContactoAfp.setValue(selectedTp000005.getNomContactoAfp());
        txtNomContactoAfp.setDisabled(false);
        txtNombreAfp.setValue(selectedTp000005.getNombreAfp());
        txtNombreAfp.setDisabled(false);
        txtNumPerPlaniAfp.setValue(selectedTp000005.getNumPerPlaniAfp());
        txtNumPerPlaniAfp.setDisabled(false);
        txtTelefonoAfp.setValue(selectedTp000005.getTelefonoAfp());
        txtTelefonoAfp.setDisabled(false);
        txtTipoDocumentoAfp.setValue(selectedTp000005.getTipoDocumentoAfp());
        txtTipoDocumentoAfp.setDisabled(false);
        txtCodAfp.setValue(selectedTp000005.getCodAfp());
        txtCodAfp.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTp000005 == null) && (entity == null)) {
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
            entity = new Tp000005();

            String codAfp = FacesUtils.checkString(txtCodAfp);

            entity.setCodAfp(codAfp);
            entity.setCodigoAfp(FacesUtils.checkString(txtCodigoAfp));
            entity.setDireccionAfp(FacesUtils.checkString(txtDireccionAfp));
            entity.setDvafp(FacesUtils.checkString(txtDvafp));
            entity.setEmailAfp(FacesUtils.checkString(txtEmailAfp));
            entity.setFaxAfp(FacesUtils.checkString(txtFaxAfp));
            entity.setNitAfp(FacesUtils.checkString(txtNitAfp));
            entity.setNomContactoAfp(FacesUtils.checkString(txtNomContactoAfp));
            entity.setNombreAfp(FacesUtils.checkString(txtNombreAfp));
            entity.setNumPerPlaniAfp(FacesUtils.checkString(txtNumPerPlaniAfp));
            entity.setTelefonoAfp(FacesUtils.checkString(txtTelefonoAfp));
            entity.setTipoDocumentoAfp(FacesUtils.checkString(
                    txtTipoDocumentoAfp));
            businessDelegatorView.saveTp000005(entity);
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
                String codAfp = new String(selectedTp000005.getCodAfp());
                entity = businessDelegatorView.getTp000005(codAfp);
            }

            entity.setCodigoAfp(FacesUtils.checkString(txtCodigoAfp));
            entity.setDireccionAfp(FacesUtils.checkString(txtDireccionAfp));
            entity.setDvafp(FacesUtils.checkString(txtDvafp));
            entity.setEmailAfp(FacesUtils.checkString(txtEmailAfp));
            entity.setFaxAfp(FacesUtils.checkString(txtFaxAfp));
            entity.setNitAfp(FacesUtils.checkString(txtNitAfp));
            entity.setNomContactoAfp(FacesUtils.checkString(txtNomContactoAfp));
            entity.setNombreAfp(FacesUtils.checkString(txtNombreAfp));
            entity.setNumPerPlaniAfp(FacesUtils.checkString(txtNumPerPlaniAfp));
            entity.setTelefonoAfp(FacesUtils.checkString(txtTelefonoAfp));
            entity.setTipoDocumentoAfp(FacesUtils.checkString(
                    txtTipoDocumentoAfp));
            businessDelegatorView.updateTp000005(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTp000005 = (Tp000005DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTp000005"));

            String codAfp = new String(selectedTp000005.getCodAfp());
            entity = businessDelegatorView.getTp000005(codAfp);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codAfp = FacesUtils.checkString(txtCodAfp);
            entity = businessDelegatorView.getTp000005(codAfp);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTp000005(entity);
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

    public String action_modifyWitDTO(String codAfp, String codigoAfp,
        String direccionAfp, String dvafp, String emailAfp, String faxAfp,
        String nitAfp, String nomContactoAfp, String nombreAfp,
        String numPerPlaniAfp, String telefonoAfp, String tipoDocumentoAfp)
        throws Exception {
        try {
            entity.setCodigoAfp(FacesUtils.checkString(codigoAfp));
            entity.setDireccionAfp(FacesUtils.checkString(direccionAfp));
            entity.setDvafp(FacesUtils.checkString(dvafp));
            entity.setEmailAfp(FacesUtils.checkString(emailAfp));
            entity.setFaxAfp(FacesUtils.checkString(faxAfp));
            entity.setNitAfp(FacesUtils.checkString(nitAfp));
            entity.setNomContactoAfp(FacesUtils.checkString(nomContactoAfp));
            entity.setNombreAfp(FacesUtils.checkString(nombreAfp));
            entity.setNumPerPlaniAfp(FacesUtils.checkString(numPerPlaniAfp));
            entity.setTelefonoAfp(FacesUtils.checkString(telefonoAfp));
            entity.setTipoDocumentoAfp(FacesUtils.checkString(tipoDocumentoAfp));
            businessDelegatorView.updateTp000005(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tp000005View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtCodigoAfp() {
        return txtCodigoAfp;
    }

    public void setTxtCodigoAfp(InputText txtCodigoAfp) {
        this.txtCodigoAfp = txtCodigoAfp;
    }

    public InputText getTxtDireccionAfp() {
        return txtDireccionAfp;
    }

    public void setTxtDireccionAfp(InputText txtDireccionAfp) {
        this.txtDireccionAfp = txtDireccionAfp;
    }

    public InputText getTxtDvafp() {
        return txtDvafp;
    }

    public void setTxtDvafp(InputText txtDvafp) {
        this.txtDvafp = txtDvafp;
    }

    public InputText getTxtEmailAfp() {
        return txtEmailAfp;
    }

    public void setTxtEmailAfp(InputText txtEmailAfp) {
        this.txtEmailAfp = txtEmailAfp;
    }

    public InputText getTxtFaxAfp() {
        return txtFaxAfp;
    }

    public void setTxtFaxAfp(InputText txtFaxAfp) {
        this.txtFaxAfp = txtFaxAfp;
    }

    public InputText getTxtNitAfp() {
        return txtNitAfp;
    }

    public void setTxtNitAfp(InputText txtNitAfp) {
        this.txtNitAfp = txtNitAfp;
    }

    public InputText getTxtNomContactoAfp() {
        return txtNomContactoAfp;
    }

    public void setTxtNomContactoAfp(InputText txtNomContactoAfp) {
        this.txtNomContactoAfp = txtNomContactoAfp;
    }

    public InputText getTxtNombreAfp() {
        return txtNombreAfp;
    }

    public void setTxtNombreAfp(InputText txtNombreAfp) {
        this.txtNombreAfp = txtNombreAfp;
    }

    public InputText getTxtNumPerPlaniAfp() {
        return txtNumPerPlaniAfp;
    }

    public void setTxtNumPerPlaniAfp(InputText txtNumPerPlaniAfp) {
        this.txtNumPerPlaniAfp = txtNumPerPlaniAfp;
    }

    public InputText getTxtTelefonoAfp() {
        return txtTelefonoAfp;
    }

    public void setTxtTelefonoAfp(InputText txtTelefonoAfp) {
        this.txtTelefonoAfp = txtTelefonoAfp;
    }

    public InputText getTxtTipoDocumentoAfp() {
        return txtTipoDocumentoAfp;
    }

    public void setTxtTipoDocumentoAfp(InputText txtTipoDocumentoAfp) {
        this.txtTipoDocumentoAfp = txtTipoDocumentoAfp;
    }

    public InputText getTxtCodAfp() {
        return txtCodAfp;
    }

    public void setTxtCodAfp(InputText txtCodAfp) {
        this.txtCodAfp = txtCodAfp;
    }

    public List<Tp000005DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTp000005();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tp000005DTO> tp000005DTO) {
        this.data = tp000005DTO;
    }

    public Tp000005DTO getSelectedTp000005() {
        return selectedTp000005;
    }

    public void setSelectedTp000005(Tp000005DTO tp000005) {
        this.selectedTp000005 = tp000005;
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
