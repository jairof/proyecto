package  com.proyecto.control;
import com.proyecto.dto.Tlp00002DTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Set;
import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import  com.exceptions.*;
import 	com.dataaccess.dao.*;
import  com.utilities.Utilities;
import  com.dto.mapper.ITlp00002Mapper;
import com.proyecto.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
* 
*/

@Scope("singleton")
@Service("Tlp00002Logic")
public class Tlp00002Logic implements ITlp00002Logic{

	private static final Logger log = LoggerFactory.getLogger(Tlp00002Logic.class);

	/**
	 * DAO injected by Spring that manages Tlp00002 entities
	 * 
	 */
	@Autowired
	private ITlp00002DAO tlp00002DAO;
	
	@Autowired
	private ITlp00002Mapper tlp00002Mapper;
	
	@Autowired
	private Validator validator;
	
        
    		            /**
		 	* Logic injected by Spring that manages Tp000003 entities
		 	* 
		 	*/
			@Autowired
			ITp000003Logic logicTp0000031;
		                    
                		
	public void validateTlp00002(Tlp00002 tlp00002)throws Exception{		
		 try {
			Set<ConstraintViolation<Tlp00002>> constraintViolations =validator.validate(tlp00002);
			 if(constraintViolations.size()>0){
				 StringBuilder strMessage=new StringBuilder();
				 for (ConstraintViolation<Tlp00002> constraintViolation : constraintViolations) {
					strMessage.append(constraintViolation.getPropertyPath().toString());
					strMessage.append(" - ");
					strMessage.append(constraintViolation.getMessage());
					strMessage.append(". \n");
				}
				 throw new Exception(strMessage.toString());
			 }
		 }catch (Exception e) {
			throw e;
		}
	}

	@Transactional(readOnly=true)
	public List<Tlp00002> getTlp00002() throws Exception{

	log.debug("finding all Tlp00002 instances");

    List<Tlp00002> list = new ArrayList<Tlp00002>();
            try {
            list = tlp00002DAO.findAll();
            } catch (Exception e) {
            log.error("finding all Tlp00002 failed", e);
            throw new ZMessManager().new GettingException(ZMessManager.ALL+"Tlp00002");
            }finally{
            }
            return list;
            }
			
			
			
			@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
            public void saveTlp00002(Tlp00002 entity) throws Exception {
				log.debug("saving Tlp00002 instance");
            try {
            
            if(entity==null){
	    		throw new ZMessManager().new NullEntityExcepcion("Tlp00002");
	    	}
			
			validateTlp00002(entity);


            if(getTlp00002(entity.getId()) != null){
            throw new ZMessManager(ZMessManager.ENTITY_WITHSAMEKEY);
            }

            tlp00002DAO.save(entity);
            log.debug("save Tlp00002 successful");
            } catch (Exception e) {
            	log.error("save Tlp00002 failed", e);
            	throw e;
            }finally{
            }
            }
			
			
			
