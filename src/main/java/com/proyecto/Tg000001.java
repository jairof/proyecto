package com.proyecto;

import org.hibernate.validator.constraints.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.orgddd
*
*/
@Entity
@Table(name = "tg000001", schema = "${schema}")
public class Tg000001 implements java.io.Serializable {
    @NotNull
    private String codBanco;
    private String nomBanco;
    private Set<Tg000008> tg000008s = new HashSet<Tg000008>(0);
    private Set<Tlp00001> tlp00001s = new HashSet<Tlp00001>(0);

    public Tg000001() {
    }

    public Tg000001(String codBanco, String nomBanco, Set<Tg000008> tg000008s,
        Set<Tlp00001> tlp00001s) {
        this.codBanco = codBanco;
        this.nomBanco = nomBanco;
        this.tg000008s = tg000008s;
        this.tlp00001s = tlp00001s;
    }

    @Id
    @Column(name = "cod_banco", unique = true, nullable = false)
    public String getCodBanco() {
        return this.codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    @Column(name = "nom_banco")
    public String getNomBanco() {
        return this.nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000001")
    public Set<Tg000008> getTg000008s() {
        return this.tg000008s;
    }

    public void setTg000008s(Set<Tg000008> tg000008s) {
        this.tg000008s = tg000008s;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000001")
    public Set<Tlp00001> getTlp00001s() {
        return this.tlp00001s;
    }

    public void setTlp00001s(Set<Tlp00001> tlp00001s) {
        this.tlp00001s = tlp00001s;
    }
}
