package com.proyecto.control;

import com.proyecto.Tp000005;

import com.proyecto.dto.Tp000005DTO;

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
public interface ITp000005Logic {
    public List<Tp000005> getTp000005() throws Exception;

    /**
         * Save an new Tp000005 entity
         */
    public void saveTp000005(Tp000005 entity) throws Exception;

    /**
         * Delete an existing Tp000005 entity
         *
         */
    public void deleteTp000005(Tp000005 entity) throws Exception;

    /**
        * Update an existing Tp000005 entity
        *
        */
    public void updateTp000005(Tp000005 entity) throws Exception;

    /**
         * Load an existing Tp000005 entity
         *
         */
    public Tp000005 getTp000005(String codAfp) throws Exception;

    public List<Tp000005> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000005> findPageTp000005(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000005() throws Exception;

    public List<Tp000005DTO> getDataTp000005() throws Exception;

    public void validateTp000005(Tp000005 tp000005) throws Exception;
}
