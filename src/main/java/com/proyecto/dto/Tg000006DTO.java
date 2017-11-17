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
public class Tg000006DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000006DTO.class);
    private String codCargo;
    private String desCargo;

    public String getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(String codCargo) {
        this.codCargo = codCargo;
    }

    public String getDesCargo() {
        return desCargo;
    }

    public void setDesCargo(String desCargo) {
        this.desCargo = desCargo;
    }
}
