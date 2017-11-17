package com.proyecto.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.util.Date;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public class Tlp00001DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tlp00001DTO.class);
    private String afp;
    private String arp;
    private String codBanco;
    private String codPeriodo;
    private String codPeriodoPeRiSc;
    private String codigoArp;
    private String codigoSucursal;
    private String consecutivoPlani;
    private String correccionPlanilla;
    private String eps;
    private Date fechaCorteRetiro;
    private Date fechaGenera;
    private Date fechaIngPagoSistema;
    private Date fechaPago;
    private Date fechaPagoPlanillaCorrecion;
    private String formaPresentacion;
    private Date horaGenera;
    private Date horaIngPagoSistema;
    private String numPlanilla;
    private String codEmpresa;
    private String ingUsuariosPagos;
    private Double masIntdemora;
    private String numCheque;
    private String numCuentadelCheque;
    private String numPlanillaCorrecion;
    private Integer numeroMeses;
    private String numerodeCotizantes;
    private String parafiscales;
    private String retUsuariosNoPagos;
    private String tipoAportante;
    private Double valorCheque;
    private Double valorEfectivo;
    private String valorNomina;
    private String codBanco_Tg000001;
    private String codEmpresa_Tg000003;
    private String codTipodePlanillas_Tg000026;

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getArp() {
        return arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public String getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    public String getCodPeriodoPeRiSc() {
        return codPeriodoPeRiSc;
    }

    public void setCodPeriodoPeRiSc(String codPeriodoPeRiSc) {
        this.codPeriodoPeRiSc = codPeriodoPeRiSc;
    }

    public String getCodigoArp() {
        return codigoArp;
    }

    public void setCodigoArp(String codigoArp) {
        this.codigoArp = codigoArp;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getConsecutivoPlani() {
        return consecutivoPlani;
    }

    public void setConsecutivoPlani(String consecutivoPlani) {
        this.consecutivoPlani = consecutivoPlani;
    }

    public String getCorreccionPlanilla() {
        return correccionPlanilla;
    }

    public void setCorreccionPlanilla(String correccionPlanilla) {
        this.correccionPlanilla = correccionPlanilla;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Date getFechaCorteRetiro() {
        return fechaCorteRetiro;
    }

    public void setFechaCorteRetiro(Date fechaCorteRetiro) {
        this.fechaCorteRetiro = fechaCorteRetiro;
    }

    public Date getFechaGenera() {
        return fechaGenera;
    }

    public void setFechaGenera(Date fechaGenera) {
        this.fechaGenera = fechaGenera;
    }

    public Date getFechaIngPagoSistema() {
        return fechaIngPagoSistema;
    }

    public void setFechaIngPagoSistema(Date fechaIngPagoSistema) {
        this.fechaIngPagoSistema = fechaIngPagoSistema;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Date getFechaPagoPlanillaCorrecion() {
        return fechaPagoPlanillaCorrecion;
    }

    public void setFechaPagoPlanillaCorrecion(Date fechaPagoPlanillaCorrecion) {
        this.fechaPagoPlanillaCorrecion = fechaPagoPlanillaCorrecion;
    }

    public String getFormaPresentacion() {
        return formaPresentacion;
    }

    public void setFormaPresentacion(String formaPresentacion) {
        this.formaPresentacion = formaPresentacion;
    }

    public Date getHoraGenera() {
        return horaGenera;
    }

    public void setHoraGenera(Date horaGenera) {
        this.horaGenera = horaGenera;
    }

    public Date getHoraIngPagoSistema() {
        return horaIngPagoSistema;
    }

    public void setHoraIngPagoSistema(Date horaIngPagoSistema) {
        this.horaIngPagoSistema = horaIngPagoSistema;
    }

    public String getNumPlanilla() {
        return numPlanilla;
    }

    public void setNumPlanilla(String numPlanilla) {
        this.numPlanilla = numPlanilla;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getIngUsuariosPagos() {
        return ingUsuariosPagos;
    }

    public void setIngUsuariosPagos(String ingUsuariosPagos) {
        this.ingUsuariosPagos = ingUsuariosPagos;
    }

    public Double getMasIntdemora() {
        return masIntdemora;
    }

    public void setMasIntdemora(Double masIntdemora) {
        this.masIntdemora = masIntdemora;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getNumCuentadelCheque() {
        return numCuentadelCheque;
    }

    public void setNumCuentadelCheque(String numCuentadelCheque) {
        this.numCuentadelCheque = numCuentadelCheque;
    }

    public String getNumPlanillaCorrecion() {
        return numPlanillaCorrecion;
    }

    public void setNumPlanillaCorrecion(String numPlanillaCorrecion) {
        this.numPlanillaCorrecion = numPlanillaCorrecion;
    }

    public Integer getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(Integer numeroMeses) {
        this.numeroMeses = numeroMeses;
    }

    public String getNumerodeCotizantes() {
        return numerodeCotizantes;
    }

    public void setNumerodeCotizantes(String numerodeCotizantes) {
        this.numerodeCotizantes = numerodeCotizantes;
    }

    public String getParafiscales() {
        return parafiscales;
    }

    public void setParafiscales(String parafiscales) {
        this.parafiscales = parafiscales;
    }

    public String getRetUsuariosNoPagos() {
        return retUsuariosNoPagos;
    }

    public void setRetUsuariosNoPagos(String retUsuariosNoPagos) {
        this.retUsuariosNoPagos = retUsuariosNoPagos;
    }

    public String getTipoAportante() {
        return tipoAportante;
    }

    public void setTipoAportante(String tipoAportante) {
        this.tipoAportante = tipoAportante;
    }

    public Double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Double getValorEfectivo() {
        return valorEfectivo;
    }

    public void setValorEfectivo(Double valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    public String getValorNomina() {
        return valorNomina;
    }

    public void setValorNomina(String valorNomina) {
        this.valorNomina = valorNomina;
    }

    public String getCodBanco_Tg000001() {
        return codBanco_Tg000001;
    }

    public void setCodBanco_Tg000001(String codBanco_Tg000001) {
        this.codBanco_Tg000001 = codBanco_Tg000001;
    }

    public String getCodEmpresa_Tg000003() {
        return codEmpresa_Tg000003;
    }

    public void setCodEmpresa_Tg000003(String codEmpresa_Tg000003) {
        this.codEmpresa_Tg000003 = codEmpresa_Tg000003;
    }

    public String getCodTipodePlanillas_Tg000026() {
        return codTipodePlanillas_Tg000026;
    }

    public void setCodTipodePlanillas_Tg000026(
        String codTipodePlanillas_Tg000026) {
        this.codTipodePlanillas_Tg000026 = codTipodePlanillas_Tg000026;
    }
}
