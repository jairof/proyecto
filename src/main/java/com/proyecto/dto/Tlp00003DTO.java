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
public class Tlp00003DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tlp00003DTO.class);
    private String codEmpresaEmp;
    private String numPlanilla;
    private String codEmpresa;
    private String ing;
    private String planillaAfp;
    private String planillaArp;
    private String planillaEps;
    private String ret;

    public String getCodEmpresaEmp() {
        return codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
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

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getPlanillaAfp() {
        return planillaAfp;
    }

    public void setPlanillaAfp(String planillaAfp) {
        this.planillaAfp = planillaAfp;
    }

    public String getPlanillaArp() {
        return planillaArp;
    }

    public void setPlanillaArp(String planillaArp) {
        this.planillaArp = planillaArp;
    }

    public String getPlanillaEps() {
        return planillaEps;
    }

    public void setPlanillaEps(String planillaEps) {
        this.planillaEps = planillaEps;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }
}
