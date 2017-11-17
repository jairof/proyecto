package com.proyecto.control;

import com.proyecto.Tg000029;

import com.proyecto.dto.Tg000029DTO;

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
public interface ITg000029Logic {
    public List<Tg000029> getTg000029() throws Exception;

    /**
         * Save an new Tg000029 entity
         */
    public void saveTg000029(Tg000029 entity) throws Exception;

    /**
         * Delete an existing Tg000029 entity
         *
         */
    public void deleteTg000029(Tg000029 entity) throws Exception;

    /**
        * Update an existing Tg000029 entity
        *
        */
    public void updateTg000029(Tg000029 entity) throws Exception;

    /**
         * Load an existing Tg000029 entity
         *
         */
    public Tg000029 getTg000029(String codSubTipoCotizante)
        throws Exception;

    public List<Tg000029> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000029> findPageTg000029(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000029() throws Exception;

    public List<Tg000029DTO> getDataTg000029() throws Exception;

    public void validateTg000029(Tg000029 tg000029) throws Exception;
}
