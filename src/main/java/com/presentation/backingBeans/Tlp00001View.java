package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tlp00001DTO;

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
public class Tlp00001View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tlp00001View.class);
    private InputText txtAfp;
    private InputText txtArp;
    private InputText txtCodBanco;
    private InputText txtCodPeriodo;
    private InputText txtCodPeriodoPeRiSc;
    private InputText txtCodigoArp;
    private InputText txtCodigoSucursal;
    private InputText txtConsecutivoPlani;
    private InputText txtCorreccionPlanilla;
    private InputText txtEps;
    private InputText txtFormaPresentacion;
    private InputText txtIngUsuariosPagos;
    private InputText txtMasIntdemora;
    private InputText txtNumCheque;
    private InputText txtNumCuentadelCheque;
    private InputText txtNumPlanillaCorrecion;
    private InputText txtNumeroMeses;
    private InputText txtNumerodeCotizantes;
    private InputText txtParafiscales;
    private InputText txtRetUsuariosNoPagos;
    private InputText txtTipoAportante;
    private InputText txtValorCheque;
    private InputText txtValorEfectivo;
    private InputText txtValorNomina;
    private InputText txtCodBanco_Tg000001;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodTipodePlanillas_Tg000026;
    private InputText txtNumPlanilla;
    private InputText txtCodEmpresa;
    private Calendar txtFechaCorteRetiro;
    private Calendar txtFechaGenera;
    private Calendar txtFechaIngPagoSistema;
    private Calendar txtFechaPago;
    private Calendar txtFechaPagoPlanillaCorrecion;
    private Calendar txtHoraGenera;
    private Calendar txtHoraIngPagoSistema;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tlp00001DTO> data;
    private Tlp00001DTO selectedTlp00001;
    private Tlp00001 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tlp00001View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTlp00001 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTlp00001 = null;

        if (txtAfp != null) {
            txtAfp.setValue(null);
            txtAfp.setDisabled(true);
        }

        if (txtArp != null) {
            txtArp.setValue(null);
            txtArp.setDisabled(true);
        }

        if (txtCodBanco != null) {
            txtCodBanco.setValue(null);
            txtCodBanco.setDisabled(true);
        }

        if (txtCodPeriodo != null) {
            txtCodPeriodo.setValue(null);
            txtCodPeriodo.setDisabled(true);
        }

        if (txtCodPeriodoPeRiSc != null) {
            txtCodPeriodoPeRiSc.setValue(null);
            txtCodPeriodoPeRiSc.setDisabled(true);
        }

        if (txtCodigoArp != null) {
            txtCodigoArp.setValue(null);
            txtCodigoArp.setDisabled(true);
        }

        if (txtCodigoSucursal != null) {
            txtCodigoSucursal.setValue(null);
            txtCodigoSucursal.setDisabled(true);
        }

        if (txtConsecutivoPlani != null) {
            txtConsecutivoPlani.setValue(null);
            txtConsecutivoPlani.setDisabled(true);
        }

        if (txtCorreccionPlanilla != null) {
            txtCorreccionPlanilla.setValue(null);
            txtCorreccionPlanilla.setDisabled(true);
        }

        if (txtEps != null) {
            txtEps.setValue(null);
            txtEps.setDisabled(true);
        }

        if (txtFormaPresentacion != null) {
            txtFormaPresentacion.setValue(null);
            txtFormaPresentacion.setDisabled(true);
        }

        if (txtIngUsuariosPagos != null) {
            txtIngUsuariosPagos.setValue(null);
            txtIngUsuariosPagos.setDisabled(true);
        }

        if (txtMasIntdemora != null) {
            txtMasIntdemora.setValue(null);
            txtMasIntdemora.setDisabled(true);
        }

        if (txtNumCheque != null) {
            txtNumCheque.setValue(null);
            txtNumCheque.setDisabled(true);
        }

        if (txtNumCuentadelCheque != null) {
            txtNumCuentadelCheque.setValue(null);
            txtNumCuentadelCheque.setDisabled(true);
        }

        if (txtNumPlanillaCorrecion != null) {
            txtNumPlanillaCorrecion.setValue(null);
            txtNumPlanillaCorrecion.setDisabled(true);
        }

        if (txtNumeroMeses != null) {
            txtNumeroMeses.setValue(null);
            txtNumeroMeses.setDisabled(true);
        }

        if (txtNumerodeCotizantes != null) {
            txtNumerodeCotizantes.setValue(null);
            txtNumerodeCotizantes.setDisabled(true);
        }

        if (txtParafiscales != null) {
            txtParafiscales.setValue(null);
            txtParafiscales.setDisabled(true);
        }

        if (txtRetUsuariosNoPagos != null) {
            txtRetUsuariosNoPagos.setValue(null);
            txtRetUsuariosNoPagos.setDisabled(true);
        }

        if (txtTipoAportante != null) {
            txtTipoAportante.setValue(null);
            txtTipoAportante.setDisabled(true);
        }

        if (txtValorCheque != null) {
            txtValorCheque.setValue(null);
            txtValorCheque.setDisabled(true);
        }

        if (txtValorEfectivo != null) {
            txtValorEfectivo.setValue(null);
            txtValorEfectivo.setDisabled(true);
        }

        if (txtValorNomina != null) {
            txtValorNomina.setValue(null);
            txtValorNomina.setDisabled(true);
        }

        if (txtCodBanco_Tg000001 != null) {
            txtCodBanco_Tg000001.setValue(null);
            txtCodBanco_Tg000001.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodTipodePlanillas_Tg000026 != null) {
            txtCodTipodePlanillas_Tg000026.setValue(null);
            txtCodTipodePlanillas_Tg000026.setDisabled(true);
        }

        if (txtFechaCorteRetiro != null) {
            txtFechaCorteRetiro.setValue(null);
            txtFechaCorteRetiro.setDisabled(true);
        }

        if (txtFechaGenera != null) {
            txtFechaGenera.setValue(null);
            txtFechaGenera.setDisabled(true);
        }

        if (txtFechaIngPagoSistema != null) {
            txtFechaIngPagoSistema.setValue(null);
            txtFechaIngPagoSistema.setDisabled(true);
        }

        if (txtFechaPago != null) {
            txtFechaPago.setValue(null);
            txtFechaPago.setDisabled(true);
        }

        if (txtFechaPagoPlanillaCorrecion != null) {
            txtFechaPagoPlanillaCorrecion.setValue(null);
            txtFechaPagoPlanillaCorrecion.setDisabled(true);
        }

        if (txtHoraGenera != null) {
            txtHoraGenera.setValue(null);
            txtHoraGenera.setDisabled(true);
        }

        if (txtHoraIngPagoSistema != null) {
            txtHoraIngPagoSistema.setValue(null);
            txtHoraIngPagoSistema.setDisabled(true);
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

    public void listener_txtFechaCorteRetiro() {
        Date inputDate = (Date) txtFechaCorteRetiro.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaGenera() {
        Date inputDate = (Date) txtFechaGenera.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaIngPagoSistema() {
        Date inputDate = (Date) txtFechaIngPagoSistema.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaPago() {
        Date inputDate = (Date) txtFechaPago.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaPagoPlanillaCorrecion() {
        Date inputDate = (Date) txtFechaPagoPlanillaCorrecion.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtHoraGenera() {
        Date inputDate = (Date) txtHoraGenera.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtHoraIngPagoSistema() {
        Date inputDate = (Date) txtHoraIngPagoSistema.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtId() {
        try {
            Tlp00001Id id = new Tlp00001Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTlp00001(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtAfp.setDisabled(false);
            txtArp.setDisabled(false);
            txtCodBanco.setDisabled(false);
            txtCodPeriodo.setDisabled(false);
            txtCodPeriodoPeRiSc.setDisabled(false);
            txtCodigoArp.setDisabled(false);
            txtCodigoSucursal.setDisabled(false);
            txtConsecutivoPlani.setDisabled(false);
            txtCorreccionPlanilla.setDisabled(false);
            txtEps.setDisabled(false);
            txtFormaPresentacion.setDisabled(false);
            txtIngUsuariosPagos.setDisabled(false);
            txtMasIntdemora.setDisabled(false);
            txtNumCheque.setDisabled(false);
            txtNumCuentadelCheque.setDisabled(false);
            txtNumPlanillaCorrecion.setDisabled(false);
            txtNumeroMeses.setDisabled(false);
            txtNumerodeCotizantes.setDisabled(false);
            txtParafiscales.setDisabled(false);
            txtRetUsuariosNoPagos.setDisabled(false);
            txtTipoAportante.setDisabled(false);
            txtValorCheque.setDisabled(false);
            txtValorEfectivo.setDisabled(false);
            txtValorNomina.setDisabled(false);
            txtCodBanco_Tg000001.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodTipodePlanillas_Tg000026.setDisabled(false);
            txtFechaCorteRetiro.setDisabled(false);
            txtFechaGenera.setDisabled(false);
            txtFechaIngPagoSistema.setDisabled(false);
            txtFechaPago.setDisabled(false);
            txtFechaPagoPlanillaCorrecion.setDisabled(false);
            txtHoraGenera.setDisabled(false);
            txtHoraIngPagoSistema.setDisabled(false);
            txtNumPlanilla.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtAfp.setValue(entity.getAfp());
            txtAfp.setDisabled(false);
            txtArp.setValue(entity.getArp());
            txtArp.setDisabled(false);
            txtCodBanco.setValue(entity.getCodBanco());
            txtCodBanco.setDisabled(false);
            txtCodPeriodo.setValue(entity.getCodPeriodo());
            txtCodPeriodo.setDisabled(false);
            txtCodPeriodoPeRiSc.setValue(entity.getCodPeriodoPeRiSc());
            txtCodPeriodoPeRiSc.setDisabled(false);
            txtCodigoArp.setValue(entity.getCodigoArp());
            txtCodigoArp.setDisabled(false);
            txtCodigoSucursal.setValue(entity.getCodigoSucursal());
            txtCodigoSucursal.setDisabled(false);
            txtConsecutivoPlani.setValue(entity.getConsecutivoPlani());
            txtConsecutivoPlani.setDisabled(false);
            txtCorreccionPlanilla.setValue(entity.getCorreccionPlanilla());
            txtCorreccionPlanilla.setDisabled(false);
            txtEps.setValue(entity.getEps());
            txtEps.setDisabled(false);
            txtFechaCorteRetiro.setValue(entity.getFechaCorteRetiro());
            txtFechaCorteRetiro.setDisabled(false);
            txtFechaGenera.setValue(entity.getFechaGenera());
            txtFechaGenera.setDisabled(false);
            txtFechaIngPagoSistema.setValue(entity.getFechaIngPagoSistema());
            txtFechaIngPagoSistema.setDisabled(false);
            txtFechaPago.setValue(entity.getFechaPago());
            txtFechaPago.setDisabled(false);
            txtFechaPagoPlanillaCorrecion.setValue(entity.getFechaPagoPlanillaCorrecion());
            txtFechaPagoPlanillaCorrecion.setDisabled(false);
            txtFormaPresentacion.setValue(entity.getFormaPresentacion());
            txtFormaPresentacion.setDisabled(false);
            txtHoraGenera.setValue(entity.getHoraGenera());
            txtHoraGenera.setDisabled(false);
            txtHoraIngPagoSistema.setValue(entity.getHoraIngPagoSistema());
            txtHoraIngPagoSistema.setDisabled(false);
            txtIngUsuariosPagos.setValue(entity.getIngUsuariosPagos());
            txtIngUsuariosPagos.setDisabled(false);
            txtMasIntdemora.setValue(entity.getMasIntdemora());
            txtMasIntdemora.setDisabled(false);
            txtNumCheque.setValue(entity.getNumCheque());
            txtNumCheque.setDisabled(false);
            txtNumCuentadelCheque.setValue(entity.getNumCuentadelCheque());
            txtNumCuentadelCheque.setDisabled(false);
            txtNumPlanillaCorrecion.setValue(entity.getNumPlanillaCorrecion());
            txtNumPlanillaCorrecion.setDisabled(false);
            txtNumeroMeses.setValue(entity.getNumeroMeses());
            txtNumeroMeses.setDisabled(false);
            txtNumerodeCotizantes.setValue(entity.getNumerodeCotizantes());
            txtNumerodeCotizantes.setDisabled(false);
            txtParafiscales.setValue(entity.getParafiscales());
            txtParafiscales.setDisabled(false);
            txtRetUsuariosNoPagos.setValue(entity.getRetUsuariosNoPagos());
            txtRetUsuariosNoPagos.setDisabled(false);
            txtTipoAportante.setValue(entity.getTipoAportante());
            txtTipoAportante.setDisabled(false);
            txtValorCheque.setValue(entity.getValorCheque());
            txtValorCheque.setDisabled(false);
            txtValorEfectivo.setValue(entity.getValorEfectivo());
            txtValorEfectivo.setDisabled(false);
            txtValorNomina.setValue(entity.getValorNomina());
            txtValorNomina.setDisabled(false);
            txtCodBanco_Tg000001.setValue(entity.getTg000001().getCodBanco());
            txtCodBanco_Tg000001.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodTipodePlanillas_Tg000026.setValue(entity.getTg000026()
                                                          .getCodTipodePlanillas());
            txtCodTipodePlanillas_Tg000026.setDisabled(false);
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
        selectedTlp00001 = (Tlp00001DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTlp00001"));
        txtAfp.setValue(selectedTlp00001.getAfp());
        txtAfp.setDisabled(false);
        txtArp.setValue(selectedTlp00001.getArp());
        txtArp.setDisabled(false);
        txtCodBanco.setValue(selectedTlp00001.getCodBanco());
        txtCodBanco.setDisabled(false);
        txtCodPeriodo.setValue(selectedTlp00001.getCodPeriodo());
        txtCodPeriodo.setDisabled(false);
        txtCodPeriodoPeRiSc.setValue(selectedTlp00001.getCodPeriodoPeRiSc());
        txtCodPeriodoPeRiSc.setDisabled(false);
        txtCodigoArp.setValue(selectedTlp00001.getCodigoArp());
        txtCodigoArp.setDisabled(false);
        txtCodigoSucursal.setValue(selectedTlp00001.getCodigoSucursal());
        txtCodigoSucursal.setDisabled(false);
        txtConsecutivoPlani.setValue(selectedTlp00001.getConsecutivoPlani());
        txtConsecutivoPlani.setDisabled(false);
        txtCorreccionPlanilla.setValue(selectedTlp00001.getCorreccionPlanilla());
        txtCorreccionPlanilla.setDisabled(false);
        txtEps.setValue(selectedTlp00001.getEps());
        txtEps.setDisabled(false);
        txtFechaCorteRetiro.setValue(selectedTlp00001.getFechaCorteRetiro());
        txtFechaCorteRetiro.setDisabled(false);
        txtFechaGenera.setValue(selectedTlp00001.getFechaGenera());
        txtFechaGenera.setDisabled(false);
        txtFechaIngPagoSistema.setValue(selectedTlp00001.getFechaIngPagoSistema());
        txtFechaIngPagoSistema.setDisabled(false);
        txtFechaPago.setValue(selectedTlp00001.getFechaPago());
        txtFechaPago.setDisabled(false);
        txtFechaPagoPlanillaCorrecion.setValue(selectedTlp00001.getFechaPagoPlanillaCorrecion());
        txtFechaPagoPlanillaCorrecion.setDisabled(false);
        txtFormaPresentacion.setValue(selectedTlp00001.getFormaPresentacion());
        txtFormaPresentacion.setDisabled(false);
        txtHoraGenera.setValue(selectedTlp00001.getHoraGenera());
        txtHoraGenera.setDisabled(false);
        txtHoraIngPagoSistema.setValue(selectedTlp00001.getHoraIngPagoSistema());
        txtHoraIngPagoSistema.setDisabled(false);
        txtIngUsuariosPagos.setValue(selectedTlp00001.getIngUsuariosPagos());
        txtIngUsuariosPagos.setDisabled(false);
        txtMasIntdemora.setValue(selectedTlp00001.getMasIntdemora());
        txtMasIntdemora.setDisabled(false);
        txtNumCheque.setValue(selectedTlp00001.getNumCheque());
        txtNumCheque.setDisabled(false);
        txtNumCuentadelCheque.setValue(selectedTlp00001.getNumCuentadelCheque());
        txtNumCuentadelCheque.setDisabled(false);
        txtNumPlanillaCorrecion.setValue(selectedTlp00001.getNumPlanillaCorrecion());
        txtNumPlanillaCorrecion.setDisabled(false);
        txtNumeroMeses.setValue(selectedTlp00001.getNumeroMeses());
        txtNumeroMeses.setDisabled(false);
        txtNumerodeCotizantes.setValue(selectedTlp00001.getNumerodeCotizantes());
        txtNumerodeCotizantes.setDisabled(false);
        txtParafiscales.setValue(selectedTlp00001.getParafiscales());
        txtParafiscales.setDisabled(false);
        txtRetUsuariosNoPagos.setValue(selectedTlp00001.getRetUsuariosNoPagos());
        txtRetUsuariosNoPagos.setDisabled(false);
        txtTipoAportante.setValue(selectedTlp00001.getTipoAportante());
        txtTipoAportante.setDisabled(false);
        txtValorCheque.setValue(selectedTlp00001.getValorCheque());
        txtValorCheque.setDisabled(false);
        txtValorEfectivo.setValue(selectedTlp00001.getValorEfectivo());
        txtValorEfectivo.setDisabled(false);
        txtValorNomina.setValue(selectedTlp00001.getValorNomina());
        txtValorNomina.setDisabled(false);
        txtCodBanco_Tg000001.setValue(selectedTlp00001.getCodBanco_Tg000001());
        txtCodBanco_Tg000001.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTlp00001.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodTipodePlanillas_Tg000026.setValue(selectedTlp00001.getCodTipodePlanillas_Tg000026());
        txtCodTipodePlanillas_Tg000026.setDisabled(false);
        txtNumPlanilla.setValue(selectedTlp00001.getNumPlanilla());
        txtNumPlanilla.setDisabled(true);
        txtCodEmpresa.setValue(selectedTlp00001.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTlp00001 == null) && (entity == null)) {
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
            entity = new Tlp00001();

            Tlp00001Id id = new Tlp00001Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setAfp(FacesUtils.checkString(txtAfp));
            entity.setArp(FacesUtils.checkString(txtArp));
            entity.setCodBanco(FacesUtils.checkString(txtCodBanco));
            entity.setCodPeriodo(FacesUtils.checkString(txtCodPeriodo));
            entity.setCodPeriodoPeRiSc(FacesUtils.checkString(
                    txtCodPeriodoPeRiSc));
            entity.setCodigoArp(FacesUtils.checkString(txtCodigoArp));
            entity.setCodigoSucursal(FacesUtils.checkString(txtCodigoSucursal));
            entity.setConsecutivoPlani(FacesUtils.checkString(
                    txtConsecutivoPlani));
            entity.setCorreccionPlanilla(FacesUtils.checkString(
                    txtCorreccionPlanilla));
            entity.setEps(FacesUtils.checkString(txtEps));
            entity.setFechaCorteRetiro(FacesUtils.checkDate(txtFechaCorteRetiro));
            entity.setFechaGenera(FacesUtils.checkDate(txtFechaGenera));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    txtFechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(txtFechaPago));
            entity.setFechaPagoPlanillaCorrecion(FacesUtils.checkDate(
                    txtFechaPagoPlanillaCorrecion));
            entity.setFormaPresentacion(FacesUtils.checkString(
                    txtFormaPresentacion));
            entity.setHoraGenera(FacesUtils.checkDate(txtHoraGenera));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    txtHoraIngPagoSistema));
            entity.setId(id);
            entity.setIngUsuariosPagos(FacesUtils.checkString(
                    txtIngUsuariosPagos));
            entity.setMasIntdemora(FacesUtils.checkDouble(txtMasIntdemora));
            entity.setNumCheque(FacesUtils.checkString(txtNumCheque));
            entity.setNumCuentadelCheque(FacesUtils.checkString(
                    txtNumCuentadelCheque));
            entity.setNumPlanillaCorrecion(FacesUtils.checkString(
                    txtNumPlanillaCorrecion));
            entity.setNumeroMeses(FacesUtils.checkInteger(txtNumeroMeses));
            entity.setNumerodeCotizantes(FacesUtils.checkString(
                    txtNumerodeCotizantes));
            entity.setParafiscales(FacesUtils.checkString(txtParafiscales));
            entity.setRetUsuariosNoPagos(FacesUtils.checkString(
                    txtRetUsuariosNoPagos));
            entity.setTipoAportante(FacesUtils.checkString(txtTipoAportante));
            entity.setValorCheque(FacesUtils.checkDouble(txtValorCheque));
            entity.setValorEfectivo(FacesUtils.checkDouble(txtValorEfectivo));
            entity.setValorNomina(FacesUtils.checkString(txtValorNomina));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresa()));
            entity.setTg000001((FacesUtils.checkString(txtCodBanco_Tg000001) != null)
                ? businessDelegatorView.getTg000001(FacesUtils.checkString(
                        txtCodBanco_Tg000001)) : null);
            entity.setTg000026((FacesUtils.checkString(
                    txtCodTipodePlanillas_Tg000026) != null)
                ? businessDelegatorView.getTg000026(FacesUtils.checkString(
                        txtCodTipodePlanillas_Tg000026)) : null);
            businessDelegatorView.saveTlp00001(entity);
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
                Tlp00001Id id = new Tlp00001Id();
                id.setNumPlanilla(selectedTlp00001.getNumPlanilla());
                id.setCodEmpresa(selectedTlp00001.getCodEmpresa());
                entity = businessDelegatorView.getTlp00001(id);
            }

            entity.setAfp(FacesUtils.checkString(txtAfp));
            entity.setArp(FacesUtils.checkString(txtArp));
            entity.setCodBanco(FacesUtils.checkString(txtCodBanco));
            entity.setCodPeriodo(FacesUtils.checkString(txtCodPeriodo));
            entity.setCodPeriodoPeRiSc(FacesUtils.checkString(
                    txtCodPeriodoPeRiSc));
            entity.setCodigoArp(FacesUtils.checkString(txtCodigoArp));
            entity.setCodigoSucursal(FacesUtils.checkString(txtCodigoSucursal));
            entity.setConsecutivoPlani(FacesUtils.checkString(
                    txtConsecutivoPlani));
            entity.setCorreccionPlanilla(FacesUtils.checkString(
                    txtCorreccionPlanilla));
            entity.setEps(FacesUtils.checkString(txtEps));
            entity.setFechaCorteRetiro(FacesUtils.checkDate(txtFechaCorteRetiro));
            entity.setFechaGenera(FacesUtils.checkDate(txtFechaGenera));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    txtFechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(txtFechaPago));
            entity.setFechaPagoPlanillaCorrecion(FacesUtils.checkDate(
                    txtFechaPagoPlanillaCorrecion));
            entity.setFormaPresentacion(FacesUtils.checkString(
                    txtFormaPresentacion));
            entity.setHoraGenera(FacesUtils.checkDate(txtHoraGenera));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    txtHoraIngPagoSistema));
            entity.setIngUsuariosPagos(FacesUtils.checkString(
                    txtIngUsuariosPagos));
            entity.setMasIntdemora(FacesUtils.checkDouble(txtMasIntdemora));
            entity.setNumCheque(FacesUtils.checkString(txtNumCheque));
            entity.setNumCuentadelCheque(FacesUtils.checkString(
                    txtNumCuentadelCheque));
            entity.setNumPlanillaCorrecion(FacesUtils.checkString(
                    txtNumPlanillaCorrecion));
            entity.setNumeroMeses(FacesUtils.checkInteger(txtNumeroMeses));
            entity.setNumerodeCotizantes(FacesUtils.checkString(
                    txtNumerodeCotizantes));
            entity.setParafiscales(FacesUtils.checkString(txtParafiscales));
            entity.setRetUsuariosNoPagos(FacesUtils.checkString(
                    txtRetUsuariosNoPagos));
            entity.setTipoAportante(FacesUtils.checkString(txtTipoAportante));
            entity.setValorCheque(FacesUtils.checkDouble(txtValorCheque));
            entity.setValorEfectivo(FacesUtils.checkDouble(txtValorEfectivo));
            entity.setValorNomina(FacesUtils.checkString(txtValorNomina));
            entity.setTg000001((FacesUtils.checkString(txtCodBanco_Tg000001) != null)
                ? businessDelegatorView.getTg000001(FacesUtils.checkString(
                        txtCodBanco_Tg000001)) : null);
            entity.setTg000026((FacesUtils.checkString(
                    txtCodTipodePlanillas_Tg000026) != null)
                ? businessDelegatorView.getTg000026(FacesUtils.checkString(
                        txtCodTipodePlanillas_Tg000026)) : null);
            businessDelegatorView.updateTlp00001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTlp00001 = (Tlp00001DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTlp00001"));

            Tlp00001Id id = new Tlp00001Id();
            id.setNumPlanilla(selectedTlp00001.getNumPlanilla());
            id.setCodEmpresa(selectedTlp00001.getCodEmpresa());
            entity = businessDelegatorView.getTlp00001(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tlp00001Id id = new Tlp00001Id();
            id.setNumPlanilla((((txtNumPlanilla.getValue()) == null) ||
                (txtNumPlanilla.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtNumPlanilla));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTlp00001(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTlp00001(entity);
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
        String afp, String arp, String codBanco, String codPeriodo,
        String codPeriodoPeRiSc, String codigoArp, String codigoSucursal,
        String consecutivoPlani, String correccionPlanilla, String eps,
        Date fechaCorteRetiro, Date fechaGenera, Date fechaIngPagoSistema,
        Date fechaPago, Date fechaPagoPlanillaCorrecion,
        String formaPresentacion, Date horaGenera, Date horaIngPagoSistema,
        String ingUsuariosPagos, Double masIntdemora, String numCheque,
        String numCuentadelCheque, String numPlanillaCorrecion,
        Integer numeroMeses, String numerodeCotizantes, String parafiscales,
        String retUsuariosNoPagos, String tipoAportante, Double valorCheque,
        Double valorEfectivo, String valorNomina, String codBanco_Tg000001,
        String codEmpresa_Tg000003, String codTipodePlanillas_Tg000026)
        throws Exception {
        try {
            entity.setAfp(FacesUtils.checkString(afp));
            entity.setArp(FacesUtils.checkString(arp));
            entity.setCodBanco(FacesUtils.checkString(codBanco));
            entity.setCodPeriodo(FacesUtils.checkString(codPeriodo));
            entity.setCodPeriodoPeRiSc(FacesUtils.checkString(codPeriodoPeRiSc));
            entity.setCodigoArp(FacesUtils.checkString(codigoArp));
            entity.setCodigoSucursal(FacesUtils.checkString(codigoSucursal));
            entity.setConsecutivoPlani(FacesUtils.checkString(consecutivoPlani));
            entity.setCorreccionPlanilla(FacesUtils.checkString(
                    correccionPlanilla));
            entity.setEps(FacesUtils.checkString(eps));
            entity.setFechaCorteRetiro(FacesUtils.checkDate(fechaCorteRetiro));
            entity.setFechaGenera(FacesUtils.checkDate(fechaGenera));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    fechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(fechaPago));
            entity.setFechaPagoPlanillaCorrecion(FacesUtils.checkDate(
                    fechaPagoPlanillaCorrecion));
            entity.setFormaPresentacion(FacesUtils.checkString(
                    formaPresentacion));
            entity.setHoraGenera(FacesUtils.checkDate(horaGenera));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    horaIngPagoSistema));
            entity.setIngUsuariosPagos(FacesUtils.checkString(ingUsuariosPagos));
            entity.setMasIntdemora(FacesUtils.checkDouble(masIntdemora));
            entity.setNumCheque(FacesUtils.checkString(numCheque));
            entity.setNumCuentadelCheque(FacesUtils.checkString(
                    numCuentadelCheque));
            entity.setNumPlanillaCorrecion(FacesUtils.checkString(
                    numPlanillaCorrecion));
            entity.setNumeroMeses(FacesUtils.checkInteger(numeroMeses));
            entity.setNumerodeCotizantes(FacesUtils.checkString(
                    numerodeCotizantes));
            entity.setParafiscales(FacesUtils.checkString(parafiscales));
            entity.setRetUsuariosNoPagos(FacesUtils.checkString(
                    retUsuariosNoPagos));
            entity.setTipoAportante(FacesUtils.checkString(tipoAportante));
            entity.setValorCheque(FacesUtils.checkDouble(valorCheque));
            entity.setValorEfectivo(FacesUtils.checkDouble(valorEfectivo));
            entity.setValorNomina(FacesUtils.checkString(valorNomina));
            businessDelegatorView.updateTlp00001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tlp00001View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtAfp() {
        return txtAfp;
    }

    public void setTxtAfp(InputText txtAfp) {
        this.txtAfp = txtAfp;
    }

    public InputText getTxtArp() {
        return txtArp;
    }

    public void setTxtArp(InputText txtArp) {
        this.txtArp = txtArp;
    }

    public InputText getTxtCodBanco() {
        return txtCodBanco;
    }

    public void setTxtCodBanco(InputText txtCodBanco) {
        this.txtCodBanco = txtCodBanco;
    }

    public InputText getTxtCodPeriodo() {
        return txtCodPeriodo;
    }

    public void setTxtCodPeriodo(InputText txtCodPeriodo) {
        this.txtCodPeriodo = txtCodPeriodo;
    }

    public InputText getTxtCodPeriodoPeRiSc() {
        return txtCodPeriodoPeRiSc;
    }

    public void setTxtCodPeriodoPeRiSc(InputText txtCodPeriodoPeRiSc) {
        this.txtCodPeriodoPeRiSc = txtCodPeriodoPeRiSc;
    }

    public InputText getTxtCodigoArp() {
        return txtCodigoArp;
    }

    public void setTxtCodigoArp(InputText txtCodigoArp) {
        this.txtCodigoArp = txtCodigoArp;
    }

    public InputText getTxtCodigoSucursal() {
        return txtCodigoSucursal;
    }

    public void setTxtCodigoSucursal(InputText txtCodigoSucursal) {
        this.txtCodigoSucursal = txtCodigoSucursal;
    }

    public InputText getTxtConsecutivoPlani() {
        return txtConsecutivoPlani;
    }

    public void setTxtConsecutivoPlani(InputText txtConsecutivoPlani) {
        this.txtConsecutivoPlani = txtConsecutivoPlani;
    }

    public InputText getTxtCorreccionPlanilla() {
        return txtCorreccionPlanilla;
    }

    public void setTxtCorreccionPlanilla(InputText txtCorreccionPlanilla) {
        this.txtCorreccionPlanilla = txtCorreccionPlanilla;
    }

    public InputText getTxtEps() {
        return txtEps;
    }

    public void setTxtEps(InputText txtEps) {
        this.txtEps = txtEps;
    }

    public InputText getTxtFormaPresentacion() {
        return txtFormaPresentacion;
    }

    public void setTxtFormaPresentacion(InputText txtFormaPresentacion) {
        this.txtFormaPresentacion = txtFormaPresentacion;
    }

    public InputText getTxtIngUsuariosPagos() {
        return txtIngUsuariosPagos;
    }

    public void setTxtIngUsuariosPagos(InputText txtIngUsuariosPagos) {
        this.txtIngUsuariosPagos = txtIngUsuariosPagos;
    }

    public InputText getTxtMasIntdemora() {
        return txtMasIntdemora;
    }

    public void setTxtMasIntdemora(InputText txtMasIntdemora) {
        this.txtMasIntdemora = txtMasIntdemora;
    }

    public InputText getTxtNumCheque() {
        return txtNumCheque;
    }

    public void setTxtNumCheque(InputText txtNumCheque) {
        this.txtNumCheque = txtNumCheque;
    }

    public InputText getTxtNumCuentadelCheque() {
        return txtNumCuentadelCheque;
    }

    public void setTxtNumCuentadelCheque(InputText txtNumCuentadelCheque) {
        this.txtNumCuentadelCheque = txtNumCuentadelCheque;
    }

    public InputText getTxtNumPlanillaCorrecion() {
        return txtNumPlanillaCorrecion;
    }

    public void setTxtNumPlanillaCorrecion(InputText txtNumPlanillaCorrecion) {
        this.txtNumPlanillaCorrecion = txtNumPlanillaCorrecion;
    }

    public InputText getTxtNumeroMeses() {
        return txtNumeroMeses;
    }

    public void setTxtNumeroMeses(InputText txtNumeroMeses) {
        this.txtNumeroMeses = txtNumeroMeses;
    }

    public InputText getTxtNumerodeCotizantes() {
        return txtNumerodeCotizantes;
    }

    public void setTxtNumerodeCotizantes(InputText txtNumerodeCotizantes) {
        this.txtNumerodeCotizantes = txtNumerodeCotizantes;
    }

    public InputText getTxtParafiscales() {
        return txtParafiscales;
    }

    public void setTxtParafiscales(InputText txtParafiscales) {
        this.txtParafiscales = txtParafiscales;
    }

    public InputText getTxtRetUsuariosNoPagos() {
        return txtRetUsuariosNoPagos;
    }

    public void setTxtRetUsuariosNoPagos(InputText txtRetUsuariosNoPagos) {
        this.txtRetUsuariosNoPagos = txtRetUsuariosNoPagos;
    }

    public InputText getTxtTipoAportante() {
        return txtTipoAportante;
    }

    public void setTxtTipoAportante(InputText txtTipoAportante) {
        this.txtTipoAportante = txtTipoAportante;
    }

    public InputText getTxtValorCheque() {
        return txtValorCheque;
    }

    public void setTxtValorCheque(InputText txtValorCheque) {
        this.txtValorCheque = txtValorCheque;
    }

    public InputText getTxtValorEfectivo() {
        return txtValorEfectivo;
    }

    public void setTxtValorEfectivo(InputText txtValorEfectivo) {
        this.txtValorEfectivo = txtValorEfectivo;
    }

    public InputText getTxtValorNomina() {
        return txtValorNomina;
    }

    public void setTxtValorNomina(InputText txtValorNomina) {
        this.txtValorNomina = txtValorNomina;
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

    public InputText getTxtCodTipodePlanillas_Tg000026() {
        return txtCodTipodePlanillas_Tg000026;
    }

    public void setTxtCodTipodePlanillas_Tg000026(
        InputText txtCodTipodePlanillas_Tg000026) {
        this.txtCodTipodePlanillas_Tg000026 = txtCodTipodePlanillas_Tg000026;
    }

    public Calendar getTxtFechaCorteRetiro() {
        return txtFechaCorteRetiro;
    }

    public void setTxtFechaCorteRetiro(Calendar txtFechaCorteRetiro) {
        this.txtFechaCorteRetiro = txtFechaCorteRetiro;
    }

    public Calendar getTxtFechaGenera() {
        return txtFechaGenera;
    }

    public void setTxtFechaGenera(Calendar txtFechaGenera) {
        this.txtFechaGenera = txtFechaGenera;
    }

    public Calendar getTxtFechaIngPagoSistema() {
        return txtFechaIngPagoSistema;
    }

    public void setTxtFechaIngPagoSistema(Calendar txtFechaIngPagoSistema) {
        this.txtFechaIngPagoSistema = txtFechaIngPagoSistema;
    }

    public Calendar getTxtFechaPago() {
        return txtFechaPago;
    }

    public void setTxtFechaPago(Calendar txtFechaPago) {
        this.txtFechaPago = txtFechaPago;
    }

    public Calendar getTxtFechaPagoPlanillaCorrecion() {
        return txtFechaPagoPlanillaCorrecion;
    }

    public void setTxtFechaPagoPlanillaCorrecion(
        Calendar txtFechaPagoPlanillaCorrecion) {
        this.txtFechaPagoPlanillaCorrecion = txtFechaPagoPlanillaCorrecion;
    }

    public Calendar getTxtHoraGenera() {
        return txtHoraGenera;
    }

    public void setTxtHoraGenera(Calendar txtHoraGenera) {
        this.txtHoraGenera = txtHoraGenera;
    }

    public Calendar getTxtHoraIngPagoSistema() {
        return txtHoraIngPagoSistema;
    }

    public void setTxtHoraIngPagoSistema(Calendar txtHoraIngPagoSistema) {
        this.txtHoraIngPagoSistema = txtHoraIngPagoSistema;
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

    public List<Tlp00001DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTlp00001();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tlp00001DTO> tlp00001DTO) {
        this.data = tlp00001DTO;
    }

    public Tlp00001DTO getSelectedTlp00001() {
        return selectedTlp00001;
    }

    public void setSelectedTlp00001(Tlp00001DTO tlp00001) {
        this.selectedTlp00001 = tlp00001;
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
