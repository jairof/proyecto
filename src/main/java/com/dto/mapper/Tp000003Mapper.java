package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tp000003;

import com.proyecto.control.*;

import com.proyecto.dto.Tp000003DTO;

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
public class Tp000003Mapper implements ITp000003Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tp000003Mapper.class);

    @Transactional(readOnly = true)
    public Tp000003DTO tp000003ToTp000003DTO(Tp000003 tp000003)
        throws Exception {
        try {
            Tp000003DTO tp000003DTO = new Tp000003DTO();

            tp000003DTO.setCodEps(tp000003.getCodEps());
            tp000003DTO.setCodigoEps((tp000003.getCodigoEps() != null)
                ? tp000003.getCodigoEps() : null);
            tp000003DTO.setDireccionEps((tp000003.getDireccionEps() != null)
                ? tp000003.getDireccionEps() : null);
            tp000003DTO.setDveps((tp000003.getDveps() != null)
                ? tp000003.getDveps() : null);
            tp000003DTO.setEmailEps((tp000003.getEmailEps() != null)
                ? tp000003.getEmailEps() : null);
            tp000003DTO.setFaxEps((tp000003.getFaxEps() != null)
                ? tp000003.getFaxEps() : null);
            tp000003DTO.setNitEps((tp000003.getNitEps() != null)
                ? tp000003.getNitEps() : null);
            tp000003DTO.setNomContactoEps((tp000003.getNomContactoEps() != null)
                ? tp000003.getNomContactoEps() : null);
            tp000003DTO.setNombreEps((tp000003.getNombreEps() != null)
                ? tp000003.getNombreEps() : null);
            tp000003DTO.setNumPerPlaniEps((tp000003.getNumPerPlaniEps() != null)
                ? tp000003.getNumPerPlaniEps() : null);
            tp000003DTO.setTelefonoEps((tp000003.getTelefonoEps() != null)
                ? tp000003.getTelefonoEps() : null);
            tp000003DTO.setTipoDocumentoEps((tp000003.getTipoDocumentoEps() != null)
                ? tp000003.getTipoDocumentoEps() : null);

            return tp000003DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000003 tp000003DTOToTp000003(Tp000003DTO tp000003DTO)
        throws Exception {
        try {
            Tp000003 tp000003 = new Tp000003();

            tp000003.setCodEps(tp000003DTO.getCodEps());
            tp000003.setCodigoEps((tp000003DTO.getCodigoEps() != null)
                ? tp000003DTO.getCodigoEps() : null);
            tp000003.setDireccionEps((tp000003DTO.getDireccionEps() != null)
                ? tp000003DTO.getDireccionEps() : null);
            tp000003.setDveps((tp000003DTO.getDveps() != null)
                ? tp000003DTO.getDveps() : null);
            tp000003.setEmailEps((tp000003DTO.getEmailEps() != null)
                ? tp000003DTO.getEmailEps() : null);
            tp000003.setFaxEps((tp000003DTO.getFaxEps() != null)
                ? tp000003DTO.getFaxEps() : null);
            tp000003.setNitEps((tp000003DTO.getNitEps() != null)
                ? tp000003DTO.getNitEps() : null);
            tp000003.setNomContactoEps((tp000003DTO.getNomContactoEps() != null)
                ? tp000003DTO.getNomContactoEps() : null);
            tp000003.setNombreEps((tp000003DTO.getNombreEps() != null)
                ? tp000003DTO.getNombreEps() : null);
            tp000003.setNumPerPlaniEps((tp000003DTO.getNumPerPlaniEps() != null)
                ? tp000003DTO.getNumPerPlaniEps() : null);
            tp000003.setTelefonoEps((tp000003DTO.getTelefonoEps() != null)
                ? tp000003DTO.getTelefonoEps() : null);
            tp000003.setTipoDocumentoEps((tp000003DTO.getTipoDocumentoEps() != null)
                ? tp000003DTO.getTipoDocumentoEps() : null);

            return tp000003;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000003DTO> listTp000003ToListTp000003DTO(
        List<Tp000003> listTp000003) throws Exception {
        try {
            List<Tp000003DTO> tp000003DTOs = new ArrayList<Tp000003DTO>();

            for (Tp000003 tp000003 : listTp000003) {
                Tp000003DTO tp000003DTO = tp000003ToTp000003DTO(tp000003);

                tp000003DTOs.add(tp000003DTO);
            }

            return tp000003DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000003> listTp000003DTOToListTp000003(
        List<Tp000003DTO> listTp000003DTO) throws Exception {
        try {
            List<Tp000003> listTp000003 = new ArrayList<Tp000003>();

            for (Tp000003DTO tp000003DTO : listTp000003DTO) {
                Tp000003 tp000003 = tp000003DTOToTp000003(tp000003DTO);

                listTp000003.add(tp000003);
            }

            return listTp000003;
        } catch (Exception e) {
            throw e;
        }
    }
}
