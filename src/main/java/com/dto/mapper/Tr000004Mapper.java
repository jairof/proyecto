package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tr000004;

import com.proyecto.control.*;

import com.proyecto.dto.Tr000004DTO;

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
public class Tr000004Mapper implements ITr000004Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tr000004Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000031;

    /**
    * Logic injected by Spring that manages Tp000003 entities
    *
    */
    @Autowired
    ITp000003Logic logicTp0000032;

    /**
    * Logic injected by Spring that manages Tp000004 entities
    *
    */
    @Autowired
    ITp000004Logic logicTp0000043;

    /**
    * Logic injected by Spring that manages Tp000005 entities
    *
    */
    @Autowired
    ITp000005Logic logicTp0000054;

    /**
    * Logic injected by Spring that manages Tp000006 entities
    *
    */
    @Autowired
    ITp000006Logic logicTp0000065;

    @Transactional(readOnly = true)
    public Tr000004DTO tr000004ToTr000004DTO(Tr000004 tr000004)
        throws Exception {
        try {
            Tr000004DTO tr000004DTO = new Tr000004DTO();

            tr000004DTO.setConsecutivo(tr000004.getId().getConsecutivo());
            tr000004DTO.setCodEmpresa(tr000004.getId().getCodEmpresa());
            tr000004DTO.setAfiliacion((tr000004.getAfiliacion() != null)
                ? tr000004.getAfiliacion() : null);
            tr000004DTO.setAfiliacionporcobrar((tr000004.getAfiliacionporcobrar() != null)
                ? tr000004.getAfiliacionporcobrar() : null);
            tr000004DTO.setAfp((tr000004.getAfp() != null) ? tr000004.getAfp()
                                                           : null);
            tr000004DTO.setAnulado((tr000004.getAnulado() != null)
                ? tr000004.getAnulado() : null);
            tr000004DTO.setArp((tr000004.getArp() != null) ? tr000004.getArp()
                                                           : null);
            tr000004DTO.setCaja((tr000004.getCaja() != null)
                ? tr000004.getCaja() : null);
            tr000004DTO.setCodBancoCheque((tr000004.getCodBancoCheque() != null)
                ? tr000004.getCodBancoCheque() : null);
            tr000004DTO.setCodBancoConsignacion((tr000004.getCodBancoConsignacion() != null)
                ? tr000004.getCodBancoConsignacion() : null);
            tr000004DTO.setCodUsuario((tr000004.getCodUsuario() != null)
                ? tr000004.getCodUsuario() : null);
            tr000004DTO.setCodigoPagoMes((tr000004.getCodigoPagoMes() != null)
                ? tr000004.getCodigoPagoMes() : null);
            tr000004DTO.setComisionAsesor((tr000004.getComisionAsesor() != null)
                ? tr000004.getComisionAsesor() : null);
            tr000004DTO.setCuota((tr000004.getCuota() != null)
                ? tr000004.getCuota() : null);
            tr000004DTO.setCuotaporcobrar((tr000004.getCuotaporcobrar() != null)
                ? tr000004.getCuotaporcobrar() : null);
            tr000004DTO.setDiasCotizadosAfp((tr000004.getDiasCotizadosAfp() != null)
                ? tr000004.getDiasCotizadosAfp() : null);
            tr000004DTO.setDiasCotizadosArp((tr000004.getDiasCotizadosArp() != null)
                ? tr000004.getDiasCotizadosArp() : null);
            tr000004DTO.setDiasCotizadosCaja((tr000004.getDiasCotizadosCaja() != null)
                ? tr000004.getDiasCotizadosCaja() : null);
            tr000004DTO.setDiasCotizadosEps((tr000004.getDiasCotizadosEps() != null)
                ? tr000004.getDiasCotizadosEps() : null);
            tr000004DTO.setEps((tr000004.getEps() != null) ? tr000004.getEps()
                                                           : null);
            tr000004DTO.setFacturado((tr000004.getFacturado() != null)
                ? tr000004.getFacturado() : null);
            tr000004DTO.setFaltanteConsignacion((tr000004.getFaltanteConsignacion() != null)
                ? tr000004.getFaltanteConsignacion() : null);
            tr000004DTO.setFechaIngPagoSistema(tr000004.getFechaIngPagoSistema());
            tr000004DTO.setFechaPago(tr000004.getFechaPago());
            tr000004DTO.setHoraIngPagoSistema(tr000004.getHoraIngPagoSistema());
            tr000004DTO.setHoraPago(tr000004.getHoraPago());
            tr000004DTO.setIbc((tr000004.getIbc() != null) ? tr000004.getIbc()
                                                           : null);
            tr000004DTO.setIdenEmpresa((tr000004.getIdenEmpresa() != null)
                ? tr000004.getIdenEmpresa() : null);
            tr000004DTO.setIdentificacion((tr000004.getIdentificacion() != null)
                ? tr000004.getIdentificacion() : null);
            tr000004DTO.setNumCheque((tr000004.getNumCheque() != null)
                ? tr000004.getNumCheque() : null);
            tr000004DTO.setNumConsignacion((tr000004.getNumConsignacion() != null)
                ? tr000004.getNumConsignacion() : null);
            tr000004DTO.setNumCuentaCobro((tr000004.getNumCuentaCobro() != null)
                ? tr000004.getNumCuentaCobro() : null);
            tr000004DTO.setNumPersonas((tr000004.getNumPersonas() != null)
                ? tr000004.getNumPersonas() : null);
            tr000004DTO.setOtros((tr000004.getOtros() != null)
                ? tr000004.getOtros() : null);
            tr000004DTO.setPagoCheque((tr000004.getPagoCheque() != null)
                ? tr000004.getPagoCheque() : null);
            tr000004DTO.setPagoConsignacion((tr000004.getPagoConsignacion() != null)
                ? tr000004.getPagoConsignacion() : null);
            tr000004DTO.setPagoEfectivo((tr000004.getPagoEfectivo() != null)
                ? tr000004.getPagoEfectivo() : null);
            tr000004DTO.setPagoRetiro((tr000004.getPagoRetiro() != null)
                ? tr000004.getPagoRetiro() : null);
            tr000004DTO.setPagoRetiroporcobrar((tr000004.getPagoRetiroporcobrar() != null)
                ? tr000004.getPagoRetiroporcobrar() : null);
            tr000004DTO.setPeriodo((tr000004.getPeriodo() != null)
                ? tr000004.getPeriodo() : null);
            tr000004DTO.setPeriodoRp((tr000004.getPeriodoRp() != null)
                ? tr000004.getPeriodoRp() : null);
            tr000004DTO.setPlanilladoAfp((tr000004.getPlanilladoAfp() != null)
                ? tr000004.getPlanilladoAfp() : null);
            tr000004DTO.setPlanilladoArp((tr000004.getPlanilladoArp() != null)
                ? tr000004.getPlanilladoArp() : null);
            tr000004DTO.setPlanilladoCaja((tr000004.getPlanilladoCaja() != null)
                ? tr000004.getPlanilladoCaja() : null);
            tr000004DTO.setPlanilladoEps((tr000004.getPlanilladoEps() != null)
                ? tr000004.getPlanilladoEps() : null);
            tr000004DTO.setPorcRiesgo((tr000004.getPorcRiesgo() != null)
                ? tr000004.getPorcRiesgo() : null);
            tr000004DTO.setReactivacion((tr000004.getReactivacion() != null)
                ? tr000004.getReactivacion() : null);
            tr000004DTO.setReactivacionporcobrar((tr000004.getReactivacionporcobrar() != null)
                ? tr000004.getReactivacionporcobrar() : null);
            tr000004DTO.setRecibPrimeraAfp((tr000004.getRecibPrimeraAfp() != null)
                ? tr000004.getRecibPrimeraAfp() : null);
            tr000004DTO.setRecibPrimeraArp((tr000004.getRecibPrimeraArp() != null)
                ? tr000004.getRecibPrimeraArp() : null);
            tr000004DTO.setRecibPrimeraCaja((tr000004.getRecibPrimeraCaja() != null)
                ? tr000004.getRecibPrimeraCaja() : null);
            tr000004DTO.setRecibPrimeraEps((tr000004.getRecibPrimeraEps() != null)
                ? tr000004.getRecibPrimeraEps() : null);
            tr000004DTO.setReciboCuentaCobro((tr000004.getReciboCuentaCobro() != null)
                ? tr000004.getReciboCuentaCobro() : null);
            tr000004DTO.setRiesgos((tr000004.getRiesgos() != null)
                ? tr000004.getRiesgos() : null);
            tr000004DTO.setValAdmonAfprec((tr000004.getValAdmonAfprec() != null)
                ? tr000004.getValAdmonAfprec() : null);
            tr000004DTO.setValAdmonRec((tr000004.getValAdmonRec() != null)
                ? tr000004.getValAdmonRec() : null);
            tr000004DTO.setValorAfiliacion((tr000004.getValorAfiliacion() != null)
                ? tr000004.getValorAfiliacion() : null);
            tr000004DTO.setValorCheque((tr000004.getValorCheque() != null)
                ? tr000004.getValorCheque() : null);
            tr000004DTO.setValorConsignacion((tr000004.getValorConsignacion() != null)
                ? tr000004.getValorConsignacion() : null);
            tr000004DTO.setValorDiasCotizadosAfp((tr000004.getValorDiasCotizadosAfp() != null)
                ? tr000004.getValorDiasCotizadosAfp() : null);
            tr000004DTO.setValorDiasCotizadosArp((tr000004.getValorDiasCotizadosArp() != null)
                ? tr000004.getValorDiasCotizadosArp() : null);
            tr000004DTO.setValorDiasCotizadosCaja((tr000004.getValorDiasCotizadosCaja() != null)
                ? tr000004.getValorDiasCotizadosCaja() : null);
            tr000004DTO.setValorDiasCotizadosEps((tr000004.getValorDiasCotizadosEps() != null)
                ? tr000004.getValorDiasCotizadosEps() : null);
            tr000004DTO.setValorEfectivo((tr000004.getValorEfectivo() != null)
                ? tr000004.getValorEfectivo() : null);
            tr000004DTO.setValorFpsolidaridad((tr000004.getValorFpsolidaridad() != null)
                ? tr000004.getValorFpsolidaridad() : null);
            tr000004DTO.setValorFpsubsistencia((tr000004.getValorFpsubsistencia() != null)
                ? tr000004.getValorFpsubsistencia() : null);
            tr000004DTO.setValorIcbf((tr000004.getValorIcbf() != null)
                ? tr000004.getValorIcbf() : null);
            tr000004DTO.setValorMensajeriaRecibo((tr000004.getValorMensajeriaRecibo() != null)
                ? tr000004.getValorMensajeriaRecibo() : null);
            tr000004DTO.setValorMora((tr000004.getValorMora() != null)
                ? tr000004.getValorMora() : null);
            tr000004DTO.setValorOtrosServicios((tr000004.getValorOtrosServicios() != null)
                ? tr000004.getValorOtrosServicios() : null);
            tr000004DTO.setValorPagoMora((tr000004.getValorPagoMora() != null)
                ? tr000004.getValorPagoMora() : null);
            tr000004DTO.setValorPagoUpc((tr000004.getValorPagoUpc() != null)
                ? tr000004.getValorPagoUpc() : null);
            tr000004DTO.setValorReactivacion((tr000004.getValorReactivacion() != null)
                ? tr000004.getValorReactivacion() : null);
            tr000004DTO.setValorSalario((tr000004.getValorSalario() != null)
                ? tr000004.getValorSalario() : null);
            tr000004DTO.setValorSena((tr000004.getValorSena() != null)
                ? tr000004.getValorSena() : null);
            tr000004DTO.setValorTotal((tr000004.getValorTotal() != null)
                ? tr000004.getValorTotal() : null);
            tr000004DTO.setValorenletras((tr000004.getValorenletras() != null)
                ? tr000004.getValorenletras() : null);
            tr000004DTO.setCodEmpresa_Tg000003((tr000004.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tr000004.getTg000003().getCodEmpresa() : null);
            tr000004DTO.setCodEps_Tp000003((tr000004.getTp000003().getCodEps() != null)
                ? tr000004.getTp000003().getCodEps() : null);
            tr000004DTO.setCodArp_Tp000004((tr000004.getTp000004().getCodArp() != null)
                ? tr000004.getTp000004().getCodArp() : null);
            tr000004DTO.setCodAfp_Tp000005((tr000004.getTp000005().getCodAfp() != null)
                ? tr000004.getTp000005().getCodAfp() : null);
            tr000004DTO.setCodCaja_Tp000006((tr000004.getTp000006().getCodCaja() != null)
                ? tr000004.getTp000006().getCodCaja() : null);

            return tr000004DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tr000004 tr000004DTOToTr000004(Tr000004DTO tr000004DTO)
        throws Exception {
        try {
            Tr000004 tr000004 = new Tr000004();

            Tr000004Id tr000004Id = new Tr000004Id();

            if ((tr000004DTO.getConsecutivo() != null) &&
                    (tr000004DTO.getConsecutivo().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tr000004Id.setConsecutivo((tr000004DTO.getConsecutivo() != null)
                ? tr000004DTO.getConsecutivo() : null);

            if ((tr000004DTO.getCodEmpresa() != null) &&
                    (tr000004DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tr000004Id.setCodEmpresa((tr000004DTO.getCodEmpresa() != null)
                ? tr000004DTO.getCodEmpresa() : null);
            tr000004.setId(tr000004Id);
            tr000004.setAfiliacion((tr000004DTO.getAfiliacion() != null)
                ? tr000004DTO.getAfiliacion() : null);
            tr000004.setAfiliacionporcobrar((tr000004DTO.getAfiliacionporcobrar() != null)
                ? tr000004DTO.getAfiliacionporcobrar() : null);
            tr000004.setAfp((tr000004DTO.getAfp() != null)
                ? tr000004DTO.getAfp() : null);
            tr000004.setAnulado((tr000004DTO.getAnulado() != null)
                ? tr000004DTO.getAnulado() : null);
            tr000004.setArp((tr000004DTO.getArp() != null)
                ? tr000004DTO.getArp() : null);
            tr000004.setCaja((tr000004DTO.getCaja() != null)
                ? tr000004DTO.getCaja() : null);
            tr000004.setCodBancoCheque((tr000004DTO.getCodBancoCheque() != null)
                ? tr000004DTO.getCodBancoCheque() : null);
            tr000004.setCodBancoConsignacion((tr000004DTO.getCodBancoConsignacion() != null)
                ? tr000004DTO.getCodBancoConsignacion() : null);
            tr000004.setCodUsuario((tr000004DTO.getCodUsuario() != null)
                ? tr000004DTO.getCodUsuario() : null);
            tr000004.setCodigoPagoMes((tr000004DTO.getCodigoPagoMes() != null)
                ? tr000004DTO.getCodigoPagoMes() : null);
            tr000004.setComisionAsesor((tr000004DTO.getComisionAsesor() != null)
                ? tr000004DTO.getComisionAsesor() : null);
            tr000004.setCuota((tr000004DTO.getCuota() != null)
                ? tr000004DTO.getCuota() : null);
            tr000004.setCuotaporcobrar((tr000004DTO.getCuotaporcobrar() != null)
                ? tr000004DTO.getCuotaporcobrar() : null);
            tr000004.setDiasCotizadosAfp((tr000004DTO.getDiasCotizadosAfp() != null)
                ? tr000004DTO.getDiasCotizadosAfp() : null);
            tr000004.setDiasCotizadosArp((tr000004DTO.getDiasCotizadosArp() != null)
                ? tr000004DTO.getDiasCotizadosArp() : null);
            tr000004.setDiasCotizadosCaja((tr000004DTO.getDiasCotizadosCaja() != null)
                ? tr000004DTO.getDiasCotizadosCaja() : null);
            tr000004.setDiasCotizadosEps((tr000004DTO.getDiasCotizadosEps() != null)
                ? tr000004DTO.getDiasCotizadosEps() : null);
            tr000004.setEps((tr000004DTO.getEps() != null)
                ? tr000004DTO.getEps() : null);
            tr000004.setFacturado((tr000004DTO.getFacturado() != null)
                ? tr000004DTO.getFacturado() : null);
            tr000004.setFaltanteConsignacion((tr000004DTO.getFaltanteConsignacion() != null)
                ? tr000004DTO.getFaltanteConsignacion() : null);
            tr000004.setFechaIngPagoSistema(tr000004DTO.getFechaIngPagoSistema());
            tr000004.setFechaPago(tr000004DTO.getFechaPago());
            tr000004.setHoraIngPagoSistema(tr000004DTO.getHoraIngPagoSistema());
            tr000004.setHoraPago(tr000004DTO.getHoraPago());
            tr000004.setIbc((tr000004DTO.getIbc() != null)
                ? tr000004DTO.getIbc() : null);
            tr000004.setIdenEmpresa((tr000004DTO.getIdenEmpresa() != null)
                ? tr000004DTO.getIdenEmpresa() : null);
            tr000004.setIdentificacion((tr000004DTO.getIdentificacion() != null)
                ? tr000004DTO.getIdentificacion() : null);
            tr000004.setNumCheque((tr000004DTO.getNumCheque() != null)
                ? tr000004DTO.getNumCheque() : null);
            tr000004.setNumConsignacion((tr000004DTO.getNumConsignacion() != null)
                ? tr000004DTO.getNumConsignacion() : null);
            tr000004.setNumCuentaCobro((tr000004DTO.getNumCuentaCobro() != null)
                ? tr000004DTO.getNumCuentaCobro() : null);
            tr000004.setNumPersonas((tr000004DTO.getNumPersonas() != null)
                ? tr000004DTO.getNumPersonas() : null);
            tr000004.setOtros((tr000004DTO.getOtros() != null)
                ? tr000004DTO.getOtros() : null);
            tr000004.setPagoCheque((tr000004DTO.getPagoCheque() != null)
                ? tr000004DTO.getPagoCheque() : null);
            tr000004.setPagoConsignacion((tr000004DTO.getPagoConsignacion() != null)
                ? tr000004DTO.getPagoConsignacion() : null);
            tr000004.setPagoEfectivo((tr000004DTO.getPagoEfectivo() != null)
                ? tr000004DTO.getPagoEfectivo() : null);
            tr000004.setPagoRetiro((tr000004DTO.getPagoRetiro() != null)
                ? tr000004DTO.getPagoRetiro() : null);
            tr000004.setPagoRetiroporcobrar((tr000004DTO.getPagoRetiroporcobrar() != null)
                ? tr000004DTO.getPagoRetiroporcobrar() : null);
            tr000004.setPeriodo((tr000004DTO.getPeriodo() != null)
                ? tr000004DTO.getPeriodo() : null);
            tr000004.setPeriodoRp((tr000004DTO.getPeriodoRp() != null)
                ? tr000004DTO.getPeriodoRp() : null);
            tr000004.setPlanilladoAfp((tr000004DTO.getPlanilladoAfp() != null)
                ? tr000004DTO.getPlanilladoAfp() : null);
            tr000004.setPlanilladoArp((tr000004DTO.getPlanilladoArp() != null)
                ? tr000004DTO.getPlanilladoArp() : null);
            tr000004.setPlanilladoCaja((tr000004DTO.getPlanilladoCaja() != null)
                ? tr000004DTO.getPlanilladoCaja() : null);
            tr000004.setPlanilladoEps((tr000004DTO.getPlanilladoEps() != null)
                ? tr000004DTO.getPlanilladoEps() : null);
            tr000004.setPorcRiesgo((tr000004DTO.getPorcRiesgo() != null)
                ? tr000004DTO.getPorcRiesgo() : null);
            tr000004.setReactivacion((tr000004DTO.getReactivacion() != null)
                ? tr000004DTO.getReactivacion() : null);
            tr000004.setReactivacionporcobrar((tr000004DTO.getReactivacionporcobrar() != null)
                ? tr000004DTO.getReactivacionporcobrar() : null);
            tr000004.setRecibPrimeraAfp((tr000004DTO.getRecibPrimeraAfp() != null)
                ? tr000004DTO.getRecibPrimeraAfp() : null);
            tr000004.setRecibPrimeraArp((tr000004DTO.getRecibPrimeraArp() != null)
                ? tr000004DTO.getRecibPrimeraArp() : null);
            tr000004.setRecibPrimeraCaja((tr000004DTO.getRecibPrimeraCaja() != null)
                ? tr000004DTO.getRecibPrimeraCaja() : null);
            tr000004.setRecibPrimeraEps((tr000004DTO.getRecibPrimeraEps() != null)
                ? tr000004DTO.getRecibPrimeraEps() : null);
            tr000004.setReciboCuentaCobro((tr000004DTO.getReciboCuentaCobro() != null)
                ? tr000004DTO.getReciboCuentaCobro() : null);
            tr000004.setRiesgos((tr000004DTO.getRiesgos() != null)
                ? tr000004DTO.getRiesgos() : null);
            tr000004.setValAdmonAfprec((tr000004DTO.getValAdmonAfprec() != null)
                ? tr000004DTO.getValAdmonAfprec() : null);
            tr000004.setValAdmonRec((tr000004DTO.getValAdmonRec() != null)
                ? tr000004DTO.getValAdmonRec() : null);
            tr000004.setValorAfiliacion((tr000004DTO.getValorAfiliacion() != null)
                ? tr000004DTO.getValorAfiliacion() : null);
            tr000004.setValorCheque((tr000004DTO.getValorCheque() != null)
                ? tr000004DTO.getValorCheque() : null);
            tr000004.setValorConsignacion((tr000004DTO.getValorConsignacion() != null)
                ? tr000004DTO.getValorConsignacion() : null);
            tr000004.setValorDiasCotizadosAfp((tr000004DTO.getValorDiasCotizadosAfp() != null)
                ? tr000004DTO.getValorDiasCotizadosAfp() : null);
            tr000004.setValorDiasCotizadosArp((tr000004DTO.getValorDiasCotizadosArp() != null)
                ? tr000004DTO.getValorDiasCotizadosArp() : null);
            tr000004.setValorDiasCotizadosCaja((tr000004DTO.getValorDiasCotizadosCaja() != null)
                ? tr000004DTO.getValorDiasCotizadosCaja() : null);
            tr000004.setValorDiasCotizadosEps((tr000004DTO.getValorDiasCotizadosEps() != null)
                ? tr000004DTO.getValorDiasCotizadosEps() : null);
            tr000004.setValorEfectivo((tr000004DTO.getValorEfectivo() != null)
                ? tr000004DTO.getValorEfectivo() : null);
            tr000004.setValorFpsolidaridad((tr000004DTO.getValorFpsolidaridad() != null)
                ? tr000004DTO.getValorFpsolidaridad() : null);
            tr000004.setValorFpsubsistencia((tr000004DTO.getValorFpsubsistencia() != null)
                ? tr000004DTO.getValorFpsubsistencia() : null);
            tr000004.setValorIcbf((tr000004DTO.getValorIcbf() != null)
                ? tr000004DTO.getValorIcbf() : null);
            tr000004.setValorMensajeriaRecibo((tr000004DTO.getValorMensajeriaRecibo() != null)
                ? tr000004DTO.getValorMensajeriaRecibo() : null);
            tr000004.setValorMora((tr000004DTO.getValorMora() != null)
                ? tr000004DTO.getValorMora() : null);
            tr000004.setValorOtrosServicios((tr000004DTO.getValorOtrosServicios() != null)
                ? tr000004DTO.getValorOtrosServicios() : null);
            tr000004.setValorPagoMora((tr000004DTO.getValorPagoMora() != null)
                ? tr000004DTO.getValorPagoMora() : null);
            tr000004.setValorPagoUpc((tr000004DTO.getValorPagoUpc() != null)
                ? tr000004DTO.getValorPagoUpc() : null);
            tr000004.setValorReactivacion((tr000004DTO.getValorReactivacion() != null)
                ? tr000004DTO.getValorReactivacion() : null);
            tr000004.setValorSalario((tr000004DTO.getValorSalario() != null)
                ? tr000004DTO.getValorSalario() : null);
            tr000004.setValorSena((tr000004DTO.getValorSena() != null)
                ? tr000004DTO.getValorSena() : null);
            tr000004.setValorTotal((tr000004DTO.getValorTotal() != null)
                ? tr000004DTO.getValorTotal() : null);
            tr000004.setValorenletras((tr000004DTO.getValorenletras() != null)
                ? tr000004DTO.getValorenletras() : null);

            Tg000003 tg000003 = logicTg0000031.getTg000003(tr000004DTO.getCodEmpresa_Tg000003());

            if (tg000003 != null) {
                tr000004.setTg000003(tg000003);
            }

            Tp000003 tp000003 = logicTp0000032.getTp000003(tr000004DTO.getCodEps_Tp000003());

            if (tp000003 != null) {
                tr000004.setTp000003(tp000003);
            }

            Tp000004 tp000004 = logicTp0000043.getTp000004(tr000004DTO.getCodArp_Tp000004());

            if (tp000004 != null) {
                tr000004.setTp000004(tp000004);
            }

            Tp000005 tp000005 = logicTp0000054.getTp000005(tr000004DTO.getCodAfp_Tp000005());

            if (tp000005 != null) {
                tr000004.setTp000005(tp000005);
            }

            Tp000006 tp000006 = logicTp0000065.getTp000006(tr000004DTO.getCodCaja_Tp000006());

            if (tp000006 != null) {
                tr000004.setTp000006(tp000006);
            }

            return tr000004;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tr000004DTO> listTr000004ToListTr000004DTO(
        List<Tr000004> listTr000004) throws Exception {
        try {
            List<Tr000004DTO> tr000004DTOs = new ArrayList<Tr000004DTO>();

            for (Tr000004 tr000004 : listTr000004) {
                Tr000004DTO tr000004DTO = tr000004ToTr000004DTO(tr000004);

                tr000004DTOs.add(tr000004DTO);
            }

            return tr000004DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tr000004> listTr000004DTOToListTr000004(
        List<Tr000004DTO> listTr000004DTO) throws Exception {
        try {
            List<Tr000004> listTr000004 = new ArrayList<Tr000004>();

            for (Tr000004DTO tr000004DTO : listTr000004DTO) {
                Tr000004 tr000004 = tr000004DTOToTr000004(tr000004DTO);

                listTr000004.add(tr000004);
            }

            return listTr000004;
        } catch (Exception e) {
            throw e;
        }
    }
}
