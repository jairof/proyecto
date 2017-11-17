package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000013;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000013DTO;

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
public class Tg000013Mapper implements ITg000013Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000013Mapper.class);

    @Transactional(readOnly = true)
    public Tg000013DTO tg000013ToTg000013DTO(Tg000013 tg000013)
        throws Exception {
        try {
            Tg000013DTO tg000013DTO = new Tg000013DTO();

            tg000013DTO.setCodActividad(tg000013.getCodActividad());
            tg000013DTO.setDesActividad((tg000013.getDesActividad() != null)
                ? tg000013.getDesActividad() : null);
            tg000013DTO.setNivelRiesgo((tg000013.getNivelRiesgo() != null)
                ? tg000013.getNivelRiesgo() : null);

            return tg000013DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000013 tg000013DTOToTg000013(Tg000013DTO tg000013DTO)
        throws Exception {
        try {
            Tg000013 tg000013 = new Tg000013();

            tg000013.setCodActividad(tg000013DTO.getCodActividad());
            tg000013.setDesActividad((tg000013DTO.getDesActividad() != null)
                ? tg000013DTO.getDesActividad() : null);
            tg000013.setNivelRiesgo((tg000013DTO.getNivelRiesgo() != null)
                ? tg000013DTO.getNivelRiesgo() : null);

            return tg000013;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000013DTO> listTg000013ToListTg000013DTO(
        List<Tg000013> listTg000013) throws Exception {
        try {
            List<Tg000013DTO> tg000013DTOs = new ArrayList<Tg000013DTO>();

            for (Tg000013 tg000013 : listTg000013) {
                Tg000013DTO tg000013DTO = tg000013ToTg000013DTO(tg000013);

                tg000013DTOs.add(tg000013DTO);
            }

            return tg000013DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000013> listTg000013DTOToListTg000013(
        List<Tg000013DTO> listTg000013DTO) throws Exception {
        try {
            List<Tg000013> listTg000013 = new ArrayList<Tg000013>();

            for (Tg000013DTO tg000013DTO : listTg000013DTO) {
                Tg000013 tg000013 = tg000013DTOToTg000013(tg000013DTO);

                listTg000013.add(tg000013);
            }

            return listTg000013;
        } catch (Exception e) {
            throw e;
        }
    }
}
