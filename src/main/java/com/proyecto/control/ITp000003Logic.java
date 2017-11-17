package com.proyecto.control;

import com.proyecto.Tp000003;

import com.proyecto.dto.Tp000003DTO;

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
public interface ITp000003Logic {
    public List<Tp000003> getTp000003() throws Exception;

    /**
         * Save an new Tp000003 entity
         */
    public void saveTp000003(Tp000003 entity) throws Exception;

    /**
         * Delete an existing Tp000003 entity
         *
         */
    public void deleteTp000003(Tp000003 entity) throws Exception;

    /**
        * Update an existing Tp000003 entity
        *
        */
    public void updateTp000003(Tp000003 entity) throws Exception;

    /**
         * Load an existing Tp000003 entity
         *
         */
    public Tp000003 getTp000003(String codEps) throws Exception;

    public List<Tp000003> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000003> findPageTp000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000003() throws Exception;

    public List<Tp000003DTO> getDataTp000003() throws Exception;

    public void validateTp000003(Tp000003 tp000003) throws Exception;
}
