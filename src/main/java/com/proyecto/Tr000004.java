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
@Table(name = "tr000004", schema = "${schema}")
public class Tr000004 implements java.io.Serializable {
    @NotNull
    private Tr000004Id id;
    @NotNull
    private Tg000003 tg000003;
    @NotNull
    private Tp000003 tp000003;
    @NotNull
    private Tp000004 tp000004;
    @NotNull
    private Tp000005 tp000005;
    @NotNull
    private Tp000006 tp000006;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afiliacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afiliacionporcobrar;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String afp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String anulado;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String arp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String caja;
    private String codBancoCheque;
    private String codBancoConsignacion;
    private String codUsuario;
    private Integer codigoPagoMes;
    private Double comisionAsesor;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String cuota;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String cuotaporcobrar;
    private Integer diasCotizadosAfp;
    private Integer diasCotizadosArp;
    private Integer diasCotizadosCaja;
    private Integer diasCotizadosEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String eps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String facturado;
    private Double faltanteConsignacion;
    private Date fechaIngPagoSistema;
    private Date fechaPago;
    private Date horaIngPagoSistema;
    private Date horaPago;
    private Double ibc;
    private String idenEmpresa;
    private String identificacion;
    private String numCheque;
    private String numConsignacion;
    private String numCuentaCobro;
    private String numPersonas;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String otros;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoCheque;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoConsignacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoEfectivo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoRetiro;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String pagoRetiroporcobrar;
    private String periodo;
    private String periodoRp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoCaja;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String planilladoEps;
    private Double porcRiesgo;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reactivacion;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reactivacionporcobrar;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraAfp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraArp;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraCaja;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String recibPrimeraEps;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String reciboCuentaCobro;
    private Integer riesgos;
    private Double valAdmonAfprec;
    private Double valAdmonRec;
    private Double valorAfiliacion;
    private Double valorCheque;
    private Double valorConsignacion;
    private Double valorDiasCotizadosAfp;
    private Double valorDiasCotizadosArp;
    private Double valorDiasCotizadosCaja;
    private Double valorDiasCotizadosEps;
    private Double valorEfectivo;
    private Double valorFpsolidaridad;
    private Double valorFpsubsistencia;
    private Double valorIcbf;
    private Double valorMensajeriaRecibo;
    private Double valorMora;
    private Double valorOtrosServicios;
    private Double valorPagoMora;
    private Double valorPagoUpc;
    private Double valorReactivacion;
    private Double valorSalario;
    private Double valorSena;
    private Double valorTotal;
    private String valorenletras;

    public Tr000004() {
    }

