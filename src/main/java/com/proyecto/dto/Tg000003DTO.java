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
public class Tg000003DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000003DTO.class);
    private String apartado;
    private String apeContacto;
    private String codEmpresa;
    private Double cotizacionnoCaja;
    private Double cotizacionredondeada;
    private Double cotizacionresiduoMayor;
    private Double de16hasta17;
    private Double de4amenosde16;
    private String departamentoCargo;
    private String depto;
    private String despedida;
    private String direccion;
    private String dvemp;
    private String email;
    private String fax;
    private Date fechaPrimerPago;
    private Date fechaSegundoPago;
    private String firmadaPor;
    private Double fondoArp;
    private Double ibcnoCaja;
    private Double ibcredondeado;
    private Double ibcresiduoMayor;
    private Double masde17hasta18;
    private Double masde18hasta19;
    private Double masde19hasta20;
    private Double mayora20;
    private String nit;
    private String nomContacto;
    private String nomRegistroPila;
    private String notaAlpieRecibo;
    private String numeroEmpresas;
    private String observacion;
    private String pagaMesActual;
    private Double porAfp;
    private Double porMoraPlanilla;
    private Double porMoraRecibo;
    private Double porcAporteSocial;
    private Double porcCaja;
    private Double porcEps;
    private Double porcIcbf;
    private Double porcIva;
    private Double porcSena;
    private String profesion;
    private String razonSocial;
    private Double riesgo1;
    private Double riesgo2;
    private Double riesgo3;
    private Double riesgo4;
    private Double riesgo5;
    private Double salarioBasico;
    private String sigla;
    private String telefono;
    private String tipoAportante;
    private String tipoDocumentoC;
    private Double valAdmon;
    private Integer valAdmonAfp;
    private Double valorMensajeriaRecibo;
    private Double valorReactivacion;
    private Double valorRetiro;
    private String codCiudad_Tg000002;
    private String codCargo_Tg000006;

    public String getApartado() {
        return apartado;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public String getApeContacto() {
        return apeContacto;
    }

    public void setApeContacto(String apeContacto) {
        this.apeContacto = apeContacto;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Double getCotizacionnoCaja() {
        return cotizacionnoCaja;
    }

    public void setCotizacionnoCaja(Double cotizacionnoCaja) {
        this.cotizacionnoCaja = cotizacionnoCaja;
    }

    public Double getCotizacionredondeada() {
        return cotizacionredondeada;
    }

    public void setCotizacionredondeada(Double cotizacionredondeada) {
        this.cotizacionredondeada = cotizacionredondeada;
    }

    public Double getCotizacionresiduoMayor() {
        return cotizacionresiduoMayor;
    }

    public void setCotizacionresiduoMayor(Double cotizacionresiduoMayor) {
        this.cotizacionresiduoMayor = cotizacionresiduoMayor;
    }

    public Double getDe16hasta17() {
        return de16hasta17;
    }

    public void setDe16hasta17(Double de16hasta17) {
        this.de16hasta17 = de16hasta17;
    }

    public Double getDe4amenosde16() {
        return de4amenosde16;
    }

    public void setDe4amenosde16(Double de4amenosde16) {
        this.de4amenosde16 = de4amenosde16;
    }

    public String getDepartamentoCargo() {
        return departamentoCargo;
    }

    public void setDepartamentoCargo(String departamentoCargo) {
        this.departamentoCargo = departamentoCargo;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDespedida() {
        return despedida;
    }

    public void setDespedida(String despedida) {
        this.despedida = despedida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDvemp() {
        return dvemp;
    }

    public void setDvemp(String dvemp) {
        this.dvemp = dvemp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Date getFechaPrimerPago() {
        return fechaPrimerPago;
    }

    public void setFechaPrimerPago(Date fechaPrimerPago) {
        this.fechaPrimerPago = fechaPrimerPago;
    }

    public Date getFechaSegundoPago() {
        return fechaSegundoPago;
    }

    public void setFechaSegundoPago(Date fechaSegundoPago) {
        this.fechaSegundoPago = fechaSegundoPago;
    }

    public String getFirmadaPor() {
        return firmadaPor;
    }

    public void setFirmadaPor(String firmadaPor) {
        this.firmadaPor = firmadaPor;
    }

    public Double getFondoArp() {
        return fondoArp;
    }

    public void setFondoArp(Double fondoArp) {
        this.fondoArp = fondoArp;
    }

    public Double getIbcnoCaja() {
        return ibcnoCaja;
    }

    public void setIbcnoCaja(Double ibcnoCaja) {
        this.ibcnoCaja = ibcnoCaja;
    }

    public Double getIbcredondeado() {
        return ibcredondeado;
    }

    public void setIbcredondeado(Double ibcredondeado) {
        this.ibcredondeado = ibcredondeado;
    }

    public Double getIbcresiduoMayor() {
        return ibcresiduoMayor;
    }

    public void setIbcresiduoMayor(Double ibcresiduoMayor) {
        this.ibcresiduoMayor = ibcresiduoMayor;
    }

    public Double getMasde17hasta18() {
        return masde17hasta18;
    }

    public void setMasde17hasta18(Double masde17hasta18) {
        this.masde17hasta18 = masde17hasta18;
    }

    public Double getMasde18hasta19() {
        return masde18hasta19;
    }

    public void setMasde18hasta19(Double masde18hasta19) {
        this.masde18hasta19 = masde18hasta19;
    }

    public Double getMasde19hasta20() {
        return masde19hasta20;
    }

    public void setMasde19hasta20(Double masde19hasta20) {
        this.masde19hasta20 = masde19hasta20;
    }

    public Double getMayora20() {
        return mayora20;
    }

    public void setMayora20(Double mayora20) {
        this.mayora20 = mayora20;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getNomRegistroPila() {
        return nomRegistroPila;
    }

    public void setNomRegistroPila(String nomRegistroPila) {
        this.nomRegistroPila = nomRegistroPila;
    }

    public String getNotaAlpieRecibo() {
        return notaAlpieRecibo;
    }

    public void setNotaAlpieRecibo(String notaAlpieRecibo) {
        this.notaAlpieRecibo = notaAlpieRecibo;
    }

    public String getNumeroEmpresas() {
        return numeroEmpresas;
    }

    public void setNumeroEmpresas(String numeroEmpresas) {
        this.numeroEmpresas = numeroEmpresas;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPagaMesActual() {
        return pagaMesActual;
    }

    public void setPagaMesActual(String pagaMesActual) {
        this.pagaMesActual = pagaMesActual;
    }

    public Double getPorAfp() {
        return porAfp;
    }

    public void setPorAfp(Double porAfp) {
        this.porAfp = porAfp;
    }

    public Double getPorMoraPlanilla() {
        return porMoraPlanilla;
    }

    public void setPorMoraPlanilla(Double porMoraPlanilla) {
        this.porMoraPlanilla = porMoraPlanilla;
    }

    public Double getPorMoraRecibo() {
        return porMoraRecibo;
    }

    public void setPorMoraRecibo(Double porMoraRecibo) {
        this.porMoraRecibo = porMoraRecibo;
    }

    public Double getPorcAporteSocial() {
        return porcAporteSocial;
    }

    public void setPorcAporteSocial(Double porcAporteSocial) {
        this.porcAporteSocial = porcAporteSocial;
    }

    public Double getPorcCaja() {
        return porcCaja;
    }

    public void setPorcCaja(Double porcCaja) {
        this.porcCaja = porcCaja;
    }

    public Double getPorcEps() {
        return porcEps;
    }

    public void setPorcEps(Double porcEps) {
        this.porcEps = porcEps;
    }

    public Double getPorcIcbf() {
        return porcIcbf;
    }

    public void setPorcIcbf(Double porcIcbf) {
        this.porcIcbf = porcIcbf;
    }

    public Double getPorcIva() {
        return porcIva;
    }

    public void setPorcIva(Double porcIva) {
        this.porcIva = porcIva;
    }

    public Double getPorcSena() {
        return porcSena;
    }

    public void setPorcSena(Double porcSena) {
        this.porcSena = porcSena;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Double getRiesgo1() {
        return riesgo1;
    }

    public void setRiesgo1(Double riesgo1) {
        this.riesgo1 = riesgo1;
    }

    public Double getRiesgo2() {
        return riesgo2;
    }

    public void setRiesgo2(Double riesgo2) {
        this.riesgo2 = riesgo2;
    }

    public Double getRiesgo3() {
        return riesgo3;
    }

    public void setRiesgo3(Double riesgo3) {
        this.riesgo3 = riesgo3;
    }

    public Double getRiesgo4() {
        return riesgo4;
    }

    public void setRiesgo4(Double riesgo4) {
        this.riesgo4 = riesgo4;
    }

    public Double getRiesgo5() {
        return riesgo5;
    }

    public void setRiesgo5(Double riesgo5) {
        this.riesgo5 = riesgo5;
    }

    public Double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(Double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoAportante() {
        return tipoAportante;
    }

    public void setTipoAportante(String tipoAportante) {
        this.tipoAportante = tipoAportante;
    }

    public String getTipoDocumentoC() {
        return tipoDocumentoC;
    }

    public void setTipoDocumentoC(String tipoDocumentoC) {
        this.tipoDocumentoC = tipoDocumentoC;
    }

    public Double getValAdmon() {
        return valAdmon;
    }

    public void setValAdmon(Double valAdmon) {
        this.valAdmon = valAdmon;
    }

    public Integer getValAdmonAfp() {
        return valAdmonAfp;
    }

    public void setValAdmonAfp(Integer valAdmonAfp) {
        this.valAdmonAfp = valAdmonAfp;
    }

    public Double getValorMensajeriaRecibo() {
        return valorMensajeriaRecibo;
    }

    public void setValorMensajeriaRecibo(Double valorMensajeriaRecibo) {
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
    }

    public Double getValorReactivacion() {
        return valorReactivacion;
    }

    public void setValorReactivacion(Double valorReactivacion) {
        this.valorReactivacion = valorReactivacion;
    }

    public Double getValorRetiro() {
        return valorRetiro;
    }

    public void setValorRetiro(Double valorRetiro) {
        this.valorRetiro = valorRetiro;
    }

    public String getCodCiudad_Tg000002() {
        return codCiudad_Tg000002;
    }

    public void setCodCiudad_Tg000002(String codCiudad_Tg000002) {
        this.codCiudad_Tg000002 = codCiudad_Tg000002;
    }

    public String getCodCargo_Tg000006() {
        return codCargo_Tg000006;
    }

    public void setCodCargo_Tg000006(String codCargo_Tg000006) {
        this.codCargo_Tg000006 = codCargo_Tg000006;
    }
}
