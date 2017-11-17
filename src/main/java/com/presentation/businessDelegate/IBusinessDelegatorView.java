package com.presentation.businessDelegate;

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

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface IBusinessDelegatorView {
    public List<Tg000001> getTg000001() throws Exception;

    public void saveTg000001(Tg000001 entity) throws Exception;

    public void deleteTg000001(Tg000001 entity) throws Exception;

    public void updateTg000001(Tg000001 entity) throws Exception;

    public Tg000001 getTg000001(String codBanco) throws Exception;

    public List<Tg000001> findByCriteriaInTg000001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000001> findPageTg000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000001() throws Exception;

    public List<Tg000001DTO> getDataTg000001() throws Exception;

    public void validateTg000001(Tg000001 tg000001) throws Exception;

    public List<Tg000002> getTg000002() throws Exception;

    public void saveTg000002(Tg000002 entity) throws Exception;

    public void deleteTg000002(Tg000002 entity) throws Exception;

    public void updateTg000002(Tg000002 entity) throws Exception;

    public Tg000002 getTg000002(String codCiudad) throws Exception;

    public List<Tg000002> findByCriteriaInTg000002(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000002> findPageTg000002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000002() throws Exception;

    public List<Tg000002DTO> getDataTg000002() throws Exception;

    public void validateTg000002(Tg000002 tg000002) throws Exception;

    public List<Tg000003> getTg000003() throws Exception;

    public void saveTg000003(Tg000003 entity) throws Exception;

    public void deleteTg000003(Tg000003 entity) throws Exception;

    public void updateTg000003(Tg000003 entity) throws Exception;

    public Tg000003 getTg000003(String codEmpresa) throws Exception;

    public List<Tg000003> findByCriteriaInTg000003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000003> findPageTg000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000003() throws Exception;

    public List<Tg000003DTO> getDataTg000003() throws Exception;

    public void validateTg000003(Tg000003 tg000003) throws Exception;

    public List<Tg000004> getTg000004() throws Exception;

    public void saveTg000004(Tg000004 entity) throws Exception;

    public void deleteTg000004(Tg000004 entity) throws Exception;

    public void updateTg000004(Tg000004 entity) throws Exception;

    public Tg000004 getTg000004(String codDepto) throws Exception;

    public List<Tg000004> findByCriteriaInTg000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000004> findPageTg000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000004() throws Exception;

    public List<Tg000004DTO> getDataTg000004() throws Exception;

    public void validateTg000004(Tg000004 tg000004) throws Exception;

    public List<Tg000006> getTg000006() throws Exception;

    public void saveTg000006(Tg000006 entity) throws Exception;

    public void deleteTg000006(Tg000006 entity) throws Exception;

    public void updateTg000006(Tg000006 entity) throws Exception;

    public Tg000006 getTg000006(String codCargo) throws Exception;

    public List<Tg000006> findByCriteriaInTg000006(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000006> findPageTg000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000006() throws Exception;

    public List<Tg000006DTO> getDataTg000006() throws Exception;

    public void validateTg000006(Tg000006 tg000006) throws Exception;

    public List<Tg000008> getTg000008() throws Exception;

    public void saveTg000008(Tg000008 entity) throws Exception;

    public void deleteTg000008(Tg000008 entity) throws Exception;

    public void updateTg000008(Tg000008 entity) throws Exception;

    public Tg000008 getTg000008(Tg000008Id id) throws Exception;

    public List<Tg000008> findByCriteriaInTg000008(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000008> findPageTg000008(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000008() throws Exception;

    public List<Tg000008DTO> getDataTg000008() throws Exception;

    public void validateTg000008(Tg000008 tg000008) throws Exception;

    public List<Tg000010> getTg000010() throws Exception;

    public void saveTg000010(Tg000010 entity) throws Exception;

    public void deleteTg000010(Tg000010 entity) throws Exception;

    public void updateTg000010(Tg000010 entity) throws Exception;

    public Tg000010 getTg000010(Tg000010Id id) throws Exception;

    public List<Tg000010> findByCriteriaInTg000010(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000010> findPageTg000010(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000010() throws Exception;

    public List<Tg000010DTO> getDataTg000010() throws Exception;

    public void validateTg000010(Tg000010 tg000010) throws Exception;

    public List<Tg000011> getTg000011() throws Exception;

    public void saveTg000011(Tg000011 entity) throws Exception;

    public void deleteTg000011(Tg000011 entity) throws Exception;

    public void updateTg000011(Tg000011 entity) throws Exception;

    public Tg000011 getTg000011(Tg000011Id id) throws Exception;

    public List<Tg000011> findByCriteriaInTg000011(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000011> findPageTg000011(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000011() throws Exception;

    public List<Tg000011DTO> getDataTg000011() throws Exception;

    public void validateTg000011(Tg000011 tg000011) throws Exception;

    public List<Tg000012> getTg000012() throws Exception;

    public void saveTg000012(Tg000012 entity) throws Exception;

    public void deleteTg000012(Tg000012 entity) throws Exception;

    public void updateTg000012(Tg000012 entity) throws Exception;

    public Tg000012 getTg000012(String codProfesion) throws Exception;

    public List<Tg000012> findByCriteriaInTg000012(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000012> findPageTg000012(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000012() throws Exception;

    public List<Tg000012DTO> getDataTg000012() throws Exception;

    public void validateTg000012(Tg000012 tg000012) throws Exception;

    public List<Tg000013> getTg000013() throws Exception;

    public void saveTg000013(Tg000013 entity) throws Exception;

    public void deleteTg000013(Tg000013 entity) throws Exception;

    public void updateTg000013(Tg000013 entity) throws Exception;

    public Tg000013 getTg000013(String codActividad) throws Exception;

    public List<Tg000013> findByCriteriaInTg000013(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000013> findPageTg000013(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000013() throws Exception;

    public List<Tg000013DTO> getDataTg000013() throws Exception;

    public void validateTg000013(Tg000013 tg000013) throws Exception;

    public List<Tg000019> getTg000019() throws Exception;

    public void saveTg000019(Tg000019 entity) throws Exception;

    public void deleteTg000019(Tg000019 entity) throws Exception;

    public void updateTg000019(Tg000019 entity) throws Exception;

    public Tg000019 getTg000019(String codIdentidad) throws Exception;

    public List<Tg000019> findByCriteriaInTg000019(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000019> findPageTg000019(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000019() throws Exception;

    public List<Tg000019DTO> getDataTg000019() throws Exception;

    public void validateTg000019(Tg000019 tg000019) throws Exception;

    public List<Tg000026> getTg000026() throws Exception;

    public void saveTg000026(Tg000026 entity) throws Exception;

    public void deleteTg000026(Tg000026 entity) throws Exception;

    public void updateTg000026(Tg000026 entity) throws Exception;

    public Tg000026 getTg000026(String codTipodePlanillas)
        throws Exception;

    public List<Tg000026> findByCriteriaInTg000026(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000026> findPageTg000026(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000026() throws Exception;

    public List<Tg000026DTO> getDataTg000026() throws Exception;

    public void validateTg000026(Tg000026 tg000026) throws Exception;

    public List<Tg000028> getTg000028() throws Exception;

    public void saveTg000028(Tg000028 entity) throws Exception;

    public void deleteTg000028(Tg000028 entity) throws Exception;

    public void updateTg000028(Tg000028 entity) throws Exception;

    public Tg000028 getTg000028(String codTipoCotizante)
        throws Exception;

    public List<Tg000028> findByCriteriaInTg000028(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000028> findPageTg000028(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000028() throws Exception;

    public List<Tg000028DTO> getDataTg000028() throws Exception;

    public void validateTg000028(Tg000028 tg000028) throws Exception;

    public List<Tg000029> getTg000029() throws Exception;

    public void saveTg000029(Tg000029 entity) throws Exception;

    public void deleteTg000029(Tg000029 entity) throws Exception;

    public void updateTg000029(Tg000029 entity) throws Exception;

    public Tg000029 getTg000029(String codSubTipoCotizante)
        throws Exception;

    public List<Tg000029> findByCriteriaInTg000029(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tg000029> findPageTg000029(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTg000029() throws Exception;

    public List<Tg000029DTO> getDataTg000029() throws Exception;

    public void validateTg000029(Tg000029 tg000029) throws Exception;

    public List<Tlp00001> getTlp00001() throws Exception;

    public void saveTlp00001(Tlp00001 entity) throws Exception;

    public void deleteTlp00001(Tlp00001 entity) throws Exception;

    public void updateTlp00001(Tlp00001 entity) throws Exception;

    public Tlp00001 getTlp00001(Tlp00001Id id) throws Exception;

    public List<Tlp00001> findByCriteriaInTlp00001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00001> findPageTlp00001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00001() throws Exception;

    public List<Tlp00001DTO> getDataTlp00001() throws Exception;

    public void validateTlp00001(Tlp00001 tlp00001) throws Exception;

    public List<Tlp00002> getTlp00002() throws Exception;

    public void saveTlp00002(Tlp00002 entity) throws Exception;

    public void deleteTlp00002(Tlp00002 entity) throws Exception;

    public void updateTlp00002(Tlp00002 entity) throws Exception;

    public Tlp00002 getTlp00002(Tlp00002Id id) throws Exception;

    public List<Tlp00002> findByCriteriaInTlp00002(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00002> findPageTlp00002(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00002() throws Exception;

    public List<Tlp00002DTO> getDataTlp00002() throws Exception;

    public void validateTlp00002(Tlp00002 tlp00002) throws Exception;

    public List<Tlp00003> getTlp00003() throws Exception;

    public void saveTlp00003(Tlp00003 entity) throws Exception;

    public void deleteTlp00003(Tlp00003 entity) throws Exception;

    public void updateTlp00003(Tlp00003 entity) throws Exception;

    public Tlp00003 getTlp00003(Tlp00003Id id) throws Exception;

    public List<Tlp00003> findByCriteriaInTlp00003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tlp00003> findPageTlp00003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTlp00003() throws Exception;

    public List<Tlp00003DTO> getDataTlp00003() throws Exception;

    public void validateTlp00003(Tlp00003 tlp00003) throws Exception;

    public List<Tp000001> getTp000001() throws Exception;

    public void saveTp000001(Tp000001 entity) throws Exception;

    public void deleteTp000001(Tp000001 entity) throws Exception;

    public void updateTp000001(Tp000001 entity) throws Exception;

    public Tp000001 getTp000001(Tp000001Id id) throws Exception;

    public List<Tp000001> findByCriteriaInTp000001(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000001> findPageTp000001(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000001() throws Exception;

    public List<Tp000001DTO> getDataTp000001() throws Exception;

    public void validateTp000001(Tp000001 tp000001) throws Exception;

    public List<Tp000003> getTp000003() throws Exception;

    public void saveTp000003(Tp000003 entity) throws Exception;

    public void deleteTp000003(Tp000003 entity) throws Exception;

    public void updateTp000003(Tp000003 entity) throws Exception;

    public Tp000003 getTp000003(String codEps) throws Exception;

    public List<Tp000003> findByCriteriaInTp000003(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000003> findPageTp000003(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000003() throws Exception;

    public List<Tp000003DTO> getDataTp000003() throws Exception;

    public void validateTp000003(Tp000003 tp000003) throws Exception;

    public List<Tp000004> getTp000004() throws Exception;

    public void saveTp000004(Tp000004 entity) throws Exception;

    public void deleteTp000004(Tp000004 entity) throws Exception;

    public void updateTp000004(Tp000004 entity) throws Exception;

    public Tp000004 getTp000004(String codArp) throws Exception;

    public List<Tp000004> findByCriteriaInTp000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000004> findPageTp000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000004() throws Exception;

    public List<Tp000004DTO> getDataTp000004() throws Exception;

    public void validateTp000004(Tp000004 tp000004) throws Exception;

    public List<Tp000005> getTp000005() throws Exception;

    public void saveTp000005(Tp000005 entity) throws Exception;

    public void deleteTp000005(Tp000005 entity) throws Exception;

    public void updateTp000005(Tp000005 entity) throws Exception;

    public Tp000005 getTp000005(String codAfp) throws Exception;

    public List<Tp000005> findByCriteriaInTp000005(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000005> findPageTp000005(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000005() throws Exception;

    public List<Tp000005DTO> getDataTp000005() throws Exception;

    public void validateTp000005(Tp000005 tp000005) throws Exception;

    public List<Tp000006> getTp000006() throws Exception;

    public void saveTp000006(Tp000006 entity) throws Exception;

    public void deleteTp000006(Tp000006 entity) throws Exception;

    public void updateTp000006(Tp000006 entity) throws Exception;

    public Tp000006 getTp000006(String codCaja) throws Exception;

    public List<Tp000006> findByCriteriaInTp000006(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tp000006> findPageTp000006(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTp000006() throws Exception;

    public List<Tp000006DTO> getDataTp000006() throws Exception;

    public void validateTp000006(Tp000006 tp000006) throws Exception;

    public List<Tr000004> getTr000004() throws Exception;

    public void saveTr000004(Tr000004 entity) throws Exception;

    public void deleteTr000004(Tr000004 entity) throws Exception;

    public void updateTr000004(Tr000004 entity) throws Exception;

    public Tr000004 getTr000004(Tr000004Id id) throws Exception;

    public List<Tr000004> findByCriteriaInTr000004(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Tr000004> findPageTr000004(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTr000004() throws Exception;

    public List<Tr000004DTO> getDataTr000004() throws Exception;

    public void validateTr000004(Tr000004 tr000004) throws Exception;
}
