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
public class Tg000010Id implements java.io.Serializable {
    @NotNull
    private String codSucursal;
    @NotNull
    private String codEmpresa;

    public Tg000010Id() {
    }

    @Column(name = "cod_sucursal", nullable = false)
    public String getCodSucursal() {
        return this.codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
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

        if (!(other instanceof Tg000010Id)) {
            return false;
        }

        Tg000010Id castOther = (Tg000010Id) other;

        return ((this.getCodSucursal() == castOther.getCodSucursal()) ||
        ((this.getCodSucursal() != null) &&
        (castOther.getCodSucursal() != null) &&
        this.getCodSucursal().equals(castOther.getCodSucursal()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodSucursal() == null) ? 0 : this.getCodSucursal().hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
