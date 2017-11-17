package com.proyecto.control;

import com.dataaccess.dao.*;

import com.dto.mapper.ITp000001Mapper;

import com.exceptions.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000001DTO;

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
@Service("Tp000001Logic")
public class Tp000001Logic implements ITp000001Logic {
    private static final Logger log = LoggerFactory.getLogger(Tp000001Logic.class);

    /**
     * DAO injected by Spring that manages Tp000001 entities
     *
     */
    @Autowired
    private ITp000001DAO tp000001DAO;
    @Autowired
    private ITp000001Mapper tp000001Mapper;
    @Autowired
    private Validator validator;

    /**
    * Logic injected by Spring that manages Tg000002 entities
    *
    */
    @Autowired
    ITg000002Logic logicTg0000021;

    /**
    * Logic injected by Spring that manages Tg000012 entities
    *
    */
    @Autowired
    ITg000012Logic logicTg0000122;

    /**
    * Logic injected by Spring that manages Tg000013 entities
    *
    */
    @Autowired
    ITg000013Logic logicTg0000133;

    /**
    * Logic injected by Spring that manages Tg000019 entities
    *
    */
    @Autowired
    ITg000019Logic logicTg0000194;

    /**
    * Logic injected by Spring that manages Tg000028 entities
    *
    */
    @Autowired
    ITg000028Logic logicTg0000285;

    /**
    * Logic injected by Spring that manages Tg000029 entities
    *
    */
    @Autowired
    ITg000029Logic logicTg0000296;

    /**
    * Logic injected by Spring that manages Tp000003 entities
    *
    */
    @Autowired
    ITp000003Logic logicTp0000037;

    /**
    * Logic injected by Spring that manages Tp000004 entities
    *
    */
    @Autowired
    ITp000004Logic logicTp0000048;

    /**
    * Logic injected by Spring that manages Tp000005 entities
    *
    */
    @Autowired
    ITp000005Logic logicTp0000059;

    /**
    * Logic injected by Spring that manages Tp000006 entities
    *
    */
    @Autowired
    ITp000006Logic logicTp00000610;

    public void validateTp000001(Tp000001 tp000001) throws Exception {
        try {
            Set<ConstraintViolation<Tp000001>> constraintViolations = validator.validate(tp000001);

            if (constraintViolations.size() > 0) {
                StringBuilder strMessage = new StringBuilder();

                for (ConstraintViolation<Tp000001> constraintViolation : constraintViolations) {
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
    public List<Tp000001> getTp000001() throws Exception {
        log.debug("finding all Tp000001 instances");

        List<Tp000001> list = new ArrayList<Tp000001>();

        try {
            list = tp000001DAO.findAll();
        } catch (Exception e) {
            log.error("finding all Tp000001 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL +
                "Tp000001");
        } finally {
        }

        return list;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveTp000001(Tp000001 entity) throws Exception {
        log.debug("saving Tp000001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000001");
            }

            validateTp000001(entity);

            if (getTp000001(entity.getId()) != null) {
                throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tp000001DAO.save(entity);
            log.debug("save Tp000001 successful");
        } catch (Exception e) {
            log.error("save Tp000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void deleteTp000001(Tp000001 entity) throws Exception {
        log.debug("deleting Tp000001 instance");

        if (entity == null) {
            throw new ZMessManager().new NullEntityExcepcion("Tp000001");
        }

        if (entity.getId().getCodEmpresa() == null) {
            throw new ZMessManager().new EmptyFieldException("codEmpresa");
        }

        if (entity.getId().getCodEmpresaEmp() == null) {
            throw new ZMessManager().new EmptyFieldException("codEmpresaEmp");
        }

        try {
            tp000001DAO.deleteById(entity.getId());
            log.debug("delete Tp000001 successful");
        } catch (Exception e) {
            log.error("delete Tp000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void updateTp000001(Tp000001 entity) throws Exception {
        log.debug("updating Tp000001 instance");

        try {
            if (entity == null) {
                throw new ZMessManager().new NullEntityExcepcion("Tp000001");
            }

            validateTp000001(entity);

            tp000001DAO.update(entity);

            log.debug("update Tp000001 successful");
        } catch (Exception e) {
            log.error("update Tp000001 failed", e);
            throw e;
        } finally {
        }
    }

    @Transactional(readOnly = true)
    public List<Tp000001DTO> getDataTp000001() throws Exception {
        try {
            List<Tp000001> tp000001 = tp000001DAO.findAll();

            List<Tp000001DTO> tp000001DTO = new ArrayList<Tp000001DTO>();

            for (Tp000001 tp000001Tmp : tp000001) {
                Tp000001DTO tp000001DTO2 = tp000001Mapper.tp000001ToTp000001DTO(tp000001Tmp);
                tp000001DTO.add(tp000001DTO2);
            }

            return tp000001DTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Tp000001 getTp000001(Tp000001Id id) throws Exception {
        log.debug("getting Tp000001 instance");

        Tp000001 entity = null;

        try {
            entity = tp000001DAO.findById(id);
        } catch (Exception e) {
            log.error("get Tp000001 failed", e);
            throw new ZMessManager().new FindingException("Tp000001");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public List<Tp000001> findPageTp000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        List<Tp000001> entity = null;

        try {
            entity = tp000001DAO.findPage(sortColumnName, sortAscending,
                    startRow, maxResults);
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000001 Count");
        } finally {
        }

        return entity;
    }

    @Transactional(readOnly = true)
    public Long findTotalNumberTp000001() throws Exception {
        Long entity = null;

        try {
            entity = tp000001DAO.count();
        } catch (Exception e) {
            throw new ZMessManager().new FindingException("Tp000001 Count");
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
    public List<Tp000001> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        List<Tp000001> list = new ArrayList<Tp000001>();
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
            list = tp000001DAO.findByCriteria(where);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        } finally {
        }

        return list;
    }
}
