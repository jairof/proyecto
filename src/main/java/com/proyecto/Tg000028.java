package com.proyecto;

import org.hibernate.validator.constraints.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "tg000028", schema = "${schema}")
public class Tg000028 implements java.io.Serializable {
    @NotNull
    private String codTipoCotizante;
    private String nombTipoCotizante;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000028() {
    }

    public Tg000028(String codTipoCotizante, String nombTipoCotizante,
        Set<Tp000001> tp000001s) {
        this.codTipoCotizante = codTipoCotizante;
        this.nombTipoCotizante = nombTipoCotizante;
        this.tp000001s = tp000001s;
    }

    @Id
    @Column(name = "cod_tipo_cotizante", unique = true, nullable = false)
    public String getCodTipoCotizante() {
        return this.codTipoCotizante;
    }

    public void setCodTipoCotizante(String codTipoCotizante) {
        this.codTipoCotizante = codTipoCotizante;
    }

    @Column(name = "nomb_tipo_cotizante")
    public String getNombTipoCotizante() {
        return this.nombTipoCotizante;
    }

    public void setNombTipoCotizante(String nombTipoCotizante) {
        this.nombTipoCotizante = nombTipoCotizante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000028")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
