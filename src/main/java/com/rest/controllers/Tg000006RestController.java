package com.rest.controllers;

import com.dto.mapper.ITg000006Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000006DTO;

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
@RequestMapping("/tg000006")
public class Tg000006RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000006RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000006Mapper tg000006Mapper;

    @PostMapping(value = "/saveTg000006")
    public void saveTg000006(@RequestBody
    Tg000006DTO tg000006DTO) throws Exception {
        try {
            Tg000006 tg000006 = tg000006Mapper.tg000006DTOToTg000006(tg000006DTO);

            businessDelegatorView.saveTg000006(tg000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000006/{codCargo}")
    public void deleteTg000006(@PathVariable("codCargo")
    String codCargo) throws Exception {
        try {
            Tg000006 tg000006 = businessDelegatorView.getTg000006(codCargo);

            businessDelegatorView.deleteTg000006(tg000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000006/")
    public void updateTg000006(@RequestBody
    Tg000006DTO tg000006DTO) throws Exception {
        try {
            Tg000006 tg000006 = tg000006Mapper.tg000006DTOToTg000006(tg000006DTO);

            businessDelegatorView.updateTg000006(tg000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000006")
    public List<Tg000006DTO> getDataTg000006() throws Exception {
        try {
            return businessDelegatorView.getDataTg000006();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000006/{codCargo}")
    public Tg000006DTO getTg000006(@PathVariable("codCargo")
    String codCargo) throws Exception {
        try {
            Tg000006 tg000006 = businessDelegatorView.getTg000006(codCargo);

            return tg000006Mapper.tg000006ToTg000006DTO(tg000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
