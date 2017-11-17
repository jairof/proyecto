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
@Table(name = "tg000008", schema = "${schema}")
public class Tg000008 implements java.io.Serializable {
    @NotNull
    private Tg000008Id id;
    @NotNull
    private Tg000001 tg000001;
    @NotNull
    private Tg000003 tg000003;
    private Integer chequeActivo;
    private Integer chequeUltimo;
    private Integer chequeprimer;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String consignacionClientes;
    private Integer ncheques;
    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String numcuenta;
    private String tipoCuenta;

    public Tg000008() {
    }

    public Tg000008(Tg000008Id id, Integer chequeActivo, Integer chequeUltimo,
        Integer chequeprimer, String consignacionClientes, Integer ncheques,
        String numcuenta, Tg000001 tg000001, Tg000003 tg000003,
        String tipoCuenta) {
        this.id = id;
        this.tg000001 = tg000001;
        this.tg000003 = tg000003;
        this.chequeActivo = chequeActivo;
        this.chequeUltimo = chequeUltimo;
        this.chequeprimer = chequeprimer;
        this.consignacionClientes = consignacionClientes;
        this.ncheques = ncheques;
        this.numcuenta = numcuenta;
        this.tipoCuenta = tipoCuenta;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "codCuenta",column = @Column(name = "cod_cuenta",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
    })
    public Tg000008Id getId() {
        return this.id;
    }

    public void setId(Tg000008Id id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_banco")
    public Tg000001 getTg000001() {
        return this.tg000001;
    }

    public void setTg000001(Tg000001 tg000001) {
        this.tg000001 = tg000001;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_empresa", insertable = false, updatable = false)
    public Tg000003 getTg000003() {
        return this.tg000003;
    }

    public void setTg000003(Tg000003 tg000003) {
        this.tg000003 = tg000003;
    }

    @Column(name = "cheque_activo")
    public Integer getChequeActivo() {
        return this.chequeActivo;
    }

    public void setChequeActivo(Integer chequeActivo) {
        this.chequeActivo = chequeActivo;
    }

    @Column(name = "cheque_ultimo")
    public Integer getChequeUltimo() {
        return this.chequeUltimo;
    }

    public void setChequeUltimo(Integer chequeUltimo) {
        this.chequeUltimo = chequeUltimo;
    }

    @Column(name = "chequeprimer")
    public Integer getChequeprimer() {
        return this.chequeprimer;
    }

    public void setChequeprimer(Integer chequeprimer) {
        this.chequeprimer = chequeprimer;
    }

    @Column(name = "consignacion_clientes", nullable = false)
    public String getConsignacionClientes() {
        return this.consignacionClientes;
    }

    public void setConsignacionClientes(String consignacionClientes) {
        this.consignacionClientes = consignacionClientes;
    }

    @Column(name = "ncheques")
    public Integer getNcheques() {
        return this.ncheques;
    }

    public void setNcheques(Integer ncheques) {
        this.ncheques = ncheques;
    }

    @Column(name = "numcuenta", nullable = false)
    public String getNumcuenta() {
        return this.numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    @Column(name = "tipo_cuenta")
    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
