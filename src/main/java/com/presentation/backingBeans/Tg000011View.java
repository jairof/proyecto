package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000011DTO;

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
public class Tg000011View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000011View.class);
    private InputText txtAtiva;
    private InputText txtCiudad;
    private InputText txtDepto;
    private InputText txtDirEmpresa;
    private InputText txtDvempaf;
    private InputText txtEmailEmpresa;
    private InputText txtFaxEmpresa;
    private InputText txtNitEmpresa;
    private InputText txtNomContacto;
    private InputText txtNomEmpresa;
    private InputText txtTelEmpresa;
    private InputText txtTipoDocumentoEmpaf;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodEmpresaEmp;
    private InputText txtCodEmpresa;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000011DTO> data;
    private Tg000011DTO selectedTg000011;
    private Tg000011 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000011View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000011 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000011 = null;

        if (txtAtiva != null) {
            txtAtiva.setValue(null);
            txtAtiva.setDisabled(true);
        }

        if (txtCiudad != null) {
            txtCiudad.setValue(null);
            txtCiudad.setDisabled(true);
        }

        if (txtDepto != null) {
            txtDepto.setValue(null);
            txtDepto.setDisabled(true);
        }

        if (txtDirEmpresa != null) {
            txtDirEmpresa.setValue(null);
            txtDirEmpresa.setDisabled(true);
        }

        if (txtDvempaf != null) {
            txtDvempaf.setValue(null);
            txtDvempaf.setDisabled(true);
        }

        if (txtEmailEmpresa != null) {
            txtEmailEmpresa.setValue(null);
            txtEmailEmpresa.setDisabled(true);
        }

        if (txtFaxEmpresa != null) {
            txtFaxEmpresa.setValue(null);
            txtFaxEmpresa.setDisabled(true);
        }

        if (txtNitEmpresa != null) {
            txtNitEmpresa.setValue(null);
            txtNitEmpresa.setDisabled(true);
        }

        if (txtNomContacto != null) {
            txtNomContacto.setValue(null);
            txtNomContacto.setDisabled(true);
        }

        if (txtNomEmpresa != null) {
            txtNomEmpresa.setValue(null);
            txtNomEmpresa.setDisabled(true);
        }

        if (txtTelEmpresa != null) {
            txtTelEmpresa.setValue(null);
            txtTelEmpresa.setDisabled(true);
        }

        if (txtTipoDocumentoEmpaf != null) {
            txtTipoDocumentoEmpaf.setValue(null);
            txtTipoDocumentoEmpaf.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodEmpresaEmp != null) {
            txtCodEmpresaEmp.setValue(null);
            txtCodEmpresaEmp.setDisabled(false);
        }

        if (txtCodEmpresa != null) {
            txtCodEmpresa.setValue(null);
            txtCodEmpresa.setDisabled(false);
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
            Tg000011Id id = new Tg000011Id();
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTg000011(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtAtiva.setDisabled(false);
            txtCiudad.setDisabled(false);
            txtDepto.setDisabled(false);
            txtDirEmpresa.setDisabled(false);
            txtDvempaf.setDisabled(false);
            txtEmailEmpresa.setDisabled(false);
            txtFaxEmpresa.setDisabled(false);
            txtNitEmpresa.setDisabled(false);
            txtNomContacto.setDisabled(false);
            txtNomEmpresa.setDisabled(false);
            txtTelEmpresa.setDisabled(false);
            txtTipoDocumentoEmpaf.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodEmpresaEmp.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtAtiva.setValue(entity.getAtiva());
            txtAtiva.setDisabled(false);
            txtCiudad.setValue(entity.getCiudad());
            txtCiudad.setDisabled(false);
            txtDepto.setValue(entity.getDepto());
            txtDepto.setDisabled(false);
            txtDirEmpresa.setValue(entity.getDirEmpresa());
            txtDirEmpresa.setDisabled(false);
            txtDvempaf.setValue(entity.getDvempaf());
            txtDvempaf.setDisabled(false);
            txtEmailEmpresa.setValue(entity.getEmailEmpresa());
            txtEmailEmpresa.setDisabled(false);
            txtFaxEmpresa.setValue(entity.getFaxEmpresa());
            txtFaxEmpresa.setDisabled(false);
            txtNitEmpresa.setValue(entity.getNitEmpresa());
            txtNitEmpresa.setDisabled(false);
            txtNomContacto.setValue(entity.getNomContacto());
            txtNomContacto.setDisabled(false);
            txtNomEmpresa.setValue(entity.getNomEmpresa());
            txtNomEmpresa.setDisabled(false);
            txtTelEmpresa.setValue(entity.getTelEmpresa());
            txtTelEmpresa.setDisabled(false);
            txtTipoDocumentoEmpaf.setValue(entity.getTipoDocumentoEmpaf());
            txtTipoDocumentoEmpaf.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodEmpresaEmp.setValue(entity.getId().getCodEmpresaEmp());
            txtCodEmpresaEmp.setDisabled(true);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000011 = (Tg000011DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000011"));
        txtAtiva.setValue(selectedTg000011.getAtiva());
        txtAtiva.setDisabled(false);
        txtCiudad.setValue(selectedTg000011.getCiudad());
        txtCiudad.setDisabled(false);
        txtDepto.setValue(selectedTg000011.getDepto());
        txtDepto.setDisabled(false);
        txtDirEmpresa.setValue(selectedTg000011.getDirEmpresa());
        txtDirEmpresa.setDisabled(false);
        txtDvempaf.setValue(selectedTg000011.getDvempaf());
        txtDvempaf.setDisabled(false);
        txtEmailEmpresa.setValue(selectedTg000011.getEmailEmpresa());
        txtEmailEmpresa.setDisabled(false);
        txtFaxEmpresa.setValue(selectedTg000011.getFaxEmpresa());
        txtFaxEmpresa.setDisabled(false);
        txtNitEmpresa.setValue(selectedTg000011.getNitEmpresa());
        txtNitEmpresa.setDisabled(false);
        txtNomContacto.setValue(selectedTg000011.getNomContacto());
        txtNomContacto.setDisabled(false);
        txtNomEmpresa.setValue(selectedTg000011.getNomEmpresa());
        txtNomEmpresa.setDisabled(false);
        txtTelEmpresa.setValue(selectedTg000011.getTelEmpresa());
        txtTelEmpresa.setDisabled(false);
        txtTipoDocumentoEmpaf.setValue(selectedTg000011.getTipoDocumentoEmpaf());
        txtTipoDocumentoEmpaf.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTg000011.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodEmpresaEmp.setValue(selectedTg000011.getCodEmpresaEmp());
        txtCodEmpresaEmp.setDisabled(true);
        txtCodEmpresa.setValue(selectedTg000011.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000011 == null) && (entity == null)) {
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
            entity = new Tg000011();

            Tg000011Id id = new Tg000011Id();
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setAtiva(FacesUtils.checkString(txtAtiva));
            entity.setCiudad(FacesUtils.checkString(txtCiudad));
            entity.setDepto(FacesUtils.checkString(txtDepto));
            entity.setDirEmpresa(FacesUtils.checkString(txtDirEmpresa));
            entity.setDvempaf(FacesUtils.checkString(txtDvempaf));
            entity.setEmailEmpresa(FacesUtils.checkString(txtEmailEmpresa));
            entity.setFaxEmpresa(FacesUtils.checkString(txtFaxEmpresa));
            entity.setId(id);
            entity.setNitEmpresa(FacesUtils.checkString(txtNitEmpresa));
            entity.setNomContacto(FacesUtils.checkString(txtNomContacto));
            entity.setNomEmpresa(FacesUtils.checkString(txtNomEmpresa));
            entity.setTelEmpresa(FacesUtils.checkString(txtTelEmpresa));
            entity.setTipoDocumentoEmpaf(FacesUtils.checkString(
                    txtTipoDocumentoEmpaf));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresaEmp()));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresa()));
            businessDelegatorView.saveTg000011(entity);
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
                Tg000011Id id = new Tg000011Id();
                id.setCodEmpresaEmp(selectedTg000011.getCodEmpresaEmp());
                id.setCodEmpresa(selectedTg000011.getCodEmpresa());
                entity = businessDelegatorView.getTg000011(id);
            }

            entity.setAtiva(FacesUtils.checkString(txtAtiva));
            entity.setCiudad(FacesUtils.checkString(txtCiudad));
            entity.setDepto(FacesUtils.checkString(txtDepto));
            entity.setDirEmpresa(FacesUtils.checkString(txtDirEmpresa));
            entity.setDvempaf(FacesUtils.checkString(txtDvempaf));
            entity.setEmailEmpresa(FacesUtils.checkString(txtEmailEmpresa));
            entity.setFaxEmpresa(FacesUtils.checkString(txtFaxEmpresa));
            entity.setNitEmpresa(FacesUtils.checkString(txtNitEmpresa));
            entity.setNomContacto(FacesUtils.checkString(txtNomContacto));
            entity.setNomEmpresa(FacesUtils.checkString(txtNomEmpresa));
            entity.setTelEmpresa(FacesUtils.checkString(txtTelEmpresa));
            entity.setTipoDocumentoEmpaf(FacesUtils.checkString(
                    txtTipoDocumentoEmpaf));
            businessDelegatorView.updateTg000011(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000011 = (Tg000011DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000011"));

            Tg000011Id id = new Tg000011Id();
            id.setCodEmpresaEmp(selectedTg000011.getCodEmpresaEmp());
            id.setCodEmpresa(selectedTg000011.getCodEmpresa());
            entity = businessDelegatorView.getTg000011(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tg000011Id id = new Tg000011Id();
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTg000011(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000011(entity);
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

    public String action_modifyWitDTO(String codEmpresaEmp, String codEmpresa,
        String ativa, String ciudad, String depto, String dirEmpresa,
        String dvempaf, String emailEmpresa, String faxEmpresa,
        String nitEmpresa, String nomContacto, String nomEmpresa,
        String telEmpresa, String tipoDocumentoEmpaf, String codEmpresa_Tg000003)
        throws Exception {
        try {
            entity.setAtiva(FacesUtils.checkString(ativa));
            entity.setCiudad(FacesUtils.checkString(ciudad));
            entity.setDepto(FacesUtils.checkString(depto));
            entity.setDirEmpresa(FacesUtils.checkString(dirEmpresa));
            entity.setDvempaf(FacesUtils.checkString(dvempaf));
            entity.setEmailEmpresa(FacesUtils.checkString(emailEmpresa));
            entity.setFaxEmpresa(FacesUtils.checkString(faxEmpresa));
            entity.setNitEmpresa(FacesUtils.checkString(nitEmpresa));
            entity.setNomContacto(FacesUtils.checkString(nomContacto));
            entity.setNomEmpresa(FacesUtils.checkString(nomEmpresa));
            entity.setTelEmpresa(FacesUtils.checkString(telEmpresa));
            entity.setTipoDocumentoEmpaf(FacesUtils.checkString(
                    tipoDocumentoEmpaf));
            businessDelegatorView.updateTg000011(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000011View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtAtiva() {
        return txtAtiva;
    }

    public void setTxtAtiva(InputText txtAtiva) {
        this.txtAtiva = txtAtiva;
    }

    public InputText getTxtCiudad() {
        return txtCiudad;
    }

    public void setTxtCiudad(InputText txtCiudad) {
        this.txtCiudad = txtCiudad;
    }

    public InputText getTxtDepto() {
        return txtDepto;
    }

    public void setTxtDepto(InputText txtDepto) {
        this.txtDepto = txtDepto;
    }

    public InputText getTxtDirEmpresa() {
        return txtDirEmpresa;
    }

    public void setTxtDirEmpresa(InputText txtDirEmpresa) {
        this.txtDirEmpresa = txtDirEmpresa;
    }

    public InputText getTxtDvempaf() {
        return txtDvempaf;
    }

    public void setTxtDvempaf(InputText txtDvempaf) {
        this.txtDvempaf = txtDvempaf;
    }

    public InputText getTxtEmailEmpresa() {
        return txtEmailEmpresa;
    }

    public void setTxtEmailEmpresa(InputText txtEmailEmpresa) {
        this.txtEmailEmpresa = txtEmailEmpresa;
    }

    public InputText getTxtFaxEmpresa() {
        return txtFaxEmpresa;
    }

    public void setTxtFaxEmpresa(InputText txtFaxEmpresa) {
        this.txtFaxEmpresa = txtFaxEmpresa;
    }

    public InputText getTxtNitEmpresa() {
        return txtNitEmpresa;
    }

    public void setTxtNitEmpresa(InputText txtNitEmpresa) {
        this.txtNitEmpresa = txtNitEmpresa;
    }

    public InputText getTxtNomContacto() {
        return txtNomContacto;
    }

    public void setTxtNomContacto(InputText txtNomContacto) {
        this.txtNomContacto = txtNomContacto;
    }

    public InputText getTxtNomEmpresa() {
        return txtNomEmpresa;
    }

    public void setTxtNomEmpresa(InputText txtNomEmpresa) {
        this.txtNomEmpresa = txtNomEmpresa;
    }

    public InputText getTxtTelEmpresa() {
        return txtTelEmpresa;
    }

    public void setTxtTelEmpresa(InputText txtTelEmpresa) {
        this.txtTelEmpresa = txtTelEmpresa;
    }

    public InputText getTxtTipoDocumentoEmpaf() {
        return txtTipoDocumentoEmpaf;
    }

    public void setTxtTipoDocumentoEmpaf(InputText txtTipoDocumentoEmpaf) {
        this.txtTipoDocumentoEmpaf = txtTipoDocumentoEmpaf;
    }

    public InputText getTxtCodEmpresa_Tg000003() {
        return txtCodEmpresa_Tg000003;
    }

    public void setTxtCodEmpresa_Tg000003(InputText txtCodEmpresa_Tg000003) {
        this.txtCodEmpresa_Tg000003 = txtCodEmpresa_Tg000003;
    }

    public InputText getTxtCodEmpresaEmp() {
        return txtCodEmpresaEmp;
    }

    public void setTxtCodEmpresaEmp(InputText txtCodEmpresaEmp) {
        this.txtCodEmpresaEmp = txtCodEmpresaEmp;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tg000011DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000011();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000011DTO> tg000011DTO) {
        this.data = tg000011DTO;
    }

    public Tg000011DTO getSelectedTg000011() {
        return selectedTg000011;
    }

    public void setSelectedTg000011(Tg000011DTO tg000011) {
        this.selectedTg000011 = tg000011;
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
