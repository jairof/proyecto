package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000019;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000019DTO;

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
public class Tg000019Mapper implements ITg000019Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000019Mapper.class);

    @Transactional(readOnly = true)
    public Tg000019DTO tg000019ToTg000019DTO(Tg000019 tg000019)
        throws Exception {
        try {
            Tg000019DTO tg000019DTO = new Tg000019DTO();

            tg000019DTO.setCodIdentidad(tg000019.getCodIdentidad());
            tg000019DTO.setDesIdentidad((tg000019.getDesIdentidad() != null)
                ? tg000019.getDesIdentidad() : null);

            return tg000019DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000019 tg000019DTOToTg000019(Tg000019DTO tg000019DTO)
        throws Exception {
        try {
            Tg000019 tg000019 = new Tg000019();

            tg000019.setCodIdentidad(tg000019DTO.getCodIdentidad());
            tg000019.setDesIdentidad((tg000019DTO.getDesIdentidad() != null)
                ? tg000019DTO.getDesIdentidad() : null);

            return tg000019;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000019DTO> listTg000019ToListTg000019DTO(
        List<Tg000019> listTg000019) throws Exception {
        try {
            List<Tg000019DTO> tg000019DTOs = new ArrayList<Tg000019DTO>();

            for (Tg000019 tg000019 : listTg000019) {
                Tg000019DTO tg000019DTO = tg000019ToTg000019DTO(tg000019);

                tg000019DTOs.add(tg000019DTO);
            }

            return tg000019DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000019> listTg000019DTOToListTg000019(
        List<Tg000019DTO> listTg000019DTO) throws Exception {
        try {
            List<Tg000019> listTg000019 = new ArrayList<Tg000019>();

            for (Tg000019DTO tg000019DTO : listTg000019DTO) {
                Tg000019 tg000019 = tg000019DTOToTg000019(tg000019DTO);

                listTg000019.add(tg000019);
            }

            return listTg000019;
        } catch (Exception e) {
            throw e;
        }
    }
}
