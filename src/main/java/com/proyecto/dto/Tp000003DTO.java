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
public class Tp000003DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000003DTO.class);
    private String codEps;
    private String codigoEps;
    private String direccionEps;
    private String dveps;
    private String emailEps;
    private String faxEps;
    private String nitEps;
    private String nomContactoEps;
    private String nombreEps;
    private String numPerPlaniEps;
    private String telefonoEps;
    private String tipoDocumentoEps;

    public String getCodEps() {
        return codEps;
    }

    public void setCodEps(String codEps) {
        this.codEps = codEps;
    }

    public String getCodigoEps() {
        return codigoEps;
    }

    public void setCodigoEps(String codigoEps) {
        this.codigoEps = codigoEps;
    }

    public String getDireccionEps() {
        return direccionEps;
    }

    public void setDireccionEps(String direccionEps) {
        this.direccionEps = direccionEps;
    }

    public String getDveps() {
        return dveps;
    }

    public void setDveps(String dveps) {
        this.dveps = dveps;
    }

    public String getEmailEps() {
        return emailEps;
    }

    public void setEmailEps(String emailEps) {
        this.emailEps = emailEps;
    }

    public String getFaxEps() {
        return faxEps;
    }

    public void setFaxEps(String faxEps) {
        this.faxEps = faxEps;
    }

    public String getNitEps() {
        return nitEps;
    }

    public void setNitEps(String nitEps) {
        this.nitEps = nitEps;
    }

    public String getNomContactoEps() {
        return nomContactoEps;
    }

    public void setNomContactoEps(String nomContactoEps) {
        this.nomContactoEps = nomContactoEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    public String getNumPerPlaniEps() {
        return numPerPlaniEps;
    }

    public void setNumPerPlaniEps(String numPerPlaniEps) {
        this.numPerPlaniEps = numPerPlaniEps;
    }

    public String getTelefonoEps() {
        return telefonoEps;
    }

    public void setTelefonoEps(String telefonoEps) {
        this.telefonoEps = telefonoEps;
    }

    public String getTipoDocumentoEps() {
        return tipoDocumentoEps;
    }

    public void setTipoDocumentoEps(String tipoDocumentoEps) {
        this.tipoDocumentoEps = tipoDocumentoEps;
    }
}
