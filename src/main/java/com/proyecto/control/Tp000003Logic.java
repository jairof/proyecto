package com.proyecto.control;

import com.dataaccess.dao.*;

import com.dto.mapper.ITp000003Mapper;

import com.exceptions.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000003DTO;

import com.utilities.Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("Tp000003Logic")
public class Tp000003Logic implements ITp000003Logic {
    private static final Logger log = LoggerFactory.getLogger(Tp000003Logic.class);

    /**
     * DAO injected by Spring that manages Tp000003 entities
     *
     */
    @Autowired
    private ITp000003DAO tp000003DAO;
    @Autowired
    private ITp000003Mapper tp000003Mapper;
    @Autowired
    private Validator validator;

    /**
    * DAO injected by Spring that manages Tlp00002 entities
    *
    */
    @Autowired
    private ITlp00002DAO tlp00002DAO;

    /**
    * DAO injected by Spring that manages Tp000001 entities
    *
    */
    @Autowired
    private ITp000001DAO tp000001DAO;

    /**
    * DAO injected by Spring that manages Tr000004 entities
    *
    */
    @Autowired
    private ITr000004DAO tr000004DAO;

    public void validateTp000003(Tp000003 tp000003) throws Exception {
        try {
            Set<ConstraintViolation<Tp000003>> constraintViolations = validator.validate(tp000003);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tp000003> constraintViolation : constraintViolations) {
                    strMessage.append(constraintViolation.getPropertyPath()
                                                         .toString());
                    strMessage.append(" - ");
                    strMessage.append(constraintViolation.getMessage());
                    strMessage.append(". \n");
                }

                throw new Exception(strMessage.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000003> getTp000003() throws Exception {
        log.debug("finding all Tp000003 instances");

        List<Tp000003> list = new ArrayList<Tp000003>();

        try {
            list = tp000003DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tp000003 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tp000003");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTp000003(Tp000003 entity) throws Exception {
        log.debug("saving Tp000003 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000003");
            }

            validateTp000003(entity);

            if (getTp000003(entity.getCodEps()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tp000003DAO.save(entity);
            log.debug("save Tp000003 successful");
        } catch (Exception e) {
            log.error("save Tp000003 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTp000003(Tp000003 entity) throws Exception {
        log.debug("deleting Tp000003 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tp000003");
        }

        if (entity.getCodEps() == null) {
            throw new ZMessManager().new EmptyFieldException("codEps");
        }

        List<Tlp00002> tlp00002s = null;
        List<Tp000001> tp000001s = null;
        List<Tr000004> tr000004s = null;

        try {
            tlp00002s = tlp00002DAO.findByProperty("tp000003.codEps",
                    entity.getCodEps());

            if (Utilities.validationsList(tlp00002s) == true) {
                throw new ZMessManager().new DeletingException("tlp00002s");
            }

            tp000001s = tp000001DAO.findByProperty("tp000003.codEps",
                    entity.getCodEps());

            if (Utilities.validationsList(tp000001s) == true) {
                throw new ZMessManager().new DeletingException("tp000001s");
            }

            tr000004s = tr000004DAO.findByProperty("tp000003.codEps",
                    entity.getCodEps());

            if (Utilities.validationsList(tr000004s) == true) {
                throw new ZMessManager().new DeletingException("tr000004s");
            }

            tp000003DAO.deleteById(entity.getCodEps());
            log.debug("delete Tp000003 successful");
        } catch (Exception e) {
            log.error("delete Tp000003 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTp000003(Tp000003 entity) throws Exception {
        log.debug("updating Tp000003 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000003");
            }

            validateTp000003(entity);

            tp000003DAO.update(entity);

            log.debug("update Tp000003 successful");
        } catch (Exception e) {
            log.error("update Tp000003 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000003DTO> getDataTp000003() throws Exception {
        try {
            List<Tp000003> tp000003 = tp000003DAO.findAll();

            List<Tp000003DTO> tp000003DTO = new ArrayList<Tp000003DTO>();

            for (Tp000003 tp000003Tmp : tp000003) {
                Tp000003DTO tp000003DTO2 = tp000003Mapper.tp000003ToTp000003DTO(tp000003Tmp);
                tp000003DTO.add(tp000003DTO2);
            }

            return tp000003DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000003 getTp000003(String codEps) throws Exception {
        log.debug("getting Tp000003 instance");

        Tp000003 entity = null;

        try {
            entity = tp000003DAO.findById(codEps);
        } catch (Exception e) {
            log.error("get Tp000003 failed", e);
            throw new ZMessManager().new FindingException("Tp000003");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tp000003> findPageTp000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tp000003> entity = null;

        try {
            entity = tp000003DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000003 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTp000003() throws Exception {
        Long entity = null;

        try {
            entity = tp000003DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000003 Count");
        } finally {
        }

        return entity;
    }

    /**
    *
    * @param varibles
    *            este arreglo debera tener:
    *
    * [0] = String variable = (String) varibles[i]; representa como se llama la
    * variable en el pojo
    *
    * [1] = Boolean booVariable = (Boolean) varibles[i + 1]; representa si el
    * valor necesita o no ''(comillas simples)usado para campos de tipo string
    *
    * [2] = Object value = varibles[i + 2]; representa el valor que se va a
    * buscar en la BD
    *
    * [3] = String comparator = (String) varibles[i + 3]; representa que tipo
    * de busqueda voy a hacer.., ejemplo: where nombre=william o where nombre<>william,
        * en este campo iria el tipo de comparador que quiero si es = o <>
            *
            * Se itera de 4 en 4..., entonces 4 registros del arreglo representan 1
            * busqueda en un campo, si se ponen mas pues el continuara buscando en lo
            * que se le ingresen en los otros 4
            *
            *
            * @param variablesBetween
            *
            * la diferencia son estas dos posiciones
            *
            * [0] = String variable = (String) varibles[j]; la variable ne la BD que va
            * a ser buscada en un rango
            *
            * [1] = Object value = varibles[j + 1]; valor 1 para buscar en un rango
            *
            * [2] = Object value2 = varibles[j + 2]; valor 2 para buscar en un rango
            * ejempolo: a > 1 and a < 5 --> 1 seria value y 5 seria value2
                *
                * [3] = String comparator1 = (String) varibles[j + 3]; comparador 1
                * ejemplo: a comparator1 1 and a < 5
                    *
                    * [4] = String comparator2 = (String) varibles[j + 4]; comparador 2
                    * ejemplo: a comparador1>1  and a comparador2<5  (el original: a > 1 and a <
                            * 5) *
                            * @param variablesBetweenDates(en
                            *            este caso solo para mysql)
                            *  [0] = String variable = (String) varibles[k]; el nombre de la variable que hace referencia a
                            *            una fecha
                            *
                            * [1] = Object object1 = varibles[k + 2]; fecha 1 a comparar(deben ser
                            * dates)
                            *
                            * [2] = Object object2 = varibles[k + 3]; fecha 2 a comparar(deben ser
                            * dates)
                            *
                            * esto hace un between entre las dos fechas.
                            *
                            * @return lista con los objetos que se necesiten
                            * @throws Exception
                            */
    @Transactional(readOnly = true)
    public List<Tp000003> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tp000003> list = new ArrayList<Tp000003>();
        String where = new String();
        String tempWhere = new String();

        if (variables != null) {
            for (int i = 0; i < variables.length; i++) {
                if ((variables[i] != null) && (variables[i + 1] != null) &&
                        (variables[i + 2] != null) &&
                        (variables[i + 3] != null)) {
                    String variable = (String) variables[i];
                    Boolean booVariable = (Boolean) variables[i + 1];
                    Object value = variables[i + 2];
                    String comparator = (String) variables[i + 3];

                    if (booVariable.booleanValue()) {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " \'" +
                            value + "\' )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " \'" + value + "\' )");
                    } else {
                        tempWhere = (tempWhere.length() == 0)
                            ? ("(model." + variable + " " + comparator + " " +
                            value + " )")
                            : (tempWhere + " AND (model." + variable + " " +
                            comparator + " " + value + " )");
                    }
                }

                i = i + 3;
            }
        }

        if (variablesBetween != null) {
            for (int j = 0; j < variablesBetween.length; j++) {
                if ((variablesBetween[j] != null) &&
                        (variablesBetween[j + 1] != null) &&
                        (variablesBetween[j + 2] != null) &&
                        (variablesBetween[j + 3] != null) &&
                        (variablesBetween[j + 4] != null)) {
                    String variable = (String) variablesBetween[j];
                    Object value = variablesBetween[j + 1];
                    Object value2 = variablesBetween[j + 2];
                    String comparator1 = (String) variablesBetween[j + 3];
                    String comparator2 = (String) variablesBetween[j + 4];
                    tempWhere = (tempWhere.length() == 0)
                        ? ("(" + value + " " + comparator1 + " " + variable +
                        " and " + variable + " " + comparator2 + " " + value2 +
                        " )")
                        : (tempWhere + " AND (" + value + " " + comparator1 +
                        " " + variable + " and " + variable + " " +
                        comparator2 + " " + value2 + " )");
                }

                j = j + 4;
            }
        }

        if (variablesBetweenDates != null) {
            for (int k = 0; k < variablesBetweenDates.length; k++) {
                if ((variablesBetweenDates[k] != null) &&
                        (variablesBetweenDates[k + 1] != null) &&
                        (variablesBetweenDates[k + 2] != null)) {
                    String variable = (String) variablesBetweenDates[k];
                    Object object1 = variablesBetweenDates[k + 1];
                    Object object2 = variablesBetweenDates[k + 2];
                    String value = null;
                    String value2 = null;

                    try {
                        Date date1 = (Date) object1;
                        Date date2 = (Date) object2;
                        value = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date1);
                        value2 = Utilities.formatDateWithoutTimeInAStringForBetweenWhere(date2);
                    } catch (Exception e) {
                        list = null;
                        throw e;
                    }

                    tempWhere = (tempWhere.length() == 0)
                        ? ("(model." + variable + " between " + value +
                        " and " + value2 + ")")
                        : (tempWhere + " AND (model." + variable + " between " +
                        value + " and " + value2 + ")");
                }

                k = k + 2;
            }
        }

        if (tempWhere.length() == 0) {
            where = null;
        } else {
            where = "(" + tempWhere + ")";
        }

        try {
            list = tp000003DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
