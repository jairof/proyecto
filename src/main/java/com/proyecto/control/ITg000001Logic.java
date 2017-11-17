package com.proyecto.control;

import com.proyecto.Tg000001;

import com.proyecto.dto.Tg000001DTO;

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
public interface ITg000001Logic {
    public List<Tg000001> getTg000001() throws Exception;

    /**
         * Save an new Tg000001 entity
         */
    public void saveTg000001(Tg000001 entity) throws Exception;

    /**
         * Delete an existing Tg000001 entity
         *
         */
    public void deleteTg000001(Tg000001 entity) throws Exception;

    /**
        * Update an existing Tg000001 entity
        *
        */
    public void updateTg000001(Tg000001 entity) throws Exception;

    /**
         * Load an existing Tg000001 entity
         *
         */
    public Tg000001 getTg000001(String codBanco) throws Exception;

    public List<Tg000001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000001> findPageTg000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000001() throws Exception;

    public List<Tg000001DTO> getDataTg000001() throws Exception;

    public void validateTg000001(Tg000001 tg000001) throws Exception;
}
