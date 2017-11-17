package com.proyecto.control;

import com.proyecto.Tp000001;
import com.proyecto.Tp000001Id;

import com.proyecto.dto.Tp000001DTO;

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
public interface ITp000001Logic {
    public List<Tp000001> getTp000001() throws Exception;

    /**
         * Save an new Tp000001 entity
         */
    public void saveTp000001(Tp000001 entity) throws Exception;

    /**
         * Delete an existing Tp000001 entity
         *
         */
    public void deleteTp000001(Tp000001 entity) throws Exception;

    /**
        * Update an existing Tp000001 entity
        *
        */
    public void updateTp000001(Tp000001 entity) throws Exception;

    /**
         * Load an existing Tp000001 entity
         *
         */
    public Tp000001 getTp000001(Tp000001Id id) throws Exception;

    public List<Tp000001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000001> findPageTp000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000001() throws Exception;

    public List<Tp000001DTO> getDataTp000001() throws Exception;

    public void validateTp000001(Tp000001 tp000001) throws Exception;
}
