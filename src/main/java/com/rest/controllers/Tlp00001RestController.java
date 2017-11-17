package com.rest.controllers;

import com.dto.mapper.ITlp00001Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tlp00001DTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/tlp00001")
public class Tlp00001RestController {
    private static final Logger log = LoggerFactory.getLogger(Tlp00001RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITlp00001Mapper tlp00001Mapper;

    @PostMapping(value = "/saveTlp00001")
    public void saveTlp00001(@RequestBody
    Tlp00001DTO tlp00001DTO) throws Exception {
        try {
            Tlp00001 tlp00001 = tlp00001Mapper.tlp00001DTOToTlp00001(tlp00001DTO);

            businessDelegatorView.saveTlp00001(tlp00001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTlp00001/{numPlanilla}/{codEmpresa}")
    public void deleteTlp00001(@PathVariable("numPlanilla")
    String numPlanilla, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tlp00001Id id = new Tlp00001Id();

            id.setNumPlanilla(numPlanilla);
            id.setCodEmpresa(codEmpresa);

            Tlp00001 tlp00001 = businessDelegatorView.getTlp00001(id);

            businessDelegatorView.deleteTlp00001(tlp00001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTlp00001/")
    public void updateTlp00001(@RequestBody
    Tlp00001DTO tlp00001DTO) throws Exception {
        try {
            Tlp00001 tlp00001 = tlp00001Mapper.tlp00001DTOToTlp00001(tlp00001DTO);

            businessDelegatorView.updateTlp00001(tlp00001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTlp00001")
    public List<Tlp00001DTO> getDataTlp00001() throws Exception {
        try {
            return businessDelegatorView.getDataTlp00001();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTlp00001/{numPlanilla}/{codEmpresa}")
    public Tlp00001DTO getTlp00001(
        @PathVariable("numPlanilla")
    String numPlanilla, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tlp00001Id id = new Tlp00001Id();

            id.setNumPlanilla(numPlanilla);
            id.setCodEmpresa(codEmpresa);

            Tlp00001 tlp00001 = businessDelegatorView.getTlp00001(id);

            return tlp00001Mapper.tlp00001ToTlp00001DTO(tlp00001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
