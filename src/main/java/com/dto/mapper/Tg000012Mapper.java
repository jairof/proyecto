package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000012;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000012DTO;

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
public class Tg000012Mapper implements ITg000012Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000012Mapper.class);

    @Transactional(readOnly = true)
    public Tg000012DTO tg000012ToTg000012DTO(Tg000012 tg000012)
        throws Exception {
        try {
            Tg000012DTO tg000012DTO = new Tg000012DTO();

            tg000012DTO.setCodProfesion(tg000012.getCodProfesion());
            tg000012DTO.setDesProfesion((tg000012.getDesProfesion() != null)
                ? tg000012.getDesProfesion() : null);

            return tg000012DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000012 tg000012DTOToTg000012(Tg000012DTO tg000012DTO)
        throws Exception {
        try {
            Tg000012 tg000012 = new Tg000012();

            tg000012.setCodProfesion(tg000012DTO.getCodProfesion());
            tg000012.setDesProfesion((tg000012DTO.getDesProfesion() != null)
                ? tg000012DTO.getDesProfesion() : null);

            return tg000012;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000012DTO> listTg000012ToListTg000012DTO(
        List<Tg000012> listTg000012) throws Exception {
        try {
            List<Tg000012DTO> tg000012DTOs = new ArrayList<Tg000012DTO>();

            for (Tg000012 tg000012 : listTg000012) {
                Tg000012DTO tg000012DTO = tg000012ToTg000012DTO(tg000012);

                tg000012DTOs.add(tg000012DTO);
            }

            return tg000012DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000012> listTg000012DTOToListTg000012(
        List<Tg000012DTO> listTg000012DTO) throws Exception {
        try {
            List<Tg000012> listTg000012 = new ArrayList<Tg000012>();

            for (Tg000012DTO tg000012DTO : listTg000012DTO) {
                Tg000012 tg000012 = tg000012DTOToTg000012(tg000012DTO);

                listTg000012.add(tg000012);
            }

            return listTg000012;
        } catch (Exception e) {
            throw e;
        }
    }
}
