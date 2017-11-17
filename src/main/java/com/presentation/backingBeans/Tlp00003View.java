package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tlp00003DTO;

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
public class Tlp00003View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tlp00003View.class);
    private InputText txtCodEmpresaEmp;
    private InputText txtIng;
    private InputText txtPlanillaAfp;
    private InputText txtPlanillaArp;
    private InputText txtPlanillaEps;
    private InputText txtRet;
    private InputText txtNumPlanilla;
    private InputText txtCodEmpresa;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tlp00003DTO> data;
    private Tlp00003DTO selectedTlp00003;
    private Tlp00003 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tlp00003View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTlp00003 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTlp00003 = null;

        if (txtCodEmpresaEmp != null) {
            txtCodEmpresaEmp.setValue(null);
            txtCodEmpresaEmp.setDisabled(true);
        }

        if (txtIng != null) {
            txtIng.setValue(null);
            txtIng.setDisabled(true);
        }

        if (txtPlanillaAfp != null) {
            txtPlanillaAfp.setValue(null);
            txtPlanillaAfp.setDisabled(true);
        }

        if (txtPlanillaArp != null) {
            txtPlanillaArp.setValue(null);
            txtPlanillaArp.setDisabled(true);
        }

        if (txtPlanillaEps != null) {
            txtPlanillaEps.setValue(null);
            txtPlanillaEps.setDisabled(true);
        }

        if (txtRet != null) {
            txtRet.setValue(null);
            txtRet.setDisabled(true);
        }

        if (txtNumPlanilla != null) {
            txtNumPlanilla.setValue(null);
            txtNumPlanilla.setDisabled(false);
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
            Tlp00003Id id = new Tlp00003Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTlp00003(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtCodEmpresaEmp.setDisabled(false);
            txtIng.setDisabled(false);
            txtPlanillaAfp.setDisabled(false);
            txtPlanillaArp.setDisabled(false);
            txtPlanillaEps.setDisabled(false);
            txtRet.setDisabled(false);
            txtNumPlanilla.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtCodEmpresaEmp.setValue(entity.getCodEmpresaEmp());
            txtCodEmpresaEmp.setDisabled(false);
            txtIng.setValue(entity.getIng());
            txtIng.setDisabled(false);
            txtPlanillaAfp.setValue(entity.getPlanillaAfp());
            txtPlanillaAfp.setDisabled(false);
            txtPlanillaArp.setValue(entity.getPlanillaArp());
            txtPlanillaArp.setDisabled(false);
            txtPlanillaEps.setValue(entity.getPlanillaEps());
            txtPlanillaEps.setDisabled(false);
            txtRet.setValue(entity.getRet());
            txtRet.setDisabled(false);
            txtNumPlanilla.setValue(entity.getId().getNumPlanilla());
            txtNumPlanilla.setDisabled(true);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTlp00003 = (Tlp00003DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTlp00003"));
        txtCodEmpresaEmp.setValue(selectedTlp00003.getCodEmpresaEmp());
        txtCodEmpresaEmp.setDisabled(false);
        txtIng.setValue(selectedTlp00003.getIng());
        txtIng.setDisabled(false);
        txtPlanillaAfp.setValue(selectedTlp00003.getPlanillaAfp());
        txtPlanillaAfp.setDisabled(false);
        txtPlanillaArp.setValue(selectedTlp00003.getPlanillaArp());
        txtPlanillaArp.setDisabled(false);
        txtPlanillaEps.setValue(selectedTlp00003.getPlanillaEps());
        txtPlanillaEps.setDisabled(false);
        txtRet.setValue(selectedTlp00003.getRet());
        txtRet.setDisabled(false);
        txtNumPlanilla.setValue(selectedTlp00003.getNumPlanilla());
        txtNumPlanilla.setDisabled(true);
        txtCodEmpresa.setValue(selectedTlp00003.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTlp00003 == null) && (entity == null)) {
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
            entity = new Tlp00003();

            Tlp00003Id id = new Tlp00003Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setCodEmpresaEmp(FacesUtils.checkString(txtCodEmpresaEmp));
            entity.setId(id);
            entity.setIng(FacesUtils.checkString(txtIng));
            entity.setPlanillaAfp(FacesUtils.checkString(txtPlanillaAfp));
            entity.setPlanillaArp(FacesUtils.checkString(txtPlanillaArp));
            entity.setPlanillaEps(FacesUtils.checkString(txtPlanillaEps));
            entity.setRet(FacesUtils.checkString(txtRet));
            businessDelegatorView.saveTlp00003(entity);
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
                Tlp00003Id id = new Tlp00003Id();
                id.setNumPlanilla(selectedTlp00003.getNumPlanilla());
                id.setCodEmpresa(selectedTlp00003.getCodEmpresa());
                entity = businessDelegatorView.getTlp00003(id);
            }

            entity.setCodEmpresaEmp(FacesUtils.checkString(txtCodEmpresaEmp));
            entity.setIng(FacesUtils.checkString(txtIng));
            entity.setPlanillaAfp(FacesUtils.checkString(txtPlanillaAfp));
            entity.setPlanillaArp(FacesUtils.checkString(txtPlanillaArp));
            entity.setPlanillaEps(FacesUtils.checkString(txtPlanillaEps));
            entity.setRet(FacesUtils.checkString(txtRet));
            businessDelegatorView.updateTlp00003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTlp00003 = (Tlp00003DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTlp00003"));

            Tlp00003Id id = new Tlp00003Id();
            id.setNumPlanilla(selectedTlp00003.getNumPlanilla());
            id.setCodEmpresa(selectedTlp00003.getCodEmpresa());
            entity = businessDelegatorView.getTlp00003(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tlp00003Id id = new Tlp00003Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTlp00003(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTlp00003(entity);
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

    public String action_modifyWitDTO(String numPlanilla, String codEmpresa,
        String codEmpresaEmp, String ing, String planillaAfp,
        String planillaArp, String planillaEps, String ret)
        throws Exception {
        try {
            entity.setCodEmpresaEmp(FacesUtils.checkString(codEmpresaEmp));
            entity.setIng(FacesUtils.checkString(ing));
            entity.setPlanillaAfp(FacesUtils.checkString(planillaAfp));
            entity.setPlanillaArp(FacesUtils.checkString(planillaArp));
            entity.setPlanillaEps(FacesUtils.checkString(planillaEps));
            entity.setRet(FacesUtils.checkString(ret));
            businessDelegatorView.updateTlp00003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tlp00003View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtCodEmpresaEmp() {
        return txtCodEmpresaEmp;
    }

    public void setTxtCodEmpresaEmp(InputText txtCodEmpresaEmp) {
        this.txtCodEmpresaEmp = txtCodEmpresaEmp;
    }

    public InputText getTxtIng() {
        return txtIng;
    }

    public void setTxtIng(InputText txtIng) {
        this.txtIng = txtIng;
    }

    public InputText getTxtPlanillaAfp() {
        return txtPlanillaAfp;
    }

    public void setTxtPlanillaAfp(InputText txtPlanillaAfp) {
        this.txtPlanillaAfp = txtPlanillaAfp;
    }

    public InputText getTxtPlanillaArp() {
        return txtPlanillaArp;
    }

    public void setTxtPlanillaArp(InputText txtPlanillaArp) {
        this.txtPlanillaArp = txtPlanillaArp;
    }

    public InputText getTxtPlanillaEps() {
        return txtPlanillaEps;
    }

    public void setTxtPlanillaEps(InputText txtPlanillaEps) {
        this.txtPlanillaEps = txtPlanillaEps;
    }

    public InputText getTxtRet() {
        return txtRet;
    }

    public void setTxtRet(InputText txtRet) {
        this.txtRet = txtRet;
    }

    public InputText getTxtNumPlanilla() {
        return txtNumPlanilla;
    }

    public void setTxtNumPlanilla(InputText txtNumPlanilla) {
        this.txtNumPlanilla = txtNumPlanilla;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tlp00003DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTlp00003();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tlp00003DTO> tlp00003DTO) {
        this.data = tlp00003DTO;
    }

    public Tlp00003DTO getSelectedTlp00003() {
        return selectedTlp00003;
    }

    public void setSelectedTlp00003(Tlp00003DTO tlp00003) {
        this.selectedTlp00003 = tlp00003;
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
