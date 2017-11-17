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
@Table(name = "tlp00001", schema = "${schema}")
public class Tlp00001 implements java.io.Serializable {
    @NotNull
    private Tlp00001Id id;
    @NotNull
    private Tg000001 tg000001;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    private Tg000026 tg000026;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String arp;
    private String codBanco;
    private String codPeriodo;
    private String codPeriodoPeRiSc;
    private String codigoArp;
    private String codigoSucursal;
    private String consecutivoPlani;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String correccionPlanilla;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String eps;
    private Date fechaCorteRetiro;
    private Date fechaGenera;
    private Date fechaIngPagoSistema;
    private Date fechaPago;
    private Date fechaPagoPlanillaCorrecion;
    private String formaPresentacion;
    private Date horaGenera;
    private Date horaIngPagoSistema;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String ingUsuariosPagos;
    private Double masIntdemora;
    private String numCheque;
    private String numCuentadelCheque;
    private String numPlanillaCorrecion;
    private Integer numeroMeses;
    private String numerodeCotizantes;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String parafiscales;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String retUsuariosNoPagos;
    private String tipoAportante;
    private Double valorCheque;
    private Double valorEfectivo;
    private String valorNomina;

    public Tlp00001() {
    }

    public Tlp00001(Tlp00001Id id, String afp, String arp, String codBanco,
        String codPeriodo, String codPeriodoPeRiSc, String codigoArp,
        String codigoSucursal, String consecutivoPlani,
        String correccionPlanilla, String eps, Date fechaCorteRetiro,
        Date fechaGenera, Date fechaIngPagoSistema, Date fechaPago,
        Date fechaPagoPlanillaCorrecion, String formaPresentacion,
        Date horaGenera, Date horaIngPagoSistema, String ingUsuariosPagos,
        Double masIntdemora, String numCheque, String numCuentadelCheque,
        String numPlanillaCorrecion, Integer numeroMeses,
        String numerodeCotizantes, String parafiscales,
        String retUsuariosNoPagos, Tg000001 tg000001, Tg000003 tg000003,
        Tg000026 tg000026, String tipoAportante, Tlp00003 tlp00003,
        Double valorCheque, Double valorEfectivo, String valorNomina) {
        this.id = id;
        this.tg000001 = tg000001;
        this.tg000003 = tg000003;
        this.tg000026 = tg000026;
        this.afp = afp;
        this.arp = arp;
        this.codBanco = codBanco;
        this.codPeriodo = codPeriodo;
        this.codPeriodoPeRiSc = codPeriodoPeRiSc;
        this.codigoArp = codigoArp;
        this.codigoSucursal = codigoSucursal;
        this.consecutivoPlani = consecutivoPlani;
        this.correccionPlanilla = correccionPlanilla;
        this.eps = eps;
        this.fechaCorteRetiro = fechaCorteRetiro;
        this.fechaGenera = fechaGenera;
        this.fechaIngPagoSistema = fechaIngPagoSistema;
        this.fechaPago = fechaPago;
        this.fechaPagoPlanillaCorrecion = fechaPagoPlanillaCorrecion;
        this.formaPresentacion = formaPresentacion;
        this.horaGenera = horaGenera;
        this.horaIngPagoSistema = horaIngPagoSistema;
        this.ingUsuariosPagos = ingUsuariosPagos;
        this.masIntdemora = masIntdemora;
        this.numCheque = numCheque;
        this.numCuentadelCheque = numCuentadelCheque;
        this.numPlanillaCorrecion = numPlanillaCorrecion;
        this.numeroMeses = numeroMeses;
        this.numerodeCotizantes = numerodeCotizantes;
        this.parafiscales = parafiscales;
        this.retUsuariosNoPagos = retUsuariosNoPagos;
        this.tipoAportante = tipoAportante;
        this.valorCheque = valorCheque;
        this.valorEfectivo = valorEfectivo;
        this.valorNomina = valorNomina;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "numPlanilla",column = @Column(name = "num_planilla",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
    })
    public Tlp00001Id getId() {
        return this.id;
    }

