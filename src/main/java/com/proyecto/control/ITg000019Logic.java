package com.proyecto.control;

import com.proyecto.Tg000019;

import com.proyecto.dto.Tg000019DTO;

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
public interface ITg000019Logic {
    public List<Tg000019> getTg000019() throws Exception;

    /**
         * Save an new Tg000019 entity
         */
    public void saveTg000019(Tg000019 entity) throws Exception;

    /**
         * Delete an existing Tg000019 entity
         *
         */
    public void deleteTg000019(Tg000019 entity) throws Exception;

    /**
        * Update an existing Tg000019 entity
        *
        */
    public void updateTg000019(Tg000019 entity) throws Exception;

    /**
         * Load an existing Tg000019 entity
         *
         */
    public Tg000019 getTg000019(String codIdentidad) throws Exception;

    public List<Tg000019> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000019> findPageTg000019(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000019() throws Exception;

    public List<Tg000019DTO> getDataTg000019() throws Exception;

    public void validateTg000019(Tg000019 tg000019) throws Exception;
}
