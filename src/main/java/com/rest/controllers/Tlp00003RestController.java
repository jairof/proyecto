package com.rest.controllers;

import com.dto.mapper.ITlp00003Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tlp00003DTO;

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
@RequestMapping("/tlp00003")
public class Tlp00003RestController {
    private static final Logger log = LoggerFactory.getLogger(Tlp00003RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITlp00003Mapper tlp00003Mapper;

    @PostMapping(value = "/saveTlp00003")
    public void saveTlp00003(@RequestBody
    Tlp00003DTO tlp00003DTO) throws Exception {
        try {
            Tlp00003 tlp00003 = tlp00003Mapper.tlp00003DTOToTlp00003(tlp00003DTO);

            businessDelegatorView.saveTlp00003(tlp00003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTlp00003/{numPlanilla}/{codEmpresa}")
    public void deleteTlp00003(@PathVariable("numPlanilla")
    String numPlanilla, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tlp00003Id id = new Tlp00003Id();

            id.setNumPlanilla(numPlanilla);
            id.setCodEmpresa(codEmpresa);

            Tlp00003 tlp00003 = businessDelegatorView.getTlp00003(id);

            businessDelegatorView.deleteTlp00003(tlp00003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTlp00003/")
    public void updateTlp00003(@RequestBody
    Tlp00003DTO tlp00003DTO) throws Exception {
        try {
            Tlp00003 tlp00003 = tlp00003Mapper.tlp00003DTOToTlp00003(tlp00003DTO);

            businessDelegatorView.updateTlp00003(tlp00003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTlp00003")
    public List<Tlp00003DTO> getDataTlp00003() throws Exception {
        try {
            return businessDelegatorView.getDataTlp00003();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTlp00003/{numPlanilla}/{codEmpresa}")
    public Tlp00003DTO getTlp00003(
        @PathVariable("numPlanilla")
    String numPlanilla, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tlp00003Id id = new Tlp00003Id();

            id.setNumPlanilla(numPlanilla);
            id.setCodEmpresa(codEmpresa);

            Tlp00003 tlp00003 = businessDelegatorView.getTlp00003(id);

            return tlp00003Mapper.tlp00003ToTlp00003DTO(tlp00003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