    public void setId(Tlp00001Id id) {
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipode_planillas")
    public Tg000026 getTg000026() {
        return this.tg000026;
    }

    public void setTg000026(Tg000026 tg000026) {
        this.tg000026 = tg000026;
    }

    @Column(name = "afp", nullable = false)
    public String getAfp() {
        return this.afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    @Column(name = "arp", nullable = false)
    public String getArp() {
        return this.arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    @Column(name = "cod_banco")
    public String getCodBanco() {
        return this.codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    @Column(name = "cod_periodo")
    public String getCodPeriodo() {
        return this.codPeriodo;
    }

    public void setCodPeriodo(String codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    @Column(name = "cod_periodo_pe_ri_sc")
    public String getCodPeriodoPeRiSc() {
        return this.codPeriodoPeRiSc;
    }

    public void setCodPeriodoPeRiSc(String codPeriodoPeRiSc) {
        this.codPeriodoPeRiSc = codPeriodoPeRiSc;
    }

    @Column(name = "codigo_arp")
    public String getCodigoArp() {
        return this.codigoArp;
    }

    public void setCodigoArp(String codigoArp) {
        this.codigoArp = codigoArp;
    }

    @Column(name = "codigo_sucursal")
    public String getCodigoSucursal() {
        return this.codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    @Column(name = "consecutivo_plani")
    public String getConsecutivoPlani() {
        return this.consecutivoPlani;
    }

    public void setConsecutivoPlani(String consecutivoPlani) {
        this.consecutivoPlani = consecutivoPlani;
    }

    @Column(name = "correccion_planilla", nullable = false)
    public String getCorreccionPlanilla() {
        return this.correccionPlanilla;
    }

    public void setCorreccionPlanilla(String correccionPlanilla) {
        this.correccionPlanilla = correccionPlanilla;
    }

    @Column(name = "eps", nullable = false)
    public String getEps() {
        return this.eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    @Column(name = "fecha_corte_retiro")
    public Date getFechaCorteRetiro() {
        return this.fechaCorteRetiro;
    }

    public void setFechaCorteRetiro(Date fechaCorteRetiro) {
        this.fechaCorteRetiro = fechaCorteRetiro;
    }

    @Column(name = "fecha_genera")
    public Date getFechaGenera() {
        return this.fechaGenera;
    }

    public void setFechaGenera(Date fechaGenera) {
        this.fechaGenera = fechaGenera;
    }

    @Column(name = "fecha_ing_pago_sistema")
    public Date getFechaIngPagoSistema() {
        return this.fechaIngPagoSistema;
    }

    public void setFechaIngPagoSistema(Date fechaIngPagoSistema) {
        this.fechaIngPagoSistema = fechaIngPagoSistema;
    }

    @Column(name = "fecha_pago")
    public Date getFechaPago() {
        return this.fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Column(name = "fecha_pago_planilla_correcion")
    public Date getFechaPagoPlanillaCorrecion() {
        return this.fechaPagoPlanillaCorrecion;
    }

    public void setFechaPagoPlanillaCorrecion(Date fechaPagoPlanillaCorrecion) {
        this.fechaPagoPlanillaCorrecion = fechaPagoPlanillaCorrecion;
    }

    @Column(name = "forma_presentacion")
    public String getFormaPresentacion() {
        return this.formaPresentacion;
    }

    public void setFormaPresentacion(String formaPresentacion) {
        this.formaPresentacion = formaPresentacion;
    }

    @Column(name = "hora_genera")
    public Date getHoraGenera() {
        return this.horaGenera;
    }

    public void setHoraGenera(Date horaGenera) {
        this.horaGenera = horaGenera;
    }

    @Column(name = "hora_ing_pago_sistema")
    public Date getHoraIngPagoSistema() {
        return this.horaIngPagoSistema;
    }

    public void setHoraIngPagoSistema(Date horaIngPagoSistema) {
        this.horaIngPagoSistema = horaIngPagoSistema;
    }

    @Column(name = "ing_usuarios_pagos", nullable = false)
    public String getIngUsuariosPagos() {
        return this.ingUsuariosPagos;
    }

    public void setIngUsuariosPagos(String ingUsuariosPagos) {
        this.ingUsuariosPagos = ingUsuariosPagos;
    }

    @Column(name = "mas_intdemora")
    public Double getMasIntdemora() {
        return this.masIntdemora;
    }

    public void setMasIntdemora(Double masIntdemora) {
        this.masIntdemora = masIntdemora;
    }

    @Column(name = "num_cheque")
    public String getNumCheque() {
        return this.numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    @Column(name = "num_cuentadel_cheque")
    public String getNumCuentadelCheque() {
        return this.numCuentadelCheque;
    }

    public void setNumCuentadelCheque(String numCuentadelCheque) {
        this.numCuentadelCheque = numCuentadelCheque;
    }

    @Column(name = "num_planilla_correcion")
    public String getNumPlanillaCorrecion() {
        return this.numPlanillaCorrecion;
    }

    public void setNumPlanillaCorrecion(String numPlanillaCorrecion) {
        this.numPlanillaCorrecion = numPlanillaCorrecion;
    }

    @Column(name = "numero_meses")
    public Integer getNumeroMeses() {
        return this.numeroMeses;
    }

    public void setNumeroMeses(Integer numeroMeses) {
        this.numeroMeses = numeroMeses;
    }

    @Column(name = "numerode_cotizantes")
    public String getNumerodeCotizantes() {
        return this.numerodeCotizantes;
    }

    public void setNumerodeCotizantes(String numerodeCotizantes) {
        this.numerodeCotizantes = numerodeCotizantes;
    }

    @Column(name = "parafiscales", nullable = false)
    public String getParafiscales() {
        return this.parafiscales;
    }

    public void setParafiscales(String parafiscales) {
        this.parafiscales = parafiscales;
    }

    @Column(name = "ret_usuarios_no_pagos", nullable = false)
    public String getRetUsuariosNoPagos() {
        return this.retUsuariosNoPagos;
    }

    public void setRetUsuariosNoPagos(String retUsuariosNoPagos) {
        this.retUsuariosNoPagos = retUsuariosNoPagos;
    }

    @Column(name = "tipo_aportante")
    public String getTipoAportante() {
        return this.tipoAportante;
    }

    public void setTipoAportante(String tipoAportante) {
        this.tipoAportante = tipoAportante;
    }

    @Column(name = "valor_cheque")
    public Double getValorCheque() {
        return this.valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    @Column(name = "valor_efectivo")
    public Double getValorEfectivo() {
        return this.valorEfectivo;
    }

    public void setValorEfectivo(Double valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    @Column(name = "valor_nomina")
    public String getValorNomina() {
        return this.valorNomina;
    }

    public void setValorNomina(String valorNomina) {
        this.valorNomina = valorNomina;
    }
}
