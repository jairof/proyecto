package com.proyecto.control;

import com.proyecto.Tg000004;

import com.proyecto.dto.Tg000004DTO;

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
public interface ITg000004Logic {
    public List<Tg000004> getTg000004() throws Exception;

    /**
         * Save an new Tg000004 entity
         */
    public void saveTg000004(Tg000004 entity) throws Exception;

    /**
         * Delete an existing Tg000004 entity
         *
         */
    public void deleteTg000004(Tg000004 entity) throws Exception;

    /**
        * Update an existing Tg000004 entity
        *
        */
    public void updateTg000004(Tg000004 entity) throws Exception;

    /**
         * Load an existing Tg000004 entity
         *
         */
    public Tg000004 getTg000004(String codDepto) throws Exception;

    public List<Tg000004> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000004> findPageTg000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000004() throws Exception;

    public List<Tg000004DTO> getDataTg000004() throws Exception;

    public void validateTg000004(Tg000004 tg000004) throws Exception;
}
