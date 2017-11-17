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
public class Tg000011DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000011DTO.class);
    private String ativa;
    private String ciudad;
    private String depto;
    private String dirEmpresa;
    private String dvempaf;
    private String emailEmpresa;
    private String faxEmpresa;
    private String codEmpresaEmp;
    private String codEmpresa;
    private String nitEmpresa;
    private String nomContacto;
    private String nomEmpresa;
    private String telEmpresa;
    private String tipoDocumentoEmpaf;
    private String codEmpresa_Tg000003;

    public String getAtiva() {
        return ativa;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getDirEmpresa() {
        return dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    public String getDvempaf() {
        return dvempaf;
    }

    public void setDvempaf(String dvempaf) {
        this.dvempaf = dvempaf;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getFaxEmpresa() {
        return faxEmpresa;
    }

    public void setFaxEmpresa(String faxEmpresa) {
        this.faxEmpresa = faxEmpresa;
    }

    public String getCodEmpresaEmp() {
        return codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    public String getTipoDocumentoEmpaf() {
        return tipoDocumentoEmpaf;
    }

    public void setTipoDocumentoEmpaf(String tipoDocumentoEmpaf) {
        this.tipoDocumentoEmpaf = tipoDocumentoEmpaf;
    }

    public String getCodEmpresa_Tg000003() {
        return codEmpresa_Tg000003;
    }

    public void setCodEmpresa_Tg000003(String codEmpresa_Tg000003) {
        this.codEmpresa_Tg000003 = codEmpresa_Tg000003;
    }
}
