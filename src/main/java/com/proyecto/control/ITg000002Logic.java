package com.proyecto.control;

import com.proyecto.Tg000002;

import com.proyecto.dto.Tg000002DTO;

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
public interface ITg000002Logic {
    public List<Tg000002> getTg000002() throws Exception;

    /**
         * Save an new Tg000002 entity
         */
    public void saveTg000002(Tg000002 entity) throws Exception;

    /**
         * Delete an existing Tg000002 entity
         *
         */
    public void deleteTg000002(Tg000002 entity) throws Exception;

    /**
        * Update an existing Tg000002 entity
        *
        */
    public void updateTg000002(Tg000002 entity) throws Exception;

    /**
         * Load an existing Tg000002 entity
         *
         */
    public Tg000002 getTg000002(String codCiudad) throws Exception;

    public List<Tg000002> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000002> findPageTg000002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000002() throws Exception;

    public List<Tg000002DTO> getDataTg000002() throws Exception;

    public void validateTg000002(Tg000002 tg000002) throws Exception;
}
