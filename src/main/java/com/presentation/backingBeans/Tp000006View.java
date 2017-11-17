package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000006DTO;

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
public class Tp000006View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000006View.class);
    private InputText txtCajaPrincipal;
    private InputText txtCodDepto;
    private InputText txtCodEmpresa;
    private InputText txtCodigoCaja;
    private InputText txtDireccionCaja;
    private InputText txtDvcaja;
    private InputText txtEmailCaja;
    private InputText txtFaxCaja;
    private InputText txtNitCaja;
    private InputText txtNoPagoCaja;
    private InputText txtNomContactoCaja;
    private InputText txtNombreCaja;
    private InputText txtNumPerPlaniCaja;
    private InputText txtTelefonoCaja;
    private InputText txtTipoDocumentoCaja;
    private InputText txtCodCaja;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tp000006DTO> data;
    private Tp000006DTO selectedTp000006;
    private Tp000006 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tp000006View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTp000006 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTp000006 = null;

        if (txtCajaPrincipal != null) {
            txtCajaPrincipal.setValue(null);
            txtCajaPrincipal.setDisabled(true);
        }

        if (txtCodDepto != null) {
            txtCodDepto.setValue(null);
            txtCodDepto.setDisabled(true);
        }

        if (txtCodEmpresa != null) {
            txtCodEmpresa.setValue(null);
            txtCodEmpresa.setDisabled(true);
        }

        if (txtCodigoCaja != null) {
            txtCodigoCaja.setValue(null);
            txtCodigoCaja.setDisabled(true);
        }

        if (txtDireccionCaja != null) {
            txtDireccionCaja.setValue(null);
            txtDireccionCaja.setDisabled(true);
        }

        if (txtDvcaja != null) {
            txtDvcaja.setValue(null);
            txtDvcaja.setDisabled(true);
        }

        if (txtEmailCaja != null) {
            txtEmailCaja.setValue(null);
            txtEmailCaja.setDisabled(true);
        }

        if (txtFaxCaja != null) {
            txtFaxCaja.setValue(null);
            txtFaxCaja.setDisabled(true);
        }

        if (txtNitCaja != null) {
            txtNitCaja.setValue(null);
            txtNitCaja.setDisabled(true);
        }

        if (txtNoPagoCaja != null) {
            txtNoPagoCaja.setValue(null);
            txtNoPagoCaja.setDisabled(true);
        }

        if (txtNomContactoCaja != null) {
            txtNomContactoCaja.setValue(null);
            txtNomContactoCaja.setDisabled(true);
        }

        if (txtNombreCaja != null) {
            txtNombreCaja.setValue(null);
            txtNombreCaja.setDisabled(true);
        }

        if (txtNumPerPlaniCaja != null) {
            txtNumPerPlaniCaja.setValue(null);
            txtNumPerPlaniCaja.setDisabled(true);
        }

        if (txtTelefonoCaja != null) {
            txtTelefonoCaja.setValue(null);
            txtTelefonoCaja.setDisabled(true);
        }

        if (txtTipoDocumentoCaja != null) {
            txtTipoDocumentoCaja.setValue(null);
            txtTipoDocumentoCaja.setDisabled(true);
        }

        if (txtCodCaja != null) {
            txtCodCaja.setValue(null);
            txtCodCaja.setDisabled(false);
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
            String codCaja = FacesUtils.checkString(txtCodCaja);
            entity = (codCaja != null)
                ? businessDelegatorView.getTp000006(codCaja) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtCajaPrincipal.setDisabled(false);
            txtCodDepto.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            txtCodigoCaja.setDisabled(false);
            txtDireccionCaja.setDisabled(false);
            txtDvcaja.setDisabled(false);
            txtEmailCaja.setDisabled(false);
            txtFaxCaja.setDisabled(false);
            txtNitCaja.setDisabled(false);
            txtNoPagoCaja.setDisabled(false);
            txtNomContactoCaja.setDisabled(false);
            txtNombreCaja.setDisabled(false);
            txtNumPerPlaniCaja.setDisabled(false);
            txtTelefonoCaja.setDisabled(false);
            txtTipoDocumentoCaja.setDisabled(false);
            txtCodCaja.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtCajaPrincipal.setValue(entity.getCajaPrincipal());
            txtCajaPrincipal.setDisabled(false);
            txtCodDepto.setValue(entity.getCodDepto());
            txtCodDepto.setDisabled(false);
            txtCodEmpresa.setValue(entity.getCodEmpresa());
            txtCodEmpresa.setDisabled(false);
            txtCodigoCaja.setValue(entity.getCodigoCaja());
            txtCodigoCaja.setDisabled(false);
            txtDireccionCaja.setValue(entity.getDireccionCaja());
            txtDireccionCaja.setDisabled(false);
            txtDvcaja.setValue(entity.getDvcaja());
            txtDvcaja.setDisabled(false);
            txtEmailCaja.setValue(entity.getEmailCaja());
            txtEmailCaja.setDisabled(false);
            txtFaxCaja.setValue(entity.getFaxCaja());
            txtFaxCaja.setDisabled(false);
            txtNitCaja.setValue(entity.getNitCaja());
            txtNitCaja.setDisabled(false);
            txtNoPagoCaja.setValue(entity.getNoPagoCaja());
            txtNoPagoCaja.setDisabled(false);
            txtNomContactoCaja.setValue(entity.getNomContactoCaja());
            txtNomContactoCaja.setDisabled(false);
            txtNombreCaja.setValue(entity.getNombreCaja());
            txtNombreCaja.setDisabled(false);
            txtNumPerPlaniCaja.setValue(entity.getNumPerPlaniCaja());
            txtNumPerPlaniCaja.setDisabled(false);
            txtTelefonoCaja.setValue(entity.getTelefonoCaja());
            txtTelefonoCaja.setDisabled(false);
            txtTipoDocumentoCaja.setValue(entity.getTipoDocumentoCaja());
            txtTipoDocumentoCaja.setDisabled(false);
            txtCodCaja.setValue(entity.getCodCaja());
            txtCodCaja.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTp000006 = (Tp000006DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTp000006"));
        txtCajaPrincipal.setValue(selectedTp000006.getCajaPrincipal());
        txtCajaPrincipal.setDisabled(false);
        txtCodDepto.setValue(selectedTp000006.getCodDepto());
        txtCodDepto.setDisabled(false);
        txtCodEmpresa.setValue(selectedTp000006.getCodEmpresa());
        txtCodEmpresa.setDisabled(false);
        txtCodigoCaja.setValue(selectedTp000006.getCodigoCaja());
        txtCodigoCaja.setDisabled(false);
        txtDireccionCaja.setValue(selectedTp000006.getDireccionCaja());
        txtDireccionCaja.setDisabled(false);
        txtDvcaja.setValue(selectedTp000006.getDvcaja());
        txtDvcaja.setDisabled(false);
        txtEmailCaja.setValue(selectedTp000006.getEmailCaja());
        txtEmailCaja.setDisabled(false);
        txtFaxCaja.setValue(selectedTp000006.getFaxCaja());
        txtFaxCaja.setDisabled(false);
        txtNitCaja.setValue(selectedTp000006.getNitCaja());
        txtNitCaja.setDisabled(false);
        txtNoPagoCaja.setValue(selectedTp000006.getNoPagoCaja());
        txtNoPagoCaja.setDisabled(false);
        txtNomContactoCaja.setValue(selectedTp000006.getNomContactoCaja());
        txtNomContactoCaja.setDisabled(false);
        txtNombreCaja.setValue(selectedTp000006.getNombreCaja());
        txtNombreCaja.setDisabled(false);
        txtNumPerPlaniCaja.setValue(selectedTp000006.getNumPerPlaniCaja());
        txtNumPerPlaniCaja.setDisabled(false);
        txtTelefonoCaja.setValue(selectedTp000006.getTelefonoCaja());
        txtTelefonoCaja.setDisabled(false);
        txtTipoDocumentoCaja.setValue(selectedTp000006.getTipoDocumentoCaja());
        txtTipoDocumentoCaja.setDisabled(false);
        txtCodCaja.setValue(selectedTp000006.getCodCaja());
        txtCodCaja.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTp000006 == null) && (entity == null)) {
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
            entity = new Tp000006();

            String codCaja = FacesUtils.checkString(txtCodCaja);

            entity.setCajaPrincipal(FacesUtils.checkString(txtCajaPrincipal));
            entity.setCodCaja(codCaja);
            entity.setCodDepto(FacesUtils.checkString(txtCodDepto));
            entity.setCodEmpresa(FacesUtils.checkString(txtCodEmpresa));
            entity.setCodigoCaja(FacesUtils.checkString(txtCodigoCaja));
            entity.setDireccionCaja(FacesUtils.checkString(txtDireccionCaja));
            entity.setDvcaja(FacesUtils.checkString(txtDvcaja));
            entity.setEmailCaja(FacesUtils.checkString(txtEmailCaja));
            entity.setFaxCaja(FacesUtils.checkString(txtFaxCaja));
            entity.setNitCaja(FacesUtils.checkString(txtNitCaja));
            entity.setNoPagoCaja(FacesUtils.checkString(txtNoPagoCaja));
            entity.setNomContactoCaja(FacesUtils.checkString(txtNomContactoCaja));
            entity.setNombreCaja(FacesUtils.checkString(txtNombreCaja));
            entity.setNumPerPlaniCaja(FacesUtils.checkString(txtNumPerPlaniCaja));
            entity.setTelefonoCaja(FacesUtils.checkString(txtTelefonoCaja));
            entity.setTipoDocumentoCaja(FacesUtils.checkString(
                    txtTipoDocumentoCaja));
            businessDelegatorView.saveTp000006(entity);
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
                String codCaja = new String(selectedTp000006.getCodCaja());
                entity = businessDelegatorView.getTp000006(codCaja);
            }

            entity.setCajaPrincipal(FacesUtils.checkString(txtCajaPrincipal));
            entity.setCodDepto(FacesUtils.checkString(txtCodDepto));
            entity.setCodEmpresa(FacesUtils.checkString(txtCodEmpresa));
            entity.setCodigoCaja(FacesUtils.checkString(txtCodigoCaja));
            entity.setDireccionCaja(FacesUtils.checkString(txtDireccionCaja));
            entity.setDvcaja(FacesUtils.checkString(txtDvcaja));
            entity.setEmailCaja(FacesUtils.checkString(txtEmailCaja));
            entity.setFaxCaja(FacesUtils.checkString(txtFaxCaja));
            entity.setNitCaja(FacesUtils.checkString(txtNitCaja));
            entity.setNoPagoCaja(FacesUtils.checkString(txtNoPagoCaja));
            entity.setNomContactoCaja(FacesUtils.checkString(txtNomContactoCaja));
            entity.setNombreCaja(FacesUtils.checkString(txtNombreCaja));
            entity.setNumPerPlaniCaja(FacesUtils.checkString(txtNumPerPlaniCaja));
            entity.setTelefonoCaja(FacesUtils.checkString(txtTelefonoCaja));
            entity.setTipoDocumentoCaja(FacesUtils.checkString(
                    txtTipoDocumentoCaja));
            businessDelegatorView.updateTp000006(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTp000006 = (Tp000006DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTp000006"));

            String codCaja = new String(selectedTp000006.getCodCaja());
            entity = businessDelegatorView.getTp000006(codCaja);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codCaja = FacesUtils.checkString(txtCodCaja);
            entity = businessDelegatorView.getTp000006(codCaja);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTp000006(entity);
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

    public String action_modifyWitDTO(String cajaPrincipal, String codCaja,
        String codDepto, String codEmpresa, String codigoCaja,
        String direccionCaja, String dvcaja, String emailCaja, String faxCaja,
        String nitCaja, String noPagoCaja, String nomContactoCaja,
        String nombreCaja, String numPerPlaniCaja, String telefonoCaja,
        String tipoDocumentoCaja) throws Exception {
        try {
            entity.setCajaPrincipal(FacesUtils.checkString(cajaPrincipal));
            entity.setCodDepto(FacesUtils.checkString(codDepto));
            entity.setCodEmpresa(FacesUtils.checkString(codEmpresa));
            entity.setCodigoCaja(FacesUtils.checkString(codigoCaja));
            entity.setDireccionCaja(FacesUtils.checkString(direccionCaja));
            entity.setDvcaja(FacesUtils.checkString(dvcaja));
            entity.setEmailCaja(FacesUtils.checkString(emailCaja));
            entity.setFaxCaja(FacesUtils.checkString(faxCaja));
            entity.setNitCaja(FacesUtils.checkString(nitCaja));
            entity.setNoPagoCaja(FacesUtils.checkString(noPagoCaja));
            entity.setNomContactoCaja(FacesUtils.checkString(nomContactoCaja));
            entity.setNombreCaja(FacesUtils.checkString(nombreCaja));
            entity.setNumPerPlaniCaja(FacesUtils.checkString(numPerPlaniCaja));
            entity.setTelefonoCaja(FacesUtils.checkString(telefonoCaja));
            entity.setTipoDocumentoCaja(FacesUtils.checkString(
                    tipoDocumentoCaja));
            businessDelegatorView.updateTp000006(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tp000006View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtCajaPrincipal() {
        return txtCajaPrincipal;
    }

    public void setTxtCajaPrincipal(InputText txtCajaPrincipal) {
        this.txtCajaPrincipal = txtCajaPrincipal;
    }

    public InputText getTxtCodDepto() {
        return txtCodDepto;
    }

    public void setTxtCodDepto(InputText txtCodDepto) {
        this.txtCodDepto = txtCodDepto;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public InputText getTxtCodigoCaja() {
        return txtCodigoCaja;
    }

    public void setTxtCodigoCaja(InputText txtCodigoCaja) {
        this.txtCodigoCaja = txtCodigoCaja;
    }

    public InputText getTxtDireccionCaja() {
        return txtDireccionCaja;
    }

    public void setTxtDireccionCaja(InputText txtDireccionCaja) {
        this.txtDireccionCaja = txtDireccionCaja;
    }

    public InputText getTxtDvcaja() {
        return txtDvcaja;
    }

    public void setTxtDvcaja(InputText txtDvcaja) {
        this.txtDvcaja = txtDvcaja;
    }

    public InputText getTxtEmailCaja() {
        return txtEmailCaja;
    }

    public void setTxtEmailCaja(InputText txtEmailCaja) {
        this.txtEmailCaja = txtEmailCaja;
    }

    public InputText getTxtFaxCaja() {
        return txtFaxCaja;
    }

    public void setTxtFaxCaja(InputText txtFaxCaja) {
        this.txtFaxCaja = txtFaxCaja;
    }

    public InputText getTxtNitCaja() {
        return txtNitCaja;
    }

    public void setTxtNitCaja(InputText txtNitCaja) {
        this.txtNitCaja = txtNitCaja;
    }

    public InputText getTxtNoPagoCaja() {
        return txtNoPagoCaja;
    }

    public void setTxtNoPagoCaja(InputText txtNoPagoCaja) {
        this.txtNoPagoCaja = txtNoPagoCaja;
    }

    public InputText getTxtNomContactoCaja() {
        return txtNomContactoCaja;
    }

    public void setTxtNomContactoCaja(InputText txtNomContactoCaja) {
        this.txtNomContactoCaja = txtNomContactoCaja;
    }

    public InputText getTxtNombreCaja() {
        return txtNombreCaja;
    }

    public void setTxtNombreCaja(InputText txtNombreCaja) {
        this.txtNombreCaja = txtNombreCaja;
    }

    public InputText getTxtNumPerPlaniCaja() {
        return txtNumPerPlaniCaja;
    }

    public void setTxtNumPerPlaniCaja(InputText txtNumPerPlaniCaja) {
        this.txtNumPerPlaniCaja = txtNumPerPlaniCaja;
    }

    public InputText getTxtTelefonoCaja() {
        return txtTelefonoCaja;
    }

    public void setTxtTelefonoCaja(InputText txtTelefonoCaja) {
        this.txtTelefonoCaja = txtTelefonoCaja;
    }

    public InputText getTxtTipoDocumentoCaja() {
        return txtTipoDocumentoCaja;
    }

    public void setTxtTipoDocumentoCaja(InputText txtTipoDocumentoCaja) {
        this.txtTipoDocumentoCaja = txtTipoDocumentoCaja;
    }

    public InputText getTxtCodCaja() {
        return txtCodCaja;
    }

    public void setTxtCodCaja(InputText txtCodCaja) {
        this.txtCodCaja = txtCodCaja;
    }

    public List<Tp000006DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTp000006();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tp000006DTO> tp000006DTO) {
        this.data = tp000006DTO;
    }

    public Tp000006DTO getSelectedTp000006() {
        return selectedTp000006;
    }

    public void setSelectedTp000006(Tp000006DTO tp000006) {
        this.selectedTp000006 = tp000006;
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
