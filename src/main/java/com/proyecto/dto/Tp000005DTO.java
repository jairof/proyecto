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
public class Tp000005DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000005DTO.class);
    private String codAfp;
    private String codigoAfp;
    private String direccionAfp;
    private String dvafp;
    private String emailAfp;
    private String faxAfp;
    private String nitAfp;
    private String nomContactoAfp;
    private String nombreAfp;
    private String numPerPlaniAfp;
    private String telefonoAfp;
    private String tipoDocumentoAfp;

    public String getCodAfp() {
        return codAfp;
    }

    public void setCodAfp(String codAfp) {
        this.codAfp = codAfp;
    }

    public String getCodigoAfp() {
        return codigoAfp;
    }

    public void setCodigoAfp(String codigoAfp) {
        this.codigoAfp = codigoAfp;
    }

    public String getDireccionAfp() {
        return direccionAfp;
    }

    public void setDireccionAfp(String direccionAfp) {
        this.direccionAfp = direccionAfp;
    }

    public String getDvafp() {
        return dvafp;
    }

    public void setDvafp(String dvafp) {
        this.dvafp = dvafp;
    }

    public String getEmailAfp() {
        return emailAfp;
    }

    public void setEmailAfp(String emailAfp) {
        this.emailAfp = emailAfp;
    }

    public String getFaxAfp() {
        return faxAfp;
    }

    public void setFaxAfp(String faxAfp) {
        this.faxAfp = faxAfp;
    }

    public String getNitAfp() {
        return nitAfp;
    }

    public void setNitAfp(String nitAfp) {
        this.nitAfp = nitAfp;
    }

    public String getNomContactoAfp() {
        return nomContactoAfp;
    }

    public void setNomContactoAfp(String nomContactoAfp) {
        this.nomContactoAfp = nomContactoAfp;
    }

    public String getNombreAfp() {
        return nombreAfp;
    }

    public void setNombreAfp(String nombreAfp) {
        this.nombreAfp = nombreAfp;
    }

    public String getNumPerPlaniAfp() {
        return numPerPlaniAfp;
    }

    public void setNumPerPlaniAfp(String numPerPlaniAfp) {
        this.numPerPlaniAfp = numPerPlaniAfp;
    }

    public String getTelefonoAfp() {
        return telefonoAfp;
    }

    public void setTelefonoAfp(String telefonoAfp) {
        this.telefonoAfp = telefonoAfp;
    }

    public String getTipoDocumentoAfp() {
        return tipoDocumentoAfp;
    }

    public void setTipoDocumentoAfp(String tipoDocumentoAfp) {
        this.tipoDocumentoAfp = tipoDocumentoAfp;
    }
}
