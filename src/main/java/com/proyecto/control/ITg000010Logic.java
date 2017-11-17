package com.proyecto.control;

import com.proyecto.Tg000010;
import com.proyecto.Tg000010Id;

import com.proyecto.dto.Tg000010DTO;

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
public interface ITg000010Logic {
    public List<Tg000010> getTg000010() throws Exception;

    /**
         * Save an new Tg000010 entity
         */
    public void saveTg000010(Tg000010 entity) throws Exception;

    /**
         * Delete an existing Tg000010 entity
         *
         */
    public void deleteTg000010(Tg000010 entity) throws Exception;

    /**
        * Update an existing Tg000010 entity
        *
        */
    public void updateTg000010(Tg000010 entity) throws Exception;

    /**
         * Load an existing Tg000010 entity
         *
         */
    public Tg000010 getTg000010(Tg000010Id id) throws Exception;

    public List<Tg000010> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000010> findPageTg000010(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000010() throws Exception;

    public List<Tg000010DTO> getDataTg000010() throws Exception;

    public void validateTg000010(Tg000010 tg000010) throws Exception;
}
