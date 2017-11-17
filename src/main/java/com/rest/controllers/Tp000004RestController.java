package com.rest.controllers;

import com.dto.mapper.ITp000004Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tp000004DTO;

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
@RequestMapping("/tp000004")
public class Tp000004RestController {
    private static final Logger log = LoggerFactory.getLogger(Tp000004RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITp000004Mapper tp000004Mapper;

    @PostMapping(value = "/saveTp000004")
    public void saveTp000004(@RequestBody
    Tp000004DTO tp000004DTO) throws Exception {
        try {
            Tp000004 tp000004 = tp000004Mapper.tp000004DTOToTp000004(tp000004DTO);

            businessDelegatorView.saveTp000004(tp000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTp000004/{codArp}")
    public void deleteTp000004(@PathVariable("codArp")
    String codArp) throws Exception {
        try {
            Tp000004 tp000004 = businessDelegatorView.getTp000004(codArp);

            businessDelegatorView.deleteTp000004(tp000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTp000004/")
    public void updateTp000004(@RequestBody
    Tp000004DTO tp000004DTO) throws Exception {
        try {
            Tp000004 tp000004 = tp000004Mapper.tp000004DTOToTp000004(tp000004DTO);

            businessDelegatorView.updateTp000004(tp000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTp000004")
    public List<Tp000004DTO> getDataTp000004() throws Exception {
        try {
            return businessDelegatorView.getDataTp000004();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTp000004/{codArp}")
    public Tp000004DTO getTp000004(@PathVariable("codArp")
    String codArp) throws Exception {
        try {
            Tp000004 tp000004 = businessDelegatorView.getTp000004(codArp);

            return tp000004Mapper.tp000004ToTp000004DTO(tp000004);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
