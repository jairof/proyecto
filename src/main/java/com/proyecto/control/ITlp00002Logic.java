package com.proyecto.control;

import com.proyecto.Tlp00002;
import com.proyecto.Tlp00002Id;

import com.proyecto.dto.Tlp00002DTO;

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
public interface ITlp00002Logic {
    public List<Tlp00002> getTlp00002() throws Exception;

    /**
         * Save an new Tlp00002 entity
         */
    public void saveTlp00002(Tlp00002 entity) throws Exception;

    /**
         * Delete an existing Tlp00002 entity
         *
         */
    public void deleteTlp00002(Tlp00002 entity) throws Exception;

    /**
        * Update an existing Tlp00002 entity
        *
        */
    public void updateTlp00002(Tlp00002 entity) throws Exception;

    /**
         * Load an existing Tlp00002 entity
         *
         */
    public Tlp00002 getTlp00002(Tlp00002Id id) throws Exception;

    public List<Tlp00002> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00002> findPageTlp00002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00002() throws Exception;

    public List<Tlp00002DTO> getDataTlp00002() throws Exception;

    public void validateTlp00002(Tlp00002 tlp00002) throws Exception;
}
