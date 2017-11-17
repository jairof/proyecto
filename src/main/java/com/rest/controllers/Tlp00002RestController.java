package com.rest.controllers;

import  com.dto.mapper.ITlp00002Mapper;
import com.presentation.businessDelegate.IBusinessDelegatorView;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.*;
import com.proyecto.dto.Tlp00002DTO;

@RestController
@RequestMapping("/tlp00002")
public class Tlp00002RestController {
	
	private static final Logger log = LoggerFactory.getLogger(Tlp00002RestController.class);

	@Autowired
    private IBusinessDelegatorView businessDelegatorView;
  
  	@Autowired
	private ITlp00002Mapper tlp00002Mapper;
     
    @PostMapping(value = "/saveTlp00002")
    public void saveTlp00002(@RequestBody Tlp00002DTO tlp00002DTO) throws Exception {
    	try {
    		Tlp00002 tlp00002 = tlp00002Mapper.tlp00002DTOToTlp00002(tlp00002DTO);
    		
    		businessDelegatorView.saveTlp00002(tlp00002);
    	} catch (Exception e) {
    		log.error(e.getMessage(), e);
    		throw e;
    	}
    }
    
        	@DeleteMapping(value = "/deleteTlp00002/{numPlanilla}/{codiEps}/{codiArp}/{codiAfp}/{codiCaja}/{cotizante}/{codEmpresaEmp}/{ciuLaboralCotizante}/{depLaboralCotizante}/{tipocotizante}/{subTipocotizante}/{diasCotizados}/{diasCotizadosArp}/{diasCotizadosAfp}/{diasCotizadosCaja}/{salarioBasico}/{salarioCIntegral}/{planillaEps}/{planillaArp}/{planillaAfp}/{planillaCaja}/{numAuincapacidad}/{valorIncapacidad}/{numAulicenciaM}/{valorLicenciaM}/{valorUpcAdicional}/{ingresoBaseCotizacion}/{ingresoBaseCotizacionArp}/{ingresoBaseCotizacionAfp}/{ingresoBaseCotizacionCaja}/{ingresoBaseCotizacionSenaIcbf}/{cotizaciónObligatoria}/{cotizaciónObligatoriaArp}/{codigoCentroTrabajo}/{cotizaciónObligatoriaAfp}/{valorFpsolidaridad}/{valorFpsubsistencia}/{riesgos}/{porcEps}/{porcRiesgo}/{porcAfp}/{porcCaja}/{cotizaciónObligatoriaCaja}/{porcSena}/{cotizaciónObligatoriaSena}/{porcIcbf}/{cotizaciónObligatoriaIcbf}/{detaPlanPrimeraEps}/{detaPlanPrimeraArp}/{detaPlanPrimeraAfp}/{detaPlanPrimeraCaja}/{ing}/{ret}/{tde}/{tae}/{codiEpsTraslado}/{tdp}/{tap}/{codiAfpTraslado}/{tda}/{taa}/{vsp}/{vte}/{vst}/{sln}/{ige}/{lma}/{vac}/{avp}/{vct}/{irp}/{codUsuario}") 
        public void deleteTlp00002(  @PathVariable("numPlanilla") String numPlanilla  ,   @PathVariable("codiEps") String codiEps  ,   @PathVariable("codiArp") String codiArp  ,   @PathVariable("codiAfp") String codiAfp  ,   @PathVariable("codiCaja") String codiCaja  ,   @PathVariable("cotizante") String cotizante  ,   @PathVariable("codEmpresaEmp") String codEmpresaEmp  ,   @PathVariable("ciuLaboralCotizante") String ciuLaboralCotizante  ,   @PathVariable("depLaboralCotizante") String depLaboralCotizante  ,   @PathVariable("tipocotizante") String tipocotizante  ,   @PathVariable("subTipocotizante") String subTipocotizante  ,   @PathVariable("diasCotizados") Integer diasCotizados  ,   @PathVariable("diasCotizadosArp") Integer diasCotizadosArp  ,   @PathVariable("diasCotizadosAfp") Integer diasCotizadosAfp  ,   @PathVariable("diasCotizadosCaja") Integer diasCotizadosCaja  ,   @PathVariable("salarioBasico") Double salarioBasico  ,   @PathVariable("salarioCIntegral") String salarioCIntegral  ,   @PathVariable("planillaEps") String planillaEps  ,   @PathVariable("planillaArp") String planillaArp  ,   @PathVariable("planillaAfp") String planillaAfp  ,   @PathVariable("planillaCaja") String planillaCaja  ,   @PathVariable("numAuincapacidad") String numAuincapacidad  ,   @PathVariable("valorIncapacidad") Double valorIncapacidad  ,   @PathVariable("numAulicenciaM") String numAulicenciaM  ,   @PathVariable("valorLicenciaM") Double valorLicenciaM  ,   @PathVariable("valorUpcAdicional") Double valorUpcAdicional  ,   @PathVariable("ingresoBaseCotizacion") Double ingresoBaseCotizacion  ,   @PathVariable("ingresoBaseCotizacionArp") Double ingresoBaseCotizacionArp  ,   @PathVariable("ingresoBaseCotizacionAfp") Double ingresoBaseCotizacionAfp  ,   @PathVariable("ingresoBaseCotizacionCaja") Double ingresoBaseCotizacionCaja  ,   @PathVariable("ingresoBaseCotizacionSenaIcbf") Double ingresoBaseCotizacionSenaIcbf  ,   @PathVariable("cotizaciónObligatoria") Double cotizaciónObligatoria  ,   @PathVariable("cotizaciónObligatoriaArp") Double cotizaciónObligatoriaArp  ,   @PathVariable("codigoCentroTrabajo") String codigoCentroTrabajo  ,   @PathVariable("cotizaciónObligatoriaAfp") Double cotizaciónObligatoriaAfp  ,   @PathVariable("valorFpsolidaridad") Double valorFpsolidaridad  ,   @PathVariable("valorFpsubsistencia") Double valorFpsubsistencia  ,   @PathVariable("riesgos") Integer riesgos  ,   @PathVariable("porcEps") Double porcEps  ,   @PathVariable("porcRiesgo") Double porcRiesgo  ,   @PathVariable("porcAfp") Double porcAfp  ,   @PathVariable("porcCaja") Double porcCaja  ,   @PathVariable("cotizaciónObligatoriaCaja") Double cotizaciónObligatoriaCaja  ,   @PathVariable("porcSena") Double porcSena  ,   @PathVariable("cotizaciónObligatoriaSena") Double cotizaciónObligatoriaSena  ,   @PathVariable("porcIcbf") Double porcIcbf  ,   @PathVariable("cotizaciónObligatoriaIcbf") Double cotizaciónObligatoriaIcbf  ,   @PathVariable("detaPlanPrimeraEps") String detaPlanPrimeraEps  ,   @PathVariable("detaPlanPrimeraArp") String detaPlanPrimeraArp  ,   @PathVariable("detaPlanPrimeraAfp") String detaPlanPrimeraAfp  ,   @PathVariable("detaPlanPrimeraCaja") String detaPlanPrimeraCaja  ,   @PathVariable("ing") String ing  ,   @PathVariable("ret") String ret  ,   @PathVariable("tde") String tde  ,   @PathVariable("tae") String tae  ,   @PathVariable("codiEpsTraslado") String codiEpsTraslado  ,   @PathVariable("tdp") String tdp  ,   @PathVariable("tap") String tap  ,   @PathVariable("codiAfpTraslado") String codiAfpTraslado  ,   @PathVariable("tda") String tda  ,   @PathVariable("taa") String taa  ,   @PathVariable("vsp") String vsp  ,   @PathVariable("vte") String vte  ,   @PathVariable("vst") String vst  ,   @PathVariable("sln") String sln  ,   @PathVariable("ige") String ige  ,   @PathVariable("lma") String lma  ,   @PathVariable("vac") String vac  ,   @PathVariable("avp") String avp  ,   @PathVariable("vct") String vct  ,   @PathVariable("irp") String irp  ,   @PathVariable("codUsuario") String codUsuario   ) throws Exception {
    	try {
    		
    						
				Tlp00002Id id = new Tlp00002Id();
				
									id.setNumPlanilla(numPlanilla);
									id.setCodiEps(codiEps);
									id.setCodiArp(codiArp);
									id.setCodiAfp(codiAfp);
									id.setCodiCaja(codiCaja);
									id.setCotizante(cotizante);
									id.setCodEmpresaEmp(codEmpresaEmp);
									id.setCiuLaboralCotizante(ciuLaboralCotizante);
									id.setDepLaboralCotizante(depLaboralCotizante);
									id.setTipocotizante(tipocotizante);
									id.setSubTipocotizante(subTipocotizante);
									id.setDiasCotizados(diasCotizados);
									id.setDiasCotizadosArp(diasCotizadosArp);
									id.setDiasCotizadosAfp(diasCotizadosAfp);
									id.setDiasCotizadosCaja(diasCotizadosCaja);
									id.setSalarioBasico(salarioBasico);
									id.setSalarioCIntegral(salarioCIntegral);
									id.setPlanillaEps(planillaEps);
									id.setPlanillaArp(planillaArp);
									id.setPlanillaAfp(planillaAfp);
									id.setPlanillaCaja(planillaCaja);
									id.setNumAuincapacidad(numAuincapacidad);
									id.setValorIncapacidad(valorIncapacidad);
									id.setNumAulicenciaM(numAulicenciaM);
									id.setValorLicenciaM(valorLicenciaM);
									id.setValorUpcAdicional(valorUpcAdicional);
									id.setIngresoBaseCotizacion(ingresoBaseCotizacion);
									id.setIngresoBaseCotizacionArp(ingresoBaseCotizacionArp);
									id.setIngresoBaseCotizacionAfp(ingresoBaseCotizacionAfp);
									id.setIngresoBaseCotizacionCaja(ingresoBaseCotizacionCaja);
									id.setIngresoBaseCotizacionSenaIcbf(ingresoBaseCotizacionSenaIcbf);
									id.setCotizaciónObligatoria(cotizaciónObligatoria);
									id.setCotizaciónObligatoriaArp(cotizaciónObligatoriaArp);
									id.setCodigoCentroTrabajo(codigoCentroTrabajo);
									id.setCotizaciónObligatoriaAfp(cotizaciónObligatoriaAfp);
									id.setValorFpsolidaridad(valorFpsolidaridad);
									id.setValorFpsubsistencia(valorFpsubsistencia);
									id.setRiesgos(riesgos);
									id.setPorcEps(porcEps);
									id.setPorcRiesgo(porcRiesgo);
									id.setPorcAfp(porcAfp);
									id.setPorcCaja(porcCaja);
									id.setCotizaciónObligatoriaCaja(cotizaciónObligatoriaCaja);
									id.setPorcSena(porcSena);
									id.setCotizaciónObligatoriaSena(cotizaciónObligatoriaSena);
									id.setPorcIcbf(porcIcbf);
									id.setCotizaciónObligatoriaIcbf(cotizaciónObligatoriaIcbf);
									id.setDetaPlanPrimeraEps(detaPlanPrimeraEps);
									id.setDetaPlanPrimeraArp(detaPlanPrimeraArp);
									id.setDetaPlanPrimeraAfp(detaPlanPrimeraAfp);
									id.setDetaPlanPrimeraCaja(detaPlanPrimeraCaja);
									id.setIng(ing);
									id.setRet(ret);
									id.setTde(tde);
									id.setTae(tae);
									id.setCodiEpsTraslado(codiEpsTraslado);
									id.setTdp(tdp);
									id.setTap(tap);
									id.setCodiAfpTraslado(codiAfpTraslado);
									id.setTda(tda);
									id.setTaa(taa);
									id.setVsp(vsp);
									id.setVte(vte);
									id.setVst(vst);
									id.setSln(sln);
									id.setIge(ige);
									id.setLma(lma);
									id.setVac(vac);
									id.setAvp(avp);
									id.setVct(vct);
									id.setIrp(irp);
									id.setCodUsuario(codUsuario);
								
				Tlp00002 tlp00002 = businessDelegatorView.getTlp00002(id);
				
			    	
    		businessDelegatorView.deleteTlp00002(tlp00002);
    	} catch (Exception e) {
    		log.error(e.getMessage(), e);
    		throw e;
    	}
    }
     
