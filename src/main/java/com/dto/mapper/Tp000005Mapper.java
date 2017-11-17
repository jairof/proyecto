package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tp000005;

import com.proyecto.control.*;

import com.proyecto.dto.Tp000005DTO;

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
public class Tp000005Mapper implements ITp000005Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tp000005Mapper.class);

    @Transactional(readOnly = true)
    public Tp000005DTO tp000005ToTp000005DTO(Tp000005 tp000005)
        throws Exception {
        try {
            Tp000005DTO tp000005DTO = new Tp000005DTO();

            tp000005DTO.setCodAfp(tp000005.getCodAfp());
            tp000005DTO.setCodigoAfp((tp000005.getCodigoAfp() != null)
                ? tp000005.getCodigoAfp() : null);
            tp000005DTO.setDireccionAfp((tp000005.getDireccionAfp() != null)
                ? tp000005.getDireccionAfp() : null);
            tp000005DTO.setDvafp((tp000005.getDvafp() != null)
                ? tp000005.getDvafp() : null);
            tp000005DTO.setEmailAfp((tp000005.getEmailAfp() != null)
                ? tp000005.getEmailAfp() : null);
            tp000005DTO.setFaxAfp((tp000005.getFaxAfp() != null)
                ? tp000005.getFaxAfp() : null);
            tp000005DTO.setNitAfp((tp000005.getNitAfp() != null)
                ? tp000005.getNitAfp() : null);
            tp000005DTO.setNomContactoAfp((tp000005.getNomContactoAfp() != null)
                ? tp000005.getNomContactoAfp() : null);
            tp000005DTO.setNombreAfp((tp000005.getNombreAfp() != null)
                ? tp000005.getNombreAfp() : null);
            tp000005DTO.setNumPerPlaniAfp((tp000005.getNumPerPlaniAfp() != null)
                ? tp000005.getNumPerPlaniAfp() : null);
            tp000005DTO.setTelefonoAfp((tp000005.getTelefonoAfp() != null)
                ? tp000005.getTelefonoAfp() : null);
            tp000005DTO.setTipoDocumentoAfp((tp000005.getTipoDocumentoAfp() != null)
                ? tp000005.getTipoDocumentoAfp() : null);

            return tp000005DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000005 tp000005DTOToTp000005(Tp000005DTO tp000005DTO)
        throws Exception {
        try {
            Tp000005 tp000005 = new Tp000005();

            tp000005.setCodAfp(tp000005DTO.getCodAfp());
            tp000005.setCodigoAfp((tp000005DTO.getCodigoAfp() != null)
                ? tp000005DTO.getCodigoAfp() : null);
            tp000005.setDireccionAfp((tp000005DTO.getDireccionAfp() != null)
                ? tp000005DTO.getDireccionAfp() : null);
            tp000005.setDvafp((tp000005DTO.getDvafp() != null)
                ? tp000005DTO.getDvafp() : null);
            tp000005.setEmailAfp((tp000005DTO.getEmailAfp() != null)
                ? tp000005DTO.getEmailAfp() : null);
            tp000005.setFaxAfp((tp000005DTO.getFaxAfp() != null)
                ? tp000005DTO.getFaxAfp() : null);
            tp000005.setNitAfp((tp000005DTO.getNitAfp() != null)
                ? tp000005DTO.getNitAfp() : null);
            tp000005.setNomContactoAfp((tp000005DTO.getNomContactoAfp() != null)
                ? tp000005DTO.getNomContactoAfp() : null);
            tp000005.setNombreAfp((tp000005DTO.getNombreAfp() != null)
                ? tp000005DTO.getNombreAfp() : null);
            tp000005.setNumPerPlaniAfp((tp000005DTO.getNumPerPlaniAfp() != null)
                ? tp000005DTO.getNumPerPlaniAfp() : null);
            tp000005.setTelefonoAfp((tp000005DTO.getTelefonoAfp() != null)
                ? tp000005DTO.getTelefonoAfp() : null);
            tp000005.setTipoDocumentoAfp((tp000005DTO.getTipoDocumentoAfp() != null)
                ? tp000005DTO.getTipoDocumentoAfp() : null);

            return tp000005;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000005DTO> listTp000005ToListTp000005DTO(
        List<Tp000005> listTp000005) throws Exception {
        try {
            List<Tp000005DTO> tp000005DTOs = new ArrayList<Tp000005DTO>();

            for (Tp000005 tp000005 : listTp000005) {
                Tp000005DTO tp000005DTO = tp000005ToTp000005DTO(tp000005);

                tp000005DTOs.add(tp000005DTO);
            }

            return tp000005DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000005> listTp000005DTOToListTp000005(
        List<Tp000005DTO> listTp000005DTO) throws Exception {
        try {
            List<Tp000005> listTp000005 = new ArrayList<Tp000005>();

            for (Tp000005DTO tp000005DTO : listTp000005DTO) {
                Tp000005 tp000005 = tp000005DTOToTp000005(tp000005DTO);

                listTp000005.add(tp000005);
            }

            return listTp000005;
        } catch (Exception e) {
            throw e;
        }
    }
}
