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
public class Tg000011Id implements java.io.Serializable {
    @NotNull
    private String codEmpresaEmp;
    @NotNull
    private String codEmpresa;

    public Tg000011Id() {
    }

    @Column(name = "cod_empresa_emp", nullable = false)
    public String getCodEmpresaEmp() {
        return this.codEmpresaEmp;
    }

    public void setCodEmpresaEmp(String codEmpresaEmp) {
        this.codEmpresaEmp = codEmpresaEmp;
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

        if (!(other instanceof Tg000011Id)) {
            return false;
        }

        Tg000011Id castOther = (Tg000011Id) other;

        return ((this.getCodEmpresaEmp() == castOther.getCodEmpresaEmp()) ||
        ((this.getCodEmpresaEmp() != null) &&
        (castOther.getCodEmpresaEmp() != null) &&
        this.getCodEmpresaEmp().equals(castOther.getCodEmpresaEmp()))) &&
        ((this.getCodEmpresa() == castOther.getCodEmpresa()) ||
        ((this.getCodEmpresa() != null) && (castOther.getCodEmpresa() != null) &&
        this.getCodEmpresa().equals(castOther.getCodEmpresa())));
    }

    public int hashCode() {
        int result = 17;

        result = (37 * result) +
            ((getCodEmpresaEmp() == null) ? 0 : this.getCodEmpresaEmp()
                                                    .hashCode());
        result = (37 * result) +
            ((getCodEmpresa() == null) ? 0 : this.getCodEmpresa().hashCode());

        return result;
    }
}
