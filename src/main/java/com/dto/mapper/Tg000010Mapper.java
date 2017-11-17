package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000010;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000010DTO;

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
public class Tg000010Mapper implements ITg000010Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000010Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000031;

    @Transactional(readOnly = true)
    public Tg000010DTO tg000010ToTg000010DTO(Tg000010 tg000010)
        throws Exception {
        try {
            Tg000010DTO tg000010DTO = new Tg000010DTO();

            tg000010DTO.setCodSucursal(tg000010.getId().getCodSucursal());
            tg000010DTO.setCodEmpresa(tg000010.getId().getCodEmpresa());
            tg000010DTO.setNomSucursal((tg000010.getNomSucursal() != null)
                ? tg000010.getNomSucursal() : null);
            tg000010DTO.setCodEmpresa_Tg000003((tg000010.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tg000010.getTg000003().getCodEmpresa() : null);

            return tg000010DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000010 tg000010DTOToTg000010(Tg000010DTO tg000010DTO)
        throws Exception {
        try {
            Tg000010 tg000010 = new Tg000010();

            Tg000010Id tg000010Id = new Tg000010Id();

            if ((tg000010DTO.getCodSucursal() != null) &&
                    (tg000010DTO.getCodSucursal().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000010Id.setCodSucursal((tg000010DTO.getCodSucursal() != null)
                ? tg000010DTO.getCodSucursal() : null);

            if ((tg000010DTO.getCodEmpresa() != null) &&
                    (tg000010DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000010Id.setCodEmpresa((tg000010DTO.getCodEmpresa() != null)
                ? tg000010DTO.getCodEmpresa() : null);
            tg000010.setId(tg000010Id);
            tg000010.setNomSucursal((tg000010DTO.getNomSucursal() != null)
                ? tg000010DTO.getNomSucursal() : null);

            Tg000003 tg000003 = logicTg0000031.getTg000003(tg000010DTO.getCodEmpresa_Tg000003());

            if (tg000003 != null) {
                tg000010.setTg000003(tg000003);
            }

            return tg000010;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000010DTO> listTg000010ToListTg000010DTO(
        List<Tg000010> listTg000010) throws Exception {
        try {
            List<Tg000010DTO> tg000010DTOs = new ArrayList<Tg000010DTO>();

            for (Tg000010 tg000010 : listTg000010) {
                Tg000010DTO tg000010DTO = tg000010ToTg000010DTO(tg000010);

                tg000010DTOs.add(tg000010DTO);
            }

            return tg000010DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000010> listTg000010DTOToListTg000010(
        List<Tg000010DTO> listTg000010DTO) throws Exception {
        try {
            List<Tg000010> listTg000010 = new ArrayList<Tg000010>();

            for (Tg000010DTO tg000010DTO : listTg000010DTO) {
                Tg000010 tg000010 = tg000010DTOToTg000010(tg000010DTO);

                listTg000010.add(tg000010);
            }

            return listTg000010;
        } catch (Exception e) {
            throw e;
        }
    }
}
