package com.presentation.businessDelegate;

import com.presentation.businessDelegate.IBusinessDelegatorView;

import com.proyecto.Tg000001;
import com.proyecto.Tg000002;
import com.proyecto.Tg000003;
import com.proyecto.Tg000004;
import com.proyecto.Tg000006;
import com.proyecto.Tg000008;
import com.proyecto.Tg000008Id;
import com.proyecto.Tg000010;
import com.proyecto.Tg000010Id;
import com.proyecto.Tg000011;
import com.proyecto.Tg000011Id;
import com.proyecto.Tg000012;
import com.proyecto.Tg000013;
import com.proyecto.Tg000019;
import com.proyecto.Tg000026;
import com.proyecto.Tg000028;
import com.proyecto.Tg000029;
import com.proyecto.Tlp00001;
import com.proyecto.Tlp00001Id;
import com.proyecto.Tlp00002;
import com.proyecto.Tlp00002Id;
import com.proyecto.Tlp00003;
import com.proyecto.Tlp00003Id;
import com.proyecto.Tp000001;
import com.proyecto.Tp000001Id;
import com.proyecto.Tp000003;
import com.proyecto.Tp000004;
import com.proyecto.Tp000005;
import com.proyecto.Tp000006;
import com.proyecto.Tr000004;
import com.proyecto.Tr000004Id;

import com.proyecto.control.ITg000001Logic;
import com.proyecto.control.ITg000002Logic;
import com.proyecto.control.ITg000003Logic;
import com.proyecto.control.ITg000004Logic;
import com.proyecto.control.ITg000006Logic;
import com.proyecto.control.ITg000008Logic;
import com.proyecto.control.ITg000010Logic;
import com.proyecto.control.ITg000011Logic;
import com.proyecto.control.ITg000012Logic;
import com.proyecto.control.ITg000013Logic;
import com.proyecto.control.ITg000019Logic;
import com.proyecto.control.ITg000026Logic;
import com.proyecto.control.ITg000028Logic;
import com.proyecto.control.ITg000029Logic;
import com.proyecto.control.ITlp00001Logic;
import com.proyecto.control.ITlp00002Logic;
import com.proyecto.control.ITlp00003Logic;
import com.proyecto.control.ITp000001Logic;
import com.proyecto.control.ITp000003Logic;
import com.proyecto.control.ITp000004Logic;
import com.proyecto.control.ITp000005Logic;
import com.proyecto.control.ITp000006Logic;
import com.proyecto.control.ITr000004Logic;
import com.proyecto.control.Tg000001Logic;
import com.proyecto.control.Tg000002Logic;
import com.proyecto.control.Tg000003Logic;
import com.proyecto.control.Tg000004Logic;
import com.proyecto.control.Tg000006Logic;
import com.proyecto.control.Tg000008Logic;
import com.proyecto.control.Tg000010Logic;
import com.proyecto.control.Tg000011Logic;
import com.proyecto.control.Tg000012Logic;
import com.proyecto.control.Tg000013Logic;
import com.proyecto.control.Tg000019Logic;
import com.proyecto.control.Tg000026Logic;
import com.proyecto.control.Tg000028Logic;
import com.proyecto.control.Tg000029Logic;
import com.proyecto.control.Tlp00001Logic;
import com.proyecto.control.Tlp00002Logic;
import com.proyecto.control.Tlp00003Logic;
import com.proyecto.control.Tp000001Logic;
import com.proyecto.control.Tp000003Logic;
import com.proyecto.control.Tp000004Logic;
import com.proyecto.control.Tp000005Logic;
import com.proyecto.control.Tp000006Logic;
import com.proyecto.control.Tr000004Logic;

