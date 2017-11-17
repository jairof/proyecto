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
@Table(name = "tg000029", schema = "${schema}")
public class Tg000029 implements java.io.Serializable {
    @NotNull
    private String codSubTipoCotizante;
    private String nombSubTipoCotizante;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000029() {
    }

    public Tg000029(String codSubTipoCotizante, String nombSubTipoCotizante,
        Set<Tp000001> tp000001s) {
        this.codSubTipoCotizante = codSubTipoCotizante;
        this.nombSubTipoCotizante = nombSubTipoCotizante;
        this.tp000001s = tp000001s;
    }

    @Id
    @Column(name = "cod_sub_tipo_cotizante", unique = true, nullable = false)
    public String getCodSubTipoCotizante() {
        return this.codSubTipoCotizante;
    }

    public void setCodSubTipoCotizante(String codSubTipoCotizante) {
        this.codSubTipoCotizante = codSubTipoCotizante;
    }

    @Column(name = "nomb_sub_tipo_cotizante")
    public String getNombSubTipoCotizante() {
        return this.nombSubTipoCotizante;
    }

    public void setNombSubTipoCotizante(String nombSubTipoCotizante) {
        this.nombSubTipoCotizante = nombSubTipoCotizante;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000029")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
