package com.proyecto.control;

import com.proyecto.Tg000006;

import com.proyecto.dto.Tg000006DTO;

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
public interface ITg000006Logic {
    public List<Tg000006> getTg000006() throws Exception;

    /**
         * Save an new Tg000006 entity
         */
    public void saveTg000006(Tg000006 entity) throws Exception;

    /**
         * Delete an existing Tg000006 entity
         *
         */
    public void deleteTg000006(Tg000006 entity) throws Exception;

    /**
        * Update an existing Tg000006 entity
        *
        */
    public void updateTg000006(Tg000006 entity) throws Exception;

    /**
         * Load an existing Tg000006 entity
         *
         */
    public Tg000006 getTg000006(String codCargo) throws Exception;

    public List<Tg000006> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000006> findPageTg000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000006() throws Exception;

    public List<Tg000006DTO> getDataTg000006() throws Exception;

    public void validateTg000006(Tg000006 tg000006) throws Exception;
}
