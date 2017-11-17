package com.proyecto.control;

import com.proyecto.Tg000011;
import com.proyecto.Tg000011Id;

import com.proyecto.dto.Tg000011DTO;

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
public interface ITg000011Logic {
    public List<Tg000011> getTg000011() throws Exception;

    /**
         * Save an new Tg000011 entity
         */
    public void saveTg000011(Tg000011 entity) throws Exception;

    /**
         * Delete an existing Tg000011 entity
         *
         */
    public void deleteTg000011(Tg000011 entity) throws Exception;

    /**
        * Update an existing Tg000011 entity
        *
        */
    public void updateTg000011(Tg000011 entity) throws Exception;

    /**
         * Load an existing Tg000011 entity
         *
         */
    public Tg000011 getTg000011(Tg000011Id id) throws Exception;

    public List<Tg000011> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000011> findPageTg000011(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000011() throws Exception;

    public List<Tg000011DTO> getDataTg000011() throws Exception;

    public void validateTg000011(Tg000011 tg000011) throws Exception;
}