    public Tr000004(Tr000004Id id, String afiliacion,
        String afiliacionporcobrar, String afp, String anulado, String arp,
        String caja, String codBancoCheque, String codBancoConsignacion,
        String codUsuario, Integer codigoPagoMes, Double comisionAsesor,
        String cuota, String cuotaporcobrar, Integer diasCotizadosAfp,
        Integer diasCotizadosArp, Integer diasCotizadosCaja,
        Integer diasCotizadosEps, String eps, String facturado,
        Double faltanteConsignacion, Date fechaIngPagoSistema, Date fechaPago,
        Date horaIngPagoSistema, Date horaPago, Double ibc, String idenEmpresa,
        String identificacion, String numCheque, String numConsignacion,
        String numCuentaCobro, String numPersonas, String otros,
        String pagoCheque, String pagoConsignacion, String pagoEfectivo,
        String pagoRetiro, String pagoRetiroporcobrar, String periodo,
        String periodoRp, String planilladoAfp, String planilladoArp,
        String planilladoCaja, String planilladoEps, Double porcRiesgo,
        String reactivacion, String reactivacionporcobrar,
        String recibPrimeraAfp, String recibPrimeraArp,
        String recibPrimeraCaja, String recibPrimeraEps,
        String reciboCuentaCobro, Integer riesgos, Tg000003 tg000003,
        Tp000003 tp000003, Tp000004 tp000004, Tp000005 tp000005,
        Tp000006 tp000006, Double valAdmonAfprec, Double valAdmonRec,
        Double valorAfiliacion, Double valorCheque, Double valorConsignacion,
        Double valorDiasCotizadosAfp, Double valorDiasCotizadosArp,
        Double valorDiasCotizadosCaja, Double valorDiasCotizadosEps,
        Double valorEfectivo, Double valorFpsolidaridad,
        Double valorFpsubsistencia, Double valorIcbf,
        Double valorMensajeriaRecibo, Double valorMora,
        Double valorOtrosServicios, Double valorPagoMora, Double valorPagoUpc,
        Double valorReactivacion, Double valorSalario, Double valorSena,
        Double valorTotal, String valorenletras) {
        this.id = id;
        this.tg000003 = tg000003;
        this.tp000003 = tp000003;
        this.tp000004 = tp000004;
        this.tp000005 = tp000005;
        this.tp000006 = tp000006;
        this.afiliacion = afiliacion;
        this.afiliacionporcobrar = afiliacionporcobrar;
        this.afp = afp;
        this.anulado = anulado;
        this.arp = arp;
        this.caja = caja;
        this.codBancoCheque = codBancoCheque;
        this.codBancoConsignacion = codBancoConsignacion;
        this.codUsuario = codUsuario;
        this.codigoPagoMes = codigoPagoMes;
        this.comisionAsesor = comisionAsesor;
        this.cuota = cuota;
        this.cuotaporcobrar = cuotaporcobrar;
        this.diasCotizadosAfp = diasCotizadosAfp;
        this.diasCotizadosArp = diasCotizadosArp;
        this.diasCotizadosCaja = diasCotizadosCaja;
        this.diasCotizadosEps = diasCotizadosEps;
        this.eps = eps;
        this.facturado = facturado;
        this.faltanteConsignacion = faltanteConsignacion;
        this.fechaIngPagoSistema = fechaIngPagoSistema;
        this.fechaPago = fechaPago;
        this.horaIngPagoSistema = horaIngPagoSistema;
        this.horaPago = horaPago;
        this.ibc = ibc;
        this.idenEmpresa = idenEmpresa;
        this.identificacion = identificacion;
        this.numCheque = numCheque;
        this.numConsignacion = numConsignacion;
        this.numCuentaCobro = numCuentaCobro;
        this.numPersonas = numPersonas;
        this.otros = otros;
        this.pagoCheque = pagoCheque;
        this.pagoConsignacion = pagoConsignacion;
        this.pagoEfectivo = pagoEfectivo;
        this.pagoRetiro = pagoRetiro;
        this.pagoRetiroporcobrar = pagoRetiroporcobrar;
        this.periodo = periodo;
        this.periodoRp = periodoRp;
        this.planilladoAfp = planilladoAfp;
        this.planilladoArp = planilladoArp;
        this.planilladoCaja = planilladoCaja;
        this.planilladoEps = planilladoEps;
        this.porcRiesgo = porcRiesgo;
        this.reactivacion = reactivacion;
        this.reactivacionporcobrar = reactivacionporcobrar;
        this.recibPrimeraAfp = recibPrimeraAfp;
        this.recibPrimeraArp = recibPrimeraArp;
        this.recibPrimeraCaja = recibPrimeraCaja;
        this.recibPrimeraEps = recibPrimeraEps;
        this.reciboCuentaCobro = reciboCuentaCobro;
        this.riesgos = riesgos;
        this.valAdmonAfprec = valAdmonAfprec;
        this.valAdmonRec = valAdmonRec;
        this.valorAfiliacion = valorAfiliacion;
        this.valorCheque = valorCheque;
        this.valorConsignacion = valorConsignacion;
        this.valorDiasCotizadosAfp = valorDiasCotizadosAfp;
        this.valorDiasCotizadosArp = valorDiasCotizadosArp;
        this.valorDiasCotizadosCaja = valorDiasCotizadosCaja;
        this.valorDiasCotizadosEps = valorDiasCotizadosEps;
        this.valorEfectivo = valorEfectivo;
        this.valorFpsolidaridad = valorFpsolidaridad;
        this.valorFpsubsistencia = valorFpsubsistencia;
        this.valorIcbf = valorIcbf;
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
        this.valorMora = valorMora;
        this.valorOtrosServicios = valorOtrosServicios;
        this.valorPagoMora = valorPagoMora;
        this.valorPagoUpc = valorPagoUpc;
        this.valorReactivacion = valorReactivacion;
        this.valorSalario = valorSalario;
        this.valorSena = valorSena;
        this.valorTotal = valorTotal;
        this.valorenletras = valorenletras;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "consecutivo",column = @Column(name = "consecutivo",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
    })
    public Tr000004Id getId() {
        return this.id;
    }

