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
public class Tg000026DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000026DTO.class);
    private String codTipodePlanillas;
    private String desTipodePlanillas;

    public String getCodTipodePlanillas() {
        return codTipodePlanillas;
    }

    public void setCodTipodePlanillas(String codTipodePlanillas) {
        this.codTipodePlanillas = codTipodePlanillas;
    }

    public String getDesTipodePlanillas() {
        return desTipodePlanillas;
    }

    public void setDesTipodePlanillas(String desTipodePlanillas) {
        this.desTipodePlanillas = desTipodePlanillas;
    }
}
