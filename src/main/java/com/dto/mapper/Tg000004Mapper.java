package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000004;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000004DTO;

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
public class Tg000004Mapper implements ITg000004Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000004Mapper.class);

    @Transactional(readOnly = true)
    public Tg000004DTO tg000004ToTg000004DTO(Tg000004 tg000004)
        throws Exception {
        try {
            Tg000004DTO tg000004DTO = new Tg000004DTO();

            tg000004DTO.setCodDepto(tg000004.getCodDepto());
            tg000004DTO.setNomDepto((tg000004.getNomDepto() != null)
                ? tg000004.getNomDepto() : null);

            return tg000004DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000004 tg000004DTOToTg000004(Tg000004DTO tg000004DTO)
        throws Exception {
        try {
            Tg000004 tg000004 = new Tg000004();

            tg000004.setCodDepto(tg000004DTO.getCodDepto());
            tg000004.setNomDepto((tg000004DTO.getNomDepto() != null)
                ? tg000004DTO.getNomDepto() : null);

            return tg000004;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000004DTO> listTg000004ToListTg000004DTO(
        List<Tg000004> listTg000004) throws Exception {
        try {
            List<Tg000004DTO> tg000004DTOs = new ArrayList<Tg000004DTO>();

            for (Tg000004 tg000004 : listTg000004) {
                Tg000004DTO tg000004DTO = tg000004ToTg000004DTO(tg000004);

                tg000004DTOs.add(tg000004DTO);
            }

            return tg000004DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000004> listTg000004DTOToListTg000004(
        List<Tg000004DTO> listTg000004DTO) throws Exception {
        try {
            List<Tg000004> listTg000004 = new ArrayList<Tg000004>();

            for (Tg000004DTO tg000004DTO : listTg000004DTO) {
                Tg000004 tg000004 = tg000004DTOToTg000004(tg000004DTO);

                listTg000004.add(tg000004);
            }

            return listTg000004;
        } catch (Exception e) {
            throw e;
        }
    }
}
