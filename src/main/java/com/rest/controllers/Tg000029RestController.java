package com.rest.controllers;

import com.dto.mapper.ITg000029Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000029DTO;

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
@RequestMapping("/tg000029")
public class Tg000029RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000029RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000029Mapper tg000029Mapper;

    @PostMapping(value = "/saveTg000029")
    public void saveTg000029(@RequestBody
    Tg000029DTO tg000029DTO) throws Exception {
        try {
            Tg000029 tg000029 = tg000029Mapper.tg000029DTOToTg000029(tg000029DTO);

            businessDelegatorView.saveTg000029(tg000029);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000029/{codSubTipoCotizante}")
    public void deleteTg000029(
        @PathVariable("codSubTipoCotizante")
    String codSubTipoCotizante) throws Exception {
        try {
            Tg000029 tg000029 = businessDelegatorView.getTg000029(codSubTipoCotizante);

            businessDelegatorView.deleteTg000029(tg000029);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000029/")
    public void updateTg000029(@RequestBody
    Tg000029DTO tg000029DTO) throws Exception {
        try {
            Tg000029 tg000029 = tg000029Mapper.tg000029DTOToTg000029(tg000029DTO);

            businessDelegatorView.updateTg000029(tg000029);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000029")
    public List<Tg000029DTO> getDataTg000029() throws Exception {
        try {
            return businessDelegatorView.getDataTg000029();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000029/{codSubTipoCotizante}")
    public Tg000029DTO getTg000029(
        @PathVariable("codSubTipoCotizante")
    String codSubTipoCotizante) throws Exception {
        try {
            Tg000029 tg000029 = businessDelegatorView.getTg000029(codSubTipoCotizante);

            return tg000029Mapper.tg000029ToTg000029DTO(tg000029);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
