package com.rest.controllers;

import com.dto.mapper.ITg000012Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000012DTO;

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
@RequestMapping("/tg000012")
public class Tg000012RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000012RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000012Mapper tg000012Mapper;

    @PostMapping(value = "/saveTg000012")
    public void saveTg000012(@RequestBody
    Tg000012DTO tg000012DTO) throws Exception {
        try {
            Tg000012 tg000012 = tg000012Mapper.tg000012DTOToTg000012(tg000012DTO);

            businessDelegatorView.saveTg000012(tg000012);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000012/{codProfesion}")
    public void deleteTg000012(@PathVariable("codProfesion")
    String codProfesion) throws Exception {
        try {
            Tg000012 tg000012 = businessDelegatorView.getTg000012(codProfesion);

            businessDelegatorView.deleteTg000012(tg000012);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000012/")
    public void updateTg000012(@RequestBody
    Tg000012DTO tg000012DTO) throws Exception {
        try {
            Tg000012 tg000012 = tg000012Mapper.tg000012DTOToTg000012(tg000012DTO);

            businessDelegatorView.updateTg000012(tg000012);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000012")
    public List<Tg000012DTO> getDataTg000012() throws Exception {
        try {
            return businessDelegatorView.getDataTg000012();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000012/{codProfesion}")
    public Tg000012DTO getTg000012(
        @PathVariable("codProfesion")
    String codProfesion) throws Exception {
        try {
            Tg000012 tg000012 = businessDelegatorView.getTg000012(codProfesion);

            return tg000012Mapper.tg000012ToTg000012DTO(tg000012);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
