package com.rest.controllers;

import com.dto.mapper.ITg000019Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000019DTO;

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
@RequestMapping("/tg000019")
public class Tg000019RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000019RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000019Mapper tg000019Mapper;

    @PostMapping(value = "/saveTg000019")
    public void saveTg000019(@RequestBody
    Tg000019DTO tg000019DTO) throws Exception {
        try {
            Tg000019 tg000019 = tg000019Mapper.tg000019DTOToTg000019(tg000019DTO);

            businessDelegatorView.saveTg000019(tg000019);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000019/{codIdentidad}")
    public void deleteTg000019(@PathVariable("codIdentidad")
    String codIdentidad) throws Exception {
        try {
            Tg000019 tg000019 = businessDelegatorView.getTg000019(codIdentidad);

            businessDelegatorView.deleteTg000019(tg000019);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000019/")
    public void updateTg000019(@RequestBody
    Tg000019DTO tg000019DTO) throws Exception {
        try {
            Tg000019 tg000019 = tg000019Mapper.tg000019DTOToTg000019(tg000019DTO);

            businessDelegatorView.updateTg000019(tg000019);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000019")
    public List<Tg000019DTO> getDataTg000019() throws Exception {
        try {
            return businessDelegatorView.getDataTg000019();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000019/{codIdentidad}")
    public Tg000019DTO getTg000019(
        @PathVariable("codIdentidad")
    String codIdentidad) throws Exception {
        try {
            Tg000019 tg000019 = businessDelegatorView.getTg000019(codIdentidad);

            return tg000019Mapper.tg000019ToTg000019DTO(tg000019);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
