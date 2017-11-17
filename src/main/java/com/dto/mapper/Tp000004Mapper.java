package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tp000004;

import com.proyecto.control.*;

import com.proyecto.dto.Tp000004DTO;

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
public class Tp000004Mapper implements ITp000004Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tp000004Mapper.class);

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000031;

    @Transactional(readOnly = true)
    public Tp000004DTO tp000004ToTp000004DTO(Tp000004 tp000004)
        throws Exception {
        try {
            Tp000004DTO tp000004DTO = new Tp000004DTO();

            tp000004DTO.setCodArp(tp000004.getCodArp());
            tp000004DTO.setArpactiva((tp000004.getArpactiva() != null)
                ? tp000004.getArpactiva() : null);
            tp000004DTO.setCodigoArp((tp000004.getCodigoArp() != null)
                ? tp000004.getCodigoArp() : null);
            tp000004DTO.setDireccionArp((tp000004.getDireccionArp() != null)
                ? tp000004.getDireccionArp() : null);
            tp000004DTO.setDvarp((tp000004.getDvarp() != null)
                ? tp000004.getDvarp() : null);
            tp000004DTO.setEmailArp((tp000004.getEmailArp() != null)
                ? tp000004.getEmailArp() : null);
            tp000004DTO.setFaxArp((tp000004.getFaxArp() != null)
                ? tp000004.getFaxArp() : null);
            tp000004DTO.setNitArp((tp000004.getNitArp() != null)
                ? tp000004.getNitArp() : null);
            tp000004DTO.setNomContactoArp((tp000004.getNomContactoArp() != null)
                ? tp000004.getNomContactoArp() : null);
            tp000004DTO.setNombreArp((tp000004.getNombreArp() != null)
                ? tp000004.getNombreArp() : null);
            tp000004DTO.setNumPerPlaniArp((tp000004.getNumPerPlaniArp() != null)
                ? tp000004.getNumPerPlaniArp() : null);
            tp000004DTO.setTelefonoArp((tp000004.getTelefonoArp() != null)
                ? tp000004.getTelefonoArp() : null);
            tp000004DTO.setTipoDocumentoArp((tp000004.getTipoDocumentoArp() != null)
                ? tp000004.getTipoDocumentoArp() : null);
            tp000004DTO.setCodEmpresa_Tg000003((tp000004.getTg000003()
                                                        .getCodEmpresa() != null)
                ? tp000004.getTg000003().getCodEmpresa() : null);

            return tp000004DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000004 tp000004DTOToTp000004(Tp000004DTO tp000004DTO)
        throws Exception {
        try {
            Tp000004 tp000004 = new Tp000004();

            tp000004.setCodArp(tp000004DTO.getCodArp());
            tp000004.setArpactiva((tp000004DTO.getArpactiva() != null)
                ? tp000004DTO.getArpactiva() : null);
            tp000004.setCodigoArp((tp000004DTO.getCodigoArp() != null)
                ? tp000004DTO.getCodigoArp() : null);
            tp000004.setDireccionArp((tp000004DTO.getDireccionArp() != null)
                ? tp000004DTO.getDireccionArp() : null);
            tp000004.setDvarp((tp000004DTO.getDvarp() != null)
                ? tp000004DTO.getDvarp() : null);
            tp000004.setEmailArp((tp000004DTO.getEmailArp() != null)
                ? tp000004DTO.getEmailArp() : null);
            tp000004.setFaxArp((tp000004DTO.getFaxArp() != null)
                ? tp000004DTO.getFaxArp() : null);
            tp000004.setNitArp((tp000004DTO.getNitArp() != null)
                ? tp000004DTO.getNitArp() : null);
            tp000004.setNomContactoArp((tp000004DTO.getNomContactoArp() != null)
                ? tp000004DTO.getNomContactoArp() : null);
            tp000004.setNombreArp((tp000004DTO.getNombreArp() != null)
                ? tp000004DTO.getNombreArp() : null);
            tp000004.setNumPerPlaniArp((tp000004DTO.getNumPerPlaniArp() != null)
                ? tp000004DTO.getNumPerPlaniArp() : null);
            tp000004.setTelefonoArp((tp000004DTO.getTelefonoArp() != null)
                ? tp000004DTO.getTelefonoArp() : null);
            tp000004.setTipoDocumentoArp((tp000004DTO.getTipoDocumentoArp() != null)
                ? tp000004DTO.getTipoDocumentoArp() : null);

            Tg000003 tg000003 = new Tg000003();

            if (tp000004DTO.getCodEmpresa_Tg000003() != null) {
                tg000003 = logicTg0000031.getTg000003(tp000004DTO.getCodEmpresa_Tg000003());
            }

            if (tg000003 != null) {
                tp000004.setTg000003(tg000003);
            }

            return tp000004;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000004DTO> listTp000004ToListTp000004DTO(
        List<Tp000004> listTp000004) throws Exception {
        try {
            List<Tp000004DTO> tp000004DTOs = new ArrayList<Tp000004DTO>();

            for (Tp000004 tp000004 : listTp000004) {
                Tp000004DTO tp000004DTO = tp000004ToTp000004DTO(tp000004);

                tp000004DTOs.add(tp000004DTO);
            }

            return tp000004DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000004> listTp000004DTOToListTp000004(
        List<Tp000004DTO> listTp000004DTO) throws Exception {
        try {
            List<Tp000004> listTp000004 = new ArrayList<Tp000004>();

            for (Tp000004DTO tp000004DTO : listTp000004DTO) {
                Tp000004 tp000004 = tp000004DTOToTp000004(tp000004DTO);

                listTp000004.add(tp000004);
            }

            return listTp000004;
        } catch (Exception e) {
            throw e;
        }
    }
}
