package com.proyecto.control;

import com.proyecto.Tlp00003;
import com.proyecto.Tlp00003Id;

import com.proyecto.dto.Tlp00003DTO;

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
public interface ITlp00003Logic {
    public List<Tlp00003> getTlp00003() throws Exception;

    /**
         * Save an new Tlp00003 entity
         */
    public void saveTlp00003(Tlp00003 entity) throws Exception;

    /**
         * Delete an existing Tlp00003 entity
         *
         */
    public void deleteTlp00003(Tlp00003 entity) throws Exception;

    /**
        * Update an existing Tlp00003 entity
        *
        */
    public void updateTlp00003(Tlp00003 entity) throws Exception;

    /**
         * Load an existing Tlp00003 entity
         *
         */
    public Tlp00003 getTlp00003(Tlp00003Id id) throws Exception;

    public List<Tlp00003> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00003> findPageTlp00003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00003() throws Exception;

    public List<Tlp00003DTO> getDataTlp00003() throws Exception;

    public void validateTlp00003(Tlp00003 tlp00003) throws Exception;
}
