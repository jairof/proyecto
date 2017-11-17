package com.proyecto.control;

import com.proyecto.Tg000008;
import com.proyecto.Tg000008Id;

import com.proyecto.dto.Tg000008DTO;

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
public interface ITg000008Logic {
    public List<Tg000008> getTg000008() throws Exception;

    /**
         * Save an new Tg000008 entity
         */
    public void saveTg000008(Tg000008 entity) throws Exception;

    /**
         * Delete an existing Tg000008 entity
         *
         */
    public void deleteTg000008(Tg000008 entity) throws Exception;

    /**
        * Update an existing Tg000008 entity
        *
        */
    public void updateTg000008(Tg000008 entity) throws Exception;

    /**
         * Load an existing Tg000008 entity
         *
         */
    public Tg000008 getTg000008(Tg000008Id id) throws Exception;

    public List<Tg000008> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000008> findPageTg000008(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000008() throws Exception;

    public List<Tg000008DTO> getDataTg000008() throws Exception;

    public void validateTg000008(Tg000008 tg000008) throws Exception;
}
