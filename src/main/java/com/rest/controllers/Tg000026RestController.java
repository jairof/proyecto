package com.rest.controllers;

import com.dto.mapper.ITg000026Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000026DTO;

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
@RequestMapping("/tg000026")
public class Tg000026RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000026RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000026Mapper tg000026Mapper;

    @PostMapping(value = "/saveTg000026")
    public void saveTg000026(@RequestBody
    Tg000026DTO tg000026DTO) throws Exception {
        try {
            Tg000026 tg000026 = tg000026Mapper.tg000026DTOToTg000026(tg000026DTO);

            businessDelegatorView.saveTg000026(tg000026);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000026/{codTipodePlanillas}")
    public void deleteTg000026(
        @PathVariable("codTipodePlanillas")
    String codTipodePlanillas) throws Exception {
        try {
            Tg000026 tg000026 = businessDelegatorView.getTg000026(codTipodePlanillas);

            businessDelegatorView.deleteTg000026(tg000026);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000026/")
    public void updateTg000026(@RequestBody
    Tg000026DTO tg000026DTO) throws Exception {
        try {
            Tg000026 tg000026 = tg000026Mapper.tg000026DTOToTg000026(tg000026DTO);

            businessDelegatorView.updateTg000026(tg000026);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000026")
    public List<Tg000026DTO> getDataTg000026() throws Exception {
        try {
            return businessDelegatorView.getDataTg000026();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000026/{codTipodePlanillas}")
    public Tg000026DTO getTg000026(
        @PathVariable("codTipodePlanillas")
    String codTipodePlanillas) throws Exception {
        try {
            Tg000026 tg000026 = businessDelegatorView.getTg000026(codTipodePlanillas);

            return tg000026Mapper.tg000026ToTg000026DTO(tg000026);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
