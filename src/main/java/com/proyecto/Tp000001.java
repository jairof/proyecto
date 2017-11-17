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
@Table(name = "tp000001", schema = "${schema}")
public class Tp000001 implements java.io.Serializable {
    @NotNull
    private Tp000001Id id;
    @NotNull
    private Tg000002 tg000002;
    @NotNull
    private Tg000012 tg000012;
    @NotNull
    private Tg000013 tg000013;
    @NotNull
    private Tg000019 tg000019;
    @NotNull
    private Tg000028 tg000028;
    @NotNull
    private Tg000029 tg000029;
    @NotNull
    private Tp000003 tp000003;
    @NotNull
    private Tp000004 tp000004;
    @NotNull
    private Tp000005 tp000005;
    @NotNull
    private Tp000006 tp000006;
    private String afpActiva;
    private String arpActiva;
    private Double basico;
    private String beeper;
    private String cajaActiva;
    private String celular;
    private String ciuCotizante;
    private String ciuLaboralCotizante;
    private String codAsesor;
    private String codAsesor2;
    @NotNull
    @NotEmpty
    @Size(max = 9)
    private String codCotizante;
    private String codIntBarrio;
    private String codigoCentroTrabajoC;
    private String codigoPostal;
    private String colombianoExterior;
    private Double cotisanteValorUpc;
    private String cotizanteEspecial;
    private Double cotizanteValorEsp;
    private String dirCotizante;
    private String emailCotizante;
    private String epsActiva;
    private String estadoCarnetArp;
    private String estadoCarnetCaja;
    private String estadoCivil;
    private String estadoCotizante;
    private Integer estrato;
    private String extranjero;
    private Date fcoberTotal;
    private Date fcoberUrgencia;
    private Date fecInicioAfp;
    private Date fecInicioArp;
    private Date fecInicioCaja;
    private Date fecInicioEps;
    private Date fechaAfiliacion;
    private Date fechaEntregaCarnetArp;
    private Date fechaEntregaCarnetCaja;
    private Date fechaIngresoEmp;
    private Date fechaNacimiento;
    private Date fechaRadicacion;
    @NotNull
    @NotEmpty
    @Size(max = 15)
    private String idenCotizante;
    private String ipsAtencionCotiza;
    private String ipsDirecionCotiza;
    private String ipsTelefonosCotiza;
    private String nafiliacionAfp;
    private String nafiliacionArp;
    private String nafiliacionCaja;
    private String nafiliacionEps;
    private String numRadicacion;
    private String observacion;
    private String pagaParafiscales;
    private String planilladoRtAfp;
    private String planilladoRtArp;
    private String planilladoRtCaja;
    private String planilladoRtEps;
    private String primerApeCotizante;
    private String primerNomCotizante;
    private String primeraAfp;
    private String primeraArp;
    private String primeraCaja;
    private String primeraEps;
    private String quienRecibeCarnetArp;
    private String quienRecibeCarnetCaja;
    private String rutaFoto;
    private String salarioIntegral;
    private String segundoApeCotizante;
    private String segundoNomCotizante;
    private String sexo;
    private String telCotizante;
    private String tipoAfiliacion;
    private String tipoSalario;
    private Integer zona;

    public Tp000001() {
    }

