package com.proyecto;

import org.hibernate.validator.constraints.*;

import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "tlp00003", schema = "${schema}")
public class Tlp00003 implements java.io.Serializable {
    @NotNull
    private Tlp00003Id id;
    @NotNull
    @NotEmpty
    @Size(max = 3)
    private String codEmpresaEmp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ing;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planillaEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ret;

    public Tlp00003() {
    }

    public Tlp00003(Tlp00003Id id, String codEmpresaEmp, String ing,
        String planillaAfp, String planillaArp, String planillaEps, String ret,
        Tlp00001 tlp00001) {
        this.id = id;
        this.codEmpresaEmp = codEmpresaEmp;
        this.ing = ing;
        this.planillaAfp = planillaAfp;
        this.planillaArp = planillaArp;
        this.planillaEps = planillaEps;
        this.ret = ret;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "numPlanilla",column = @Column(name = "num_planilla",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
    })
    public Tlp00003Id getId() {
        return this.id;
    }

    public void setId(Tlp00003Id id) {
        this.id = id;
    }

    @Column(name = "cod_empresa_emp", nullable = false)
    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    @Column(name = "ing", nullable = false)
    public String getIng() {
        return this.ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    @Column(name = "planilla_afp", nullable = false)
    public String getPlanillaAfp() {
        return this.planillaAfp;
    }

    public void setPlanillaAfp(String planillaAfp) {
        this.planillaAfp = planillaAfp;
    }

    @Column(name = "planilla_arp", nullable = false)
    public String getPlanillaArp() {
        return this.planillaArp;
    }

    public void setPlanillaArp(String planillaArp) {
        this.planillaArp = planillaArp;
    }

    @Column(name = "planilla_eps", nullable = false)
    public String getPlanillaEps() {
        return this.planillaEps;
    }

    public void setPlanillaEps(String planillaEps) {
        this.planillaEps = planillaEps;
    }

    @Column(name = "ret", nullable = false)
    public String getRet() {
        return this.ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }
}
