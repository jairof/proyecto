package com. proyecto.dto;
import java.util.Date;
import java.io.Serializable;
import java.sql.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
* 
*/
public class Tlp00002DTO implements Serializable {

private static final long serialVersionUID = 1L;

private static final Logger log = LoggerFactory.getLogger(Tlp00002DTO.class);

	
		private  String numPlanilla;	
		private  String codiEps;	
		private  String codiArp;	
		private  String codiAfp;	
		private  String codiCaja;	
		private  String cotizante;	
		private  String codEmpresaEmp;	
		private  String ciuLaboralCotizante;	
		private  String depLaboralCotizante;	
		private  String tipocotizante;	
		private  String subTipocotizante;	
		private  Integer diasCotizados;	
		private  Integer diasCotizadosArp;	
		private  Integer diasCotizadosAfp;	
		private  Integer diasCotizadosCaja;	
		private  Double salarioBasico;	
		private  String salarioCIntegral;	
		private  String planillaEps;	
		private  String planillaArp;	
		private  String planillaAfp;	
		private  String planillaCaja;	
		private  String numAuincapacidad;	
		private  Double valorIncapacidad;	
		private  String numAulicenciaM;	
		private  Double valorLicenciaM;	
		private  Double valorUpcAdicional;	
		private  Double ingresoBaseCotizacion;	
		private  Double ingresoBaseCotizacionArp;	
		private  Double ingresoBaseCotizacionAfp;	
		private  Double ingresoBaseCotizacionCaja;	
		private  Double ingresoBaseCotizacionSenaIcbf;	
		private  Double cotizaciónObligatoria;	
		private  Double cotizaciónObligatoriaArp;	
		private  String codigoCentroTrabajo;	
		private  Double cotizaciónObligatoriaAfp;	
		private  Double valorFpsolidaridad;	
		private  Double valorFpsubsistencia;	
		private  Integer riesgos;	
		private  Double porcEps;	
		private  Double porcRiesgo;	
		private  Double porcAfp;	
		private  Double porcCaja;	
		private  Double cotizaciónObligatoriaCaja;	
		private  Double porcSena;	
		private  Double cotizaciónObligatoriaSena;	
		private  Double porcIcbf;	
		private  Double cotizaciónObligatoriaIcbf;	
		private  String detaPlanPrimeraEps;	
		private  String detaPlanPrimeraArp;	
		private  String detaPlanPrimeraAfp;	
		private  String detaPlanPrimeraCaja;	
		private  String ing;	
		private  String ret;	
		private  String tde;	
		private  String tae;	
		private  String codiEpsTraslado;	
		private  String tdp;	
		private  String tap;	
		private  String codiAfpTraslado;	
		private  String tda;	
		private  String taa;	
		private  String vsp;	
		private  String vte;	
		private  String vst;	
		private  String sln;	
		private  String ige;	
		private  String lma;	
		private  String vac;	
		private  String avp;	
		private  String vct;	
		private  String irp;	
		private  String codUsuario;	
		private  String codEps_Tp000003;	
		    
		
		public String getNumPlanilla (){
		 return numPlanilla;
		}
		
		public void setNumPlanilla (String numPlanilla ){
		this.numPlanilla = numPlanilla;
		}
		
		
		public String getCodiEps (){
		 return codiEps;
		}
		
		public void setCodiEps (String codiEps ){
		this.codiEps = codiEps;
		}
		
		
		public String getCodiArp (){
		 return codiArp;
		}
		
		public void setCodiArp (String codiArp ){
		this.codiArp = codiArp;
		}
		
		
		public String getCodiAfp (){
		 return codiAfp;
		}
		
		public void setCodiAfp (String codiAfp ){
		this.codiAfp = codiAfp;
		}
		
		
		public String getCodiCaja (){
		 return codiCaja;
		}
		
		public void setCodiCaja (String codiCaja ){
		this.codiCaja = codiCaja;
		}
		
		
		public String getCotizante (){
		 return cotizante;
		}
		
		public void setCotizante (String cotizante ){
		this.cotizante = cotizante;
		}
		
		
		public String getCodEmpresaEmp (){
		 return codEmpresaEmp;
		}
		
		public void setCodEmpresaEmp (String codEmpresaEmp ){
		this.codEmpresaEmp = codEmpresaEmp;
		}
		
		
		public String getCiuLaboralCotizante (){
		 return ciuLaboralCotizante;
		}
		
		public void setCiuLaboralCotizante (String ciuLaboralCotizante ){
		this.ciuLaboralCotizante = ciuLaboralCotizante;
		}
		
		
		public String getDepLaboralCotizante (){
		 return depLaboralCotizante;
		}
		
