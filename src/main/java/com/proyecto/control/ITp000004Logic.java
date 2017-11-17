package com.proyecto.control;

import com.proyecto.Tp000004;

import com.proyecto.dto.Tp000004DTO;

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
public interface ITp000004Logic {
    public List<Tp000004> getTp000004() throws Exception;

    /**
         * Save an new Tp000004 entity
         */
    public void saveTp000004(Tp000004 entity) throws Exception;

    /**
         * Delete an existing Tp000004 entity
         *
         */
    public void deleteTp000004(Tp000004 entity) throws Exception;

    /**
        * Update an existing Tp000004 entity
        *
        */
    public void updateTp000004(Tp000004 entity) throws Exception;

    /**
         * Load an existing Tp000004 entity
         *
         */
    public Tp000004 getTp000004(String codArp) throws Exception;

    public List<Tp000004> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000004> findPageTp000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000004() throws Exception;

    public List<Tp000004DTO> getDataTp000004() throws Exception;

    public void validateTp000004(Tp000004 tp000004) throws Exception;
}
