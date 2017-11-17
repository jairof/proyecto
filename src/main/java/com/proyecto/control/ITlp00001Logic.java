package com.proyecto.control;

import com.proyecto.Tlp00001;
import com.proyecto.Tlp00001Id;

import com.proyecto.dto.Tlp00001DTO;

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
public interface ITlp00001Logic {
    public List<Tlp00001> getTlp00001() throws Exception;

    /**
         * Save an new Tlp00001 entity
         */
    public void saveTlp00001(Tlp00001 entity) throws Exception;

    /**
         * Delete an existing Tlp00001 entity
         *
         */
    public void deleteTlp00001(Tlp00001 entity) throws Exception;

    /**
        * Update an existing Tlp00001 entity
        *
        */
    public void updateTlp00001(Tlp00001 entity) throws Exception;

    /**
         * Load an existing Tlp00001 entity
         *
         */
    public Tlp00001 getTlp00001(Tlp00001Id id) throws Exception;

    public List<Tlp00001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00001> findPageTlp00001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00001() throws Exception;

    public List<Tlp00001DTO> getDataTlp00001() throws Exception;

    public void validateTlp00001(Tlp00001 tlp00001) throws Exception;
}
