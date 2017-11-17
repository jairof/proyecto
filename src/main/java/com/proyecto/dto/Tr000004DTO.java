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
public class Tr000004DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tr000004DTO.class);
    private String afiliacion;
    private String afiliacionporcobrar;
    private String afp;
    private String anulado;
    private String arp;
    private String caja;
    private String codBancoCheque;
    private String codBancoConsignacion;
    private String codUsuario;
    private Integer codigoPagoMes;
    private Double comisionAsesor;
    private String cuota;
    private String cuotaporcobrar;
    private Integer diasCotizadosAfp;
    private Integer diasCotizadosArp;
    private Integer diasCotizadosCaja;
    private Integer diasCotizadosEps;
    private String eps;
    private String facturado;
    private Double faltanteConsignacion;
    private Date fechaIngPagoSistema;
    private Date fechaPago;
    private Date horaIngPagoSistema;
    private Date horaPago;
    private Double ibc;
    private Integer consecutivo;
    private String codEmpresa;
    private String idenEmpresa;
    private String identificacion;
    private String numCheque;
    private String numConsignacion;
    private String numCuentaCobro;
    private String numPersonas;
    private String otros;
    private String pagoCheque;
    private String pagoConsignacion;
    private String pagoEfectivo;
    private String pagoRetiro;
    private String pagoRetiroporcobrar;
    private String periodo;
    private String periodoRp;
    private String planilladoAfp;
    private String planilladoArp;
    private String planilladoCaja;
    private String planilladoEps;
    private Double porcRiesgo;
    private String reactivacion;
    private String reactivacionporcobrar;
    private String recibPrimeraAfp;
    private String recibPrimeraArp;
    private String recibPrimeraCaja;
    private String recibPrimeraEps;
    private String reciboCuentaCobro;
    private Integer riesgos;
    private Double valAdmonAfprec;
    private Double valAdmonRec;
    private Double valorAfiliacion;
    private Double valorCheque;
    private Double valorConsignacion;
    private Double valorDiasCotizadosAfp;
    private Double valorDiasCotizadosArp;
    private Double valorDiasCotizadosCaja;
    private Double valorDiasCotizadosEps;
    private Double valorEfectivo;
    private Double valorFpsolidaridad;
    private Double valorFpsubsistencia;
    private Double valorIcbf;
    private Double valorMensajeriaRecibo;
    private Double valorMora;
    private Double valorOtrosServicios;
    private Double valorPagoMora;
    private Double valorPagoUpc;
    private Double valorReactivacion;
    private Double valorSalario;
    private Double valorSena;
    private Double valorTotal;
    private String valorenletras;
    private String codEmpresa_Tg000003;
    private String codEps_Tp000003;
    private String codArp_Tp000004;
    private String codAfp_Tp000005;
    private String codCaja_Tp000006;

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getAfiliacionporcobrar() {
        return afiliacionporcobrar;
    }

    public void setAfiliacionporcobrar(String afiliacionporcobrar) {
        this.afiliacionporcobrar = afiliacionporcobrar;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public String getArp() {
        return arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getCodBancoCheque() {
        return codBancoCheque;
    }

    public void setCodBancoCheque(String codBancoCheque) {
        this.codBancoCheque = codBancoCheque;
    }

    public String getCodBancoConsignacion() {
        return codBancoConsignacion;
    }

    public void setCodBancoConsignacion(String codBancoConsignacion) {
        this.codBancoConsignacion = codBancoConsignacion;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodigoPagoMes() {
        return codigoPagoMes;
    }

    public void setCodigoPagoMes(Integer codigoPagoMes) {
        this.codigoPagoMes = codigoPagoMes;
    }

    public Double getComisionAsesor() {
        return comisionAsesor;
    }

    public void setComisionAsesor(Double comisionAsesor) {
        this.comisionAsesor = comisionAsesor;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getCuotaporcobrar() {
        return cuotaporcobrar;
    }

    public void setCuotaporcobrar(String cuotaporcobrar) {
        this.cuotaporcobrar = cuotaporcobrar;
    }

    public Integer getDiasCotizadosAfp() {
        return diasCotizadosAfp;
    }

    public void setDiasCotizadosAfp(Integer diasCotizadosAfp) {
        this.diasCotizadosAfp = diasCotizadosAfp;
    }

    public Integer getDiasCotizadosArp() {
        return diasCotizadosArp;
    }

    public void setDiasCotizadosArp(Integer diasCotizadosArp) {
        this.diasCotizadosArp = diasCotizadosArp;
    }

    public Integer getDiasCotizadosCaja() {
        return diasCotizadosCaja;
    }

    public void setDiasCotizadosCaja(Integer diasCotizadosCaja) {
        this.diasCotizadosCaja = diasCotizadosCaja;
    }

    public Integer getDiasCotizadosEps() {
        return diasCotizadosEps;
    }

    public void setDiasCotizadosEps(Integer diasCotizadosEps) {
        this.diasCotizadosEps = diasCotizadosEps;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getFacturado() {
        return facturado;
    }

    public void setFacturado(String facturado) {
        this.facturado = facturado;
    }

    public Double getFaltanteConsignacion() {
        return faltanteConsignacion;
    }

    public void setFaltanteConsignacion(Double faltanteConsignacion) {
        this.faltanteConsignacion = faltanteConsignacion;
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

    public Date getHoraIngPagoSistema() {
        return horaIngPagoSistema;
    }

    public void setHoraIngPagoSistema(Date horaIngPagoSistema) {
        this.horaIngPagoSistema = horaIngPagoSistema;
    }

    public Date getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(Date horaPago) {
        this.horaPago = horaPago;
    }

    public Double getIbc() {
        return ibc;
    }

    public void setIbc(Double ibc) {
        this.ibc = ibc;
    }

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getIdenEmpresa() {
        return idenEmpresa;
    }

    public void setIdenEmpresa(String idenEmpresa) {
        this.idenEmpresa = idenEmpresa;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getNumConsignacion() {
        return numConsignacion;
    }

    public void setNumConsignacion(String numConsignacion) {
        this.numConsignacion = numConsignacion;
    }

    public String getNumCuentaCobro() {
        return numCuentaCobro;
    }

    public void setNumCuentaCobro(String numCuentaCobro) {
        this.numCuentaCobro = numCuentaCobro;
    }

    public String getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getPagoCheque() {
        return pagoCheque;
    }

    public void setPagoCheque(String pagoCheque) {
        this.pagoCheque = pagoCheque;
    }

    public String getPagoConsignacion() {
        return pagoConsignacion;
    }

    public void setPagoConsignacion(String pagoConsignacion) {
        this.pagoConsignacion = pagoConsignacion;
    }

    public String getPagoEfectivo() {
        return pagoEfectivo;
    }

    public void setPagoEfectivo(String pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public String getPagoRetiro() {
        return pagoRetiro;
    }

    public void setPagoRetiro(String pagoRetiro) {
        this.pagoRetiro = pagoRetiro;
    }

    public String getPagoRetiroporcobrar() {
        return pagoRetiroporcobrar;
    }

    public void setPagoRetiroporcobrar(String pagoRetiroporcobrar) {
        this.pagoRetiroporcobrar = pagoRetiroporcobrar;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodoRp() {
        return periodoRp;
    }

    public void setPeriodoRp(String periodoRp) {
        this.periodoRp = periodoRp;
    }

    public String getPlanilladoAfp() {
        return planilladoAfp;
    }

    public void setPlanilladoAfp(String planilladoAfp) {
        this.planilladoAfp = planilladoAfp;
    }

    public String getPlanilladoArp() {
        return planilladoArp;
    }

    public void setPlanilladoArp(String planilladoArp) {
        this.planilladoArp = planilladoArp;
    }

    public String getPlanilladoCaja() {
        return planilladoCaja;
    }

    public void setPlanilladoCaja(String planilladoCaja) {
        this.planilladoCaja = planilladoCaja;
    }

    public String getPlanilladoEps() {
        return planilladoEps;
    }

    public void setPlanilladoEps(String planilladoEps) {
        this.planilladoEps = planilladoEps;
    }

    public Double getPorcRiesgo() {
        return porcRiesgo;
    }

    public void setPorcRiesgo(Double porcRiesgo) {
        this.porcRiesgo = porcRiesgo;
    }

    public String getReactivacion() {
        return reactivacion;
    }

    public void setReactivacion(String reactivacion) {
        this.reactivacion = reactivacion;
    }

    public String getReactivacionporcobrar() {
        return reactivacionporcobrar;
    }

    public void setReactivacionporcobrar(String reactivacionporcobrar) {
        this.reactivacionporcobrar = reactivacionporcobrar;
    }

    public String getRecibPrimeraAfp() {
        return recibPrimeraAfp;
    }

    public void setRecibPrimeraAfp(String recibPrimeraAfp) {
        this.recibPrimeraAfp = recibPrimeraAfp;
    }

    public String getRecibPrimeraArp() {
        return recibPrimeraArp;
    }

    public void setRecibPrimeraArp(String recibPrimeraArp) {
        this.recibPrimeraArp = recibPrimeraArp;
    }

    public String getRecibPrimeraCaja() {
        return recibPrimeraCaja;
    }

    public void setRecibPrimeraCaja(String recibPrimeraCaja) {
        this.recibPrimeraCaja = recibPrimeraCaja;
    }

    public String getRecibPrimeraEps() {
        return recibPrimeraEps;
    }

    public void setRecibPrimeraEps(String recibPrimeraEps) {
        this.recibPrimeraEps = recibPrimeraEps;
    }

    public String getReciboCuentaCobro() {
        return reciboCuentaCobro;
    }

    public void setReciboCuentaCobro(String reciboCuentaCobro) {
        this.reciboCuentaCobro = reciboCuentaCobro;
    }

    public Integer getRiesgos() {
        return riesgos;
    }

    public void setRiesgos(Integer riesgos) {
        this.riesgos = riesgos;
    }

    public Double getValAdmonAfprec() {
        return valAdmonAfprec;
    }

    public void setValAdmonAfprec(Double valAdmonAfprec) {
        this.valAdmonAfprec = valAdmonAfprec;
    }

    public Double getValAdmonRec() {
        return valAdmonRec;
    }

    public void setValAdmonRec(Double valAdmonRec) {
        this.valAdmonRec = valAdmonRec;
    }

    public Double getValorAfiliacion() {
        return valorAfiliacion;
    }

    public void setValorAfiliacion(Double valorAfiliacion) {
        this.valorAfiliacion = valorAfiliacion;
    }

    public Double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public Double getValorConsignacion() {
        return valorConsignacion;
    }

    public void setValorConsignacion(Double valorConsignacion) {
        this.valorConsignacion = valorConsignacion;
    }

    public Double getValorDiasCotizadosAfp() {
        return valorDiasCotizadosAfp;
    }

    public void setValorDiasCotizadosAfp(Double valorDiasCotizadosAfp) {
        this.valorDiasCotizadosAfp = valorDiasCotizadosAfp;
    }

    public Double getValorDiasCotizadosArp() {
        return valorDiasCotizadosArp;
    }

    public void setValorDiasCotizadosArp(Double valorDiasCotizadosArp) {
        this.valorDiasCotizadosArp = valorDiasCotizadosArp;
    }

    public Double getValorDiasCotizadosCaja() {
        return valorDiasCotizadosCaja;
    }

    public void setValorDiasCotizadosCaja(Double valorDiasCotizadosCaja) {
        this.valorDiasCotizadosCaja = valorDiasCotizadosCaja;
    }

    public Double getValorDiasCotizadosEps() {
        return valorDiasCotizadosEps;
    }

    public void setValorDiasCotizadosEps(Double valorDiasCotizadosEps) {
        this.valorDiasCotizadosEps = valorDiasCotizadosEps;
    }

    public Double getValorEfectivo() {
        return valorEfectivo;
    }

    public void setValorEfectivo(Double valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    public Double getValorFpsolidaridad() {
        return valorFpsolidaridad;
    }

    public void setValorFpsolidaridad(Double valorFpsolidaridad) {
        this.valorFpsolidaridad = valorFpsolidaridad;
    }

    public Double getValorFpsubsistencia() {
        return valorFpsubsistencia;
    }

    public void setValorFpsubsistencia(Double valorFpsubsistencia) {
        this.valorFpsubsistencia = valorFpsubsistencia;
    }

    public Double getValorIcbf() {
        return valorIcbf;
    }

    public void setValorIcbf(Double valorIcbf) {
        this.valorIcbf = valorIcbf;
    }

    public Double getValorMensajeriaRecibo() {
        return valorMensajeriaRecibo;
    }

    public void setValorMensajeriaRecibo(Double valorMensajeriaRecibo) {
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
    }

    public Double getValorMora() {
        return valorMora;
    }

    public void setValorMora(Double valorMora) {
        this.valorMora = valorMora;
    }

    public Double getValorOtrosServicios() {
        return valorOtrosServicios;
    }

    public void setValorOtrosServicios(Double valorOtrosServicios) {
        this.valorOtrosServicios = valorOtrosServicios;
    }

    public Double getValorPagoMora() {
        return valorPagoMora;
    }

    public void setValorPagoMora(Double valorPagoMora) {
        this.valorPagoMora = valorPagoMora;
    }

    public Double getValorPagoUpc() {
        return valorPagoUpc;
    }

    public void setValorPagoUpc(Double valorPagoUpc) {
        this.valorPagoUpc = valorPagoUpc;
    }

    public Double getValorReactivacion() {
        return valorReactivacion;
    }

    public void setValorReactivacion(Double valorReactivacion) {
        this.valorReactivacion = valorReactivacion;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Double getValorSena() {
        return valorSena;
    }

    public void setValorSena(Double valorSena) {
        this.valorSena = valorSena;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getValorenletras() {
        return valorenletras;
    }

    public void setValorenletras(String valorenletras) {
        this.valorenletras = valorenletras;
    }

    public String getCodEmpresa_Tg000003() {
        return codEmpresa_Tg000003;
    }

    public void setCodEmpresa_Tg000003(String codEmpresa_Tg000003) {
        this.codEmpresa_Tg000003 = codEmpresa_Tg000003;
    }

    public String getCodEps_Tp000003() {
        return codEps_Tp000003;
    }

    public void setCodEps_Tp000003(String codEps_Tp000003) {
        this.codEps_Tp000003 = codEps_Tp000003;
    }

    public String getCodArp_Tp000004() {
        return codArp_Tp000004;
    }

    public void setCodArp_Tp000004(String codArp_Tp000004) {
        this.codArp_Tp000004 = codArp_Tp000004;
    }

    public String getCodAfp_Tp000005() {
        return codAfp_Tp000005;
    }

    public void setCodAfp_Tp000005(String codAfp_Tp000005) {
        this.codAfp_Tp000005 = codAfp_Tp000005;
    }

    public String getCodCaja_Tp000006() {
        return codCaja_Tp000006;
    }

    public void setCodCaja_Tp000006(String codCaja_Tp000006) {
        this.codCaja_Tp000006 = codCaja_Tp000006;
    }
}