import com.proyecto.dto.Tg000001DTO;
import com.proyecto.dto.Tg000002DTO;
import com.proyecto.dto.Tg000003DTO;
import com.proyecto.dto.Tg000004DTO;
import com.proyecto.dto.Tg000006DTO;
import com.proyecto.dto.Tg000008DTO;
import com.proyecto.dto.Tg000010DTO;
import com.proyecto.dto.Tg000011DTO;
import com.proyecto.dto.Tg000012DTO;
import com.proyecto.dto.Tg000013DTO;
import com.proyecto.dto.Tg000019DTO;
import com.proyecto.dto.Tg000026DTO;
import com.proyecto.dto.Tg000028DTO;
import com.proyecto.dto.Tg000029DTO;
import com.proyecto.dto.Tlp00001DTO;
import com.proyecto.dto.Tlp00002DTO;
import com.proyecto.dto.Tlp00003DTO;
import com.proyecto.dto.Tp000001DTO;
import com.proyecto.dto.Tp000003DTO;
import com.proyecto.dto.Tp000004DTO;
import com.proyecto.dto.Tp000005DTO;
import com.proyecto.dto.Tp000006DTO;
import com.proyecto.dto.Tr000004DTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.sql.*;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* Use a Business Delegate to reduce coupling between presentation-tier clients and business services.
* The Business Delegate hides the underlying implementation details of the business service, such as lookup and access details of the EJB architecture.
*
* The Business Delegate acts as a client-side business abstraction; it provides an abstraction for, and thus hides,
* the implementation of the business services. Using a Business Delegate reduces the coupling between presentation-tier clients and
* the system's business services. Depending on the implementation strategy, the Business Delegate may shield clients from possible
* volatility in the implementation of the business service API. Potentially, this reduces the number of changes that must be made to the
* presentation-tier client code when the business service API or its underlying implementation changes.
*
* However, interface methods in the Business Delegate may still require modification if the underlying business service API changes.
* Admittedly, though, it is more likely that changes will be made to the business service rather than to the Business Delegate.
*
* Often, developers are skeptical when a design goal such as abstracting the business layer causes additional upfront work in return
* for future gains. However, using this pattern or its strategies results in only a small amount of additional upfront work and provides
* considerable benefits. The main benefit is hiding the details of the underlying service. For example, the client can become transparent
* to naming and lookup services. The Business Delegate also handles the exceptions from the business services, such as java.rmi.Remote
* exceptions, Java Messages Service (JMS) exceptions and so on. The Business Delegate may intercept such service level exceptions and
* generate application level exceptions instead. Application level exceptions are easier to handle by the clients, and may be user friendly.
* The Business Delegate may also transparently perform any retry or recovery operations necessary in the event of a service failure without
* exposing the client to the problem until it is determined that the problem is not resolvable. These gains present a compelling reason to
* use the pattern.
*
* Another benefit is that the delegate may cache results and references to remote business services. Caching can significantly improve performance,
* because it limits unnecessary and potentially costly round trips over the network.
*
* A Business Delegate uses a component called the Lookup Service. The Lookup Service is responsible for hiding the underlying implementation
* details of the business service lookup code. The Lookup Service may be written as part of the Delegate, but we recommend that it be
* implemented as a separate component, as outlined in the Service Locator pattern (See "Service Locator" on page 368.)
*
* When the Business Delegate is used with a Session Facade, typically there is a one-to-one relationship between the two.
* This one-to-one relationship exists because logic that might have been encapsulated in a Business Delegate relating to its interaction
* with multiple business services (creating a one-to-many relationship) will often be factored back into a Session Facade.
*
* Finally, it should be noted that this pattern could be used to reduce coupling between other tiers, not simply the presentation and the
* business tiers.
*
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("BusinessDelegatorView")
public class BusinessDelegatorView implements IBusinessDelegatorView {
    private static final Logger log = LoggerFactory.getLogger(BusinessDelegatorView.class);
    @Autowired
    private ITg000001Logic tg000001Logic;
    @Autowired
    private ITg000002Logic tg000002Logic;
    @Autowired
    private ITg000003Logic tg000003Logic;
    @Autowired
    private ITg000004Logic tg000004Logic;
    @Autowired
    private ITg000006Logic tg000006Logic;
    @Autowired
    private ITg000008Logic tg000008Logic;
    @Autowired
    private ITg000010Logic tg000010Logic;
    @Autowired
    private ITg000011Logic tg000011Logic;
    @Autowired
    private ITg000012Logic tg000012Logic;
    @Autowired
    private ITg000013Logic tg000013Logic;
    @Autowired
    private ITg000019Logic tg000019Logic;
    @Autowired
    private ITg000026Logic tg000026Logic;
    @Autowired
    private ITg000028Logic tg000028Logic;
    @Autowired
    private ITg000029Logic tg000029Logic;
    @Autowired
    private ITlp00001Logic tlp00001Logic;
    @Autowired
    private ITlp00002Logic tlp00002Logic;
    @Autowired
    private ITlp00003Logic tlp00003Logic;
    @Autowired
    private ITp000001Logic tp000001Logic;
    @Autowired
    private ITp000003Logic tp000003Logic;
    @Autowired
    private ITp000004Logic tp000004Logic;
    @Autowired
    private ITp000005Logic tp000005Logic;
    @Autowired
    private ITp000006Logic tp000006Logic;
    @Autowired
    private ITr000004Logic tr000004Logic;

    public List<Tg000001> getTg000001() throws Exception {
        return tg000001Logic.getTg000001();
    }

    public void saveTg000001(Tg000001 entity) throws Exception {
        tg000001Logic.saveTg000001(entity);
    }

    public void deleteTg000001(Tg000001 entity) throws Exception {
        tg000001Logic.deleteTg000001(entity);
    }

    public void updateTg000001(Tg000001 entity) throws Exception {
        tg000001Logic.updateTg000001(entity);
    }

