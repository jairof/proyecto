package com.rest.controllers;

import com.dto.mapper.ITp000003Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tp000003DTO;

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
@RequestMapping("/tp000003")
public class Tp000003RestController {
    private static final Logger log = LoggerFactory.getLogger(Tp000003RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITp000003Mapper tp000003Mapper;

    @PostMapping(value = "/saveTp000003")
    public void saveTp000003(@RequestBody
    Tp000003DTO tp000003DTO) throws Exception {
        try {
            Tp000003 tp000003 = tp000003Mapper.tp000003DTOToTp000003(tp000003DTO);

            businessDelegatorView.saveTp000003(tp000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTp000003/{codEps}")
    public void deleteTp000003(@PathVariable("codEps")
    String codEps) throws Exception {
        try {
            Tp000003 tp000003 = businessDelegatorView.getTp000003(codEps);

            businessDelegatorView.deleteTp000003(tp000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTp000003/")
    public void updateTp000003(@RequestBody
    Tp000003DTO tp000003DTO) throws Exception {
        try {
            Tp000003 tp000003 = tp000003Mapper.tp000003DTOToTp000003(tp000003DTO);

            businessDelegatorView.updateTp000003(tp000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTp000003")
    public List<Tp000003DTO> getDataTp000003() throws Exception {
        try {
            return businessDelegatorView.getDataTp000003();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTp000003/{codEps}")
    public Tp000003DTO getTp000003(@PathVariable("codEps")
    String codEps) throws Exception {
        try {
            Tp000003 tp000003 = businessDelegatorView.getTp000003(codEps);

            return tp000003Mapper.tp000003ToTp000003DTO(tp000003);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
