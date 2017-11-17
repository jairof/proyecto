package com.rest.controllers;

import com.dto.mapper.ITg000010Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000010DTO;

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
@RequestMapping("/tg000010")
public class Tg000010RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000010RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000010Mapper tg000010Mapper;

    @PostMapping(value = "/saveTg000010")
    public void saveTg000010(@RequestBody
    Tg000010DTO tg000010DTO) throws Exception {
        try {
            Tg000010 tg000010 = tg000010Mapper.tg000010DTOToTg000010(tg000010DTO);

            businessDelegatorView.saveTg000010(tg000010);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000010/{codSucursal}/{codEmpresa}")
    public void deleteTg000010(@PathVariable("codSucursal")
    String codSucursal, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000010Id id = new Tg000010Id();

            id.setCodSucursal(codSucursal);
            id.setCodEmpresa(codEmpresa);

            Tg000010 tg000010 = businessDelegatorView.getTg000010(id);

            businessDelegatorView.deleteTg000010(tg000010);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000010/")
    public void updateTg000010(@RequestBody
    Tg000010DTO tg000010DTO) throws Exception {
        try {
            Tg000010 tg000010 = tg000010Mapper.tg000010DTOToTg000010(tg000010DTO);

            businessDelegatorView.updateTg000010(tg000010);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000010")
    public List<Tg000010DTO> getDataTg000010() throws Exception {
        try {
            return businessDelegatorView.getDataTg000010();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000010/{codSucursal}/{codEmpresa}")
    public Tg000010DTO getTg000010(
        @PathVariable("codSucursal")
    String codSucursal, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000010Id id = new Tg000010Id();

            id.setCodSucursal(codSucursal);
            id.setCodEmpresa(codEmpresa);

            Tg000010 tg000010 = businessDelegatorView.getTg000010(id);

            return tg000010Mapper.tg000010ToTg000010DTO(tg000010);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
