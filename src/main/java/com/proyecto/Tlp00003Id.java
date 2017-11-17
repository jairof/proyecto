package com.proyecto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Embeddable
public class Tlp00003Id implements java.io.Serializable {
    @NotNull
    private String numPlanilla;
    @NotNull
    private String codEmpresa;

    public Tlp00003Id() {
    }

    @Column(name = "num_planilla", nullable = false)
    public String getNumPlanilla() {
        return this.numPlanilla;
    }

    public void setNumPlanilla(String numPlanilla) {
        this.numPlanilla = numPlanilla;
    }

    @Column(name = "cod_empresa", nullable = false)
    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }

        if ((other == null)) {
            return false;
        }

        if (!(other instanceof Tlp00003Id)) {
            return false;
        }

        Tlp00003Id castOther = (Tlp00003Id) other;

        return ((this.getNumPlanilla() == castOther.getNumPlanilla()) ||
        ((this.getNumPlanilla() != null) &&
        (castOther.getNumPlanilla() != null) &&
        this.getNumPlanilla().equals(castOther.getNumPlanilla()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getNumPlanilla() == null) ? 0 : this.getNumPlanilla().hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
