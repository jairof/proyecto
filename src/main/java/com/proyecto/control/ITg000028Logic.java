package com.proyecto.control;

import com.proyecto.Tg000028;

import com.proyecto.dto.Tg000028DTO;

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
public interface ITg000028Logic {
    public List<Tg000028> getTg000028() throws Exception;

    /**
         * Save an new Tg000028 entity
         */
    public void saveTg000028(Tg000028 entity) throws Exception;

    /**
         * Delete an existing Tg000028 entity
         *
         */
    public void deleteTg000028(Tg000028 entity) throws Exception;

    /**
        * Update an existing Tg000028 entity
        *
        */
    public void updateTg000028(Tg000028 entity) throws Exception;

    /**
         * Load an existing Tg000028 entity
         *
         */
    public Tg000028 getTg000028(String codTipoCotizante)
        throws Exception;

    public List<Tg000028> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000028> findPageTg000028(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000028() throws Exception;

    public List<Tg000028DTO> getDataTg000028() throws Exception;

    public void validateTg000028(Tg000028 tg000028) throws Exception;
}
