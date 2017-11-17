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
public class Tg000029DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000029DTO.class);
    private String codSubTipoCotizante;
    private String nombSubTipoCotizante;

    public String getCodSubTipoCotizante() {
        return codSubTipoCotizante;
    }

    public void setCodSubTipoCotizante(String codSubTipoCotizante) {
        this.codSubTipoCotizante = codSubTipoCotizante;
    }

    public String getNombSubTipoCotizante() {
        return nombSubTipoCotizante;
    }

    public void setNombSubTipoCotizante(String nombSubTipoCotizante) {
        this.nombSubTipoCotizante = nombSubTipoCotizante;
    }
}
