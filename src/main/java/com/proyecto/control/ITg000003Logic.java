package com.proyecto.control;

import com.proyecto.Tg000003;

import com.proyecto.dto.Tg000003DTO;

import java.math.BigDecimal;

import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000003Logic {
    public List<Tg000003> getTg000003() throws Exception;

    /**
         * Save an new Tg000003 entity
         */
    public void saveTg000003(Tg000003 entity) throws Exception;

    /**
         * Delete an existing Tg000003 entity
         *
         */
    public void deleteTg000003(Tg000003 entity) throws Exception;

    /**
        * Update an existing Tg000003 entity
        *
        */
    public void updateTg000003(Tg000003 entity) throws Exception;

    /**
         * Load an existing Tg000003 entity
         *
         */
    public Tg000003 getTg000003(String codEmpresa) throws Exception;

    public List<Tg000003> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000003> findPageTg000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000003() throws Exception;

    public List<Tg000003DTO> getDataTg000003() throws Exception;

    public void validateTg000003(Tg000003 tg000003) throws Exception;
}
