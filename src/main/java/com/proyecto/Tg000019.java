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
@Table(name = "tg000019", schema = "${schema}")
public class Tg000019 implements java.io.Serializable {
    @NotNull
    private String codIdentidad;
    private String desIdentidad;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000019() {
    }

    public Tg000019(String codIdentidad, String desIdentidad,
        Set<Tp000001> tp000001s) {
        this.codIdentidad = codIdentidad;
        this.desIdentidad = desIdentidad;
        this.tp000001s = tp000001s;
    }

    @Id
    @Column(name = "cod_identidad", unique = true, nullable = false)
    public String getCodIdentidad() {
        return this.codIdentidad;
    }

    public void setCodIdentidad(String codIdentidad) {
        this.codIdentidad = codIdentidad;
    }

    @Column(name = "des_identidad")
    public String getDesIdentidad() {
        return this.desIdentidad;
    }

    public void setDesIdentidad(String desIdentidad) {
        this.desIdentidad = desIdentidad;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000019")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
