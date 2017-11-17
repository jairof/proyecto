package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000003DTO;

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
public class Tg000003View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000003View.class);
    private InputText txtApartado;
    private InputText txtApeContacto;
    private InputText txtCotizacionnoCaja;
    private InputText txtCotizacionredondeada;
    private InputText txtCotizacionresiduoMayor;
    private InputText txtDe16hasta17;
    private InputText txtDe4amenosde16;
    private InputText txtDepartamentoCargo;
    private InputText txtDepto;
    private InputText txtDespedida;
    private InputText txtDireccion;
    private InputText txtDvemp;
    private InputText txtEmail;
    private InputText txtFax;
    private InputText txtFirmadaPor;
    private InputText txtFondoArp;
    private InputText txtIbcnoCaja;
    private InputText txtIbcredondeado;
    private InputText txtIbcresiduoMayor;
    private InputText txtMasde17hasta18;
    private InputText txtMasde18hasta19;
    private InputText txtMasde19hasta20;
    private InputText txtMayora20;
    private InputText txtNit;
    private InputText txtNomContacto;
    private InputText txtNomRegistroPila;
    private InputText txtNotaAlpieRecibo;
    private InputText txtNumeroEmpresas;
    private InputText txtObservacion;
    private InputText txtPagaMesActual;
    private InputText txtPorAfp;
    private InputText txtPorMoraPlanilla;
    private InputText txtPorMoraRecibo;
    private InputText txtPorcAporteSocial;
    private InputText txtPorcCaja;
    private InputText txtPorcEps;
    private InputText txtPorcIcbf;
    private InputText txtPorcIva;
    private InputText txtPorcSena;
    private InputText txtProfesion;
    private InputText txtRazonSocial;
    private InputText txtRiesgo1;
    private InputText txtRiesgo2;
    private InputText txtRiesgo3;
    private InputText txtRiesgo4;
    private InputText txtRiesgo5;
    private InputText txtSalarioBasico;
    private InputText txtSigla;
    private InputText txtTelefono;
    private InputText txtTipoAportante;
    private InputText txtTipoDocumentoC;
    private InputText txtValAdmon;
    private InputText txtValAdmonAfp;
    private InputText txtValorMensajeriaRecibo;
    private InputText txtValorReactivacion;
    private InputText txtValorRetiro;
    private InputText txtCodCiudad_Tg000002;
    private InputText txtCodCargo_Tg000006;
    private InputText txtCodEmpresa;
    private Calendar txtFechaPrimerPago;
    private Calendar txtFechaSegundoPago;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000003DTO> data;
    private Tg000003DTO selectedTg000003;
    private Tg000003 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000003View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000003 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000003 = null;

        if (txtApartado != null) {
            txtApartado.setValue(null);
            txtApartado.setDisabled(true);
        }

        if (txtApeContacto != null) {
            txtApeContacto.setValue(null);
            txtApeContacto.setDisabled(true);
        }

        if (txtCotizacionnoCaja != null) {
            txtCotizacionnoCaja.setValue(null);
            txtCotizacionnoCaja.setDisabled(true);
        }

        if (txtCotizacionredondeada != null) {
            txtCotizacionredondeada.setValue(null);
            txtCotizacionredondeada.setDisabled(true);
        }

        if (txtCotizacionresiduoMayor != null) {
            txtCotizacionresiduoMayor.setValue(null);
            txtCotizacionresiduoMayor.setDisabled(true);
        }

        if (txtDe16hasta17 != null) {
            txtDe16hasta17.setValue(null);
            txtDe16hasta17.setDisabled(true);
        }

        if (txtDe4amenosde16 != null) {
            txtDe4amenosde16.setValue(null);
            txtDe4amenosde16.setDisabled(true);
        }

        if (txtDepartamentoCargo != null) {
            txtDepartamentoCargo.setValue(null);
            txtDepartamentoCargo.setDisabled(true);
        }

        if (txtDepto != null) {
            txtDepto.setValue(null);
            txtDepto.setDisabled(true);
        }

        if (txtDespedida != null) {
            txtDespedida.setValue(null);
            txtDespedida.setDisabled(true);
        }

        if (txtDireccion != null) {
            txtDireccion.setValue(null);
            txtDireccion.setDisabled(true);
        }

        if (txtDvemp != null) {
            txtDvemp.setValue(null);
            txtDvemp.setDisabled(true);
        }

        if (txtEmail != null) {
            txtEmail.setValue(null);
            txtEmail.setDisabled(true);
        }

        if (txtFax != null) {
            txtFax.setValue(null);
            txtFax.setDisabled(true);
        }

        if (txtFirmadaPor != null) {
            txtFirmadaPor.setValue(null);
            txtFirmadaPor.setDisabled(true);
        }

        if (txtFondoArp != null) {
            txtFondoArp.setValue(null);
            txtFondoArp.setDisabled(true);
        }

        if (txtIbcnoCaja != null) {
            txtIbcnoCaja.setValue(null);
            txtIbcnoCaja.setDisabled(true);
        }

        if (txtIbcredondeado != null) {
            txtIbcredondeado.setValue(null);
            txtIbcredondeado.setDisabled(true);
        }

        if (txtIbcresiduoMayor != null) {
            txtIbcresiduoMayor.setValue(null);
            txtIbcresiduoMayor.setDisabled(true);
        }

        if (txtMasde17hasta18 != null) {
            txtMasde17hasta18.setValue(null);
            txtMasde17hasta18.setDisabled(true);
        }

        if (txtMasde18hasta19 != null) {
            txtMasde18hasta19.setValue(null);
            txtMasde18hasta19.setDisabled(true);
        }

        if (txtMasde19hasta20 != null) {
            txtMasde19hasta20.setValue(null);
            txtMasde19hasta20.setDisabled(true);
        }

        if (txtMayora20 != null) {
            txtMayora20.setValue(null);
            txtMayora20.setDisabled(true);
        }

        if (txtNit != null) {
            txtNit.setValue(null);
            txtNit.setDisabled(true);
        }

        if (txtNomContacto != null) {
            txtNomContacto.setValue(null);
            txtNomContacto.setDisabled(true);
        }

        if (txtNomRegistroPila != null) {
            txtNomRegistroPila.setValue(null);
            txtNomRegistroPila.setDisabled(true);
        }

        if (txtNotaAlpieRecibo != null) {
            txtNotaAlpieRecibo.setValue(null);
            txtNotaAlpieRecibo.setDisabled(true);
        }

        if (txtNumeroEmpresas != null) {
            txtNumeroEmpresas.setValue(null);
            txtNumeroEmpresas.setDisabled(true);
        }

        if (txtObservacion != null) {
            txtObservacion.setValue(null);
            txtObservacion.setDisabled(true);
        }

        if (txtPagaMesActual != null) {
            txtPagaMesActual.setValue(null);
            txtPagaMesActual.setDisabled(true);
        }

        if (txtPorAfp != null) {
            txtPorAfp.setValue(null);
            txtPorAfp.setDisabled(true);
        }

        if (txtPorMoraPlanilla != null) {
            txtPorMoraPlanilla.setValue(null);
            txtPorMoraPlanilla.setDisabled(true);
        }

        if (txtPorMoraRecibo != null) {
            txtPorMoraRecibo.setValue(null);
            txtPorMoraRecibo.setDisabled(true);
        }

        if (txtPorcAporteSocial != null) {
            txtPorcAporteSocial.setValue(null);
            txtPorcAporteSocial.setDisabled(true);
        }

        if (txtPorcCaja != null) {
            txtPorcCaja.setValue(null);
            txtPorcCaja.setDisabled(true);
        }

        if (txtPorcEps != null) {
            txtPorcEps.setValue(null);
            txtPorcEps.setDisabled(true);
        }

        if (txtPorcIcbf != null) {
            txtPorcIcbf.setValue(null);
            txtPorcIcbf.setDisabled(true);
        }

        if (txtPorcIva != null) {
            txtPorcIva.setValue(null);
            txtPorcIva.setDisabled(true);
        }

        if (txtPorcSena != null) {
            txtPorcSena.setValue(null);
            txtPorcSena.setDisabled(true);
        }

        if (txtProfesion != null) {
            txtProfesion.setValue(null);
            txtProfesion.setDisabled(true);
        }

        if (txtRazonSocial != null) {
            txtRazonSocial.setValue(null);
            txtRazonSocial.setDisabled(true);
        }

        if (txtRiesgo1 != null) {
            txtRiesgo1.setValue(null);
            txtRiesgo1.setDisabled(true);
        }

        if (txtRiesgo2 != null) {
            txtRiesgo2.setValue(null);
            txtRiesgo2.setDisabled(true);
        }

        if (txtRiesgo3 != null) {
            txtRiesgo3.setValue(null);
            txtRiesgo3.setDisabled(true);
        }

        if (txtRiesgo4 != null) {
            txtRiesgo4.setValue(null);
            txtRiesgo4.setDisabled(true);
        }

        if (txtRiesgo5 != null) {
            txtRiesgo5.setValue(null);
            txtRiesgo5.setDisabled(true);
        }

        if (txtSalarioBasico != null) {
            txtSalarioBasico.setValue(null);
            txtSalarioBasico.setDisabled(true);
        }

        if (txtSigla != null) {
            txtSigla.setValue(null);
            txtSigla.setDisabled(true);
        }

        if (txtTelefono != null) {
            txtTelefono.setValue(null);
            txtTelefono.setDisabled(true);
        }

        if (txtTipoAportante != null) {
            txtTipoAportante.setValue(null);
            txtTipoAportante.setDisabled(true);
        }

        if (txtTipoDocumentoC != null) {
            txtTipoDocumentoC.setValue(null);
            txtTipoDocumentoC.setDisabled(true);
        }

        if (txtValAdmon != null) {
            txtValAdmon.setValue(null);
            txtValAdmon.setDisabled(true);
        }

        if (txtValAdmonAfp != null) {
            txtValAdmonAfp.setValue(null);
            txtValAdmonAfp.setDisabled(true);
        }

        if (txtValorMensajeriaRecibo != null) {
            txtValorMensajeriaRecibo.setValue(null);
            txtValorMensajeriaRecibo.setDisabled(true);
        }

        if (txtValorReactivacion != null) {
            txtValorReactivacion.setValue(null);
            txtValorReactivacion.setDisabled(true);
        }

        if (txtValorRetiro != null) {
            txtValorRetiro.setValue(null);
            txtValorRetiro.setDisabled(true);
        }

        if (txtCodCiudad_Tg000002 != null) {
            txtCodCiudad_Tg000002.setValue(null);
            txtCodCiudad_Tg000002.setDisabled(true);
        }

        if (txtCodCargo_Tg000006 != null) {
            txtCodCargo_Tg000006.setValue(null);
            txtCodCargo_Tg000006.setDisabled(true);
        }

        if (txtFechaPrimerPago != null) {
            txtFechaPrimerPago.setValue(null);
            txtFechaPrimerPago.setDisabled(true);
        }

        if (txtFechaSegundoPago != null) {
            txtFechaSegundoPago.setValue(null);
            txtFechaSegundoPago.setDisabled(true);
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

    public void listener_txtFechaPrimerPago() {
        Date inputDate = (Date) txtFechaPrimerPago.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaSegundoPago() {
        Date inputDate = (Date) txtFechaSegundoPago.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtId() {
        try {
            String codEmpresa = FacesUtils.checkString(txtCodEmpresa);
            entity = (codEmpresa != null)
                ? businessDelegatorView.getTg000003(codEmpresa) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtApartado.setDisabled(false);
            txtApeContacto.setDisabled(false);
            txtCotizacionnoCaja.setDisabled(false);
            txtCotizacionredondeada.setDisabled(false);
            txtCotizacionresiduoMayor.setDisabled(false);
            txtDe16hasta17.setDisabled(false);
            txtDe4amenosde16.setDisabled(false);
            txtDepartamentoCargo.setDisabled(false);
            txtDepto.setDisabled(false);
            txtDespedida.setDisabled(false);
            txtDireccion.setDisabled(false);
            txtDvemp.setDisabled(false);
            txtEmail.setDisabled(false);
            txtFax.setDisabled(false);
            txtFirmadaPor.setDisabled(false);
            txtFondoArp.setDisabled(false);
            txtIbcnoCaja.setDisabled(false);
            txtIbcredondeado.setDisabled(false);
            txtIbcresiduoMayor.setDisabled(false);
            txtMasde17hasta18.setDisabled(false);
            txtMasde18hasta19.setDisabled(false);
            txtMasde19hasta20.setDisabled(false);
            txtMayora20.setDisabled(false);
            txtNit.setDisabled(false);
            txtNomContacto.setDisabled(false);
            txtNomRegistroPila.setDisabled(false);
            txtNotaAlpieRecibo.setDisabled(false);
            txtNumeroEmpresas.setDisabled(false);
            txtObservacion.setDisabled(false);
            txtPagaMesActual.setDisabled(false);
            txtPorAfp.setDisabled(false);
            txtPorMoraPlanilla.setDisabled(false);
            txtPorMoraRecibo.setDisabled(false);
            txtPorcAporteSocial.setDisabled(false);
            txtPorcCaja.setDisabled(false);
            txtPorcEps.setDisabled(false);
            txtPorcIcbf.setDisabled(false);
            txtPorcIva.setDisabled(false);
            txtPorcSena.setDisabled(false);
            txtProfesion.setDisabled(false);
            txtRazonSocial.setDisabled(false);
            txtRiesgo1.setDisabled(false);
            txtRiesgo2.setDisabled(false);
            txtRiesgo3.setDisabled(false);
            txtRiesgo4.setDisabled(false);
            txtRiesgo5.setDisabled(false);
            txtSalarioBasico.setDisabled(false);
            txtSigla.setDisabled(false);
            txtTelefono.setDisabled(false);
            txtTipoAportante.setDisabled(false);
            txtTipoDocumentoC.setDisabled(false);
            txtValAdmon.setDisabled(false);
            txtValAdmonAfp.setDisabled(false);
            txtValorMensajeriaRecibo.setDisabled(false);
            txtValorReactivacion.setDisabled(false);
            txtValorRetiro.setDisabled(false);
            txtCodCiudad_Tg000002.setDisabled(false);
            txtCodCargo_Tg000006.setDisabled(false);
            txtFechaPrimerPago.setDisabled(false);
            txtFechaSegundoPago.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtApartado.setValue(entity.getApartado());
            txtApartado.setDisabled(false);
            txtApeContacto.setValue(entity.getApeContacto());
            txtApeContacto.setDisabled(false);
            txtCotizacionnoCaja.setValue(entity.getCotizacionnoCaja());
            txtCotizacionnoCaja.setDisabled(false);
            txtCotizacionredondeada.setValue(entity.getCotizacionredondeada());
            txtCotizacionredondeada.setDisabled(false);
            txtCotizacionresiduoMayor.setValue(entity.getCotizacionresiduoMayor());
            txtCotizacionresiduoMayor.setDisabled(false);
            txtDe16hasta17.setValue(entity.getDe16hasta17());
            txtDe16hasta17.setDisabled(false);
            txtDe4amenosde16.setValue(entity.getDe4amenosde16());
            txtDe4amenosde16.setDisabled(false);
            txtDepartamentoCargo.setValue(entity.getDepartamentoCargo());
            txtDepartamentoCargo.setDisabled(false);
            txtDepto.setValue(entity.getDepto());
            txtDepto.setDisabled(false);
            txtDespedida.setValue(entity.getDespedida());
            txtDespedida.setDisabled(false);
            txtDireccion.setValue(entity.getDireccion());
            txtDireccion.setDisabled(false);
            txtDvemp.setValue(entity.getDvemp());
            txtDvemp.setDisabled(false);
            txtEmail.setValue(entity.getEmail());
            txtEmail.setDisabled(false);
            txtFax.setValue(entity.getFax());
            txtFax.setDisabled(false);
            txtFechaPrimerPago.setValue(entity.getFechaPrimerPago());
            txtFechaPrimerPago.setDisabled(false);
            txtFechaSegundoPago.setValue(entity.getFechaSegundoPago());
            txtFechaSegundoPago.setDisabled(false);
            txtFirmadaPor.setValue(entity.getFirmadaPor());
            txtFirmadaPor.setDisabled(false);
            txtFondoArp.setValue(entity.getFondoArp());
            txtFondoArp.setDisabled(false);
            txtIbcnoCaja.setValue(entity.getIbcnoCaja());
            txtIbcnoCaja.setDisabled(false);
            txtIbcredondeado.setValue(entity.getIbcredondeado());
            txtIbcredondeado.setDisabled(false);
            txtIbcresiduoMayor.setValue(entity.getIbcresiduoMayor());
            txtIbcresiduoMayor.setDisabled(false);
            txtMasde17hasta18.setValue(entity.getMasde17hasta18());
            txtMasde17hasta18.setDisabled(false);
            txtMasde18hasta19.setValue(entity.getMasde18hasta19());
            txtMasde18hasta19.setDisabled(false);
            txtMasde19hasta20.setValue(entity.getMasde19hasta20());
            txtMasde19hasta20.setDisabled(false);
            txtMayora20.setValue(entity.getMayora20());
            txtMayora20.setDisabled(false);
            txtNit.setValue(entity.getNit());
            txtNit.setDisabled(false);
            txtNomContacto.setValue(entity.getNomContacto());
            txtNomContacto.setDisabled(false);
            txtNomRegistroPila.setValue(entity.getNomRegistroPila());
            txtNomRegistroPila.setDisabled(false);
            txtNotaAlpieRecibo.setValue(entity.getNotaAlpieRecibo());
            txtNotaAlpieRecibo.setDisabled(false);
            txtNumeroEmpresas.setValue(entity.getNumeroEmpresas());
            txtNumeroEmpresas.setDisabled(false);
            txtObservacion.setValue(entity.getObservacion());
            txtObservacion.setDisabled(false);
            txtPagaMesActual.setValue(entity.getPagaMesActual());
            txtPagaMesActual.setDisabled(false);
            txtPorAfp.setValue(entity.getPorAfp());
            txtPorAfp.setDisabled(false);
            txtPorMoraPlanilla.setValue(entity.getPorMoraPlanilla());
            txtPorMoraPlanilla.setDisabled(false);
            txtPorMoraRecibo.setValue(entity.getPorMoraRecibo());
            txtPorMoraRecibo.setDisabled(false);
            txtPorcAporteSocial.setValue(entity.getPorcAporteSocial());
            txtPorcAporteSocial.setDisabled(false);
            txtPorcCaja.setValue(entity.getPorcCaja());
            txtPorcCaja.setDisabled(false);
            txtPorcEps.setValue(entity.getPorcEps());
            txtPorcEps.setDisabled(false);
            txtPorcIcbf.setValue(entity.getPorcIcbf());
            txtPorcIcbf.setDisabled(false);
            txtPorcIva.setValue(entity.getPorcIva());
            txtPorcIva.setDisabled(false);
            txtPorcSena.setValue(entity.getPorcSena());
            txtPorcSena.setDisabled(false);
            txtProfesion.setValue(entity.getProfesion());
            txtProfesion.setDisabled(false);
            txtRazonSocial.setValue(entity.getRazonSocial());
            txtRazonSocial.setDisabled(false);
            txtRiesgo1.setValue(entity.getRiesgo1());
            txtRiesgo1.setDisabled(false);
            txtRiesgo2.setValue(entity.getRiesgo2());
            txtRiesgo2.setDisabled(false);
            txtRiesgo3.setValue(entity.getRiesgo3());
            txtRiesgo3.setDisabled(false);
            txtRiesgo4.setValue(entity.getRiesgo4());
            txtRiesgo4.setDisabled(false);
            txtRiesgo5.setValue(entity.getRiesgo5());
            txtRiesgo5.setDisabled(false);
            txtSalarioBasico.setValue(entity.getSalarioBasico());
            txtSalarioBasico.setDisabled(false);
            txtSigla.setValue(entity.getSigla());
            txtSigla.setDisabled(false);
            txtTelefono.setValue(entity.getTelefono());
            txtTelefono.setDisabled(false);
            txtTipoAportante.setValue(entity.getTipoAportante());
            txtTipoAportante.setDisabled(false);
            txtTipoDocumentoC.setValue(entity.getTipoDocumentoC());
            txtTipoDocumentoC.setDisabled(false);
            txtValAdmon.setValue(entity.getValAdmon());
            txtValAdmon.setDisabled(false);
            txtValAdmonAfp.setValue(entity.getValAdmonAfp());
            txtValAdmonAfp.setDisabled(false);
            txtValorMensajeriaRecibo.setValue(entity.getValorMensajeriaRecibo());
            txtValorMensajeriaRecibo.setDisabled(false);
            txtValorReactivacion.setValue(entity.getValorReactivacion());
            txtValorReactivacion.setDisabled(false);
            txtValorRetiro.setValue(entity.getValorRetiro());
            txtValorRetiro.setDisabled(false);
            txtCodCiudad_Tg000002.setValue(entity.getTg000002().getCodCiudad());
            txtCodCiudad_Tg000002.setDisabled(false);
            txtCodCargo_Tg000006.setValue(entity.getTg000006().getCodCargo());
            txtCodCargo_Tg000006.setDisabled(false);
            txtCodEmpresa.setValue(entity.getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000003 = (Tg000003DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000003"));
        txtApartado.setValue(selectedTg000003.getApartado());
        txtApartado.setDisabled(false);
        txtApeContacto.setValue(selectedTg000003.getApeContacto());
        txtApeContacto.setDisabled(false);
        txtCotizacionnoCaja.setValue(selectedTg000003.getCotizacionnoCaja());
        txtCotizacionnoCaja.setDisabled(false);
        txtCotizacionredondeada.setValue(selectedTg000003.getCotizacionredondeada());
        txtCotizacionredondeada.setDisabled(false);
        txtCotizacionresiduoMayor.setValue(selectedTg000003.getCotizacionresiduoMayor());
        txtCotizacionresiduoMayor.setDisabled(false);
        txtDe16hasta17.setValue(selectedTg000003.getDe16hasta17());
        txtDe16hasta17.setDisabled(false);
        txtDe4amenosde16.setValue(selectedTg000003.getDe4amenosde16());
        txtDe4amenosde16.setDisabled(false);
        txtDepartamentoCargo.setValue(selectedTg000003.getDepartamentoCargo());
        txtDepartamentoCargo.setDisabled(false);
        txtDepto.setValue(selectedTg000003.getDepto());
        txtDepto.setDisabled(false);
        txtDespedida.setValue(selectedTg000003.getDespedida());
        txtDespedida.setDisabled(false);
        txtDireccion.setValue(selectedTg000003.getDireccion());
        txtDireccion.setDisabled(false);
        txtDvemp.setValue(selectedTg000003.getDvemp());
        txtDvemp.setDisabled(false);
        txtEmail.setValue(selectedTg000003.getEmail());
        txtEmail.setDisabled(false);
        txtFax.setValue(selectedTg000003.getFax());
        txtFax.setDisabled(false);
        txtFechaPrimerPago.setValue(selectedTg000003.getFechaPrimerPago());
        txtFechaPrimerPago.setDisabled(false);
        txtFechaSegundoPago.setValue(selectedTg000003.getFechaSegundoPago());
        txtFechaSegundoPago.setDisabled(false);
        txtFirmadaPor.setValue(selectedTg000003.getFirmadaPor());
        txtFirmadaPor.setDisabled(false);
        txtFondoArp.setValue(selectedTg000003.getFondoArp());
        txtFondoArp.setDisabled(false);
        txtIbcnoCaja.setValue(selectedTg000003.getIbcnoCaja());
        txtIbcnoCaja.setDisabled(false);
        txtIbcredondeado.setValue(selectedTg000003.getIbcredondeado());
        txtIbcredondeado.setDisabled(false);
        txtIbcresiduoMayor.setValue(selectedTg000003.getIbcresiduoMayor());
        txtIbcresiduoMayor.setDisabled(false);
        txtMasde17hasta18.setValue(selectedTg000003.getMasde17hasta18());
        txtMasde17hasta18.setDisabled(false);
        txtMasde18hasta19.setValue(selectedTg000003.getMasde18hasta19());
        txtMasde18hasta19.setDisabled(false);
        txtMasde19hasta20.setValue(selectedTg000003.getMasde19hasta20());
        txtMasde19hasta20.setDisabled(false);
        txtMayora20.setValue(selectedTg000003.getMayora20());
        txtMayora20.setDisabled(false);
        txtNit.setValue(selectedTg000003.getNit());
        txtNit.setDisabled(false);
        txtNomContacto.setValue(selectedTg000003.getNomContacto());
        txtNomContacto.setDisabled(false);
        txtNomRegistroPila.setValue(selectedTg000003.getNomRegistroPila());
        txtNomRegistroPila.setDisabled(false);
        txtNotaAlpieRecibo.setValue(selectedTg000003.getNotaAlpieRecibo());
        txtNotaAlpieRecibo.setDisabled(false);
        txtNumeroEmpresas.setValue(selectedTg000003.getNumeroEmpresas());
        txtNumeroEmpresas.setDisabled(false);
        txtObservacion.setValue(selectedTg000003.getObservacion());
        txtObservacion.setDisabled(false);
        txtPagaMesActual.setValue(selectedTg000003.getPagaMesActual());
        txtPagaMesActual.setDisabled(false);
        txtPorAfp.setValue(selectedTg000003.getPorAfp());
        txtPorAfp.setDisabled(false);
        txtPorMoraPlanilla.setValue(selectedTg000003.getPorMoraPlanilla());
        txtPorMoraPlanilla.setDisabled(false);
        txtPorMoraRecibo.setValue(selectedTg000003.getPorMoraRecibo());
        txtPorMoraRecibo.setDisabled(false);
        txtPorcAporteSocial.setValue(selectedTg000003.getPorcAporteSocial());
        txtPorcAporteSocial.setDisabled(false);
        txtPorcCaja.setValue(selectedTg000003.getPorcCaja());
        txtPorcCaja.setDisabled(false);
        txtPorcEps.setValue(selectedTg000003.getPorcEps());
        txtPorcEps.setDisabled(false);
        txtPorcIcbf.setValue(selectedTg000003.getPorcIcbf());
        txtPorcIcbf.setDisabled(false);
        txtPorcIva.setValue(selectedTg000003.getPorcIva());
        txtPorcIva.setDisabled(false);
        txtPorcSena.setValue(selectedTg000003.getPorcSena());
        txtPorcSena.setDisabled(false);
        txtProfesion.setValue(selectedTg000003.getProfesion());
        txtProfesion.setDisabled(false);
        txtRazonSocial.setValue(selectedTg000003.getRazonSocial());
        txtRazonSocial.setDisabled(false);
        txtRiesgo1.setValue(selectedTg000003.getRiesgo1());
        txtRiesgo1.setDisabled(false);
        txtRiesgo2.setValue(selectedTg000003.getRiesgo2());
        txtRiesgo2.setDisabled(false);
        txtRiesgo3.setValue(selectedTg000003.getRiesgo3());
        txtRiesgo3.setDisabled(false);
        txtRiesgo4.setValue(selectedTg000003.getRiesgo4());
        txtRiesgo4.setDisabled(false);
        txtRiesgo5.setValue(selectedTg000003.getRiesgo5());
        txtRiesgo5.setDisabled(false);
        txtSalarioBasico.setValue(selectedTg000003.getSalarioBasico());
        txtSalarioBasico.setDisabled(false);
        txtSigla.setValue(selectedTg000003.getSigla());
        txtSigla.setDisabled(false);
        txtTelefono.setValue(selectedTg000003.getTelefono());
        txtTelefono.setDisabled(false);
        txtTipoAportante.setValue(selectedTg000003.getTipoAportante());
        txtTipoAportante.setDisabled(false);
        txtTipoDocumentoC.setValue(selectedTg000003.getTipoDocumentoC());
        txtTipoDocumentoC.setDisabled(false);
        txtValAdmon.setValue(selectedTg000003.getValAdmon());
        txtValAdmon.setDisabled(false);
        txtValAdmonAfp.setValue(selectedTg000003.getValAdmonAfp());
        txtValAdmonAfp.setDisabled(false);
        txtValorMensajeriaRecibo.setValue(selectedTg000003.getValorMensajeriaRecibo());
        txtValorMensajeriaRecibo.setDisabled(false);
        txtValorReactivacion.setValue(selectedTg000003.getValorReactivacion());
        txtValorReactivacion.setDisabled(false);
        txtValorRetiro.setValue(selectedTg000003.getValorRetiro());
        txtValorRetiro.setDisabled(false);
        txtCodCiudad_Tg000002.setValue(selectedTg000003.getCodCiudad_Tg000002());
        txtCodCiudad_Tg000002.setDisabled(false);
        txtCodCargo_Tg000006.setValue(selectedTg000003.getCodCargo_Tg000006());
        txtCodCargo_Tg000006.setDisabled(false);
        txtCodEmpresa.setValue(selectedTg000003.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000003 == null) && (entity == null)) {
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
            entity = new Tg000003();

            String codEmpresa = FacesUtils.checkString(txtCodEmpresa);

            entity.setApartado(FacesUtils.checkString(txtApartado));
            entity.setApeContacto(FacesUtils.checkString(txtApeContacto));
            entity.setCodEmpresa(codEmpresa);
            entity.setCotizacionnoCaja(FacesUtils.checkDouble(
                    txtCotizacionnoCaja));
            entity.setCotizacionredondeada(FacesUtils.checkDouble(
                    txtCotizacionredondeada));
            entity.setCotizacionresiduoMayor(FacesUtils.checkDouble(
                    txtCotizacionresiduoMayor));
            entity.setDe16hasta17(FacesUtils.checkDouble(txtDe16hasta17));
            entity.setDe4amenosde16(FacesUtils.checkDouble(txtDe4amenosde16));
            entity.setDepartamentoCargo(FacesUtils.checkString(
                    txtDepartamentoCargo));
            entity.setDepto(FacesUtils.checkString(txtDepto));
            entity.setDespedida(FacesUtils.checkString(txtDespedida));
            entity.setDireccion(FacesUtils.checkString(txtDireccion));
            entity.setDvemp(FacesUtils.checkString(txtDvemp));
            entity.setEmail(FacesUtils.checkString(txtEmail));
            entity.setFax(FacesUtils.checkString(txtFax));
            entity.setFechaPrimerPago(FacesUtils.checkDate(txtFechaPrimerPago));
            entity.setFechaSegundoPago(FacesUtils.checkDate(txtFechaSegundoPago));
            entity.setFirmadaPor(FacesUtils.checkString(txtFirmadaPor));
            entity.setFondoArp(FacesUtils.checkDouble(txtFondoArp));
            entity.setIbcnoCaja(FacesUtils.checkDouble(txtIbcnoCaja));
            entity.setIbcredondeado(FacesUtils.checkDouble(txtIbcredondeado));
            entity.setIbcresiduoMayor(FacesUtils.checkDouble(txtIbcresiduoMayor));
            entity.setMasde17hasta18(FacesUtils.checkDouble(txtMasde17hasta18));
            entity.setMasde18hasta19(FacesUtils.checkDouble(txtMasde18hasta19));
            entity.setMasde19hasta20(FacesUtils.checkDouble(txtMasde19hasta20));
            entity.setMayora20(FacesUtils.checkDouble(txtMayora20));
            entity.setNit(FacesUtils.checkString(txtNit));
            entity.setNomContacto(FacesUtils.checkString(txtNomContacto));
            entity.setNomRegistroPila(FacesUtils.checkString(txtNomRegistroPila));
            entity.setNotaAlpieRecibo(FacesUtils.checkString(txtNotaAlpieRecibo));
            entity.setNumeroEmpresas(FacesUtils.checkString(txtNumeroEmpresas));
            entity.setObservacion(FacesUtils.checkString(txtObservacion));
            entity.setPagaMesActual(FacesUtils.checkString(txtPagaMesActual));
            entity.setPorAfp(FacesUtils.checkDouble(txtPorAfp));
            entity.setPorMoraPlanilla(FacesUtils.checkDouble(txtPorMoraPlanilla));
            entity.setPorMoraRecibo(FacesUtils.checkDouble(txtPorMoraRecibo));
            entity.setPorcAporteSocial(FacesUtils.checkDouble(
                    txtPorcAporteSocial));
            entity.setPorcCaja(FacesUtils.checkDouble(txtPorcCaja));
            entity.setPorcEps(FacesUtils.checkDouble(txtPorcEps));
            entity.setPorcIcbf(FacesUtils.checkDouble(txtPorcIcbf));
            entity.setPorcIva(FacesUtils.checkDouble(txtPorcIva));
            entity.setPorcSena(FacesUtils.checkDouble(txtPorcSena));
            entity.setProfesion(FacesUtils.checkString(txtProfesion));
            entity.setRazonSocial(FacesUtils.checkString(txtRazonSocial));
            entity.setRiesgo1(FacesUtils.checkDouble(txtRiesgo1));
            entity.setRiesgo2(FacesUtils.checkDouble(txtRiesgo2));
            entity.setRiesgo3(FacesUtils.checkDouble(txtRiesgo3));
            entity.setRiesgo4(FacesUtils.checkDouble(txtRiesgo4));
            entity.setRiesgo5(FacesUtils.checkDouble(txtRiesgo5));
            entity.setSalarioBasico(FacesUtils.checkDouble(txtSalarioBasico));
            entity.setSigla(FacesUtils.checkString(txtSigla));
            entity.setTelefono(FacesUtils.checkString(txtTelefono));
            entity.setTipoAportante(FacesUtils.checkString(txtTipoAportante));
            entity.setTipoDocumentoC(FacesUtils.checkString(txtTipoDocumentoC));
            entity.setValAdmon(FacesUtils.checkDouble(txtValAdmon));
            entity.setValAdmonAfp(FacesUtils.checkInteger(txtValAdmonAfp));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    txtValorMensajeriaRecibo));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    txtValorReactivacion));
            entity.setValorRetiro(FacesUtils.checkDouble(txtValorRetiro));
            entity.setTg000002((FacesUtils.checkString(txtCodCiudad_Tg000002) != null)
                ? businessDelegatorView.getTg000002(FacesUtils.checkString(
                        txtCodCiudad_Tg000002)) : null);
            entity.setTg000006((FacesUtils.checkString(txtCodCargo_Tg000006) != null)
                ? businessDelegatorView.getTg000006(FacesUtils.checkString(
                        txtCodCargo_Tg000006)) : null);
            businessDelegatorView.saveTg000003(entity);
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
                String codEmpresa = new String(selectedTg000003.getCodEmpresa());
                entity = businessDelegatorView.getTg000003(codEmpresa);
            }

            entity.setApartado(FacesUtils.checkString(txtApartado));
            entity.setApeContacto(FacesUtils.checkString(txtApeContacto));
            entity.setCotizacionnoCaja(FacesUtils.checkDouble(
                    txtCotizacionnoCaja));
            entity.setCotizacionredondeada(FacesUtils.checkDouble(
                    txtCotizacionredondeada));
            entity.setCotizacionresiduoMayor(FacesUtils.checkDouble(
                    txtCotizacionresiduoMayor));
            entity.setDe16hasta17(FacesUtils.checkDouble(txtDe16hasta17));
            entity.setDe4amenosde16(FacesUtils.checkDouble(txtDe4amenosde16));
            entity.setDepartamentoCargo(FacesUtils.checkString(
                    txtDepartamentoCargo));
            entity.setDepto(FacesUtils.checkString(txtDepto));
            entity.setDespedida(FacesUtils.checkString(txtDespedida));
            entity.setDireccion(FacesUtils.checkString(txtDireccion));
            entity.setDvemp(FacesUtils.checkString(txtDvemp));
            entity.setEmail(FacesUtils.checkString(txtEmail));
            entity.setFax(FacesUtils.checkString(txtFax));
            entity.setFechaPrimerPago(FacesUtils.checkDate(txtFechaPrimerPago));
            entity.setFechaSegundoPago(FacesUtils.checkDate(txtFechaSegundoPago));
            entity.setFirmadaPor(FacesUtils.checkString(txtFirmadaPor));
            entity.setFondoArp(FacesUtils.checkDouble(txtFondoArp));
            entity.setIbcnoCaja(FacesUtils.checkDouble(txtIbcnoCaja));
            entity.setIbcredondeado(FacesUtils.checkDouble(txtIbcredondeado));
            entity.setIbcresiduoMayor(FacesUtils.checkDouble(txtIbcresiduoMayor));
            entity.setMasde17hasta18(FacesUtils.checkDouble(txtMasde17hasta18));
            entity.setMasde18hasta19(FacesUtils.checkDouble(txtMasde18hasta19));
            entity.setMasde19hasta20(FacesUtils.checkDouble(txtMasde19hasta20));
            entity.setMayora20(FacesUtils.checkDouble(txtMayora20));
            entity.setNit(FacesUtils.checkString(txtNit));
            entity.setNomContacto(FacesUtils.checkString(txtNomContacto));
            entity.setNomRegistroPila(FacesUtils.checkString(txtNomRegistroPila));
            entity.setNotaAlpieRecibo(FacesUtils.checkString(txtNotaAlpieRecibo));
            entity.setNumeroEmpresas(FacesUtils.checkString(txtNumeroEmpresas));
            entity.setObservacion(FacesUtils.checkString(txtObservacion));
            entity.setPagaMesActual(FacesUtils.checkString(txtPagaMesActual));
            entity.setPorAfp(FacesUtils.checkDouble(txtPorAfp));
            entity.setPorMoraPlanilla(FacesUtils.checkDouble(txtPorMoraPlanilla));
            entity.setPorMoraRecibo(FacesUtils.checkDouble(txtPorMoraRecibo));
            entity.setPorcAporteSocial(FacesUtils.checkDouble(
                    txtPorcAporteSocial));
            entity.setPorcCaja(FacesUtils.checkDouble(txtPorcCaja));
            entity.setPorcEps(FacesUtils.checkDouble(txtPorcEps));
            entity.setPorcIcbf(FacesUtils.checkDouble(txtPorcIcbf));
            entity.setPorcIva(FacesUtils.checkDouble(txtPorcIva));
            entity.setPorcSena(FacesUtils.checkDouble(txtPorcSena));
            entity.setProfesion(FacesUtils.checkString(txtProfesion));
            entity.setRazonSocial(FacesUtils.checkString(txtRazonSocial));
            entity.setRiesgo1(FacesUtils.checkDouble(txtRiesgo1));
            entity.setRiesgo2(FacesUtils.checkDouble(txtRiesgo2));
            entity.setRiesgo3(FacesUtils.checkDouble(txtRiesgo3));
            entity.setRiesgo4(FacesUtils.checkDouble(txtRiesgo4));
            entity.setRiesgo5(FacesUtils.checkDouble(txtRiesgo5));
            entity.setSalarioBasico(FacesUtils.checkDouble(txtSalarioBasico));
            entity.setSigla(FacesUtils.checkString(txtSigla));
            entity.setTelefono(FacesUtils.checkString(txtTelefono));
            entity.setTipoAportante(FacesUtils.checkString(txtTipoAportante));
            entity.setTipoDocumentoC(FacesUtils.checkString(txtTipoDocumentoC));
            entity.setValAdmon(FacesUtils.checkDouble(txtValAdmon));
            entity.setValAdmonAfp(FacesUtils.checkInteger(txtValAdmonAfp));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    txtValorMensajeriaRecibo));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    txtValorReactivacion));
            entity.setValorRetiro(FacesUtils.checkDouble(txtValorRetiro));
            entity.setTg000002((FacesUtils.checkString(txtCodCiudad_Tg000002) != null)
                ? businessDelegatorView.getTg000002(FacesUtils.checkString(
                        txtCodCiudad_Tg000002)) : null);
            entity.setTg000006((FacesUtils.checkString(txtCodCargo_Tg000006) != null)
                ? businessDelegatorView.getTg000006(FacesUtils.checkString(
                        txtCodCargo_Tg000006)) : null);
            businessDelegatorView.updateTg000003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000003 = (Tg000003DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000003"));

            String codEmpresa = new String(selectedTg000003.getCodEmpresa());
            entity = businessDelegatorView.getTg000003(codEmpresa);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codEmpresa = FacesUtils.checkString(txtCodEmpresa);
            entity = businessDelegatorView.getTg000003(codEmpresa);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000003(entity);
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

    public String action_modifyWitDTO(String apartado, String apeContacto,
        String codEmpresa, Double cotizacionnoCaja,
        Double cotizacionredondeada, Double cotizacionresiduoMayor,
        Double de16hasta17, Double de4amenosde16, String departamentoCargo,
        String depto, String despedida, String direccion, String dvemp,
        String email, String fax, Date fechaPrimerPago, Date fechaSegundoPago,
        String firmadaPor, Double fondoArp, Double ibcnoCaja,
        Double ibcredondeado, Double ibcresiduoMayor, Double masde17hasta18,
        Double masde18hasta19, Double masde19hasta20, Double mayora20,
        String nit, String nomContacto, String nomRegistroPila,
        String notaAlpieRecibo, String numeroEmpresas, String observacion,
        String pagaMesActual, Double porAfp, Double porMoraPlanilla,
        Double porMoraRecibo, Double porcAporteSocial, Double porcCaja,
        Double porcEps, Double porcIcbf, Double porcIva, Double porcSena,
        String profesion, String razonSocial, Double riesgo1, Double riesgo2,
        Double riesgo3, Double riesgo4, Double riesgo5, Double salarioBasico,
        String sigla, String telefono, String tipoAportante,
        String tipoDocumentoC, Double valAdmon, Integer valAdmonAfp,
        Double valorMensajeriaRecibo, Double valorReactivacion,
        Double valorRetiro, String codCiudad_Tg000002, String codCargo_Tg000006)
        throws Exception {
        try {
            entity.setApartado(FacesUtils.checkString(apartado));
            entity.setApeContacto(FacesUtils.checkString(apeContacto));
            entity.setCotizacionnoCaja(FacesUtils.checkDouble(cotizacionnoCaja));
            entity.setCotizacionredondeada(FacesUtils.checkDouble(
                    cotizacionredondeada));
            entity.setCotizacionresiduoMayor(FacesUtils.checkDouble(
                    cotizacionresiduoMayor));
            entity.setDe16hasta17(FacesUtils.checkDouble(de16hasta17));
            entity.setDe4amenosde16(FacesUtils.checkDouble(de4amenosde16));
            entity.setDepartamentoCargo(FacesUtils.checkString(
                    departamentoCargo));
            entity.setDepto(FacesUtils.checkString(depto));
            entity.setDespedida(FacesUtils.checkString(despedida));
            entity.setDireccion(FacesUtils.checkString(direccion));
            entity.setDvemp(FacesUtils.checkString(dvemp));
            entity.setEmail(FacesUtils.checkString(email));
            entity.setFax(FacesUtils.checkString(fax));
            entity.setFechaPrimerPago(FacesUtils.checkDate(fechaPrimerPago));
            entity.setFechaSegundoPago(FacesUtils.checkDate(fechaSegundoPago));
            entity.setFirmadaPor(FacesUtils.checkString(firmadaPor));
            entity.setFondoArp(FacesUtils.checkDouble(fondoArp));
            entity.setIbcnoCaja(FacesUtils.checkDouble(ibcnoCaja));
            entity.setIbcredondeado(FacesUtils.checkDouble(ibcredondeado));
            entity.setIbcresiduoMayor(FacesUtils.checkDouble(ibcresiduoMayor));
            entity.setMasde17hasta18(FacesUtils.checkDouble(masde17hasta18));
            entity.setMasde18hasta19(FacesUtils.checkDouble(masde18hasta19));
            entity.setMasde19hasta20(FacesUtils.checkDouble(masde19hasta20));
            entity.setMayora20(FacesUtils.checkDouble(mayora20));
            entity.setNit(FacesUtils.checkString(nit));
            entity.setNomContacto(FacesUtils.checkString(nomContacto));
            entity.setNomRegistroPila(FacesUtils.checkString(nomRegistroPila));
            entity.setNotaAlpieRecibo(FacesUtils.checkString(notaAlpieRecibo));
            entity.setNumeroEmpresas(FacesUtils.checkString(numeroEmpresas));
            entity.setObservacion(FacesUtils.checkString(observacion));
            entity.setPagaMesActual(FacesUtils.checkString(pagaMesActual));
            entity.setPorAfp(FacesUtils.checkDouble(porAfp));
            entity.setPorMoraPlanilla(FacesUtils.checkDouble(porMoraPlanilla));
            entity.setPorMoraRecibo(FacesUtils.checkDouble(porMoraRecibo));
            entity.setPorcAporteSocial(FacesUtils.checkDouble(porcAporteSocial));
            entity.setPorcCaja(FacesUtils.checkDouble(porcCaja));
            entity.setPorcEps(FacesUtils.checkDouble(porcEps));
            entity.setPorcIcbf(FacesUtils.checkDouble(porcIcbf));
            entity.setPorcIva(FacesUtils.checkDouble(porcIva));
            entity.setPorcSena(FacesUtils.checkDouble(porcSena));
            entity.setProfesion(FacesUtils.checkString(profesion));
            entity.setRazonSocial(FacesUtils.checkString(razonSocial));
            entity.setRiesgo1(FacesUtils.checkDouble(riesgo1));
            entity.setRiesgo2(FacesUtils.checkDouble(riesgo2));
            entity.setRiesgo3(FacesUtils.checkDouble(riesgo3));
            entity.setRiesgo4(FacesUtils.checkDouble(riesgo4));
            entity.setRiesgo5(FacesUtils.checkDouble(riesgo5));
            entity.setSalarioBasico(FacesUtils.checkDouble(salarioBasico));
            entity.setSigla(FacesUtils.checkString(sigla));
            entity.setTelefono(FacesUtils.checkString(telefono));
            entity.setTipoAportante(FacesUtils.checkString(tipoAportante));
            entity.setTipoDocumentoC(FacesUtils.checkString(tipoDocumentoC));
            entity.setValAdmon(FacesUtils.checkDouble(valAdmon));
            entity.setValAdmonAfp(FacesUtils.checkInteger(valAdmonAfp));
            entity.setValorMensajeriaRecibo(FacesUtils.checkDouble(
                    valorMensajeriaRecibo));
            entity.setValorReactivacion(FacesUtils.checkDouble(
                    valorReactivacion));
            entity.setValorRetiro(FacesUtils.checkDouble(valorRetiro));
            businessDelegatorView.updateTg000003(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000003View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtApartado() {
        return txtApartado;
    }

    public void setTxtApartado(InputText txtApartado) {
        this.txtApartado = txtApartado;
    }

    public InputText getTxtApeContacto() {
        return txtApeContacto;
    }

    public void setTxtApeContacto(InputText txtApeContacto) {
        this.txtApeContacto = txtApeContacto;
    }

    public InputText getTxtCotizacionnoCaja() {
        return txtCotizacionnoCaja;
    }

    public void setTxtCotizacionnoCaja(InputText txtCotizacionnoCaja) {
        this.txtCotizacionnoCaja = txtCotizacionnoCaja;
    }

    public InputText getTxtCotizacionredondeada() {
        return txtCotizacionredondeada;
    }

    public void setTxtCotizacionredondeada(InputText txtCotizacionredondeada) {
        this.txtCotizacionredondeada = txtCotizacionredondeada;
    }

    public InputText getTxtCotizacionresiduoMayor() {
        return txtCotizacionresiduoMayor;
    }

    public void setTxtCotizacionresiduoMayor(
        InputText txtCotizacionresiduoMayor) {
        this.txtCotizacionresiduoMayor = txtCotizacionresiduoMayor;
    }

    public InputText getTxtDe16hasta17() {
        return txtDe16hasta17;
    }

    public void setTxtDe16hasta17(InputText txtDe16hasta17) {
        this.txtDe16hasta17 = txtDe16hasta17;
    }

    public InputText getTxtDe4amenosde16() {
        return txtDe4amenosde16;
    }

    public void setTxtDe4amenosde16(InputText txtDe4amenosde16) {
        this.txtDe4amenosde16 = txtDe4amenosde16;
    }

    public InputText getTxtDepartamentoCargo() {
        return txtDepartamentoCargo;
    }

    public void setTxtDepartamentoCargo(InputText txtDepartamentoCargo) {
        this.txtDepartamentoCargo = txtDepartamentoCargo;
    }

    public InputText getTxtDepto() {
        return txtDepto;
    }

    public void setTxtDepto(InputText txtDepto) {
        this.txtDepto = txtDepto;
    }

    public InputText getTxtDespedida() {
        return txtDespedida;
    }

    public void setTxtDespedida(InputText txtDespedida) {
        this.txtDespedida = txtDespedida;
    }

    public InputText getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(InputText txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public InputText getTxtDvemp() {
        return txtDvemp;
    }

    public void setTxtDvemp(InputText txtDvemp) {
        this.txtDvemp = txtDvemp;
    }

    public InputText getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(InputText txtEmail) {
        this.txtEmail = txtEmail;
    }

    public InputText getTxtFax() {
        return txtFax;
    }

    public void setTxtFax(InputText txtFax) {
        this.txtFax = txtFax;
    }

    public InputText getTxtFirmadaPor() {
        return txtFirmadaPor;
    }

    public void setTxtFirmadaPor(InputText txtFirmadaPor) {
        this.txtFirmadaPor = txtFirmadaPor;
    }

    public InputText getTxtFondoArp() {
        return txtFondoArp;
    }

    public void setTxtFondoArp(InputText txtFondoArp) {
        this.txtFondoArp = txtFondoArp;
    }

    public InputText getTxtIbcnoCaja() {
        return txtIbcnoCaja;
    }

    public void setTxtIbcnoCaja(InputText txtIbcnoCaja) {
        this.txtIbcnoCaja = txtIbcnoCaja;
    }

    public InputText getTxtIbcredondeado() {
        return txtIbcredondeado;
    }

    public void setTxtIbcredondeado(InputText txtIbcredondeado) {
        this.txtIbcredondeado = txtIbcredondeado;
    }

    public InputText getTxtIbcresiduoMayor() {
        return txtIbcresiduoMayor;
    }

    public void setTxtIbcresiduoMayor(InputText txtIbcresiduoMayor) {
        this.txtIbcresiduoMayor = txtIbcresiduoMayor;
    }

    public InputText getTxtMasde17hasta18() {
        return txtMasde17hasta18;
    }

    public void setTxtMasde17hasta18(InputText txtMasde17hasta18) {
        this.txtMasde17hasta18 = txtMasde17hasta18;
    }

    public InputText getTxtMasde18hasta19() {
        return txtMasde18hasta19;
    }

    public void setTxtMasde18hasta19(InputText txtMasde18hasta19) {
        this.txtMasde18hasta19 = txtMasde18hasta19;
    }

    public InputText getTxtMasde19hasta20() {
        return txtMasde19hasta20;
    }

    public void setTxtMasde19hasta20(InputText txtMasde19hasta20) {
        this.txtMasde19hasta20 = txtMasde19hasta20;
    }

    public InputText getTxtMayora20() {
        return txtMayora20;
    }

    public void setTxtMayora20(InputText txtMayora20) {
        this.txtMayora20 = txtMayora20;
    }

    public InputText getTxtNit() {
        return txtNit;
    }

    public void setTxtNit(InputText txtNit) {
        this.txtNit = txtNit;
    }

    public InputText getTxtNomContacto() {
        return txtNomContacto;
    }

    public void setTxtNomContacto(InputText txtNomContacto) {
        this.txtNomContacto = txtNomContacto;
    }

    public InputText getTxtNomRegistroPila() {
        return txtNomRegistroPila;
    }

    public void setTxtNomRegistroPila(InputText txtNomRegistroPila) {
        this.txtNomRegistroPila = txtNomRegistroPila;
    }

    public InputText getTxtNotaAlpieRecibo() {
        return txtNotaAlpieRecibo;
    }

    public void setTxtNotaAlpieRecibo(InputText txtNotaAlpieRecibo) {
        this.txtNotaAlpieRecibo = txtNotaAlpieRecibo;
    }

    public InputText getTxtNumeroEmpresas() {
        return txtNumeroEmpresas;
    }

    public void setTxtNumeroEmpresas(InputText txtNumeroEmpresas) {
        this.txtNumeroEmpresas = txtNumeroEmpresas;
    }

    public InputText getTxtObservacion() {
        return txtObservacion;
    }

    public void setTxtObservacion(InputText txtObservacion) {
        this.txtObservacion = txtObservacion;
    }

    public InputText getTxtPagaMesActual() {
        return txtPagaMesActual;
    }

    public void setTxtPagaMesActual(InputText txtPagaMesActual) {
        this.txtPagaMesActual = txtPagaMesActual;
    }

    public InputText getTxtPorAfp() {
        return txtPorAfp;
    }

    public void setTxtPorAfp(InputText txtPorAfp) {
        this.txtPorAfp = txtPorAfp;
    }

    public InputText getTxtPorMoraPlanilla() {
        return txtPorMoraPlanilla;
    }

    public void setTxtPorMoraPlanilla(InputText txtPorMoraPlanilla) {
        this.txtPorMoraPlanilla = txtPorMoraPlanilla;
    }

    public InputText getTxtPorMoraRecibo() {
        return txtPorMoraRecibo;
    }

    public void setTxtPorMoraRecibo(InputText txtPorMoraRecibo) {
        this.txtPorMoraRecibo = txtPorMoraRecibo;
    }

    public InputText getTxtPorcAporteSocial() {
        return txtPorcAporteSocial;
    }

    public void setTxtPorcAporteSocial(InputText txtPorcAporteSocial) {
        this.txtPorcAporteSocial = txtPorcAporteSocial;
    }

    public InputText getTxtPorcCaja() {
        return txtPorcCaja;
    }

    public void setTxtPorcCaja(InputText txtPorcCaja) {
        this.txtPorcCaja = txtPorcCaja;
    }

    public InputText getTxtPorcEps() {
        return txtPorcEps;
    }

    public void setTxtPorcEps(InputText txtPorcEps) {
        this.txtPorcEps = txtPorcEps;
    }

    public InputText getTxtPorcIcbf() {
        return txtPorcIcbf;
    }

    public void setTxtPorcIcbf(InputText txtPorcIcbf) {
        this.txtPorcIcbf = txtPorcIcbf;
    }

    public InputText getTxtPorcIva() {
        return txtPorcIva;
    }

    public void setTxtPorcIva(InputText txtPorcIva) {
        this.txtPorcIva = txtPorcIva;
    }

    public InputText getTxtPorcSena() {
        return txtPorcSena;
    }

    public void setTxtPorcSena(InputText txtPorcSena) {
        this.txtPorcSena = txtPorcSena;
    }

    public InputText getTxtProfesion() {
        return txtProfesion;
    }

    public void setTxtProfesion(InputText txtProfesion) {
        this.txtProfesion = txtProfesion;
    }

    public InputText getTxtRazonSocial() {
        return txtRazonSocial;
    }

    public void setTxtRazonSocial(InputText txtRazonSocial) {
        this.txtRazonSocial = txtRazonSocial;
    }

    public InputText getTxtRiesgo1() {
        return txtRiesgo1;
    }

    public void setTxtRiesgo1(InputText txtRiesgo1) {
        this.txtRiesgo1 = txtRiesgo1;
    }

    public InputText getTxtRiesgo2() {
        return txtRiesgo2;
    }

    public void setTxtRiesgo2(InputText txtRiesgo2) {
        this.txtRiesgo2 = txtRiesgo2;
    }

    public InputText getTxtRiesgo3() {
        return txtRiesgo3;
    }

    public void setTxtRiesgo3(InputText txtRiesgo3) {
        this.txtRiesgo3 = txtRiesgo3;
    }

    public InputText getTxtRiesgo4() {
        return txtRiesgo4;
    }

    public void setTxtRiesgo4(InputText txtRiesgo4) {
        this.txtRiesgo4 = txtRiesgo4;
    }

    public InputText getTxtRiesgo5() {
        return txtRiesgo5;
    }

    public void setTxtRiesgo5(InputText txtRiesgo5) {
        this.txtRiesgo5 = txtRiesgo5;
    }

    public InputText getTxtSalarioBasico() {
        return txtSalarioBasico;
    }

    public void setTxtSalarioBasico(InputText txtSalarioBasico) {
        this.txtSalarioBasico = txtSalarioBasico;
    }

    public InputText getTxtSigla() {
        return txtSigla;
    }

    public void setTxtSigla(InputText txtSigla) {
        this.txtSigla = txtSigla;
    }

    public InputText getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(InputText txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public InputText getTxtTipoAportante() {
        return txtTipoAportante;
    }

    public void setTxtTipoAportante(InputText txtTipoAportante) {
        this.txtTipoAportante = txtTipoAportante;
    }

    public InputText getTxtTipoDocumentoC() {
        return txtTipoDocumentoC;
    }

    public void setTxtTipoDocumentoC(InputText txtTipoDocumentoC) {
        this.txtTipoDocumentoC = txtTipoDocumentoC;
    }

    public InputText getTxtValAdmon() {
        return txtValAdmon;
    }

    public void setTxtValAdmon(InputText txtValAdmon) {
        this.txtValAdmon = txtValAdmon;
    }

    public InputText getTxtValAdmonAfp() {
        return txtValAdmonAfp;
    }

    public void setTxtValAdmonAfp(InputText txtValAdmonAfp) {
        this.txtValAdmonAfp = txtValAdmonAfp;
    }

    public InputText getTxtValorMensajeriaRecibo() {
        return txtValorMensajeriaRecibo;
    }

    public void setTxtValorMensajeriaRecibo(InputText txtValorMensajeriaRecibo) {
        this.txtValorMensajeriaRecibo = txtValorMensajeriaRecibo;
    }

    public InputText getTxtValorReactivacion() {
        return txtValorReactivacion;
    }

    public void setTxtValorReactivacion(InputText txtValorReactivacion) {
        this.txtValorReactivacion = txtValorReactivacion;
    }

    public InputText getTxtValorRetiro() {
        return txtValorRetiro;
    }

    public void setTxtValorRetiro(InputText txtValorRetiro) {
        this.txtValorRetiro = txtValorRetiro;
    }

    public InputText getTxtCodCiudad_Tg000002() {
        return txtCodCiudad_Tg000002;
    }

    public void setTxtCodCiudad_Tg000002(InputText txtCodCiudad_Tg000002) {
        this.txtCodCiudad_Tg000002 = txtCodCiudad_Tg000002;
    }

    public InputText getTxtCodCargo_Tg000006() {
        return txtCodCargo_Tg000006;
    }

    public void setTxtCodCargo_Tg000006(InputText txtCodCargo_Tg000006) {
        this.txtCodCargo_Tg000006 = txtCodCargo_Tg000006;
    }

    public Calendar getTxtFechaPrimerPago() {
        return txtFechaPrimerPago;
    }

    public void setTxtFechaPrimerPago(Calendar txtFechaPrimerPago) {
        this.txtFechaPrimerPago = txtFechaPrimerPago;
    }

    public Calendar getTxtFechaSegundoPago() {
        return txtFechaSegundoPago;
    }

    public void setTxtFechaSegundoPago(Calendar txtFechaSegundoPago) {
        this.txtFechaSegundoPago = txtFechaSegundoPago;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tg000003DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000003();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000003DTO> tg000003DTO) {
        this.data = tg000003DTO;
    }

    public Tg000003DTO getSelectedTg000003() {
        return selectedTg000003;
    }

    public void setSelectedTg000003(Tg000003DTO tg000003) {
        this.selectedTg000003 = tg000003;
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
