package com.proyecto.control;

import com.dataaccess.dao.*;

import com.dto.mapper.ITr000004Mapper;

import com.exceptions.*;

import com.proyecto.*;

import com.proyecto.dto.Tr000004DTO;

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
@Service("Tr000004Logic")
public class Tr000004Logic implements ITr000004Logic {
    private static final Logger log = LoggerFactory.getLogger(Tr000004Logic.class);

    /**
     * DAO injected by Spring that manages Tr000004 entities
     *
     */
    @Autowired
    private ITr000004DAO tr000004DAO;
    @Autowired
    private ITr000004Mapper tr000004Mapper;
    @Autowired
    private Validator validator;

    /**
    * Logic injected by Spring that manages Tg000003 entities
    *
    */
    @Autowired
    ITg000003Logic logicTg0000031;

    /**
    * Logic injected by Spring that manages Tp000003 entities
    *
    */
    @Autowired
    ITp000003Logic logicTp0000032;

    /**
    * Logic injected by Spring that manages Tp000004 entities
    *
    */
    @Autowired
    ITp000004Logic logicTp0000043;

    /**
    * Logic injected by Spring that manages Tp000005 entities
    *
    */
    @Autowired
    ITp000005Logic logicTp0000054;

    /**
    * Logic injected by Spring that manages Tp000006 entities
    *
    */
    @Autowired
    ITp000006Logic logicTp0000065;

    public void validateTr000004(Tr000004 tr000004) throws Exception {
        try {
            Set<ConstraintViolation<Tr000004>> constraintViolations = validator.validate(tr000004);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tr000004> constraintViolation : constraintViolations) {
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
    public List<Tr000004> getTr000004() throws Exception {
        log.debug("finding all Tr000004 instances");

        List<Tr000004> list = new ArrayList<Tr000004>();

        try {
            list = tr000004DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tr000004 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tr000004");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTr000004(Tr000004 entity) throws Exception {
        log.debug("saving Tr000004 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tr000004");
            }

            validateTr000004(entity);

            if (getTr000004(entity.getId()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tr000004DAO.save(entity);
            log.debug("save Tr000004 successful");
        } catch (Exception e) {
            log.error("save Tr000004 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTr000004(Tr000004 entity) throws Exception {
        log.debug("deleting Tr000004 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tr000004");
        }

        if (entity.getId().getConsecutivo() == null) {
            throw new ZMessManager().new EmptyFieldException("consecutivo");
        }

        if (entity.getId().getCodEmpresa() == null) {
            throw new ZMessManager().new EmptyFieldException("codEmpresa");
        }

        try {
            tr000004DAO.deleteById(entity.getId());
            log.debug("delete Tr000004 successful");
        } catch (Exception e) {
            log.error("delete Tr000004 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTr000004(Tr000004 entity) throws Exception {
        log.debug("updating Tr000004 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tr000004");
            }

            validateTr000004(entity);

            tr000004DAO.update(entity);

            log.debug("update Tr000004 successful");
        } catch (Exception e) {
            log.error("update Tr000004 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tr000004DTO> getDataTr000004() throws Exception {
        try {
            List<Tr000004> tr000004 = tr000004DAO.findAll();

            List<Tr000004DTO> tr000004DTO = new ArrayList<Tr000004DTO>();

            for (Tr000004 tr000004Tmp : tr000004) {
                Tr000004DTO tr000004DTO2 = tr000004Mapper.tr000004ToTr000004DTO(tr000004Tmp);
                tr000004DTO.add(tr000004DTO2);
            }

            return tr000004DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tr000004 getTr000004(Tr000004Id id) throws Exception {
        log.debug("getting Tr000004 instance");

        Tr000004 entity = null;

        try {
            entity = tr000004DAO.findById(id);
        } catch (Exception e) {
            log.error("get Tr000004 failed", e);
            throw new ZMessManager().new FindingException("Tr000004");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tr000004> findPageTr000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tr000004> entity = null;

        try {
            entity = tr000004DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tr000004 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTr000004() throws Exception {
        Long entity = null;

        try {
            entity = tr000004DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tr000004 Count");
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
    public List<Tr000004> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tr000004> list = new ArrayList<Tr000004>();
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
            list = tr000004DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
