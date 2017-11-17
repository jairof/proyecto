package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000006;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000006DTO;

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
public class Tg000006Mapper implements ITg000006Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000006Mapper.class);

    @Transactional(readOnly = true)
    public Tg000006DTO tg000006ToTg000006DTO(Tg000006 tg000006)
        throws Exception {
        try {
            Tg000006DTO tg000006DTO = new Tg000006DTO();

            tg000006DTO.setCodCargo(tg000006.getCodCargo());
            tg000006DTO.setDesCargo((tg000006.getDesCargo() != null)
                ? tg000006.getDesCargo() : null);

            return tg000006DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000006 tg000006DTOToTg000006(Tg000006DTO tg000006DTO)
        throws Exception {
        try {
            Tg000006 tg000006 = new Tg000006();

            tg000006.setCodCargo(tg000006DTO.getCodCargo());
            tg000006.setDesCargo((tg000006DTO.getDesCargo() != null)
                ? tg000006DTO.getDesCargo() : null);

            return tg000006;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000006DTO> listTg000006ToListTg000006DTO(
        List<Tg000006> listTg000006) throws Exception {
        try {
            List<Tg000006DTO> tg000006DTOs = new ArrayList<Tg000006DTO>();

            for (Tg000006 tg000006 : listTg000006) {
                Tg000006DTO tg000006DTO = tg000006ToTg000006DTO(tg000006);

                tg000006DTOs.add(tg000006DTO);
            }

            return tg000006DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000006> listTg000006DTOToListTg000006(
        List<Tg000006DTO> listTg000006DTO) throws Exception {
        try {
            List<Tg000006> listTg000006 = new ArrayList<Tg000006>();

            for (Tg000006DTO tg000006DTO : listTg000006DTO) {
                Tg000006 tg000006 = tg000006DTOToTg000006(tg000006DTO);

                listTg000006.add(tg000006);
            }

            return listTg000006;
        } catch (Exception e) {
            throw e;
        }
    }
}
