package com.rest.controllers;

import com.dto.mapper.ITg000028Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000028DTO;

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
@RequestMapping("/tg000028")
public class Tg000028RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000028RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000028Mapper tg000028Mapper;

    @PostMapping(value = "/saveTg000028")
    public void saveTg000028(@RequestBody
    Tg000028DTO tg000028DTO) throws Exception {
        try {
            Tg000028 tg000028 = tg000028Mapper.tg000028DTOToTg000028(tg000028DTO);

            businessDelegatorView.saveTg000028(tg000028);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000028/{codTipoCotizante}")
    public void deleteTg000028(
        @PathVariable("codTipoCotizante")
    String codTipoCotizante) throws Exception {
        try {
            Tg000028 tg000028 = businessDelegatorView.getTg000028(codTipoCotizante);

            businessDelegatorView.deleteTg000028(tg000028);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000028/")
    public void updateTg000028(@RequestBody
    Tg000028DTO tg000028DTO) throws Exception {
        try {
            Tg000028 tg000028 = tg000028Mapper.tg000028DTOToTg000028(tg000028DTO);

            businessDelegatorView.updateTg000028(tg000028);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000028")
    public List<Tg000028DTO> getDataTg000028() throws Exception {
        try {
            return businessDelegatorView.getDataTg000028();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000028/{codTipoCotizante}")
    public Tg000028DTO getTg000028(
        @PathVariable("codTipoCotizante")
    String codTipoCotizante) throws Exception {
        try {
            Tg000028 tg000028 = businessDelegatorView.getTg000028(codTipoCotizante);

            return tg000028Mapper.tg000028ToTg000028DTO(tg000028);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
