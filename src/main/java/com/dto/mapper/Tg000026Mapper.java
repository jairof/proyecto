package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000026;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000026DTO;

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
public class Tg000026Mapper implements ITg000026Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000026Mapper.class);

    @Transactional(readOnly = true)
    public Tg000026DTO tg000026ToTg000026DTO(Tg000026 tg000026)
        throws Exception {
        try {
            Tg000026DTO tg000026DTO = new Tg000026DTO();

            tg000026DTO.setCodTipodePlanillas(tg000026.getCodTipodePlanillas());
            tg000026DTO.setDesTipodePlanillas((tg000026.getDesTipodePlanillas() != null)
                ? tg000026.getDesTipodePlanillas() : null);

            return tg000026DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000026 tg000026DTOToTg000026(Tg000026DTO tg000026DTO)
        throws Exception {
        try {
            Tg000026 tg000026 = new Tg000026();

            tg000026.setCodTipodePlanillas(tg000026DTO.getCodTipodePlanillas());
            tg000026.setDesTipodePlanillas((tg000026DTO.getDesTipodePlanillas() != null)
                ? tg000026DTO.getDesTipodePlanillas() : null);

            return tg000026;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000026DTO> listTg000026ToListTg000026DTO(
        List<Tg000026> listTg000026) throws Exception {
        try {
            List<Tg000026DTO> tg000026DTOs = new ArrayList<Tg000026DTO>();

            for (Tg000026 tg000026 : listTg000026) {
                Tg000026DTO tg000026DTO = tg000026ToTg000026DTO(tg000026);

                tg000026DTOs.add(tg000026DTO);
            }

            return tg000026DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000026> listTg000026DTOToListTg000026(
        List<Tg000026DTO> listTg000026DTO) throws Exception {
        try {
            List<Tg000026> listTg000026 = new ArrayList<Tg000026>();

            for (Tg000026DTO tg000026DTO : listTg000026DTO) {
                Tg000026 tg000026 = tg000026DTOToTg000026(tg000026DTO);

                listTg000026.add(tg000026);
            }

            return listTg000026;
        } catch (Exception e) {
            throw e;
        }
    }
}
