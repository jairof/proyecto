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
@Table(name = "tg000006", schema = "${schema}")
public class Tg000006 implements java.io.Serializable {
    @NotNull
    private String codCargo;
    private String desCargo;
    private Set<Tg000003> tg000003s = new HashSet<Tg000003>(0);

    public Tg000006() {
    }

    public Tg000006(String codCargo, String desCargo, Set<Tg000003> tg000003s) {
        this.codCargo = codCargo;
        this.desCargo = desCargo;
        this.tg000003s = tg000003s;
    }

    @Id
    @Column(name = "cod_cargo", unique = true, nullable = false)
    public String getCodCargo() {
        return this.codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    @Column(name = "des_cargo")
    public String getDesCargo() {
        return this.desCargo;
    }

    public void setDesCargo(String desCargo) {
        this.desCargo = desCargo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tg000006")
    public Set<Tg000003> getTg000003s() {
        return this.tg000003s;
    }

    public void setTg000003s(Set<Tg000003> tg000003s) {
        this.tg000003s = tg000003s;
    }
}
