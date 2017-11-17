package com.rest.controllers;

import com.dto.mapper.ITg000002Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000002DTO;

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
@RequestMapping("/tg000002")
public class Tg000002RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000002RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000002Mapper tg000002Mapper;

    @PostMapping(value = "/saveTg000002")
    public void saveTg000002(@RequestBody
    Tg000002DTO tg000002DTO) throws Exception {
        try {
            Tg000002 tg000002 = tg000002Mapper.tg000002DTOToTg000002(tg000002DTO);

            businessDelegatorView.saveTg000002(tg000002);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000002/{codCiudad}")
    public void deleteTg000002(@PathVariable("codCiudad")
    String codCiudad) throws Exception {
        try {
            Tg000002 tg000002 = businessDelegatorView.getTg000002(codCiudad);

            businessDelegatorView.deleteTg000002(tg000002);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000002/")
    public void updateTg000002(@RequestBody
    Tg000002DTO tg000002DTO) throws Exception {
        try {
            Tg000002 tg000002 = tg000002Mapper.tg000002DTOToTg000002(tg000002DTO);

            businessDelegatorView.updateTg000002(tg000002);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000002")
    public List<Tg000002DTO> getDataTg000002() throws Exception {
        try {
            return businessDelegatorView.getDataTg000002();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000002/{codCiudad}")
    public Tg000002DTO getTg000002(@PathVariable("codCiudad")
    String codCiudad) throws Exception {
        try {
            Tg000002 tg000002 = businessDelegatorView.getTg000002(codCiudad);

            return tg000002Mapper.tg000002ToTg000002DTO(tg000002);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
