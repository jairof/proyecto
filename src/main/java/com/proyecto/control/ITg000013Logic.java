package com.proyecto.control;

import com.proyecto.Tg000013;

import com.proyecto.dto.Tg000013DTO;

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
public interface ITg000013Logic {
    public List<Tg000013> getTg000013() throws Exception;

    /**
         * Save an new Tg000013 entity
         */
    public void saveTg000013(Tg000013 entity) throws Exception;

    /**
         * Delete an existing Tg000013 entity
         *
         */
    public void deleteTg000013(Tg000013 entity) throws Exception;

    /**
        * Update an existing Tg000013 entity
        *
        */
    public void updateTg000013(Tg000013 entity) throws Exception;

    /**
         * Load an existing Tg000013 entity
         *
         */
    public Tg000013 getTg000013(String codActividad) throws Exception;

    public List<Tg000013> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000013> findPageTg000013(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000013() throws Exception;

    public List<Tg000013DTO> getDataTg000013() throws Exception;

    public void validateTg000013(Tg000013 tg000013) throws Exception;
}