    public void setId(Tr000004Id id) {
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_eps")
    public Tp000003 getTp000003() {
        return this.tp000003;
    }

    public void setTp000003(Tp000003 tp000003) {
        this.tp000003 = tp000003;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_arp")
    public Tp000004 getTp000004() {
        return this.tp000004;
    }

    public void setTp000004(Tp000004 tp000004) {
        this.tp000004 = tp000004;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_afp")
    public Tp000005 getTp000005() {
        return this.tp000005;
    }

    public void setTp000005(Tp000005 tp000005) {
        this.tp000005 = tp000005;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_caja")
    public Tp000006 getTp000006() {
        return this.tp000006;
    }

    public void setTp000006(Tp000006 tp000006) {
        this.tp000006 = tp000006;
    }

    @Column(name = "afiliacion", nullable = false)
    public String getAfiliacion() {
        return this.afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Column(name = "afiliacionporcobrar", nullable = false)
    public String getAfiliacionporcobrar() {
        return this.afiliacionporcobrar;
    }

    public void setAfiliacionporcobrar(String afiliacionporcobrar) {
        this.afiliacionporcobrar = afiliacionporcobrar;
    }

    @Column(name = "afp", nullable = false)
    public String getAfp() {
        return this.afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    @Column(name = "anulado", nullable = false)
    public String getAnulado() {
        return this.anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    @Column(name = "arp", nullable = false)
    public String getArp() {
        return this.arp;
    }

    public void setArp(String arp) {
        this.arp = arp;
    }

    @Column(name = "caja", nullable = false)
    public String getCaja() {
        return this.caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    @Column(name = "cod_banco_cheque")
    public String getCodBancoCheque() {
        return this.codBancoCheque;
    }

    public void setCodBancoCheque(String codBancoCheque) {
        this.codBancoCheque = codBancoCheque;
    }

    @Column(name = "cod_banco_consignacion")
    public String getCodBancoConsignacion() {
        return this.codBancoConsignacion;
    }

    public void setCodBancoConsignacion(String codBancoConsignacion) {
        this.codBancoConsignacion = codBancoConsignacion;
    }

    @Column(name = "cod_usuario")
    public String getCodUsuario() {
        return this.codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Column(name = "codigo_pago_mes")
    public Integer getCodigoPagoMes() {
        return this.codigoPagoMes;
    }

    public void setCodigoPagoMes(Integer codigoPagoMes) {
        this.codigoPagoMes = codigoPagoMes;
    }

    @Column(name = "comision_asesor")
    public Double getComisionAsesor() {
        return this.comisionAsesor;
    }

    public void setComisionAsesor(Double comisionAsesor) {
        this.comisionAsesor = comisionAsesor;
    }

    @Column(name = "cuota", nullable = false)
    public String getCuota() {
        return this.cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    @Column(name = "cuotaporcobrar", nullable = false)
    public String getCuotaporcobrar() {
        return this.cuotaporcobrar;
    }

    public void setCuotaporcobrar(String cuotaporcobrar) {
        this.cuotaporcobrar = cuotaporcobrar;
    }

    @Column(name = "dias_cotizados_afp")
    public Integer getDiasCotizadosAfp() {
        return this.diasCotizadosAfp;
    }

    public void setDiasCotizadosAfp(Integer diasCotizadosAfp) {
        this.diasCotizadosAfp = diasCotizadosAfp;
    }

    @Column(name = "dias_cotizados_arp")
    public Integer getDiasCotizadosArp() {
        return this.diasCotizadosArp;
    }

    public void setDiasCotizadosArp(Integer diasCotizadosArp) {
        this.diasCotizadosArp = diasCotizadosArp;
    }

    @Column(name = "dias_cotizados_caja")
    public Integer getDiasCotizadosCaja() {
        return this.diasCotizadosCaja;
    }

    public void setDiasCotizadosCaja(Integer diasCotizadosCaja) {
        this.diasCotizadosCaja = diasCotizadosCaja;
    }

    @Column(name = "dias_cotizados_eps")
    public Integer getDiasCotizadosEps() {
        return this.diasCotizadosEps;
    }

    public void setDiasCotizadosEps(Integer diasCotizadosEps) {
        this.diasCotizadosEps = diasCotizadosEps;
    }

    @Column(name = "eps", nullable = false)
    public String getEps() {
        return this.eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    @Column(name = "facturado", nullable = false)
    public String getFacturado() {
        return this.facturado;
    }

    public void setFacturado(String facturado) {
        this.facturado = facturado;
    }

    @Column(name = "faltante_consignacion")
    public Double getFaltanteConsignacion() {
        return this.faltanteConsignacion;
    }

    public void setFaltanteConsignacion(Double faltanteConsignacion) {
        this.faltanteConsignacion = faltanteConsignacion;
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

    @Column(name = "hora_ing_pago_sistema")
    public Date getHoraIngPagoSistema() {
        return this.horaIngPagoSistema;
    }

    public void setHoraIngPagoSistema(Date horaIngPagoSistema) {
        this.horaIngPagoSistema = horaIngPagoSistema;
    }

    @Column(name = "hora_pago")
    public Date getHoraPago() {
        return this.horaPago;
    }

    public void setHoraPago(Date horaPago) {
        this.horaPago = horaPago;
    }

    @Column(name = "ibc")
    public Double getIbc() {
        return this.ibc;
    }

    public void setIbc(Double ibc) {
        this.ibc = ibc;
    }

    @Column(name = "iden_empresa")
    public String getIdenEmpresa() {
        return this.idenEmpresa;
    }

    public void setIdenEmpresa(String idenEmpresa) {
        this.idenEmpresa = idenEmpresa;
    }

    @Column(name = "identificacion")
    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Column(name = "num_cheque")
    public String getNumCheque() {
        return this.numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    @Column(name = "num_consignacion")
    public String getNumConsignacion() {
        return this.numConsignacion;
    }

    public void setNumConsignacion(String numConsignacion) {
        this.numConsignacion = numConsignacion;
    }

    @Column(name = "num_cuenta_cobro")
    public String getNumCuentaCobro() {
        return this.numCuentaCobro;
    }

    public void setNumCuentaCobro(String numCuentaCobro) {
        this.numCuentaCobro = numCuentaCobro;
    }

    @Column(name = "num_personas")
    public String getNumPersonas() {
        return this.numPersonas;
    }

    public void setNumPersonas(String numPersonas) {
        this.numPersonas = numPersonas;
    }

    @Column(name = "otros", nullable = false)
    public String getOtros() {
        return this.otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    @Column(name = "pago_cheque", nullable = false)
    public String getPagoCheque() {
        return this.pagoCheque;
    }

    public void setPagoCheque(String pagoCheque) {
        this.pagoCheque = pagoCheque;
    }

    @Column(name = "pago_consignacion", nullable = false)
    public String getPagoConsignacion() {
        return this.pagoConsignacion;
    }

    public void setPagoConsignacion(String pagoConsignacion) {
        this.pagoConsignacion = pagoConsignacion;
    }

    @Column(name = "pago_efectivo", nullable = false)
    public String getPagoEfectivo() {
        return this.pagoEfectivo;
    }

    public void setPagoEfectivo(String pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    @Column(name = "pago_retiro", nullable = false)
    public String getPagoRetiro() {
        return this.pagoRetiro;
    }

    public void setPagoRetiro(String pagoRetiro) {
        this.pagoRetiro = pagoRetiro;
    }

    @Column(name = "pago_retiroporcobrar", nullable = false)
    public String getPagoRetiroporcobrar() {
        return this.pagoRetiroporcobrar;
    }

    public void setPagoRetiroporcobrar(String pagoRetiroporcobrar) {
        this.pagoRetiroporcobrar = pagoRetiroporcobrar;
    }

    @Column(name = "periodo")
    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Column(name = "periodo_rp")
    public String getPeriodoRp() {
        return this.periodoRp;
    }

    public void setPeriodoRp(String periodoRp) {
        this.periodoRp = periodoRp;
    }

    @Column(name = "planillado_afp", nullable = false)
    public String getPlanilladoAfp() {
        return this.planilladoAfp;
    }

    public void setPlanilladoAfp(String planilladoAfp) {
        this.planilladoAfp = planilladoAfp;
    }

    @Column(name = "planillado_arp", nullable = false)
    public String getPlanilladoArp() {
        return this.planilladoArp;
    }

    public void setPlanilladoArp(String planilladoArp) {
        this.planilladoArp = planilladoArp;
    }

    @Column(name = "planillado_caja", nullable = false)
    public String getPlanilladoCaja() {
        return this.planilladoCaja;
    }

    public void setPlanilladoCaja(String planilladoCaja) {
        this.planilladoCaja = planilladoCaja;
    }

    @Column(name = "planillado_eps", nullable = false)
    public String getPlanilladoEps() {
        return this.planilladoEps;
    }

    public void setPlanilladoEps(String planilladoEps) {
        this.planilladoEps = planilladoEps;
    }

    @Column(name = "porc_riesgo")
    public Double getPorcRiesgo() {
        return this.porcRiesgo;
    }

    public void setPorcRiesgo(Double porcRiesgo) {
        this.porcRiesgo = porcRiesgo;
    }

    @Column(name = "reactivacion", nullable = false)
    public String getReactivacion() {
        return this.reactivacion;
    }

    public void setReactivacion(String reactivacion) {
        this.reactivacion = reactivacion;
    }

    @Column(name = "reactivacionporcobrar", nullable = false)
    public String getReactivacionporcobrar() {
        return this.reactivacionporcobrar;
    }

    public void setReactivacionporcobrar(String reactivacionporcobrar) {
        this.reactivacionporcobrar = reactivacionporcobrar;
    }

    @Column(name = "recib_primera_afp", nullable = false)
    public String getRecibPrimeraAfp() {
        return this.recibPrimeraAfp;
    }

    public void setRecibPrimeraAfp(String recibPrimeraAfp) {
        this.recibPrimeraAfp = recibPrimeraAfp;
    }

    @Column(name = "recib_primera_arp", nullable = false)
    public String getRecibPrimeraArp() {
        return this.recibPrimeraArp;
    }

    public void setRecibPrimeraArp(String recibPrimeraArp) {
        this.recibPrimeraArp = recibPrimeraArp;
    }

    @Column(name = "recib_primera_caja", nullable = false)
    public String getRecibPrimeraCaja() {
        return this.recibPrimeraCaja;
    }

    public void setRecibPrimeraCaja(String recibPrimeraCaja) {
        this.recibPrimeraCaja = recibPrimeraCaja;
    }

    @Column(name = "recib_primera_eps", nullable = false)
    public String getRecibPrimeraEps() {
        return this.recibPrimeraEps;
    }

    public void setRecibPrimeraEps(String recibPrimeraEps) {
        this.recibPrimeraEps = recibPrimeraEps;
    }

    @Column(name = "recibo_cuenta_cobro", nullable = false)
    public String getReciboCuentaCobro() {
        return this.reciboCuentaCobro;
    }

    public void setReciboCuentaCobro(String reciboCuentaCobro) {
        this.reciboCuentaCobro = reciboCuentaCobro;
    }

    @Column(name = "riesgos")
    public Integer getRiesgos() {
        return this.riesgos;
    }

    public void setRiesgos(Integer riesgos) {
        this.riesgos = riesgos;
    }

    @Column(name = "val_admon_afprec")
    public Double getValAdmonAfprec() {
        return this.valAdmonAfprec;
    }

    public void setValAdmonAfprec(Double valAdmonAfprec) {
        this.valAdmonAfprec = valAdmonAfprec;
    }

    @Column(name = "val_admon_rec")
    public Double getValAdmonRec() {
        return this.valAdmonRec;
    }

    public void setValAdmonRec(Double valAdmonRec) {
        this.valAdmonRec = valAdmonRec;
    }

    @Column(name = "valor_afiliacion")
    public Double getValorAfiliacion() {
        return this.valorAfiliacion;
    }

    public void setValorAfiliacion(Double valorAfiliacion) {
        this.valorAfiliacion = valorAfiliacion;
    }

    @Column(name = "valor_cheque")
    public Double getValorCheque() {
        return this.valorCheque;
    }

    public void setValorCheque(Double valorCheque) {
        this.valorCheque = valorCheque;
    }

    @Column(name = "valor_consignacion")
    public Double getValorConsignacion() {
        return this.valorConsignacion;
    }

    public void setValorConsignacion(Double valorConsignacion) {
        this.valorConsignacion = valorConsignacion;
    }

    @Column(name = "valor_dias_cotizados_afp")
    public Double getValorDiasCotizadosAfp() {
        return this.valorDiasCotizadosAfp;
    }

    public void setValorDiasCotizadosAfp(Double valorDiasCotizadosAfp) {
        this.valorDiasCotizadosAfp = valorDiasCotizadosAfp;
    }

    @Column(name = "valor_dias_cotizados_arp")
    public Double getValorDiasCotizadosArp() {
        return this.valorDiasCotizadosArp;
    }

    public void setValorDiasCotizadosArp(Double valorDiasCotizadosArp) {
        this.valorDiasCotizadosArp = valorDiasCotizadosArp;
    }

    @Column(name = "valor_dias_cotizados_caja")
    public Double getValorDiasCotizadosCaja() {
        return this.valorDiasCotizadosCaja;
    }

    public void setValorDiasCotizadosCaja(Double valorDiasCotizadosCaja) {
        this.valorDiasCotizadosCaja = valorDiasCotizadosCaja;
    }

    @Column(name = "valor_dias_cotizados_eps")
    public Double getValorDiasCotizadosEps() {
        return this.valorDiasCotizadosEps;
    }

    public void setValorDiasCotizadosEps(Double valorDiasCotizadosEps) {
        this.valorDiasCotizadosEps = valorDiasCotizadosEps;
    }

    @Column(name = "valor_efectivo")
    public Double getValorEfectivo() {
        return this.valorEfectivo;
    }

    public void setValorEfectivo(Double valorEfectivo) {
        this.valorEfectivo = valorEfectivo;
    }

    @Column(name = "valor_fpsolidaridad")
    public Double getValorFpsolidaridad() {
        return this.valorFpsolidaridad;
    }

    public void setValorFpsolidaridad(Double valorFpsolidaridad) {
        this.valorFpsolidaridad = valorFpsolidaridad;
    }

    @Column(name = "valor_fpsubsistencia")
    public Double getValorFpsubsistencia() {
        return this.valorFpsubsistencia;
    }

    public void setValorFpsubsistencia(Double valorFpsubsistencia) {
        this.valorFpsubsistencia = valorFpsubsistencia;
    }

    @Column(name = "valor_icbf")
    public Double getValorIcbf() {
        return this.valorIcbf;
    }

    public void setValorIcbf(Double valorIcbf) {
        this.valorIcbf = valorIcbf;
    }

    @Column(name = "valor_mensajeria_recibo")
    public Double getValorMensajeriaRecibo() {
        return this.valorMensajeriaRecibo;
    }

    public void setValorMensajeriaRecibo(Double valorMensajeriaRecibo) {
        this.valorMensajeriaRecibo = valorMensajeriaRecibo;
    }

    @Column(name = "valor_mora")
    public Double getValorMora() {
        return this.valorMora;
    }

    public void setValorMora(Double valorMora) {
        this.valorMora = valorMora;
    }

    @Column(name = "valor_otros_servicios")
    public Double getValorOtrosServicios() {
        return this.valorOtrosServicios;
    }

    public void setValorOtrosServicios(Double valorOtrosServicios) {
        this.valorOtrosServicios = valorOtrosServicios;
    }

    @Column(name = "valor_pago_mora")
    public Double getValorPagoMora() {
        return this.valorPagoMora;
    }

    public void setValorPagoMora(Double valorPagoMora) {
        this.valorPagoMora = valorPagoMora;
    }

    @Column(name = "valor_pago_upc")
    public Double getValorPagoUpc() {
        return this.valorPagoUpc;
    }

    public void setValorPagoUpc(Double valorPagoUpc) {
        this.valorPagoUpc = valorPagoUpc;
    }

    @Column(name = "valor_reactivacion")
    public Double getValorReactivacion() {
        return this.valorReactivacion;
    }

    public void setValorReactivacion(Double valorReactivacion) {
        this.valorReactivacion = valorReactivacion;
    }

    @Column(name = "valor_salario")
    public Double getValorSalario() {
        return this.valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Column(name = "valor_sena")
    public Double getValorSena() {
        return this.valorSena;
    }

    public void setValorSena(Double valorSena) {
        this.valorSena = valorSena;
    }

    @Column(name = "valor_total")
    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Column(name = "valorenletras")
    public String getValorenletras() {
        return this.valorenletras;
    }

    public void setValorenletras(String valorenletras) {
        this.valorenletras = valorenletras;
    }
}
