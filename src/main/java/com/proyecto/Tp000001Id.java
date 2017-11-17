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
public class Tp000001Id implements java.io.Serializable {
    @NotNull
    private String codEmpresa;
    @NotNull
    private String codEmpresaEmp;

    public Tp000001Id() {
    }

    @Column(name = "cod_empresa", nullable = false)
    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    @Column(name = "cod_empresa_emp", nullable = false)
    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }

        if ((other == null)) {
            return false;
        }

        if (!(other instanceof Tp000001Id)) {
            return false;
        }

        Tp000001Id castOther = (Tp000001Id) other;

        return ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa()))) &&
        ((this.getCodEmpresaEmp() == castOther.getCodEmpresaEmp()) ||
        ((this.getCodEmpresaEmp() != null) &&
        (castOther.getCodEmpresaEmp() != null) &&
        this.getCodEmpresaEmp().equals(castOther.getCodEmpresaEmp())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());
        result = (37 * result) +
            ((getCodEmpresaEmp() == null) ? 0 : this.getCodEmpresaEmp()
                                                    .hashCode());

        return result;
    }
}
