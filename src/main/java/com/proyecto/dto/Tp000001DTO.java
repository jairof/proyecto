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
public class Tp000001DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000001DTO.class);
    private String afpActiva;
    private String arpActiva;
    private Double basico;
    private String beeper;
    private String cajaActiva;
    private String celular;
    private String ciuCotizante;
    private String ciuLaboralCotizante;
    private String codAsesor;
    private String codAsesor2;
    private String codCotizante;
    private String codIntBarrio;
    private String codigoCentroTrabajoC;
    private String codigoPostal;
    private String colombianoExterior;
    private Double cotisanteValorUpc;
    private String cotizanteEspecial;
    private Double cotizanteValorEsp;
    private String dirCotizante;
    private String emailCotizante;
    private String epsActiva;
    private String estadoCarnetArp;
    private String estadoCarnetCaja;
    private String estadoCivil;
    private String estadoCotizante;
    private Integer estrato;
    private String extranjero;
    private Date fcoberTotal;
    private Date fcoberUrgencia;
    private Date fecInicioAfp;
    private Date fecInicioArp;
    private Date fecInicioCaja;
    private Date fecInicioEps;
    private Date fechaAfiliacion;
    private Date fechaEntregaCarnetArp;
    private Date fechaEntregaCarnetCaja;
    private Date fechaIngresoEmp;
    private Date fechaNacimiento;
    private Date fechaRadicacion;
    private String codEmpresa;
    private String codEmpresaEmp;
    private String idenCotizante;
    private String ipsAtencionCotiza;
    private String ipsDirecionCotiza;
    private String ipsTelefonosCotiza;
    private String nafiliacionAfp;
    private String nafiliacionArp;
    private String nafiliacionCaja;
    private String nafiliacionEps;
    private String numRadicacion;
    private String observacion;
    private String pagaParafiscales;
    private String planilladoRtAfp;
    private String planilladoRtArp;
    private String planilladoRtCaja;
    private String planilladoRtEps;
    private String primerApeCotizante;
    private String primerNomCotizante;
    private String primeraAfp;
    private String primeraArp;
    private String primeraCaja;
    private String primeraEps;
    private String quienRecibeCarnetArp;
    private String quienRecibeCarnetCaja;
    private String rutaFoto;
    private String salarioIntegral;
    private String segundoApeCotizante;
    private String segundoNomCotizante;
    private String sexo;
    private String telCotizante;
    private String tipoAfiliacion;
    private String tipoSalario;
    private Integer zona;
    private String codCiudad_Tg000002;
    private String codProfesion_Tg000012;
    private String codActividad_Tg000013;
    private String codIdentidad_Tg000019;
    private String codTipoCotizante_Tg000028;
    private String codSubTipoCotizante_Tg000029;
    private String codEps_Tp000003;
    private String codArp_Tp000004;
    private String codAfp_Tp000005;
    private String codCaja_Tp000006;

    public String getAfpActiva() {
        return afpActiva;
    }

    public void setAfpActiva(String afpActiva) {
        this.afpActiva = afpActiva;
    }

    public String getArpActiva() {
        return arpActiva;
    }

    public void setArpActiva(String arpActiva) {
        this.arpActiva = arpActiva;
    }

    public Double getBasico() {
        return basico;
    }

    public void setBasico(Double basico) {
        this.basico = basico;
    }

    public String getBeeper() {
        return beeper;
    }

    public void setBeeper(String beeper) {
        this.beeper = beeper;
    }

    public String getCajaActiva() {
        return cajaActiva;
    }

    public void setCajaActiva(String cajaActiva) {
        this.cajaActiva = cajaActiva;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCiuCotizante() {
        return ciuCotizante;
    }

    public void setCiuCotizante(String ciuCotizante) {
        this.ciuCotizante = ciuCotizante;
    }

    public String getCiuLaboralCotizante() {
        return ciuLaboralCotizante;
    }

    public void setCiuLaboralCotizante(String ciuLaboralCotizante) {
        this.ciuLaboralCotizante = ciuLaboralCotizante;
    }

    public String getCodAsesor() {
        return codAsesor;
    }

    public void setCodAsesor(String codAsesor) {
        this.codAsesor = codAsesor;
    }

    public String getCodAsesor2() {
        return codAsesor2;
    }

    public void setCodAsesor2(String codAsesor2) {
        this.codAsesor2 = codAsesor2;
    }

    public String getCodCotizante() {
        return codCotizante;
    }

    public void setCodCotizante(String codCotizante) {
        this.codCotizante = codCotizante;
    }

    public String getCodIntBarrio() {
        return codIntBarrio;
    }

    public void setCodIntBarrio(String codIntBarrio) {
        this.codIntBarrio = codIntBarrio;
    }

    public String getCodigoCentroTrabajoC() {
        return codigoCentroTrabajoC;
    }

    public void setCodigoCentroTrabajoC(String codigoCentroTrabajoC) {
        this.codigoCentroTrabajoC = codigoCentroTrabajoC;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getColombianoExterior() {
        return colombianoExterior;
    }

    public void setColombianoExterior(String colombianoExterior) {
        this.colombianoExterior = colombianoExterior;
    }

    public Double getCotisanteValorUpc() {
        return cotisanteValorUpc;
    }

    public void setCotisanteValorUpc(Double cotisanteValorUpc) {
        this.cotisanteValorUpc = cotisanteValorUpc;
    }

    public String getCotizanteEspecial() {
        return cotizanteEspecial;
    }

    public void setCotizanteEspecial(String cotizanteEspecial) {
        this.cotizanteEspecial = cotizanteEspecial;
    }

    public Double getCotizanteValorEsp() {
        return cotizanteValorEsp;
    }

    public void setCotizanteValorEsp(Double cotizanteValorEsp) {
        this.cotizanteValorEsp = cotizanteValorEsp;
    }

    public String getDirCotizante() {
        return dirCotizante;
    }

    public void setDirCotizante(String dirCotizante) {
        this.dirCotizante = dirCotizante;
    }

    public String getEmailCotizante() {
        return emailCotizante;
    }

    public void setEmailCotizante(String emailCotizante) {
        this.emailCotizante = emailCotizante;
    }

    public String getEpsActiva() {
        return epsActiva;
    }

    public void setEpsActiva(String epsActiva) {
        this.epsActiva = epsActiva;
    }

    public String getEstadoCarnetArp() {
        return estadoCarnetArp;
    }

    public void setEstadoCarnetArp(String estadoCarnetArp) {
        this.estadoCarnetArp = estadoCarnetArp;
    }

    public String getEstadoCarnetCaja() {
        return estadoCarnetCaja;
    }

    public void setEstadoCarnetCaja(String estadoCarnetCaja) {
        this.estadoCarnetCaja = estadoCarnetCaja;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCotizante() {
        return estadoCotizante;
    }

    public void setEstadoCotizante(String estadoCotizante) {
        this.estadoCotizante = estadoCotizante;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(String extranjero) {
        this.extranjero = extranjero;
    }

    public Date getFcoberTotal() {
        return fcoberTotal;
    }

    public void setFcoberTotal(Date fcoberTotal) {
        this.fcoberTotal = fcoberTotal;
    }

    public Date getFcoberUrgencia() {
        return fcoberUrgencia;
    }

    public void setFcoberUrgencia(Date fcoberUrgencia) {
        this.fcoberUrgencia = fcoberUrgencia;
    }

    public Date getFecInicioAfp() {
        return fecInicioAfp;
    }

    public void setFecInicioAfp(Date fecInicioAfp) {
        this.fecInicioAfp = fecInicioAfp;
    }

    public Date getFecInicioArp() {
        return fecInicioArp;
    }

    public void setFecInicioArp(Date fecInicioArp) {
        this.fecInicioArp = fecInicioArp;
    }

    public Date getFecInicioCaja() {
        return fecInicioCaja;
    }

    public void setFecInicioCaja(Date fecInicioCaja) {
        this.fecInicioCaja = fecInicioCaja;
    }

    public Date getFecInicioEps() {
        return fecInicioEps;
    }

    public void setFecInicioEps(Date fecInicioEps) {
        this.fecInicioEps = fecInicioEps;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Date getFechaEntregaCarnetArp() {
        return fechaEntregaCarnetArp;
    }

    public void setFechaEntregaCarnetArp(Date fechaEntregaCarnetArp) {
        this.fechaEntregaCarnetArp = fechaEntregaCarnetArp;
    }

    public Date getFechaEntregaCarnetCaja() {
        return fechaEntregaCarnetCaja;
    }

    public void setFechaEntregaCarnetCaja(Date fechaEntregaCarnetCaja) {
        this.fechaEntregaCarnetCaja = fechaEntregaCarnetCaja;
    }

    public Date getFechaIngresoEmp() {
        return fechaIngresoEmp;
    }

    public void setFechaIngresoEmp(Date fechaIngresoEmp) {
        this.fechaIngresoEmp = fechaIngresoEmp;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRadicacion() {
        return fechaRadicacion;
    }

    public void setFechaRadicacion(Date fechaRadicacion) {
        this.fechaRadicacion = fechaRadicacion;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCodEmpresaEmp() {
        return codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public String getIdenCotizante() {
        return idenCotizante;
    }

    public void setIdenCotizante(String idenCotizante) {
        this.idenCotizante = idenCotizante;
    }

    public String getIpsAtencionCotiza() {
        return ipsAtencionCotiza;
    }

    public void setIpsAtencionCotiza(String ipsAtencionCotiza) {
        this.ipsAtencionCotiza = ipsAtencionCotiza;
    }

    public String getIpsDirecionCotiza() {
        return ipsDirecionCotiza;
    }

    public void setIpsDirecionCotiza(String ipsDirecionCotiza) {
        this.ipsDirecionCotiza = ipsDirecionCotiza;
    }

    public String getIpsTelefonosCotiza() {
        return ipsTelefonosCotiza;
    }

    public void setIpsTelefonosCotiza(String ipsTelefonosCotiza) {
        this.ipsTelefonosCotiza = ipsTelefonosCotiza;
    }

    public String getNafiliacionAfp() {
        return nafiliacionAfp;
    }

    public void setNafiliacionAfp(String nafiliacionAfp) {
        this.nafiliacionAfp = nafiliacionAfp;
    }

    public String getNafiliacionArp() {
        return nafiliacionArp;
    }

    public void setNafiliacionArp(String nafiliacionArp) {
        this.nafiliacionArp = nafiliacionArp;
    }

    public String getNafiliacionCaja() {
        return nafiliacionCaja;
    }

    public void setNafiliacionCaja(String nafiliacionCaja) {
        this.nafiliacionCaja = nafiliacionCaja;
    }

    public String getNafiliacionEps() {
        return nafiliacionEps;
    }

    public void setNafiliacionEps(String nafiliacionEps) {
        this.nafiliacionEps = nafiliacionEps;
    }

    public String getNumRadicacion() {
        return numRadicacion;
    }

    public void setNumRadicacion(String numRadicacion) {
        this.numRadicacion = numRadicacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPagaParafiscales() {
        return pagaParafiscales;
    }

    public void setPagaParafiscales(String pagaParafiscales) {
        this.pagaParafiscales = pagaParafiscales;
    }

    public String getPlanilladoRtAfp() {
        return planilladoRtAfp;
    }

    public void setPlanilladoRtAfp(String planilladoRtAfp) {
        this.planilladoRtAfp = planilladoRtAfp;
    }

    public String getPlanilladoRtArp() {
        return planilladoRtArp;
    }

    public void setPlanilladoRtArp(String planilladoRtArp) {
        this.planilladoRtArp = planilladoRtArp;
    }

    public String getPlanilladoRtCaja() {
        return planilladoRtCaja;
    }

    public void setPlanilladoRtCaja(String planilladoRtCaja) {
        this.planilladoRtCaja = planilladoRtCaja;
    }

    public String getPlanilladoRtEps() {
        return planilladoRtEps;
    }

    public void setPlanilladoRtEps(String planilladoRtEps) {
        this.planilladoRtEps = planilladoRtEps;
    }

    public String getPrimerApeCotizante() {
        return primerApeCotizante;
    }

    public void setPrimerApeCotizante(String primerApeCotizante) {
        this.primerApeCotizante = primerApeCotizante;
    }

    public String getPrimerNomCotizante() {
        return primerNomCotizante;
    }

    public void setPrimerNomCotizante(String primerNomCotizante) {
        this.primerNomCotizante = primerNomCotizante;
    }

    public String getPrimeraAfp() {
        return primeraAfp;
    }

    public void setPrimeraAfp(String primeraAfp) {
        this.primeraAfp = primeraAfp;
    }

    public String getPrimeraArp() {
        return primeraArp;
    }

    public void setPrimeraArp(String primeraArp) {
        this.primeraArp = primeraArp;
    }

    public String getPrimeraCaja() {
        return primeraCaja;
    }

    public void setPrimeraCaja(String primeraCaja) {
        this.primeraCaja = primeraCaja;
    }

    public String getPrimeraEps() {
        return primeraEps;
    }

    public void setPrimeraEps(String primeraEps) {
        this.primeraEps = primeraEps;
    }

    public String getQuienRecibeCarnetArp() {
        return quienRecibeCarnetArp;
    }

    public void setQuienRecibeCarnetArp(String quienRecibeCarnetArp) {
        this.quienRecibeCarnetArp = quienRecibeCarnetArp;
    }

    public String getQuienRecibeCarnetCaja() {
        return quienRecibeCarnetCaja;
    }

    public void setQuienRecibeCarnetCaja(String quienRecibeCarnetCaja) {
        this.quienRecibeCarnetCaja = quienRecibeCarnetCaja;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getSalarioIntegral() {
        return salarioIntegral;
    }

    public void setSalarioIntegral(String salarioIntegral) {
        this.salarioIntegral = salarioIntegral;
    }

    public String getSegundoApeCotizante() {
        return segundoApeCotizante;
    }

    public void setSegundoApeCotizante(String segundoApeCotizante) {
        this.segundoApeCotizante = segundoApeCotizante;
    }

    public String getSegundoNomCotizante() {
        return segundoNomCotizante;
    }

    public void setSegundoNomCotizante(String segundoNomCotizante) {
        this.segundoNomCotizante = segundoNomCotizante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelCotizante() {
        return telCotizante;
    }

    public void setTelCotizante(String telCotizante) {
        this.telCotizante = telCotizante;
    }

    public String getTipoAfiliacion() {
        return tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public String getCodCiudad_Tg000002() {
        return codCiudad_Tg000002;
    }

    public void setCodCiudad_Tg000002(String codCiudad_Tg000002) {
        this.codCiudad_Tg000002 = codCiudad_Tg000002;
    }

    public String getCodProfesion_Tg000012() {
        return codProfesion_Tg000012;
    }

    public void setCodProfesion_Tg000012(String codProfesion_Tg000012) {
        this.codProfesion_Tg000012 = codProfesion_Tg000012;
    }

    public String getCodActividad_Tg000013() {
        return codActividad_Tg000013;
    }

    public void setCodActividad_Tg000013(String codActividad_Tg000013) {
        this.codActividad_Tg000013 = codActividad_Tg000013;
    }

    public String getCodIdentidad_Tg000019() {
        return codIdentidad_Tg000019;
    }

    public void setCodIdentidad_Tg000019(String codIdentidad_Tg000019) {
        this.codIdentidad_Tg000019 = codIdentidad_Tg000019;
    }

    public String getCodTipoCotizante_Tg000028() {
        return codTipoCotizante_Tg000028;
    }

    public void setCodTipoCotizante_Tg000028(String codTipoCotizante_Tg000028) {
        this.codTipoCotizante_Tg000028 = codTipoCotizante_Tg000028;
    }

    public String getCodSubTipoCotizante_Tg000029() {
        return codSubTipoCotizante_Tg000029;
    }

    public void setCodSubTipoCotizante_Tg000029(
        String codSubTipoCotizante_Tg000029) {
        this.codSubTipoCotizante_Tg000029 = codSubTipoCotizante_Tg000029;
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
