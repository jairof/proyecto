package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tr000004DTO;

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
public class Tr000004View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tr000004View.class);
    private InputText txtAfiliacion;
    private InputText txtAfiliacionporcobrar;
    private InputText txtAfp;
    private InputText txtAnulado;
    private InputText txtArp;
    private InputText txtCaja;
    private InputText txtCodBancoCheque;
    private InputText txtCodBancoConsignacion;
    private InputText txtCodUsuario;
    private InputText txtCodigoPagoMes;
    private InputText txtComisionAsesor;
    private InputText txtCuota;
    private InputText txtCuotaporcobrar;
    private InputText txtDiasCotizadosAfp;
    private InputText txtDiasCotizadosArp;
    private InputText txtDiasCotizadosCaja;
    private InputText txtDiasCotizadosEps;
    private InputText txtEps;
    private InputText txtFacturado;
    private InputText txtFaltanteConsignacion;
    private InputText txtIbc;
    private InputText txtIdenEmpresa;
    private InputText txtIdentificacion;
    private InputText txtNumCheque;
    private InputText txtNumConsignacion;
    private InputText txtNumCuentaCobro;
    private InputText txtNumPersonas;
    private InputText txtOtros;
    private InputText txtPagoCheque;
    private InputText txtPagoConsignacion;
    private InputText txtPagoEfectivo;
    private InputText txtPagoRetiro;
    private InputText txtPagoRetiroporcobrar;
    private InputText txtPeriodo;
    private InputText txtPeriodoRp;
    private InputText txtPlanilladoAfp;
    private InputText txtPlanilladoArp;
    private InputText txtPlanilladoCaja;
    private InputText txtPlanilladoEps;
    private InputText txtPorcRiesgo;
    private InputText txtReactivacion;
    private InputText txtReactivacionporcobrar;
    private InputText txtRecibPrimeraAfp;
    private InputText txtRecibPrimeraArp;
    private InputText txtRecibPrimeraCaja;
    private InputText txtRecibPrimeraEps;
    private InputText txtReciboCuentaCobro;
    private InputText txtRiesgos;
    private InputText txtValAdmonAfprec;
    private InputText txtValAdmonRec;
    private InputText txtValorAfiliacion;
    private InputText txtValorCheque;
    private InputText txtValorConsignacion;
    private InputText txtValorDiasCotizadosAfp;
    private InputText txtValorDiasCotizadosArp;
    private InputText txtValorDiasCotizadosCaja;
    private InputText txtValorDiasCotizadosEps;
    private InputText txtValorEfectivo;
    private InputText txtValorFpsolidaridad;
    private InputText txtValorFpsubsistencia;
    private InputText txtValorIcbf;
    private InputText txtValorMensajeriaRecibo;
    private InputText txtValorMora;
    private InputText txtValorOtrosServicios;
    private InputText txtValorPagoMora;
    private InputText txtValorPagoUpc;
    private InputText txtValorReactivacion;
    private InputText txtValorSalario;
    private InputText txtValorSena;
    private InputText txtValorTotal;
    private InputText txtValorenletras;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodEps_Tp000003;
    private InputText txtCodArp_Tp000004;
    private InputText txtCodAfp_Tp000005;
    private InputText txtCodCaja_Tp000006;
    private InputText txtConsecutivo;
    private InputText txtCodEmpresa;
    private Calendar txtFechaIngPagoSistema;
    private Calendar txtFechaPago;
    private Calendar txtHoraIngPagoSistema;
    private Calendar txtHoraPago;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tr000004DTO> data;
    private Tr000004DTO selectedTr000004;
    private Tr000004 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tr000004View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTr000004 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTr000004 = null;

        if (txtAfiliacion != null) {
            txtAfiliacion.setValue(null);
            txtAfiliacion.setDisabled(true);
        }

        if (txtAfiliacionporcobrar != null) {
            txtAfiliacionporcobrar.setValue(null);
            txtAfiliacionporcobrar.setDisabled(true);
        }

        if (txtAfp != null) {
            txtAfp.setValue(null);
            txtAfp.setDisabled(true);
        }

        if (txtAnulado != null) {
            txtAnulado.setValue(null);
            txtAnulado.setDisabled(true);
        }

        if (txtArp != null) {
            txtArp.setValue(null);
            txtArp.setDisabled(true);
        }

        if (txtCaja != null) {
            txtCaja.setValue(null);
            txtCaja.setDisabled(true);
        }

        if (txtCodBancoCheque != null) {
            txtCodBancoCheque.setValue(null);
            txtCodBancoCheque.setDisabled(true);
        }

        if (txtCodBancoConsignacion != null) {
            txtCodBancoConsignacion.setValue(null);
            txtCodBancoConsignacion.setDisabled(true);
        }

        if (txtCodUsuario != null) {
            txtCodUsuario.setValue(null);
            txtCodUsuario.setDisabled(true);
        }

        if (txtCodigoPagoMes != null) {
            txtCodigoPagoMes.setValue(null);
            txtCodigoPagoMes.setDisabled(true);
        }

        if (txtComisionAsesor != null) {
            txtComisionAsesor.setValue(null);
            txtComisionAsesor.setDisabled(true);
        }

        if (txtCuota != null) {
            txtCuota.setValue(null);
            txtCuota.setDisabled(true);
        }

        if (txtCuotaporcobrar != null) {
            txtCuotaporcobrar.setValue(null);
            txtCuotaporcobrar.setDisabled(true);
        }

        if (txtDiasCotizadosAfp != null) {
            txtDiasCotizadosAfp.setValue(null);
            txtDiasCotizadosAfp.setDisabled(true);
        }

        if (txtDiasCotizadosArp != null) {
            txtDiasCotizadosArp.setValue(null);
            txtDiasCotizadosArp.setDisabled(true);
        }

        if (txtDiasCotizadosCaja != null) {
            txtDiasCotizadosCaja.setValue(null);
            txtDiasCotizadosCaja.setDisabled(true);
        }

        if (txtDiasCotizadosEps != null) {
            txtDiasCotizadosEps.setValue(null);
            txtDiasCotizadosEps.setDisabled(true);
        }

        if (txtEps != null) {
            txtEps.setValue(null);
            txtEps.setDisabled(true);
        }

        if (txtFacturado != null) {
            txtFacturado.setValue(null);
            txtFacturado.setDisabled(true);
        }

        if (txtFaltanteConsignacion != null) {
            txtFaltanteConsignacion.setValue(null);
            txtFaltanteConsignacion.setDisabled(true);
        }

        if (txtIbc != null) {
            txtIbc.setValue(null);
            txtIbc.setDisabled(true);
        }

        if (txtIdenEmpresa != null) {
            txtIdenEmpresa.setValue(null);
            txtIdenEmpresa.setDisabled(true);
        }

        if (txtIdentificacion != null) {
            txtIdentificacion.setValue(null);
            txtIdentificacion.setDisabled(true);
        }

        if (txtNumCheque != null) {
            txtNumCheque.setValue(null);
            txtNumCheque.setDisabled(true);
        }

        if (txtNumConsignacion != null) {
            txtNumConsignacion.setValue(null);
            txtNumConsignacion.setDisabled(true);
        }

        if (txtNumCuentaCobro != null) {
            txtNumCuentaCobro.setValue(null);
            txtNumCuentaCobro.setDisabled(true);
        }

        if (txtNumPersonas != null) {
            txtNumPersonas.setValue(null);
            txtNumPersonas.setDisabled(true);
        }

        if (txtOtros != null) {
            txtOtros.setValue(null);
            txtOtros.setDisabled(true);
        }

        if (txtPagoCheque != null) {
            txtPagoCheque.setValue(null);
            txtPagoCheque.setDisabled(true);
        }

        if (txtPagoConsignacion != null) {
            txtPagoConsignacion.setValue(null);
            txtPagoConsignacion.setDisabled(true);
        }

        if (txtPagoEfectivo != null) {
            txtPagoEfectivo.setValue(null);
            txtPagoEfectivo.setDisabled(true);
        }

        if (txtPagoRetiro != null) {
            txtPagoRetiro.setValue(null);
            txtPagoRetiro.setDisabled(true);
        }

        if (txtPagoRetiroporcobrar != null) {
            txtPagoRetiroporcobrar.setValue(null);
            txtPagoRetiroporcobrar.setDisabled(true);
        }

        if (txtPeriodo != null) {
            txtPeriodo.setValue(null);
            txtPeriodo.setDisabled(true);
        }

        if (txtPeriodoRp != null) {
            txtPeriodoRp.setValue(null);
            txtPeriodoRp.setDisabled(true);
        }

        if (txtPlanilladoAfp != null) {
            txtPlanilladoAfp.setValue(null);
            txtPlanilladoAfp.setDisabled(true);
        }

        if (txtPlanilladoArp != null) {
            txtPlanilladoArp.setValue(null);
            txtPlanilladoArp.setDisabled(true);
        }

        if (txtPlanilladoCaja != null) {
            txtPlanilladoCaja.setValue(null);
            txtPlanilladoCaja.setDisabled(true);
        }

        if (txtPlanilladoEps != null) {
            txtPlanilladoEps.setValue(null);
            txtPlanilladoEps.setDisabled(true);
        }

        if (txtPorcRiesgo != null) {
            txtPorcRiesgo.setValue(null);
            txtPorcRiesgo.setDisabled(true);
        }

        if (txtReactivacion != null) {
            txtReactivacion.setValue(null);
            txtReactivacion.setDisabled(true);
        }

        if (txtReactivacionporcobrar != null) {
            txtReactivacionporcobrar.setValue(null);
            txtReactivacionporcobrar.setDisabled(true);
        }

        if (txtRecibPrimeraAfp != null) {
            txtRecibPrimeraAfp.setValue(null);
            txtRecibPrimeraAfp.setDisabled(true);
        }

        if (txtRecibPrimeraArp != null) {
            txtRecibPrimeraArp.setValue(null);
            txtRecibPrimeraArp.setDisabled(true);
        }

        if (txtRecibPrimeraCaja != null) {
            txtRecibPrimeraCaja.setValue(null);
            txtRecibPrimeraCaja.setDisabled(true);
        }

        if (txtRecibPrimeraEps != null) {
            txtRecibPrimeraEps.setValue(null);
            txtRecibPrimeraEps.setDisabled(true);
        }

        if (txtReciboCuentaCobro != null) {
            txtReciboCuentaCobro.setValue(null);
            txtReciboCuentaCobro.setDisabled(true);
        }

        if (txtRiesgos != null) {
            txtRiesgos.setValue(null);
            txtRiesgos.setDisabled(true);
        }

        if (txtValAdmonAfprec != null) {
            txtValAdmonAfprec.setValue(null);
            txtValAdmonAfprec.setDisabled(true);
        }

        if (txtValAdmonRec != null) {
            txtValAdmonRec.setValue(null);
            txtValAdmonRec.setDisabled(true);
        }

        if (txtValorAfiliacion != null) {
            txtValorAfiliacion.setValue(null);
            txtValorAfiliacion.setDisabled(true);
        }

        if (txtValorCheque != null) {
            txtValorCheque.setValue(null);
            txtValorCheque.setDisabled(true);
        }

        if (txtValorConsignacion != null) {
            txtValorConsignacion.setValue(null);
            txtValorConsignacion.setDisabled(true);
        }

        if (txtValorDiasCotizadosAfp != null) {
            txtValorDiasCotizadosAfp.setValue(null);
            txtValorDiasCotizadosAfp.setDisabled(true);
        }

        if (txtValorDiasCotizadosArp != null) {
            txtValorDiasCotizadosArp.setValue(null);
            txtValorDiasCotizadosArp.setDisabled(true);
        }

        if (txtValorDiasCotizadosCaja != null) {
            txtValorDiasCotizadosCaja.setValue(null);
            txtValorDiasCotizadosCaja.setDisabled(true);
        }

        if (txtValorDiasCotizadosEps != null) {
            txtValorDiasCotizadosEps.setValue(null);
            txtValorDiasCotizadosEps.setDisabled(true);
        }

        if (txtValorEfectivo != null) {
            txtValorEfectivo.setValue(null);
            txtValorEfectivo.setDisabled(true);
        }

        if (txtValorFpsolidaridad != null) {
            txtValorFpsolidaridad.setValue(null);
            txtValorFpsolidaridad.setDisabled(true);
        }

        if (txtValorFpsubsistencia != null) {
            txtValorFpsubsistencia.setValue(null);
            txtValorFpsubsistencia.setDisabled(true);
        }

        if (txtValorIcbf != null) {
            txtValorIcbf.setValue(null);
            txtValorIcbf.setDisabled(true);
        }

        if (txtValorMensajeriaRecibo != null) {
            txtValorMensajeriaRecibo.setValue(null);
            txtValorMensajeriaRecibo.setDisabled(true);
        }

        if (txtValorMora != null) {
            txtValorMora.setValue(null);
            txtValorMora.setDisabled(true);
        }

        if (txtValorOtrosServicios != null) {
            txtValorOtrosServicios.setValue(null);
            txtValorOtrosServicios.setDisabled(true);
        }

        if (txtValorPagoMora != null) {
            txtValorPagoMora.setValue(null);
            txtValorPagoMora.setDisabled(true);
        }

        if (txtValorPagoUpc != null) {
            txtValorPagoUpc.setValue(null);
            txtValorPagoUpc.setDisabled(true);
        }

        if (txtValorReactivacion != null) {
            txtValorReactivacion.setValue(null);
            txtValorReactivacion.setDisabled(true);
        }

        if (txtValorSalario != null) {
            txtValorSalario.setValue(null);
            txtValorSalario.setDisabled(true);
        }

        if (txtValorSena != null) {
            txtValorSena.setValue(null);
            txtValorSena.setDisabled(true);
        }

        if (txtValorTotal != null) {
            txtValorTotal.setValue(null);
            txtValorTotal.setDisabled(true);
        }

        if (txtValorenletras != null) {
            txtValorenletras.setValue(null);
            txtValorenletras.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodEps_Tp000003 != null) {
            txtCodEps_Tp000003.setValue(null);
            txtCodEps_Tp000003.setDisabled(true);
        }

        if (txtCodArp_Tp000004 != null) {
            txtCodArp_Tp000004.setValue(null);
            txtCodArp_Tp000004.setDisabled(true);
        }

        if (txtCodAfp_Tp000005 != null) {
            txtCodAfp_Tp000005.setValue(null);
            txtCodAfp_Tp000005.setDisabled(true);
        }

        if (txtCodCaja_Tp000006 != null) {
            txtCodCaja_Tp000006.setValue(null);
            txtCodCaja_Tp000006.setDisabled(true);
        }

        if (txtFechaIngPagoSistema != null) {
            txtFechaIngPagoSistema.setValue(null);
            txtFechaIngPagoSistema.setDisabled(true);
        }

        if (txtFechaPago != null) {
            txtFechaPago.setValue(null);
            txtFechaPago.setDisabled(true);
        }

        if (txtHoraIngPagoSistema != null) {
            txtHoraIngPagoSistema.setValue(null);
            txtHoraIngPagoSistema.setDisabled(true);
        }

        if (txtHoraPago != null) {
            txtHoraPago.setValue(null);
            txtHoraPago.setDisabled(true);
        }

        if (txtConsecutivo != null) {
            txtConsecutivo.setValue(null);
            txtConsecutivo.setDisabled(false);
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

    public void listener_txtHoraIngPagoSistema() {
        Date inputDate = (Date) txtHoraIngPagoSistema.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtHoraPago() {
        Date inputDate = (Date) txtHoraPago.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtId() {
        try {
            Tr000004Id id = new Tr000004Id();
            id.setConsecutivo((((txtConsecutivo.getValue()) == null) ||
                (txtConsecutivo.getValue()).equals("")) ? null
                                                        : FacesUtils.checkInteger(
                    txtConsecutivo));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTr000004(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtAfiliacion.setDisabled(false);
            txtAfiliacionporcobrar.setDisabled(false);
            txtAfp.setDisabled(false);
            txtAnulado.setDisabled(false);
            txtArp.setDisabled(false);
            txtCaja.setDisabled(false);
            txtCodBancoCheque.setDisabled(false);
            txtCodBancoConsignacion.setDisabled(false);
            txtCodUsuario.setDisabled(false);
            txtCodigoPagoMes.setDisabled(false);
            txtComisionAsesor.setDisabled(false);
            txtCuota.setDisabled(false);
            txtCuotaporcobrar.setDisabled(false);
            txtDiasCotizadosAfp.setDisabled(false);
            txtDiasCotizadosArp.setDisabled(false);
            txtDiasCotizadosCaja.setDisabled(false);
            txtDiasCotizadosEps.setDisabled(false);
            txtEps.setDisabled(false);
            txtFacturado.setDisabled(false);
            txtFaltanteConsignacion.setDisabled(false);
            txtIbc.setDisabled(false);
            txtIdenEmpresa.setDisabled(false);
            txtIdentificacion.setDisabled(false);
            txtNumCheque.setDisabled(false);
            txtNumConsignacion.setDisabled(false);
            txtNumCuentaCobro.setDisabled(false);
            txtNumPersonas.setDisabled(false);
            txtOtros.setDisabled(false);
            txtPagoCheque.setDisabled(false);
            txtPagoConsignacion.setDisabled(false);
            txtPagoEfectivo.setDisabled(false);
            txtPagoRetiro.setDisabled(false);
            txtPagoRetiroporcobrar.setDisabled(false);
            txtPeriodo.setDisabled(false);
            txtPeriodoRp.setDisabled(false);
            txtPlanilladoAfp.setDisabled(false);
            txtPlanilladoArp.setDisabled(false);
            txtPlanilladoCaja.setDisabled(false);
            txtPlanilladoEps.setDisabled(false);
            txtPorcRiesgo.setDisabled(false);
            txtReactivacion.setDisabled(false);
            txtReactivacionporcobrar.setDisabled(false);
            txtRecibPrimeraAfp.setDisabled(false);
            txtRecibPrimeraArp.setDisabled(false);
            txtRecibPrimeraCaja.setDisabled(false);
            txtRecibPrimeraEps.setDisabled(false);
            txtReciboCuentaCobro.setDisabled(false);
            txtRiesgos.setDisabled(false);
            txtValAdmonAfprec.setDisabled(false);
            txtValAdmonRec.setDisabled(false);
            txtValorAfiliacion.setDisabled(false);
            txtValorCheque.setDisabled(false);
            txtValorConsignacion.setDisabled(false);
            txtValorDiasCotizadosAfp.setDisabled(false);
            txtValorDiasCotizadosArp.setDisabled(false);
            txtValorDiasCotizadosCaja.setDisabled(false);
            txtValorDiasCotizadosEps.setDisabled(false);
            txtValorEfectivo.setDisabled(false);
            txtValorFpsolidaridad.setDisabled(false);
            txtValorFpsubsistencia.setDisabled(false);
            txtValorIcbf.setDisabled(false);
            txtValorMensajeriaRecibo.setDisabled(false);
            txtValorMora.setDisabled(false);
            txtValorOtrosServicios.setDisabled(false);
            txtValorPagoMora.setDisabled(false);
            txtValorPagoUpc.setDisabled(false);
            txtValorReactivacion.setDisabled(false);
            txtValorSalario.setDisabled(false);
            txtValorSena.setDisabled(false);
            txtValorTotal.setDisabled(false);
            txtValorenletras.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodEps_Tp000003.setDisabled(false);
            txtCodArp_Tp000004.setDisabled(false);
            txtCodAfp_Tp000005.setDisabled(false);
            txtCodCaja_Tp000006.setDisabled(false);
            txtFechaIngPagoSistema.setDisabled(false);
            txtFechaPago.setDisabled(false);
            txtHoraIngPagoSistema.setDisabled(false);
            txtHoraPago.setDisabled(false);
            txtConsecutivo.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtAfiliacion.setValue(entity.getAfiliacion());
            txtAfiliacion.setDisabled(false);
            txtAfiliacionporcobrar.setValue(entity.getAfiliacionporcobrar());
            txtAfiliacionporcobrar.setDisabled(false);
            txtAfp.setValue(entity.getAfp());
            txtAfp.setDisabled(false);
            txtAnulado.setValue(entity.getAnulado());
            txtAnulado.setDisabled(false);
            txtArp.setValue(entity.getArp());
            txtArp.setDisabled(false);
            txtCaja.setValue(entity.getCaja());
            txtCaja.setDisabled(false);
            txtCodBancoCheque.setValue(entity.getCodBancoCheque());
            txtCodBancoCheque.setDisabled(false);
            txtCodBancoConsignacion.setValue(entity.getCodBancoConsignacion());
            txtCodBancoConsignacion.setDisabled(false);
            txtCodUsuario.setValue(entity.getCodUsuario());
            txtCodUsuario.setDisabled(false);
            txtCodigoPagoMes.setValue(entity.getCodigoPagoMes());
            txtCodigoPagoMes.setDisabled(false);
            txtComisionAsesor.setValue(entity.getComisionAsesor());
            txtComisionAsesor.setDisabled(false);
            txtCuota.setValue(entity.getCuota());
            txtCuota.setDisabled(false);
            txtCuotaporcobrar.setValue(entity.getCuotaporcobrar());
            txtCuotaporcobrar.setDisabled(false);
            txtDiasCotizadosAfp.setValue(entity.getDiasCotizadosAfp());
            txtDiasCotizadosAfp.setDisabled(false);
            txtDiasCotizadosArp.setValue(entity.getDiasCotizadosArp());
            txtDiasCotizadosArp.setDisabled(false);
            txtDiasCotizadosCaja.setValue(entity.getDiasCotizadosCaja());
            txtDiasCotizadosCaja.setDisabled(false);
            txtDiasCotizadosEps.setValue(entity.getDiasCotizadosEps());
            txtDiasCotizadosEps.setDisabled(false);
            txtEps.setValue(entity.getEps());
            txtEps.setDisabled(false);
            txtFacturado.setValue(entity.getFacturado());
            txtFacturado.setDisabled(false);
            txtFaltanteConsignacion.setValue(entity.getFaltanteConsignacion());
            txtFaltanteConsignacion.setDisabled(false);
            txtFechaIngPagoSistema.setValue(entity.getFechaIngPagoSistema());
            txtFechaIngPagoSistema.setDisabled(false);
            txtFechaPago.setValue(entity.getFechaPago());
            txtFechaPago.setDisabled(false);
            txtHoraIngPagoSistema.setValue(entity.getHoraIngPagoSistema());
            txtHoraIngPagoSistema.setDisabled(false);
            txtHoraPago.setValue(entity.getHoraPago());
            txtHoraPago.setDisabled(false);
            txtIbc.setValue(entity.getIbc());
            txtIbc.setDisabled(false);
            txtIdenEmpresa.setValue(entity.getIdenEmpresa());
            txtIdenEmpresa.setDisabled(false);
            txtIdentificacion.setValue(entity.getIdentificacion());
            txtIdentificacion.setDisabled(false);
            txtNumCheque.setValue(entity.getNumCheque());
            txtNumCheque.setDisabled(false);
            txtNumConsignacion.setValue(entity.getNumConsignacion());
            txtNumConsignacion.setDisabled(false);
            txtNumCuentaCobro.setValue(entity.getNumCuentaCobro());
            txtNumCuentaCobro.setDisabled(false);
            txtNumPersonas.setValue(entity.getNumPersonas());
            txtNumPersonas.setDisabled(false);
            txtOtros.setValue(entity.getOtros());
            txtOtros.setDisabled(false);
            txtPagoCheque.setValue(entity.getPagoCheque());
            txtPagoCheque.setDisabled(false);
            txtPagoConsignacion.setValue(entity.getPagoConsignacion());
            txtPagoConsignacion.setDisabled(false);
            txtPagoEfectivo.setValue(entity.getPagoEfectivo());
            txtPagoEfectivo.setDisabled(false);
            txtPagoRetiro.setValue(entity.getPagoRetiro());
            txtPagoRetiro.setDisabled(false);
            txtPagoRetiroporcobrar.setValue(entity.getPagoRetiroporcobrar());
            txtPagoRetiroporcobrar.setDisabled(false);
            txtPeriodo.setValue(entity.getPeriodo());
            txtPeriodo.setDisabled(false);
            txtPeriodoRp.setValue(entity.getPeriodoRp());
            txtPeriodoRp.setDisabled(false);
            txtPlanilladoAfp.setValue(entity.getPlanilladoAfp());
            txtPlanilladoAfp.setDisabled(false);
            txtPlanilladoArp.setValue(entity.getPlanilladoArp());
            txtPlanilladoArp.setDisabled(false);
            txtPlanilladoCaja.setValue(entity.getPlanilladoCaja());
            txtPlanilladoCaja.setDisabled(false);
            txtPlanilladoEps.setValue(entity.getPlanilladoEps());
            txtPlanilladoEps.setDisabled(false);
            txtPorcRiesgo.setValue(entity.getPorcRiesgo());
            txtPorcRiesgo.setDisabled(false);
            txtReactivacion.setValue(entity.getReactivacion());
            txtReactivacion.setDisabled(false);
            txtReactivacionporcobrar.setValue(entity.getReactivacionporcobrar());
            txtReactivacionporcobrar.setDisabled(false);
            txtRecibPrimeraAfp.setValue(entity.getRecibPrimeraAfp());
            txtRecibPrimeraAfp.setDisabled(false);
            txtRecibPrimeraArp.setValue(entity.getRecibPrimeraArp());
            txtRecibPrimeraArp.setDisabled(false);
            txtRecibPrimeraCaja.setValue(entity.getRecibPrimeraCaja());
            txtRecibPrimeraCaja.setDisabled(false);
            txtRecibPrimeraEps.setValue(entity.getRecibPrimeraEps());
            txtRecibPrimeraEps.setDisabled(false);
            txtReciboCuentaCobro.setValue(entity.getReciboCuentaCobro());
            txtReciboCuentaCobro.setDisabled(false);
            txtRiesgos.setValue(entity.getRiesgos());
            txtRiesgos.setDisabled(false);
            txtValAdmonAfprec.setValue(entity.getValAdmonAfprec());
            txtValAdmonAfprec.setDisabled(false);
            txtValAdmonRec.setValue(entity.getValAdmonRec());
            txtValAdmonRec.setDisabled(false);
            txtValorAfiliacion.setValue(entity.getValorAfiliacion());
            txtValorAfiliacion.setDisabled(false);
            txtValorCheque.setValue(entity.getValorCheque());
            txtValorCheque.setDisabled(false);
            txtValorConsignacion.setValue(entity.getValorConsignacion());
            txtValorConsignacion.setDisabled(false);
            txtValorDiasCotizadosAfp.setValue(entity.getValorDiasCotizadosAfp());
            txtValorDiasCotizadosAfp.setDisabled(false);
            txtValorDiasCotizadosArp.setValue(entity.getValorDiasCotizadosArp());
            txtValorDiasCotizadosArp.setDisabled(false);
            txtValorDiasCotizadosCaja.setValue(entity.getValorDiasCotizadosCaja());
            txtValorDiasCotizadosCaja.setDisabled(false);
            txtValorDiasCotizadosEps.setValue(entity.getValorDiasCotizadosEps());
            txtValorDiasCotizadosEps.setDisabled(false);
            txtValorEfectivo.setValue(entity.getValorEfectivo());
            txtValorEfectivo.setDisabled(false);
            txtValorFpsolidaridad.setValue(entity.getValorFpsolidaridad());
            txtValorFpsolidaridad.setDisabled(false);
            txtValorFpsubsistencia.setValue(entity.getValorFpsubsistencia());
            txtValorFpsubsistencia.setDisabled(false);
            txtValorIcbf.setValue(entity.getValorIcbf());
            txtValorIcbf.setDisabled(false);
            txtValorMensajeriaRecibo.setValue(entity.getValorMensajeriaRecibo());
            txtValorMensajeriaRecibo.setDisabled(false);
            txtValorMora.setValue(entity.getValorMora());
            txtValorMora.setDisabled(false);
            txtValorOtrosServicios.setValue(entity.getValorOtrosServicios());
            txtValorOtrosServicios.setDisabled(false);
            txtValorPagoMora.setValue(entity.getValorPagoMora());
            txtValorPagoMora.setDisabled(false);
            txtValorPagoUpc.setValue(entity.getValorPagoUpc());
            txtValorPagoUpc.setDisabled(false);
            txtValorReactivacion.setValue(entity.getValorReactivacion());
            txtValorReactivacion.setDisabled(false);
            txtValorSalario.setValue(entity.getValorSalario());
            txtValorSalario.setDisabled(false);
            txtValorSena.setValue(entity.getValorSena());
            txtValorSena.setDisabled(false);
            txtValorTotal.setValue(entity.getValorTotal());
            txtValorTotal.setDisabled(false);
            txtValorenletras.setValue(entity.getValorenletras());
            txtValorenletras.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodEps_Tp000003.setValue(entity.getTp000003().getCodEps());
            txtCodEps_Tp000003.setDisabled(false);
            txtCodArp_Tp000004.setValue(entity.getTp000004().getCodArp());
            txtCodArp_Tp000004.setDisabled(false);
            txtCodAfp_Tp000005.setValue(entity.getTp000005().getCodAfp());
            txtCodAfp_Tp000005.setDisabled(false);
            txtCodCaja_Tp000006.setValue(entity.getTp000006().getCodCaja());
            txtCodCaja_Tp000006.setDisabled(false);
            txtConsecutivo.setValue(entity.getId().getConsecutivo());
            txtConsecutivo.setDisabled(true);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTr000004 = (Tr000004DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTr000004"));
        txtAfiliacion.setValue(selectedTr000004.getAfiliacion());
        txtAfiliacion.setDisabled(false);
        txtAfiliacionporcobrar.setValue(selectedTr000004.getAfiliacionporcobrar());
        txtAfiliacionporcobrar.setDisabled(false);
        txtAfp.setValue(selectedTr000004.getAfp());
        txtAfp.setDisabled(false);
        txtAnulado.setValue(selectedTr000004.getAnulado());
        txtAnulado.setDisabled(false);
        txtArp.setValue(selectedTr000004.getArp());
        txtArp.setDisabled(false);
        txtCaja.setValue(selectedTr000004.getCaja());
        txtCaja.setDisabled(false);
        txtCodBancoCheque.setValue(selectedTr000004.getCodBancoCheque());
        txtCodBancoCheque.setDisabled(false);
        txtCodBancoConsignacion.setValue(selectedTr000004.getCodBancoConsignacion());
        txtCodBancoConsignacion.setDisabled(false);
        txtCodUsuario.setValue(selectedTr000004.getCodUsuario());
        txtCodUsuario.setDisabled(false);
        txtCodigoPagoMes.setValue(selectedTr000004.getCodigoPagoMes());
        txtCodigoPagoMes.setDisabled(false);
        txtComisionAsesor.setValue(selectedTr000004.getComisionAsesor());
        txtComisionAsesor.setDisabled(false);
        txtCuota.setValue(selectedTr000004.getCuota());
        txtCuota.setDisabled(false);
        txtCuotaporcobrar.setValue(selectedTr000004.getCuotaporcobrar());
        txtCuotaporcobrar.setDisabled(false);
        txtDiasCotizadosAfp.setValue(selectedTr000004.getDiasCotizadosAfp());
        txtDiasCotizadosAfp.setDisabled(false);
        txtDiasCotizadosArp.setValue(selectedTr000004.getDiasCotizadosArp());
        txtDiasCotizadosArp.setDisabled(false);
        txtDiasCotizadosCaja.setValue(selectedTr000004.getDiasCotizadosCaja());
        txtDiasCotizadosCaja.setDisabled(false);
        txtDiasCotizadosEps.setValue(selectedTr000004.getDiasCotizadosEps());
        txtDiasCotizadosEps.setDisabled(false);
        txtEps.setValue(selectedTr000004.getEps());
        txtEps.setDisabled(false);
        txtFacturado.setValue(selectedTr000004.getFacturado());
        txtFacturado.setDisabled(false);
        txtFaltanteConsignacion.setValue(selectedTr000004.getFaltanteConsignacion());
        txtFaltanteConsignacion.setDisabled(false);
        txtFechaIngPagoSistema.setValue(selectedTr000004.getFechaIngPagoSistema());
        txtFechaIngPagoSistema.setDisabled(false);
        txtFechaPago.setValue(selectedTr000004.getFechaPago());
        txtFechaPago.setDisabled(false);
        txtHoraIngPagoSistema.setValue(selectedTr000004.getHoraIngPagoSistema());
        txtHoraIngPagoSistema.setDisabled(false);
        txtHoraPago.setValue(selectedTr000004.getHoraPago());
        txtHoraPago.setDisabled(false);
        txtIbc.setValue(selectedTr000004.getIbc());
        txtIbc.setDisabled(false);
        txtIdenEmpresa.setValue(selectedTr000004.getIdenEmpresa());
        txtIdenEmpresa.setDisabled(false);
        txtIdentificacion.setValue(selectedTr000004.getIdentificacion());
        txtIdentificacion.setDisabled(false);
        txtNumCheque.setValue(selectedTr000004.getNumCheque());
        txtNumCheque.setDisabled(false);
        txtNumConsignacion.setValue(selectedTr000004.getNumConsignacion());
        txtNumConsignacion.setDisabled(false);
        txtNumCuentaCobro.setValue(selectedTr000004.getNumCuentaCobro());
        txtNumCuentaCobro.setDisabled(false);
        txtNumPersonas.setValue(selectedTr000004.getNumPersonas());
        txtNumPersonas.setDisabled(false);
        txtOtros.setValue(selectedTr000004.getOtros());
        txtOtros.setDisabled(false);
        txtPagoCheque.setValue(selectedTr000004.getPagoCheque());
        txtPagoCheque.setDisabled(false);
        txtPagoConsignacion.setValue(selectedTr000004.getPagoConsignacion());
        txtPagoConsignacion.setDisabled(false);
        txtPagoEfectivo.setValue(selectedTr000004.getPagoEfectivo());
        txtPagoEfectivo.setDisabled(false);
        txtPagoRetiro.setValue(selectedTr000004.getPagoRetiro());
        txtPagoRetiro.setDisabled(false);
        txtPagoRetiroporcobrar.setValue(selectedTr000004.getPagoRetiroporcobrar());
        txtPagoRetiroporcobrar.setDisabled(false);
        txtPeriodo.setValue(selectedTr000004.getPeriodo());
        txtPeriodo.setDisabled(false);
        txtPeriodoRp.setValue(selectedTr000004.getPeriodoRp());
        txtPeriodoRp.setDisabled(false);
        txtPlanilladoAfp.setValue(selectedTr000004.getPlanilladoAfp());
        txtPlanilladoAfp.setDisabled(false);
        txtPlanilladoArp.setValue(selectedTr000004.getPlanilladoArp());
        txtPlanilladoArp.setDisabled(false);
        txtPlanilladoCaja.setValue(selectedTr000004.getPlanilladoCaja());
        txtPlanilladoCaja.setDisabled(false);
        txtPlanilladoEps.setValue(selectedTr000004.getPlanilladoEps());
        txtPlanilladoEps.setDisabled(false);
        txtPorcRiesgo.setValue(selectedTr000004.getPorcRiesgo());
        txtPorcRiesgo.setDisabled(false);
        txtReactivacion.setValue(selectedTr000004.getReactivacion());
        txtReactivacion.setDisabled(false);
        txtReactivacionporcobrar.setValue(selectedTr000004.getReactivacionporcobrar());
        txtReactivacionporcobrar.setDisabled(false);
        txtRecibPrimeraAfp.setValue(selectedTr000004.getRecibPrimeraAfp());
        txtRecibPrimeraAfp.setDisabled(false);
        txtRecibPrimeraArp.setValue(selectedTr000004.getRecibPrimeraArp());
        txtRecibPrimeraArp.setDisabled(false);
        txtRecibPrimeraCaja.setValue(selectedTr000004.getRecibPrimeraCaja());
        txtRecibPrimeraCaja.setDisabled(false);
        txtRecibPrimeraEps.setValue(selectedTr000004.getRecibPrimeraEps());
        txtRecibPrimeraEps.setDisabled(false);
        txtReciboCuentaCobro.setValue(selectedTr000004.getReciboCuentaCobro());
        txtReciboCuentaCobro.setDisabled(false);
        txtRiesgos.setValue(selectedTr000004.getRiesgos());
        txtRiesgos.setDisabled(false);
        txtValAdmonAfprec.setValue(selectedTr000004.getValAdmonAfprec());
        txtValAdmonAfprec.setDisabled(false);
        txtValAdmonRec.setValue(selectedTr000004.getValAdmonRec());
        txtValAdmonRec.setDisabled(false);
        txtValorAfiliacion.setValue(selectedTr000004.getValorAfiliacion());
        txtValorAfiliacion.setDisabled(false);
        txtValorCheque.setValue(selectedTr000004.getValorCheque());
        txtValorCheque.setDisabled(false);
        txtValorConsignacion.setValue(selectedTr000004.getValorConsignacion());
        txtValorConsignacion.setDisabled(false);
        txtValorDiasCotizadosAfp.setValue(selectedTr000004.getValorDiasCotizadosAfp());
        txtValorDiasCotizadosAfp.setDisabled(false);
        txtValorDiasCotizadosArp.setValue(selectedTr000004.getValorDiasCotizadosArp());
        txtValorDiasCotizadosArp.setDisabled(false);
        txtValorDiasCotizadosCaja.setValue(selectedTr000004.getValorDiasCotizadosCaja());
        txtValorDiasCotizadosCaja.setDisabled(false);
        txtValorDiasCotizadosEps.setValue(selectedTr000004.getValorDiasCotizadosEps());
        txtValorDiasCotizadosEps.setDisabled(false);
        txtValorEfectivo.setValue(selectedTr000004.getValorEfectivo());
        txtValorEfectivo.setDisabled(false);
        txtValorFpsolidaridad.setValue(selectedTr000004.getValorFpsolidaridad());
        txtValorFpsolidaridad.setDisabled(false);
        txtValorFpsubsistencia.setValue(selectedTr000004.getValorFpsubsistencia());
        txtValorFpsubsistencia.setDisabled(false);
        txtValorIcbf.setValue(selectedTr000004.getValorIcbf());
        txtValorIcbf.setDisabled(false);
        txtValorMensajeriaRecibo.setValue(selectedTr000004.getValorMensajeriaRecibo());
        txtValorMensajeriaRecibo.setDisabled(false);
        txtValorMora.setValue(selectedTr000004.getValorMora());
        txtValorMora.setDisabled(false);
        txtValorOtrosServicios.setValue(selectedTr000004.getValorOtrosServicios());
        txtValorOtrosServicios.setDisabled(false);
        txtValorPagoMora.setValue(selectedTr000004.getValorPagoMora());
        txtValorPagoMora.setDisabled(false);
        txtValorPagoUpc.setValue(selectedTr000004.getValorPagoUpc());
        txtValorPagoUpc.setDisabled(false);
        txtValorReactivacion.setValue(selectedTr000004.getValorReactivacion());
        txtValorReactivacion.setDisabled(false);
        txtValorSalario.setValue(selectedTr000004.getValorSalario());
        txtValorSalario.setDisabled(false);
        txtValorSena.setValue(selectedTr000004.getValorSena());
        txtValorSena.setDisabled(false);
        txtValorTotal.setValue(selectedTr000004.getValorTotal());
        txtValorTotal.setDisabled(false);
        txtValorenletras.setValue(selectedTr000004.getValorenletras());
        txtValorenletras.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTr000004.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodEps_Tp000003.setValue(selectedTr000004.getCodEps_Tp000003());
        txtCodEps_Tp000003.setDisabled(false);
        txtCodArp_Tp000004.setValue(selectedTr000004.getCodArp_Tp000004());
        txtCodArp_Tp000004.setDisabled(false);
        txtCodAfp_Tp000005.setValue(selectedTr000004.getCodAfp_Tp000005());
        txtCodAfp_Tp000005.setDisabled(false);
        txtCodCaja_Tp000006.setValue(selectedTr000004.getCodCaja_Tp000006());
        txtCodCaja_Tp000006.setDisabled(false);
        txtConsecutivo.setValue(selectedTr000004.getConsecutivo());
        txtConsecutivo.setDisabled(true);
        txtCodEmpresa.setValue(selectedTr000004.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTr000004 == null) && (entity == null)) {
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
            entity = new Tr000004();

            Tr000004Id id = new Tr000004Id();
            id.setConsecutivo((((txtConsecutivo.getValue()) == null) ||
                (txtConsecutivo.getValue()).equals("")) ? null
                                                        : FacesUtils.checkInteger(
                    txtConsecutivo));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setAfiliacion(FacesUtils.checkString(txtAfiliacion));
            entity.setAfiliacionporcobrar(FacesUtils.checkString(
                    txtAfiliacionporcobrar));
            entity.setAfp(FacesUtils.checkString(txtAfp));
            entity.setAnulado(FacesUtils.checkString(txtAnulado));
            entity.setArp(FacesUtils.checkString(txtArp));
            entity.setCaja(FacesUtils.checkString(txtCaja));
            entity.setCodBancoCheque(FacesUtils.checkString(txtCodBancoCheque));
            entity.setCodBancoConsignacion(FacesUtils.checkString(
                    txtCodBancoConsignacion));
            entity.setCodUsuario(FacesUtils.checkString(txtCodUsuario));
            entity.setCodigoPagoMes(FacesUtils.checkInteger(txtCodigoPagoMes));
            entity.setComisionAsesor(FacesUtils.checkDouble(txtComisionAsesor));
            entity.setCuota(FacesUtils.checkString(txtCuota));
            entity.setCuotaporcobrar(FacesUtils.checkString(txtCuotaporcobrar));
            entity.setDiasCotizadosAfp(FacesUtils.checkInteger(
                    txtDiasCotizadosAfp));
            entity.setDiasCotizadosArp(FacesUtils.checkInteger(
                    txtDiasCotizadosArp));
            entity.setDiasCotizadosCaja(FacesUtils.checkInteger(
                    txtDiasCotizadosCaja));
            entity.setDiasCotizadosEps(FacesUtils.checkInteger(
                    txtDiasCotizadosEps));
            entity.setEps(FacesUtils.checkString(txtEps));
            entity.setFacturado(FacesUtils.checkString(txtFacturado));
            entity.setFaltanteConsignacion(FacesUtils.checkDouble(
                    txtFaltanteConsignacion));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    txtFechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(txtFechaPago));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    txtHoraIngPagoSistema));
            entity.setHoraPago(FacesUtils.checkDate(txtHoraPago));
            entity.setIbc(FacesUtils.checkDouble(txtIbc));
            entity.setId(id);
            entity.setIdenEmpresa(FacesUtils.checkString(txtIdenEmpresa));
            entity.setIdentificacion(FacesUtils.checkString(txtIdentificacion));
            entity.setNumCheque(FacesUtils.checkString(txtNumCheque));
            entity.setNumConsignacion(FacesUtils.checkString(txtNumConsignacion));
            entity.setNumCuentaCobro(FacesUtils.checkString(txtNumCuentaCobro));
            entity.setNumPersonas(FacesUtils.checkString(txtNumPersonas));
            entity.setOtros(FacesUtils.checkString(txtOtros));
            entity.setPagoCheque(FacesUtils.checkString(txtPagoCheque));
            entity.setPagoConsignacion(FacesUtils.checkString(
                    txtPagoConsignacion));
            entity.setPagoEfectivo(FacesUtils.checkString(txtPagoEfectivo));
            entity.setPagoRetiro(FacesUtils.checkString(txtPagoRetiro));
            entity.setPagoRetiroporcobrar(FacesUtils.checkString(
                    txtPagoRetiroporcobrar));
            entity.setPeriodo(FacesUtils.checkString(txtPeriodo));
            entity.setPeriodoRp(FacesUtils.checkString(txtPeriodoRp));
            entity.setPlanilladoAfp(FacesUtils.checkString(txtPlanilladoAfp));
            entity.setPlanilladoArp(FacesUtils.checkString(txtPlanilladoArp));
            entity.setPlanilladoCaja(FacesUtils.checkString(txtPlanilladoCaja));
            entity.setPlanilladoEps(FacesUtils.checkString(txtPlanilladoEps));
            entity.setPorcRiesgo(FacesUtils.checkDouble(txtPorcRiesgo));
            entity.setReactivacion(FacesUtils.checkString(txtReactivacion));
            entity.setReactivacionporcobrar(FacesUtils.checkString(
                    txtReactivacionporcobrar));
            entity.setRecibPrimeraAfp(FacesUtils.checkString(txtRecibPrimeraAfp));
            entity.setRecibPrimeraArp(FacesUtils.checkString(txtRecibPrimeraArp));
            entity.setRecibPrimeraCaja(FacesUtils.checkString(
                    txtRecibPrimeraCaja));
            entity.setRecibPrimeraEps(FacesUtils.checkString(txtRecibPrimeraEps));
            entity.setReciboCuentaCobro(FacesUtils.checkString(
                    txtReciboCuentaCobro));
            entity.setRiesgos(FacesUtils.checkInteger(txtRiesgos));
            entity.setValAdmonAfprec(FacesUtils.checkDouble(txtValAdmonAfprec));
            entity.setValAdmonRec(FacesUtils.checkDouble(txtValAdmonRec));
            entity.setValorAfiliacion(FacesUtils.checkDouble(txtValorAfiliacion));
            entity.setValorCheque(FacesUtils.checkDouble(txtValorCheque));
            entity.setValorConsignacion(FacesUtils.checkDouble(
                    txtValorConsignacion));
            entity.setValorDiasCotizadosAfp(FacesUtils.checkDouble(
                    txtValorDiasCotizadosAfp));
            entity.setValorDiasCotizadosArp(FacesUtils.checkDouble(
                    txtValorDiasCotizadosArp));
            entity.setValorDiasCotizadosCaja(FacesUtils.checkDouble(
                    txtValorDiasCotizadosCaja));
            entity.setValorDiasCotizadosEps(FacesUtils.checkDouble(
                    txtValorDiasCotizadosEps));
            entity.setValorEfectivo(FacesUtils.checkDouble(txtValorEfectivo));
            entity.setValorFpsolidaridad(FacesUtils.checkDouble(
                    txtValorFpsolidaridad));
            entity.setValorFpsubsistencia(FacesUtils.checkDouble(
                    txtValorFpsubsistencia));
            entity.setValorIcbf(FacesUtils.checkDouble(txtValorIcbf));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    txtValorMensajeriaRecibo));
            entity.setValorMora(FacesUtils.checkDouble(txtValorMora));
            entity.setValorOtrosServicios(FacesUtils.checkDouble(
                    txtValorOtrosServicios));
            entity.setValorPagoMora(FacesUtils.checkDouble(txtValorPagoMora));
            entity.setValorPagoUpc(FacesUtils.checkDouble(txtValorPagoUpc));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    txtValorReactivacion));
            entity.setValorSalario(FacesUtils.checkDouble(txtValorSalario));
            entity.setValorSena(FacesUtils.checkDouble(txtValorSena));
            entity.setValorTotal(FacesUtils.checkDouble(txtValorTotal));
            entity.setValorenletras(FacesUtils.checkString(txtValorenletras));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresa()));
            entity.setTp000003((FacesUtils.checkString(txtCodEps_Tp000003) != null)
                ? businessDelegatorView.getTp000003(FacesUtils.checkString(
                        txtCodEps_Tp000003)) : null);
            entity.setTp000004((FacesUtils.checkString(txtCodArp_Tp000004) != null)
                ? businessDelegatorView.getTp000004(FacesUtils.checkString(
                        txtCodArp_Tp000004)) : null);
            entity.setTp000005((FacesUtils.checkString(txtCodAfp_Tp000005) != null)
                ? businessDelegatorView.getTp000005(FacesUtils.checkString(
                        txtCodAfp_Tp000005)) : null);
            entity.setTp000006((FacesUtils.checkString(txtCodCaja_Tp000006) != null)
                ? businessDelegatorView.getTp000006(FacesUtils.checkString(
                        txtCodCaja_Tp000006)) : null);
            businessDelegatorView.saveTr000004(entity);
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
                Tr000004Id id = new Tr000004Id();
                id.setConsecutivo(selectedTr000004.getConsecutivo());
                id.setCodEmpresa(selectedTr000004.getCodEmpresa());
                entity = businessDelegatorView.getTr000004(id);
            }

            entity.setAfiliacion(FacesUtils.checkString(txtAfiliacion));
            entity.setAfiliacionporcobrar(FacesUtils.checkString(
                    txtAfiliacionporcobrar));
            entity.setAfp(FacesUtils.checkString(txtAfp));
            entity.setAnulado(FacesUtils.checkString(txtAnulado));
            entity.setArp(FacesUtils.checkString(txtArp));
            entity.setCaja(FacesUtils.checkString(txtCaja));
            entity.setCodBancoCheque(FacesUtils.checkString(txtCodBancoCheque));
            entity.setCodBancoConsignacion(FacesUtils.checkString(
                    txtCodBancoConsignacion));
            entity.setCodUsuario(FacesUtils.checkString(txtCodUsuario));
            entity.setCodigoPagoMes(FacesUtils.checkInteger(txtCodigoPagoMes));
            entity.setComisionAsesor(FacesUtils.checkDouble(txtComisionAsesor));
            entity.setCuota(FacesUtils.checkString(txtCuota));
            entity.setCuotaporcobrar(FacesUtils.checkString(txtCuotaporcobrar));
            entity.setDiasCotizadosAfp(FacesUtils.checkInteger(
                    txtDiasCotizadosAfp));
            entity.setDiasCotizadosArp(FacesUtils.checkInteger(
                    txtDiasCotizadosArp));
            entity.setDiasCotizadosCaja(FacesUtils.checkInteger(
                    txtDiasCotizadosCaja));
            entity.setDiasCotizadosEps(FacesUtils.checkInteger(
                    txtDiasCotizadosEps));
            entity.setEps(FacesUtils.checkString(txtEps));
            entity.setFacturado(FacesUtils.checkString(txtFacturado));
            entity.setFaltanteConsignacion(FacesUtils.checkDouble(
                    txtFaltanteConsignacion));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    txtFechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(txtFechaPago));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    txtHoraIngPagoSistema));
            entity.setHoraPago(FacesUtils.checkDate(txtHoraPago));
            entity.setIbc(FacesUtils.checkDouble(txtIbc));
            entity.setIdenEmpresa(FacesUtils.checkString(txtIdenEmpresa));
            entity.setIdentificacion(FacesUtils.checkString(txtIdentificacion));
            entity.setNumCheque(FacesUtils.checkString(txtNumCheque));
            entity.setNumConsignacion(FacesUtils.checkString(txtNumConsignacion));
            entity.setNumCuentaCobro(FacesUtils.checkString(txtNumCuentaCobro));
            entity.setNumPersonas(FacesUtils.checkString(txtNumPersonas));
            entity.setOtros(FacesUtils.checkString(txtOtros));
            entity.setPagoCheque(FacesUtils.checkString(txtPagoCheque));
            entity.setPagoConsignacion(FacesUtils.checkString(
                    txtPagoConsignacion));
            entity.setPagoEfectivo(FacesUtils.checkString(txtPagoEfectivo));
            entity.setPagoRetiro(FacesUtils.checkString(txtPagoRetiro));
            entity.setPagoRetiroporcobrar(FacesUtils.checkString(
                    txtPagoRetiroporcobrar));
            entity.setPeriodo(FacesUtils.checkString(txtPeriodo));
            entity.setPeriodoRp(FacesUtils.checkString(txtPeriodoRp));
            entity.setPlanilladoAfp(FacesUtils.checkString(txtPlanilladoAfp));
            entity.setPlanilladoArp(FacesUtils.checkString(txtPlanilladoArp));
            entity.setPlanilladoCaja(FacesUtils.checkString(txtPlanilladoCaja));
            entity.setPlanilladoEps(FacesUtils.checkString(txtPlanilladoEps));
            entity.setPorcRiesgo(FacesUtils.checkDouble(txtPorcRiesgo));
            entity.setReactivacion(FacesUtils.checkString(txtReactivacion));
            entity.setReactivacionporcobrar(FacesUtils.checkString(
                    txtReactivacionporcobrar));
            entity.setRecibPrimeraAfp(FacesUtils.checkString(txtRecibPrimeraAfp));
            entity.setRecibPrimeraArp(FacesUtils.checkString(txtRecibPrimeraArp));
            entity.setRecibPrimeraCaja(FacesUtils.checkString(
                    txtRecibPrimeraCaja));
            entity.setRecibPrimeraEps(FacesUtils.checkString(txtRecibPrimeraEps));
            entity.setReciboCuentaCobro(FacesUtils.checkString(
                    txtReciboCuentaCobro));
            entity.setRiesgos(FacesUtils.checkInteger(txtRiesgos));
            entity.setValAdmonAfprec(FacesUtils.checkDouble(txtValAdmonAfprec));
            entity.setValAdmonRec(FacesUtils.checkDouble(txtValAdmonRec));
            entity.setValorAfiliacion(FacesUtils.checkDouble(txtValorAfiliacion));
            entity.setValorCheque(FacesUtils.checkDouble(txtValorCheque));
            entity.setValorConsignacion(FacesUtils.checkDouble(
                    txtValorConsignacion));
            entity.setValorDiasCotizadosAfp(FacesUtils.checkDouble(
                    txtValorDiasCotizadosAfp));
            entity.setValorDiasCotizadosArp(FacesUtils.checkDouble(
                    txtValorDiasCotizadosArp));
            entity.setValorDiasCotizadosCaja(FacesUtils.checkDouble(
                    txtValorDiasCotizadosCaja));
            entity.setValorDiasCotizadosEps(FacesUtils.checkDouble(
                    txtValorDiasCotizadosEps));
            entity.setValorEfectivo(FacesUtils.checkDouble(txtValorEfectivo));
            entity.setValorFpsolidaridad(FacesUtils.checkDouble(
                    txtValorFpsolidaridad));
            entity.setValorFpsubsistencia(FacesUtils.checkDouble(
                    txtValorFpsubsistencia));
            entity.setValorIcbf(FacesUtils.checkDouble(txtValorIcbf));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    txtValorMensajeriaRecibo));
            entity.setValorMora(FacesUtils.checkDouble(txtValorMora));
            entity.setValorOtrosServicios(FacesUtils.checkDouble(
                    txtValorOtrosServicios));
            entity.setValorPagoMora(FacesUtils.checkDouble(txtValorPagoMora));
            entity.setValorPagoUpc(FacesUtils.checkDouble(txtValorPagoUpc));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    txtValorReactivacion));
            entity.setValorSalario(FacesUtils.checkDouble(txtValorSalario));
            entity.setValorSena(FacesUtils.checkDouble(txtValorSena));
            entity.setValorTotal(FacesUtils.checkDouble(txtValorTotal));
            entity.setValorenletras(FacesUtils.checkString(txtValorenletras));
            entity.setTp000003((FacesUtils.checkString(txtCodEps_Tp000003) != null)
                ? businessDelegatorView.getTp000003(FacesUtils.checkString(
                        txtCodEps_Tp000003)) : null);
            entity.setTp000004((FacesUtils.checkString(txtCodArp_Tp000004) != null)
                ? businessDelegatorView.getTp000004(FacesUtils.checkString(
                        txtCodArp_Tp000004)) : null);
            entity.setTp000005((FacesUtils.checkString(txtCodAfp_Tp000005) != null)
                ? businessDelegatorView.getTp000005(FacesUtils.checkString(
                        txtCodAfp_Tp000005)) : null);
            entity.setTp000006((FacesUtils.checkString(txtCodCaja_Tp000006) != null)
                ? businessDelegatorView.getTp000006(FacesUtils.checkString(
                        txtCodCaja_Tp000006)) : null);
            businessDelegatorView.updateTr000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTr000004 = (Tr000004DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTr000004"));

            Tr000004Id id = new Tr000004Id();
            id.setConsecutivo(selectedTr000004.getConsecutivo());
            id.setCodEmpresa(selectedTr000004.getCodEmpresa());
            entity = businessDelegatorView.getTr000004(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tr000004Id id = new Tr000004Id();
            id.setConsecutivo((((txtConsecutivo.getValue()) == null) ||
                (txtConsecutivo.getValue()).equals("")) ? null
                                                        : FacesUtils.checkInteger(
                    txtConsecutivo));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTr000004(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTr000004(entity);
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

    public String action_modifyWitDTO(Integer consecutivo, String codEmpresa,
        String afiliacion, String afiliacionporcobrar, String afp,
        String anulado, String arp, String caja, String codBancoCheque,
        String codBancoConsignacion, String codUsuario, Integer codigoPagoMes,
        Double comisionAsesor, String cuota, String cuotaporcobrar,
        Integer diasCotizadosAfp, Integer diasCotizadosArp,
        Integer diasCotizadosCaja, Integer diasCotizadosEps, String eps,
        String facturado, Double faltanteConsignacion,
        Date fechaIngPagoSistema, Date fechaPago, Date horaIngPagoSistema,
        Date horaPago, Double ibc, String idenEmpresa, String identificacion,
        String numCheque, String numConsignacion, String numCuentaCobro,
        String numPersonas, String otros, String pagoCheque,
        String pagoConsignacion, String pagoEfectivo, String pagoRetiro,
        String pagoRetiroporcobrar, String periodo, String periodoRp,
        String planilladoAfp, String planilladoArp, String planilladoCaja,
        String planilladoEps, Double porcRiesgo, String reactivacion,
        String reactivacionporcobrar, String recibPrimeraAfp,
        String recibPrimeraArp, String recibPrimeraCaja,
        String recibPrimeraEps, String reciboCuentaCobro, Integer riesgos,
        Double valAdmonAfprec, Double valAdmonRec, Double valorAfiliacion,
        Double valorCheque, Double valorConsignacion,
        Double valorDiasCotizadosAfp, Double valorDiasCotizadosArp,
        Double valorDiasCotizadosCaja, Double valorDiasCotizadosEps,
        Double valorEfectivo, Double valorFpsolidaridad,
        Double valorFpsubsistencia, Double valorIcbf,
        Double valorMensajeriaRecibo, Double valorMora,
        Double valorOtrosServicios, Double valorPagoMora, Double valorPagoUpc,
        Double valorReactivacion, Double valorSalario, Double valorSena,
        Double valorTotal, String valorenletras, String codEmpresa_Tg000003,
        String codEps_Tp000003, String codArp_Tp000004, String codAfp_Tp000005,
        String codCaja_Tp000006) throws Exception {
        try {
            entity.setAfiliacion(FacesUtils.checkString(afiliacion));
            entity.setAfiliacionporcobrar(FacesUtils.checkString(
                    afiliacionporcobrar));
            entity.setAfp(FacesUtils.checkString(afp));
            entity.setAnulado(FacesUtils.checkString(anulado));
            entity.setArp(FacesUtils.checkString(arp));
            entity.setCaja(FacesUtils.checkString(caja));
            entity.setCodBancoCheque(FacesUtils.checkString(codBancoCheque));
            entity.setCodBancoConsignacion(FacesUtils.checkString(
                    codBancoConsignacion));
            entity.setCodUsuario(FacesUtils.checkString(codUsuario));
            entity.setCodigoPagoMes(FacesUtils.checkInteger(codigoPagoMes));
            entity.setComisionAsesor(FacesUtils.checkDouble(comisionAsesor));
            entity.setCuota(FacesUtils.checkString(cuota));
            entity.setCuotaporcobrar(FacesUtils.checkString(cuotaporcobrar));
            entity.setDiasCotizadosAfp(FacesUtils.checkInteger(diasCotizadosAfp));
            entity.setDiasCotizadosArp(FacesUtils.checkInteger(diasCotizadosArp));
            entity.setDiasCotizadosCaja(FacesUtils.checkInteger(
                    diasCotizadosCaja));
            entity.setDiasCotizadosEps(FacesUtils.checkInteger(diasCotizadosEps));
            entity.setEps(FacesUtils.checkString(eps));
            entity.setFacturado(FacesUtils.checkString(facturado));
            entity.setFaltanteConsignacion(FacesUtils.checkDouble(
                    faltanteConsignacion));
            entity.setFechaIngPagoSistema(FacesUtils.checkDate(
                    fechaIngPagoSistema));
            entity.setFechaPago(FacesUtils.checkDate(fechaPago));
            entity.setHoraIngPagoSistema(FacesUtils.checkDate(
                    horaIngPagoSistema));
            entity.setHoraPago(FacesUtils.checkDate(horaPago));
            entity.setIbc(FacesUtils.checkDouble(ibc));
            entity.setIdenEmpresa(FacesUtils.checkString(idenEmpresa));
            entity.setIdentificacion(FacesUtils.checkString(identificacion));
            entity.setNumCheque(FacesUtils.checkString(numCheque));
            entity.setNumConsignacion(FacesUtils.checkString(numConsignacion));
            entity.setNumCuentaCobro(FacesUtils.checkString(numCuentaCobro));
            entity.setNumPersonas(FacesUtils.checkString(numPersonas));
            entity.setOtros(FacesUtils.checkString(otros));
            entity.setPagoCheque(FacesUtils.checkString(pagoCheque));
            entity.setPagoConsignacion(FacesUtils.checkString(pagoConsignacion));
            entity.setPagoEfectivo(FacesUtils.checkString(pagoEfectivo));
            entity.setPagoRetiro(FacesUtils.checkString(pagoRetiro));
            entity.setPagoRetiroporcobrar(FacesUtils.checkString(
                    pagoRetiroporcobrar));
            entity.setPeriodo(FacesUtils.checkString(periodo));
            entity.setPeriodoRp(FacesUtils.checkString(periodoRp));
            entity.setPlanilladoAfp(FacesUtils.checkString(planilladoAfp));
            entity.setPlanilladoArp(FacesUtils.checkString(planilladoArp));
            entity.setPlanilladoCaja(FacesUtils.checkString(planilladoCaja));
            entity.setPlanilladoEps(FacesUtils.checkString(planilladoEps));
            entity.setPorcRiesgo(FacesUtils.checkDouble(porcRiesgo));
            entity.setReactivacion(FacesUtils.checkString(reactivacion));
            entity.setReactivacionporcobrar(FacesUtils.checkString(
                    reactivacionporcobrar));
            entity.setRecibPrimeraAfp(FacesUtils.checkString(recibPrimeraAfp));
            entity.setRecibPrimeraArp(FacesUtils.checkString(recibPrimeraArp));
            entity.setRecibPrimeraCaja(FacesUtils.checkString(recibPrimeraCaja));
            entity.setRecibPrimeraEps(FacesUtils.checkString(recibPrimeraEps));
            entity.setReciboCuentaCobro(FacesUtils.checkString(
                    reciboCuentaCobro));
            entity.setRiesgos(FacesUtils.checkInteger(riesgos));
            entity.setValAdmonAfprec(FacesUtils.checkDouble(valAdmonAfprec));
            entity.setValAdmonRec(FacesUtils.checkDouble(valAdmonRec));
            entity.setValorAfiliacion(FacesUtils.checkDouble(valorAfiliacion));
            entity.setValorCheque(FacesUtils.checkDouble(valorCheque));
            entity.setValorConsignacion(FacesUtils.checkDouble(
                    valorConsignacion));
            entity.setValorDiasCotizadosAfp(FacesUtils.checkDouble(
                    valorDiasCotizadosAfp));
            entity.setValorDiasCotizadosArp(FacesUtils.checkDouble(
                    valorDiasCotizadosArp));
            entity.setValorDiasCotizadosCaja(FacesUtils.checkDouble(
                    valorDiasCotizadosCaja));
            entity.setValorDiasCotizadosEps(FacesUtils.checkDouble(
                    valorDiasCotizadosEps));
            entity.setValorEfectivo(FacesUtils.checkDouble(valorEfectivo));
            entity.setValorFpsolidaridad(FacesUtils.checkDouble(
                    valorFpsolidaridad));
            entity.setValorFpsubsistencia(FacesUtils.checkDouble(
                    valorFpsubsistencia));
            entity.setValorIcbf(FacesUtils.checkDouble(valorIcbf));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    valorMensajeriaRecibo));
            entity.setValorMora(FacesUtils.checkDouble(valorMora));
            entity.setValorOtrosServicios(FacesUtils.checkDouble(
                    valorOtrosServicios));
            entity.setValorPagoMora(FacesUtils.checkDouble(valorPagoMora));
            entity.setValorPagoUpc(FacesUtils.checkDouble(valorPagoUpc));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    valorReactivacion));
            entity.setValorSalario(FacesUtils.checkDouble(valorSalario));
            entity.setValorSena(FacesUtils.checkDouble(valorSena));
            entity.setValorTotal(FacesUtils.checkDouble(valorTotal));
            entity.setValorenletras(FacesUtils.checkString(valorenletras));
            businessDelegatorView.updateTr000004(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tr000004View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtAfiliacion() {
        return txtAfiliacion;
    }

    public void setTxtAfiliacion(InputText txtAfiliacion) {
        this.txtAfiliacion = txtAfiliacion;
    }

    public InputText getTxtAfiliacionporcobrar() {
        return txtAfiliacionporcobrar;
    }

    public void setTxtAfiliacionporcobrar(InputText txtAfiliacionporcobrar) {
        this.txtAfiliacionporcobrar = txtAfiliacionporcobrar;
    }

    public InputText getTxtAfp() {
        return txtAfp;
    }

    public void setTxtAfp(InputText txtAfp) {
        this.txtAfp = txtAfp;
    }

    public InputText getTxtAnulado() {
        return txtAnulado;
    }

    public void setTxtAnulado(InputText txtAnulado) {
        this.txtAnulado = txtAnulado;
    }

    public InputText getTxtArp() {
        return txtArp;
    }

    public void setTxtArp(InputText txtArp) {
        this.txtArp = txtArp;
    }

    public InputText getTxtCaja() {
        return txtCaja;
    }

    public void setTxtCaja(InputText txtCaja) {
        this.txtCaja = txtCaja;
    }

    public InputText getTxtCodBancoCheque() {
        return txtCodBancoCheque;
    }

    public void setTxtCodBancoCheque(InputText txtCodBancoCheque) {
        this.txtCodBancoCheque = txtCodBancoCheque;
    }

    public InputText getTxtCodBancoConsignacion() {
        return txtCodBancoConsignacion;
    }

    public void setTxtCodBancoConsignacion(InputText txtCodBancoConsignacion) {
        this.txtCodBancoConsignacion = txtCodBancoConsignacion;
    }

    public InputText getTxtCodUsuario() {
        return txtCodUsuario;
    }

    public void setTxtCodUsuario(InputText txtCodUsuario) {
        this.txtCodUsuario = txtCodUsuario;
    }

    public InputText getTxtCodigoPagoMes() {
        return txtCodigoPagoMes;
    }

    public void setTxtCodigoPagoMes(InputText txtCodigoPagoMes) {
        this.txtCodigoPagoMes = txtCodigoPagoMes;
    }

    public InputText getTxtComisionAsesor() {
        return txtComisionAsesor;
    }

    public void setTxtComisionAsesor(InputText txtComisionAsesor) {
        this.txtComisionAsesor = txtComisionAsesor;
    }

    public InputText getTxtCuota() {
        return txtCuota;
    }

    public void setTxtCuota(InputText txtCuota) {
        this.txtCuota = txtCuota;
    }

    public InputText getTxtCuotaporcobrar() {
        return txtCuotaporcobrar;
    }

    public void setTxtCuotaporcobrar(InputText txtCuotaporcobrar) {
        this.txtCuotaporcobrar = txtCuotaporcobrar;
    }

    public InputText getTxtDiasCotizadosAfp() {
        return txtDiasCotizadosAfp;
    }

    public void setTxtDiasCotizadosAfp(InputText txtDiasCotizadosAfp) {
        this.txtDiasCotizadosAfp = txtDiasCotizadosAfp;
    }

    public InputText getTxtDiasCotizadosArp() {
        return txtDiasCotizadosArp;
    }

    public void setTxtDiasCotizadosArp(InputText txtDiasCotizadosArp) {
        this.txtDiasCotizadosArp = txtDiasCotizadosArp;
    }

    public InputText getTxtDiasCotizadosCaja() {
        return txtDiasCotizadosCaja;
    }

    public void setTxtDiasCotizadosCaja(InputText txtDiasCotizadosCaja) {
        this.txtDiasCotizadosCaja = txtDiasCotizadosCaja;
    }

    public InputText getTxtDiasCotizadosEps() {
        return txtDiasCotizadosEps;
    }

    public void setTxtDiasCotizadosEps(InputText txtDiasCotizadosEps) {
        this.txtDiasCotizadosEps = txtDiasCotizadosEps;
    }

    public InputText getTxtEps() {
        return txtEps;
    }

    public void setTxtEps(InputText txtEps) {
        this.txtEps = txtEps;
    }

    public InputText getTxtFacturado() {
        return txtFacturado;
    }

    public void setTxtFacturado(InputText txtFacturado) {
        this.txtFacturado = txtFacturado;
    }

    public InputText getTxtFaltanteConsignacion() {
        return txtFaltanteConsignacion;
    }

    public void setTxtFaltanteConsignacion(InputText txtFaltanteConsignacion) {
        this.txtFaltanteConsignacion = txtFaltanteConsignacion;
    }

    public InputText getTxtIbc() {
        return txtIbc;
    }

    public void setTxtIbc(InputText txtIbc) {
        this.txtIbc = txtIbc;
    }

    public InputText getTxtIdenEmpresa() {
        return txtIdenEmpresa;
    }

    public void setTxtIdenEmpresa(InputText txtIdenEmpresa) {
        this.txtIdenEmpresa = txtIdenEmpresa;
    }

    public InputText getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(InputText txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public InputText getTxtNumCheque() {
        return txtNumCheque;
    }

    public void setTxtNumCheque(InputText txtNumCheque) {
        this.txtNumCheque = txtNumCheque;
    }

    public InputText getTxtNumConsignacion() {
        return txtNumConsignacion;
    }

    public void setTxtNumConsignacion(InputText txtNumConsignacion) {
        this.txtNumConsignacion = txtNumConsignacion;
    }

    public InputText getTxtNumCuentaCobro() {
        return txtNumCuentaCobro;
    }

    public void setTxtNumCuentaCobro(InputText txtNumCuentaCobro) {
        this.txtNumCuentaCobro = txtNumCuentaCobro;
    }

    public InputText getTxtNumPersonas() {
        return txtNumPersonas;
    }

    public void setTxtNumPersonas(InputText txtNumPersonas) {
        this.txtNumPersonas = txtNumPersonas;
    }

    public InputText getTxtOtros() {
        return txtOtros;
    }

    public void setTxtOtros(InputText txtOtros) {
        this.txtOtros = txtOtros;
    }

    public InputText getTxtPagoCheque() {
        return txtPagoCheque;
    }

    public void setTxtPagoCheque(InputText txtPagoCheque) {
        this.txtPagoCheque = txtPagoCheque;
    }

    public InputText getTxtPagoConsignacion() {
        return txtPagoConsignacion;
    }

    public void setTxtPagoConsignacion(InputText txtPagoConsignacion) {
        this.txtPagoConsignacion = txtPagoConsignacion;
    }

    public InputText getTxtPagoEfectivo() {
        return txtPagoEfectivo;
    }

    public void setTxtPagoEfectivo(InputText txtPagoEfectivo) {
        this.txtPagoEfectivo = txtPagoEfectivo;
    }

    public InputText getTxtPagoRetiro() {
        return txtPagoRetiro;
    }

    public void setTxtPagoRetiro(InputText txtPagoRetiro) {
        this.txtPagoRetiro = txtPagoRetiro;
    }

    public InputText getTxtPagoRetiroporcobrar() {
        return txtPagoRetiroporcobrar;
    }

    public void setTxtPagoRetiroporcobrar(InputText txtPagoRetiroporcobrar) {
        this.txtPagoRetiroporcobrar = txtPagoRetiroporcobrar;
    }

    public InputText getTxtPeriodo() {
        return txtPeriodo;
    }

    public void setTxtPeriodo(InputText txtPeriodo) {
        this.txtPeriodo = txtPeriodo;
    }

    public InputText getTxtPeriodoRp() {
        return txtPeriodoRp;
    }

    public void setTxtPeriodoRp(InputText txtPeriodoRp) {
        this.txtPeriodoRp = txtPeriodoRp;
    }

    public InputText getTxtPlanilladoAfp() {
        return txtPlanilladoAfp;
    }

    public void setTxtPlanilladoAfp(InputText txtPlanilladoAfp) {
        this.txtPlanilladoAfp = txtPlanilladoAfp;
    }

    public InputText getTxtPlanilladoArp() {
        return txtPlanilladoArp;
    }

    public void setTxtPlanilladoArp(InputText txtPlanilladoArp) {
        this.txtPlanilladoArp = txtPlanilladoArp;
    }

    public InputText getTxtPlanilladoCaja() {
        return txtPlanilladoCaja;
    }

    public void setTxtPlanilladoCaja(InputText txtPlanilladoCaja) {
        this.txtPlanilladoCaja = txtPlanilladoCaja;
    }

    public InputText getTxtPlanilladoEps() {
        return txtPlanilladoEps;
    }

    public void setTxtPlanilladoEps(InputText txtPlanilladoEps) {
        this.txtPlanilladoEps = txtPlanilladoEps;
    }

    public InputText getTxtPorcRiesgo() {
        return txtPorcRiesgo;
    }

    public void setTxtPorcRiesgo(InputText txtPorcRiesgo) {
        this.txtPorcRiesgo = txtPorcRiesgo;
    }

    public InputText getTxtReactivacion() {
        return txtReactivacion;
    }

    public void setTxtReactivacion(InputText txtReactivacion) {
        this.txtReactivacion = txtReactivacion;
    }

    public InputText getTxtReactivacionporcobrar() {
        return txtReactivacionporcobrar;
    }

    public void setTxtReactivacionporcobrar(InputText txtReactivacionporcobrar) {
        this.txtReactivacionporcobrar = txtReactivacionporcobrar;
    }

    public InputText getTxtRecibPrimeraAfp() {
        return txtRecibPrimeraAfp;
    }

    public void setTxtRecibPrimeraAfp(InputText txtRecibPrimeraAfp) {
        this.txtRecibPrimeraAfp = txtRecibPrimeraAfp;
    }

    public InputText getTxtRecibPrimeraArp() {
        return txtRecibPrimeraArp;
    }

    public void setTxtRecibPrimeraArp(InputText txtRecibPrimeraArp) {
        this.txtRecibPrimeraArp = txtRecibPrimeraArp;
    }

    public InputText getTxtRecibPrimeraCaja() {
        return txtRecibPrimeraCaja;
    }

    public void setTxtRecibPrimeraCaja(InputText txtRecibPrimeraCaja) {
        this.txtRecibPrimeraCaja = txtRecibPrimeraCaja;
    }

    public InputText getTxtRecibPrimeraEps() {
        return txtRecibPrimeraEps;
    }

    public void setTxtRecibPrimeraEps(InputText txtRecibPrimeraEps) {
        this.txtRecibPrimeraEps = txtRecibPrimeraEps;
    }

    public InputText getTxtReciboCuentaCobro() {
        return txtReciboCuentaCobro;
    }

    public void setTxtReciboCuentaCobro(InputText txtReciboCuentaCobro) {
        this.txtReciboCuentaCobro = txtReciboCuentaCobro;
    }

    public InputText getTxtRiesgos() {
        return txtRiesgos;
    }

    public void setTxtRiesgos(InputText txtRiesgos) {
        this.txtRiesgos = txtRiesgos;
    }

    public InputText getTxtValAdmonAfprec() {
        return txtValAdmonAfprec;
    }

    public void setTxtValAdmonAfprec(InputText txtValAdmonAfprec) {
        this.txtValAdmonAfprec = txtValAdmonAfprec;
    }

    public InputText getTxtValAdmonRec() {
        return txtValAdmonRec;
    }

    public void setTxtValAdmonRec(InputText txtValAdmonRec) {
        this.txtValAdmonRec = txtValAdmonRec;
    }

    public InputText getTxtValorAfiliacion() {
        return txtValorAfiliacion;
    }

    public void setTxtValorAfiliacion(InputText txtValorAfiliacion) {
        this.txtValorAfiliacion = txtValorAfiliacion;
    }

    public InputText getTxtValorCheque() {
        return txtValorCheque;
    }

    public void setTxtValorCheque(InputText txtValorCheque) {
        this.txtValorCheque = txtValorCheque;
    }

    public InputText getTxtValorConsignacion() {
        return txtValorConsignacion;
    }

    public void setTxtValorConsignacion(InputText txtValorConsignacion) {
        this.txtValorConsignacion = txtValorConsignacion;
    }

    public InputText getTxtValorDiasCotizadosAfp() {
        return txtValorDiasCotizadosAfp;
    }

    public void setTxtValorDiasCotizadosAfp(InputText txtValorDiasCotizadosAfp) {
        this.txtValorDiasCotizadosAfp = txtValorDiasCotizadosAfp;
    }

    public InputText getTxtValorDiasCotizadosArp() {
        return txtValorDiasCotizadosArp;
    }

    public void setTxtValorDiasCotizadosArp(InputText txtValorDiasCotizadosArp) {
        this.txtValorDiasCotizadosArp = txtValorDiasCotizadosArp;
    }

    public InputText getTxtValorDiasCotizadosCaja() {
        return txtValorDiasCotizadosCaja;
    }

    public void setTxtValorDiasCotizadosCaja(
        InputText txtValorDiasCotizadosCaja) {
        this.txtValorDiasCotizadosCaja = txtValorDiasCotizadosCaja;
    }

    public InputText getTxtValorDiasCotizadosEps() {
        return txtValorDiasCotizadosEps;
    }

    public void setTxtValorDiasCotizadosEps(InputText txtValorDiasCotizadosEps) {
        this.txtValorDiasCotizadosEps = txtValorDiasCotizadosEps;
    }

    public InputText getTxtValorEfectivo() {
        return txtValorEfectivo;
    }

    public void setTxtValorEfectivo(InputText txtValorEfectivo) {
        this.txtValorEfectivo = txtValorEfectivo;
    }

    public InputText getTxtValorFpsolidaridad() {
        return txtValorFpsolidaridad;
    }

    public void setTxtValorFpsolidaridad(InputText txtValorFpsolidaridad) {
        this.txtValorFpsolidaridad = txtValorFpsolidaridad;
    }

    public InputText getTxtValorFpsubsistencia() {
        return txtValorFpsubsistencia;
    }

    public void setTxtValorFpsubsistencia(InputText txtValorFpsubsistencia) {
        this.txtValorFpsubsistencia = txtValorFpsubsistencia;
    }

    public InputText getTxtValorIcbf() {
        return txtValorIcbf;
    }

    public void setTxtValorIcbf(InputText txtValorIcbf) {
        this.txtValorIcbf = txtValorIcbf;
    }

    public InputText getTxtValorMensajeriaRecibo() {
        return txtValorMensajeriaRecibo;
    }

    public void setTxtValorMensajeriaRecibo(InputText txtValorMensajeriaRecibo) {
        this.txtValorMensajeriaRecibo = txtValorMensajeriaRecibo;
    }

    public InputText getTxtValorMora() {
        return txtValorMora;
    }

    public void setTxtValorMora(InputText txtValorMora) {
        this.txtValorMora = txtValorMora;
    }

    public InputText getTxtValorOtrosServicios() {
        return txtValorOtrosServicios;
    }

    public void setTxtValorOtrosServicios(InputText txtValorOtrosServicios) {
        this.txtValorOtrosServicios = txtValorOtrosServicios;
    }

    public InputText getTxtValorPagoMora() {
        return txtValorPagoMora;
    }

    public void setTxtValorPagoMora(InputText txtValorPagoMora) {
        this.txtValorPagoMora = txtValorPagoMora;
    }

    public InputText getTxtValorPagoUpc() {
        return txtValorPagoUpc;
    }

    public void setTxtValorPagoUpc(InputText txtValorPagoUpc) {
        this.txtValorPagoUpc = txtValorPagoUpc;
    }

    public InputText getTxtValorReactivacion() {
        return txtValorReactivacion;
    }

    public void setTxtValorReactivacion(InputText txtValorReactivacion) {
        this.txtValorReactivacion = txtValorReactivacion;
    }

    public InputText getTxtValorSalario() {
        return txtValorSalario;
    }

    public void setTxtValorSalario(InputText txtValorSalario) {
        this.txtValorSalario = txtValorSalario;
    }

    public InputText getTxtValorSena() {
        return txtValorSena;
    }

    public void setTxtValorSena(InputText txtValorSena) {
        this.txtValorSena = txtValorSena;
    }

    public InputText getTxtValorTotal() {
        return txtValorTotal;
    }

    public void setTxtValorTotal(InputText txtValorTotal) {
        this.txtValorTotal = txtValorTotal;
    }

    public InputText getTxtValorenletras() {
        return txtValorenletras;
    }

    public void setTxtValorenletras(InputText txtValorenletras) {
        this.txtValorenletras = txtValorenletras;
    }

    public InputText getTxtCodEmpresa_Tg000003() {
        return txtCodEmpresa_Tg000003;
    }

    public void setTxtCodEmpresa_Tg000003(InputText txtCodEmpresa_Tg000003) {
        this.txtCodEmpresa_Tg000003 = txtCodEmpresa_Tg000003;
    }

    public InputText getTxtCodEps_Tp000003() {
        return txtCodEps_Tp000003;
    }

    public void setTxtCodEps_Tp000003(InputText txtCodEps_Tp000003) {
        this.txtCodEps_Tp000003 = txtCodEps_Tp000003;
    }

    public InputText getTxtCodArp_Tp000004() {
        return txtCodArp_Tp000004;
    }

    public void setTxtCodArp_Tp000004(InputText txtCodArp_Tp000004) {
        this.txtCodArp_Tp000004 = txtCodArp_Tp000004;
    }

    public InputText getTxtCodAfp_Tp000005() {
        return txtCodAfp_Tp000005;
    }

    public void setTxtCodAfp_Tp000005(InputText txtCodAfp_Tp000005) {
        this.txtCodAfp_Tp000005 = txtCodAfp_Tp000005;
    }

    public InputText getTxtCodCaja_Tp000006() {
        return txtCodCaja_Tp000006;
    }

    public void setTxtCodCaja_Tp000006(InputText txtCodCaja_Tp000006) {
        this.txtCodCaja_Tp000006 = txtCodCaja_Tp000006;
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

    public Calendar getTxtHoraIngPagoSistema() {
        return txtHoraIngPagoSistema;
    }

    public void setTxtHoraIngPagoSistema(Calendar txtHoraIngPagoSistema) {
        this.txtHoraIngPagoSistema = txtHoraIngPagoSistema;
    }

    public Calendar getTxtHoraPago() {
        return txtHoraPago;
    }

    public void setTxtHoraPago(Calendar txtHoraPago) {
        this.txtHoraPago = txtHoraPago;
    }

    public InputText getTxtConsecutivo() {
        return txtConsecutivo;
    }

    public void setTxtConsecutivo(InputText txtConsecutivo) {
        this.txtConsecutivo = txtConsecutivo;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tr000004DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTr000004();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tr000004DTO> tr000004DTO) {
        this.data = tr000004DTO;
    }

    public Tr000004DTO getSelectedTr000004() {
        return selectedTr000004;
    }

    public void setSelectedTr000004(Tr000004DTO tr000004) {
        this.selectedTr000004 = tr000004;
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
