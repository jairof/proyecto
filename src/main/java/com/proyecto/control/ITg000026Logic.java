package com.proyecto.control;

import com.proyecto.Tg000026;

import com.proyecto.dto.Tg000026DTO;

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
public interface ITg000026Logic {
    public List<Tg000026> getTg000026() throws Exception;

    /**
         * Save an new Tg000026 entity
         */
    public void saveTg000026(Tg000026 entity) throws Exception;

    /**
         * Delete an existing Tg000026 entity
         *
         */
    public void deleteTg000026(Tg000026 entity) throws Exception;

    /**
        * Update an existing Tg000026 entity
        *
        */
    public void updateTg000026(Tg000026 entity) throws Exception;

    /**
         * Load an existing Tg000026 entity
         *
         */
    public Tg000026 getTg000026(String codTipodePlanillas)
        throws Exception;

    public List<Tg000026> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000026> findPageTg000026(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000026() throws Exception;

    public List<Tg000026DTO> getDataTg000026() throws Exception;

    public void validateTg000026(Tg000026 tg000026) throws Exception;
}
