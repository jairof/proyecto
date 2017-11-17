package com.rest.controllers;

import com.dto.mapper.ITg000008Mapper;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.*;

import com.proyecto.dto.Tg000008DTO;

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
@RequestMapping("/tg000008")
public class Tg000008RestController {
    private static final Logger log = LoggerFactory.getLogger(Tg000008RestController.class);
    @Autowired
    private IBusinessDelegatorView businessDelegatorView;
    @Autowired
    private ITg000008Mapper tg000008Mapper;

    @PostMapping(value = "/saveTg000008")
    public void saveTg000008(@RequestBody
    Tg000008DTO tg000008DTO) throws Exception {
        try {
            Tg000008 tg000008 = tg000008Mapper.tg000008DTOToTg000008(tg000008DTO);

            businessDelegatorView.saveTg000008(tg000008);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTg000008/{codCuenta}/{codEmpresa}")
    public void deleteTg000008(@PathVariable("codCuenta")
    String codCuenta, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000008Id id = new Tg000008Id();

            id.setCodCuenta(codCuenta);
            id.setCodEmpresa(codEmpresa);

            Tg000008 tg000008 = businessDelegatorView.getTg000008(id);

            businessDelegatorView.deleteTg000008(tg000008);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTg000008/")
    public void updateTg000008(@RequestBody
    Tg000008DTO tg000008DTO) throws Exception {
        try {
            Tg000008 tg000008 = tg000008Mapper.tg000008DTOToTg000008(tg000008DTO);

            businessDelegatorView.updateTg000008(tg000008);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTg000008")
    public List<Tg000008DTO> getDataTg000008() throws Exception {
        try {
            return businessDelegatorView.getDataTg000008();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTg000008/{codCuenta}/{codEmpresa}")
    public Tg000008DTO getTg000008(@PathVariable("codCuenta")
    String codCuenta, @PathVariable("codEmpresa")
    String codEmpresa) throws Exception {
        try {
            Tg000008Id id = new Tg000008Id();

            id.setCodCuenta(codCuenta);
            id.setCodEmpresa(codEmpresa);

            Tg000008 tg000008 = businessDelegatorView.getTg000008(id);

            return tg000008Mapper.tg000008ToTg000008DTO(tg000008);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
