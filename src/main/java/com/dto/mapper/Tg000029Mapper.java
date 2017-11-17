package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000029;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000029DTO;

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
public class Tg000029Mapper implements ITg000029Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000029Mapper.class);

    @Transactional(readOnly = true)
    public Tg000029DTO tg000029ToTg000029DTO(Tg000029 tg000029)
        throws Exception {
        try {
            Tg000029DTO tg000029DTO = new Tg000029DTO();

            tg000029DTO.setCodSubTipoCotizante(tg000029.getCodSubTipoCotizante());
            tg000029DTO.setNombSubTipoCotizante((tg000029.getNombSubTipoCotizante() != null)
                ? tg000029.getNombSubTipoCotizante() : null);

            return tg000029DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000029 tg000029DTOToTg000029(Tg000029DTO tg000029DTO)
        throws Exception {
        try {
            Tg000029 tg000029 = new Tg000029();

            tg000029.setCodSubTipoCotizante(tg000029DTO.getCodSubTipoCotizante());
            tg000029.setNombSubTipoCotizante((tg000029DTO.getNombSubTipoCotizante() != null)
                ? tg000029DTO.getNombSubTipoCotizante() : null);

            return tg000029;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000029DTO> listTg000029ToListTg000029DTO(
        List<Tg000029> listTg000029) throws Exception {
        try {
            List<Tg000029DTO> tg000029DTOs = new ArrayList<Tg000029DTO>();

            for (Tg000029 tg000029 : listTg000029) {
                Tg000029DTO tg000029DTO = tg000029ToTg000029DTO(tg000029);

                tg000029DTOs.add(tg000029DTO);
            }

            return tg000029DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000029> listTg000029DTOToListTg000029(
        List<Tg000029DTO> listTg000029DTO) throws Exception {
        try {
            List<Tg000029> listTg000029 = new ArrayList<Tg000029>();

            for (Tg000029DTO tg000029DTO : listTg000029DTO) {
                Tg000029 tg000029 = tg000029DTOToTg000029(tg000029DTO);

                listTg000029.add(tg000029);
            }

            return listTg000029;
        } catch (Exception e) {
            throw e;
        }
    }
}
