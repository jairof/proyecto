package com.dto.mapper;

import com.proyecto.*;
import com.proyecto.Tlp00003;

import com.proyecto.control.*;

import com.proyecto.dto.Tlp00003DTO;

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
public class Tlp00003Mapper implements ITlp00003Mapper {
    private static final Logger log = LoggerFactory.getLogger(Tlp00003Mapper.class);

    @Transactional(readOnly = true)
    public Tlp00003DTO tlp00003ToTlp00003DTO(Tlp00003 tlp00003)
        throws Exception {
        try {
            Tlp00003DTO tlp00003DTO = new Tlp00003DTO();

            tlp00003DTO.setNumPlanilla(tlp00003.getId().getNumPlanilla());
            tlp00003DTO.setCodEmpresa(tlp00003.getId().getCodEmpresa());
            tlp00003DTO.setCodEmpresaEmp((tlp00003.getCodEmpresaEmp() != null)
                ? tlp00003.getCodEmpresaEmp() : null);
            tlp00003DTO.setIng((tlp00003.getIng() != null) ? tlp00003.getIng()
                                                           : null);
            tlp00003DTO.setPlanillaAfp((tlp00003.getPlanillaAfp() != null)
                ? tlp00003.getPlanillaAfp() : null);
            tlp00003DTO.setPlanillaArp((tlp00003.getPlanillaArp() != null)
                ? tlp00003.getPlanillaArp() : null);
            tlp00003DTO.setPlanillaEps((tlp00003.getPlanillaEps() != null)
                ? tlp00003.getPlanillaEps() : null);
            tlp00003DTO.setRet((tlp00003.getRet() != null) ? tlp00003.getRet()
                                                           : null);

            return tlp00003DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tlp00003 tlp00003DTOToTlp00003(Tlp00003DTO tlp00003DTO)
        throws Exception {
        try {
            Tlp00003 tlp00003 = new Tlp00003();

            Tlp00003Id tlp00003Id = new Tlp00003Id();

            if ((tlp00003DTO.getNumPlanilla() != null) &&
                    (tlp00003DTO.getNumPlanilla().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tlp00003Id.setNumPlanilla((tlp00003DTO.getNumPlanilla() != null)
                ? tlp00003DTO.getNumPlanilla() : null);

            if ((tlp00003DTO.getCodEmpresa() != null) &&
                    (tlp00003DTO.getCodEmpresa().toString().length() <= 0)) {
                throw new Exception("La llave no puede ser nula");
            }

            tlp00003Id.setCodEmpresa((tlp00003DTO.getCodEmpresa() != null)
                ? tlp00003DTO.getCodEmpresa() : null);
            tlp00003.setId(tlp00003Id);
            tlp00003.setCodEmpresaEmp((tlp00003DTO.getCodEmpresaEmp() != null)
                ? tlp00003DTO.getCodEmpresaEmp() : null);
            tlp00003.setIng((tlp00003DTO.getIng() != null)
                ? tlp00003DTO.getIng() : null);
            tlp00003.setPlanillaAfp((tlp00003DTO.getPlanillaAfp() != null)
                ? tlp00003DTO.getPlanillaAfp() : null);
            tlp00003.setPlanillaArp((tlp00003DTO.getPlanillaArp() != null)
                ? tlp00003DTO.getPlanillaArp() : null);
            tlp00003.setPlanillaEps((tlp00003DTO.getPlanillaEps() != null)
                ? tlp00003DTO.getPlanillaEps() : null);
            tlp00003.setRet((tlp00003DTO.getRet() != null)
                ? tlp00003DTO.getRet() : null);

            return tlp00003;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00003DTO> listTlp00003ToListTlp00003DTO(
        List<Tlp00003> listTlp00003) throws Exception {
        try {
            List<Tlp00003DTO> tlp00003DTOs = new ArrayList<Tlp00003DTO>();

            for (Tlp00003 tlp00003 : listTlp00003) {
                Tlp00003DTO tlp00003DTO = tlp00003ToTlp00003DTO(tlp00003);

                tlp00003DTOs.add(tlp00003DTO);
            }

            return tlp00003DTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tlp00003> listTlp00003DTOToListTlp00003(
        List<Tlp00003DTO> listTlp00003DTO) throws Exception {
        try {
            List<Tlp00003> listTlp00003 = new ArrayList<Tlp00003>();

            for (Tlp00003DTO tlp00003DTO : listTlp00003DTO) {
                Tlp00003 tlp00003 = tlp00003DTOToTlp00003(tlp00003DTO);

                listTlp00003.add(tlp00003);
            }

            return listTlp00003;
        } catch (Exception e) {
            throw e;
        }
    }
}
