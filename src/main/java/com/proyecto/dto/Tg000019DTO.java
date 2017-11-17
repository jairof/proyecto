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
public class Tg000019DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000019DTO.class);
    private String codIdentidad;
    private String desIdentidad;

    public String getCodIdentidad() {
        return codIdentidad;
    }

    public void setCodIdentidad(String codIdentidad) {
        this.codIdentidad = codIdentidad;
    }

    public String getDesIdentidad() {
        return desIdentidad;
    }

    public void setDesIdentidad(String desIdentidad) {
        this.desIdentidad = desIdentidad;
    }
}
