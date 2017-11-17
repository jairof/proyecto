package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000003;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000003DTO;

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
public class Tg000003Mapper implements ITg000003Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000003Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000002 entities
    *
    */
    @Autowired
    ITg000002Logic logicTg0000021;

    /**
    * Logic injected by Spring that manages Tg000006 entities
    *
    */
    @Autowired
    ITg000006Logic logicTg0000062;

    @Transactional(readOnly = true)
    public Tg000003DTO tg000003ToTg000003DTO(Tg000003 tg000003)
        throws Exception {
        try {
            Tg000003DTO tg000003DTO = new Tg000003DTO();

            tg000003DTO.setCodEmpresa(tg000003.getCodEmpresa());
            tg000003DTO.setApartado((tg000003.getApartado() != null)
                ? tg000003.getApartado() : null);
            tg000003DTO.setApeContacto((tg000003.getApeContacto() != null)
                ? tg000003.getApeContacto() : null);
            tg000003DTO.setCotizacionnoCaja((tg000003.getCotizacionnoCaja() != null)
                ? tg000003.getCotizacionnoCaja() : null);
            tg000003DTO.setCotizacionredondeada((tg000003.getCotizacionredondeada() != null)
                ? tg000003.getCotizacionredondeada() : null);
            tg000003DTO.setCotizacionresiduoMayor((tg000003.getCotizacionresiduoMayor() != null)
                ? tg000003.getCotizacionresiduoMayor() : null);
            tg000003DTO.setDe16hasta17((tg000003.getDe16hasta17() != null)
                ? tg000003.getDe16hasta17() : null);
            tg000003DTO.setDe4amenosde16((tg000003.getDe4amenosde16() != null)
                ? tg000003.getDe4amenosde16() : null);
            tg000003DTO.setDepartamentoCargo((tg000003.getDepartamentoCargo() != null)
                ? tg000003.getDepartamentoCargo() : null);
            tg000003DTO.setDepto((tg000003.getDepto() != null)
                ? tg000003.getDepto() : null);
            tg000003DTO.setDespedida((tg000003.getDespedida() != null)
                ? tg000003.getDespedida() : null);
            tg000003DTO.setDireccion((tg000003.getDireccion() != null)
                ? tg000003.getDireccion() : null);
            tg000003DTO.setDvemp((tg000003.getDvemp() != null)
                ? tg000003.getDvemp() : null);
            tg000003DTO.setEmail((tg000003.getEmail() != null)
                ? tg000003.getEmail() : null);
            tg000003DTO.setFax((tg000003.getFax() != null) ? tg000003.getFax()
                                                           : null);
            tg000003DTO.setFechaPrimerPago(tg000003.getFechaPrimerPago());
            tg000003DTO.setFechaSegundoPago(tg000003.getFechaSegundoPago());
            tg000003DTO.setFirmadaPor((tg000003.getFirmadaPor() != null)
                ? tg000003.getFirmadaPor() : null);
            tg000003DTO.setFondoArp((tg000003.getFondoArp() != null)
                ? tg000003.getFondoArp() : null);
            tg000003DTO.setIbcnoCaja((tg000003.getIbcnoCaja() != null)
                ? tg000003.getIbcnoCaja() : null);
            tg000003DTO.setIbcredondeado((tg000003.getIbcredondeado() != null)
                ? tg000003.getIbcredondeado() : null);
            tg000003DTO.setIbcresiduoMayor((tg000003.getIbcresiduoMayor() != null)
                ? tg000003.getIbcresiduoMayor() : null);
            tg000003DTO.setMasde17hasta18((tg000003.getMasde17hasta18() != null)
                ? tg000003.getMasde17hasta18() : null);
            tg000003DTO.setMasde18hasta19((tg000003.getMasde18hasta19() != null)
                ? tg000003.getMasde18hasta19() : null);
            tg000003DTO.setMasde19hasta20((tg000003.getMasde19hasta20() != null)
                ? tg000003.getMasde19hasta20() : null);
            tg000003DTO.setMayora20((tg000003.getMayora20() != null)
                ? tg000003.getMayora20() : null);
            tg000003DTO.setNit((tg000003.getNit() != null) ? tg000003.getNit()
                                                           : null);
            tg000003DTO.setNomContacto((tg000003.getNomContacto() != null)
                ? tg000003.getNomContacto() : null);
            tg000003DTO.setNomRegistroPila((tg000003.getNomRegistroPila() != null)
                ? tg000003.getNomRegistroPila() : null);
            tg000003DTO.setNotaAlpieRecibo((tg000003.getNotaAlpieRecibo() != null)
                ? tg000003.getNotaAlpieRecibo() : null);
            tg000003DTO.setNumeroEmpresas((tg000003.getNumeroEmpresas() != null)
                ? tg000003.getNumeroEmpresas() : null);
            tg000003DTO.setObservacion((tg000003.getObservacion() != null)
                ? tg000003.getObservacion() : null);
            tg000003DTO.setPagaMesActual((tg000003.getPagaMesActual() != null)
                ? tg000003.getPagaMesActual() : null);
            tg000003DTO.setPorAfp((tg000003.getPorAfp() != null)
                ? tg000003.getPorAfp() : null);
            tg000003DTO.setPorMoraPlanilla((tg000003.getPorMoraPlanilla() != null)
                ? tg000003.getPorMoraPlanilla() : null);
            tg000003DTO.setPorMoraRecibo((tg000003.getPorMoraRecibo() != null)
                ? tg000003.getPorMoraRecibo() : null);
            tg000003DTO.setPorcAporteSocial((tg000003.getPorcAporteSocial() != null)
                ? tg000003.getPorcAporteSocial() : null);
            tg000003DTO.setPorcCaja((tg000003.getPorcCaja() != null)
                ? tg000003.getPorcCaja() : null);
            tg000003DTO.setPorcEps((tg000003.getPorcEps() != null)
                ? tg000003.getPorcEps() : null);
            tg000003DTO.setPorcIcbf((tg000003.getPorcIcbf() != null)
                ? tg000003.getPorcIcbf() : null);
            tg000003DTO.setPorcIva((tg000003.getPorcIva() != null)
                ? tg000003.getPorcIva() : null);
            tg000003DTO.setPorcSena((tg000003.getPorcSena() != null)
                ? tg000003.getPorcSena() : null);
            tg000003DTO.setProfesion((tg000003.getProfesion() != null)
                ? tg000003.getProfesion() : null);
            tg000003DTO.setRazonSocial((tg000003.getRazonSocial() != null)
                ? tg000003.getRazonSocial() : null);
            tg000003DTO.setRiesgo1((tg000003.getRiesgo1() != null)
                ? tg000003.getRiesgo1() : null);
            tg000003DTO.setRiesgo2((tg000003.getRiesgo2() != null)
                ? tg000003.getRiesgo2() : null);
            tg000003DTO.setRiesgo3((tg000003.getRiesgo3() != null)
                ? tg000003.getRiesgo3() : null);
            tg000003DTO.setRiesgo4((tg000003.getRiesgo4() != null)
                ? tg000003.getRiesgo4() : null);
            tg000003DTO.setRiesgo5((tg000003.getRiesgo5() != null)
                ? tg000003.getRiesgo5() : null);
            tg000003DTO.setSalarioBasico((tg000003.getSalarioBasico() != null)
                ? tg000003.getSalarioBasico() : null);
            tg000003DTO.setSigla((tg000003.getSigla() != null)
                ? tg000003.getSigla() : null);
            tg000003DTO.setTelefono((tg000003.getTelefono() != null)
                ? tg000003.getTelefono() : null);
            tg000003DTO.setTipoAportante((tg000003.getTipoAportante() != null)
                ? tg000003.getTipoAportante() : null);
            tg000003DTO.setTipoDocumentoC((tg000003.getTipoDocumentoC() != null)
                ? tg000003.getTipoDocumentoC() : null);
            tg000003DTO.setValAdmon((tg000003.getValAdmon() != null)
                ? tg000003.getValAdmon() : null);
            tg000003DTO.setValAdmonAfp((tg000003.getValAdmonAfp() != null)
                ? tg000003.getValAdmonAfp() : null);
            tg000003DTO.setValorMensajeriaRecibo((tg000003.getValorMensajeriaRecibo() != null)
                ? tg000003.getValorMensajeriaRecibo() : null);
            tg000003DTO.setValorReactivacion((tg000003.getValorReactivacion() != null)
                ? tg000003.getValorReactivacion() : null);
            tg000003DTO.setValorRetiro((tg000003.getValorRetiro() != null)
                ? tg000003.getValorRetiro() : null);

            if (tg000003.getTg000002() != null) {
                tg000003DTO.setCodCiudad_Tg000002(tg000003.getTg000002()
                                                          .getCodCiudad());
            } else {
                tg000003DTO.setCodCiudad_Tg000002(null);
            }

            if (tg000003.getTg000006() != null) {
                tg000003DTO.setCodCargo_Tg000006(tg000003.getTg000006()
                                                         .getCodCargo());
            } else {
                tg000003DTO.setCodCargo_Tg000006(null);
            }

            return tg000003DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000003 tg000003DTOToTg000003(Tg000003DTO tg000003DTO)
        throws Exception {
        try {
            Tg000003 tg000003 = new Tg000003();

            tg000003.setCodEmpresa(tg000003DTO.getCodEmpresa());
            tg000003.setApartado((tg000003DTO.getApartado() != null)
                ? tg000003DTO.getApartado() : null);
            tg000003.setApeContacto((tg000003DTO.getApeContacto() != null)
                ? tg000003DTO.getApeContacto() : null);
            tg000003.setCotizacionnoCaja((tg000003DTO.getCotizacionnoCaja() != null)
                ? tg000003DTO.getCotizacionnoCaja() : null);
            tg000003.setCotizacionredondeada((tg000003DTO.getCotizacionredondeada() != null)
                ? tg000003DTO.getCotizacionredondeada() : null);
            tg000003.setCotizacionresiduoMayor((tg000003DTO.getCotizacionresiduoMayor() != null)
                ? tg000003DTO.getCotizacionresiduoMayor() : null);
            tg000003.setDe16hasta17((tg000003DTO.getDe16hasta17() != null)
                ? tg000003DTO.getDe16hasta17() : null);
            tg000003.setDe4amenosde16((tg000003DTO.getDe4amenosde16() != null)
                ? tg000003DTO.getDe4amenosde16() : null);
            tg000003.setDepartamentoCargo((tg000003DTO.getDepartamentoCargo() != null)
                ? tg000003DTO.getDepartamentoCargo() : null);
            tg000003.setDepto((tg000003DTO.getDepto() != null)
                ? tg000003DTO.getDepto() : null);
            tg000003.setDespedida((tg000003DTO.getDespedida() != null)
                ? tg000003DTO.getDespedida() : null);
            tg000003.setDireccion((tg000003DTO.getDireccion() != null)
                ? tg000003DTO.getDireccion() : null);
            tg000003.setDvemp((tg000003DTO.getDvemp() != null)
                ? tg000003DTO.getDvemp() : null);
            tg000003.setEmail((tg000003DTO.getEmail() != null)
                ? tg000003DTO.getEmail() : null);
            tg000003.setFax((tg000003DTO.getFax() != null)
                ? tg000003DTO.getFax() : null);
            tg000003.setFechaPrimerPago(tg000003DTO.getFechaPrimerPago());
            tg000003.setFechaSegundoPago(tg000003DTO.getFechaSegundoPago());
            tg000003.setFirmadaPor((tg000003DTO.getFirmadaPor() != null)
                ? tg000003DTO.getFirmadaPor() : null);
            tg000003.setFondoArp((tg000003DTO.getFondoArp() != null)
                ? tg000003DTO.getFondoArp() : null);
            tg000003.setIbcnoCaja((tg000003DTO.getIbcnoCaja() != null)
                ? tg000003DTO.getIbcnoCaja() : null);
            tg000003.setIbcredondeado((tg000003DTO.getIbcredondeado() != null)
                ? tg000003DTO.getIbcredondeado() : null);
            tg000003.setIbcresiduoMayor((tg000003DTO.getIbcresiduoMayor() != null)
                ? tg000003DTO.getIbcresiduoMayor() : null);
            tg000003.setMasde17hasta18((tg000003DTO.getMasde17hasta18() != null)
                ? tg000003DTO.getMasde17hasta18() : null);
            tg000003.setMasde18hasta19((tg000003DTO.getMasde18hasta19() != null)
                ? tg000003DTO.getMasde18hasta19() : null);
            tg000003.setMasde19hasta20((tg000003DTO.getMasde19hasta20() != null)
                ? tg000003DTO.getMasde19hasta20() : null);
            tg000003.setMayora20((tg000003DTO.getMayora20() != null)
                ? tg000003DTO.getMayora20() : null);
            tg000003.setNit((tg000003DTO.getNit() != null)
                ? tg000003DTO.getNit() : null);
            tg000003.setNomContacto((tg000003DTO.getNomContacto() != null)
                ? tg000003DTO.getNomContacto() : null);
            tg000003.setNomRegistroPila((tg000003DTO.getNomRegistroPila() != null)
                ? tg000003DTO.getNomRegistroPila() : null);
            tg000003.setNotaAlpieRecibo((tg000003DTO.getNotaAlpieRecibo() != null)
                ? tg000003DTO.getNotaAlpieRecibo() : null);
            tg000003.setNumeroEmpresas((tg000003DTO.getNumeroEmpresas() != null)
                ? tg000003DTO.getNumeroEmpresas() : null);
            tg000003.setObservacion((tg000003DTO.getObservacion() != null)
                ? tg000003DTO.getObservacion() : null);
            tg000003.setPagaMesActual((tg000003DTO.getPagaMesActual() != null)
                ? tg000003DTO.getPagaMesActual() : null);
            tg000003.setPorAfp((tg000003DTO.getPorAfp() != null)
                ? tg000003DTO.getPorAfp() : null);
            tg000003.setPorMoraPlanilla((tg000003DTO.getPorMoraPlanilla() != null)
                ? tg000003DTO.getPorMoraPlanilla() : null);
            tg000003.setPorMoraRecibo((tg000003DTO.getPorMoraRecibo() != null)
                ? tg000003DTO.getPorMoraRecibo() : null);
            tg000003.setPorcAporteSocial((tg000003DTO.getPorcAporteSocial() != null)
                ? tg000003DTO.getPorcAporteSocial() : null);
            tg000003.setPorcCaja((tg000003DTO.getPorcCaja() != null)
                ? tg000003DTO.getPorcCaja() : null);
            tg000003.setPorcEps((tg000003DTO.getPorcEps() != null)
                ? tg000003DTO.getPorcEps() : null);
            tg000003.setPorcIcbf((tg000003DTO.getPorcIcbf() != null)
                ? tg000003DTO.getPorcIcbf() : null);
            tg000003.setPorcIva((tg000003DTO.getPorcIva() != null)
                ? tg000003DTO.getPorcIva() : null);
            tg000003.setPorcSena((tg000003DTO.getPorcSena() != null)
                ? tg000003DTO.getPorcSena() : null);
            tg000003.setProfesion((tg000003DTO.getProfesion() != null)
                ? tg000003DTO.getProfesion() : null);
            tg000003.setRazonSocial((tg000003DTO.getRazonSocial() != null)
                ? tg000003DTO.getRazonSocial() : null);
            tg000003.setRiesgo1((tg000003DTO.getRiesgo1() != null)
                ? tg000003DTO.getRiesgo1() : null);
            tg000003.setRiesgo2((tg000003DTO.getRiesgo2() != null)
                ? tg000003DTO.getRiesgo2() : null);
            tg000003.setRiesgo3((tg000003DTO.getRiesgo3() != null)
                ? tg000003DTO.getRiesgo3() : null);
            tg000003.setRiesgo4((tg000003DTO.getRiesgo4() != null)
                ? tg000003DTO.getRiesgo4() : null);
            tg000003.setRiesgo5((tg000003DTO.getRiesgo5() != null)
                ? tg000003DTO.getRiesgo5() : null);
            tg000003.setSalarioBasico((tg000003DTO.getSalarioBasico() != null)
                ? tg000003DTO.getSalarioBasico() : null);
            tg000003.setSigla((tg000003DTO.getSigla() != null)
                ? tg000003DTO.getSigla() : null);
            tg000003.setTelefono((tg000003DTO.getTelefono() != null)
                ? tg000003DTO.getTelefono() : null);
            tg000003.setTipoAportante((tg000003DTO.getTipoAportante() != null)
                ? tg000003DTO.getTipoAportante() : null);
            tg000003.setTipoDocumentoC((tg000003DTO.getTipoDocumentoC() != null)
                ? tg000003DTO.getTipoDocumentoC() : null);
            tg000003.setValAdmon((tg000003DTO.getValAdmon() != null)
                ? tg000003DTO.getValAdmon() : null);
            tg000003.setValAdmonAfp((tg000003DTO.getValAdmonAfp() != null)
                ? tg000003DTO.getValAdmonAfp() : null);
            tg000003.setValorMensajeriaRecibo((tg000003DTO.getValorMensajeriaRecibo() != null)
                ? tg000003DTO.getValorMensajeriaRecibo() : null);
            tg000003.setValorReactivacion((tg000003DTO.getValorReactivacion() != null)
                ? tg000003DTO.getValorReactivacion() : null);
            tg000003.setValorRetiro((tg000003DTO.getValorRetiro() != null)
                ? tg000003DTO.getValorRetiro() : null);

            Tg000002 tg000002 = new Tg000002();

            if (tg000003DTO.getCodCiudad_Tg000002() != null) {
                tg000002 = logicTg0000021.getTg000002(tg000003DTO.getCodCiudad_Tg000002());
            }

            if (tg000002 != null) {
                tg000003.setTg000002(tg000002);
            }

            Tg000006 tg000006 = new Tg000006();

            if (tg000003DTO.getCodCargo_Tg000006() != null) {
                tg000006 = logicTg0000062.getTg000006(tg000003DTO.getCodCargo_Tg000006());
            }

            if (tg000006 != null) {
                tg000003.setTg000006(tg000006);
            }

            return tg000003;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000003DTO> listTg000003ToListTg000003DTO(
        List<Tg000003> listTg000003) throws Exception {
        try {
            List<Tg000003DTO> tg000003DTOs = new ArrayList<Tg000003DTO>();

            for (Tg000003 tg000003 : listTg000003) {
                Tg000003DTO tg000003DTO = tg000003ToTg000003DTO(tg000003);

                tg000003DTOs.add(tg000003DTO);
            }

            return tg000003DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000003> listTg000003DTOToListTg000003(
        List<Tg000003DTO> listTg000003DTO) throws Exception {
        try {
            List<Tg000003> listTg000003 = new ArrayList<Tg000003>();

            for (Tg000003DTO tg000003DTO : listTg000003DTO) {
                Tg000003 tg000003 = tg000003DTOToTg000003(tg000003DTO);

                listTg000003.add(tg000003);
            }

            return listTg000003;
        } catch (Exception e) {
            throw e;
        }
    }
}
