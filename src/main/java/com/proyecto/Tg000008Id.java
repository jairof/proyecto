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
public class Tg000008Id implements java.io.Serializable {
    @NotNull
    private String codCuenta;
    @NotNull
    private String codEmpresa;

    public Tg000008Id() {
    }

    @Column(name = "cod_cuenta", nullable = false)
    public String getCodCuenta() {
        return this.codCuenta;
    }

    public void setCodCuenta(String codCuenta) {
        this.codCuenta = codCuenta;
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

        if (!(other instanceof Tg000008Id)) {
            return false;
        }

        Tg000008Id castOther = (Tg000008Id) other;

        return ((this.getCodCuenta() == castOther.getCodCuenta()) ||
        ((this.getCodCuenta() != null) && (castOther.getCodCuenta() != null) &&
        this.getCodCuenta().equals(castOther.getCodCuenta()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodCuenta() == null) ? 0 : this.getCodCuenta().hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
