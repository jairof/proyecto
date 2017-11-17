package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tg000011;

import com.proyecto.control.*;

import com.proyecto.dto.Tg000011DTO;

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
public class Tg000011Mapper implements ITg000011Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tg000011Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000031;

    @Transactional(readOnly = true)
    public Tg000011DTO tg000011ToTg000011DTO(Tg000011 tg000011)
        throws Exception {
        try {
            Tg000011DTO tg000011DTO = new Tg000011DTO();

            tg000011DTO.setCodEmpresaEmp(tg000011.getId().getCodEmpresaEmp());
            tg000011DTO.setCodEmpresa(tg000011.getId().getCodEmpresa());
            tg000011DTO.setAtiva((tg000011.getAtiva() != null)
                ? tg000011.getAtiva() : null);
            tg000011DTO.setCiudad((tg000011.getCiudad() != null)
                ? tg000011.getCiudad() : null);
            tg000011DTO.setDepto((tg000011.getDepto() != null)
                ? tg000011.getDepto() : null);
            tg000011DTO.setDirEmpresa((tg000011.getDirEmpresa() != null)
                ? tg000011.getDirEmpresa() : null);
            tg000011DTO.setDvempaf((tg000011.getDvempaf() != null)
                ? tg000011.getDvempaf() : null);
            tg000011DTO.setEmailEmpresa((tg000011.getEmailEmpresa() != null)
                ? tg000011.getEmailEmpresa() : null);
            tg000011DTO.setFaxEmpresa((tg000011.getFaxEmpresa() != null)
                ? tg000011.getFaxEmpresa() : null);
            tg000011DTO.setNitEmpresa((tg000011.getNitEmpresa() != null)
                ? tg000011.getNitEmpresa() : null);
            tg000011DTO.setNomContacto((tg000011.getNomContacto() != null)
                ? tg000011.getNomContacto() : null);
            tg000011DTO.setNomEmpresa((tg000011.getNomEmpresa() != null)
                ? tg000011.getNomEmpresa() : null);
            tg000011DTO.setTelEmpresa((tg000011.getTelEmpresa() != null)
                ? tg000011.getTelEmpresa() : null);
            tg000011DTO.setTipoDocumentoEmpaf((tg000011.getTipoDocumentoEmpaf() != null)
                ? tg000011.getTipoDocumentoEmpaf() : null);
            tg000011DTO.setCodEmpresa_Tg000003((tg000011.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tg000011.getTg000003().getCodEmpresa() : null);

            return tg000011DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tg000011 tg000011DTOToTg000011(Tg000011DTO tg000011DTO)
        throws Exception {
        try {
            Tg000011 tg000011 = new Tg000011();

            Tg000011Id tg000011Id = new Tg000011Id();

            if ((tg000011DTO.getCodEmpresaEmp() != null) &&
                    (tg000011DTO.getCodEmpresaEmp().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000011Id.setCodEmpresaEmp((tg000011DTO.getCodEmpresaEmp() != null)
                ? tg000011DTO.getCodEmpresaEmp() : null);

            if ((tg000011DTO.getCodEmpresa() != null) &&
                    (tg000011DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tg000011Id.setCodEmpresa((tg000011DTO.getCodEmpresa() != null)
                ? tg000011DTO.getCodEmpresa() : null);
            tg000011.setId(tg000011Id);
            tg000011.setAtiva((tg000011DTO.getAtiva() != null)
                ? tg000011DTO.getAtiva() : null);
            tg000011.setCiudad((tg000011DTO.getCiudad() != null)
                ? tg000011DTO.getCiudad() : null);
            tg000011.setDepto((tg000011DTO.getDepto() != null)
                ? tg000011DTO.getDepto() : null);
            tg000011.setDirEmpresa((tg000011DTO.getDirEmpresa() != null)
                ? tg000011DTO.getDirEmpresa() : null);
            tg000011.setDvempaf((tg000011DTO.getDvempaf() != null)
                ? tg000011DTO.getDvempaf() : null);
            tg000011.setEmailEmpresa((tg000011DTO.getEmailEmpresa() != null)
                ? tg000011DTO.getEmailEmpresa() : null);
            tg000011.setFaxEmpresa((tg000011DTO.getFaxEmpresa() != null)
                ? tg000011DTO.getFaxEmpresa() : null);
            tg000011.setNitEmpresa((tg000011DTO.getNitEmpresa() != null)
                ? tg000011DTO.getNitEmpresa() : null);
            tg000011.setNomContacto((tg000011DTO.getNomContacto() != null)
                ? tg000011DTO.getNomContacto() : null);
            tg000011.setNomEmpresa((tg000011DTO.getNomEmpresa() != null)
                ? tg000011DTO.getNomEmpresa() : null);
            tg000011.setTelEmpresa((tg000011DTO.getTelEmpresa() != null)
                ? tg000011DTO.getTelEmpresa() : null);
            tg000011.setTipoDocumentoEmpaf((tg000011DTO.getTipoDocumentoEmpaf() != null)
                ? tg000011DTO.getTipoDocumentoEmpaf() : null);

            Tg000003 tg000003 = logicTg0000031.getTg000003(tg000011DTO.getCodEmpresa_Tg000003());

            if (tg000003 != null) {
                tg000011.setTg000003(tg000003);
            }

            return tg000011;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000011DTO> listTg000011ToListTg000011DTO(
        List<Tg000011> listTg000011) throws Exception {
        try {
            List<Tg000011DTO> tg000011DTOs = new ArrayList<Tg000011DTO>();

            for (Tg000011 tg000011 : listTg000011) {
                Tg000011DTO tg000011DTO = tg000011ToTg000011DTO(tg000011);

                tg000011DTOs.add(tg000011DTO);
            }

            return tg000011DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tg000011> listTg000011DTOToListTg000011(
        List<Tg000011DTO> listTg000011DTO) throws Exception {
        try {
            List<Tg000011> listTg000011 = new ArrayList<Tg000011>();

            for (Tg000011DTO tg000011DTO : listTg000011DTO) {
                Tg000011 tg000011 = tg000011DTOToTg000011(tg000011DTO);

                listTg000011.add(tg000011);
            }

            return listTg000011;
        } catch (Exception e) {
            throw e;
        }
    }
}
