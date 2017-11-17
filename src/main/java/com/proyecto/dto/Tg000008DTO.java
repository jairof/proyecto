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
public class Tg000008DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000008DTO.class);
    private Integer chequeActivo;
    private Integer chequeUltimo;
    private Integer chequeprimer;
    private String consignacionClientes;
    private String codCuenta;
    private String codEmpresa;
    private Integer ncheques;
    private String numcuenta;
    private String tipoCuenta;
    private String codBanco_Tg000001;
    private String codEmpresa_Tg000003;

    public Integer getChequeActivo() {
        return chequeActivo;
    }

    public void setChequeActivo(Integer chequeActivo) {
        this.chequeActivo = chequeActivo;
    }

    public Integer getChequeUltimo() {
        return chequeUltimo;
    }

    public void setChequeUltimo(Integer chequeUltimo) {
        this.chequeUltimo = chequeUltimo;
    }

    public Integer getChequeprimer() {
        return chequeprimer;
    }

    public void setChequeprimer(Integer chequeprimer) {
        this.chequeprimer = chequeprimer;
    }

    public String getConsignacionClientes() {
        return consignacionClientes;
    }

    public void setConsignacionClientes(String consignacionClientes) {
        this.consignacionClientes = consignacionClientes;
    }

    public String getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(String codCuenta) {
        this.codCuenta = codCuenta;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Integer getNcheques() {
        return ncheques;
    }

    public void setNcheques(Integer ncheques) {
        this.ncheques = ncheques;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
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
}
