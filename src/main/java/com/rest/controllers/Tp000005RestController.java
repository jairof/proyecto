package com.rest.controllers;

import com.dto.mapper.ITp000005Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tp000005DTO;

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
@RequestMapping("/tp000005")
public class Tp000005RestController {
    private static final Logger log = LoggerFactory.getLogger(Tp000005RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITp000005Mapper tp000005Mapper;

    @PostMapping(value = "/saveTp000005")
    public void saveTp000005(@RequestBody
    Tp000005DTO tp000005DTO) throws Exception {
        try {
            Tp000005 tp000005 = tp000005Mapper.tp000005DTOToTp000005(tp000005DTO);

            businessDelegatorView.saveTp000005(tp000005);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTp000005/{codAfp}")
    public void deleteTp000005(@PathVariable("codAfp")
    String codAfp) throws Exception {
        try {
            Tp000005 tp000005 = businessDelegatorView.getTp000005(codAfp);

            businessDelegatorView.deleteTp000005(tp000005);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTp000005/")
    public void updateTp000005(@RequestBody
    Tp000005DTO tp000005DTO) throws Exception {
        try {
            Tp000005 tp000005 = tp000005Mapper.tp000005DTOToTp000005(tp000005DTO);

            businessDelegatorView.updateTp000005(tp000005);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTp000005")
    public List<Tp000005DTO> getDataTp000005() throws Exception {
        try {
            return businessDelegatorView.getDataTp000005();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTp000005/{codAfp}")
    public Tp000005DTO getTp000005(@PathVariable("codAfp")
    String codAfp) throws Exception {
        try {
            Tp000005 tp000005 = businessDelegatorView.getTp000005(codAfp);

            return tp000005Mapper.tp000005ToTp000005DTO(tp000005);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
