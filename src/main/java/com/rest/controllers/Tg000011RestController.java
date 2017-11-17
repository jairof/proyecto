package com.rest.controllers;

import com.dto.mapper.ITg000011Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000011DTO;

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
@RequestMapping("/tg000011")
public class Tg000011RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000011RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000011Mapper tg000011Mapper;

    @PostMapping(value = "/saveTg000011")
    public void saveTg000011(@RequestBody
    Tg000011DTO tg000011DTO) throws Exception {
        try {
            Tg000011 tg000011 = tg000011Mapper.tg000011DTOToTg000011(tg000011DTO);

            businessDelegatorView.saveTg000011(tg000011);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000011/{codEmpresaEmp}/{codEmpresa}")
    public void deleteTg000011(
        @PathVariable("codEmpresaEmp")
    String codEmpresaEmp, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000011Id id = new Tg000011Id();

            id.setCodEmpresaEmp(codEmpresaEmp);
            id.setCodEmpresa(codEmpresa);

            Tg000011 tg000011 = businessDelegatorView.getTg000011(id);

            businessDelegatorView.deleteTg000011(tg000011);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000011/")
    public void updateTg000011(@RequestBody
    Tg000011DTO tg000011DTO) throws Exception {
        try {
            Tg000011 tg000011 = tg000011Mapper.tg000011DTOToTg000011(tg000011DTO);

            businessDelegatorView.updateTg000011(tg000011);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000011")
    public List<Tg000011DTO> getDataTg000011() throws Exception {
        try {
            return businessDelegatorView.getDataTg000011();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000011/{codEmpresaEmp}/{codEmpresa}")
    public Tg000011DTO getTg000011(
        @PathVariable("codEmpresaEmp")
    String codEmpresaEmp, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000011Id id = new Tg000011Id();

            id.setCodEmpresaEmp(codEmpresaEmp);
            id.setCodEmpresa(codEmpresa);

            Tg000011 tg000011 = businessDelegatorView.getTg000011(id);

            return tg000011Mapper.tg000011ToTg000011DTO(tg000011);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
