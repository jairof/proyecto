package com.rest.controllers;

import com.dto.mapper.ITr000004Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tr000004DTO;

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
@RequestMapping("/tr000004")
public class Tr000004RestController {
    private static final Logger log = LoggerFactory.getLogger(Tr000004RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITr000004Mapper tr000004Mapper;

    @PostMapping(value = "/saveTr000004")
    public void saveTr000004(@RequestBody
    Tr000004DTO tr000004DTO) throws Exception {
        try {
            Tr000004 tr000004 = tr000004Mapper.tr000004DTOToTr000004(tr000004DTO);

            businessDelegatorView.saveTr000004(tr000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTr000004/{consecutivo}/{codEmpresa}")
    public void deleteTr000004(
        @PathVariable("consecutivo")
    Integer consecutivo, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tr000004Id id = new Tr000004Id();

            id.setConsecutivo(consecutivo);
            id.setCodEmpresa(codEmpresa);

            Tr000004 tr000004 = businessDelegatorView.getTr000004(id);

            businessDelegatorView.deleteTr000004(tr000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTr000004/")
    public void updateTr000004(@RequestBody
    Tr000004DTO tr000004DTO) throws Exception {
        try {
            Tr000004 tr000004 = tr000004Mapper.tr000004DTOToTr000004(tr000004DTO);

            businessDelegatorView.updateTr000004(tr000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTr000004")
    public List<Tr000004DTO> getDataTr000004() throws Exception {
        try {
            return businessDelegatorView.getDataTr000004();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTr000004/{consecutivo}/{codEmpresa}")
    public Tr000004DTO getTr000004(
        @PathVariable("consecutivo")
    Integer consecutivo, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tr000004Id id = new Tr000004Id();

            id.setConsecutivo(consecutivo);
            id.setCodEmpresa(codEmpresa);

            Tr000004 tr000004 = businessDelegatorView.getTr000004(id);

            return tr000004Mapper.tr000004ToTr000004DTO(tr000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
