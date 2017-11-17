package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tp000001;

import com.proyecto.control.*;

import com.proyecto.dto.Tp000001DTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Component
@Scope("singleton")
public class Tp000001Mapper implements ITp000001Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tp000001Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000002 entities
    *
    */
    @Autowired
    ITg000002Logic logicTg0000021;

    /**
    * Logic injected by Spring that manages Tg000012 entities
    *
    */
    @Autowired
    ITg000012Logic logicTg0000122;

    /**
    * Logic injected by Spring that manages Tg000013 entities
    *
    */
    @Autowired
    ITg000013Logic logicTg0000133;

    /**
    * Logic injected by Spring that manages Tg000019 entities
    *
    */
    @Autowired
    ITg000019Logic logicTg0000194;

    /**
    * Logic injected by Spring that manages Tg000028 entities
    *
    */
    @Autowired
    ITg000028Logic logicTg0000285;

    /**
    * Logic injected by Spring that manages Tg000029 entities
    *
    */
    @Autowired
    ITg000029Logic logicTg0000296;

    /**
    * Logic injected by Spring that manages Tp000003 entities
    *
    */
    @Autowired
    ITp000003Logic logicTp0000037;

    /**
    * Logic injected by Spring that manages Tp000004 entities
    *
    */
    @Autowired
    ITp000004Logic logicTp0000048;

    /**
    * Logic injected by Spring that manages Tp000005 entities
    *
    */
    @Autowired
    ITp000005Logic logicTp0000059;

    /**
    * Logic injected by Spring that manages Tp000006 entities
    *
    */
    @Autowired
    ITp000006Logic logicTp00000610;

    @Transactional(readOnly = true)
    public Tp000001DTO tp000001ToTp000001DTO(Tp000001 tp000001)
        throws Exception {
        try {
            Tp000001DTO tp000001DTO = new Tp000001DTO();

            tp000001DTO.setCodEmpresa(tp000001.getId().getCodEmpresa());
            tp000001DTO.setCodEmpresaEmp(tp000001.getId().getCodEmpresaEmp());
            tp000001DTO.setAfpActiva((tp000001.getAfpActiva() != null)
                ? tp000001.getAfpActiva() : null);
            tp000001DTO.setArpActiva((tp000001.getArpActiva() != null)
                ? tp000001.getArpActiva() : null);
            tp000001DTO.setBasico((tp000001.getBasico() != null)
                ? tp000001.getBasico() : null);
            tp000001DTO.setBeeper((tp000001.getBeeper() != null)
                ? tp000001.getBeeper() : null);
            tp000001DTO.setCajaActiva((tp000001.getCajaActiva() != null)
                ? tp000001.getCajaActiva() : null);
            tp000001DTO.setCelular((tp000001.getCelular() != null)
                ? tp000001.getCelular() : null);
            tp000001DTO.setCiuCotizante((tp000001.getCiuCotizante() != null)
                ? tp000001.getCiuCotizante() : null);
            tp000001DTO.setCiuLaboralCotizante((tp000001.getCiuLaboralCotizante() != null)
                ? tp000001.getCiuLaboralCotizante() : null);
            tp000001DTO.setCodAsesor((tp000001.getCodAsesor() != null)
                ? tp000001.getCodAsesor() : null);
            tp000001DTO.setCodAsesor2((tp000001.getCodAsesor2() != null)
                ? tp000001.getCodAsesor2() : null);
            tp000001DTO.setCodCotizante((tp000001.getCodCotizante() != null)
                ? tp000001.getCodCotizante() : null);
            tp000001DTO.setCodIntBarrio((tp000001.getCodIntBarrio() != null)
                ? tp000001.getCodIntBarrio() : null);
            tp000001DTO.setCodigoCentroTrabajoC((tp000001.getCodigoCentroTrabajoC() != null)
                ? tp000001.getCodigoCentroTrabajoC() : null);
            tp000001DTO.setCodigoPostal((tp000001.getCodigoPostal() != null)
                ? tp000001.getCodigoPostal() : null);
            tp000001DTO.setColombianoExterior((tp000001.getColombianoExterior() != null)
                ? tp000001.getColombianoExterior() : null);
            tp000001DTO.setCotisanteValorUpc((tp000001.getCotisanteValorUpc() != null)
                ? tp000001.getCotisanteValorUpc() : null);
            tp000001DTO.setCotizanteEspecial((tp000001.getCotizanteEspecial() != null)
                ? tp000001.getCotizanteEspecial() : null);
            tp000001DTO.setCotizanteValorEsp((tp000001.getCotizanteValorEsp() != null)
                ? tp000001.getCotizanteValorEsp() : null);
            tp000001DTO.setDirCotizante((tp000001.getDirCotizante() != null)
                ? tp000001.getDirCotizante() : null);
            tp000001DTO.setEmailCotizante((tp000001.getEmailCotizante() != null)
                ? tp000001.getEmailCotizante() : null);
            tp000001DTO.setEpsActiva((tp000001.getEpsActiva() != null)
                ? tp000001.getEpsActiva() : null);
            tp000001DTO.setEstadoCarnetArp((tp000001.getEstadoCarnetArp() != null)
                ? tp000001.getEstadoCarnetArp() : null);
            tp000001DTO.setEstadoCarnetCaja((tp000001.getEstadoCarnetCaja() != null)
                ? tp000001.getEstadoCarnetCaja() : null);
            tp000001DTO.setEstadoCivil((tp000001.getEstadoCivil() != null)
                ? tp000001.getEstadoCivil() : null);
            tp000001DTO.setEstadoCotizante((tp000001.getEstadoCotizante() != null)
                ? tp000001.getEstadoCotizante() : null);
            tp000001DTO.setEstrato((tp000001.getEstrato() != null)
                ? tp000001.getEstrato() : null);
            tp000001DTO.setExtranjero((tp000001.getExtranjero() != null)
                ? tp000001.getExtranjero() : null);
            tp000001DTO.setFcoberTotal(tp000001.getFcoberTotal());
            tp000001DTO.setFcoberUrgencia(tp000001.getFcoberUrgencia());
            tp000001DTO.setFecInicioAfp(tp000001.getFecInicioAfp());
            tp000001DTO.setFecInicioArp(tp000001.getFecInicioArp());
            tp000001DTO.setFecInicioCaja(tp000001.getFecInicioCaja());
            tp000001DTO.setFecInicioEps(tp000001.getFecInicioEps());
            tp000001DTO.setFechaAfiliacion(tp000001.getFechaAfiliacion());
            tp000001DTO.setFechaEntregaCarnetArp(tp000001.getFechaEntregaCarnetArp());
            tp000001DTO.setFechaEntregaCarnetCaja(tp000001.getFechaEntregaCarnetCaja());
            tp000001DTO.setFechaIngresoEmp(tp000001.getFechaIngresoEmp());
            tp000001DTO.setFechaNacimiento(tp000001.getFechaNacimiento());
            tp000001DTO.setFechaRadicacion(tp000001.getFechaRadicacion());
            tp000001DTO.setIdenCotizante((tp000001.getIdenCotizante() != null)
                ? tp000001.getIdenCotizante() : null);
            tp000001DTO.setIpsAtencionCotiza((tp000001.getIpsAtencionCotiza() != null)
                ? tp000001.getIpsAtencionCotiza() : null);
            tp000001DTO.setIpsDirecionCotiza((tp000001.getIpsDirecionCotiza() != null)
                ? tp000001.getIpsDirecionCotiza() : null);
            tp000001DTO.setIpsTelefonosCotiza((tp000001.getIpsTelefonosCotiza() != null)
                ? tp000001.getIpsTelefonosCotiza() : null);
            tp000001DTO.setNafiliacionAfp((tp000001.getNafiliacionAfp() != null)
                ? tp000001.getNafiliacionAfp() : null);
            tp000001DTO.setNafiliacionArp((tp000001.getNafiliacionArp() != null)
                ? tp000001.getNafiliacionArp() : null);
            tp000001DTO.setNafiliacionCaja((tp000001.getNafiliacionCaja() != null)
                ? tp000001.getNafiliacionCaja() : null);
            tp000001DTO.setNafiliacionEps((tp000001.getNafiliacionEps() != null)
                ? tp000001.getNafiliacionEps() : null);
            tp000001DTO.setNumRadicacion((tp000001.getNumRadicacion() != null)
                ? tp000001.getNumRadicacion() : null);
            tp000001DTO.setObservacion((tp000001.getObservacion() != null)
                ? tp000001.getObservacion() : null);
            tp000001DTO.setPagaParafiscales((tp000001.getPagaParafiscales() != null)
                ? tp000001.getPagaParafiscales() : null);
            tp000001DTO.setPlanilladoRtAfp((tp000001.getPlanilladoRtAfp() != null)
                ? tp000001.getPlanilladoRtAfp() : null);
            tp000001DTO.setPlanilladoRtArp((tp000001.getPlanilladoRtArp() != null)
                ? tp000001.getPlanilladoRtArp() : null);
            tp000001DTO.setPlanilladoRtCaja((tp000001.getPlanilladoRtCaja() != null)
                ? tp000001.getPlanilladoRtCaja() : null);
            tp000001DTO.setPlanilladoRtEps((tp000001.getPlanilladoRtEps() != null)
                ? tp000001.getPlanilladoRtEps() : null);
            tp000001DTO.setPrimerApeCotizante((tp000001.getPrimerApeCotizante() != null)
                ? tp000001.getPrimerApeCotizante() : null);
            tp000001DTO.setPrimerNomCotizante((tp000001.getPrimerNomCotizante() != null)
                ? tp000001.getPrimerNomCotizante() : null);
            tp000001DTO.setPrimeraAfp((tp000001.getPrimeraAfp() != null)
                ? tp000001.getPrimeraAfp() : null);
            tp000001DTO.setPrimeraArp((tp000001.getPrimeraArp() != null)
                ? tp000001.getPrimeraArp() : null);
            tp000001DTO.setPrimeraCaja((tp000001.getPrimeraCaja() != null)
                ? tp000001.getPrimeraCaja() : null);
            tp000001DTO.setPrimeraEps((tp000001.getPrimeraEps() != null)
                ? tp000001.getPrimeraEps() : null);
            tp000001DTO.setQuienRecibeCarnetArp((tp000001.getQuienRecibeCarnetArp() != null)
                ? tp000001.getQuienRecibeCarnetArp() : null);
            tp000001DTO.setQuienRecibeCarnetCaja((tp000001.getQuienRecibeCarnetCaja() != null)
                ? tp000001.getQuienRecibeCarnetCaja() : null);
            tp000001DTO.setRutaFoto((tp000001.getRutaFoto() != null)
                ? tp000001.getRutaFoto() : null);
            tp000001DTO.setSalarioIntegral((tp000001.getSalarioIntegral() != null)
                ? tp000001.getSalarioIntegral() : null);
            tp000001DTO.setSegundoApeCotizante((tp000001.getSegundoApeCotizante() != null)
                ? tp000001.getSegundoApeCotizante() : null);
            tp000001DTO.setSegundoNomCotizante((tp000001.getSegundoNomCotizante() != null)
                ? tp000001.getSegundoNomCotizante() : null);
            tp000001DTO.setSexo((tp000001.getSexo() != null)
                ? tp000001.getSexo() : null);
            tp000001DTO.setTelCotizante((tp000001.getTelCotizante() != null)
                ? tp000001.getTelCotizante() : null);
            tp000001DTO.setTipoAfiliacion((tp000001.getTipoAfiliacion() != null)
                ? tp000001.getTipoAfiliacion() : null);
            tp000001DTO.setTipoSalario((tp000001.getTipoSalario() != null)
                ? tp000001.getTipoSalario() : null);
            tp000001DTO.setZona((tp000001.getZona() != null)
                ? tp000001.getZona() : null);
            tp000001DTO.setCodCiudad_Tg000002((tp000001.getTg000002()
                                                       .getCodCiudad() != null)
                ? tp000001.getTg000002().getCodCiudad() : null);
            tp000001DTO.setCodProfesion_Tg000012((tp000001.getTg000012()
                                                          .getCodProfesion() != null)
                ? tp000001.getTg000012().getCodProfesion() : null);
            tp000001DTO.setCodActividad_Tg000013((tp000001.getTg000013()
                                                          .getCodActividad() != null)
                ? tp000001.getTg000013().getCodActividad() : null);
            tp000001DTO.setCodIdentidad_Tg000019((tp000001.getTg000019()
                                                          .getCodIdentidad() != null)
                ? tp000001.getTg000019().getCodIdentidad() : null);
            tp000001DTO.setCodTipoCotizante_Tg000028((tp000001.getTg000028()
                                                              .getCodTipoCotizante() != null)
                ? tp000001.getTg000028().getCodTipoCotizante() : null);
            tp000001DTO.setCodSubTipoCotizante_Tg000029((tp000001.getTg000029()
                                                                 .getCodSubTipoCotizante() != null)
                ? tp000001.getTg000029().getCodSubTipoCotizante() : null);
            tp000001DTO.setCodEps_Tp000003((tp000001.getTp000003().getCodEps() != null)
                ? tp000001.getTp000003().getCodEps() : null);
            tp000001DTO.setCodArp_Tp000004((tp000001.getTp000004().getCodArp() != null)
                ? tp000001.getTp000004().getCodArp() : null);
            tp000001DTO.setCodAfp_Tp000005((tp000001.getTp000005().getCodAfp() != null)
                ? tp000001.getTp000005().getCodAfp() : null);
            tp000001DTO.setCodCaja_Tp000006((tp000001.getTp000006().getCodCaja() != null)
                ? tp000001.getTp000006().getCodCaja() : null);

            return tp000001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000001 tp000001DTOToTp000001(Tp000001DTO tp000001DTO)
        throws Exception {
        try {
            Tp000001 tp000001 = new Tp000001();

            Tp000001Id tp000001Id = new Tp000001Id();

            if ((tp000001DTO.getCodEmpresa() != null) &&
                    (tp000001DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tp000001Id.setCodEmpresa((tp000001DTO.getCodEmpresa() != null)
                ? tp000001DTO.getCodEmpresa() : null);

            if ((tp000001DTO.getCodEmpresaEmp() != null) &&
                    (tp000001DTO.getCodEmpresaEmp().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tp000001Id.setCodEmpresaEmp((tp000001DTO.getCodEmpresaEmp() != null)
                ? tp000001DTO.getCodEmpresaEmp() : null);
            tp000001.setId(tp000001Id);
            tp000001.setAfpActiva((tp000001DTO.getAfpActiva() != null)
                ? tp000001DTO.getAfpActiva() : null);
            tp000001.setArpActiva((tp000001DTO.getArpActiva() != null)
                ? tp000001DTO.getArpActiva() : null);
            tp000001.setBasico((tp000001DTO.getBasico() != null)
                ? tp000001DTO.getBasico() : null);
            tp000001.setBeeper((tp000001DTO.getBeeper() != null)
                ? tp000001DTO.getBeeper() : null);
            tp000001.setCajaActiva((tp000001DTO.getCajaActiva() != null)
                ? tp000001DTO.getCajaActiva() : null);
            tp000001.setCelular((tp000001DTO.getCelular() != null)
                ? tp000001DTO.getCelular() : null);
            tp000001.setCiuCotizante((tp000001DTO.getCiuCotizante() != null)
                ? tp000001DTO.getCiuCotizante() : null);
            tp000001.setCiuLaboralCotizante((tp000001DTO.getCiuLaboralCotizante() != null)
                ? tp000001DTO.getCiuLaboralCotizante() : null);
            tp000001.setCodAsesor((tp000001DTO.getCodAsesor() != null)
                ? tp000001DTO.getCodAsesor() : null);
            tp000001.setCodAsesor2((tp000001DTO.getCodAsesor2() != null)
                ? tp000001DTO.getCodAsesor2() : null);
            tp000001.setCodCotizante((tp000001DTO.getCodCotizante() != null)
                ? tp000001DTO.getCodCotizante() : null);
            tp000001.setCodIntBarrio((tp000001DTO.getCodIntBarrio() != null)
                ? tp000001DTO.getCodIntBarrio() : null);
            tp000001.setCodigoCentroTrabajoC((tp000001DTO.getCodigoCentroTrabajoC() != null)
                ? tp000001DTO.getCodigoCentroTrabajoC() : null);
            tp000001.setCodigoPostal((tp000001DTO.getCodigoPostal() != null)
                ? tp000001DTO.getCodigoPostal() : null);
            tp000001.setColombianoExterior((tp000001DTO.getColombianoExterior() != null)
                ? tp000001DTO.getColombianoExterior() : null);
            tp000001.setCotisanteValorUpc((tp000001DTO.getCotisanteValorUpc() != null)
                ? tp000001DTO.getCotisanteValorUpc() : null);
            tp000001.setCotizanteEspecial((tp000001DTO.getCotizanteEspecial() != null)
                ? tp000001DTO.getCotizanteEspecial() : null);
            tp000001.setCotizanteValorEsp((tp000001DTO.getCotizanteValorEsp() != null)
                ? tp000001DTO.getCotizanteValorEsp() : null);
            tp000001.setDirCotizante((tp000001DTO.getDirCotizante() != null)
                ? tp000001DTO.getDirCotizante() : null);
            tp000001.setEmailCotizante((tp000001DTO.getEmailCotizante() != null)
                ? tp000001DTO.getEmailCotizante() : null);
            tp000001.setEpsActiva((tp000001DTO.getEpsActiva() != null)
                ? tp000001DTO.getEpsActiva() : null);
            tp000001.setEstadoCarnetArp((tp000001DTO.getEstadoCarnetArp() != null)
                ? tp000001DTO.getEstadoCarnetArp() : null);
            tp000001.setEstadoCarnetCaja((tp000001DTO.getEstadoCarnetCaja() != null)
                ? tp000001DTO.getEstadoCarnetCaja() : null);
            tp000001.setEstadoCivil((tp000001DTO.getEstadoCivil() != null)
                ? tp000001DTO.getEstadoCivil() : null);
            tp000001.setEstadoCotizante((tp000001DTO.getEstadoCotizante() != null)
                ? tp000001DTO.getEstadoCotizante() : null);
            tp000001.setEstrato((tp000001DTO.getEstrato() != null)
                ? tp000001DTO.getEstrato() : null);
            tp000001.setExtranjero((tp000001DTO.getExtranjero() != null)
                ? tp000001DTO.getExtranjero() : null);
            tp000001.setFcoberTotal(tp000001DTO.getFcoberTotal());
            tp000001.setFcoberUrgencia(tp000001DTO.getFcoberUrgencia());
            tp000001.setFecInicioAfp(tp000001DTO.getFecInicioAfp());
            tp000001.setFecInicioArp(tp000001DTO.getFecInicioArp());
            tp000001.setFecInicioCaja(tp000001DTO.getFecInicioCaja());
            tp000001.setFecInicioEps(tp000001DTO.getFecInicioEps());
            tp000001.setFechaAfiliacion(tp000001DTO.getFechaAfiliacion());
            tp000001.setFechaEntregaCarnetArp(tp000001DTO.getFechaEntregaCarnetArp());
            tp000001.setFechaEntregaCarnetCaja(tp000001DTO.getFechaEntregaCarnetCaja());
            tp000001.setFechaIngresoEmp(tp000001DTO.getFechaIngresoEmp());
            tp000001.setFechaNacimiento(tp000001DTO.getFechaNacimiento());
            tp000001.setFechaRadicacion(tp000001DTO.getFechaRadicacion());
            tp000001.setIdenCotizante((tp000001DTO.getIdenCotizante() != null)
                ? tp000001DTO.getIdenCotizante() : null);
            tp000001.setIpsAtencionCotiza((tp000001DTO.getIpsAtencionCotiza() != null)
                ? tp000001DTO.getIpsAtencionCotiza() : null);
            tp000001.setIpsDirecionCotiza((tp000001DTO.getIpsDirecionCotiza() != null)
                ? tp000001DTO.getIpsDirecionCotiza() : null);
            tp000001.setIpsTelefonosCotiza((tp000001DTO.getIpsTelefonosCotiza() != null)
                ? tp000001DTO.getIpsTelefonosCotiza() : null);
            tp000001.setNafiliacionAfp((tp000001DTO.getNafiliacionAfp() != null)
                ? tp000001DTO.getNafiliacionAfp() : null);
            tp000001.setNafiliacionArp((tp000001DTO.getNafiliacionArp() != null)
                ? tp000001DTO.getNafiliacionArp() : null);
            tp000001.setNafiliacionCaja((tp000001DTO.getNafiliacionCaja() != null)
                ? tp000001DTO.getNafiliacionCaja() : null);
            tp000001.setNafiliacionEps((tp000001DTO.getNafiliacionEps() != null)
                ? tp000001DTO.getNafiliacionEps() : null);
            tp000001.setNumRadicacion((tp000001DTO.getNumRadicacion() != null)
                ? tp000001DTO.getNumRadicacion() : null);
            tp000001.setObservacion((tp000001DTO.getObservacion() != null)
                ? tp000001DTO.getObservacion() : null);
            tp000001.setPagaParafiscales((tp000001DTO.getPagaParafiscales() != null)
                ? tp000001DTO.getPagaParafiscales() : null);
            tp000001.setPlanilladoRtAfp((tp000001DTO.getPlanilladoRtAfp() != null)
                ? tp000001DTO.getPlanilladoRtAfp() : null);
            tp000001.setPlanilladoRtArp((tp000001DTO.getPlanilladoRtArp() != null)
                ? tp000001DTO.getPlanilladoRtArp() : null);
            tp000001.setPlanilladoRtCaja((tp000001DTO.getPlanilladoRtCaja() != null)
                ? tp000001DTO.getPlanilladoRtCaja() : null);
            tp000001.setPlanilladoRtEps((tp000001DTO.getPlanilladoRtEps() != null)
                ? tp000001DTO.getPlanilladoRtEps() : null);
            tp000001.setPrimerApeCotizante((tp000001DTO.getPrimerApeCotizante() != null)
                ? tp000001DTO.getPrimerApeCotizante() : null);
            tp000001.setPrimerNomCotizante((tp000001DTO.getPrimerNomCotizante() != null)
                ? tp000001DTO.getPrimerNomCotizante() : null);
            tp000001.setPrimeraAfp((tp000001DTO.getPrimeraAfp() != null)
                ? tp000001DTO.getPrimeraAfp() : null);
            tp000001.setPrimeraArp((tp000001DTO.getPrimeraArp() != null)
                ? tp000001DTO.getPrimeraArp() : null);
            tp000001.setPrimeraCaja((tp000001DTO.getPrimeraCaja() != null)
                ? tp000001DTO.getPrimeraCaja() : null);
            tp000001.setPrimeraEps((tp000001DTO.getPrimeraEps() != null)
                ? tp000001DTO.getPrimeraEps() : null);
            tp000001.setQuienRecibeCarnetArp((tp000001DTO.getQuienRecibeCarnetArp() != null)
                ? tp000001DTO.getQuienRecibeCarnetArp() : null);
            tp000001.setQuienRecibeCarnetCaja((tp000001DTO.getQuienRecibeCarnetCaja() != null)
                ? tp000001DTO.getQuienRecibeCarnetCaja() : null);
            tp000001.setRutaFoto((tp000001DTO.getRutaFoto() != null)
                ? tp000001DTO.getRutaFoto() : null);
            tp000001.setSalarioIntegral((tp000001DTO.getSalarioIntegral() != null)
                ? tp000001DTO.getSalarioIntegral() : null);
            tp000001.setSegundoApeCotizante((tp000001DTO.getSegundoApeCotizante() != null)
                ? tp000001DTO.getSegundoApeCotizante() : null);
            tp000001.setSegundoNomCotizante((tp000001DTO.getSegundoNomCotizante() != null)
                ? tp000001DTO.getSegundoNomCotizante() : null);
            tp000001.setSexo((tp000001DTO.getSexo() != null)
                ? tp000001DTO.getSexo() : null);
            tp000001.setTelCotizante((tp000001DTO.getTelCotizante() != null)
                ? tp000001DTO.getTelCotizante() : null);
            tp000001.setTipoAfiliacion((tp000001DTO.getTipoAfiliacion() != null)
                ? tp000001DTO.getTipoAfiliacion() : null);
            tp000001.setTipoSalario((tp000001DTO.getTipoSalario() != null)
                ? tp000001DTO.getTipoSalario() : null);
            tp000001.setZona((tp000001DTO.getZona() != null)
                ? tp000001DTO.getZona() : null);

            Tg000002 tg000002 = logicTg0000021.getTg000002(tp000001DTO.getCodCiudad_Tg000002());

            if (tg000002 != null) {
                tp000001.setTg000002(tg000002);
            }

            Tg000012 tg000012 = logicTg0000122.getTg000012(tp000001DTO.getCodProfesion_Tg000012());

            if (tg000012 != null) {
                tp000001.setTg000012(tg000012);
            }

            Tg000013 tg000013 = logicTg0000133.getTg000013(tp000001DTO.getCodActividad_Tg000013());

            if (tg000013 != null) {
                tp000001.setTg000013(tg000013);
            }

            Tg000019 tg000019 = logicTg0000194.getTg000019(tp000001DTO.getCodIdentidad_Tg000019());

            if (tg000019 != null) {
                tp000001.setTg000019(tg000019);
            }

            Tg000028 tg000028 = logicTg0000285.getTg000028(tp000001DTO.getCodTipoCotizante_Tg000028());

            if (tg000028 != null) {
                tp000001.setTg000028(tg000028);
            }

            Tg000029 tg000029 = logicTg0000296.getTg000029(tp000001DTO.getCodSubTipoCotizante_Tg000029());

            if (tg000029 != null) {
                tp000001.setTg000029(tg000029);
            }

            Tp000003 tp000003 = logicTp0000037.getTp000003(tp000001DTO.getCodEps_Tp000003());

            if (tp000003 != null) {
                tp000001.setTp000003(tp000003);
            }

            Tp000004 tp000004 = logicTp0000048.getTp000004(tp000001DTO.getCodArp_Tp000004());

            if (tp000004 != null) {
                tp000001.setTp000004(tp000004);
            }

            Tp000005 tp000005 = logicTp0000059.getTp000005(tp000001DTO.getCodAfp_Tp000005());

            if (tp000005 != null) {
                tp000001.setTp000005(tp000005);
            }

            Tp000006 tp000006 = logicTp00000610.getTp000006(tp000001DTO.getCodCaja_Tp000006());

            if (tp000006 != null) {
                tp000001.setTp000006(tp000006);
            }

            return tp000001;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000001DTO> listTp000001ToListTp000001DTO(
        List<Tp000001> listTp000001) throws Exception {
        try {
            List<Tp000001DTO> tp000001DTOs = new ArrayList<Tp000001DTO>();

            for (Tp000001 tp000001 : listTp000001) {
                Tp000001DTO tp000001DTO = tp000001ToTp000001DTO(tp000001);

                tp000001DTOs.add(tp000001DTO);
            }

            return tp000001DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000001> listTp000001DTOToListTp000001(
        List<Tp000001DTO> listTp000001DTO) throws Exception {
        try {
            List<Tp000001> listTp000001 = new ArrayList<Tp000001>();

            for (Tp000001DTO tp000001DTO : listTp000001DTO) {
                Tp000001 tp000001 = tp000001DTOToTp000001(tp000001DTO);

                listTp000001.add(tp000001);
            }

            return listTp000001;
        } catch (Exception e) {
            throw e;
        }
    }
}
