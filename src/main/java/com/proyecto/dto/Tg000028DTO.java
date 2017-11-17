package com.proyecto.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.util.Date;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public class Tg000028DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000028DTO.class);
    private String codTipoCotizante;
    private String nombTipoCotizante;

    public String getCodTipoCotizante() {
        return codTipoCotizante;
    }

    public void setCodTipoCotizante(String codTipoCotizante) {
        this.codTipoCotizante = codTipoCotizante;
    }

    public String getNombTipoCotizante() {
        return nombTipoCotizante;
    }

    public void setNombTipoCotizante(String nombTipoCotizante) {
        this.nombTipoCotizante = nombTipoCotizante;
    }
}