		public void setDepLaboralCotizante (String depLaboralCotizante ){
		this.depLaboralCotizante = depLaboralCotizante;
		}
		
		
		public String getTipocotizante (){
		 return tipocotizante;
		}
		
		public void setTipocotizante (String tipocotizante ){
		this.tipocotizante = tipocotizante;
		}
		
		
		public String getSubTipocotizante (){
		 return subTipocotizante;
		}
		
		public void setSubTipocotizante (String subTipocotizante ){
		this.subTipocotizante = subTipocotizante;
		}
		
		
		public Integer getDiasCotizados (){
		 return diasCotizados;
		}
		
		public void setDiasCotizados (Integer diasCotizados ){
		this.diasCotizados = diasCotizados;
		}
		
		
		public Integer getDiasCotizadosArp (){
		 return diasCotizadosArp;
		}
		
		public void setDiasCotizadosArp (Integer diasCotizadosArp ){
		this.diasCotizadosArp = diasCotizadosArp;
		}
		
		
		public Integer getDiasCotizadosAfp (){
		 return diasCotizadosAfp;
		}
		
		public void setDiasCotizadosAfp (Integer diasCotizadosAfp ){
		this.diasCotizadosAfp = diasCotizadosAfp;
		}
		
		
		public Integer getDiasCotizadosCaja (){
		 return diasCotizadosCaja;
		}
		
		public void setDiasCotizadosCaja (Integer diasCotizadosCaja ){
		this.diasCotizadosCaja = diasCotizadosCaja;
		}
		
		
		public Double getSalarioBasico (){
		 return salarioBasico;
		}
		
		public void setSalarioBasico (Double salarioBasico ){
		this.salarioBasico = salarioBasico;
		}
		
		
		public String getSalarioCIntegral (){
		 return salarioCIntegral;
		}
		
		public void setSalarioCIntegral (String salarioCIntegral ){
		this.salarioCIntegral = salarioCIntegral;
		}
		
		
		public String getPlanillaEps (){
		 return planillaEps;
		}
		
		public void setPlanillaEps (String planillaEps ){
		this.planillaEps = planillaEps;
		}
		
		
		public String getPlanillaArp (){
		 return planillaArp;
		}
		
		public void setPlanillaArp (String planillaArp ){
		this.planillaArp = planillaArp;
		}
		
		
		public String getPlanillaAfp (){
		 return planillaAfp;
		}
		
		public void setPlanillaAfp (String planillaAfp ){
		this.planillaAfp = planillaAfp;
		}
		
		
		public String getPlanillaCaja (){
		 return planillaCaja;
		}
		
		public void setPlanillaCaja (String planillaCaja ){
		this.planillaCaja = planillaCaja;
		}
		
		
		public String getNumAuincapacidad (){
		 return numAuincapacidad;
		}
		
		public void setNumAuincapacidad (String numAuincapacidad ){
		this.numAuincapacidad = numAuincapacidad;
		}
		
		
		public Double getValorIncapacidad (){
		 return valorIncapacidad;
		}
		
		public void setValorIncapacidad (Double valorIncapacidad ){
		this.valorIncapacidad = valorIncapacidad;
		}
		
		
		public String getNumAulicenciaM (){
		 return numAulicenciaM;
		}
		
		public void setNumAulicenciaM (String numAulicenciaM ){
		this.numAulicenciaM = numAulicenciaM;
		}
		
		
		public Double getValorLicenciaM (){
		 return valorLicenciaM;
		}
		
		public void setValorLicenciaM (Double valorLicenciaM ){
		this.valorLicenciaM = valorLicenciaM;
		}
		
		
		public Double getValorUpcAdicional (){
		 return valorUpcAdicional;
		}
		
		public void setValorUpcAdicional (Double valorUpcAdicional ){
		this.valorUpcAdicional = valorUpcAdicional;
		}
		
		
		public Double getIngresoBaseCotizacion (){
		 return ingresoBaseCotizacion;
		}
		
		public void setIngresoBaseCotizacion (Double ingresoBaseCotizacion ){
		this.ingresoBaseCotizacion = ingresoBaseCotizacion;
		}
		
		
		public Double getIngresoBaseCotizacionArp (){
		 return ingresoBaseCotizacionArp;
		}
		
		public void setIngresoBaseCotizacionArp (Double ingresoBaseCotizacionArp ){
		this.ingresoBaseCotizacionArp = ingresoBaseCotizacionArp;
		}
		
		
		public Double getIngresoBaseCotizacionAfp (){
		 return ingresoBaseCotizacionAfp;
		}
		
