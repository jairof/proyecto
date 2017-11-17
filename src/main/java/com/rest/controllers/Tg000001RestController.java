package com.rest.controllers;

import com.dto.mapper.ITg000001Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000001DTO;

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
@RequestMapping("/tg000001")
public class Tg000001RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000001RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000001Mapper tg000001Mapper;

    @PostMapping(value = "/saveTg000001")
    public void saveTg000001(@RequestBody
    Tg000001DTO tg000001DTO) throws Exception {
        try {
            Tg000001 tg000001 = tg000001Mapper.tg000001DTOToTg000001(tg000001DTO);

            businessDelegatorView.saveTg000001(tg000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000001/{codBanco}")
    public void deleteTg000001(@PathVariable("codBanco")
    String codBanco) throws Exception {
        try {
            Tg000001 tg000001 = businessDelegatorView.getTg000001(codBanco);

            businessDelegatorView.deleteTg000001(tg000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000001/")
    public void updateTg000001(@RequestBody
    Tg000001DTO tg000001DTO) throws Exception {
        try {
            Tg000001 tg000001 = tg000001Mapper.tg000001DTOToTg000001(tg000001DTO);

            businessDelegatorView.updateTg000001(tg000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000001")
    public List<Tg000001DTO> getDataTg000001() throws Exception {
        try {
            return businessDelegatorView.getDataTg000001();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000001/{codBanco}")
    public Tg000001DTO getTg000001(@PathVariable("codBanco")
    String codBanco) throws Exception {
        try {
            Tg000001 tg000001 = businessDelegatorView.getTg000001(codBanco);

            return tg000001Mapper.tg000001ToTg000001DTO(tg000001);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
