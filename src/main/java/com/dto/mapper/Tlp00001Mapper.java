package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tlp00001;

import com.proyecto.control.*;

import com.proyecto.dto.Tlp00001DTO;

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
public class Tlp00001Mapper implements ITlp00001Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tlp00001Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000001 entities
    *
    */
    @Autowired
    ITg000001Logic logicTg0000011;

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000032;

    /**
    * Logic injected by Spring that manages Tg000026 entities
    *
    */
    @Autowired
    ITg000026Logic logicTg0000263;

    @Transactional(readOnly = true)
    public Tlp00001DTO tlp00001ToTlp00001DTO(Tlp00001 tlp00001)
        throws Exception {
        try {
            Tlp00001DTO tlp00001DTO = new Tlp00001DTO();

            tlp00001DTO.setNumPlanilla(tlp00001.getId().getNumPlanilla());
            tlp00001DTO.setCodEmpresa(tlp00001.getId().getCodEmpresa());
            tlp00001DTO.setAfp((tlp00001.getAfp() != null) ? tlp00001.getAfp()
                                                           : null);
            tlp00001DTO.setArp((tlp00001.getArp() != null) ? tlp00001.getArp()
                                                           : null);
            tlp00001DTO.setCodBanco((tlp00001.getCodBanco() != null)
                ? tlp00001.getCodBanco() : null);
            tlp00001DTO.setCodPeriodo((tlp00001.getCodPeriodo() != null)
                ? tlp00001.getCodPeriodo() : null);
            tlp00001DTO.setCodPeriodoPeRiSc((tlp00001.getCodPeriodoPeRiSc() != null)
                ? tlp00001.getCodPeriodoPeRiSc() : null);
            tlp00001DTO.setCodigoArp((tlp00001.getCodigoArp() != null)
                ? tlp00001.getCodigoArp() : null);
            tlp00001DTO.setCodigoSucursal((tlp00001.getCodigoSucursal() != null)
                ? tlp00001.getCodigoSucursal() : null);
            tlp00001DTO.setConsecutivoPlani((tlp00001.getConsecutivoPlani() != null)
                ? tlp00001.getConsecutivoPlani() : null);
            tlp00001DTO.setCorreccionPlanilla((tlp00001.getCorreccionPlanilla() != null)
                ? tlp00001.getCorreccionPlanilla() : null);
            tlp00001DTO.setEps((tlp00001.getEps() != null) ? tlp00001.getEps()
                                                           : null);
            tlp00001DTO.setFechaCorteRetiro(tlp00001.getFechaCorteRetiro());
            tlp00001DTO.setFechaGenera(tlp00001.getFechaGenera());
            tlp00001DTO.setFechaIngPagoSistema(tlp00001.getFechaIngPagoSistema());
            tlp00001DTO.setFechaPago(tlp00001.getFechaPago());
            tlp00001DTO.setFechaPagoPlanillaCorrecion(tlp00001.getFechaPagoPlanillaCorrecion());
            tlp00001DTO.setFormaPresentacion((tlp00001.getFormaPresentacion() != null)
                ? tlp00001.getFormaPresentacion() : null);
            tlp00001DTO.setHoraGenera(tlp00001.getHoraGenera());
            tlp00001DTO.setHoraIngPagoSistema(tlp00001.getHoraIngPagoSistema());
            tlp00001DTO.setIngUsuariosPagos((tlp00001.getIngUsuariosPagos() != null)
                ? tlp00001.getIngUsuariosPagos() : null);
            tlp00001DTO.setMasIntdemora((tlp00001.getMasIntdemora() != null)
                ? tlp00001.getMasIntdemora() : null);
            tlp00001DTO.setNumCheque((tlp00001.getNumCheque() != null)
                ? tlp00001.getNumCheque() : null);
            tlp00001DTO.setNumCuentadelCheque((tlp00001.getNumCuentadelCheque() != null)
                ? tlp00001.getNumCuentadelCheque() : null);
            tlp00001DTO.setNumPlanillaCorrecion((tlp00001.getNumPlanillaCorrecion() != null)
                ? tlp00001.getNumPlanillaCorrecion() : null);
            tlp00001DTO.setNumeroMeses((tlp00001.getNumeroMeses() != null)
                ? tlp00001.getNumeroMeses() : null);
            tlp00001DTO.setNumerodeCotizantes((tlp00001.getNumerodeCotizantes() != null)
                ? tlp00001.getNumerodeCotizantes() : null);
            tlp00001DTO.setParafiscales((tlp00001.getParafiscales() != null)
                ? tlp00001.getParafiscales() : null);
            tlp00001DTO.setRetUsuariosNoPagos((tlp00001.getRetUsuariosNoPagos() != null)
                ? tlp00001.getRetUsuariosNoPagos() : null);
            tlp00001DTO.setTipoAportante((tlp00001.getTipoAportante() != null)
                ? tlp00001.getTipoAportante() : null);
            tlp00001DTO.setValorCheque((tlp00001.getValorCheque() != null)
                ? tlp00001.getValorCheque() : null);
            tlp00001DTO.setValorEfectivo((tlp00001.getValorEfectivo() != null)
                ? tlp00001.getValorEfectivo() : null);
            tlp00001DTO.setValorNomina((tlp00001.getValorNomina() != null)
                ? tlp00001.getValorNomina() : null);
            tlp00001DTO.setCodBanco_Tg000001((tlp00001.getTg000001()
                                                      .getCodBanco() != null)
                ? tlp00001.getTg000001().getCodBanco() : null);
            tlp00001DTO.setCodEmpresa_Tg000003((tlp00001.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tlp00001.getTg000003().getCodEmpresa() : null);
            tlp00001DTO.setCodTipodePlanillas_Tg000026((tlp00001.getTg000026()
                                                                .getCodTipodePlanillas() != null)
                ? tlp00001.getTg000026().getCodTipodePlanillas() : null);

            return tlp00001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tlp00001 tlp00001DTOToTlp00001(Tlp00001DTO tlp00001DTO)
        throws Exception {
        try {
            Tlp00001 tlp00001 = new Tlp00001();

            Tlp00001Id tlp00001Id = new Tlp00001Id();

            if ((tlp00001DTO.getNumPlanilla() != null) &&
                    (tlp00001DTO.getNumPlanilla().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tlp00001Id.setNumPlanilla((tlp00001DTO.getNumPlanilla() != null)
                ? tlp00001DTO.getNumPlanilla() : null);

            if ((tlp00001DTO.getCodEmpresa() != null) &&
                    (tlp00001DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tlp00001Id.setCodEmpresa((tlp00001DTO.getCodEmpresa() != null)
                ? tlp00001DTO.getCodEmpresa() : null);
            tlp00001.setId(tlp00001Id);
            tlp00001.setAfp((tlp00001DTO.getAfp() != null)
                ? tlp00001DTO.getAfp() : null);
            tlp00001.setArp((tlp00001DTO.getArp() != null)
                ? tlp00001DTO.getArp() : null);
            tlp00001.setCodBanco((tlp00001DTO.getCodBanco() != null)
                ? tlp00001DTO.getCodBanco() : null);
            tlp00001.setCodPeriodo((tlp00001DTO.getCodPeriodo() != null)
                ? tlp00001DTO.getCodPeriodo() : null);
            tlp00001.setCodPeriodoPeRiSc((tlp00001DTO.getCodPeriodoPeRiSc() != null)
                ? tlp00001DTO.getCodPeriodoPeRiSc() : null);
            tlp00001.setCodigoArp((tlp00001DTO.getCodigoArp() != null)
                ? tlp00001DTO.getCodigoArp() : null);
            tlp00001.setCodigoSucursal((tlp00001DTO.getCodigoSucursal() != null)
                ? tlp00001DTO.getCodigoSucursal() : null);
            tlp00001.setConsecutivoPlani((tlp00001DTO.getConsecutivoPlani() != null)
                ? tlp00001DTO.getConsecutivoPlani() : null);
            tlp00001.setCorreccionPlanilla((tlp00001DTO.getCorreccionPlanilla() != null)
                ? tlp00001DTO.getCorreccionPlanilla() : null);
            tlp00001.setEps((tlp00001DTO.getEps() != null)
                ? tlp00001DTO.getEps() : null);
            tlp00001.setFechaCorteRetiro(tlp00001DTO.getFechaCorteRetiro());
            tlp00001.setFechaGenera(tlp00001DTO.getFechaGenera());
            tlp00001.setFechaIngPagoSistema(tlp00001DTO.getFechaIngPagoSistema());
            tlp00001.setFechaPago(tlp00001DTO.getFechaPago());
            tlp00001.setFechaPagoPlanillaCorrecion(tlp00001DTO.getFechaPagoPlanillaCorrecion());
            tlp00001.setFormaPresentacion((tlp00001DTO.getFormaPresentacion() != null)
                ? tlp00001DTO.getFormaPresentacion() : null);
            tlp00001.setHoraGenera(tlp00001DTO.getHoraGenera());
            tlp00001.setHoraIngPagoSistema(tlp00001DTO.getHoraIngPagoSistema());
            tlp00001.setIngUsuariosPagos((tlp00001DTO.getIngUsuariosPagos() != null)
                ? tlp00001DTO.getIngUsuariosPagos() : null);
            tlp00001.setMasIntdemora((tlp00001DTO.getMasIntdemora() != null)
                ? tlp00001DTO.getMasIntdemora() : null);
            tlp00001.setNumCheque((tlp00001DTO.getNumCheque() != null)
                ? tlp00001DTO.getNumCheque() : null);
            tlp00001.setNumCuentadelCheque((tlp00001DTO.getNumCuentadelCheque() != null)
                ? tlp00001DTO.getNumCuentadelCheque() : null);
            tlp00001.setNumPlanillaCorrecion((tlp00001DTO.getNumPlanillaCorrecion() != null)
                ? tlp00001DTO.getNumPlanillaCorrecion() : null);
            tlp00001.setNumeroMeses((tlp00001DTO.getNumeroMeses() != null)
                ? tlp00001DTO.getNumeroMeses() : null);
            tlp00001.setNumerodeCotizantes((tlp00001DTO.getNumerodeCotizantes() != null)
                ? tlp00001DTO.getNumerodeCotizantes() : null);
            tlp00001.setParafiscales((tlp00001DTO.getParafiscales() != null)
                ? tlp00001DTO.getParafiscales() : null);
            tlp00001.setRetUsuariosNoPagos((tlp00001DTO.getRetUsuariosNoPagos() != null)
                ? tlp00001DTO.getRetUsuariosNoPagos() : null);
            tlp00001.setTipoAportante((tlp00001DTO.getTipoAportante() != null)
                ? tlp00001DTO.getTipoAportante() : null);
            tlp00001.setValorCheque((tlp00001DTO.getValorCheque() != null)
                ? tlp00001DTO.getValorCheque() : null);
            tlp00001.setValorEfectivo((tlp00001DTO.getValorEfectivo() != null)
                ? tlp00001DTO.getValorEfectivo() : null);
            tlp00001.setValorNomina((tlp00001DTO.getValorNomina() != null)
                ? tlp00001DTO.getValorNomina() : null);

            Tg000001 tg000001 = logicTg0000011.getTg000001(tlp00001DTO.getCodBanco_Tg000001());

            if (tg000001 != null) {
                tlp00001.setTg000001(tg000001);
            }

            Tg000003 tg000003 = logicTg0000032.getTg000003(tlp00001DTO.getCodEmpresa_Tg000003());

            if (tg000003 != null) {
                tlp00001.setTg000003(tg000003);
            }

            Tg000026 tg000026 = logicTg0000263.getTg000026(tlp00001DTO.getCodTipodePlanillas_Tg000026());

            if (tg000026 != null) {
                tlp00001.setTg000026(tg000026);
            }

            return tlp00001;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00001DTO> listTlp00001ToListTlp00001DTO(
        List<Tlp00001> listTlp00001) throws Exception {
        try {
            List<Tlp00001DTO> tlp00001DTOs = new ArrayList<Tlp00001DTO>();

            for (Tlp00001 tlp00001 : listTlp00001) {
                Tlp00001DTO tlp00001DTO = tlp00001ToTlp00001DTO(tlp00001);

                tlp00001DTOs.add(tlp00001DTO);
            }

            return tlp00001DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00001> listTlp00001DTOToListTlp00001(
        List<Tlp00001DTO> listTlp00001DTO) throws Exception {
        try {
            List<Tlp00001> listTlp00001 = new ArrayList<Tlp00001>();

            for (Tlp00001DTO tlp00001DTO : listTlp00001DTO) {
                Tlp00001 tlp00001 = tlp00001DTOToTlp00001(tlp00001DTO);

                listTlp00001.add(tlp00001);
            }

            return listTlp00001;
        } catch (Exception e) {
            throw e;
        }
    }
}
