package com.proyecto.control;

import com.proyecto.Tg000012;

import com.proyecto.dto.Tg000012DTO;

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
public interface ITg000012Logic {
    public List<Tg000012> getTg000012() throws Exception;

    /**
         * Save an new Tg000012 entity
         */
    public void saveTg000012(Tg000012 entity) throws Exception;

    /**
         * Delete an existing Tg000012 entity
         *
         */
    public void deleteTg000012(Tg000012 entity) throws Exception;

    /**
        * Update an existing Tg000012 entity
        *
        */
    public void updateTg000012(Tg000012 entity) throws Exception;

    /**
         * Load an existing Tg000012 entity
         *
         */
    public Tg000012 getTg000012(String codProfesion) throws Exception;

    public List<Tg000012> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000012> findPageTg000012(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000012() throws Exception;

    public List<Tg000012DTO> getDataTg000012() throws Exception;

    public void validateTg000012(Tg000012 tg000012) throws Exception;
}