    @PutMapping(value = "/updateTlp00002/")
    public void updateTlp00002(@RequestBody Tlp00002DTO tlp00002DTO) throws Exception {
    	try {
    		Tlp00002 tlp00002 = tlp00002Mapper.tlp00002DTOToTlp00002(tlp00002DTO);
    		
    		businessDelegatorView.updateTlp00002(tlp00002);
    	} catch (Exception e) {
    		log.error(e.getMessage(), e);
    		throw e;
    	}
    }
    
    @GetMapping(value = "/getDataTlp00002")
    public List<Tlp00002DTO> getDataTlp00002() throws Exception {
		try {
			return businessDelegatorView.getDataTlp00002();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw e;
		}
    }
    
         	@GetMapping(value = "/getTlp00002/{numPlanilla}/{codiEps}/{codiArp}/{codiAfp}/{codiCaja}/{cotizante}/{codEmpresaEmp}/{ciuLaboralCotizante}/{depLaboralCotizante}/{tipocotizante}/{subTipocotizante}/{diasCotizados}/{diasCotizadosArp}/{diasCotizadosAfp}/{diasCotizadosCaja}/{salarioBasico}/{salarioCIntegral}/{planillaEps}/{planillaArp}/{planillaAfp}/{planillaCaja}/{numAuincapacidad}/{valorIncapacidad}/{numAulicenciaM}/{valorLicenciaM}/{valorUpcAdicional}/{ingresoBaseCotizacion}/{ingresoBaseCotizacionArp}/{ingresoBaseCotizacionAfp}/{ingresoBaseCotizacionCaja}/{ingresoBaseCotizacionSenaIcbf}/{cotizaciónObligatoria}/{cotizaciónObligatoriaArp}/{codigoCentroTrabajo}/{cotizaciónObligatoriaAfp}/{valorFpsolidaridad}/{valorFpsubsistencia}/{riesgos}/{porcEps}/{porcRiesgo}/{porcAfp}/{porcCaja}/{cotizaciónObligatoriaCaja}/{porcSena}/{cotizaciónObligatoriaSena}/{porcIcbf}/{cotizaciónObligatoriaIcbf}/{detaPlanPrimeraEps}/{detaPlanPrimeraArp}/{detaPlanPrimeraAfp}/{detaPlanPrimeraCaja}/{ing}/{ret}/{tde}/{tae}/{codiEpsTraslado}/{tdp}/{tap}/{codiAfpTraslado}/{tda}/{taa}/{vsp}/{vte}/{vst}/{sln}/{ige}/{lma}/{vac}/{avp}/{vct}/{irp}/{codUsuario}") 
        public Tlp00002DTO getTlp00002(  @PathVariable("numPlanilla") String numPlanilla  ,   @PathVariable("codiEps") String codiEps  ,   @PathVariable("codiArp") String codiArp  ,   @PathVariable("codiAfp") String codiAfp  ,   @PathVariable("codiCaja") String codiCaja  ,   @PathVariable("cotizante") String cotizante  ,   @PathVariable("codEmpresaEmp") String codEmpresaEmp  ,   @PathVariable("ciuLaboralCotizante") String ciuLaboralCotizante  ,   @PathVariable("depLaboralCotizante") String depLaboralCotizante  ,   @PathVariable("tipocotizante") String tipocotizante  ,   @PathVariable("subTipocotizante") String subTipocotizante  ,   @PathVariable("diasCotizados") Integer diasCotizados  ,   @PathVariable("diasCotizadosArp") Integer diasCotizadosArp  ,   @PathVariable("diasCotizadosAfp") Integer diasCotizadosAfp  ,   @PathVariable("diasCotizadosCaja") Integer diasCotizadosCaja  ,   @PathVariable("salarioBasico") Double salarioBasico  ,   @PathVariable("salarioCIntegral") String salarioCIntegral  ,   @PathVariable("planillaEps") String planillaEps  ,   @PathVariable("planillaArp") String planillaArp  ,   @PathVariable("planillaAfp") String planillaAfp  ,   @PathVariable("planillaCaja") String planillaCaja  ,   @PathVariable("numAuincapacidad") String numAuincapacidad  ,   @PathVariable("valorIncapacidad") Double valorIncapacidad  ,   @PathVariable("numAulicenciaM") String numAulicenciaM  ,   @PathVariable("valorLicenciaM") Double valorLicenciaM  ,   @PathVariable("valorUpcAdicional") Double valorUpcAdicional  ,   @PathVariable("ingresoBaseCotizacion") Double ingresoBaseCotizacion  ,   @PathVariable("ingresoBaseCotizacionArp") Double ingresoBaseCotizacionArp  ,   @PathVariable("ingresoBaseCotizacionAfp") Double ingresoBaseCotizacionAfp  ,   @PathVariable("ingresoBaseCotizacionCaja") Double ingresoBaseCotizacionCaja  ,   @PathVariable("ingresoBaseCotizacionSenaIcbf") Double ingresoBaseCotizacionSenaIcbf  ,   @PathVariable("cotizaciónObligatoria") Double cotizaciónObligatoria  ,   @PathVariable("cotizaciónObligatoriaArp") Double cotizaciónObligatoriaArp  ,   @PathVariable("codigoCentroTrabajo") String codigoCentroTrabajo  ,   @PathVariable("cotizaciónObligatoriaAfp") Double cotizaciónObligatoriaAfp  ,   @PathVariable("valorFpsolidaridad") Double valorFpsolidaridad  ,   @PathVariable("valorFpsubsistencia") Double valorFpsubsistencia  ,   @PathVariable("riesgos") Integer riesgos  ,   @PathVariable("porcEps") Double porcEps  ,   @PathVariable("porcRiesgo") Double porcRiesgo  ,   @PathVariable("porcAfp") Double porcAfp  ,   @PathVariable("porcCaja") Double porcCaja  ,   @PathVariable("cotizaciónObligatoriaCaja") Double cotizaciónObligatoriaCaja  ,   @PathVariable("porcSena") Double porcSena  ,   @PathVariable("cotizaciónObligatoriaSena") Double cotizaciónObligatoriaSena  ,   @PathVariable("porcIcbf") Double porcIcbf  ,   @PathVariable("cotizaciónObligatoriaIcbf") Double cotizaciónObligatoriaIcbf  ,   @PathVariable("detaPlanPrimeraEps") String detaPlanPrimeraEps  ,   @PathVariable("detaPlanPrimeraArp") String detaPlanPrimeraArp  ,   @PathVariable("detaPlanPrimeraAfp") String detaPlanPrimeraAfp  ,   @PathVariable("detaPlanPrimeraCaja") String detaPlanPrimeraCaja  ,   @PathVariable("ing") String ing  ,   @PathVariable("ret") String ret  ,   @PathVariable("tde") String tde  ,   @PathVariable("tae") String tae  ,   @PathVariable("codiEpsTraslado") String codiEpsTraslado  ,   @PathVariable("tdp") String tdp  ,   @PathVariable("tap") String tap  ,   @PathVariable("codiAfpTraslado") String codiAfpTraslado  ,   @PathVariable("tda") String tda  ,   @PathVariable("taa") String taa  ,   @PathVariable("vsp") String vsp  ,   @PathVariable("vte") String vte  ,   @PathVariable("vst") String vst  ,   @PathVariable("sln") String sln  ,   @PathVariable("ige") String ige  ,   @PathVariable("lma") String lma  ,   @PathVariable("vac") String vac  ,   @PathVariable("avp") String avp  ,   @PathVariable("vct") String vct  ,   @PathVariable("irp") String irp  ,   @PathVariable("codUsuario") String codUsuario   ) throws Exception {
    	try {
    						
				Tlp00002Id id = new Tlp00002Id();
				
									id.setNumPlanilla(numPlanilla);
									id.setCodiEps(codiEps);
									id.setCodiArp(codiArp);
									id.setCodiAfp(codiAfp);
									id.setCodiCaja(codiCaja);
									id.setCotizante(cotizante);
									id.setCodEmpresaEmp(codEmpresaEmp);
									id.setCiuLaboralCotizante(ciuLaboralCotizante);
									id.setDepLaboralCotizante(depLaboralCotizante);
									id.setTipocotizante(tipocotizante);
									id.setSubTipocotizante(subTipocotizante);
									id.setDiasCotizados(diasCotizados);
									id.setDiasCotizadosArp(diasCotizadosArp);
									id.setDiasCotizadosAfp(diasCotizadosAfp);
									id.setDiasCotizadosCaja(diasCotizadosCaja);
									id.setSalarioBasico(salarioBasico);
									id.setSalarioCIntegral(salarioCIntegral);
									id.setPlanillaEps(planillaEps);
									id.setPlanillaArp(planillaArp);
									id.setPlanillaAfp(planillaAfp);
									id.setPlanillaCaja(planillaCaja);
									id.setNumAuincapacidad(numAuincapacidad);
									id.setValorIncapacidad(valorIncapacidad);
									id.setNumAulicenciaM(numAulicenciaM);
									id.setValorLicenciaM(valorLicenciaM);
									id.setValorUpcAdicional(valorUpcAdicional);
									id.setIngresoBaseCotizacion(ingresoBaseCotizacion);
									id.setIngresoBaseCotizacionArp(ingresoBaseCotizacionArp);
									id.setIngresoBaseCotizacionAfp(ingresoBaseCotizacionAfp);
									id.setIngresoBaseCotizacionCaja(ingresoBaseCotizacionCaja);
									id.setIngresoBaseCotizacionSenaIcbf(ingresoBaseCotizacionSenaIcbf);
									id.setCotizaciónObligatoria(cotizaciónObligatoria);
									id.setCotizaciónObligatoriaArp(cotizaciónObligatoriaArp);
									id.setCodigoCentroTrabajo(codigoCentroTrabajo);
									id.setCotizaciónObligatoriaAfp(cotizaciónObligatoriaAfp);
									id.setValorFpsolidaridad(valorFpsolidaridad);
									id.setValorFpsubsistencia(valorFpsubsistencia);
									id.setRiesgos(riesgos);
									id.setPorcEps(porcEps);
									id.setPorcRiesgo(porcRiesgo);
									id.setPorcAfp(porcAfp);
									id.setPorcCaja(porcCaja);
									id.setCotizaciónObligatoriaCaja(cotizaciónObligatoriaCaja);
									id.setPorcSena(porcSena);
									id.setCotizaciónObligatoriaSena(cotizaciónObligatoriaSena);
									id.setPorcIcbf(porcIcbf);
									id.setCotizaciónObligatoriaIcbf(cotizaciónObligatoriaIcbf);
									id.setDetaPlanPrimeraEps(detaPlanPrimeraEps);
									id.setDetaPlanPrimeraArp(detaPlanPrimeraArp);
									id.setDetaPlanPrimeraAfp(detaPlanPrimeraAfp);
									id.setDetaPlanPrimeraCaja(detaPlanPrimeraCaja);
									id.setIng(ing);
									id.setRet(ret);
									id.setTde(tde);
									id.setTae(tae);
									id.setCodiEpsTraslado(codiEpsTraslado);
									id.setTdp(tdp);
									id.setTap(tap);
									id.setCodiAfpTraslado(codiAfpTraslado);
									id.setTda(tda);
									id.setTaa(taa);
									id.setVsp(vsp);
									id.setVte(vte);
									id.setVst(vst);
									id.setSln(sln);
									id.setIge(ige);
									id.setLma(lma);
									id.setVac(vac);
									id.setAvp(avp);
									id.setVct(vct);
									id.setIrp(irp);
									id.setCodUsuario(codUsuario);
								
				Tlp00002 tlp00002 = businessDelegatorView.getTlp00002(id);
				
			    					
			return tlp00002Mapper.tlp00002ToTlp00002DTO(tlp00002);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
    }
        
    
} 