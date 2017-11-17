package com.dto.mapper;
import com.proyecto.Tlp00002;
import com.proyecto.dto.Tlp00002DTO;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import 	com.proyecto.control.*;
import com.proyecto.*;

/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
* 
*/
@Component
@Scope("singleton")
public class Tlp00002Mapper implements ITlp00002Mapper {
	
	private static final Logger log = LoggerFactory.getLogger(Tlp00002Mapper.class);

    		            /**
		 	* Logic injected by Spring that manages Tp000003 entities
		 	* 
		 	*/
			@Autowired
			ITp000003Logic logicTp0000031;
		    	
	@Transactional(readOnly = true)
	public Tlp00002DTO tlp00002ToTlp00002DTO(Tlp00002 tlp00002)throws Exception{
		try{
			
			Tlp00002DTO tlp00002DTO = new Tlp00002DTO();
			
			                tlp00002DTO.setNumPlanilla(tlp00002.getId().getNumPlanilla());
                            tlp00002DTO.setCodiEps(tlp00002.getId().getCodiEps());
                            tlp00002DTO.setCodiArp(tlp00002.getId().getCodiArp());
                            tlp00002DTO.setCodiAfp(tlp00002.getId().getCodiAfp());
                            tlp00002DTO.setCodiCaja(tlp00002.getId().getCodiCaja());
                            tlp00002DTO.setCotizante(tlp00002.getId().getCotizante());
                            tlp00002DTO.setCodEmpresaEmp(tlp00002.getId().getCodEmpresaEmp());
                            tlp00002DTO.setCiuLaboralCotizante(tlp00002.getId().getCiuLaboralCotizante());
                            tlp00002DTO.setDepLaboralCotizante(tlp00002.getId().getDepLaboralCotizante());
                            tlp00002DTO.setTipocotizante(tlp00002.getId().getTipocotizante());
                            tlp00002DTO.setSubTipocotizante(tlp00002.getId().getSubTipocotizante());
                            tlp00002DTO.setDiasCotizados(tlp00002.getId().getDiasCotizados());
                            tlp00002DTO.setDiasCotizadosArp(tlp00002.getId().getDiasCotizadosArp());
                            tlp00002DTO.setDiasCotizadosAfp(tlp00002.getId().getDiasCotizadosAfp());
                            tlp00002DTO.setDiasCotizadosCaja(tlp00002.getId().getDiasCotizadosCaja());
                            tlp00002DTO.setSalarioBasico(tlp00002.getId().getSalarioBasico());
                            tlp00002DTO.setSalarioCIntegral(tlp00002.getId().getSalarioCIntegral());
                            tlp00002DTO.setPlanillaEps(tlp00002.getId().getPlanillaEps());
                            tlp00002DTO.setPlanillaArp(tlp00002.getId().getPlanillaArp());
                            tlp00002DTO.setPlanillaAfp(tlp00002.getId().getPlanillaAfp());
                            tlp00002DTO.setPlanillaCaja(tlp00002.getId().getPlanillaCaja());
                            tlp00002DTO.setNumAuincapacidad(tlp00002.getId().getNumAuincapacidad());
                            tlp00002DTO.setValorIncapacidad(tlp00002.getId().getValorIncapacidad());
                            tlp00002DTO.setNumAulicenciaM(tlp00002.getId().getNumAulicenciaM());
                            tlp00002DTO.setValorLicenciaM(tlp00002.getId().getValorLicenciaM());
                            tlp00002DTO.setValorUpcAdicional(tlp00002.getId().getValorUpcAdicional());
                            tlp00002DTO.setIngresoBaseCotizacion(tlp00002.getId().getIngresoBaseCotizacion());
                            tlp00002DTO.setIngresoBaseCotizacionArp(tlp00002.getId().getIngresoBaseCotizacionArp());
                            tlp00002DTO.setIngresoBaseCotizacionAfp(tlp00002.getId().getIngresoBaseCotizacionAfp());
                            tlp00002DTO.setIngresoBaseCotizacionCaja(tlp00002.getId().getIngresoBaseCotizacionCaja());
                            tlp00002DTO.setIngresoBaseCotizacionSenaIcbf(tlp00002.getId().getIngresoBaseCotizacionSenaIcbf());
                            tlp00002DTO.setCotizaciónObligatoria(tlp00002.getId().getCotizaciónObligatoria());
                            tlp00002DTO.setCotizaciónObligatoriaArp(tlp00002.getId().getCotizaciónObligatoriaArp());
                            tlp00002DTO.setCodigoCentroTrabajo(tlp00002.getId().getCodigoCentroTrabajo());
                            tlp00002DTO.setCotizaciónObligatoriaAfp(tlp00002.getId().getCotizaciónObligatoriaAfp());
                            tlp00002DTO.setValorFpsolidaridad(tlp00002.getId().getValorFpsolidaridad());
                            tlp00002DTO.setValorFpsubsistencia(tlp00002.getId().getValorFpsubsistencia());
                            tlp00002DTO.setRiesgos(tlp00002.getId().getRiesgos());
                            tlp00002DTO.setPorcEps(tlp00002.getId().getPorcEps());
                            tlp00002DTO.setPorcRiesgo(tlp00002.getId().getPorcRiesgo());
                            tlp00002DTO.setPorcAfp(tlp00002.getId().getPorcAfp());
                            tlp00002DTO.setPorcCaja(tlp00002.getId().getPorcCaja());
                            tlp00002DTO.setCotizaciónObligatoriaCaja(tlp00002.getId().getCotizaciónObligatoriaCaja());
                            tlp00002DTO.setPorcSena(tlp00002.getId().getPorcSena());
                            tlp00002DTO.setCotizaciónObligatoriaSena(tlp00002.getId().getCotizaciónObligatoriaSena());
                            tlp00002DTO.setPorcIcbf(tlp00002.getId().getPorcIcbf());
                            tlp00002DTO.setCotizaciónObligatoriaIcbf(tlp00002.getId().getCotizaciónObligatoriaIcbf());
                            tlp00002DTO.setDetaPlanPrimeraEps(tlp00002.getId().getDetaPlanPrimeraEps());
                            tlp00002DTO.setDetaPlanPrimeraArp(tlp00002.getId().getDetaPlanPrimeraArp());
                            tlp00002DTO.setDetaPlanPrimeraAfp(tlp00002.getId().getDetaPlanPrimeraAfp());
                            tlp00002DTO.setDetaPlanPrimeraCaja(tlp00002.getId().getDetaPlanPrimeraCaja());
                            tlp00002DTO.setIng(tlp00002.getId().getIng());
                            tlp00002DTO.setRet(tlp00002.getId().getRet());
                            tlp00002DTO.setTde(tlp00002.getId().getTde());
                            tlp00002DTO.setTae(tlp00002.getId().getTae());
                            tlp00002DTO.setCodiEpsTraslado(tlp00002.getId().getCodiEpsTraslado());
                            tlp00002DTO.setTdp(tlp00002.getId().getTdp());
                            tlp00002DTO.setTap(tlp00002.getId().getTap());
                            tlp00002DTO.setCodiAfpTraslado(tlp00002.getId().getCodiAfpTraslado());
                            tlp00002DTO.setTda(tlp00002.getId().getTda());
                            tlp00002DTO.setTaa(tlp00002.getId().getTaa());
                            tlp00002DTO.setVsp(tlp00002.getId().getVsp());
                            tlp00002DTO.setVte(tlp00002.getId().getVte());
                            tlp00002DTO.setVst(tlp00002.getId().getVst());
                            tlp00002DTO.setSln(tlp00002.getId().getSln());
                            tlp00002DTO.setIge(tlp00002.getId().getIge());
                            tlp00002DTO.setLma(tlp00002.getId().getLma());
                            tlp00002DTO.setVac(tlp00002.getId().getVac());
                            tlp00002DTO.setAvp(tlp00002.getId().getAvp());
                            tlp00002DTO.setVct(tlp00002.getId().getVct());
                            tlp00002DTO.setIrp(tlp00002.getId().getIrp());
                            tlp00002DTO.setCodUsuario(tlp00002.getId().getCodUsuario());
            			                tlp00002DTO.setCodEps_Tp000003(tlp00002.getTp000003().getCodEps()!=null ? tlp00002.getTp000003().getCodEps() : null);
            					
			return tlp00002DTO ;
					
		}catch(Exception e){
			throw e;	
		}
	}
	