    public Tp000001(Tp000001Id id, String afpActiva, String arpActiva,
        Double basico, String beeper, String cajaActiva, String celular,
        String ciuCotizante, String ciuLaboralCotizante, String codAsesor,
        String codAsesor2, String codCotizante, String codIntBarrio,
        String codigoCentroTrabajoC, String codigoPostal,
        String colombianoExterior, Double cotisanteValorUpc,
        String cotizanteEspecial, Double cotizanteValorEsp,
        String dirCotizante, String emailCotizante, String epsActiva,
        String estadoCarnetArp, String estadoCarnetCaja, String estadoCivil,
        String estadoCotizante, Integer estrato, String extranjero,
        Date fcoberTotal, Date fcoberUrgencia, Date fecInicioAfp,
        Date fecInicioArp, Date fecInicioCaja, Date fecInicioEps,
        Date fechaAfiliacion, Date fechaEntregaCarnetArp,
        Date fechaEntregaCarnetCaja, Date fechaIngresoEmp,
        Date fechaNacimiento, Date fechaRadicacion, String idenCotizante,
        String ipsAtencionCotiza, String ipsDirecionCotiza,
        String ipsTelefonosCotiza, String nafiliacionAfp,
        String nafiliacionArp, String nafiliacionCaja, String nafiliacionEps,
        String numRadicacion, String observacion, String pagaParafiscales,
        String planilladoRtAfp, String planilladoRtArp,
        String planilladoRtCaja, String planilladoRtEps,
        String primerApeCotizante, String primerNomCotizante,
        String primeraAfp, String primeraArp, String primeraCaja,
        String primeraEps, String quienRecibeCarnetArp,
        String quienRecibeCarnetCaja, String rutaFoto, String salarioIntegral,
        String segundoApeCotizante, String segundoNomCotizante, String sexo,
        String telCotizante, Tg000002 tg000002, Tg000011 tg000011,
        Tg000012 tg000012, Tg000013 tg000013, Tg000019 tg000019,
        Tg000028 tg000028, Tg000029 tg000029, String tipoAfiliacion,
        String tipoSalario, Tp000003 tp000003, Tp000004 tp000004,
        Tp000005 tp000005, Tp000006 tp000006, Integer zona) {
        this.id = id;
        this.tg000002 = tg000002;
        this.tg000012 = tg000012;
        this.tg000013 = tg000013;
        this.tg000019 = tg000019;
        this.tg000028 = tg000028;
        this.tg000029 = tg000029;
        this.tp000003 = tp000003;
        this.tp000004 = tp000004;
        this.tp000005 = tp000005;
        this.tp000006 = tp000006;
        this.afpActiva = afpActiva;
        this.arpActiva = arpActiva;
        this.basico = basico;
        this.beeper = beeper;
        this.cajaActiva = cajaActiva;
        this.celular = celular;
        this.ciuCotizante = ciuCotizante;
        this.ciuLaboralCotizante = ciuLaboralCotizante;
        this.codAsesor = codAsesor;
        this.codAsesor2 = codAsesor2;
        this.codCotizante = codCotizante;
        this.codIntBarrio = codIntBarrio;
        this.codigoCentroTrabajoC = codigoCentroTrabajoC;
        this.codigoPostal = codigoPostal;
        this.colombianoExterior = colombianoExterior;
        this.cotisanteValorUpc = cotisanteValorUpc;
        this.cotizanteEspecial = cotizanteEspecial;
        this.cotizanteValorEsp = cotizanteValorEsp;
        this.dirCotizante = dirCotizante;
        this.emailCotizante = emailCotizante;
        this.epsActiva = epsActiva;
        this.estadoCarnetArp = estadoCarnetArp;
        this.estadoCarnetCaja = estadoCarnetCaja;
        this.estadoCivil = estadoCivil;
        this.estadoCotizante = estadoCotizante;
        this.estrato = estrato;
        this.extranjero = extranjero;
        this.fcoberTotal = fcoberTotal;
        this.fcoberUrgencia = fcoberUrgencia;
        this.fecInicioAfp = fecInicioAfp;
        this.fecInicioArp = fecInicioArp;
        this.fecInicioCaja = fecInicioCaja;
        this.fecInicioEps = fecInicioEps;
        this.fechaAfiliacion = fechaAfiliacion;
        this.fechaEntregaCarnetArp = fechaEntregaCarnetArp;
        this.fechaEntregaCarnetCaja = fechaEntregaCarnetCaja;
        this.fechaIngresoEmp = fechaIngresoEmp;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRadicacion = fechaRadicacion;
        this.idenCotizante = idenCotizante;
        this.ipsAtencionCotiza = ipsAtencionCotiza;
        this.ipsDirecionCotiza = ipsDirecionCotiza;
        this.ipsTelefonosCotiza = ipsTelefonosCotiza;
        this.nafiliacionAfp = nafiliacionAfp;
        this.nafiliacionArp = nafiliacionArp;
        this.nafiliacionCaja = nafiliacionCaja;
        this.nafiliacionEps = nafiliacionEps;
        this.numRadicacion = numRadicacion;
        this.observacion = observacion;
        this.pagaParafiscales = pagaParafiscales;
        this.planilladoRtAfp = planilladoRtAfp;
        this.planilladoRtArp = planilladoRtArp;
        this.planilladoRtCaja = planilladoRtCaja;
        this.planilladoRtEps = planilladoRtEps;
        this.primerApeCotizante = primerApeCotizante;
        this.primerNomCotizante = primerNomCotizante;
        this.primeraAfp = primeraAfp;
        this.primeraArp = primeraArp;
        this.primeraCaja = primeraCaja;
        this.primeraEps = primeraEps;
        this.quienRecibeCarnetArp = quienRecibeCarnetArp;
        this.quienRecibeCarnetCaja = quienRecibeCarnetCaja;
        this.rutaFoto = rutaFoto;
        this.salarioIntegral = salarioIntegral;
        this.segundoApeCotizante = segundoApeCotizante;
        this.segundoNomCotizante = segundoNomCotizante;
        this.sexo = sexo;
        this.telCotizante = telCotizante;
        this.tipoAfiliacion = tipoAfiliacion;
        this.tipoSalario = tipoSalario;
        this.zona = zona;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "codEmpresa",column = @Column(name = "cod_empresa",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresaEmp",column = @Column(name = "cod_empresa_emp",nullable = false)
        )
    })
    public Tp000001Id getId() {
        return this.id;
    }

    public void setId(Tp000001Id id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_ciudad")
    public Tg000002 getTg000002() {
        return this.tg000002;
    }

    public void setTg000002(Tg000002 tg000002) {
        this.tg000002 = tg000002;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_profesion")
    public Tg000012 getTg000012() {
        return this.tg000012;
    }

    public void setTg000012(Tg000012 tg000012) {
        this.tg000012 = tg000012;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_actividad")
    public Tg000013 getTg000013() {
        return this.tg000013;
    }

    public void setTg000013(Tg000013 tg000013) {
        this.tg000013 = tg000013;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_identidad")
    public Tg000019 getTg000019() {
        return this.tg000019;
    }

    public void setTg000019(Tg000019 tg000019) {
        this.tg000019 = tg000019;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipo_cotizante")
    public Tg000028 getTg000028() {
        return this.tg000028;
    }

    public void setTg000028(Tg000028 tg000028) {
        this.tg000028 = tg000028;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_sub_tipo_cotizante")
    public Tg000029 getTg000029() {
        return this.tg000029;
    }

    public void setTg000029(Tg000029 tg000029) {
        this.tg000029 = tg000029;
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

    @Column(name = "afp_activa")
    public String getAfpActiva() {
        return this.afpActiva;
    }

    public void setAfpActiva(String afpActiva) {
        this.afpActiva = afpActiva;
    }

    @Column(name = "arp_activa")
    public String getArpActiva() {
        return this.arpActiva;
    }

    public void setArpActiva(String arpActiva) {
        this.arpActiva = arpActiva;
    }

    @Column(name = "basico")
    public Double getBasico() {
        return this.basico;
    }

    public void setBasico(Double basico) {
        this.basico = basico;
    }

    @Column(name = "beeper")
    public String getBeeper() {
        return this.beeper;
    }

    public void setBeeper(String beeper) {
        this.beeper = beeper;
    }

    @Column(name = "caja_activa")
    public String getCajaActiva() {
        return this.cajaActiva;
    }

    public void setCajaActiva(String cajaActiva) {
        this.cajaActiva = cajaActiva;
    }

    @Column(name = "celular")
    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name = "ciu_cotizante")
    public String getCiuCotizante() {
        return this.ciuCotizante;
    }

    public void setCiuCotizante(String ciuCotizante) {
        this.ciuCotizante = ciuCotizante;
    }

    @Column(name = "ciu_laboral_cotizante")
    public String getCiuLaboralCotizante() {
        return this.ciuLaboralCotizante;
    }

    public void setCiuLaboralCotizante(String ciuLaboralCotizante) {
        this.ciuLaboralCotizante = ciuLaboralCotizante;
    }

    @Column(name = "cod_asesor")
    public String getCodAsesor() {
        return this.codAsesor;
    }

    public void setCodAsesor(String codAsesor) {
        this.codAsesor = codAsesor;
    }

    @Column(name = "cod_asesor2")
    public String getCodAsesor2() {
        return this.codAsesor2;
    }

    public void setCodAsesor2(String codAsesor2) {
        this.codAsesor2 = codAsesor2;
    }

    @Column(name = "cod_cotizante", nullable = false)
    public String getCodCotizante() {
        return this.codCotizante;
    }

    public void setCodCotizante(String codCotizante) {
        this.codCotizante = codCotizante;
    }

    @Column(name = "cod_int_barrio")
    public String getCodIntBarrio() {
        return this.codIntBarrio;
    }

    public void setCodIntBarrio(String codIntBarrio) {
        this.codIntBarrio = codIntBarrio;
    }

    @Column(name = "codigo_centro_trabajo_c")
    public String getCodigoCentroTrabajoC() {
        return this.codigoCentroTrabajoC;
    }

    public void setCodigoCentroTrabajoC(String codigoCentroTrabajoC) {
        this.codigoCentroTrabajoC = codigoCentroTrabajoC;
    }

    @Column(name = "codigo_postal")
    public String getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Column(name = "colombiano_exterior")
    public String getColombianoExterior() {
        return this.colombianoExterior;
    }

    public void setColombianoExterior(String colombianoExterior) {
        this.colombianoExterior = colombianoExterior;
    }

    @Column(name = "cotisante_valor_upc")
    public Double getCotisanteValorUpc() {
        return this.cotisanteValorUpc;
    }

    public void setCotisanteValorUpc(Double cotisanteValorUpc) {
        this.cotisanteValorUpc = cotisanteValorUpc;
    }

    @Column(name = "cotizante_especial")
    public String getCotizanteEspecial() {
        return this.cotizanteEspecial;
    }

    public void setCotizanteEspecial(String cotizanteEspecial) {
        this.cotizanteEspecial = cotizanteEspecial;
    }

    @Column(name = "cotizante_valor_esp")
    public Double getCotizanteValorEsp() {
        return this.cotizanteValorEsp;
    }

    public void setCotizanteValorEsp(Double cotizanteValorEsp) {
        this.cotizanteValorEsp = cotizanteValorEsp;
    }

    @Column(name = "dir_cotizante")
    public String getDirCotizante() {
        return this.dirCotizante;
    }

    public void setDirCotizante(String dirCotizante) {
        this.dirCotizante = dirCotizante;
    }

    @Column(name = "email_cotizante")
    public String getEmailCotizante() {
        return this.emailCotizante;
    }

    public void setEmailCotizante(String emailCotizante) {
        this.emailCotizante = emailCotizante;
    }

    @Column(name = "eps_activa")
    public String getEpsActiva() {
        return this.epsActiva;
    }

    public void setEpsActiva(String epsActiva) {
        this.epsActiva = epsActiva;
    }

    @Column(name = "estado_carnet_arp")
    public String getEstadoCarnetArp() {
        return this.estadoCarnetArp;
    }

    public void setEstadoCarnetArp(String estadoCarnetArp) {
        this.estadoCarnetArp = estadoCarnetArp;
    }

    @Column(name = "estado_carnet_caja")
    public String getEstadoCarnetCaja() {
        return this.estadoCarnetCaja;
    }

    public void setEstadoCarnetCaja(String estadoCarnetCaja) {
        this.estadoCarnetCaja = estadoCarnetCaja;
    }

    @Column(name = "estado_civil")
    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Column(name = "estado_cotizante")
    public String getEstadoCotizante() {
        return this.estadoCotizante;
    }

    public void setEstadoCotizante(String estadoCotizante) {
        this.estadoCotizante = estadoCotizante;
    }

    @Column(name = "estrato")
    public Integer getEstrato() {
        return this.estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    @Column(name = "extranjero")
    public String getExtranjero() {
        return this.extranjero;
    }

    public void setExtranjero(String extranjero) {
        this.extranjero = extranjero;
    }

    @Column(name = "fcober_total")
    public Date getFcoberTotal() {
        return this.fcoberTotal;
    }

    public void setFcoberTotal(Date fcoberTotal) {
        this.fcoberTotal = fcoberTotal;
    }

    @Column(name = "fcober_urgencia")
    public Date getFcoberUrgencia() {
        return this.fcoberUrgencia;
    }

    public void setFcoberUrgencia(Date fcoberUrgencia) {
        this.fcoberUrgencia = fcoberUrgencia;
    }

    @Column(name = "fec_inicio_afp")
    public Date getFecInicioAfp() {
        return this.fecInicioAfp;
    }

    public void setFecInicioAfp(Date fecInicioAfp) {
        this.fecInicioAfp = fecInicioAfp;
    }

    @Column(name = "fec_inicio_arp")
    public Date getFecInicioArp() {
        return this.fecInicioArp;
    }

    public void setFecInicioArp(Date fecInicioArp) {
        this.fecInicioArp = fecInicioArp;
    }

    @Column(name = "fec_inicio_caja")
    public Date getFecInicioCaja() {
        return this.fecInicioCaja;
    }

    public void setFecInicioCaja(Date fecInicioCaja) {
        this.fecInicioCaja = fecInicioCaja;
    }

    @Column(name = "fec_inicio_eps")
    public Date getFecInicioEps() {
        return this.fecInicioEps;
    }

    public void setFecInicioEps(Date fecInicioEps) {
        this.fecInicioEps = fecInicioEps;
    }

    @Column(name = "fecha_afiliacion")
    public Date getFechaAfiliacion() {
        return this.fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    @Column(name = "fecha_entrega_carnet_arp")
    public Date getFechaEntregaCarnetArp() {
        return this.fechaEntregaCarnetArp;
    }

    public void setFechaEntregaCarnetArp(Date fechaEntregaCarnetArp) {
        this.fechaEntregaCarnetArp = fechaEntregaCarnetArp;
    }

    @Column(name = "fecha_entrega_carnet_caja")
    public Date getFechaEntregaCarnetCaja() {
        return this.fechaEntregaCarnetCaja;
    }

    public void setFechaEntregaCarnetCaja(Date fechaEntregaCarnetCaja) {
        this.fechaEntregaCarnetCaja = fechaEntregaCarnetCaja;
    }

    @Column(name = "fecha_ingreso_emp")
    public Date getFechaIngresoEmp() {
        return this.fechaIngresoEmp;
    }

    public void setFechaIngresoEmp(Date fechaIngresoEmp) {
        this.fechaIngresoEmp = fechaIngresoEmp;
    }

    @Column(name = "fecha_nacimiento")
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Column(name = "fecha_radicacion")
    public Date getFechaRadicacion() {
        return this.fechaRadicacion;
    }

    public void setFechaRadicacion(Date fechaRadicacion) {
        this.fechaRadicacion = fechaRadicacion;
    }

    @Column(name = "iden_cotizante", nullable = false)
    public String getIdenCotizante() {
        return this.idenCotizante;
    }

    public void setIdenCotizante(String idenCotizante) {
        this.idenCotizante = idenCotizante;
    }

    @Column(name = "ips_atencion_cotiza")
    public String getIpsAtencionCotiza() {
        return this.ipsAtencionCotiza;
    }

    public void setIpsAtencionCotiza(String ipsAtencionCotiza) {
        this.ipsAtencionCotiza = ipsAtencionCotiza;
    }

    @Column(name = "ips_direcion_cotiza")
    public String getIpsDirecionCotiza() {
        return this.ipsDirecionCotiza;
    }

    public void setIpsDirecionCotiza(String ipsDirecionCotiza) {
        this.ipsDirecionCotiza = ipsDirecionCotiza;
    }

    @Column(name = "ips_telefonos_cotiza")
    public String getIpsTelefonosCotiza() {
        return this.ipsTelefonosCotiza;
    }

    public void setIpsTelefonosCotiza(String ipsTelefonosCotiza) {
        this.ipsTelefonosCotiza = ipsTelefonosCotiza;
    }

    @Column(name = "nafiliacion_afp")
    public String getNafiliacionAfp() {
        return this.nafiliacionAfp;
    }

    public void setNafiliacionAfp(String nafiliacionAfp) {
        this.nafiliacionAfp = nafiliacionAfp;
    }

    @Column(name = "nafiliacion_arp")
    public String getNafiliacionArp() {
        return this.nafiliacionArp;
    }

    public void setNafiliacionArp(String nafiliacionArp) {
        this.nafiliacionArp = nafiliacionArp;
    }

    @Column(name = "nafiliacion_caja")
    public String getNafiliacionCaja() {
        return this.nafiliacionCaja;
    }

    public void setNafiliacionCaja(String nafiliacionCaja) {
        this.nafiliacionCaja = nafiliacionCaja;
    }

    @Column(name = "nafiliacion_eps")
    public String getNafiliacionEps() {
        return this.nafiliacionEps;
    }

    public void setNafiliacionEps(String nafiliacionEps) {
        this.nafiliacionEps = nafiliacionEps;
    }

    @Column(name = "num_radicacion")
    public String getNumRadicacion() {
        return this.numRadicacion;
    }

    public void setNumRadicacion(String numRadicacion) {
        this.numRadicacion = numRadicacion;
    }

    @Column(name = "observacion")
    public String getObservacion() {
        return this.observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Column(name = "paga_parafiscales")
    public String getPagaParafiscales() {
        return this.pagaParafiscales;
    }

    public void setPagaParafiscales(String pagaParafiscales) {
        this.pagaParafiscales = pagaParafiscales;
    }

    @Column(name = "planillado_rt_afp")
    public String getPlanilladoRtAfp() {
        return this.planilladoRtAfp;
    }

    public void setPlanilladoRtAfp(String planilladoRtAfp) {
        this.planilladoRtAfp = planilladoRtAfp;
    }

    @Column(name = "planillado_rt_arp")
    public String getPlanilladoRtArp() {
        return this.planilladoRtArp;
    }

    public void setPlanilladoRtArp(String planilladoRtArp) {
        this.planilladoRtArp = planilladoRtArp;
    }

    @Column(name = "planillado_rt_caja")
    public String getPlanilladoRtCaja() {
        return this.planilladoRtCaja;
    }

    public void setPlanilladoRtCaja(String planilladoRtCaja) {
        this.planilladoRtCaja = planilladoRtCaja;
    }

    @Column(name = "planillado_rt_eps")
    public String getPlanilladoRtEps() {
        return this.planilladoRtEps;
    }

    public void setPlanilladoRtEps(String planilladoRtEps) {
        this.planilladoRtEps = planilladoRtEps;
    }

    @Column(name = "primer_ape_cotizante")
    public String getPrimerApeCotizante() {
        return this.primerApeCotizante;
    }

    public void setPrimerApeCotizante(String primerApeCotizante) {
        this.primerApeCotizante = primerApeCotizante;
    }

    @Column(name = "primer_nom_cotizante")
    public String getPrimerNomCotizante() {
        return this.primerNomCotizante;
    }

    public void setPrimerNomCotizante(String primerNomCotizante) {
        this.primerNomCotizante = primerNomCotizante;
    }

    @Column(name = "primera_afp")
    public String getPrimeraAfp() {
        return this.primeraAfp;
    }

    public void setPrimeraAfp(String primeraAfp) {
        this.primeraAfp = primeraAfp;
    }

    @Column(name = "primera_arp")
    public String getPrimeraArp() {
        return this.primeraArp;
    }

    public void setPrimeraArp(String primeraArp) {
        this.primeraArp = primeraArp;
    }

    @Column(name = "primera_caja")
    public String getPrimeraCaja() {
        return this.primeraCaja;
    }

    public void setPrimeraCaja(String primeraCaja) {
        this.primeraCaja = primeraCaja;
    }

    @Column(name = "primera_eps")
    public String getPrimeraEps() {
        return this.primeraEps;
    }

    public void setPrimeraEps(String primeraEps) {
        this.primeraEps = primeraEps;
    }

    @Column(name = "quien_recibe_carnet_arp")
    public String getQuienRecibeCarnetArp() {
        return this.quienRecibeCarnetArp;
    }

    public void setQuienRecibeCarnetArp(String quienRecibeCarnetArp) {
        this.quienRecibeCarnetArp = quienRecibeCarnetArp;
    }

    @Column(name = "quien_recibe_carnet_caja")
    public String getQuienRecibeCarnetCaja() {
        return this.quienRecibeCarnetCaja;
    }

    public void setQuienRecibeCarnetCaja(String quienRecibeCarnetCaja) {
        this.quienRecibeCarnetCaja = quienRecibeCarnetCaja;
    }

    @Column(name = "ruta_foto")
    public String getRutaFoto() {
        return this.rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    @Column(name = "salario_integral")
    public String getSalarioIntegral() {
        return this.salarioIntegral;
    }

    public void setSalarioIntegral(String salarioIntegral) {
        this.salarioIntegral = salarioIntegral;
    }

    @Column(name = "segundo_ape_cotizante")
    public String getSegundoApeCotizante() {
        return this.segundoApeCotizante;
    }

    public void setSegundoApeCotizante(String segundoApeCotizante) {
        this.segundoApeCotizante = segundoApeCotizante;
    }

    @Column(name = "segundo_nom_cotizante")
    public String getSegundoNomCotizante() {
        return this.segundoNomCotizante;
    }

    public void setSegundoNomCotizante(String segundoNomCotizante) {
        this.segundoNomCotizante = segundoNomCotizante;
    }

    @Column(name = "sexo")
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Column(name = "tel_cotizante")
    public String getTelCotizante() {
        return this.telCotizante;
    }

    public void setTelCotizante(String telCotizante) {
        this.telCotizante = telCotizante;
    }

    @Column(name = "tipo_afiliacion")
    public String getTipoAfiliacion() {
        return this.tipoAfiliacion;
    }

    public void setTipoAfiliacion(String tipoAfiliacion) {
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Column(name = "tipo_salario")
    public String getTipoSalario() {
        return this.tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

    @Column(name = "zona")
    public Integer getZona() {
        return this.zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }
}