    public Tg000001 getTg000001(String codBanco) throws Exception {
        Tg000001 tg000001 = null;

        try {
            tg000001 = tg000001Logic.getTg000001(codBanco);
        } catch (Exception e) {
            throw e;
        }

        return tg000001;
    }

    public List<Tg000001> findByCriteriaInTg000001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000001Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000001> findPageTg000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000001Logic.findPageTg000001(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000001() throws Exception {
        return tg000001Logic.findTotalNumberTg000001();
    }

    public List<Tg000001DTO> getDataTg000001() throws Exception {
        return tg000001Logic.getDataTg000001();
    }

    public void validateTg000001(Tg000001 tg000001) throws Exception {
        tg000001Logic.validateTg000001(tg000001);
    }

    public List<Tg000002> getTg000002() throws Exception {
        return tg000002Logic.getTg000002();
    }

    public void saveTg000002(Tg000002 entity) throws Exception {
        tg000002Logic.saveTg000002(entity);
    }

    public void deleteTg000002(Tg000002 entity) throws Exception {
        tg000002Logic.deleteTg000002(entity);
    }

    public void updateTg000002(Tg000002 entity) throws Exception {
        tg000002Logic.updateTg000002(entity);
    }

    public Tg000002 getTg000002(String codCiudad) throws Exception {
        Tg000002 tg000002 = null;

        try {
            tg000002 = tg000002Logic.getTg000002(codCiudad);
        } catch (Exception e) {
            throw e;
        }

        return tg000002;
    }

    public List<Tg000002> findByCriteriaInTg000002(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000002Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000002> findPageTg000002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000002Logic.findPageTg000002(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000002() throws Exception {
        return tg000002Logic.findTotalNumberTg000002();
    }

    public List<Tg000002DTO> getDataTg000002() throws Exception {
        return tg000002Logic.getDataTg000002();
    }

    public void validateTg000002(Tg000002 tg000002) throws Exception {
        tg000002Logic.validateTg000002(tg000002);
    }

    public List<Tg000003> getTg000003() throws Exception {
        return tg000003Logic.getTg000003();
    }

    public void saveTg000003(Tg000003 entity) throws Exception {
        tg000003Logic.saveTg000003(entity);
    }

    public void deleteTg000003(Tg000003 entity) throws Exception {
        tg000003Logic.deleteTg000003(entity);
    }

    public void updateTg000003(Tg000003 entity) throws Exception {
        tg000003Logic.updateTg000003(entity);
    }

    public Tg000003 getTg000003(String codEmpresa) throws Exception {
        Tg000003 tg000003 = null;

        try {
            tg000003 = tg000003Logic.getTg000003(codEmpresa);
        } catch (Exception e) {
            throw e;
        }

        return tg000003;
    }

    public List<Tg000003> findByCriteriaInTg000003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000003Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000003> findPageTg000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000003Logic.findPageTg000003(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000003() throws Exception {
        return tg000003Logic.findTotalNumberTg000003();
    }

    public List<Tg000003DTO> getDataTg000003() throws Exception {
        return tg000003Logic.getDataTg000003();
    }

    public void validateTg000003(Tg000003 tg000003) throws Exception {
        tg000003Logic.validateTg000003(tg000003);
    }

    public List<Tg000004> getTg000004() throws Exception {
        return tg000004Logic.getTg000004();
    }

    public void saveTg000004(Tg000004 entity) throws Exception {
        tg000004Logic.saveTg000004(entity);
    }

    public void deleteTg000004(Tg000004 entity) throws Exception {
        tg000004Logic.deleteTg000004(entity);
    }

    public void updateTg000004(Tg000004 entity) throws Exception {
        tg000004Logic.updateTg000004(entity);
    }

    public Tg000004 getTg000004(String codDepto) throws Exception {
        Tg000004 tg000004 = null;

        try {
            tg000004 = tg000004Logic.getTg000004(codDepto);
        } catch (Exception e) {
            throw e;
        }

        return tg000004;
    }

    public List<Tg000004> findByCriteriaInTg000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000004Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000004> findPageTg000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000004Logic.findPageTg000004(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000004() throws Exception {
        return tg000004Logic.findTotalNumberTg000004();
    }

    public List<Tg000004DTO> getDataTg000004() throws Exception {
        return tg000004Logic.getDataTg000004();
    }

    public void validateTg000004(Tg000004 tg000004) throws Exception {
        tg000004Logic.validateTg000004(tg000004);
    }

    public List<Tg000006> getTg000006() throws Exception {
        return tg000006Logic.getTg000006();
    }

    public void saveTg000006(Tg000006 entity) throws Exception {
        tg000006Logic.saveTg000006(entity);
    }

    public void deleteTg000006(Tg000006 entity) throws Exception {
        tg000006Logic.deleteTg000006(entity);
    }

    public void updateTg000006(Tg000006 entity) throws Exception {
        tg000006Logic.updateTg000006(entity);
    }

    public Tg000006 getTg000006(String codCargo) throws Exception {
        Tg000006 tg000006 = null;

        try {
            tg000006 = tg000006Logic.getTg000006(codCargo);
        } catch (Exception e) {
            throw e;
        }

        return tg000006;
    }

    public List<Tg000006> findByCriteriaInTg000006(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000006Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000006> findPageTg000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000006Logic.findPageTg000006(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000006() throws Exception {
        return tg000006Logic.findTotalNumberTg000006();
    }

    public List<Tg000006DTO> getDataTg000006() throws Exception {
        return tg000006Logic.getDataTg000006();
    }

    public void validateTg000006(Tg000006 tg000006) throws Exception {
        tg000006Logic.validateTg000006(tg000006);
    }

    public List<Tg000008> getTg000008() throws Exception {
        return tg000008Logic.getTg000008();
    }

    public void saveTg000008(Tg000008 entity) throws Exception {
        tg000008Logic.saveTg000008(entity);
    }

    public void deleteTg000008(Tg000008 entity) throws Exception {
        tg000008Logic.deleteTg000008(entity);
    }

    public void updateTg000008(Tg000008 entity) throws Exception {
        tg000008Logic.updateTg000008(entity);
    }

    public Tg000008 getTg000008(Tg000008Id id) throws Exception {
        Tg000008 tg000008 = null;

        try {
            tg000008 = tg000008Logic.getTg000008(id);
        } catch (Exception e) {
            throw e;
        }

        return tg000008;
    }

    public List<Tg000008> findByCriteriaInTg000008(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000008Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000008> findPageTg000008(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000008Logic.findPageTg000008(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000008() throws Exception {
        return tg000008Logic.findTotalNumberTg000008();
    }

    public List<Tg000008DTO> getDataTg000008() throws Exception {
        return tg000008Logic.getDataTg000008();
    }

    public void validateTg000008(Tg000008 tg000008) throws Exception {
        tg000008Logic.validateTg000008(tg000008);
    }

    public List<Tg000010> getTg000010() throws Exception {
        return tg000010Logic.getTg000010();
    }

    public void saveTg000010(Tg000010 entity) throws Exception {
        tg000010Logic.saveTg000010(entity);
    }

    public void deleteTg000010(Tg000010 entity) throws Exception {
        tg000010Logic.deleteTg000010(entity);
    }

    public void updateTg000010(Tg000010 entity) throws Exception {
        tg000010Logic.updateTg000010(entity);
    }

    public Tg000010 getTg000010(Tg000010Id id) throws Exception {
        Tg000010 tg000010 = null;

        try {
            tg000010 = tg000010Logic.getTg000010(id);
        } catch (Exception e) {
            throw e;
        }

        return tg000010;
    }

    public List<Tg000010> findByCriteriaInTg000010(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000010Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000010> findPageTg000010(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000010Logic.findPageTg000010(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000010() throws Exception {
        return tg000010Logic.findTotalNumberTg000010();
    }

    public List<Tg000010DTO> getDataTg000010() throws Exception {
        return tg000010Logic.getDataTg000010();
    }

    public void validateTg000010(Tg000010 tg000010) throws Exception {
        tg000010Logic.validateTg000010(tg000010);
    }

    public List<Tg000011> getTg000011() throws Exception {
        return tg000011Logic.getTg000011();
    }

    public void saveTg000011(Tg000011 entity) throws Exception {
        tg000011Logic.saveTg000011(entity);
    }

    public void deleteTg000011(Tg000011 entity) throws Exception {
        tg000011Logic.deleteTg000011(entity);
    }

    public void updateTg000011(Tg000011 entity) throws Exception {
        tg000011Logic.updateTg000011(entity);
    }

    public Tg000011 getTg000011(Tg000011Id id) throws Exception {
        Tg000011 tg000011 = null;

        try {
            tg000011 = tg000011Logic.getTg000011(id);
        } catch (Exception e) {
            throw e;
        }

        return tg000011;
    }

    public List<Tg000011> findByCriteriaInTg000011(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000011Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000011> findPageTg000011(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000011Logic.findPageTg000011(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000011() throws Exception {
        return tg000011Logic.findTotalNumberTg000011();
    }

    public List<Tg000011DTO> getDataTg000011() throws Exception {
        return tg000011Logic.getDataTg000011();
    }

    public void validateTg000011(Tg000011 tg000011) throws Exception {
        tg000011Logic.validateTg000011(tg000011);
    }

    public List<Tg000012> getTg000012() throws Exception {
        return tg000012Logic.getTg000012();
    }

    public void saveTg000012(Tg000012 entity) throws Exception {
        tg000012Logic.saveTg000012(entity);
    }

    public void deleteTg000012(Tg000012 entity) throws Exception {
        tg000012Logic.deleteTg000012(entity);
    }

    public void updateTg000012(Tg000012 entity) throws Exception {
        tg000012Logic.updateTg000012(entity);
    }

    public Tg000012 getTg000012(String codProfesion) throws Exception {
        Tg000012 tg000012 = null;

        try {
            tg000012 = tg000012Logic.getTg000012(codProfesion);
        } catch (Exception e) {
            throw e;
        }

        return tg000012;
    }

    public List<Tg000012> findByCriteriaInTg000012(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000012Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000012> findPageTg000012(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000012Logic.findPageTg000012(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000012() throws Exception {
        return tg000012Logic.findTotalNumberTg000012();
    }

    public List<Tg000012DTO> getDataTg000012() throws Exception {
        return tg000012Logic.getDataTg000012();
    }

    public void validateTg000012(Tg000012 tg000012) throws Exception {
        tg000012Logic.validateTg000012(tg000012);
    }

    public List<Tg000013> getTg000013() throws Exception {
        return tg000013Logic.getTg000013();
    }

    public void saveTg000013(Tg000013 entity) throws Exception {
        tg000013Logic.saveTg000013(entity);
    }

    public void deleteTg000013(Tg000013 entity) throws Exception {
        tg000013Logic.deleteTg000013(entity);
    }

    public void updateTg000013(Tg000013 entity) throws Exception {
        tg000013Logic.updateTg000013(entity);
    }

    public Tg000013 getTg000013(String codActividad) throws Exception {
        Tg000013 tg000013 = null;

        try {
            tg000013 = tg000013Logic.getTg000013(codActividad);
        } catch (Exception e) {
            throw e;
        }

        return tg000013;
    }

    public List<Tg000013> findByCriteriaInTg000013(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000013Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000013> findPageTg000013(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000013Logic.findPageTg000013(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000013() throws Exception {
        return tg000013Logic.findTotalNumberTg000013();
    }

    public List<Tg000013DTO> getDataTg000013() throws Exception {
        return tg000013Logic.getDataTg000013();
    }

    public void validateTg000013(Tg000013 tg000013) throws Exception {
        tg000013Logic.validateTg000013(tg000013);
    }

    public List<Tg000019> getTg000019() throws Exception {
        return tg000019Logic.getTg000019();
    }

    public void saveTg000019(Tg000019 entity) throws Exception {
        tg000019Logic.saveTg000019(entity);
    }

    public void deleteTg000019(Tg000019 entity) throws Exception {
        tg000019Logic.deleteTg000019(entity);
    }

    public void updateTg000019(Tg000019 entity) throws Exception {
        tg000019Logic.updateTg000019(entity);
    }

    public Tg000019 getTg000019(String codIdentidad) throws Exception {
        Tg000019 tg000019 = null;

        try {
            tg000019 = tg000019Logic.getTg000019(codIdentidad);
        } catch (Exception e) {
            throw e;
        }

        return tg000019;
    }

    public List<Tg000019> findByCriteriaInTg000019(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000019Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000019> findPageTg000019(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000019Logic.findPageTg000019(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000019() throws Exception {
        return tg000019Logic.findTotalNumberTg000019();
    }

    public List<Tg000019DTO> getDataTg000019() throws Exception {
        return tg000019Logic.getDataTg000019();
    }

    public void validateTg000019(Tg000019 tg000019) throws Exception {
        tg000019Logic.validateTg000019(tg000019);
    }

    public List<Tg000026> getTg000026() throws Exception {
        return tg000026Logic.getTg000026();
    }

    public void saveTg000026(Tg000026 entity) throws Exception {
        tg000026Logic.saveTg000026(entity);
    }

    public void deleteTg000026(Tg000026 entity) throws Exception {
        tg000026Logic.deleteTg000026(entity);
    }

    public void updateTg000026(Tg000026 entity) throws Exception {
        tg000026Logic.updateTg000026(entity);
    }

    public Tg000026 getTg000026(String codTipodePlanillas)
        throws Exception {
        Tg000026 tg000026 = null;

        try {
            tg000026 = tg000026Logic.getTg000026(codTipodePlanillas);
        } catch (Exception e) {
            throw e;
        }

        return tg000026;
    }

    public List<Tg000026> findByCriteriaInTg000026(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000026Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000026> findPageTg000026(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000026Logic.findPageTg000026(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000026() throws Exception {
        return tg000026Logic.findTotalNumberTg000026();
    }

    public List<Tg000026DTO> getDataTg000026() throws Exception {
        return tg000026Logic.getDataTg000026();
    }

    public void validateTg000026(Tg000026 tg000026) throws Exception {
        tg000026Logic.validateTg000026(tg000026);
    }

    public List<Tg000028> getTg000028() throws Exception {
        return tg000028Logic.getTg000028();
    }

    public void saveTg000028(Tg000028 entity) throws Exception {
        tg000028Logic.saveTg000028(entity);
    }

    public void deleteTg000028(Tg000028 entity) throws Exception {
        tg000028Logic.deleteTg000028(entity);
    }

    public void updateTg000028(Tg000028 entity) throws Exception {
        tg000028Logic.updateTg000028(entity);
    }

    public Tg000028 getTg000028(String codTipoCotizante)
        throws Exception {
        Tg000028 tg000028 = null;

        try {
            tg000028 = tg000028Logic.getTg000028(codTipoCotizante);
        } catch (Exception e) {
            throw e;
        }

        return tg000028;
    }

    public List<Tg000028> findByCriteriaInTg000028(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000028Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000028> findPageTg000028(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000028Logic.findPageTg000028(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000028() throws Exception {
        return tg000028Logic.findTotalNumberTg000028();
    }

    public List<Tg000028DTO> getDataTg000028() throws Exception {
        return tg000028Logic.getDataTg000028();
    }

    public void validateTg000028(Tg000028 tg000028) throws Exception {
        tg000028Logic.validateTg000028(tg000028);
    }

    public List<Tg000029> getTg000029() throws Exception {
        return tg000029Logic.getTg000029();
    }

    public void saveTg000029(Tg000029 entity) throws Exception {
        tg000029Logic.saveTg000029(entity);
    }

    public void deleteTg000029(Tg000029 entity) throws Exception {
        tg000029Logic.deleteTg000029(entity);
    }

    public void updateTg000029(Tg000029 entity) throws Exception {
        tg000029Logic.updateTg000029(entity);
    }

    public Tg000029 getTg000029(String codSubTipoCotizante)
        throws Exception {
        Tg000029 tg000029 = null;

        try {
            tg000029 = tg000029Logic.getTg000029(codSubTipoCotizante);
        } catch (Exception e) {
            throw e;
        }

        return tg000029;
    }

    public List<Tg000029> findByCriteriaInTg000029(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tg000029Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tg000029> findPageTg000029(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tg000029Logic.findPageTg000029(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTg000029() throws Exception {
        return tg000029Logic.findTotalNumberTg000029();
    }

    public List<Tg000029DTO> getDataTg000029() throws Exception {
        return tg000029Logic.getDataTg000029();
    }

    public void validateTg000029(Tg000029 tg000029) throws Exception {
        tg000029Logic.validateTg000029(tg000029);
    }

    public List<Tlp00001> getTlp00001() throws Exception {
        return tlp00001Logic.getTlp00001();
    }

    public void saveTlp00001(Tlp00001 entity) throws Exception {
        tlp00001Logic.saveTlp00001(entity);
    }

    public void deleteTlp00001(Tlp00001 entity) throws Exception {
        tlp00001Logic.deleteTlp00001(entity);
    }

    public void updateTlp00001(Tlp00001 entity) throws Exception {
        tlp00001Logic.updateTlp00001(entity);
    }

    public Tlp00001 getTlp00001(Tlp00001Id id) throws Exception {
        Tlp00001 tlp00001 = null;

        try {
            tlp00001 = tlp00001Logic.getTlp00001(id);
        } catch (Exception e) {
            throw e;
        }

        return tlp00001;
    }

    public List<Tlp00001> findByCriteriaInTlp00001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tlp00001Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tlp00001> findPageTlp00001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tlp00001Logic.findPageTlp00001(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTlp00001() throws Exception {
        return tlp00001Logic.findTotalNumberTlp00001();
    }

    public List<Tlp00001DTO> getDataTlp00001() throws Exception {
        return tlp00001Logic.getDataTlp00001();
    }

    public void validateTlp00001(Tlp00001 tlp00001) throws Exception {
        tlp00001Logic.validateTlp00001(tlp00001);
    }

    public List<Tlp00002> getTlp00002() throws Exception {
        return tlp00002Logic.getTlp00002();
    }

    public void saveTlp00002(Tlp00002 entity) throws Exception {
        tlp00002Logic.saveTlp00002(entity);
    }

    public void deleteTlp00002(Tlp00002 entity) throws Exception {
        tlp00002Logic.deleteTlp00002(entity);
    }

    public void updateTlp00002(Tlp00002 entity) throws Exception {
        tlp00002Logic.updateTlp00002(entity);
    }

    public Tlp00002 getTlp00002(Tlp00002Id id) throws Exception {
        Tlp00002 tlp00002 = null;

        try {
            tlp00002 = tlp00002Logic.getTlp00002(id);
        } catch (Exception e) {
            throw e;
        }

        return tlp00002;
    }

    public List<Tlp00002> findByCriteriaInTlp00002(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tlp00002Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tlp00002> findPageTlp00002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tlp00002Logic.findPageTlp00002(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTlp00002() throws Exception {
        return tlp00002Logic.findTotalNumberTlp00002();
    }

    public List<Tlp00002DTO> getDataTlp00002() throws Exception {
        return tlp00002Logic.getDataTlp00002();
    }

    public void validateTlp00002(Tlp00002 tlp00002) throws Exception {
        tlp00002Logic.validateTlp00002(tlp00002);
    }

    public List<Tlp00003> getTlp00003() throws Exception {
        return tlp00003Logic.getTlp00003();
    }

    public void saveTlp00003(Tlp00003 entity) throws Exception {
        tlp00003Logic.saveTlp00003(entity);
    }

    public void deleteTlp00003(Tlp00003 entity) throws Exception {
        tlp00003Logic.deleteTlp00003(entity);
    }

    public void updateTlp00003(Tlp00003 entity) throws Exception {
        tlp00003Logic.updateTlp00003(entity);
    }

    public Tlp00003 getTlp00003(Tlp00003Id id) throws Exception {
        Tlp00003 tlp00003 = null;

        try {
            tlp00003 = tlp00003Logic.getTlp00003(id);
        } catch (Exception e) {
            throw e;
        }

        return tlp00003;
    }

    public List<Tlp00003> findByCriteriaInTlp00003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tlp00003Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tlp00003> findPageTlp00003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tlp00003Logic.findPageTlp00003(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTlp00003() throws Exception {
        return tlp00003Logic.findTotalNumberTlp00003();
    }

    public List<Tlp00003DTO> getDataTlp00003() throws Exception {
        return tlp00003Logic.getDataTlp00003();
    }

    public void validateTlp00003(Tlp00003 tlp00003) throws Exception {
        tlp00003Logic.validateTlp00003(tlp00003);
    }

    public List<Tp000001> getTp000001() throws Exception {
        return tp000001Logic.getTp000001();
    }

    public void saveTp000001(Tp000001 entity) throws Exception {
        tp000001Logic.saveTp000001(entity);
    }

    public void deleteTp000001(Tp000001 entity) throws Exception {
        tp000001Logic.deleteTp000001(entity);
    }

    public void updateTp000001(Tp000001 entity) throws Exception {
        tp000001Logic.updateTp000001(entity);
    }

    public Tp000001 getTp000001(Tp000001Id id) throws Exception {
        Tp000001 tp000001 = null;

        try {
            tp000001 = tp000001Logic.getTp000001(id);
        } catch (Exception e) {
            throw e;
        }

        return tp000001;
    }

    public List<Tp000001> findByCriteriaInTp000001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tp000001Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tp000001> findPageTp000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tp000001Logic.findPageTp000001(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTp000001() throws Exception {
        return tp000001Logic.findTotalNumberTp000001();
    }

    public List<Tp000001DTO> getDataTp000001() throws Exception {
        return tp000001Logic.getDataTp000001();
    }

    public void validateTp000001(Tp000001 tp000001) throws Exception {
        tp000001Logic.validateTp000001(tp000001);
    }

    public List<Tp000003> getTp000003() throws Exception {
        return tp000003Logic.getTp000003();
    }

    public void saveTp000003(Tp000003 entity) throws Exception {
        tp000003Logic.saveTp000003(entity);
    }

    public void deleteTp000003(Tp000003 entity) throws Exception {
        tp000003Logic.deleteTp000003(entity);
    }

    public void updateTp000003(Tp000003 entity) throws Exception {
        tp000003Logic.updateTp000003(entity);
    }

    public Tp000003 getTp000003(String codEps) throws Exception {
        Tp000003 tp000003 = null;

        try {
            tp000003 = tp000003Logic.getTp000003(codEps);
        } catch (Exception e) {
            throw e;
        }

        return tp000003;
    }

    public List<Tp000003> findByCriteriaInTp000003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tp000003Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tp000003> findPageTp000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tp000003Logic.findPageTp000003(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTp000003() throws Exception {
        return tp000003Logic.findTotalNumberTp000003();
    }

    public List<Tp000003DTO> getDataTp000003() throws Exception {
        return tp000003Logic.getDataTp000003();
    }

    public void validateTp000003(Tp000003 tp000003) throws Exception {
        tp000003Logic.validateTp000003(tp000003);
    }

    public List<Tp000004> getTp000004() throws Exception {
        return tp000004Logic.getTp000004();
    }

    public void saveTp000004(Tp000004 entity) throws Exception {
        tp000004Logic.saveTp000004(entity);
    }

    public void deleteTp000004(Tp000004 entity) throws Exception {
        tp000004Logic.deleteTp000004(entity);
    }

    public void updateTp000004(Tp000004 entity) throws Exception {
        tp000004Logic.updateTp000004(entity);
    }

    public Tp000004 getTp000004(String codArp) throws Exception {
        Tp000004 tp000004 = null;

        try {
            tp000004 = tp000004Logic.getTp000004(codArp);
        } catch (Exception e) {
            throw e;
        }

        return tp000004;
    }

    public List<Tp000004> findByCriteriaInTp000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tp000004Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tp000004> findPageTp000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tp000004Logic.findPageTp000004(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTp000004() throws Exception {
        return tp000004Logic.findTotalNumberTp000004();
    }

    public List<Tp000004DTO> getDataTp000004() throws Exception {
        return tp000004Logic.getDataTp000004();
    }

    public void validateTp000004(Tp000004 tp000004) throws Exception {
        tp000004Logic.validateTp000004(tp000004);
    }

    public List<Tp000005> getTp000005() throws Exception {
        return tp000005Logic.getTp000005();
    }

    public void saveTp000005(Tp000005 entity) throws Exception {
        tp000005Logic.saveTp000005(entity);
    }

    public void deleteTp000005(Tp000005 entity) throws Exception {
        tp000005Logic.deleteTp000005(entity);
    }

    public void updateTp000005(Tp000005 entity) throws Exception {
        tp000005Logic.updateTp000005(entity);
    }

    public Tp000005 getTp000005(String codAfp) throws Exception {
        Tp000005 tp000005 = null;

        try {
            tp000005 = tp000005Logic.getTp000005(codAfp);
        } catch (Exception e) {
            throw e;
        }

        return tp000005;
    }

    public List<Tp000005> findByCriteriaInTp000005(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tp000005Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tp000005> findPageTp000005(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tp000005Logic.findPageTp000005(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTp000005() throws Exception {
        return tp000005Logic.findTotalNumberTp000005();
    }

    public List<Tp000005DTO> getDataTp000005() throws Exception {
        return tp000005Logic.getDataTp000005();
    }

    public void validateTp000005(Tp000005 tp000005) throws Exception {
        tp000005Logic.validateTp000005(tp000005);
    }

    public List<Tp000006> getTp000006() throws Exception {
        return tp000006Logic.getTp000006();
    }

    public void saveTp000006(Tp000006 entity) throws Exception {
        tp000006Logic.saveTp000006(entity);
    }

    public void deleteTp000006(Tp000006 entity) throws Exception {
        tp000006Logic.deleteTp000006(entity);
    }

    public void updateTp000006(Tp000006 entity) throws Exception {
        tp000006Logic.updateTp000006(entity);
    }

    public Tp000006 getTp000006(String codCaja) throws Exception {
        Tp000006 tp000006 = null;

        try {
            tp000006 = tp000006Logic.getTp000006(codCaja);
        } catch (Exception e) {
            throw e;
        }

        return tp000006;
    }

    public List<Tp000006> findByCriteriaInTp000006(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tp000006Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tp000006> findPageTp000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tp000006Logic.findPageTp000006(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTp000006() throws Exception {
        return tp000006Logic.findTotalNumberTp000006();
    }

    public List<Tp000006DTO> getDataTp000006() throws Exception {
        return tp000006Logic.getDataTp000006();
    }

    public void validateTp000006(Tp000006 tp000006) throws Exception {
        tp000006Logic.validateTp000006(tp000006);
    }

    public List<Tr000004> getTr000004() throws Exception {
        return tr000004Logic.getTr000004();
    }

    public void saveTr000004(Tr000004 entity) throws Exception {
        tr000004Logic.saveTr000004(entity);
    }

    public void deleteTr000004(Tr000004 entity) throws Exception {
        tr000004Logic.deleteTr000004(entity);
    }

    public void updateTr000004(Tr000004 entity) throws Exception {
        tr000004Logic.updateTr000004(entity);
    }

    public Tr000004 getTr000004(Tr000004Id id) throws Exception {
        Tr000004 tr000004 = null;

        try {
            tr000004 = tr000004Logic.getTr000004(id);
        } catch (Exception e) {
            throw e;
        }

        return tr000004;
    }

    public List<Tr000004> findByCriteriaInTr000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tr000004Logic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Tr000004> findPageTr000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tr000004Logic.findPageTr000004(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberTr000004() throws Exception {
        return tr000004Logic.findTotalNumberTr000004();
    }

    public List<Tr000004DTO> getDataTr000004() throws Exception {
        return tr000004Logic.getDataTr000004();
    }

    public void validateTr000004(Tr000004 tr000004) throws Exception {
        tr000004Logic.validateTr000004(tr000004);
    }
}
