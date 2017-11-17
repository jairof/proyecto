package com.rest.controllers;

import com.dto.mapper.ITg000004Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000004DTO;

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
@RequestMapping("/tg000004")
public class Tg000004RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000004RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000004Mapper tg000004Mapper;

    @PostMapping(value = "/saveTg000004")
    public void saveTg000004(@RequestBody
    Tg000004DTO tg000004DTO) throws Exception {
        try {
            Tg000004 tg000004 = tg000004Mapper.tg000004DTOToTg000004(tg000004DTO);

            businessDelegatorView.saveTg000004(tg000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000004/{codDepto}")
    public void deleteTg000004(@PathVariable("codDepto")
    String codDepto) throws Exception {
        try {
            Tg000004 tg000004 = businessDelegatorView.getTg000004(codDepto);

            businessDelegatorView.deleteTg000004(tg000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000004/")
    public void updateTg000004(@RequestBody
    Tg000004DTO tg000004DTO) throws Exception {
        try {
            Tg000004 tg000004 = tg000004Mapper.tg000004DTOToTg000004(tg000004DTO);

            businessDelegatorView.updateTg000004(tg000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000004")
    public List<Tg000004DTO> getDataTg000004() throws Exception {
        try {
            return businessDelegatorView.getDataTg000004();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000004/{codDepto}")
    public Tg000004DTO getTg000004(@PathVariable("codDepto")
    String codDepto) throws Exception {
        try {
            Tg000004 tg000004 = businessDelegatorView.getTg000004(codDepto);

            return tg000004Mapper.tg000004ToTg000004DTO(tg000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
