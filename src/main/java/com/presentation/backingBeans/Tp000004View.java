package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000004DTO;

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
public class Tp000004View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000004View.class);
    private InputText txtArpactiva;
    private InputText txtCodigoArp;
    private InputText txtDireccionArp;
    private InputText txtDvarp;
    private InputText txtEmailArp;
    private InputText txtFaxArp;
    private InputText txtNitArp;
    private InputText txtNomContactoArp;
    private InputText txtNombreArp;
    private InputText txtNumPerPlaniArp;
    private InputText txtTelefonoArp;
    private InputText txtTipoDocumentoArp;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodArp;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tp000004DTO> data;
    private Tp000004DTO selectedTp000004;
    private Tp000004 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tp000004View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTp000004 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTp000004 = null;

        if (txtArpactiva != null) {
            txtArpactiva.setValue(null);
            txtArpactiva.setDisabled(true);
        }

        if (txtCodigoArp != null) {
            txtCodigoArp.setValue(null);
            txtCodigoArp.setDisabled(true);
        }

        if (txtDireccionArp != null) {
            txtDireccionArp.setValue(null);
            txtDireccionArp.setDisabled(true);
        }

        if (txtDvarp != null) {
            txtDvarp.setValue(null);
            txtDvarp.setDisabled(true);
        }

        if (txtEmailArp != null) {
            txtEmailArp.setValue(null);
            txtEmailArp.setDisabled(true);
        }

        if (txtFaxArp != null) {
            txtFaxArp.setValue(null);
            txtFaxArp.setDisabled(true);
        }

        if (txtNitArp != null) {
            txtNitArp.setValue(null);
            txtNitArp.setDisabled(true);
        }

        if (txtNomContactoArp != null) {
            txtNomContactoArp.setValue(null);
            txtNomContactoArp.setDisabled(true);
        }

        if (txtNombreArp != null) {
            txtNombreArp.setValue(null);
            txtNombreArp.setDisabled(true);
        }

        if (txtNumPerPlaniArp != null) {
            txtNumPerPlaniArp.setValue(null);
            txtNumPerPlaniArp.setDisabled(true);
        }

        if (txtTelefonoArp != null) {
            txtTelefonoArp.setValue(null);
            txtTelefonoArp.setDisabled(true);
        }

        if (txtTipoDocumentoArp != null) {
            txtTipoDocumentoArp.setValue(null);
            txtTipoDocumentoArp.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodArp != null) {
            txtCodArp.setValue(null);
            txtCodArp.setDisabled(false);
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
            String codArp = FacesUtils.checkString(txtCodArp);
            entity = (codArp != null)
                ? businessDelegatorView.getTp000004(codArp) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtArpactiva.setDisabled(false);
            txtCodigoArp.setDisabled(false);
            txtDireccionArp.setDisabled(false);
            txtDvarp.setDisabled(false);
            txtEmailArp.setDisabled(false);
            txtFaxArp.setDisabled(false);
            txtNitArp.setDisabled(false);
            txtNomContactoArp.setDisabled(false);
            txtNombreArp.setDisabled(false);
            txtNumPerPlaniArp.setDisabled(false);
            txtTelefonoArp.setDisabled(false);
            txtTipoDocumentoArp.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodArp.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtArpactiva.setValue(entity.getArpactiva());
            txtArpactiva.setDisabled(false);
            txtCodigoArp.setValue(entity.getCodigoArp());
            txtCodigoArp.setDisabled(false);
            txtDireccionArp.setValue(entity.getDireccionArp());
            txtDireccionArp.setDisabled(false);
            txtDvarp.setValue(entity.getDvarp());
            txtDvarp.setDisabled(false);
            txtEmailArp.setValue(entity.getEmailArp());
            txtEmailArp.setDisabled(false);
            txtFaxArp.setValue(entity.getFaxArp());
            txtFaxArp.setDisabled(false);
            txtNitArp.setValue(entity.getNitArp());
            txtNitArp.setDisabled(false);
            txtNomContactoArp.setValue(entity.getNomContactoArp());
            txtNomContactoArp.setDisabled(false);
            txtNombreArp.setValue(entity.getNombreArp());
            txtNombreArp.setDisabled(false);
            txtNumPerPlaniArp.setValue(entity.getNumPerPlaniArp());
            txtNumPerPlaniArp.setDisabled(false);
            txtTelefonoArp.setValue(entity.getTelefonoArp());
            txtTelefonoArp.setDisabled(false);
            txtTipoDocumentoArp.setValue(entity.getTipoDocumentoArp());
            txtTipoDocumentoArp.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodArp.setValue(entity.getCodArp());
            txtCodArp.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTp000004 = (Tp000004DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTp000004"));
        txtArpactiva.setValue(selectedTp000004.getArpactiva());
        txtArpactiva.setDisabled(false);
        txtCodigoArp.setValue(selectedTp000004.getCodigoArp());
        txtCodigoArp.setDisabled(false);
        txtDireccionArp.setValue(selectedTp000004.getDireccionArp());
        txtDireccionArp.setDisabled(false);
        txtDvarp.setValue(selectedTp000004.getDvarp());
        txtDvarp.setDisabled(false);
        txtEmailArp.setValue(selectedTp000004.getEmailArp());
        txtEmailArp.setDisabled(false);
        txtFaxArp.setValue(selectedTp000004.getFaxArp());
        txtFaxArp.setDisabled(false);
        txtNitArp.setValue(selectedTp000004.getNitArp());
        txtNitArp.setDisabled(false);
        txtNomContactoArp.setValue(selectedTp000004.getNomContactoArp());
        txtNomContactoArp.setDisabled(false);
        txtNombreArp.setValue(selectedTp000004.getNombreArp());
        txtNombreArp.setDisabled(false);
        txtNumPerPlaniArp.setValue(selectedTp000004.getNumPerPlaniArp());
        txtNumPerPlaniArp.setDisabled(false);
        txtTelefonoArp.setValue(selectedTp000004.getTelefonoArp());
        txtTelefonoArp.setDisabled(false);
        txtTipoDocumentoArp.setValue(selectedTp000004.getTipoDocumentoArp());
        txtTipoDocumentoArp.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTp000004.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodArp.setValue(selectedTp000004.getCodArp());
        txtCodArp.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTp000004 == null) && (entity == null)) {
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
            entity = new Tp000004();

            String codArp = FacesUtils.checkString(txtCodArp);

            entity.setArpactiva(FacesUtils.checkString(txtArpactiva));
            entity.setCodArp(codArp);
            entity.setCodigoArp(FacesUtils.checkString(txtCodigoArp));
            entity.setDireccionArp(FacesUtils.checkString(txtDireccionArp));
            entity.setDvarp(FacesUtils.checkString(txtDvarp));
            entity.setEmailArp(FacesUtils.checkString(txtEmailArp));
            entity.setFaxArp(FacesUtils.checkString(txtFaxArp));
            entity.setNitArp(FacesUtils.checkString(txtNitArp));
            entity.setNomContactoArp(FacesUtils.checkString(txtNomContactoArp));
            entity.setNombreArp(FacesUtils.checkString(txtNombreArp));
            entity.setNumPerPlaniArp(FacesUtils.checkString(txtNumPerPlaniArp));
            entity.setTelefonoArp(FacesUtils.checkString(txtTelefonoArp));
            entity.setTipoDocumentoArp(FacesUtils.checkString(
                    txtTipoDocumentoArp));
            entity.setTg000003((FacesUtils.checkString(txtCodEmpresa_Tg000003) != null)
                ? businessDelegatorView.getTg000003(FacesUtils.checkString(
                        txtCodEmpresa_Tg000003)) : null);
            businessDelegatorView.saveTp000004(entity);
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
                String codArp = new String(selectedTp000004.getCodArp());
                entity = businessDelegatorView.getTp000004(codArp);
            }

            entity.setArpactiva(FacesUtils.checkString(txtArpactiva));
            entity.setCodigoArp(FacesUtils.checkString(txtCodigoArp));
            entity.setDireccionArp(FacesUtils.checkString(txtDireccionArp));
            entity.setDvarp(FacesUtils.checkString(txtDvarp));
            entity.setEmailArp(FacesUtils.checkString(txtEmailArp));
            entity.setFaxArp(FacesUtils.checkString(txtFaxArp));
            entity.setNitArp(FacesUtils.checkString(txtNitArp));
            entity.setNomContactoArp(FacesUtils.checkString(txtNomContactoArp));
            entity.setNombreArp(FacesUtils.checkString(txtNombreArp));
            entity.setNumPerPlaniArp(FacesUtils.checkString(txtNumPerPlaniArp));
            entity.setTelefonoArp(FacesUtils.checkString(txtTelefonoArp));
            entity.setTipoDocumentoArp(FacesUtils.checkString(
                    txtTipoDocumentoArp));
            entity.setTg000003((FacesUtils.checkString(txtCodEmpresa_Tg000003) != null)
                ? businessDelegatorView.getTg000003(FacesUtils.checkString(
                        txtCodEmpresa_Tg000003)) : null);
            businessDelegatorView.updateTp000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTp000004 = (Tp000004DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTp000004"));

            String codArp = new String(selectedTp000004.getCodArp());
            entity = businessDelegatorView.getTp000004(codArp);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codArp = FacesUtils.checkString(txtCodArp);
            entity = businessDelegatorView.getTp000004(codArp);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTp000004(entity);
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

    public String action_modifyWitDTO(String arpactiva, String codArp,
        String codigoArp, String direccionArp, String dvarp, String emailArp,
        String faxArp, String nitArp, String nomContactoArp, String nombreArp,
        String numPerPlaniArp, String telefonoArp, String tipoDocumentoArp,
        String codEmpresa_Tg000003) throws Exception {
        try {
            entity.setArpactiva(FacesUtils.checkString(arpactiva));
            entity.setCodigoArp(FacesUtils.checkString(codigoArp));
            entity.setDireccionArp(FacesUtils.checkString(direccionArp));
            entity.setDvarp(FacesUtils.checkString(dvarp));
            entity.setEmailArp(FacesUtils.checkString(emailArp));
            entity.setFaxArp(FacesUtils.checkString(faxArp));
            entity.setNitArp(FacesUtils.checkString(nitArp));
            entity.setNomContactoArp(FacesUtils.checkString(nomContactoArp));
            entity.setNombreArp(FacesUtils.checkString(nombreArp));
            entity.setNumPerPlaniArp(FacesUtils.checkString(numPerPlaniArp));
            entity.setTelefonoArp(FacesUtils.checkString(telefonoArp));
            entity.setTipoDocumentoArp(FacesUtils.checkString(tipoDocumentoArp));
            businessDelegatorView.updateTp000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tp000004View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtArpactiva() {
        return txtArpactiva;
    }

    public void setTxtArpactiva(InputText txtArpactiva) {
        this.txtArpactiva = txtArpactiva;
    }

    public InputText getTxtCodigoArp() {
        return txtCodigoArp;
    }

    public void setTxtCodigoArp(InputText txtCodigoArp) {
        this.txtCodigoArp = txtCodigoArp;
    }

    public InputText getTxtDireccionArp() {
        return txtDireccionArp;
    }

    public void setTxtDireccionArp(InputText txtDireccionArp) {
        this.txtDireccionArp = txtDireccionArp;
    }

    public InputText getTxtDvarp() {
        return txtDvarp;
    }

    public void setTxtDvarp(InputText txtDvarp) {
        this.txtDvarp = txtDvarp;
    }

    public InputText getTxtEmailArp() {
        return txtEmailArp;
    }

    public void setTxtEmailArp(InputText txtEmailArp) {
        this.txtEmailArp = txtEmailArp;
    }

    public InputText getTxtFaxArp() {
        return txtFaxArp;
    }

    public void setTxtFaxArp(InputText txtFaxArp) {
        this.txtFaxArp = txtFaxArp;
    }

    public InputText getTxtNitArp() {
        return txtNitArp;
    }

    public void setTxtNitArp(InputText txtNitArp) {
        this.txtNitArp = txtNitArp;
    }

    public InputText getTxtNomContactoArp() {
        return txtNomContactoArp;
    }

    public void setTxtNomContactoArp(InputText txtNomContactoArp) {
        this.txtNomContactoArp = txtNomContactoArp;
    }

    public InputText getTxtNombreArp() {
        return txtNombreArp;
    }

    public void setTxtNombreArp(InputText txtNombreArp) {
        this.txtNombreArp = txtNombreArp;
    }

    public InputText getTxtNumPerPlaniArp() {
        return txtNumPerPlaniArp;
    }

    public void setTxtNumPerPlaniArp(InputText txtNumPerPlaniArp) {
        this.txtNumPerPlaniArp = txtNumPerPlaniArp;
    }

    public InputText getTxtTelefonoArp() {
        return txtTelefonoArp;
    }

    public void setTxtTelefonoArp(InputText txtTelefonoArp) {
        this.txtTelefonoArp = txtTelefonoArp;
    }

    public InputText getTxtTipoDocumentoArp() {
        return txtTipoDocumentoArp;
    }

    public void setTxtTipoDocumentoArp(InputText txtTipoDocumentoArp) {
        this.txtTipoDocumentoArp = txtTipoDocumentoArp;
    }

    public InputText getTxtCodEmpresa_Tg000003() {
        return txtCodEmpresa_Tg000003;
    }

    public void setTxtCodEmpresa_Tg000003(InputText txtCodEmpresa_Tg000003) {
        this.txtCodEmpresa_Tg000003 = txtCodEmpresa_Tg000003;
    }

    public InputText getTxtCodArp() {
        return txtCodArp;
    }

    public void setTxtCodArp(InputText txtCodArp) {
        this.txtCodArp = txtCodArp;
    }

    public List<Tp000004DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTp000004();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tp000004DTO> tp000004DTO) {
        this.data = tp000004DTO;
    }

    public Tp000004DTO getSelectedTp000004() {
        return selectedTp000004;
    }

    public void setSelectedTp000004(Tp000004DTO tp000004) {
        this.selectedTp000004 = tp000004;
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
