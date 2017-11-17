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
@Table(name = "tg000013", schema = "${schema}")
public class Tg000013 implements java.io.Serializable {
    @NotNull
    private String codActividad;
    private String desActividad;
    private String nivelRiesgo;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);

    public Tg000013() {
    }

    public Tg000013(String codActividad, String desActividad,
        String nivelRiesgo, Set<Tp000001> tp000001s) {
        this.codActividad = codActividad;
        this.desActividad = desActividad;
        this.nivelRiesgo = nivelRiesgo;
        this.tp000001s = tp000001s;
    }

    @Id
    @Column(name = "cod_actividad", unique = true, nullable = false)
    public String getCodActividad() {
        return this.codActividad;
    }

    public void setCodActividad(String codActividad) {
        this.codActividad = codActividad;
    }

    @Column(name = "des_actividad")
    public String getDesActividad() {
        return this.desActividad;
    }

    public void setDesActividad(String desActividad) {
        this.desActividad = desActividad;
    }

    @Column(name = "nivel_riesgo")
    public String getNivelRiesgo() {
        return this.nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000013")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }
}
