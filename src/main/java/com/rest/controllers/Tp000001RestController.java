package com.rest.controllers;

import com.dto.mapper.ITp000001Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tp000001DTO;

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
@RequestMapping("/tp000001")
public class Tp000001RestController {
    private static final Logger log = LoggerFactory.getLogger(Tp000001RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITp000001Mapper tp000001Mapper;

    @PostMapping(value = "/saveTp000001")
    public void saveTp000001(@RequestBody
    Tp000001DTO tp000001DTO) throws Exception {
        try {
            Tp000001 tp000001 = tp000001Mapper.tp000001DTOToTp000001(tp000001DTO);

            businessDelegatorView.saveTp000001(tp000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTp000001/{codEmpresa}/{codEmpresaEmp}")
    public void deleteTp000001(@PathVariable("codEmpresa")
    String codEmpresa, @PathVariable("codEmpresaEmp")
    String codEmpresaEmp) throws Exception {
        try {
            Tp000001Id id = new Tp000001Id();

            id.setCodEmpresa(codEmpresa);
            id.setCodEmpresaEmp(codEmpresaEmp);

            Tp000001 tp000001 = businessDelegatorView.getTp000001(id);

            businessDelegatorView.deleteTp000001(tp000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTp000001/")
    public void updateTp000001(@RequestBody
    Tp000001DTO tp000001DTO) throws Exception {
        try {
            Tp000001 tp000001 = tp000001Mapper.tp000001DTOToTp000001(tp000001DTO);

            businessDelegatorView.updateTp000001(tp000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTp000001")
    public List<Tp000001DTO> getDataTp000001() throws Exception {
        try {
            return businessDelegatorView.getDataTp000001();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTp000001/{codEmpresa}/{codEmpresaEmp}")
    public Tp000001DTO getTp000001(
        @PathVariable("codEmpresa")
    String codEmpresa, @PathVariable("codEmpresaEmp")
    String codEmpresaEmp) throws Exception {
        try {
            Tp000001Id id = new Tp000001Id();

            id.setCodEmpresa(codEmpresa);
            id.setCodEmpresaEmp(codEmpresaEmp);

            Tp000001 tp000001 = businessDelegatorView.getTp000001(id);

            return tp000001Mapper.tp000001ToTp000001DTO(tp000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
