package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tp000006;

import com.proyecto.control.*;

import com.proyecto.dto.Tp000006DTO;

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
public class Tp000006Mapper implements ITp000006Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tp000006Mapper.class);

    @Transactional(readOnly = true)
    public Tp000006DTO tp000006ToTp000006DTO(Tp000006 tp000006)
        throws Exception {
        try {
            Tp000006DTO tp000006DTO = new Tp000006DTO();

            tp000006DTO.setCodCaja(tp000006.getCodCaja());
            tp000006DTO.setCajaPrincipal((tp000006.getCajaPrincipal() != null)
                ? tp000006.getCajaPrincipal() : null);
            tp000006DTO.setCodDepto((tp000006.getCodDepto() != null)
                ? tp000006.getCodDepto() : null);
            tp000006DTO.setCodEmpresa((tp000006.getCodEmpresa() != null)
                ? tp000006.getCodEmpresa() : null);
            tp000006DTO.setCodigoCaja((tp000006.getCodigoCaja() != null)
                ? tp000006.getCodigoCaja() : null);
            tp000006DTO.setDireccionCaja((tp000006.getDireccionCaja() != null)
                ? tp000006.getDireccionCaja() : null);
            tp000006DTO.setDvcaja((tp000006.getDvcaja() != null)
                ? tp000006.getDvcaja() : null);
            tp000006DTO.setEmailCaja((tp000006.getEmailCaja() != null)
                ? tp000006.getEmailCaja() : null);
            tp000006DTO.setFaxCaja((tp000006.getFaxCaja() != null)
                ? tp000006.getFaxCaja() : null);
            tp000006DTO.setNitCaja((tp000006.getNitCaja() != null)
                ? tp000006.getNitCaja() : null);
            tp000006DTO.setNoPagoCaja((tp000006.getNoPagoCaja() != null)
                ? tp000006.getNoPagoCaja() : null);
            tp000006DTO.setNomContactoCaja((tp000006.getNomContactoCaja() != null)
                ? tp000006.getNomContactoCaja() : null);
            tp000006DTO.setNombreCaja((tp000006.getNombreCaja() != null)
                ? tp000006.getNombreCaja() : null);
            tp000006DTO.setNumPerPlaniCaja((tp000006.getNumPerPlaniCaja() != null)
                ? tp000006.getNumPerPlaniCaja() : null);
            tp000006DTO.setTelefonoCaja((tp000006.getTelefonoCaja() != null)
                ? tp000006.getTelefonoCaja() : null);
            tp000006DTO.setTipoDocumentoCaja((tp000006.getTipoDocumentoCaja() != null)
                ? tp000006.getTipoDocumentoCaja() : null);

            return tp000006DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000006 tp000006DTOToTp000006(Tp000006DTO tp000006DTO)
        throws Exception {
        try {
            Tp000006 tp000006 = new Tp000006();

            tp000006.setCodCaja(tp000006DTO.getCodCaja());
            tp000006.setCajaPrincipal((tp000006DTO.getCajaPrincipal() != null)
                ? tp000006DTO.getCajaPrincipal() : null);
            tp000006.setCodDepto((tp000006DTO.getCodDepto() != null)
                ? tp000006DTO.getCodDepto() : null);
            tp000006.setCodEmpresa((tp000006DTO.getCodEmpresa() != null)
                ? tp000006DTO.getCodEmpresa() : null);
            tp000006.setCodigoCaja((tp000006DTO.getCodigoCaja() != null)
                ? tp000006DTO.getCodigoCaja() : null);
            tp000006.setDireccionCaja((tp000006DTO.getDireccionCaja() != null)
                ? tp000006DTO.getDireccionCaja() : null);
            tp000006.setDvcaja((tp000006DTO.getDvcaja() != null)
                ? tp000006DTO.getDvcaja() : null);
            tp000006.setEmailCaja((tp000006DTO.getEmailCaja() != null)
                ? tp000006DTO.getEmailCaja() : null);
            tp000006.setFaxCaja((tp000006DTO.getFaxCaja() != null)
                ? tp000006DTO.getFaxCaja() : null);
            tp000006.setNitCaja((tp000006DTO.getNitCaja() != null)
                ? tp000006DTO.getNitCaja() : null);
            tp000006.setNoPagoCaja((tp000006DTO.getNoPagoCaja() != null)
                ? tp000006DTO.getNoPagoCaja() : null);
            tp000006.setNomContactoCaja((tp000006DTO.getNomContactoCaja() != null)
                ? tp000006DTO.getNomContactoCaja() : null);
            tp000006.setNombreCaja((tp000006DTO.getNombreCaja() != null)
                ? tp000006DTO.getNombreCaja() : null);
            tp000006.setNumPerPlaniCaja((tp000006DTO.getNumPerPlaniCaja() != null)
                ? tp000006DTO.getNumPerPlaniCaja() : null);
            tp000006.setTelefonoCaja((tp000006DTO.getTelefonoCaja() != null)
                ? tp000006DTO.getTelefonoCaja() : null);
            tp000006.setTipoDocumentoCaja((tp000006DTO.getTipoDocumentoCaja() != null)
                ? tp000006DTO.getTipoDocumentoCaja() : null);

            return tp000006;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000006DTO> listTp000006ToListTp000006DTO(
        List<Tp000006> listTp000006) throws Exception {
        try {
            List<Tp000006DTO> tp000006DTOs = new ArrayList<Tp000006DTO>();

            for (Tp000006 tp000006 : listTp000006) {
                Tp000006DTO tp000006DTO = tp000006ToTp000006DTO(tp000006);

                tp000006DTOs.add(tp000006DTO);
            }

            return tp000006DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000006> listTp000006DTOToListTp000006(
        List<Tp000006DTO> listTp000006DTO) throws Exception {
        try {
            List<Tp000006> listTp000006 = new ArrayList<Tp000006>();

            for (Tp000006DTO tp000006DTO : listTp000006DTO) {
                Tp000006 tp000006 = tp000006DTOToTp000006(tp000006DTO);

                listTp000006.add(tp000006);
            }

            return listTp000006;
        } catch (Exception e) {
            throw e;
        }
    }
}
