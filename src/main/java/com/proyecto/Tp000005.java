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
@Table(name = "tp000005", schema = "${schema}")
public class Tp000005 implements java.io.Serializable {
    @NotNull
    private String codAfp;
    private String codigoAfp;
    private String direccionAfp;
    private String dvafp;
    private String emailAfp;
    private String faxAfp;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitAfp;
    private String nomContactoAfp;
    private String nombreAfp;
    private String numPerPlaniAfp;
    private String telefonoAfp;
    private String tipoDocumentoAfp;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000005() {
    }

    public Tp000005(String codAfp, String codigoAfp, String direccionAfp,
        String dvafp, String emailAfp, String faxAfp, String nitAfp,
        String nomContactoAfp, String nombreAfp, String numPerPlaniAfp,
        String telefonoAfp, String tipoDocumentoAfp, Set<Tp000001> tp000001s,
        Set<Tr000004> tr000004s) {
        this.codAfp = codAfp;
        this.codigoAfp = codigoAfp;
        this.direccionAfp = direccionAfp;
        this.dvafp = dvafp;
        this.emailAfp = emailAfp;
        this.faxAfp = faxAfp;
        this.nitAfp = nitAfp;
        this.nomContactoAfp = nomContactoAfp;
        this.nombreAfp = nombreAfp;
        this.numPerPlaniAfp = numPerPlaniAfp;
        this.telefonoAfp = telefonoAfp;
        this.tipoDocumentoAfp = tipoDocumentoAfp;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    @Id
    @Column(name = "cod_afp", unique = true, nullable = false)
    public String getCodAfp() {
        return this.codAfp;
    }

    public void setCodAfp(String codAfp) {
        this.codAfp = codAfp;
    }

    @Column(name = "codigo_afp")
    public String getCodigoAfp() {
        return this.codigoAfp;
    }

    public void setCodigoAfp(String codigoAfp) {
        this.codigoAfp = codigoAfp;
    }

    @Column(name = "direccion_afp")
    public String getDireccionAfp() {
        return this.direccionAfp;
    }

    public void setDireccionAfp(String direccionAfp) {
        this.direccionAfp = direccionAfp;
    }

    @Column(name = "dvafp")
    public String getDvafp() {
        return this.dvafp;
    }

    public void setDvafp(String dvafp) {
        this.dvafp = dvafp;
    }

    @Column(name = "email_afp")
    public String getEmailAfp() {
        return this.emailAfp;
    }

    public void setEmailAfp(String emailAfp) {
        this.emailAfp = emailAfp;
    }

    @Column(name = "fax_afp")
    public String getFaxAfp() {
        return this.faxAfp;
    }

    public void setFaxAfp(String faxAfp) {
        this.faxAfp = faxAfp;
    }

    @Column(name = "nit_afp", nullable = false)
    public String getNitAfp() {
        return this.nitAfp;
    }

    public void setNitAfp(String nitAfp) {
        this.nitAfp = nitAfp;
    }

    @Column(name = "nom_contacto_afp")
    public String getNomContactoAfp() {
        return this.nomContactoAfp;
    }

    public void setNomContactoAfp(String nomContactoAfp) {
        this.nomContactoAfp = nomContactoAfp;
    }

    @Column(name = "nombre_afp")
    public String getNombreAfp() {
        return this.nombreAfp;
    }

    public void setNombreAfp(String nombreAfp) {
        this.nombreAfp = nombreAfp;
    }

    @Column(name = "num_per_plani_afp")
    public String getNumPerPlaniAfp() {
        return this.numPerPlaniAfp;
    }

    public void setNumPerPlaniAfp(String numPerPlaniAfp) {
        this.numPerPlaniAfp = numPerPlaniAfp;
    }

    @Column(name = "telefono_afp")
    public String getTelefonoAfp() {
        return this.telefonoAfp;
    }

    public void setTelefonoAfp(String telefonoAfp) {
        this.telefonoAfp = telefonoAfp;
    }

    @Column(name = "tipo_documento_afp")
    public String getTipoDocumentoAfp() {
        return this.tipoDocumentoAfp;
    }

    public void setTipoDocumentoAfp(String tipoDocumentoAfp) {
        this.tipoDocumentoAfp = tipoDocumentoAfp;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tp000005")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tp000005")
    public Set<Tr000004> getTr000004s() {
        return this.tr000004s;
    }

    public void setTr000004s(Set<Tr000004> tr000004s) {
        this.tr000004s = tr000004s;
    }
}
