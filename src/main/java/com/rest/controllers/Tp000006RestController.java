package com.rest.controllers;

import com.dto.mapper.ITp000006Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tp000006DTO;

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
@RequestMapping("/tp000006")
public class Tp000006RestController {
    private static final Logger log = LoggerFactory.getLogger(Tp000006RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITp000006Mapper tp000006Mapper;

    @PostMapping(value = "/saveTp000006")
    public void saveTp000006(@RequestBody
    Tp000006DTO tp000006DTO) throws Exception {
        try {
            Tp000006 tp000006 = tp000006Mapper.tp000006DTOToTp000006(tp000006DTO);

            businessDelegatorView.saveTp000006(tp000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTp000006/{codCaja}")
    public void deleteTp000006(@PathVariable("codCaja")
    String codCaja) throws Exception {
        try {
            Tp000006 tp000006 = businessDelegatorView.getTp000006(codCaja);

            businessDelegatorView.deleteTp000006(tp000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTp000006/")
    public void updateTp000006(@RequestBody
    Tp000006DTO tp000006DTO) throws Exception {
        try {
            Tp000006 tp000006 = tp000006Mapper.tp000006DTOToTp000006(tp000006DTO);

            businessDelegatorView.updateTp000006(tp000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTp000006")
    public List<Tp000006DTO> getDataTp000006() throws Exception {
        try {
            return businessDelegatorView.getDataTp000006();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTp000006/{codCaja}")
    public Tp000006DTO getTp000006(@PathVariable("codCaja")
    String codCaja) throws Exception {
        try {
            Tp000006 tp000006 = businessDelegatorView.getTp000006(codCaja);

            return tp000006Mapper.tp000006ToTp000006DTO(tp000006);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
