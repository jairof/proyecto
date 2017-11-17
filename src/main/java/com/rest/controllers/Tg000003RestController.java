package com.rest.controllers;

import com.dto.mapper.ITg000003Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000003DTO;

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
@RequestMapping("/tg000003")
public class Tg000003RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000003RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000003Mapper tg000003Mapper;

    @PostMapping(value = "/saveTg000003")
    public void saveTg000003(@RequestBody
    Tg000003DTO tg000003DTO) throws Exception {
        try {
            Tg000003 tg000003 = tg000003Mapper.tg000003DTOToTg000003(tg000003DTO);

            businessDelegatorView.saveTg000003(tg000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000003/{codEmpresa}")
    public void deleteTg000003(@PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000003 tg000003 = businessDelegatorView.getTg000003(codEmpresa);

            businessDelegatorView.deleteTg000003(tg000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000003/")
    public void updateTg000003(@RequestBody
    Tg000003DTO tg000003DTO) throws Exception {
        try {
            Tg000003 tg000003 = tg000003Mapper.tg000003DTOToTg000003(tg000003DTO);

            businessDelegatorView.updateTg000003(tg000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000003")
    public List<Tg000003DTO> getDataTg000003() throws Exception {
        try {
            return businessDelegatorView.getDataTg000003();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000003/{codEmpresa}")
    public Tg000003DTO getTg000003(@PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000003 tg000003 = businessDelegatorView.getTg000003(codEmpresa);

            return tg000003Mapper.tg000003ToTg000003DTO(tg000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
