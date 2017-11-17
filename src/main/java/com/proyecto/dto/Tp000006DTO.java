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
public class Tp000006DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000006DTO.class);
    private String cajaPrincipal;
    private String codCaja;
    private String codDepto;
    private String codEmpresa;
    private String codigoCaja;
    private String direccionCaja;
    private String dvcaja;
    private String emailCaja;
    private String faxCaja;
    private String nitCaja;
    private String noPagoCaja;
    private String nomContactoCaja;
    private String nombreCaja;
    private String numPerPlaniCaja;
    private String telefonoCaja;
    private String tipoDocumentoCaja;

    public String getCajaPrincipal() {
        return cajaPrincipal;
    }

    public void setCajaPrincipal(String cajaPrincipal) {
        this.cajaPrincipal = cajaPrincipal;
    }

    public String getCodCaja() {
        return codCaja;
    }

    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }

    public String getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCodigoCaja() {
        return codigoCaja;
    }

    public void setCodigoCaja(String codigoCaja) {
        this.codigoCaja = codigoCaja;
    }

    public String getDireccionCaja() {
        return direccionCaja;
    }

    public void setDireccionCaja(String direccionCaja) {
        this.direccionCaja = direccionCaja;
    }

    public String getDvcaja() {
        return dvcaja;
    }

    public void setDvcaja(String dvcaja) {
        this.dvcaja = dvcaja;
    }

    public String getEmailCaja() {
        return emailCaja;
    }

    public void setEmailCaja(String emailCaja) {
        this.emailCaja = emailCaja;
    }

    public String getFaxCaja() {
        return faxCaja;
    }

    public void setFaxCaja(String faxCaja) {
        this.faxCaja = faxCaja;
    }

    public String getNitCaja() {
        return nitCaja;
    }

    public void setNitCaja(String nitCaja) {
        this.nitCaja = nitCaja;
    }

    public String getNoPagoCaja() {
        return noPagoCaja;
    }

    public void setNoPagoCaja(String noPagoCaja) {
        this.noPagoCaja = noPagoCaja;
    }

    public String getNomContactoCaja() {
        return nomContactoCaja;
    }

    public void setNomContactoCaja(String nomContactoCaja) {
        this.nomContactoCaja = nomContactoCaja;
    }

    public String getNombreCaja() {
        return nombreCaja;
    }

    public void setNombreCaja(String nombreCaja) {
        this.nombreCaja = nombreCaja;
    }

    public String getNumPerPlaniCaja() {
        return numPerPlaniCaja;
    }

    public void setNumPerPlaniCaja(String numPerPlaniCaja) {
        this.numPerPlaniCaja = numPerPlaniCaja;
    }

    public String getTelefonoCaja() {
        return telefonoCaja;
    }

    public void setTelefonoCaja(String telefonoCaja) {
        this.telefonoCaja = telefonoCaja;
    }

    public String getTipoDocumentoCaja() {
        return tipoDocumentoCaja;
    }

    public void setTipoDocumentoCaja(String tipoDocumentoCaja) {
        this.tipoDocumentoCaja = tipoDocumentoCaja;
    }
}
