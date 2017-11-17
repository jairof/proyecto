package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000008DTO;

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
public class Tg000008View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000008View.class);
    private InputText txtChequeActivo;
    private InputText txtChequeUltimo;
    private InputText txtChequeprimer;
    private InputText txtConsignacionClientes;
    private InputText txtNcheques;
    private InputText txtNumcuenta;
    private InputText txtTipoCuenta;
    private InputText txtCodBanco_Tg000001;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodCuenta;
    private InputText txtCodEmpresa;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000008DTO> data;
    private Tg000008DTO selectedTg000008;
    private Tg000008 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000008View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000008 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000008 = null;

        if (txtChequeActivo != null) {
            txtChequeActivo.setValue(null);
            txtChequeActivo.setDisabled(true);
        }

        if (txtChequeUltimo != null) {
            txtChequeUltimo.setValue(null);
            txtChequeUltimo.setDisabled(true);
        }

        if (txtChequeprimer != null) {
            txtChequeprimer.setValue(null);
            txtChequeprimer.setDisabled(true);
        }

        if (txtConsignacionClientes != null) {
            txtConsignacionClientes.setValue(null);
            txtConsignacionClientes.setDisabled(true);
        }

        if (txtNcheques != null) {
            txtNcheques.setValue(null);
            txtNcheques.setDisabled(true);
        }

        if (txtNumcuenta != null) {
            txtNumcuenta.setValue(null);
            txtNumcuenta.setDisabled(true);
        }

        if (txtTipoCuenta != null) {
            txtTipoCuenta.setValue(null);
            txtTipoCuenta.setDisabled(true);
        }

        if (txtCodBanco_Tg000001 != null) {
            txtCodBanco_Tg000001.setValue(null);
            txtCodBanco_Tg000001.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodCuenta != null) {
            txtCodCuenta.setValue(null);
            txtCodCuenta.setDisabled(false);
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
            Tg000008Id id = new Tg000008Id();
            id.setCodCuenta((((txtCodCuenta.getValue()) == null) ||
                (txtCodCuenta.getValue()).equals("")) ? null
                                                      : FacesUtils.checkString(
                    txtCodCuenta));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTg000008(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtChequeActivo.setDisabled(false);
            txtChequeUltimo.setDisabled(false);
            txtChequeprimer.setDisabled(false);
            txtConsignacionClientes.setDisabled(false);
            txtNcheques.setDisabled(false);
            txtNumcuenta.setDisabled(false);
            txtTipoCuenta.setDisabled(false);
            txtCodBanco_Tg000001.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodCuenta.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtChequeActivo.setValue(entity.getChequeActivo());
            txtChequeActivo.setDisabled(false);
            txtChequeUltimo.setValue(entity.getChequeUltimo());
            txtChequeUltimo.setDisabled(false);
            txtChequeprimer.setValue(entity.getChequeprimer());
            txtChequeprimer.setDisabled(false);
            txtConsignacionClientes.setValue(entity.getConsignacionClientes());
            txtConsignacionClientes.setDisabled(false);
            txtNcheques.setValue(entity.getNcheques());
            txtNcheques.setDisabled(false);
            txtNumcuenta.setValue(entity.getNumcuenta());
            txtNumcuenta.setDisabled(false);
            txtTipoCuenta.setValue(entity.getTipoCuenta());
            txtTipoCuenta.setDisabled(false);
            txtCodBanco_Tg000001.setValue(entity.getTg000001().getCodBanco());
            txtCodBanco_Tg000001.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodCuenta.setValue(entity.getId().getCodCuenta());
            txtCodCuenta.setDisabled(true);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000008 = (Tg000008DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000008"));
        txtChequeActivo.setValue(selectedTg000008.getChequeActivo());
        txtChequeActivo.setDisabled(false);
        txtChequeUltimo.setValue(selectedTg000008.getChequeUltimo());
        txtChequeUltimo.setDisabled(false);
        txtChequeprimer.setValue(selectedTg000008.getChequeprimer());
        txtChequeprimer.setDisabled(false);
        txtConsignacionClientes.setValue(selectedTg000008.getConsignacionClientes());
        txtConsignacionClientes.setDisabled(false);
        txtNcheques.setValue(selectedTg000008.getNcheques());
        txtNcheques.setDisabled(false);
        txtNumcuenta.setValue(selectedTg000008.getNumcuenta());
        txtNumcuenta.setDisabled(false);
        txtTipoCuenta.setValue(selectedTg000008.getTipoCuenta());
        txtTipoCuenta.setDisabled(false);
        txtCodBanco_Tg000001.setValue(selectedTg000008.getCodBanco_Tg000001());
        txtCodBanco_Tg000001.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTg000008.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodCuenta.setValue(selectedTg000008.getCodCuenta());
        txtCodCuenta.setDisabled(true);
        txtCodEmpresa.setValue(selectedTg000008.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000008 == null) && (entity == null)) {
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
            entity = new Tg000008();

            Tg000008Id id = new Tg000008Id();
            id.setCodCuenta((((txtCodCuenta.getValue()) == null) ||
                (txtCodCuenta.getValue()).equals("")) ? null
                                                      : FacesUtils.checkString(
                    txtCodCuenta));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setChequeActivo(FacesUtils.checkInteger(txtChequeActivo));
            entity.setChequeUltimo(FacesUtils.checkInteger(txtChequeUltimo));
            entity.setChequeprimer(FacesUtils.checkInteger(txtChequeprimer));
            entity.setConsignacionClientes(FacesUtils.checkString(
                    txtConsignacionClientes));
            entity.setId(id);
            entity.setNcheques(FacesUtils.checkInteger(txtNcheques));
            entity.setNumcuenta(FacesUtils.checkString(txtNumcuenta));
            entity.setTipoCuenta(FacesUtils.checkString(txtTipoCuenta));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresa()));
            entity.setTg000001((FacesUtils.checkString(txtCodBanco_Tg000001) != null)
                ? businessDelegatorView.getTg000001(FacesUtils.checkString(
                        txtCodBanco_Tg000001)) : null);
            businessDelegatorView.saveTg000008(entity);
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
                Tg000008Id id = new Tg000008Id();
                id.setCodCuenta(selectedTg000008.getCodCuenta());
                id.setCodEmpresa(selectedTg000008.getCodEmpresa());
                entity = businessDelegatorView.getTg000008(id);
            }

            entity.setChequeActivo(FacesUtils.checkInteger(txtChequeActivo));
            entity.setChequeUltimo(FacesUtils.checkInteger(txtChequeUltimo));
            entity.setChequeprimer(FacesUtils.checkInteger(txtChequeprimer));
            entity.setConsignacionClientes(FacesUtils.checkString(
                    txtConsignacionClientes));
            entity.setNcheques(FacesUtils.checkInteger(txtNcheques));
            entity.setNumcuenta(FacesUtils.checkString(txtNumcuenta));
            entity.setTipoCuenta(FacesUtils.checkString(txtTipoCuenta));
            entity.setTg000001((FacesUtils.checkString(txtCodBanco_Tg000001) != null)
                ? businessDelegatorView.getTg000001(FacesUtils.checkString(
                        txtCodBanco_Tg000001)) : null);
            businessDelegatorView.updateTg000008(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000008 = (Tg000008DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000008"));

            Tg000008Id id = new Tg000008Id();
            id.setCodCuenta(selectedTg000008.getCodCuenta());
            id.setCodEmpresa(selectedTg000008.getCodEmpresa());
            entity = businessDelegatorView.getTg000008(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tg000008Id id = new Tg000008Id();
            id.setCodCuenta((((txtCodCuenta.getValue()) == null) ||
                (txtCodCuenta.getValue()).equals("")) ? null
                                                      : FacesUtils.checkString(
                    txtCodCuenta));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTg000008(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000008(entity);
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

    public String action_modifyWitDTO(String codCuenta, String codEmpresa,
        Integer chequeActivo, Integer chequeUltimo, Integer chequeprimer,
        String consignacionClientes, Integer ncheques, String numcuenta,
        String tipoCuenta, String codBanco_Tg000001, String codEmpresa_Tg000003)
        throws Exception {
        try {
            entity.setChequeActivo(FacesUtils.checkInteger(chequeActivo));
            entity.setChequeUltimo(FacesUtils.checkInteger(chequeUltimo));
            entity.setChequeprimer(FacesUtils.checkInteger(chequeprimer));
            entity.setConsignacionClientes(FacesUtils.checkString(
                    consignacionClientes));
            entity.setNcheques(FacesUtils.checkInteger(ncheques));
            entity.setNumcuenta(FacesUtils.checkString(numcuenta));
            entity.setTipoCuenta(FacesUtils.checkString(tipoCuenta));
            businessDelegatorView.updateTg000008(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000008View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtChequeActivo() {
        return txtChequeActivo;
    }

    public void setTxtChequeActivo(InputText txtChequeActivo) {
        this.txtChequeActivo = txtChequeActivo;
    }

    public InputText getTxtChequeUltimo() {
        return txtChequeUltimo;
    }

    public void setTxtChequeUltimo(InputText txtChequeUltimo) {
        this.txtChequeUltimo = txtChequeUltimo;
    }

    public InputText getTxtChequeprimer() {
        return txtChequeprimer;
    }

    public void setTxtChequeprimer(InputText txtChequeprimer) {
        this.txtChequeprimer = txtChequeprimer;
    }

    public InputText getTxtConsignacionClientes() {
        return txtConsignacionClientes;
    }

    public void setTxtConsignacionClientes(InputText txtConsignacionClientes) {
        this.txtConsignacionClientes = txtConsignacionClientes;
    }

    public InputText getTxtNcheques() {
        return txtNcheques;
    }

    public void setTxtNcheques(InputText txtNcheques) {
        this.txtNcheques = txtNcheques;
    }

    public InputText getTxtNumcuenta() {
        return txtNumcuenta;
    }

    public void setTxtNumcuenta(InputText txtNumcuenta) {
        this.txtNumcuenta = txtNumcuenta;
    }

    public InputText getTxtTipoCuenta() {
        return txtTipoCuenta;
    }

    public void setTxtTipoCuenta(InputText txtTipoCuenta) {
        this.txtTipoCuenta = txtTipoCuenta;
    }

    public InputText getTxtCodBanco_Tg000001() {
        return txtCodBanco_Tg000001;
    }

    public void setTxtCodBanco_Tg000001(InputText txtCodBanco_Tg000001) {
        this.txtCodBanco_Tg000001 = txtCodBanco_Tg000001;
    }

    public InputText getTxtCodEmpresa_Tg000003() {
        return txtCodEmpresa_Tg000003;
    }

    public void setTxtCodEmpresa_Tg000003(InputText txtCodEmpresa_Tg000003) {
        this.txtCodEmpresa_Tg000003 = txtCodEmpresa_Tg000003;
    }

    public InputText getTxtCodCuenta() {
        return txtCodCuenta;
    }

    public void setTxtCodCuenta(InputText txtCodCuenta) {
        this.txtCodCuenta = txtCodCuenta;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tg000008DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000008();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000008DTO> tg000008DTO) {
        this.data = tg000008DTO;
    }

    public Tg000008DTO getSelectedTg000008() {
        return selectedTg000008;
    }

    public void setSelectedTg000008(Tg000008DTO tg000008) {
        this.selectedTg000008 = tg000008;
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
