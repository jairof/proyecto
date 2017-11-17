package com.proyecto.control;

import com.proyecto.Tr000004;
import com.proyecto.Tr000004Id;

import com.proyecto.dto.Tr000004DTO;

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
public interface ITr000004Logic {
    public List<Tr000004> getTr000004() throws Exception;

    /**
         * Save an new Tr000004 entity
         */
    public void saveTr000004(Tr000004 entity) throws Exception;

    /**
         * Delete an existing Tr000004 entity
         *
         */
    public void deleteTr000004(Tr000004 entity) throws Exception;

    /**
        * Update an existing Tr000004 entity
        *
        */
    public void updateTr000004(Tr000004 entity) throws Exception;

    /**
         * Load an existing Tr000004 entity
         *
         */
    public Tr000004 getTr000004(Tr000004Id id) throws Exception;

    public List<Tr000004> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tr000004> findPageTr000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTr000004() throws Exception;

    public List<Tr000004DTO> getDataTr000004() throws Exception;

    public void validateTr000004(Tr000004 tr000004) throws Exception;
}
