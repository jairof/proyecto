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
public class Tg000002DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000002DTO.class);
    private String codCiudad;
    private String desCiudad;
    private String codDepto_Tg000004;

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getDesCiudad() {
        return desCiudad;
    }

    public void setDesCiudad(String desCiudad) {
        this.desCiudad = desCiudad;
    }

    public String getCodDepto_Tg000004() {
        return codDepto_Tg000004;
    }

    public void setCodDepto_Tg000004(String codDepto_Tg000004) {
        this.codDepto_Tg000004 = codDepto_Tg000004;
    }
}
