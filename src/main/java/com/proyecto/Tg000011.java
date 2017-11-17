package com.proyecto;

import org.hibernate.validator.constraints.*;

import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Entity
@Table(name = "tg000011", schema = "${schema}")
public class Tg000011 implements java.io.Serializable {
    @NotNull
    private Tg000011Id id;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ativa;
    private String ciudad;
    private String depto;
    private String dirEmpresa;
    private String dvempaf;
    private String emailEmpresa;
    private String faxEmpresa;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String nitEmpresa;
    private String nomContacto;
    private String nomEmpresa;
    private String telEmpresa;
    private String tipoDocumentoEmpaf;

    public Tg000011() {
    }

    public Tg000011(Tg000011Id id, String ativa, String ciudad, String depto,
        String dirEmpresa, String dvempaf, String emailEmpresa,
        String faxEmpresa, String nitEmpresa, String nomContacto,
        String nomEmpresa, String telEmpresa, Tg000003 tg000003,
        String tipoDocumentoEmpaf, Tp000001 tp000001) {
        this.id = id;
        this.tg000003 = tg000003;
        this.ativa = ativa;
        this.ciudad = ciudad;
        this.depto = depto;
        this.dirEmpresa = dirEmpresa;
        this.dvempaf = dvempaf;
        this.emailEmpresa = emailEmpresa;
        this.faxEmpresa = faxEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.nomContacto = nomContacto;
        this.nomEmpresa = nomEmpresa;
        this.telEmpresa = telEmpresa;
        this.tipoDocumentoEmpaf = tipoDocumentoEmpaf;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "codEmpresaEmp",column = @Column(name = "cod_empresa_emp",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
    })
    public Tg000011Id getId() {
        return this.id;
    }

    public void setId(Tg000011Id id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_empresa", insertable = false, updatable = false)
    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    @Column(name = "ativa", nullable = false)
    public String getAtiva() {
        return this.ativa;
    }

    public void setAtiva(String ativa) {
        this.ativa = ativa;
    }

    @Column(name = "ciudad")
    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Column(name = "depto")
    public String getDepto() {
        return this.depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    @Column(name = "dir_empresa")
    public String getDirEmpresa() {
        return this.dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    @Column(name = "dvempaf")
    public String getDvempaf() {
        return this.dvempaf;
    }

    public void setDvempaf(String dvempaf) {
        this.dvempaf = dvempaf;
    }

    @Column(name = "email_empresa")
    public String getEmailEmpresa() {
        return this.emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    @Column(name = "fax_empresa")
    public String getFaxEmpresa() {
        return this.faxEmpresa;
    }

    public void setFaxEmpresa(String faxEmpresa) {
        this.faxEmpresa = faxEmpresa;
    }

    @Column(name = "nit_empresa", nullable = false)
    public String getNitEmpresa() {
        return this.nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    @Column(name = "nom_contacto")
    public String getNomContacto() {
        return this.nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    @Column(name = "nom_empresa")
    public String getNomEmpresa() {
        return this.nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    @Column(name = "tel_empresa")
    public String getTelEmpresa() {
        return this.telEmpresa;
    }

    public void setTelEmpresa(String telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    @Column(name = "tipo_documento_empaf")
    public String getTipoDocumentoEmpaf() {
        return this.tipoDocumentoEmpaf;
    }

    public void setTipoDocumentoEmpaf(String tipoDocumentoEmpaf) {
        this.tipoDocumentoEmpaf = tipoDocumentoEmpaf;
    }
}
