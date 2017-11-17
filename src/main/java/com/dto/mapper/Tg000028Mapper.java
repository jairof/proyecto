package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000028;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000028DTO;

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
public class Tg000028Mapper implements ITg000028Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000028Mapper.class);

    @Transactional(readOnly = true)
    public Tg000028DTO tg000028ToTg000028DTO(Tg000028 tg000028)
        throws Exception {
        try {
            Tg000028DTO tg000028DTO = new Tg000028DTO();

            tg000028DTO.setCodTipoCotizante(tg000028.getCodTipoCotizante());
            tg000028DTO.setNombTipoCotizante((tg000028.getNombTipoCotizante() != null)
                ? tg000028.getNombTipoCotizante() : null);

            return tg000028DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000028 tg000028DTOToTg000028(Tg000028DTO tg000028DTO)
        throws Exception {
        try {
            Tg000028 tg000028 = new Tg000028();

            tg000028.setCodTipoCotizante(tg000028DTO.getCodTipoCotizante());
            tg000028.setNombTipoCotizante((tg000028DTO.getNombTipoCotizante() != null)
                ? tg000028DTO.getNombTipoCotizante() : null);

            return tg000028;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000028DTO> listTg000028ToListTg000028DTO(
        List<Tg000028> listTg000028) throws Exception {
        try {
            List<Tg000028DTO> tg000028DTOs = new ArrayList<Tg000028DTO>();

            for (Tg000028 tg000028 : listTg000028) {
                Tg000028DTO tg000028DTO = tg000028ToTg000028DTO(tg000028);

                tg000028DTOs.add(tg000028DTO);
            }

            return tg000028DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000028> listTg000028DTOToListTg000028(
        List<Tg000028DTO> listTg000028DTO) throws Exception {
        try {
            List<Tg000028> listTg000028 = new ArrayList<Tg000028>();

            for (Tg000028DTO tg000028DTO : listTg000028DTO) {
                Tg000028 tg000028 = tg000028DTOToTg000028(tg000028DTO);

                listTg000028.add(tg000028);
            }

            return listTg000028;
        } catch (Exception e) {
            throw e;
        }
    }
}
