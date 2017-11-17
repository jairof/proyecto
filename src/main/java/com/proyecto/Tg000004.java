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
@Table(name = "tg000004", schema = "${schema}")
public class Tg000004 implements java.io.Serializable {
    @NotNull
    private String codDepto;
    private String nomDepto;
    private Set<Tg000002> tg000002s = new HashSet<Tg000002>(0);

    public Tg000004() {
    }

    public Tg000004(String codDepto, String nomDepto, Set<Tg000002> tg000002s) {
        this.codDepto = codDepto;
        this.nomDepto = nomDepto;
        this.tg000002s = tg000002s;
    }

    @Id
    @Column(name = "cod_depto", unique = true, nullable = false)
    public String getCodDepto() {
        return this.codDepto;
    }

    public void setCodDepto(String codDepto) {
        this.codDepto = codDepto;
    }

    @Column(name = "nom_depto")
    public String getNomDepto() {
        return this.nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000004")
    public Set<Tg000002> getTg000002s() {
        return this.tg000002s;
    }

    public void setTg000002s(Set<Tg000002> tg000002s) {
        this.tg000002s = tg000002s;
    }
}
