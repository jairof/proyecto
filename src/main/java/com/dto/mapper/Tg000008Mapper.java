package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000008;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000008DTO;

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
public class Tg000008Mapper implements ITg000008Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000008Mapper.class);

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

    @Transactional(readOnly = true)
    public Tg000008DTO tg000008ToTg000008DTO(Tg000008 tg000008)
        throws Exception {
        try {
            Tg000008DTO tg000008DTO = new Tg000008DTO();

            tg000008DTO.setCodCuenta(tg000008.getId().getCodCuenta());
            tg000008DTO.setCodEmpresa(tg000008.getId().getCodEmpresa());
            tg000008DTO.setChequeActivo((tg000008.getChequeActivo() != null)
                ? tg000008.getChequeActivo() : null);
            tg000008DTO.setChequeUltimo((tg000008.getChequeUltimo() != null)
                ? tg000008.getChequeUltimo() : null);
            tg000008DTO.setChequeprimer((tg000008.getChequeprimer() != null)
                ? tg000008.getChequeprimer() : null);
            tg000008DTO.setConsignacionClientes((tg000008.getConsignacionClientes() != null)
                ? tg000008.getConsignacionClientes() : null);
            tg000008DTO.setNcheques((tg000008.getNcheques() != null)
                ? tg000008.getNcheques() : null);
            tg000008DTO.setNumcuenta((tg000008.getNumcuenta() != null)
                ? tg000008.getNumcuenta() : null);
            tg000008DTO.setTipoCuenta((tg000008.getTipoCuenta() != null)
                ? tg000008.getTipoCuenta() : null);
            tg000008DTO.setCodBanco_Tg000001((tg000008.getTg000001()
                                                      .getCodBanco() != null)
                ? tg000008.getTg000001().getCodBanco() : null);
            tg000008DTO.setCodEmpresa_Tg000003((tg000008.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tg000008.getTg000003().getCodEmpresa() : null);

            return tg000008DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000008 tg000008DTOToTg000008(Tg000008DTO tg000008DTO)
        throws Exception {
        try {
            Tg000008 tg000008 = new Tg000008();

            Tg000008Id tg000008Id = new Tg000008Id();

            if ((tg000008DTO.getCodCuenta() != null) &&
                    (tg000008DTO.getCodCuenta().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000008Id.setCodCuenta((tg000008DTO.getCodCuenta() != null)
                ? tg000008DTO.getCodCuenta() : null);

            if ((tg000008DTO.getCodEmpresa() != null) &&
                    (tg000008DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000008Id.setCodEmpresa((tg000008DTO.getCodEmpresa() != null)
                ? tg000008DTO.getCodEmpresa() : null);
            tg000008.setId(tg000008Id);
            tg000008.setChequeActivo((tg000008DTO.getChequeActivo() != null)
                ? tg000008DTO.getChequeActivo() : null);
            tg000008.setChequeUltimo((tg000008DTO.getChequeUltimo() != null)
                ? tg000008DTO.getChequeUltimo() : null);
            tg000008.setChequeprimer((tg000008DTO.getChequeprimer() != null)
                ? tg000008DTO.getChequeprimer() : null);
            tg000008.setConsignacionClientes((tg000008DTO.getConsignacionClientes() != null)
                ? tg000008DTO.getConsignacionClientes() : null);
            tg000008.setNcheques((tg000008DTO.getNcheques() != null)
                ? tg000008DTO.getNcheques() : null);
            tg000008.setNumcuenta((tg000008DTO.getNumcuenta() != null)
                ? tg000008DTO.getNumcuenta() : null);
            tg000008.setTipoCuenta((tg000008DTO.getTipoCuenta() != null)
                ? tg000008DTO.getTipoCuenta() : null);

            Tg000001 tg000001 = logicTg0000011.getTg000001(tg000008DTO.getCodBanco_Tg000001());

            if (tg000001 != null) {
                tg000008.setTg000001(tg000001);
            }

            Tg000003 tg000003 = logicTg0000032.getTg000003(tg000008DTO.getCodEmpresa_Tg000003());

            if (tg000003 != null) {
                tg000008.setTg000003(tg000003);
            }

            return tg000008;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000008DTO> listTg000008ToListTg000008DTO(
        List<Tg000008> listTg000008) throws Exception {
        try {
            List<Tg000008DTO> tg000008DTOs = new ArrayList<Tg000008DTO>();

            for (Tg000008 tg000008 : listTg000008) {
                Tg000008DTO tg000008DTO = tg000008ToTg000008DTO(tg000008);

                tg000008DTOs.add(tg000008DTO);
            }

            return tg000008DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000008> listTg000008DTOToListTg000008(
        List<Tg000008DTO> listTg000008DTO) throws Exception {
        try {
            List<Tg000008> listTg000008 = new ArrayList<Tg000008>();

            for (Tg000008DTO tg000008DTO : listTg000008DTO) {
                Tg000008 tg000008 = tg000008DTOToTg000008(tg000008DTO);

                listTg000008.add(tg000008);
            }

            return listTg000008;
        } catch (Exception e) {
            throw e;
        }
    }
}
