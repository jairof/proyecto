package com.rest.controllers;

import com.dto.mapper.ITg000013Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000013DTO;

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
@RequestMapping("/tg000013")
public class Tg000013RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000013RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000013Mapper tg000013Mapper;

    @PostMapping(value = "/saveTg000013")
    public void saveTg000013(@RequestBody
    Tg000013DTO tg000013DTO) throws Exception {
        try {
            Tg000013 tg000013 = tg000013Mapper.tg000013DTOToTg000013(tg000013DTO);

            businessDelegatorView.saveTg000013(tg000013);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000013/{codActividad}")
    public void deleteTg000013(@PathVariable("codActividad")
    String codActividad) throws Exception {
        try {
            Tg000013 tg000013 = businessDelegatorView.getTg000013(codActividad);

            businessDelegatorView.deleteTg000013(tg000013);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000013/")
    public void updateTg000013(@RequestBody
    Tg000013DTO tg000013DTO) throws Exception {
        try {
            Tg000013 tg000013 = tg000013Mapper.tg000013DTOToTg000013(tg000013DTO);

            businessDelegatorView.updateTg000013(tg000013);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000013")
    public List<Tg000013DTO> getDataTg000013() throws Exception {
        try {
            return businessDelegatorView.getDataTg000013();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000013/{codActividad}")
    public Tg000013DTO getTg000013(
        @PathVariable("codActividad")
    String codActividad) throws Exception {
        try {
            Tg000013 tg000013 = businessDelegatorView.getTg000013(codActividad);

            return tg000013Mapper.tg000013ToTg000013DTO(tg000013);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
