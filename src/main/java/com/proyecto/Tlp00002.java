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
@Table(name = "tlp00002", schema = "${schema}")
public class Tlp00002 implements java.io.Serializable {
    @NotNull
    private Tlp00002Id id;
    @NotNull
    private Tp000003 tp000003;

    public Tlp00002() {
    }

    public Tlp00002(Tlp00002Id id, Tp000003 tp000003) {
        this.id = id;
        this.tp000003 = tp000003;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "numPlanilla",column = @Column(name = "num_planilla",nullable = false)
        )
        , @AttributeOverride(name = "codiEps",column = @Column(name = "codi_eps",nullable = false)
        )
        , @AttributeOverride(name = "codiArp",column = @Column(name = "codi_arp",nullable = false)
        )
        , @AttributeOverride(name = "codiAfp",column = @Column(name = "codi_afp",nullable = false)
        )
        , @AttributeOverride(name = "codiCaja",column = @Column(name = "codi_caja",nullable = false)
        )
        , @AttributeOverride(name = "cotizante",column = @Column(name = "cotizante",nullable = false)
        )
        , @AttributeOverride(name = "codEmpresaEmp",column = @Column(name = "cod_empresa_emp",nullable = false)
        )
        , @AttributeOverride(name = "ciuLaboralCotizante",column = @Column(name = "ciu_laboral_cotizante",nullable = false)
        )
        , @AttributeOverride(name = "depLaboralCotizante",column = @Column(name = "dep_laboral_cotizante",nullable = false)
        )
        , @AttributeOverride(name = "tipocotizante",column = @Column(name = "tipocotizante",nullable = false)
        )
        , @AttributeOverride(name = "subTipocotizante",column = @Column(name = "sub_tipocotizante",nullable = false)
        )
        , @AttributeOverride(name = "diasCotizados",column = @Column(name = "dias_cotizados",nullable = false)
        )
        , @AttributeOverride(name = "diasCotizadosArp",column = @Column(name = "dias_cotizados_arp",nullable = false)
        )
        , @AttributeOverride(name = "diasCotizadosAfp",column = @Column(name = "dias_cotizados_afp",nullable = false)
        )
        , @AttributeOverride(name = "diasCotizadosCaja",column = @Column(name = "dias_cotizados_caja",nullable = false)
        )
        , @AttributeOverride(name = "salarioBasico",column = @Column(name = "salario_basico",nullable = false)
        )
        , @AttributeOverride(name = "salarioCIntegral",column = @Column(name = "salario_cintegral",nullable = false)
        )
        , @AttributeOverride(name = "planillaEps",column = @Column(name = "planilla_eps",nullable = false)
        )
        , @AttributeOverride(name = "planillaArp",column = @Column(name = "planilla_arp",nullable = false)
        )
        , @AttributeOverride(name = "planillaAfp",column = @Column(name = "planilla_afp",nullable = false)
        )
        , @AttributeOverride(name = "planillaCaja",column = @Column(name = "planilla_caja",nullable = false)
        )
        , @AttributeOverride(name = "numAuincapacidad",column = @Column(name = "num_auincapacidad",nullable = false)
        )
        , @AttributeOverride(name = "valorIncapacidad",column = @Column(name = "valor_incapacidad",nullable = false)
        )
        , @AttributeOverride(name = "numAulicenciaM",column = @Column(name = "num_aulicencia_m",nullable = false)
        )
        , @AttributeOverride(name = "valorLicenciaM",column = @Column(name = "valor_licencia_m",nullable = false)
        )
        , @AttributeOverride(name = "valorUpcAdicional",column = @Column(name = "valor_upc_adicional",nullable = false)
        )
        , @AttributeOverride(name = "ingresoBaseCotizacion",column = @Column(name = "ingreso_base_cotizacion",nullable = false)
        )
        , @AttributeOverride(name = "ingresoBaseCotizacionArp",column = @Column(name = "ingreso_base_cotizacion_arp",nullable = false)
        )
        , @AttributeOverride(name = "ingresoBaseCotizacionAfp",column = @Column(name = "ingreso_base_cotizacion_afp",nullable = false)
        )
        , @AttributeOverride(name = "ingresoBaseCotizacionCaja",column = @Column(name = "ingreso_base_cotizacion_caja",nullable = false)
        )
        , @AttributeOverride(name = "ingresoBaseCotizacionSenaIcbf",column = @Column(name = "ingreso_base_cotizacion_sena_icbf",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoria",column = @Column(name = "cotización_obligatoria",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoriaArp",column = @Column(name = "cotización_obligatoria_arp",nullable = false)
        )
        , @AttributeOverride(name = "codigoCentroTrabajo",column = @Column(name = "codigo_centro_trabajo",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoriaAfp",column = @Column(name = "cotización_obligatoria_afp",nullable = false)
        )
        , @AttributeOverride(name = "valorFpsolidaridad",column = @Column(name = "valor_fpsolidaridad",nullable = false)
        )
        , @AttributeOverride(name = "valorFpsubsistencia",column = @Column(name = "valor_fpsubsistencia",nullable = false)
        )
        , @AttributeOverride(name = "riesgos",column = @Column(name = "riesgos",nullable = false)
        )
        , @AttributeOverride(name = "porcEps",column = @Column(name = "porc_eps",nullable = false)
        )
        , @AttributeOverride(name = "porcRiesgo",column = @Column(name = "porc_riesgo",nullable = false)
        )
        , @AttributeOverride(name = "porcAfp",column = @Column(name = "porc_afp",nullable = false)
        )
        , @AttributeOverride(name = "porcCaja",column = @Column(name = "porc_caja",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoriaCaja",column = @Column(name = "cotización_obligatoria_caja",nullable = false)
        )
        , @AttributeOverride(name = "porcSena",column = @Column(name = "porc_sena",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoriaSena",column = @Column(name = "cotización_obligatoria_sena",nullable = false)
        )
        , @AttributeOverride(name = "porcIcbf",column = @Column(name = "porc_icbf",nullable = false)
        )
        , @AttributeOverride(name = "cotizaciónObligatoriaIcbf",column = @Column(name = "cotización_obligatoria_icbf",nullable = false)
        )
        , @AttributeOverride(name = "detaPlanPrimeraEps",column = @Column(name = "deta_plan_primera_eps",nullable = false)
        )
        , @AttributeOverride(name = "detaPlanPrimeraArp",column = @Column(name = "deta_plan_primera_arp",nullable = false)
        )
        , @AttributeOverride(name = "detaPlanPrimeraAfp",column = @Column(name = "deta_plan_primera_afp",nullable = false)
        )
        , @AttributeOverride(name = "detaPlanPrimeraCaja",column = @Column(name = "deta_plan_primera_caja",nullable = false)
        )
        , @AttributeOverride(name = "ing",column = @Column(name = "ing",nullable = false)
        )
        , @AttributeOverride(name = "ret",column = @Column(name = "ret",nullable = false)
        )
        , @AttributeOverride(name = "tde",column = @Column(name = "tde",nullable = false)
        )
        , @AttributeOverride(name = "tae",column = @Column(name = "tae",nullable = false)
        )
        , @AttributeOverride(name = "codiEpsTraslado",column = @Column(name = "codi_eps_traslado",nullable = false)
        )
        , @AttributeOverride(name = "tdp",column = @Column(name = "tdp",nullable = false)
        )
        , @AttributeOverride(name = "tap",column = @Column(name = "tap",nullable = false)
        )
        , @AttributeOverride(name = "codiAfpTraslado",column = @Column(name = "codi_afp_traslado",nullable = false)
        )
        , @AttributeOverride(name = "tda",column = @Column(name = "tda",nullable = false)
        )
        , @AttributeOverride(name = "taa",column = @Column(name = "taa",nullable = false)
        )
        , @AttributeOverride(name = "vsp",column = @Column(name = "vsp",nullable = false)
        )
        , @AttributeOverride(name = "vte",column = @Column(name = "vte",nullable = false)
        )
        , @AttributeOverride(name = "vst",column = @Column(name = "vst",nullable = false)
        )
        , @AttributeOverride(name = "sln",column = @Column(name = "sln",nullable = false)
        )
        , @AttributeOverride(name = "ige",column = @Column(name = "ige",nullable = false)
        )
        , @AttributeOverride(name = "lma",column = @Column(name = "lma",nullable = false)
        )
        , @AttributeOverride(name = "vac",column = @Column(name = "vac",nullable = false)
        )
        , @AttributeOverride(name = "avp",column = @Column(name = "avp",nullable = false)
        )
        , @AttributeOverride(name = "vct",column = @Column(name = "vct",nullable = false)
        )
        , @AttributeOverride(name = "irp",column = @Column(name = "irp",nullable = false)
        )
        , @AttributeOverride(name = "codUsuario",column = @Column(name = "cod_usuario",nullable = false)
        )
    })
    public Tlp00002Id getId() {
        return this.id;
    }

    public void setId(Tlp00002Id id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_eps")
    public Tp000003 getTp000003() {
        return this.tp000003;
    }

    public void setTp000003(Tp000003 tp000003) {
        this.tp000003 = tp000003;
    }
}
