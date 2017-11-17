package com.proyecto.control;

import com.proyecto.Tp000006;

import com.proyecto.dto.Tp000006DTO;

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
public interface ITp000006Logic {
    public List<Tp000006> getTp000006() throws Exception;

    /**
         * Save an new Tp000006 entity
         */
    public void saveTp000006(Tp000006 entity) throws Exception;

    /**
         * Delete an existing Tp000006 entity
         *
         */
    public void deleteTp000006(Tp000006 entity) throws Exception;

    /**
        * Update an existing Tp000006 entity
        *
        */
    public void updateTp000006(Tp000006 entity) throws Exception;

    /**
         * Load an existing Tp000006 entity
         *
         */
    public Tp000006 getTp000006(String codCaja) throws Exception;

    public List<Tp000006> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000006> findPageTp000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000006() throws Exception;

    public List<Tp000006DTO> getDataTp000006() throws Exception;

    public void validateTp000006(Tp000006 tp000006) throws Exception;
}