		public void setIngresoBaseCotizacionAfp (Double ingresoBaseCotizacionAfp ){
		this.ingresoBaseCotizacionAfp = ingresoBaseCotizacionAfp;
		}
		
		
		public Double getIngresoBaseCotizacionCaja (){
		 return ingresoBaseCotizacionCaja;
		}
		
		public void setIngresoBaseCotizacionCaja (Double ingresoBaseCotizacionCaja ){
		this.ingresoBaseCotizacionCaja = ingresoBaseCotizacionCaja;
		}
		
		
		public Double getIngresoBaseCotizacionSenaIcbf (){
		 return ingresoBaseCotizacionSenaIcbf;
		}
		
		public void setIngresoBaseCotizacionSenaIcbf (Double ingresoBaseCotizacionSenaIcbf ){
		this.ingresoBaseCotizacionSenaIcbf = ingresoBaseCotizacionSenaIcbf;
		}
		
		
		public Double getCotizaciónObligatoria (){
		 return cotizaciónObligatoria;
		}
		
		public void setCotizaciónObligatoria (Double cotizaciónObligatoria ){
		this.cotizaciónObligatoria = cotizaciónObligatoria;
		}
		
		
		public Double getCotizaciónObligatoriaArp (){
		 return cotizaciónObligatoriaArp;
		}
		
		public void setCotizaciónObligatoriaArp (Double cotizaciónObligatoriaArp ){
		this.cotizaciónObligatoriaArp = cotizaciónObligatoriaArp;
		}
		
		
		public String getCodigoCentroTrabajo (){
		 return codigoCentroTrabajo;
		}
		
		public void setCodigoCentroTrabajo (String codigoCentroTrabajo ){
		this.codigoCentroTrabajo = codigoCentroTrabajo;
		}
		
		
		public Double getCotizaciónObligatoriaAfp (){
		 return cotizaciónObligatoriaAfp;
		}
		
		public void setCotizaciónObligatoriaAfp (Double cotizaciónObligatoriaAfp ){
		this.cotizaciónObligatoriaAfp = cotizaciónObligatoriaAfp;
		}
		
		
		public Double getValorFpsolidaridad (){
		 return valorFpsolidaridad;
		}
		
		public void setValorFpsolidaridad (Double valorFpsolidaridad ){
		this.valorFpsolidaridad = valorFpsolidaridad;
		}
		
		
		public Double getValorFpsubsistencia (){
		 return valorFpsubsistencia;
		}
		
		public void setValorFpsubsistencia (Double valorFpsubsistencia ){
		this.valorFpsubsistencia = valorFpsubsistencia;
		}
		
		
		public Integer getRiesgos (){
		 return riesgos;
		}
		
		public void setRiesgos (Integer riesgos ){
		this.riesgos = riesgos;
		}
		
		
		public Double getPorcEps (){
		 return porcEps;
		}
		
		public void setPorcEps (Double porcEps ){
		this.porcEps = porcEps;
		}
		
		
		public Double getPorcRiesgo (){
		 return porcRiesgo;
		}
		
		public void setPorcRiesgo (Double porcRiesgo ){
		this.porcRiesgo = porcRiesgo;
		}
		
		
		public Double getPorcAfp (){
		 return porcAfp;
		}
		
		public void setPorcAfp (Double porcAfp ){
		this.porcAfp = porcAfp;
		}
		
		
		public Double getPorcCaja (){
		 return porcCaja;
		}
		
		public void setPorcCaja (Double porcCaja ){
		this.porcCaja = porcCaja;
		}
		
		
		public Double getCotizaciónObligatoriaCaja (){
		 return cotizaciónObligatoriaCaja;
		}
		
		public void setCotizaciónObligatoriaCaja (Double cotizaciónObligatoriaCaja ){
		this.cotizaciónObligatoriaCaja = cotizaciónObligatoriaCaja;
		}
		
		
		public Double getPorcSena (){
		 return porcSena;
		}
		
		public void setPorcSena (Double porcSena ){
		this.porcSena = porcSena;
		}
		
		
		public Double getCotizaciónObligatoriaSena (){
		 return cotizaciónObligatoriaSena;
		}
		
		public void setCotizaciónObligatoriaSena (Double cotizaciónObligatoriaSena ){
		this.cotizaciónObligatoriaSena = cotizaciónObligatoriaSena;
		}
		
		
		public Double getPorcIcbf (){
		 return porcIcbf;
		}
		
		public void setPorcIcbf (Double porcIcbf ){
		this.porcIcbf = porcIcbf;
		}
		
		
		public Double getCotizaciónObligatoriaIcbf (){
		 return cotizaciónObligatoriaIcbf;
		}
		