			@Transactional(readOnly=false , propagation=Propagation.REQUIRED)
            public void deleteTlp00002(Tlp00002 entity) throws Exception {
            	log.debug("deleting Tlp00002 instance");
            	
	            if(entity==null){
	    			throw new ZMessManager().new NullEntityExcepcion("Tlp00002");
	    		}
    	
                                                if(entity.getId().getNumPlanilla()==null){throw new ZMessManager().new EmptyFieldException("numPlanilla");}
                                    if(entity.getId().getCodiEps()==null){throw new ZMessManager().new EmptyFieldException("codiEps");}
                                    if(entity.getId().getCodiArp()==null){throw new ZMessManager().new EmptyFieldException("codiArp");}
                                    if(entity.getId().getCodiAfp()==null){throw new ZMessManager().new EmptyFieldException("codiAfp");}
                                    if(entity.getId().getCodiCaja()==null){throw new ZMessManager().new EmptyFieldException("codiCaja");}
                                    if(entity.getId().getCotizante()==null){throw new ZMessManager().new EmptyFieldException("cotizante");}
                                    if(entity.getId().getCodEmpresaEmp()==null){throw new ZMessManager().new EmptyFieldException("codEmpresaEmp");}
                                    if(entity.getId().getCiuLaboralCotizante()==null){throw new ZMessManager().new EmptyFieldException("ciuLaboralCotizante");}
                                    if(entity.getId().getDepLaboralCotizante()==null){throw new ZMessManager().new EmptyFieldException("depLaboralCotizante");}
                                    if(entity.getId().getTipocotizante()==null){throw new ZMessManager().new EmptyFieldException("tipocotizante");}
                                    if(entity.getId().getSubTipocotizante()==null){throw new ZMessManager().new EmptyFieldException("subTipocotizante");}
                                    if(entity.getId().getDiasCotizados()==null){throw new ZMessManager().new EmptyFieldException("diasCotizados");}
                                    if(entity.getId().getDiasCotizadosArp()==null){throw new ZMessManager().new EmptyFieldException("diasCotizadosArp");}
                                    if(entity.getId().getDiasCotizadosAfp()==null){throw new ZMessManager().new EmptyFieldException("diasCotizadosAfp");}
                                    if(entity.getId().getDiasCotizadosCaja()==null){throw new ZMessManager().new EmptyFieldException("diasCotizadosCaja");}
                                    if(entity.getId().getSalarioBasico()==null){throw new ZMessManager().new EmptyFieldException("salarioBasico");}
                                    if(entity.getId().getSalarioCIntegral()==null){throw new ZMessManager().new EmptyFieldException("salarioCIntegral");}
                                    if(entity.getId().getPlanillaEps()==null){throw new ZMessManager().new EmptyFieldException("planillaEps");}
                                    if(entity.getId().getPlanillaArp()==null){throw new ZMessManager().new EmptyFieldException("planillaArp");}
                                    if(entity.getId().getPlanillaAfp()==null){throw new ZMessManager().new EmptyFieldException("planillaAfp");}
                                    if(entity.getId().getPlanillaCaja()==null){throw new ZMessManager().new EmptyFieldException("planillaCaja");}
                                    if(entity.getId().getNumAuincapacidad()==null){throw new ZMessManager().new EmptyFieldException("numAuincapacidad");}
                                    if(entity.getId().getValorIncapacidad()==null){throw new ZMessManager().new EmptyFieldException("valorIncapacidad");}
                                    if(entity.getId().getNumAulicenciaM()==null){throw new ZMessManager().new EmptyFieldException("numAulicenciaM");}
                                    if(entity.getId().getValorLicenciaM()==null){throw new ZMessManager().new EmptyFieldException("valorLicenciaM");}
                                    if(entity.getId().getValorUpcAdicional()==null){throw new ZMessManager().new EmptyFieldException("valorUpcAdicional");}
                                    if(entity.getId().getIngresoBaseCotizacion()==null){throw new ZMessManager().new EmptyFieldException("ingresoBaseCotizacion");}
                                    if(entity.getId().getIngresoBaseCotizacionArp()==null){throw new ZMessManager().new EmptyFieldException("ingresoBaseCotizacionArp");}
                                    if(entity.getId().getIngresoBaseCotizacionAfp()==null){throw new ZMessManager().new EmptyFieldException("ingresoBaseCotizacionAfp");}
                                    if(entity.getId().getIngresoBaseCotizacionCaja()==null){throw new ZMessManager().new EmptyFieldException("ingresoBaseCotizacionCaja");}
                                    if(entity.getId().getIngresoBaseCotizacionSenaIcbf()==null){throw new ZMessManager().new EmptyFieldException("ingresoBaseCotizacionSenaIcbf");}
                                    if(entity.getId().getCotizaciónObligatoria()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoria");}
                                    if(entity.getId().getCotizaciónObligatoriaArp()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoriaArp");}
                                    if(entity.getId().getCodigoCentroTrabajo()==null){throw new ZMessManager().new EmptyFieldException("codigoCentroTrabajo");}
                                    if(entity.getId().getCotizaciónObligatoriaAfp()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoriaAfp");}
                                    if(entity.getId().getValorFpsolidaridad()==null){throw new ZMessManager().new EmptyFieldException("valorFpsolidaridad");}
                                    if(entity.getId().getValorFpsubsistencia()==null){throw new ZMessManager().new EmptyFieldException("valorFpsubsistencia");}
                                    if(entity.getId().getRiesgos()==null){throw new ZMessManager().new EmptyFieldException("riesgos");}
                                    if(entity.getId().getPorcEps()==null){throw new ZMessManager().new EmptyFieldException("porcEps");}
                                    if(entity.getId().getPorcRiesgo()==null){throw new ZMessManager().new EmptyFieldException("porcRiesgo");}
                                    if(entity.getId().getPorcAfp()==null){throw new ZMessManager().new EmptyFieldException("porcAfp");}
                                    if(entity.getId().getPorcCaja()==null){throw new ZMessManager().new EmptyFieldException("porcCaja");}
                                    if(entity.getId().getCotizaciónObligatoriaCaja()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoriaCaja");}
                                    if(entity.getId().getPorcSena()==null){throw new ZMessManager().new EmptyFieldException("porcSena");}
                                    if(entity.getId().getCotizaciónObligatoriaSena()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoriaSena");}
                                    if(entity.getId().getPorcIcbf()==null){throw new ZMessManager().new EmptyFieldException("porcIcbf");}
                                    if(entity.getId().getCotizaciónObligatoriaIcbf()==null){throw new ZMessManager().new EmptyFieldException("cotizaciónObligatoriaIcbf");}
                                    if(entity.getId().getDetaPlanPrimeraEps()==null){throw new ZMessManager().new EmptyFieldException("detaPlanPrimeraEps");}
                                    if(entity.getId().getDetaPlanPrimeraArp()==null){throw new ZMessManager().new EmptyFieldException("detaPlanPrimeraArp");}
                                    if(entity.getId().getDetaPlanPrimeraAfp()==null){throw new ZMessManager().new EmptyFieldException("detaPlanPrimeraAfp");}
                                    if(entity.getId().getDetaPlanPrimeraCaja()==null){throw new ZMessManager().new EmptyFieldException("detaPlanPrimeraCaja");}
                                    if(entity.getId().getIng()==null){throw new ZMessManager().new EmptyFieldException("ing");}
                                    if(entity.getId().getRet()==null){throw new ZMessManager().new EmptyFieldException("ret");}
                                    if(entity.getId().getTde()==null){throw new ZMessManager().new EmptyFieldException("tde");}
                                    if(entity.getId().getTae()==null){throw new ZMessManager().new EmptyFieldException("tae");}
                                    if(entity.getId().getCodiEpsTraslado()==null){throw new ZMessManager().new EmptyFieldException("codiEpsTraslado");}
                                    if(entity.getId().getTdp()==null){throw new ZMessManager().new EmptyFieldException("tdp");}
                                    if(entity.getId().getTap()==null){throw new ZMessManager().new EmptyFieldException("tap");}
                                    if(entity.getId().getCodiAfpTraslado()==null){throw new ZMessManager().new EmptyFieldException("codiAfpTraslado");}
                                    if(entity.getId().getTda()==null){throw new ZMessManager().new EmptyFieldException("tda");}
                                    if(entity.getId().getTaa()==null){throw new ZMessManager().new EmptyFieldException("taa");}
                                    if(entity.getId().getVsp()==null){throw new ZMessManager().new EmptyFieldException("vsp");}
                                    if(entity.getId().getVte()==null){throw new ZMessManager().new EmptyFieldException("vte");}
                                    if(entity.getId().getVst()==null){throw new ZMessManager().new EmptyFieldException("vst");}
                                    if(entity.getId().getSln()==null){throw new ZMessManager().new EmptyFieldException("sln");}
                                    if(entity.getId().getIge()==null){throw new ZMessManager().new EmptyFieldException("ige");}
                                    if(entity.getId().getLma()==null){throw new ZMessManager().new EmptyFieldException("lma");}
                                    if(entity.getId().getVac()==null){throw new ZMessManager().new EmptyFieldException("vac");}
                                    if(entity.getId().getAvp()==null){throw new ZMessManager().new EmptyFieldException("avp");}
                                    if(entity.getId().getVct()==null){throw new ZMessManager().new EmptyFieldException("vct");}
                                    if(entity.getId().getIrp()==null){throw new ZMessManager().new EmptyFieldException("irp");}
                                    if(entity.getId().getCodUsuario()==null){throw new ZMessManager().new EmptyFieldException("codUsuario");}
                                        
            try {
                        tlp00002DAO.deleteById(entity.getId());
            log.debug("delete Tlp00002 successful");
            
            } catch (Exception e) {
            	log.error("delete Tlp00002 failed", e);
            	throw e;
            }
            finally{
            }
            }
			
			
			
			@Transactional(readOnly=false , propagation=Propagation.REQUIRED)
            public void updateTlp00002(Tlp00002 entity) throws Exception {

				log.debug("updating Tlp00002 instance");
				
            try {
            
            	if(entity==null){
	    			throw new ZMessManager().new NullEntityExcepcion("Tlp00002");
	    		}
	    		
            validateTlp00002(entity);

            tlp00002DAO.update(entity);
            
            log.debug("update Tlp00002 successful");
            
            } catch (Exception e) {
            	log.error("update Tlp00002 failed", e);
            	throw e;		
            }finally{
            }
            }
			
						@Transactional(readOnly=true)
			public List<Tlp00002DTO>getDataTlp00002()throws Exception{
				try{
				List<Tlp00002> tlp00002 = 
				tlp00002DAO.findAll();
					
					List<Tlp00002DTO > tlp00002DTO = new ArrayList<Tlp00002DTO>();
						for (Tlp00002 tlp00002Tmp : tlp00002) {
							
							
							Tlp00002DTO tlp00002DTO2 = 
								tlp00002Mapper.tlp00002ToTlp00002DTO(tlp00002Tmp);
							tlp00002DTO.add(tlp00002DTO2);	
						}
						
						return tlp00002DTO ;
					
				}catch(Exception e){
					throw e;	
				}
			}
			
			
			@Transactional(readOnly=true)
            public Tlp00002 getTlp00002(Tlp00002Id id) throws Exception {
            
            log.debug("getting Tlp00002 instance");
            
            Tlp00002 entity = null;
            try {
            entity = tlp00002DAO.findById(id);
            } catch (Exception e) {
            	log.error("get Tlp00002 failed", e);
             throw new ZMessManager().new FindingException("Tlp00002");
            }finally{
            }
            return entity;
            }
			
			
			@Transactional(readOnly=true)
            public List<Tlp00002> findPageTlp00002(String sortColumnName, boolean sortAscending,
                int startRow, int maxResults) throws Exception {
                List<Tlp00002> entity = null;
                    try {
                    entity = tlp00002DAO
                    .findPage(sortColumnName, sortAscending, startRow,
                    maxResults);
                    } catch (Exception e) {
                    throw new ZMessManager().new FindingException("Tlp00002 Count");
                    } finally {
                    }
                    return entity;
                    }
					
					
					
					@Transactional(readOnly=true)
                    public Long findTotalNumberTlp00002() throws Exception {
                    Long entity = null;
                    try {
                    entity = tlp00002DAO.count();
                    } catch (Exception e) {
                     throw new ZMessManager().new FindingException("Tlp00002 Count");
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
											@Transactional(readOnly=true)
                                            public List<Tlp00002> findByCriteria(Object[] variables, Object[] variablesBetween,
                                                Object[] variablesBetweenDates) throws Exception {
                                                List<Tlp00002> list = new ArrayList<Tlp00002>();
                                                        String where = new String();
                                                        String tempWhere = new String();
                                                        if (variables != null) {
                                                        for (int i = 0; i < variables.length; i++) {
                                                            if (variables[i] != null && variables[i + 1] != null
                                                            && variables[i + 2] != null
                                                            && variables[i + 3] != null) {
                                                            String variable = (String) variables[i];
                                                            Boolean booVariable = (Boolean) variables[i + 1];
                                                            Object value = variables[i + 2];
                                                            String comparator = (String) variables[i + 3];
                                                            if (booVariable.booleanValue()) {
                                                            tempWhere = (tempWhere.length() == 0) ? ("(model."
                                                            + variable + " " + comparator + " \'" + value + "\' )")
                                                            : (tempWhere + " AND (model." + variable + " "
                                                            + comparator + " \'" + value + "\' )");
                                                            } else {
                                                            tempWhere = (tempWhere.length() == 0) ? ("(model."
                                                            + variable + " " + comparator + " " + value + " )")
                                                            : (tempWhere + " AND (model." + variable + " "
                                                            + comparator + " " + value + " )");
                                                            }
                                                            }
                                                            i = i + 3;
                                                            }
                                                            }
                                                            if (variablesBetween != null) {
                                                            for (int j = 0; j < variablesBetween.length; j++) {
                                                                if (variablesBetween[j] != null
                                                                && variablesBetween[j + 1] != null
                                                                && variablesBetween[j + 2] != null
                                                                && variablesBetween[j + 3] != null
                                                                && variablesBetween[j + 4] != null) {
                                                                String variable = (String) variablesBetween[j];
                                                                Object value = variablesBetween[j + 1];
                                                                Object value2 = variablesBetween[j + 2];
                                                                String comparator1 = (String) variablesBetween[j + 3];
                                                                String comparator2 = (String) variablesBetween[j + 4];
                                                                tempWhere = (tempWhere.length() == 0) ? ("(" + value
                                                                + " " + comparator1 + " " + variable + " and "
                                                                + variable + " " + comparator2 + " " + value2 + " )")
                                                                : (tempWhere + " AND (" + value + " "
                                                                + comparator1 + " " + variable
                                                                + " and " + variable + " "
                                                                + comparator2 + " " + value2 + " )");
                                                                }
                                                                j = j + 4;
                                                                }
                                                                }
                                                                if (variablesBetweenDates != null) {
                                                                for (int k = 0; k < variablesBetweenDates.length; k++) {
                                                                    if (variablesBetweenDates[k] != null
                                                                    && variablesBetweenDates[k + 1] != null
                                                                    && variablesBetweenDates[k + 2] != null) {
                                                                    String variable = (String) variablesBetweenDates[k];
                                                                    Object object1 = variablesBetweenDates[k + 1];
                                                                    Object object2 = variablesBetweenDates[k + 2];
                                                                    String value = null;
                                                                    String value2 = null;
                                                                    try {
                                                                    Date date1 = (Date) object1;
                                                                    Date date2 = (Date) object2;
                                                                    value = Utilities
                                                                    .formatDateWithoutTimeInAStringForBetweenWhere(date1);
                                                                    value2 = Utilities
                                                                    .formatDateWithoutTimeInAStringForBetweenWhere(date2);
                                                                    } catch (Exception e) {
                                                                    list = null;
                                                                    throw e;
                                                                    }
                                                                    tempWhere = (tempWhere.length() == 0) ? ("(model."
                                                                    + variable + " between " + value + " and "
                                                                    + value2 + ")") : (tempWhere + " AND (model."
                                                                    + variable + " between " + value + " and "
                                                                    + value2 + ")");
                                                                    }
                                                                    k = k + 2;
                                                                    }
                                                                    }
                                                                    if (tempWhere.length() == 0) {
                                                                    where = null;
                                                                    }else{
                                                                    where = "(" + tempWhere + ")";
                                                                    }
                                                                    try {
                                                                    list = tlp00002DAO
                                                                    .findByCriteria(where);
                                                                    } catch (Exception e) {
                                                                    throw new Exception(e.getMessage());
                                                                    } finally {
                                                                    }
                                                                    return list;
                                                                    }
                                                                    }
