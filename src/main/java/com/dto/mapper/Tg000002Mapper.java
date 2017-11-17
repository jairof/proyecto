package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000002;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000002DTO;

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
public class Tg000002Mapper implements ITg000002Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000002Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000004 entities
    *
    */
    @Autowired
    ITg000004Logic logicTg0000041;

    @Transactional(readOnly = true)
    public Tg000002DTO tg000002ToTg000002DTO(Tg000002 tg000002)
        throws Exception {
        try {
            Tg000002DTO tg000002DTO = new Tg000002DTO();

            tg000002DTO.setCodCiudad(tg000002.getCodCiudad());
            tg000002DTO.setDesCiudad((tg000002.getDesCiudad() != null)
                ? tg000002.getDesCiudad() : null);

            if (tg000002.getTg000004() != null) {
                tg000002DTO.setCodDepto_Tg000004(tg000002.getTg000004()
                                                         .getCodDepto());
            } else {
                tg000002DTO.setCodDepto_Tg000004(null);
            }

            return tg000002DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000002 tg000002DTOToTg000002(Tg000002DTO tg000002DTO)
        throws Exception {
        try {
            Tg000002 tg000002 = new Tg000002();

            tg000002.setCodCiudad(tg000002DTO.getCodCiudad());
            tg000002.setDesCiudad((tg000002DTO.getDesCiudad() != null)
                ? tg000002DTO.getDesCiudad() : null);

            Tg000004 tg000004 = new Tg000004();

            if (tg000002DTO.getCodDepto_Tg000004() != null) {
                tg000004 = logicTg0000041.getTg000004(tg000002DTO.getCodDepto_Tg000004());
            }

            if (tg000004 != null) {
                tg000002.setTg000004(tg000004);
            }

            return tg000002;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000002DTO> listTg000002ToListTg000002DTO(
        List<Tg000002> listTg000002) throws Exception {
        try {
            List<Tg000002DTO> tg000002DTOs = new ArrayList<Tg000002DTO>();

            for (Tg000002 tg000002 : listTg000002) {
                Tg000002DTO tg000002DTO = tg000002ToTg000002DTO(tg000002);

                tg000002DTOs.add(tg000002DTO);
            }

            return tg000002DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000002> listTg000002DTOToListTg000002(
        List<Tg000002DTO> listTg000002DTO) throws Exception {
        try {
            List<Tg000002> listTg000002 = new ArrayList<Tg000002>();

            for (Tg000002DTO tg000002DTO : listTg000002DTO) {
                Tg000002 tg000002 = tg000002DTOToTg000002(tg000002DTO);

                listTg000002.add(tg000002);
            }

            return listTg000002;
        } catch (Exception e) {
            throw e;
        }
    }
}