		public void setCotizaciónObligatoriaIcbf (Double cotizaciónObligatoriaIcbf ){
		this.cotizaciónObligatoriaIcbf = cotizaciónObligatoriaIcbf;
		}
		
		
		public String getDetaPlanPrimeraEps (){
		 return detaPlanPrimeraEps;
		}
		
		public void setDetaPlanPrimeraEps (String detaPlanPrimeraEps ){
		this.detaPlanPrimeraEps = detaPlanPrimeraEps;
		}
		
		
		public String getDetaPlanPrimeraArp (){
		 return detaPlanPrimeraArp;
		}
		
		public void setDetaPlanPrimeraArp (String detaPlanPrimeraArp ){
		this.detaPlanPrimeraArp = detaPlanPrimeraArp;
		}
		
		
		public String getDetaPlanPrimeraAfp (){
		 return detaPlanPrimeraAfp;
		}
		
		public void setDetaPlanPrimeraAfp (String detaPlanPrimeraAfp ){
		this.detaPlanPrimeraAfp = detaPlanPrimeraAfp;
		}
		
		
		public String getDetaPlanPrimeraCaja (){
		 return detaPlanPrimeraCaja;
		}
		
		public void setDetaPlanPrimeraCaja (String detaPlanPrimeraCaja ){
		this.detaPlanPrimeraCaja = detaPlanPrimeraCaja;
		}
		
		
		public String getIng (){
		 return ing;
		}
		
		public void setIng (String ing ){
		this.ing = ing;
		}
		
		
		public String getRet (){
		 return ret;
		}
		
		public void setRet (String ret ){
		this.ret = ret;
		}
		
		
		public String getTde (){
		 return tde;
		}
		
		public void setTde (String tde ){
		this.tde = tde;
		}
		
		
		public String getTae (){
		 return tae;
		}
		
		public void setTae (String tae ){
		this.tae = tae;
		}
		
		
		public String getCodiEpsTraslado (){
		 return codiEpsTraslado;
		}
		
		public void setCodiEpsTraslado (String codiEpsTraslado ){
		this.codiEpsTraslado = codiEpsTraslado;
		}
		
		
		public String getTdp (){
		 return tdp;
		}
		
		public void setTdp (String tdp ){
		this.tdp = tdp;
		}
		
		
		public String getTap (){
		 return tap;
		}
		
		public void setTap (String tap ){
		this.tap = tap;
		}
		
		
		public String getCodiAfpTraslado (){
		 return codiAfpTraslado;
		}
		
		public void setCodiAfpTraslado (String codiAfpTraslado ){
		this.codiAfpTraslado = codiAfpTraslado;
		}
		
		
		public String getTda (){
		 return tda;
		}
		
		public void setTda (String tda ){
		this.tda = tda;
		}
		
		
		public String getTaa (){
		 return taa;
		}
		
		public void setTaa (String taa ){
		this.taa = taa;
		}
		
		
		public String getVsp (){
		 return vsp;
		}
		
		public void setVsp (String vsp ){
		this.vsp = vsp;
		}
		
		
		public String getVte (){
		 return vte;
		}
		
		public void setVte (String vte ){
		this.vte = vte;
		}
		
		
		public String getVst (){
		 return vst;
		}
		
		public void setVst (String vst ){
		this.vst = vst;
		}
		
		
		public String getSln (){
		 return sln;
		}
		
		public void setSln (String sln ){
		this.sln = sln;
		}
		
		
		public String getIge (){
		 return ige;
		}
		
		public void setIge (String ige ){
		this.ige = ige;
		}
		
		
		public String getLma (){
		 return lma;
		}
		
		public void setLma (String lma ){
		this.lma = lma;
		}
		
		
		public String getVac (){
		 return vac;
		}
		
		public void setVac (String vac ){
		this.vac = vac;
		}
		
		
		public String getAvp (){
		 return avp;
		}
		
		public void setAvp (String avp ){
		this.avp = avp;
		}
		
		
		public String getVct (){
		 return vct;
		}
		
		public void setVct (String vct ){
		this.vct = vct;
		}
		
		
		public String getIrp (){
		 return irp;
		}
		
		public void setIrp (String irp ){
		this.irp = irp;
		}
		
		
		public String getCodUsuario (){
		 return codUsuario;
		}
		
		public void setCodUsuario (String codUsuario ){
		this.codUsuario = codUsuario;
		}
		
		
		public String getCodEps_Tp000003 (){
		 return codEps_Tp000003;
		}
		
		public void setCodEps_Tp000003 (String codEps_Tp000003 ){
		this.codEps_Tp000003 = codEps_Tp000003;
		}
		
		
	
    }
