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
@Table(name = "tg000026", schema = "${schema}")
public class Tg000026 implements java.io.Serializable {
    @NotNull
    private String codTipodePlanillas;
    private String desTipodePlanillas;
    private Set<Tlp00001> tlp00001s = new HashSet<Tlp00001>(0);

    public Tg000026() {
    }

    public Tg000026(String codTipodePlanillas, String desTipodePlanillas,
        Set<Tlp00001> tlp00001s) {
        this.codTipodePlanillas = codTipodePlanillas;
        this.desTipodePlanillas = desTipodePlanillas;
        this.tlp00001s = tlp00001s;
    }

    @Id
    @Column(name = "cod_tipode_planillas", unique = true, nullable = false)
    public String getCodTipodePlanillas() {
        return this.codTipodePlanillas;
    }

    public void setCodTipodePlanillas(String codTipodePlanillas) {
        this.codTipodePlanillas = codTipodePlanillas;
    }

    @Column(name = "des_tipode_planillas")
    public String getDesTipodePlanillas() {
        return this.desTipodePlanillas;
    }

    public void setDesTipodePlanillas(String desTipodePlanillas) {
        this.desTipodePlanillas = desTipodePlanillas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000026")
    public Set<Tlp00001> getTlp00001s() {
        return this.tlp00001s;
    }

    public void setTlp00001s(Set<Tlp00001> tlp00001s) {
        this.tlp00001s = tlp00001s;
    }
}