	@Transactional(readOnly = true)
	public Tlp00002 tlp00002DTOToTlp00002(Tlp00002DTO tlp00002DTO)throws Exception{
		try{
			
			Tlp00002 tlp00002 = new Tlp00002();
			
			                Tlp00002Id tlp00002Id = new Tlp00002Id();
                            			if(tlp00002DTO.getNumPlanilla() != null && tlp00002DTO.getNumPlanilla().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setNumPlanilla(tlp00002DTO.getNumPlanilla() != null ? tlp00002DTO.getNumPlanilla() : null);
                            			if(tlp00002DTO.getCodiEps() != null && tlp00002DTO.getCodiEps().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiEps(tlp00002DTO.getCodiEps() != null ? tlp00002DTO.getCodiEps() : null);
                            			if(tlp00002DTO.getCodiArp() != null && tlp00002DTO.getCodiArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiArp(tlp00002DTO.getCodiArp() != null ? tlp00002DTO.getCodiArp() : null);
                            			if(tlp00002DTO.getCodiAfp() != null && tlp00002DTO.getCodiAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiAfp(tlp00002DTO.getCodiAfp() != null ? tlp00002DTO.getCodiAfp() : null);
                            			if(tlp00002DTO.getCodiCaja() != null && tlp00002DTO.getCodiCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiCaja(tlp00002DTO.getCodiCaja() != null ? tlp00002DTO.getCodiCaja() : null);
                            			if(tlp00002DTO.getCotizante() != null && tlp00002DTO.getCotizante().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizante(tlp00002DTO.getCotizante() != null ? tlp00002DTO.getCotizante() : null);
                            			if(tlp00002DTO.getCodEmpresaEmp() != null && tlp00002DTO.getCodEmpresaEmp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodEmpresaEmp(tlp00002DTO.getCodEmpresaEmp() != null ? tlp00002DTO.getCodEmpresaEmp() : null);
                            			if(tlp00002DTO.getCiuLaboralCotizante() != null && tlp00002DTO.getCiuLaboralCotizante().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCiuLaboralCotizante(tlp00002DTO.getCiuLaboralCotizante() != null ? tlp00002DTO.getCiuLaboralCotizante() : null);
                            			if(tlp00002DTO.getDepLaboralCotizante() != null && tlp00002DTO.getDepLaboralCotizante().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDepLaboralCotizante(tlp00002DTO.getDepLaboralCotizante() != null ? tlp00002DTO.getDepLaboralCotizante() : null);
                            			if(tlp00002DTO.getTipocotizante() != null && tlp00002DTO.getTipocotizante().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTipocotizante(tlp00002DTO.getTipocotizante() != null ? tlp00002DTO.getTipocotizante() : null);
                            			if(tlp00002DTO.getSubTipocotizante() != null && tlp00002DTO.getSubTipocotizante().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setSubTipocotizante(tlp00002DTO.getSubTipocotizante() != null ? tlp00002DTO.getSubTipocotizante() : null);
                            			if(tlp00002DTO.getDiasCotizados() != null && tlp00002DTO.getDiasCotizados().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDiasCotizados(tlp00002DTO.getDiasCotizados() != null ? tlp00002DTO.getDiasCotizados() : null);
                            			if(tlp00002DTO.getDiasCotizadosArp() != null && tlp00002DTO.getDiasCotizadosArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDiasCotizadosArp(tlp00002DTO.getDiasCotizadosArp() != null ? tlp00002DTO.getDiasCotizadosArp() : null);
                            			if(tlp00002DTO.getDiasCotizadosAfp() != null && tlp00002DTO.getDiasCotizadosAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDiasCotizadosAfp(tlp00002DTO.getDiasCotizadosAfp() != null ? tlp00002DTO.getDiasCotizadosAfp() : null);
                            			if(tlp00002DTO.getDiasCotizadosCaja() != null && tlp00002DTO.getDiasCotizadosCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDiasCotizadosCaja(tlp00002DTO.getDiasCotizadosCaja() != null ? tlp00002DTO.getDiasCotizadosCaja() : null);
                            			if(tlp00002DTO.getSalarioBasico() != null && tlp00002DTO.getSalarioBasico().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setSalarioBasico(tlp00002DTO.getSalarioBasico() != null ? tlp00002DTO.getSalarioBasico() : null);
                            			if(tlp00002DTO.getSalarioCIntegral() != null && tlp00002DTO.getSalarioCIntegral().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setSalarioCIntegral(tlp00002DTO.getSalarioCIntegral() != null ? tlp00002DTO.getSalarioCIntegral() : null);
                            			if(tlp00002DTO.getPlanillaEps() != null && tlp00002DTO.getPlanillaEps().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPlanillaEps(tlp00002DTO.getPlanillaEps() != null ? tlp00002DTO.getPlanillaEps() : null);
                            			if(tlp00002DTO.getPlanillaArp() != null && tlp00002DTO.getPlanillaArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPlanillaArp(tlp00002DTO.getPlanillaArp() != null ? tlp00002DTO.getPlanillaArp() : null);
                            			if(tlp00002DTO.getPlanillaAfp() != null && tlp00002DTO.getPlanillaAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPlanillaAfp(tlp00002DTO.getPlanillaAfp() != null ? tlp00002DTO.getPlanillaAfp() : null);
                            			if(tlp00002DTO.getPlanillaCaja() != null && tlp00002DTO.getPlanillaCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPlanillaCaja(tlp00002DTO.getPlanillaCaja() != null ? tlp00002DTO.getPlanillaCaja() : null);
                            			if(tlp00002DTO.getNumAuincapacidad() != null && tlp00002DTO.getNumAuincapacidad().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setNumAuincapacidad(tlp00002DTO.getNumAuincapacidad() != null ? tlp00002DTO.getNumAuincapacidad() : null);
                            			if(tlp00002DTO.getValorIncapacidad() != null && tlp00002DTO.getValorIncapacidad().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setValorIncapacidad(tlp00002DTO.getValorIncapacidad() != null ? tlp00002DTO.getValorIncapacidad() : null);
                            			if(tlp00002DTO.getNumAulicenciaM() != null && tlp00002DTO.getNumAulicenciaM().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setNumAulicenciaM(tlp00002DTO.getNumAulicenciaM() != null ? tlp00002DTO.getNumAulicenciaM() : null);
                            			if(tlp00002DTO.getValorLicenciaM() != null && tlp00002DTO.getValorLicenciaM().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setValorLicenciaM(tlp00002DTO.getValorLicenciaM() != null ? tlp00002DTO.getValorLicenciaM() : null);
                            			if(tlp00002DTO.getValorUpcAdicional() != null && tlp00002DTO.getValorUpcAdicional().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setValorUpcAdicional(tlp00002DTO.getValorUpcAdicional() != null ? tlp00002DTO.getValorUpcAdicional() : null);
                            			if(tlp00002DTO.getIngresoBaseCotizacion() != null && tlp00002DTO.getIngresoBaseCotizacion().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIngresoBaseCotizacion(tlp00002DTO.getIngresoBaseCotizacion() != null ? tlp00002DTO.getIngresoBaseCotizacion() : null);
                            			if(tlp00002DTO.getIngresoBaseCotizacionArp() != null && tlp00002DTO.getIngresoBaseCotizacionArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIngresoBaseCotizacionArp(tlp00002DTO.getIngresoBaseCotizacionArp() != null ? tlp00002DTO.getIngresoBaseCotizacionArp() : null);
                            			if(tlp00002DTO.getIngresoBaseCotizacionAfp() != null && tlp00002DTO.getIngresoBaseCotizacionAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIngresoBaseCotizacionAfp(tlp00002DTO.getIngresoBaseCotizacionAfp() != null ? tlp00002DTO.getIngresoBaseCotizacionAfp() : null);
                            			if(tlp00002DTO.getIngresoBaseCotizacionCaja() != null && tlp00002DTO.getIngresoBaseCotizacionCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIngresoBaseCotizacionCaja(tlp00002DTO.getIngresoBaseCotizacionCaja() != null ? tlp00002DTO.getIngresoBaseCotizacionCaja() : null);
                            			if(tlp00002DTO.getIngresoBaseCotizacionSenaIcbf() != null && tlp00002DTO.getIngresoBaseCotizacionSenaIcbf().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIngresoBaseCotizacionSenaIcbf(tlp00002DTO.getIngresoBaseCotizacionSenaIcbf() != null ? tlp00002DTO.getIngresoBaseCotizacionSenaIcbf() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoria() != null && tlp00002DTO.getCotizaciónObligatoria().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoria(tlp00002DTO.getCotizaciónObligatoria() != null ? tlp00002DTO.getCotizaciónObligatoria() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoriaArp() != null && tlp00002DTO.getCotizaciónObligatoriaArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoriaArp(tlp00002DTO.getCotizaciónObligatoriaArp() != null ? tlp00002DTO.getCotizaciónObligatoriaArp() : null);
                            			if(tlp00002DTO.getCodigoCentroTrabajo() != null && tlp00002DTO.getCodigoCentroTrabajo().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodigoCentroTrabajo(tlp00002DTO.getCodigoCentroTrabajo() != null ? tlp00002DTO.getCodigoCentroTrabajo() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoriaAfp() != null && tlp00002DTO.getCotizaciónObligatoriaAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoriaAfp(tlp00002DTO.getCotizaciónObligatoriaAfp() != null ? tlp00002DTO.getCotizaciónObligatoriaAfp() : null);
                            			if(tlp00002DTO.getValorFpsolidaridad() != null && tlp00002DTO.getValorFpsolidaridad().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setValorFpsolidaridad(tlp00002DTO.getValorFpsolidaridad() != null ? tlp00002DTO.getValorFpsolidaridad() : null);
                            			if(tlp00002DTO.getValorFpsubsistencia() != null && tlp00002DTO.getValorFpsubsistencia().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setValorFpsubsistencia(tlp00002DTO.getValorFpsubsistencia() != null ? tlp00002DTO.getValorFpsubsistencia() : null);
                            			if(tlp00002DTO.getRiesgos() != null && tlp00002DTO.getRiesgos().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setRiesgos(tlp00002DTO.getRiesgos() != null ? tlp00002DTO.getRiesgos() : null);
                            			if(tlp00002DTO.getPorcEps() != null && tlp00002DTO.getPorcEps().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcEps(tlp00002DTO.getPorcEps() != null ? tlp00002DTO.getPorcEps() : null);
                            			if(tlp00002DTO.getPorcRiesgo() != null && tlp00002DTO.getPorcRiesgo().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcRiesgo(tlp00002DTO.getPorcRiesgo() != null ? tlp00002DTO.getPorcRiesgo() : null);
                            			if(tlp00002DTO.getPorcAfp() != null && tlp00002DTO.getPorcAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcAfp(tlp00002DTO.getPorcAfp() != null ? tlp00002DTO.getPorcAfp() : null);
                            			if(tlp00002DTO.getPorcCaja() != null && tlp00002DTO.getPorcCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcCaja(tlp00002DTO.getPorcCaja() != null ? tlp00002DTO.getPorcCaja() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoriaCaja() != null && tlp00002DTO.getCotizaciónObligatoriaCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoriaCaja(tlp00002DTO.getCotizaciónObligatoriaCaja() != null ? tlp00002DTO.getCotizaciónObligatoriaCaja() : null);
                            			if(tlp00002DTO.getPorcSena() != null && tlp00002DTO.getPorcSena().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcSena(tlp00002DTO.getPorcSena() != null ? tlp00002DTO.getPorcSena() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoriaSena() != null && tlp00002DTO.getCotizaciónObligatoriaSena().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoriaSena(tlp00002DTO.getCotizaciónObligatoriaSena() != null ? tlp00002DTO.getCotizaciónObligatoriaSena() : null);
                            			if(tlp00002DTO.getPorcIcbf() != null && tlp00002DTO.getPorcIcbf().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setPorcIcbf(tlp00002DTO.getPorcIcbf() != null ? tlp00002DTO.getPorcIcbf() : null);
                            			if(tlp00002DTO.getCotizaciónObligatoriaIcbf() != null && tlp00002DTO.getCotizaciónObligatoriaIcbf().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCotizaciónObligatoriaIcbf(tlp00002DTO.getCotizaciónObligatoriaIcbf() != null ? tlp00002DTO.getCotizaciónObligatoriaIcbf() : null);
                            			if(tlp00002DTO.getDetaPlanPrimeraEps() != null && tlp00002DTO.getDetaPlanPrimeraEps().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDetaPlanPrimeraEps(tlp00002DTO.getDetaPlanPrimeraEps() != null ? tlp00002DTO.getDetaPlanPrimeraEps() : null);
                            			if(tlp00002DTO.getDetaPlanPrimeraArp() != null && tlp00002DTO.getDetaPlanPrimeraArp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDetaPlanPrimeraArp(tlp00002DTO.getDetaPlanPrimeraArp() != null ? tlp00002DTO.getDetaPlanPrimeraArp() : null);
                            			if(tlp00002DTO.getDetaPlanPrimeraAfp() != null && tlp00002DTO.getDetaPlanPrimeraAfp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDetaPlanPrimeraAfp(tlp00002DTO.getDetaPlanPrimeraAfp() != null ? tlp00002DTO.getDetaPlanPrimeraAfp() : null);
                            			if(tlp00002DTO.getDetaPlanPrimeraCaja() != null && tlp00002DTO.getDetaPlanPrimeraCaja().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setDetaPlanPrimeraCaja(tlp00002DTO.getDetaPlanPrimeraCaja() != null ? tlp00002DTO.getDetaPlanPrimeraCaja() : null);
                            			if(tlp00002DTO.getIng() != null && tlp00002DTO.getIng().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIng(tlp00002DTO.getIng() != null ? tlp00002DTO.getIng() : null);
                            			if(tlp00002DTO.getRet() != null && tlp00002DTO.getRet().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setRet(tlp00002DTO.getRet() != null ? tlp00002DTO.getRet() : null);
                            			if(tlp00002DTO.getTde() != null && tlp00002DTO.getTde().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTde(tlp00002DTO.getTde() != null ? tlp00002DTO.getTde() : null);
                            			if(tlp00002DTO.getTae() != null && tlp00002DTO.getTae().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTae(tlp00002DTO.getTae() != null ? tlp00002DTO.getTae() : null);
                            			if(tlp00002DTO.getCodiEpsTraslado() != null && tlp00002DTO.getCodiEpsTraslado().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiEpsTraslado(tlp00002DTO.getCodiEpsTraslado() != null ? tlp00002DTO.getCodiEpsTraslado() : null);
                            			if(tlp00002DTO.getTdp() != null && tlp00002DTO.getTdp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTdp(tlp00002DTO.getTdp() != null ? tlp00002DTO.getTdp() : null);
                            			if(tlp00002DTO.getTap() != null && tlp00002DTO.getTap().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTap(tlp00002DTO.getTap() != null ? tlp00002DTO.getTap() : null);
                            			if(tlp00002DTO.getCodiAfpTraslado() != null && tlp00002DTO.getCodiAfpTraslado().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodiAfpTraslado(tlp00002DTO.getCodiAfpTraslado() != null ? tlp00002DTO.getCodiAfpTraslado() : null);
                            			if(tlp00002DTO.getTda() != null && tlp00002DTO.getTda().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTda(tlp00002DTO.getTda() != null ? tlp00002DTO.getTda() : null);
                            			if(tlp00002DTO.getTaa() != null && tlp00002DTO.getTaa().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setTaa(tlp00002DTO.getTaa() != null ? tlp00002DTO.getTaa() : null);
                            			if(tlp00002DTO.getVsp() != null && tlp00002DTO.getVsp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setVsp(tlp00002DTO.getVsp() != null ? tlp00002DTO.getVsp() : null);
                            			if(tlp00002DTO.getVte() != null && tlp00002DTO.getVte().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setVte(tlp00002DTO.getVte() != null ? tlp00002DTO.getVte() : null);
                            			if(tlp00002DTO.getVst() != null && tlp00002DTO.getVst().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setVst(tlp00002DTO.getVst() != null ? tlp00002DTO.getVst() : null);
                            			if(tlp00002DTO.getSln() != null && tlp00002DTO.getSln().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setSln(tlp00002DTO.getSln() != null ? tlp00002DTO.getSln() : null);
                            			if(tlp00002DTO.getIge() != null && tlp00002DTO.getIge().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIge(tlp00002DTO.getIge() != null ? tlp00002DTO.getIge() : null);
                            			if(tlp00002DTO.getLma() != null && tlp00002DTO.getLma().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setLma(tlp00002DTO.getLma() != null ? tlp00002DTO.getLma() : null);
                            			if(tlp00002DTO.getVac() != null && tlp00002DTO.getVac().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setVac(tlp00002DTO.getVac() != null ? tlp00002DTO.getVac() : null);
                            			if(tlp00002DTO.getAvp() != null && tlp00002DTO.getAvp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setAvp(tlp00002DTO.getAvp() != null ? tlp00002DTO.getAvp() : null);
                            			if(tlp00002DTO.getVct() != null && tlp00002DTO.getVct().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setVct(tlp00002DTO.getVct() != null ? tlp00002DTO.getVct() : null);
                            			if(tlp00002DTO.getIrp() != null && tlp00002DTO.getIrp().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setIrp(tlp00002DTO.getIrp() != null ? tlp00002DTO.getIrp() : null);
                            			if(tlp00002DTO.getCodUsuario() != null && tlp00002DTO.getCodUsuario().toString().length() <= 0 ) {
				throw new Exception("La llave no puede ser nula");
			}

tlp00002Id.setCodUsuario(tlp00002DTO.getCodUsuario() != null ? tlp00002DTO.getCodUsuario() : null);
                            tlp00002.setId(tlp00002Id);
            			                Tp000003 tp000003 = logicTp0000031.getTp000003(tlp00002DTO.getCodEps_Tp000003()); 

if (tp000003!= null) { 
tlp00002.setTp000003(tp000003); 
	}
            				
			return tlp00002;
			
		}catch(Exception e){
			throw e;	
		}
			
	}
	
	@Transactional(readOnly = true)
	public List<Tlp00002DTO> listTlp00002ToListTlp00002DTO(List<Tlp00002> listTlp00002) throws Exception{
		try{
			List<Tlp00002DTO> tlp00002DTOs = new ArrayList<Tlp00002DTO>();
			
			for (Tlp00002 tlp00002 : listTlp00002) {
				
				Tlp00002DTO tlp00002DTO = tlp00002ToTlp00002DTO(tlp00002);
				
				tlp00002DTOs.add(tlp00002DTO);
			}
			
			return tlp00002DTOs;
		}catch(Exception e){
			throw e;	
		}
		
			
	}
	
	@Transactional(readOnly = true)
	public List<Tlp00002> listTlp00002DTOToListTlp00002(List<Tlp00002DTO> listTlp00002DTO) throws Exception{
		try{
			List<Tlp00002> listTlp00002 = new ArrayList<Tlp00002>();
			
			for (Tlp00002DTO tlp00002DTO : listTlp00002DTO) {
				
				Tlp00002 tlp00002 = tlp00002DTOToTlp00002(tlp00002DTO);
				
				listTlp00002.add(tlp00002);
			}
			
			return listTlp00002;
		}catch(Exception e){
			throw e;	
		}
		
			
	}		
	
}
