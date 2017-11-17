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
@Table(name = "tp000004", schema = "${schema}")
public class Tp000004 implements java.io.Serializable {
    @NotNull
    private String codArp;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String arpactiva;
    private String codigoArp;
    private String direccionArp;
    private String dvarp;
    private String emailArp;
    private String faxArp;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitArp;
    private String nomContactoArp;
    private String nombreArp;
    private String numPerPlaniArp;
    private String telefonoArp;
    private String tipoDocumentoArp;
    private Set<Tp000001> tp000001s = new HashSet<Tp000001>(0);
    private Set<Tr000004> tr000004s = new HashSet<Tr000004>(0);

    public Tp000004() {
    }

    public Tp000004(String codArp, String arpactiva, String codigoArp,
        String direccionArp, String dvarp, String emailArp, String faxArp,
        String nitArp, String nomContactoArp, String nombreArp,
        String numPerPlaniArp, String telefonoArp, Tg000003 tg000003,
        String tipoDocumentoArp, Set<Tp000001> tp000001s,
        Set<Tr000004> tr000004s) {
        this.codArp = codArp;
        this.tg000003 = tg000003;
        this.arpactiva = arpactiva;
        this.codigoArp = codigoArp;
        this.direccionArp = direccionArp;
        this.dvarp = dvarp;
        this.emailArp = emailArp;
        this.faxArp = faxArp;
        this.nitArp = nitArp;
        this.nomContactoArp = nomContactoArp;
        this.nombreArp = nombreArp;
        this.numPerPlaniArp = numPerPlaniArp;
        this.telefonoArp = telefonoArp;
        this.tipoDocumentoArp = tipoDocumentoArp;
        this.tp000001s = tp000001s;
        this.tr000004s = tr000004s;
    }

    @Id
    @Column(name = "cod_arp", unique = true, nullable = false)
    public String getCodArp() {
        return this.codArp;
    }

    public void setCodArp(String codArp) {
        this.codArp = codArp;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_empresa")
    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    @Column(name = "arpactiva", nullable = false)
    public String getArpactiva() {
        return this.arpactiva;
    }

    public void setArpactiva(String arpactiva) {
        this.arpactiva = arpactiva;
    }

    @Column(name = "codigo_arp")
    public String getCodigoArp() {
        return this.codigoArp;
    }

    public void setCodigoArp(String codigoArp) {
        this.codigoArp = codigoArp;
    }

    @Column(name = "direccion_arp")
    public String getDireccionArp() {
        return this.direccionArp;
    }

    public void setDireccionArp(String direccionArp) {
        this.direccionArp = direccionArp;
    }

    @Column(name = "dvarp")
    public String getDvarp() {
        return this.dvarp;
    }

    public void setDvarp(String dvarp) {
        this.dvarp = dvarp;
    }

    @Column(name = "email_arp")
    public String getEmailArp() {
        return this.emailArp;
    }

    public void setEmailArp(String emailArp) {
        this.emailArp = emailArp;
    }

    @Column(name = "fax_arp")
    public String getFaxArp() {
        return this.faxArp;
    }

    public void setFaxArp(String faxArp) {
        this.faxArp = faxArp;
    }

    @Column(name = "nit_arp", nullable = false)
    public String getNitArp() {
        return this.nitArp;
    }

    public void setNitArp(String nitArp) {
        this.nitArp = nitArp;
    }

    @Column(name = "nom_contacto_arp")
    public String getNomContactoArp() {
        return this.nomContactoArp;
    }

    public void setNomContactoArp(String nomContactoArp) {
        this.nomContactoArp = nomContactoArp;
    }

    @Column(name = "nombre_arp")
    public String getNombreArp() {
        return this.nombreArp;
    }

    public void setNombreArp(String nombreArp) {
        this.nombreArp = nombreArp;
    }

    @Column(name = "num_per_plani_arp")
    public String getNumPerPlaniArp() {
        return this.numPerPlaniArp;
    }

    public void setNumPerPlaniArp(String numPerPlaniArp) {
        this.numPerPlaniArp = numPerPlaniArp;
    }

    @Column(name = "telefono_arp")
    public String getTelefonoArp() {
        return this.telefonoArp;
    }

    public void setTelefonoArp(String telefonoArp) {
        this.telefonoArp = telefonoArp;
    }

    @Column(name = "tipo_documento_arp")
    public String getTipoDocumentoArp() {
        return this.tipoDocumentoArp;
    }

    public void setTipoDocumentoArp(String tipoDocumentoArp) {
        this.tipoDocumentoArp = tipoDocumentoArp;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tp000004")
    public Set<Tp000001> getTp000001s() {
        return this.tp000001s;
    }

    public void setTp000001s(Set<Tp000001> tp000001s) {
        this.tp000001s = tp000001s;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tp000004")
    public Set<Tr000004> getTr000004s() {
        return this.tr000004s;
    }

    public void setTr000004s(Set<Tr000004> tr000004s) {
        this.tr000004s = tr000004s;
    }
}
