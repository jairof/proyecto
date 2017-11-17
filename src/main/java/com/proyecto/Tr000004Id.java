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
public class Tr000004Id implements java.io.Serializable {
    @NotNull
    private Integer consecutivo;
    @NotNull
    private String codEmpresa;

    public Tr000004Id() {
    }

    @Column(name = "consecutivo", nullable = false)
    public Integer getConsecutivo() {
        return this.consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
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

        if (!(other instanceof Tr000004Id)) {
            return false;
        }

        Tr000004Id castOther = (Tr000004Id) other;

        return ((this.getConsecutivo() == castOther.getConsecutivo()) ||
        ((this.getConsecutivo() != null) &&
        (castOther.getConsecutivo() != null) &&
        this.getConsecutivo().equals(castOther.getConsecutivo()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getConsecutivo() == null) ? 0 : this.getConsecutivo().hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
