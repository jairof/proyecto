package  com.presentation.backingBeans;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.io.Serializable;
import java.sql.*;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.event.RowEditEvent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import  com.exceptions.*;
import com.proyecto.*;
import com.proyecto.dto.Tlp00002DTO;
import com.presentation.businessDelegate.*;
import com.utilities.*;
/**
 * @author Zathura Code Generator http://zathuracode.org/
 * www.zathuracode.org
 * 
 */
 

@ManagedBean
@ViewScoped
public class Tlp00002View implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(Tlp00002View.class);
	
public Tlp00002View() {
super();
}
    private InputText txtCodEps_Tp000003;
    private InputText txtNumPlanilla;
    private InputText txtCodiEps;
    private InputText txtCodiArp;
    private InputText txtCodiAfp;
    private InputText txtCodiCaja;
    private InputText txtCotizante;
    private InputText txtCodEmpresaEmp;
    private InputText txtCiuLaboralCotizante;
    private InputText txtDepLaboralCotizante;
    private InputText txtTipocotizante;
    private InputText txtSubTipocotizante;
    private InputText txtDiasCotizados;
    private InputText txtDiasCotizadosArp;
    private InputText txtDiasCotizadosAfp;
    private InputText txtDiasCotizadosCaja;
    private InputText txtSalarioBasico;
    private InputText txtSalarioCIntegral;
    private InputText txtPlanillaEps;
    private InputText txtPlanillaArp;
    private InputText txtPlanillaAfp;
    private InputText txtPlanillaCaja;
    private InputText txtNumAuincapacidad;
    private InputText txtValorIncapacidad;
    private InputText txtNumAulicenciaM;
    private InputText txtValorLicenciaM;
    private InputText txtValorUpcAdicional;
    private InputText txtIngresoBaseCotizacion;
    private InputText txtIngresoBaseCotizacionArp;
    private InputText txtIngresoBaseCotizacionAfp;
    private InputText txtIngresoBaseCotizacionCaja;
    private InputText txtIngresoBaseCotizacionSenaIcbf;
    private InputText txtCotizaciónObligatoria;
    private InputText txtCotizaciónObligatoriaArp;
    private InputText txtCodigoCentroTrabajo;
    private InputText txtCotizaciónObligatoriaAfp;
    private InputText txtValorFpsolidaridad;
    private InputText txtValorFpsubsistencia;
    private InputText txtRiesgos;
    private InputText txtPorcEps;
    private InputText txtPorcRiesgo;
    private InputText txtPorcAfp;
    private InputText txtPorcCaja;
    private InputText txtCotizaciónObligatoriaCaja;
    private InputText txtPorcSena;
    private InputText txtCotizaciónObligatoriaSena;
    private InputText txtPorcIcbf;
    private InputText txtCotizaciónObligatoriaIcbf;
    private InputText txtDetaPlanPrimeraEps;
    private InputText txtDetaPlanPrimeraArp;
    private InputText txtDetaPlanPrimeraAfp;
    private InputText txtDetaPlanPrimeraCaja;
    private InputText txtIng;
    private InputText txtRet;
    private InputText txtTde;
    private InputText txtTae;
    private InputText txtCodiEpsTraslado;
    private InputText txtTdp;
    private InputText txtTap;
    private InputText txtCodiAfpTraslado;
    private InputText txtTda;
    private InputText txtTaa;
    private InputText txtVsp;
    private InputText txtVte;
    private InputText txtVst;
    private InputText txtSln;
    private InputText txtIge;
    private InputText txtLma;
    private InputText txtVac;
    private InputText txtAvp;
    private InputText txtVct;
    private InputText txtIrp;
    private InputText txtCodUsuario;
private CommandButton btnSave;
private CommandButton btnModify;
private CommandButton btnDelete;
private CommandButton btnClear;
private List<Tlp00002DTO> data;
private Tlp00002DTO selectedTlp00002;
private Tlp00002 entity;
private boolean showDialog;
    
@ManagedProperty(value="#{BusinessDelegatorView}")
private IBusinessDelegatorView businessDelegatorView;


		
	public String action_new(){
		action_clear();
		selectedTlp00002 = null;
		setShowDialog(true);
		return "";
	}

	public String action_clear() {
		
		entity = null;
		selectedTlp00002 = null;
		
                    if(txtCodEps_Tp000003 != null){
			 txtCodEps_Tp000003.setValue(null);
             txtCodEps_Tp000003.setDisabled(true);
			}
                        			    if(txtNumPlanilla != null){
				   txtNumPlanilla.setValue(null);
				   txtNumPlanilla.setDisabled(false);	
				}
        			    if(txtCodiEps != null){
				   txtCodiEps.setValue(null);
				   txtCodiEps.setDisabled(false);	
				}
        			    if(txtCodiArp != null){
				   txtCodiArp.setValue(null);
				   txtCodiArp.setDisabled(false);	
				}
        			    if(txtCodiAfp != null){
				   txtCodiAfp.setValue(null);
				   txtCodiAfp.setDisabled(false);	
				}
        			    if(txtCodiCaja != null){
				   txtCodiCaja.setValue(null);
				   txtCodiCaja.setDisabled(false);	
				}
        			    if(txtCotizante != null){
				   txtCotizante.setValue(null);
				   txtCotizante.setDisabled(false);	
				}
        			    if(txtCodEmpresaEmp != null){
				   txtCodEmpresaEmp.setValue(null);
				   txtCodEmpresaEmp.setDisabled(false);	
				}
        			    if(txtCiuLaboralCotizante != null){
				   txtCiuLaboralCotizante.setValue(null);
				   txtCiuLaboralCotizante.setDisabled(false);	
				}
        			    if(txtDepLaboralCotizante != null){
				   txtDepLaboralCotizante.setValue(null);
				   txtDepLaboralCotizante.setDisabled(false);	
				}
        			    if(txtTipocotizante != null){
				   txtTipocotizante.setValue(null);
				   txtTipocotizante.setDisabled(false);	
				}
        			    if(txtSubTipocotizante != null){
				   txtSubTipocotizante.setValue(null);
				   txtSubTipocotizante.setDisabled(false);	
				}
        			    if(txtDiasCotizados != null){
				   txtDiasCotizados.setValue(null);
				   txtDiasCotizados.setDisabled(false);	
				}
        			    if(txtDiasCotizadosArp != null){
				   txtDiasCotizadosArp.setValue(null);
				   txtDiasCotizadosArp.setDisabled(false);	
				}
        			    if(txtDiasCotizadosAfp != null){
				   txtDiasCotizadosAfp.setValue(null);
				   txtDiasCotizadosAfp.setDisabled(false);	
				}
        			    if(txtDiasCotizadosCaja != null){
				   txtDiasCotizadosCaja.setValue(null);
				   txtDiasCotizadosCaja.setDisabled(false);	
				}
        			    if(txtSalarioBasico != null){
				   txtSalarioBasico.setValue(null);
				   txtSalarioBasico.setDisabled(false);	
				}
        			    if(txtSalarioCIntegral != null){
				   txtSalarioCIntegral.setValue(null);
				   txtSalarioCIntegral.setDisabled(false);	
				}
        			    if(txtPlanillaEps != null){
				   txtPlanillaEps.setValue(null);
				   txtPlanillaEps.setDisabled(false);	
				}
        			    if(txtPlanillaArp != null){
				   txtPlanillaArp.setValue(null);
				   txtPlanillaArp.setDisabled(false);	
				}
        			    if(txtPlanillaAfp != null){
				   txtPlanillaAfp.setValue(null);
				   txtPlanillaAfp.setDisabled(false);	
				}
        			    if(txtPlanillaCaja != null){
				   txtPlanillaCaja.setValue(null);
				   txtPlanillaCaja.setDisabled(false);	
				}
        			    if(txtNumAuincapacidad != null){
				   txtNumAuincapacidad.setValue(null);
				   txtNumAuincapacidad.setDisabled(false);	
				}
        			    if(txtValorIncapacidad != null){
				   txtValorIncapacidad.setValue(null);
				   txtValorIncapacidad.setDisabled(false);	
				}
        			    if(txtNumAulicenciaM != null){
				   txtNumAulicenciaM.setValue(null);
				   txtNumAulicenciaM.setDisabled(false);	
				}
        			    if(txtValorLicenciaM != null){
				   txtValorLicenciaM.setValue(null);
				   txtValorLicenciaM.setDisabled(false);	
				}
        			    if(txtValorUpcAdicional != null){
				   txtValorUpcAdicional.setValue(null);
				   txtValorUpcAdicional.setDisabled(false);	
				}
        			    if(txtIngresoBaseCotizacion != null){
				   txtIngresoBaseCotizacion.setValue(null);
				   txtIngresoBaseCotizacion.setDisabled(false);	
				}
        			    if(txtIngresoBaseCotizacionArp != null){
				   txtIngresoBaseCotizacionArp.setValue(null);
				   txtIngresoBaseCotizacionArp.setDisabled(false);	
				}
        			    if(txtIngresoBaseCotizacionAfp != null){
				   txtIngresoBaseCotizacionAfp.setValue(null);
				   txtIngresoBaseCotizacionAfp.setDisabled(false);	
				}
        			    if(txtIngresoBaseCotizacionCaja != null){
				   txtIngresoBaseCotizacionCaja.setValue(null);
				   txtIngresoBaseCotizacionCaja.setDisabled(false);	
				}
        			    if(txtIngresoBaseCotizacionSenaIcbf != null){
				   txtIngresoBaseCotizacionSenaIcbf.setValue(null);
				   txtIngresoBaseCotizacionSenaIcbf.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoria != null){
				   txtCotizaciónObligatoria.setValue(null);
				   txtCotizaciónObligatoria.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoriaArp != null){
				   txtCotizaciónObligatoriaArp.setValue(null);
				   txtCotizaciónObligatoriaArp.setDisabled(false);	
				}
        			    if(txtCodigoCentroTrabajo != null){
				   txtCodigoCentroTrabajo.setValue(null);
				   txtCodigoCentroTrabajo.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoriaAfp != null){
				   txtCotizaciónObligatoriaAfp.setValue(null);
				   txtCotizaciónObligatoriaAfp.setDisabled(false);	
				}
        			    if(txtValorFpsolidaridad != null){
				   txtValorFpsolidaridad.setValue(null);
				   txtValorFpsolidaridad.setDisabled(false);	
				}
        			    if(txtValorFpsubsistencia != null){
				   txtValorFpsubsistencia.setValue(null);
				   txtValorFpsubsistencia.setDisabled(false);	
				}
        			    if(txtRiesgos != null){
				   txtRiesgos.setValue(null);
				   txtRiesgos.setDisabled(false);	
				}
        			    if(txtPorcEps != null){
				   txtPorcEps.setValue(null);
				   txtPorcEps.setDisabled(false);	
				}
        			    if(txtPorcRiesgo != null){
				   txtPorcRiesgo.setValue(null);
				   txtPorcRiesgo.setDisabled(false);	
				}
        			    if(txtPorcAfp != null){
				   txtPorcAfp.setValue(null);
				   txtPorcAfp.setDisabled(false);	
				}
        			    if(txtPorcCaja != null){
				   txtPorcCaja.setValue(null);
				   txtPorcCaja.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoriaCaja != null){
				   txtCotizaciónObligatoriaCaja.setValue(null);
				   txtCotizaciónObligatoriaCaja.setDisabled(false);	
				}
        			    if(txtPorcSena != null){
				   txtPorcSena.setValue(null);
				   txtPorcSena.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoriaSena != null){
				   txtCotizaciónObligatoriaSena.setValue(null);
				   txtCotizaciónObligatoriaSena.setDisabled(false);	
				}
        			    if(txtPorcIcbf != null){
				   txtPorcIcbf.setValue(null);
				   txtPorcIcbf.setDisabled(false);	
				}
        			    if(txtCotizaciónObligatoriaIcbf != null){
				   txtCotizaciónObligatoriaIcbf.setValue(null);
				   txtCotizaciónObligatoriaIcbf.setDisabled(false);	
				}
        			    if(txtDetaPlanPrimeraEps != null){
				   txtDetaPlanPrimeraEps.setValue(null);
				   txtDetaPlanPrimeraEps.setDisabled(false);	
				}
        			    if(txtDetaPlanPrimeraArp != null){
				   txtDetaPlanPrimeraArp.setValue(null);
				   txtDetaPlanPrimeraArp.setDisabled(false);	
				}
        			    if(txtDetaPlanPrimeraAfp != null){
				   txtDetaPlanPrimeraAfp.setValue(null);
				   txtDetaPlanPrimeraAfp.setDisabled(false);	
				}
        			    if(txtDetaPlanPrimeraCaja != null){
				   txtDetaPlanPrimeraCaja.setValue(null);
				   txtDetaPlanPrimeraCaja.setDisabled(false);	
				}
        			    if(txtIng != null){
				   txtIng.setValue(null);
				   txtIng.setDisabled(false);	
				}
        			    if(txtRet != null){
				   txtRet.setValue(null);
				   txtRet.setDisabled(false);	
				}
        			    if(txtTde != null){
				   txtTde.setValue(null);
				   txtTde.setDisabled(false);	
				}
        			    if(txtTae != null){
				   txtTae.setValue(null);
				   txtTae.setDisabled(false);	
				}
        			    if(txtCodiEpsTraslado != null){
				   txtCodiEpsTraslado.setValue(null);
				   txtCodiEpsTraslado.setDisabled(false);	
				}
        			    if(txtTdp != null){
				   txtTdp.setValue(null);
				   txtTdp.setDisabled(false);	
				}
        			    if(txtTap != null){
				   txtTap.setValue(null);
				   txtTap.setDisabled(false);	
				}
        			    if(txtCodiAfpTraslado != null){
				   txtCodiAfpTraslado.setValue(null);
				   txtCodiAfpTraslado.setDisabled(false);	
				}
        			    if(txtTda != null){
				   txtTda.setValue(null);
				   txtTda.setDisabled(false);	
				}
        			    if(txtTaa != null){
				   txtTaa.setValue(null);
				   txtTaa.setDisabled(false);	
				}
        			    if(txtVsp != null){
				   txtVsp.setValue(null);
				   txtVsp.setDisabled(false);	
				}
        			    if(txtVte != null){
				   txtVte.setValue(null);
				   txtVte.setDisabled(false);	
				}
        			    if(txtVst != null){
				   txtVst.setValue(null);
				   txtVst.setDisabled(false);	
				}
        			    if(txtSln != null){
				   txtSln.setValue(null);
				   txtSln.setDisabled(false);	
				}
        			    if(txtIge != null){
				   txtIge.setValue(null);
				   txtIge.setDisabled(false);	
				}
        			    if(txtLma != null){
				   txtLma.setValue(null);
				   txtLma.setDisabled(false);	
				}
        			    if(txtVac != null){
				   txtVac.setValue(null);
				   txtVac.setDisabled(false);	
				}
        			    if(txtAvp != null){
				   txtAvp.setValue(null);
				   txtAvp.setDisabled(false);	
				}
        			    if(txtVct != null){
				   txtVct.setValue(null);
				   txtVct.setDisabled(false);	
				}
        			    if(txtIrp != null){
				   txtIrp.setValue(null);
				   txtIrp.setDisabled(false);	
				}
        			    if(txtCodUsuario != null){
				   txtCodUsuario.setValue(null);
				   txtCodUsuario.setDisabled(false);	
				}
                        if(btnSave != null){
		  btnSave.setDisabled(true);
		}
		if (btnDelete != null) {
        	btnDelete.setDisabled(true);
        }
        return "";
        }

										
	public void listener_txtId(){
    
	    try {
	    	        Tlp00002Id id = new Tlp00002Id();
	    	        id.setNumPlanilla((txtNumPlanilla.getValue())==null||(txtNumPlanilla.getValue()).equals("")?null: FacesUtils.checkString(txtNumPlanilla));
	    	        id.setCodiEps((txtCodiEps.getValue())==null||(txtCodiEps.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEps));
	    	        id.setCodiArp((txtCodiArp.getValue())==null||(txtCodiArp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiArp));
	    	        id.setCodiAfp((txtCodiAfp.getValue())==null||(txtCodiAfp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfp));
	    	        id.setCodiCaja((txtCodiCaja.getValue())==null||(txtCodiCaja.getValue()).equals("")?null: FacesUtils.checkString(txtCodiCaja));
	    	        id.setCotizante((txtCotizante.getValue())==null||(txtCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCotizante));
	    	        id.setCodEmpresaEmp((txtCodEmpresaEmp.getValue())==null||(txtCodEmpresaEmp.getValue()).equals("")?null: FacesUtils.checkString(txtCodEmpresaEmp));
	    	        id.setCiuLaboralCotizante((txtCiuLaboralCotizante.getValue())==null||(txtCiuLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCiuLaboralCotizante));
	    	        id.setDepLaboralCotizante((txtDepLaboralCotizante.getValue())==null||(txtDepLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtDepLaboralCotizante));
	    	        id.setTipocotizante((txtTipocotizante.getValue())==null||(txtTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtTipocotizante));
	    	        id.setSubTipocotizante((txtSubTipocotizante.getValue())==null||(txtSubTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtSubTipocotizante));
	    	        id.setDiasCotizados((txtDiasCotizados.getValue())==null||(txtDiasCotizados.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizados));
	    	        id.setDiasCotizadosArp((txtDiasCotizadosArp.getValue())==null||(txtDiasCotizadosArp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosArp));
	    	        id.setDiasCotizadosAfp((txtDiasCotizadosAfp.getValue())==null||(txtDiasCotizadosAfp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosAfp));
	    	        id.setDiasCotizadosCaja((txtDiasCotizadosCaja.getValue())==null||(txtDiasCotizadosCaja.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosCaja));
	    	        id.setSalarioBasico((txtSalarioBasico.getValue())==null||(txtSalarioBasico.getValue()).equals("")?null: FacesUtils.checkDouble(txtSalarioBasico));
	    	        id.setSalarioCIntegral((txtSalarioCIntegral.getValue())==null||(txtSalarioCIntegral.getValue()).equals("")?null: FacesUtils.checkString(txtSalarioCIntegral));
	    	        id.setPlanillaEps((txtPlanillaEps.getValue())==null||(txtPlanillaEps.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaEps));
	    	        id.setPlanillaArp((txtPlanillaArp.getValue())==null||(txtPlanillaArp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaArp));
	    	        id.setPlanillaAfp((txtPlanillaAfp.getValue())==null||(txtPlanillaAfp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaAfp));
	    	        id.setPlanillaCaja((txtPlanillaCaja.getValue())==null||(txtPlanillaCaja.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaCaja));
	    	        id.setNumAuincapacidad((txtNumAuincapacidad.getValue())==null||(txtNumAuincapacidad.getValue()).equals("")?null: FacesUtils.checkString(txtNumAuincapacidad));
	    	        id.setValorIncapacidad((txtValorIncapacidad.getValue())==null||(txtValorIncapacidad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorIncapacidad));
	    	        id.setNumAulicenciaM((txtNumAulicenciaM.getValue())==null||(txtNumAulicenciaM.getValue()).equals("")?null: FacesUtils.checkString(txtNumAulicenciaM));
	    	        id.setValorLicenciaM((txtValorLicenciaM.getValue())==null||(txtValorLicenciaM.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorLicenciaM));
	    	        id.setValorUpcAdicional((txtValorUpcAdicional.getValue())==null||(txtValorUpcAdicional.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorUpcAdicional));
	    	        id.setIngresoBaseCotizacion((txtIngresoBaseCotizacion.getValue())==null||(txtIngresoBaseCotizacion.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacion));
	    	        id.setIngresoBaseCotizacionArp((txtIngresoBaseCotizacionArp.getValue())==null||(txtIngresoBaseCotizacionArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionArp));
	    	        id.setIngresoBaseCotizacionAfp((txtIngresoBaseCotizacionAfp.getValue())==null||(txtIngresoBaseCotizacionAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionAfp));
	    	        id.setIngresoBaseCotizacionCaja((txtIngresoBaseCotizacionCaja.getValue())==null||(txtIngresoBaseCotizacionCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionCaja));
	    	        id.setIngresoBaseCotizacionSenaIcbf((txtIngresoBaseCotizacionSenaIcbf.getValue())==null||(txtIngresoBaseCotizacionSenaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionSenaIcbf));
	    	        id.setCotizaciónObligatoria((txtCotizaciónObligatoria.getValue())==null||(txtCotizaciónObligatoria.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoria));
	    	        id.setCotizaciónObligatoriaArp((txtCotizaciónObligatoriaArp.getValue())==null||(txtCotizaciónObligatoriaArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaArp));
	    	        id.setCodigoCentroTrabajo((txtCodigoCentroTrabajo.getValue())==null||(txtCodigoCentroTrabajo.getValue()).equals("")?null: FacesUtils.checkString(txtCodigoCentroTrabajo));
	    	        id.setCotizaciónObligatoriaAfp((txtCotizaciónObligatoriaAfp.getValue())==null||(txtCotizaciónObligatoriaAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaAfp));
	    	        id.setValorFpsolidaridad((txtValorFpsolidaridad.getValue())==null||(txtValorFpsolidaridad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsolidaridad));
	    	        id.setValorFpsubsistencia((txtValorFpsubsistencia.getValue())==null||(txtValorFpsubsistencia.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsubsistencia));
	    	        id.setRiesgos((txtRiesgos.getValue())==null||(txtRiesgos.getValue()).equals("")?null: FacesUtils.checkInteger(txtRiesgos));
	    	        id.setPorcEps((txtPorcEps.getValue())==null||(txtPorcEps.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcEps));
	    	        id.setPorcRiesgo((txtPorcRiesgo.getValue())==null||(txtPorcRiesgo.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcRiesgo));
	    	        id.setPorcAfp((txtPorcAfp.getValue())==null||(txtPorcAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcAfp));
	    	        id.setPorcCaja((txtPorcCaja.getValue())==null||(txtPorcCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcCaja));
	    	        id.setCotizaciónObligatoriaCaja((txtCotizaciónObligatoriaCaja.getValue())==null||(txtCotizaciónObligatoriaCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaCaja));
	    	        id.setPorcSena((txtPorcSena.getValue())==null||(txtPorcSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcSena));
	    	        id.setCotizaciónObligatoriaSena((txtCotizaciónObligatoriaSena.getValue())==null||(txtCotizaciónObligatoriaSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaSena));
	    	        id.setPorcIcbf((txtPorcIcbf.getValue())==null||(txtPorcIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcIcbf));
	    	        id.setCotizaciónObligatoriaIcbf((txtCotizaciónObligatoriaIcbf.getValue())==null||(txtCotizaciónObligatoriaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaIcbf));
	    	        id.setDetaPlanPrimeraEps((txtDetaPlanPrimeraEps.getValue())==null||(txtDetaPlanPrimeraEps.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraEps));
	    	        id.setDetaPlanPrimeraArp((txtDetaPlanPrimeraArp.getValue())==null||(txtDetaPlanPrimeraArp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraArp));
	    	        id.setDetaPlanPrimeraAfp((txtDetaPlanPrimeraAfp.getValue())==null||(txtDetaPlanPrimeraAfp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraAfp));
	    	        id.setDetaPlanPrimeraCaja((txtDetaPlanPrimeraCaja.getValue())==null||(txtDetaPlanPrimeraCaja.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraCaja));
	    	        id.setIng((txtIng.getValue())==null||(txtIng.getValue()).equals("")?null: FacesUtils.checkString(txtIng));
	    	        id.setRet((txtRet.getValue())==null||(txtRet.getValue()).equals("")?null: FacesUtils.checkString(txtRet));
	    	        id.setTde((txtTde.getValue())==null||(txtTde.getValue()).equals("")?null: FacesUtils.checkString(txtTde));
	    	        id.setTae((txtTae.getValue())==null||(txtTae.getValue()).equals("")?null: FacesUtils.checkString(txtTae));
	    	        id.setCodiEpsTraslado((txtCodiEpsTraslado.getValue())==null||(txtCodiEpsTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEpsTraslado));
	    	        id.setTdp((txtTdp.getValue())==null||(txtTdp.getValue()).equals("")?null: FacesUtils.checkString(txtTdp));
	    	        id.setTap((txtTap.getValue())==null||(txtTap.getValue()).equals("")?null: FacesUtils.checkString(txtTap));
	    	        id.setCodiAfpTraslado((txtCodiAfpTraslado.getValue())==null||(txtCodiAfpTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfpTraslado));
	    	        id.setTda((txtTda.getValue())==null||(txtTda.getValue()).equals("")?null: FacesUtils.checkString(txtTda));
	    	        id.setTaa((txtTaa.getValue())==null||(txtTaa.getValue()).equals("")?null: FacesUtils.checkString(txtTaa));
	    	        id.setVsp((txtVsp.getValue())==null||(txtVsp.getValue()).equals("")?null: FacesUtils.checkString(txtVsp));
	    	        id.setVte((txtVte.getValue())==null||(txtVte.getValue()).equals("")?null: FacesUtils.checkString(txtVte));
	    	        id.setVst((txtVst.getValue())==null||(txtVst.getValue()).equals("")?null: FacesUtils.checkString(txtVst));
	    	        id.setSln((txtSln.getValue())==null||(txtSln.getValue()).equals("")?null: FacesUtils.checkString(txtSln));
	    	        id.setIge((txtIge.getValue())==null||(txtIge.getValue()).equals("")?null: FacesUtils.checkString(txtIge));
	    	        id.setLma((txtLma.getValue())==null||(txtLma.getValue()).equals("")?null: FacesUtils.checkString(txtLma));
	    	        id.setVac((txtVac.getValue())==null||(txtVac.getValue()).equals("")?null: FacesUtils.checkString(txtVac));
	    	        id.setAvp((txtAvp.getValue())==null||(txtAvp.getValue()).equals("")?null: FacesUtils.checkString(txtAvp));
	    	        id.setVct((txtVct.getValue())==null||(txtVct.getValue()).equals("")?null: FacesUtils.checkString(txtVct));
	    	        id.setIrp((txtIrp.getValue())==null||(txtIrp.getValue()).equals("")?null: FacesUtils.checkString(txtIrp));
	    	        id.setCodUsuario((txtCodUsuario.getValue())==null||(txtCodUsuario.getValue()).equals("")?null: FacesUtils.checkString(txtCodUsuario));
	    	    	entity = id != null ? businessDelegatorView.getTlp00002(id) : null;
	    } catch (Exception e) {
	    	entity = null;
	    }
	    
		if(entity==null){
	    	        txtCodEps_Tp000003.setDisabled(false);
	    	    	    	        txtNumPlanilla.setDisabled(false);
	    	        txtCodiEps.setDisabled(false);
	    	        txtCodiArp.setDisabled(false);
	    	        txtCodiAfp.setDisabled(false);
	    	        txtCodiCaja.setDisabled(false);
	    	        txtCotizante.setDisabled(false);
	    	        txtCodEmpresaEmp.setDisabled(false);
	    	        txtCiuLaboralCotizante.setDisabled(false);
	    	        txtDepLaboralCotizante.setDisabled(false);
	    	        txtTipocotizante.setDisabled(false);
	    	        txtSubTipocotizante.setDisabled(false);
	    	        txtDiasCotizados.setDisabled(false);
	    	        txtDiasCotizadosArp.setDisabled(false);
	    	        txtDiasCotizadosAfp.setDisabled(false);
	    	        txtDiasCotizadosCaja.setDisabled(false);
	    	        txtSalarioBasico.setDisabled(false);
	    	        txtSalarioCIntegral.setDisabled(false);
	    	        txtPlanillaEps.setDisabled(false);
	    	        txtPlanillaArp.setDisabled(false);
	    	        txtPlanillaAfp.setDisabled(false);
	    	        txtPlanillaCaja.setDisabled(false);
	    	        txtNumAuincapacidad.setDisabled(false);
	    	        txtValorIncapacidad.setDisabled(false);
	    	        txtNumAulicenciaM.setDisabled(false);
	    	        txtValorLicenciaM.setDisabled(false);
	    	        txtValorUpcAdicional.setDisabled(false);
	    	        txtIngresoBaseCotizacion.setDisabled(false);
	    	        txtIngresoBaseCotizacionArp.setDisabled(false);
	    	        txtIngresoBaseCotizacionAfp.setDisabled(false);
	    	        txtIngresoBaseCotizacionCaja.setDisabled(false);
	    	        txtIngresoBaseCotizacionSenaIcbf.setDisabled(false);
	    	        txtCotizaciónObligatoria.setDisabled(false);
	    	        txtCotizaciónObligatoriaArp.setDisabled(false);
	    	        txtCodigoCentroTrabajo.setDisabled(false);
	    	        txtCotizaciónObligatoriaAfp.setDisabled(false);
	    	        txtValorFpsolidaridad.setDisabled(false);
	    	        txtValorFpsubsistencia.setDisabled(false);
	    	        txtRiesgos.setDisabled(false);
	    	        txtPorcEps.setDisabled(false);
	    	        txtPorcRiesgo.setDisabled(false);
	    	        txtPorcAfp.setDisabled(false);
	    	        txtPorcCaja.setDisabled(false);
	    	        txtCotizaciónObligatoriaCaja.setDisabled(false);
	    	        txtPorcSena.setDisabled(false);
	    	        txtCotizaciónObligatoriaSena.setDisabled(false);
	    	        txtPorcIcbf.setDisabled(false);
	    	        txtCotizaciónObligatoriaIcbf.setDisabled(false);
	    	        txtDetaPlanPrimeraEps.setDisabled(false);
	    	        txtDetaPlanPrimeraArp.setDisabled(false);
	    	        txtDetaPlanPrimeraAfp.setDisabled(false);
	    	        txtDetaPlanPrimeraCaja.setDisabled(false);
	    	        txtIng.setDisabled(false);
	    	        txtRet.setDisabled(false);
	    	        txtTde.setDisabled(false);
	    	        txtTae.setDisabled(false);
	    	        txtCodiEpsTraslado.setDisabled(false);
	    	        txtTdp.setDisabled(false);
	    	        txtTap.setDisabled(false);
	    	        txtCodiAfpTraslado.setDisabled(false);
	    	        txtTda.setDisabled(false);
	    	        txtTaa.setDisabled(false);
	    	        txtVsp.setDisabled(false);
	    	        txtVte.setDisabled(false);
	    	        txtVst.setDisabled(false);
	    	        txtSln.setDisabled(false);
	    	        txtIge.setDisabled(false);
	    	        txtLma.setDisabled(false);
	    	        txtVac.setDisabled(false);
	    	        txtAvp.setDisabled(false);
	    	        txtVct.setDisabled(false);
	    	        txtIrp.setDisabled(false);
	    	        txtCodUsuario.setDisabled(false);
	    	    		    btnSave.setDisabled(false);
		    }else{
		    		        txtCodEps_Tp000003.setValue(entity.getTp000003().getCodEps());txtCodEps_Tp000003.setDisabled(false);
		    		    		        txtNumPlanilla.setValue(entity.getId().getNumPlanilla());txtNumPlanilla.setDisabled(true);
		    		        txtCodiEps.setValue(entity.getId().getCodiEps());txtCodiEps.setDisabled(true);
		    		        txtCodiArp.setValue(entity.getId().getCodiArp());txtCodiArp.setDisabled(true);
		    		        txtCodiAfp.setValue(entity.getId().getCodiAfp());txtCodiAfp.setDisabled(true);
		    		        txtCodiCaja.setValue(entity.getId().getCodiCaja());txtCodiCaja.setDisabled(true);
		    		        txtCotizante.setValue(entity.getId().getCotizante());txtCotizante.setDisabled(true);
		    		        txtCodEmpresaEmp.setValue(entity.getId().getCodEmpresaEmp());txtCodEmpresaEmp.setDisabled(true);
		    		        txtCiuLaboralCotizante.setValue(entity.getId().getCiuLaboralCotizante());txtCiuLaboralCotizante.setDisabled(true);
		    		        txtDepLaboralCotizante.setValue(entity.getId().getDepLaboralCotizante());txtDepLaboralCotizante.setDisabled(true);
		    		        txtTipocotizante.setValue(entity.getId().getTipocotizante());txtTipocotizante.setDisabled(true);
		    		        txtSubTipocotizante.setValue(entity.getId().getSubTipocotizante());txtSubTipocotizante.setDisabled(true);
		    		        txtDiasCotizados.setValue(entity.getId().getDiasCotizados());txtDiasCotizados.setDisabled(true);
		    		        txtDiasCotizadosArp.setValue(entity.getId().getDiasCotizadosArp());txtDiasCotizadosArp.setDisabled(true);
		    		        txtDiasCotizadosAfp.setValue(entity.getId().getDiasCotizadosAfp());txtDiasCotizadosAfp.setDisabled(true);
		    		        txtDiasCotizadosCaja.setValue(entity.getId().getDiasCotizadosCaja());txtDiasCotizadosCaja.setDisabled(true);
		    		        txtSalarioBasico.setValue(entity.getId().getSalarioBasico());txtSalarioBasico.setDisabled(true);
		    		        txtSalarioCIntegral.setValue(entity.getId().getSalarioCIntegral());txtSalarioCIntegral.setDisabled(true);
		    		        txtPlanillaEps.setValue(entity.getId().getPlanillaEps());txtPlanillaEps.setDisabled(true);
		    		        txtPlanillaArp.setValue(entity.getId().getPlanillaArp());txtPlanillaArp.setDisabled(true);
		    		        txtPlanillaAfp.setValue(entity.getId().getPlanillaAfp());txtPlanillaAfp.setDisabled(true);
		    		        txtPlanillaCaja.setValue(entity.getId().getPlanillaCaja());txtPlanillaCaja.setDisabled(true);
		    		        txtNumAuincapacidad.setValue(entity.getId().getNumAuincapacidad());txtNumAuincapacidad.setDisabled(true);
		    		        txtValorIncapacidad.setValue(entity.getId().getValorIncapacidad());txtValorIncapacidad.setDisabled(true);
		    		        txtNumAulicenciaM.setValue(entity.getId().getNumAulicenciaM());txtNumAulicenciaM.setDisabled(true);
		    		        txtValorLicenciaM.setValue(entity.getId().getValorLicenciaM());txtValorLicenciaM.setDisabled(true);
		    		        txtValorUpcAdicional.setValue(entity.getId().getValorUpcAdicional());txtValorUpcAdicional.setDisabled(true);
		    		        txtIngresoBaseCotizacion.setValue(entity.getId().getIngresoBaseCotizacion());txtIngresoBaseCotizacion.setDisabled(true);
		    		        txtIngresoBaseCotizacionArp.setValue(entity.getId().getIngresoBaseCotizacionArp());txtIngresoBaseCotizacionArp.setDisabled(true);
		    		        txtIngresoBaseCotizacionAfp.setValue(entity.getId().getIngresoBaseCotizacionAfp());txtIngresoBaseCotizacionAfp.setDisabled(true);
		    		        txtIngresoBaseCotizacionCaja.setValue(entity.getId().getIngresoBaseCotizacionCaja());txtIngresoBaseCotizacionCaja.setDisabled(true);
		    		        txtIngresoBaseCotizacionSenaIcbf.setValue(entity.getId().getIngresoBaseCotizacionSenaIcbf());txtIngresoBaseCotizacionSenaIcbf.setDisabled(true);
		    		        txtCotizaciónObligatoria.setValue(entity.getId().getCotizaciónObligatoria());txtCotizaciónObligatoria.setDisabled(true);
		    		        txtCotizaciónObligatoriaArp.setValue(entity.getId().getCotizaciónObligatoriaArp());txtCotizaciónObligatoriaArp.setDisabled(true);
		    		        txtCodigoCentroTrabajo.setValue(entity.getId().getCodigoCentroTrabajo());txtCodigoCentroTrabajo.setDisabled(true);
		    		        txtCotizaciónObligatoriaAfp.setValue(entity.getId().getCotizaciónObligatoriaAfp());txtCotizaciónObligatoriaAfp.setDisabled(true);
		    		        txtValorFpsolidaridad.setValue(entity.getId().getValorFpsolidaridad());txtValorFpsolidaridad.setDisabled(true);
		    		        txtValorFpsubsistencia.setValue(entity.getId().getValorFpsubsistencia());txtValorFpsubsistencia.setDisabled(true);
		    		        txtRiesgos.setValue(entity.getId().getRiesgos());txtRiesgos.setDisabled(true);
		    		        txtPorcEps.setValue(entity.getId().getPorcEps());txtPorcEps.setDisabled(true);
		    		        txtPorcRiesgo.setValue(entity.getId().getPorcRiesgo());txtPorcRiesgo.setDisabled(true);
		    		        txtPorcAfp.setValue(entity.getId().getPorcAfp());txtPorcAfp.setDisabled(true);
		    		        txtPorcCaja.setValue(entity.getId().getPorcCaja());txtPorcCaja.setDisabled(true);
		    		        txtCotizaciónObligatoriaCaja.setValue(entity.getId().getCotizaciónObligatoriaCaja());txtCotizaciónObligatoriaCaja.setDisabled(true);
		    		        txtPorcSena.setValue(entity.getId().getPorcSena());txtPorcSena.setDisabled(true);
		    		        txtCotizaciónObligatoriaSena.setValue(entity.getId().getCotizaciónObligatoriaSena());txtCotizaciónObligatoriaSena.setDisabled(true);
		    		        txtPorcIcbf.setValue(entity.getId().getPorcIcbf());txtPorcIcbf.setDisabled(true);
		    		        txtCotizaciónObligatoriaIcbf.setValue(entity.getId().getCotizaciónObligatoriaIcbf());txtCotizaciónObligatoriaIcbf.setDisabled(true);
		    		        txtDetaPlanPrimeraEps.setValue(entity.getId().getDetaPlanPrimeraEps());txtDetaPlanPrimeraEps.setDisabled(true);
		    		        txtDetaPlanPrimeraArp.setValue(entity.getId().getDetaPlanPrimeraArp());txtDetaPlanPrimeraArp.setDisabled(true);
		    		        txtDetaPlanPrimeraAfp.setValue(entity.getId().getDetaPlanPrimeraAfp());txtDetaPlanPrimeraAfp.setDisabled(true);
		    		        txtDetaPlanPrimeraCaja.setValue(entity.getId().getDetaPlanPrimeraCaja());txtDetaPlanPrimeraCaja.setDisabled(true);
		    		        txtIng.setValue(entity.getId().getIng());txtIng.setDisabled(true);
		    		        txtRet.setValue(entity.getId().getRet());txtRet.setDisabled(true);
		    		        txtTde.setValue(entity.getId().getTde());txtTde.setDisabled(true);
		    		        txtTae.setValue(entity.getId().getTae());txtTae.setDisabled(true);
		    		        txtCodiEpsTraslado.setValue(entity.getId().getCodiEpsTraslado());txtCodiEpsTraslado.setDisabled(true);
		    		        txtTdp.setValue(entity.getId().getTdp());txtTdp.setDisabled(true);
		    		        txtTap.setValue(entity.getId().getTap());txtTap.setDisabled(true);
		    		        txtCodiAfpTraslado.setValue(entity.getId().getCodiAfpTraslado());txtCodiAfpTraslado.setDisabled(true);
		    		        txtTda.setValue(entity.getId().getTda());txtTda.setDisabled(true);
		    		        txtTaa.setValue(entity.getId().getTaa());txtTaa.setDisabled(true);
		    		        txtVsp.setValue(entity.getId().getVsp());txtVsp.setDisabled(true);
		    		        txtVte.setValue(entity.getId().getVte());txtVte.setDisabled(true);
		    		        txtVst.setValue(entity.getId().getVst());txtVst.setDisabled(true);
		    		        txtSln.setValue(entity.getId().getSln());txtSln.setDisabled(true);
		    		        txtIge.setValue(entity.getId().getIge());txtIge.setDisabled(true);
		    		        txtLma.setValue(entity.getId().getLma());txtLma.setDisabled(true);
		    		        txtVac.setValue(entity.getId().getVac());txtVac.setDisabled(true);
		    		        txtAvp.setValue(entity.getId().getAvp());txtAvp.setDisabled(true);
		    		        txtVct.setValue(entity.getId().getVct());txtVct.setDisabled(true);
		    		        txtIrp.setValue(entity.getId().getIrp());txtIrp.setDisabled(true);
		    		        txtCodUsuario.setValue(entity.getId().getCodUsuario());txtCodUsuario.setDisabled(true);
		    		    btnSave.setDisabled(false);
		    if(btnDelete!=null){
		    	btnDelete.setDisabled(false);
		    }
	    }
    }
        
	public String action_edit(ActionEvent evt){
    	
    	selectedTlp00002 = (Tlp00002DTO)(evt.getComponent().getAttributes().get("selectedTlp00002"));		
            txtCodEps_Tp000003.setValue(selectedTlp00002.getCodEps_Tp000003());txtCodEps_Tp000003.setDisabled(false);
                txtNumPlanilla.setValue(selectedTlp00002.getNumPlanilla());txtNumPlanilla.setDisabled(true);
            txtCodiEps.setValue(selectedTlp00002.getCodiEps());txtCodiEps.setDisabled(true);
            txtCodiArp.setValue(selectedTlp00002.getCodiArp());txtCodiArp.setDisabled(true);
            txtCodiAfp.setValue(selectedTlp00002.getCodiAfp());txtCodiAfp.setDisabled(true);
            txtCodiCaja.setValue(selectedTlp00002.getCodiCaja());txtCodiCaja.setDisabled(true);
            txtCotizante.setValue(selectedTlp00002.getCotizante());txtCotizante.setDisabled(true);
            txtCodEmpresaEmp.setValue(selectedTlp00002.getCodEmpresaEmp());txtCodEmpresaEmp.setDisabled(true);
            txtCiuLaboralCotizante.setValue(selectedTlp00002.getCiuLaboralCotizante());txtCiuLaboralCotizante.setDisabled(true);
            txtDepLaboralCotizante.setValue(selectedTlp00002.getDepLaboralCotizante());txtDepLaboralCotizante.setDisabled(true);
            txtTipocotizante.setValue(selectedTlp00002.getTipocotizante());txtTipocotizante.setDisabled(true);
            txtSubTipocotizante.setValue(selectedTlp00002.getSubTipocotizante());txtSubTipocotizante.setDisabled(true);
            txtDiasCotizados.setValue(selectedTlp00002.getDiasCotizados());txtDiasCotizados.setDisabled(true);
            txtDiasCotizadosArp.setValue(selectedTlp00002.getDiasCotizadosArp());txtDiasCotizadosArp.setDisabled(true);
            txtDiasCotizadosAfp.setValue(selectedTlp00002.getDiasCotizadosAfp());txtDiasCotizadosAfp.setDisabled(true);
            txtDiasCotizadosCaja.setValue(selectedTlp00002.getDiasCotizadosCaja());txtDiasCotizadosCaja.setDisabled(true);
            txtSalarioBasico.setValue(selectedTlp00002.getSalarioBasico());txtSalarioBasico.setDisabled(true);
            txtSalarioCIntegral.setValue(selectedTlp00002.getSalarioCIntegral());txtSalarioCIntegral.setDisabled(true);
            txtPlanillaEps.setValue(selectedTlp00002.getPlanillaEps());txtPlanillaEps.setDisabled(true);
            txtPlanillaArp.setValue(selectedTlp00002.getPlanillaArp());txtPlanillaArp.setDisabled(true);
            txtPlanillaAfp.setValue(selectedTlp00002.getPlanillaAfp());txtPlanillaAfp.setDisabled(true);
            txtPlanillaCaja.setValue(selectedTlp00002.getPlanillaCaja());txtPlanillaCaja.setDisabled(true);
            txtNumAuincapacidad.setValue(selectedTlp00002.getNumAuincapacidad());txtNumAuincapacidad.setDisabled(true);
            txtValorIncapacidad.setValue(selectedTlp00002.getValorIncapacidad());txtValorIncapacidad.setDisabled(true);
            txtNumAulicenciaM.setValue(selectedTlp00002.getNumAulicenciaM());txtNumAulicenciaM.setDisabled(true);
            txtValorLicenciaM.setValue(selectedTlp00002.getValorLicenciaM());txtValorLicenciaM.setDisabled(true);
            txtValorUpcAdicional.setValue(selectedTlp00002.getValorUpcAdicional());txtValorUpcAdicional.setDisabled(true);
            txtIngresoBaseCotizacion.setValue(selectedTlp00002.getIngresoBaseCotizacion());txtIngresoBaseCotizacion.setDisabled(true);
            txtIngresoBaseCotizacionArp.setValue(selectedTlp00002.getIngresoBaseCotizacionArp());txtIngresoBaseCotizacionArp.setDisabled(true);
            txtIngresoBaseCotizacionAfp.setValue(selectedTlp00002.getIngresoBaseCotizacionAfp());txtIngresoBaseCotizacionAfp.setDisabled(true);
            txtIngresoBaseCotizacionCaja.setValue(selectedTlp00002.getIngresoBaseCotizacionCaja());txtIngresoBaseCotizacionCaja.setDisabled(true);
            txtIngresoBaseCotizacionSenaIcbf.setValue(selectedTlp00002.getIngresoBaseCotizacionSenaIcbf());txtIngresoBaseCotizacionSenaIcbf.setDisabled(true);
            txtCotizaciónObligatoria.setValue(selectedTlp00002.getCotizaciónObligatoria());txtCotizaciónObligatoria.setDisabled(true);
            txtCotizaciónObligatoriaArp.setValue(selectedTlp00002.getCotizaciónObligatoriaArp());txtCotizaciónObligatoriaArp.setDisabled(true);
            txtCodigoCentroTrabajo.setValue(selectedTlp00002.getCodigoCentroTrabajo());txtCodigoCentroTrabajo.setDisabled(true);
            txtCotizaciónObligatoriaAfp.setValue(selectedTlp00002.getCotizaciónObligatoriaAfp());txtCotizaciónObligatoriaAfp.setDisabled(true);
            txtValorFpsolidaridad.setValue(selectedTlp00002.getValorFpsolidaridad());txtValorFpsolidaridad.setDisabled(true);
            txtValorFpsubsistencia.setValue(selectedTlp00002.getValorFpsubsistencia());txtValorFpsubsistencia.setDisabled(true);
            txtRiesgos.setValue(selectedTlp00002.getRiesgos());txtRiesgos.setDisabled(true);
            txtPorcEps.setValue(selectedTlp00002.getPorcEps());txtPorcEps.setDisabled(true);
            txtPorcRiesgo.setValue(selectedTlp00002.getPorcRiesgo());txtPorcRiesgo.setDisabled(true);
            txtPorcAfp.setValue(selectedTlp00002.getPorcAfp());txtPorcAfp.setDisabled(true);
            txtPorcCaja.setValue(selectedTlp00002.getPorcCaja());txtPorcCaja.setDisabled(true);
            txtCotizaciónObligatoriaCaja.setValue(selectedTlp00002.getCotizaciónObligatoriaCaja());txtCotizaciónObligatoriaCaja.setDisabled(true);
            txtPorcSena.setValue(selectedTlp00002.getPorcSena());txtPorcSena.setDisabled(true);
            txtCotizaciónObligatoriaSena.setValue(selectedTlp00002.getCotizaciónObligatoriaSena());txtCotizaciónObligatoriaSena.setDisabled(true);
            txtPorcIcbf.setValue(selectedTlp00002.getPorcIcbf());txtPorcIcbf.setDisabled(true);
            txtCotizaciónObligatoriaIcbf.setValue(selectedTlp00002.getCotizaciónObligatoriaIcbf());txtCotizaciónObligatoriaIcbf.setDisabled(true);
            txtDetaPlanPrimeraEps.setValue(selectedTlp00002.getDetaPlanPrimeraEps());txtDetaPlanPrimeraEps.setDisabled(true);
            txtDetaPlanPrimeraArp.setValue(selectedTlp00002.getDetaPlanPrimeraArp());txtDetaPlanPrimeraArp.setDisabled(true);
            txtDetaPlanPrimeraAfp.setValue(selectedTlp00002.getDetaPlanPrimeraAfp());txtDetaPlanPrimeraAfp.setDisabled(true);
            txtDetaPlanPrimeraCaja.setValue(selectedTlp00002.getDetaPlanPrimeraCaja());txtDetaPlanPrimeraCaja.setDisabled(true);
            txtIng.setValue(selectedTlp00002.getIng());txtIng.setDisabled(true);
            txtRet.setValue(selectedTlp00002.getRet());txtRet.setDisabled(true);
            txtTde.setValue(selectedTlp00002.getTde());txtTde.setDisabled(true);
            txtTae.setValue(selectedTlp00002.getTae());txtTae.setDisabled(true);
            txtCodiEpsTraslado.setValue(selectedTlp00002.getCodiEpsTraslado());txtCodiEpsTraslado.setDisabled(true);
            txtTdp.setValue(selectedTlp00002.getTdp());txtTdp.setDisabled(true);
            txtTap.setValue(selectedTlp00002.getTap());txtTap.setDisabled(true);
            txtCodiAfpTraslado.setValue(selectedTlp00002.getCodiAfpTraslado());txtCodiAfpTraslado.setDisabled(true);
            txtTda.setValue(selectedTlp00002.getTda());txtTda.setDisabled(true);
            txtTaa.setValue(selectedTlp00002.getTaa());txtTaa.setDisabled(true);
            txtVsp.setValue(selectedTlp00002.getVsp());txtVsp.setDisabled(true);
            txtVte.setValue(selectedTlp00002.getVte());txtVte.setDisabled(true);
            txtVst.setValue(selectedTlp00002.getVst());txtVst.setDisabled(true);
            txtSln.setValue(selectedTlp00002.getSln());txtSln.setDisabled(true);
            txtIge.setValue(selectedTlp00002.getIge());txtIge.setDisabled(true);
            txtLma.setValue(selectedTlp00002.getLma());txtLma.setDisabled(true);
            txtVac.setValue(selectedTlp00002.getVac());txtVac.setDisabled(true);
            txtAvp.setValue(selectedTlp00002.getAvp());txtAvp.setDisabled(true);
            txtVct.setValue(selectedTlp00002.getVct());txtVct.setDisabled(true);
            txtIrp.setValue(selectedTlp00002.getIrp());txtIrp.setDisabled(true);
            txtCodUsuario.setValue(selectedTlp00002.getCodUsuario());txtCodUsuario.setDisabled(true);
            btnSave.setDisabled(false);
    	setShowDialog(true);

    	return "";
    }
    
    public String action_save(){    	
        try {        	
        	if(selectedTlp00002 == null && entity==null){
        		action_create();
        	}else{
        		action_modify();
        	}
        	data = null;
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    	
    }
    
    public String action_create() {
        try {
        	entity = new Tlp00002();

	    	        Tlp00002Id id = new Tlp00002Id();
	    	        id.setNumPlanilla((txtNumPlanilla.getValue())==null||(txtNumPlanilla.getValue()).equals("")?null: FacesUtils.checkString(txtNumPlanilla));
	    	        id.setCodiEps((txtCodiEps.getValue())==null||(txtCodiEps.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEps));
	    	        id.setCodiArp((txtCodiArp.getValue())==null||(txtCodiArp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiArp));
	    	        id.setCodiAfp((txtCodiAfp.getValue())==null||(txtCodiAfp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfp));
	    	        id.setCodiCaja((txtCodiCaja.getValue())==null||(txtCodiCaja.getValue()).equals("")?null: FacesUtils.checkString(txtCodiCaja));
	    	        id.setCotizante((txtCotizante.getValue())==null||(txtCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCotizante));
	    	        id.setCodEmpresaEmp((txtCodEmpresaEmp.getValue())==null||(txtCodEmpresaEmp.getValue()).equals("")?null: FacesUtils.checkString(txtCodEmpresaEmp));
	    	        id.setCiuLaboralCotizante((txtCiuLaboralCotizante.getValue())==null||(txtCiuLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCiuLaboralCotizante));
	    	        id.setDepLaboralCotizante((txtDepLaboralCotizante.getValue())==null||(txtDepLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtDepLaboralCotizante));
	    	        id.setTipocotizante((txtTipocotizante.getValue())==null||(txtTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtTipocotizante));
	    	        id.setSubTipocotizante((txtSubTipocotizante.getValue())==null||(txtSubTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtSubTipocotizante));
	    	        id.setDiasCotizados((txtDiasCotizados.getValue())==null||(txtDiasCotizados.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizados));
	    	        id.setDiasCotizadosArp((txtDiasCotizadosArp.getValue())==null||(txtDiasCotizadosArp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosArp));
	    	        id.setDiasCotizadosAfp((txtDiasCotizadosAfp.getValue())==null||(txtDiasCotizadosAfp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosAfp));
	    	        id.setDiasCotizadosCaja((txtDiasCotizadosCaja.getValue())==null||(txtDiasCotizadosCaja.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosCaja));
	    	        id.setSalarioBasico((txtSalarioBasico.getValue())==null||(txtSalarioBasico.getValue()).equals("")?null: FacesUtils.checkDouble(txtSalarioBasico));
	    	        id.setSalarioCIntegral((txtSalarioCIntegral.getValue())==null||(txtSalarioCIntegral.getValue()).equals("")?null: FacesUtils.checkString(txtSalarioCIntegral));
	    	        id.setPlanillaEps((txtPlanillaEps.getValue())==null||(txtPlanillaEps.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaEps));
	    	        id.setPlanillaArp((txtPlanillaArp.getValue())==null||(txtPlanillaArp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaArp));
	    	        id.setPlanillaAfp((txtPlanillaAfp.getValue())==null||(txtPlanillaAfp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaAfp));
	    	        id.setPlanillaCaja((txtPlanillaCaja.getValue())==null||(txtPlanillaCaja.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaCaja));
	    	        id.setNumAuincapacidad((txtNumAuincapacidad.getValue())==null||(txtNumAuincapacidad.getValue()).equals("")?null: FacesUtils.checkString(txtNumAuincapacidad));
	    	        id.setValorIncapacidad((txtValorIncapacidad.getValue())==null||(txtValorIncapacidad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorIncapacidad));
	    	        id.setNumAulicenciaM((txtNumAulicenciaM.getValue())==null||(txtNumAulicenciaM.getValue()).equals("")?null: FacesUtils.checkString(txtNumAulicenciaM));
	    	        id.setValorLicenciaM((txtValorLicenciaM.getValue())==null||(txtValorLicenciaM.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorLicenciaM));
	    	        id.setValorUpcAdicional((txtValorUpcAdicional.getValue())==null||(txtValorUpcAdicional.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorUpcAdicional));
	    	        id.setIngresoBaseCotizacion((txtIngresoBaseCotizacion.getValue())==null||(txtIngresoBaseCotizacion.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacion));
	    	        id.setIngresoBaseCotizacionArp((txtIngresoBaseCotizacionArp.getValue())==null||(txtIngresoBaseCotizacionArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionArp));
	    	        id.setIngresoBaseCotizacionAfp((txtIngresoBaseCotizacionAfp.getValue())==null||(txtIngresoBaseCotizacionAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionAfp));
	    	        id.setIngresoBaseCotizacionCaja((txtIngresoBaseCotizacionCaja.getValue())==null||(txtIngresoBaseCotizacionCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionCaja));
	    	        id.setIngresoBaseCotizacionSenaIcbf((txtIngresoBaseCotizacionSenaIcbf.getValue())==null||(txtIngresoBaseCotizacionSenaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionSenaIcbf));
	    	        id.setCotizaciónObligatoria((txtCotizaciónObligatoria.getValue())==null||(txtCotizaciónObligatoria.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoria));
	    	        id.setCotizaciónObligatoriaArp((txtCotizaciónObligatoriaArp.getValue())==null||(txtCotizaciónObligatoriaArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaArp));
	    	        id.setCodigoCentroTrabajo((txtCodigoCentroTrabajo.getValue())==null||(txtCodigoCentroTrabajo.getValue()).equals("")?null: FacesUtils.checkString(txtCodigoCentroTrabajo));
	    	        id.setCotizaciónObligatoriaAfp((txtCotizaciónObligatoriaAfp.getValue())==null||(txtCotizaciónObligatoriaAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaAfp));
	    	        id.setValorFpsolidaridad((txtValorFpsolidaridad.getValue())==null||(txtValorFpsolidaridad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsolidaridad));
	    	        id.setValorFpsubsistencia((txtValorFpsubsistencia.getValue())==null||(txtValorFpsubsistencia.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsubsistencia));
	    	        id.setRiesgos((txtRiesgos.getValue())==null||(txtRiesgos.getValue()).equals("")?null: FacesUtils.checkInteger(txtRiesgos));
	    	        id.setPorcEps((txtPorcEps.getValue())==null||(txtPorcEps.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcEps));
	    	        id.setPorcRiesgo((txtPorcRiesgo.getValue())==null||(txtPorcRiesgo.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcRiesgo));
	    	        id.setPorcAfp((txtPorcAfp.getValue())==null||(txtPorcAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcAfp));
	    	        id.setPorcCaja((txtPorcCaja.getValue())==null||(txtPorcCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcCaja));
	    	        id.setCotizaciónObligatoriaCaja((txtCotizaciónObligatoriaCaja.getValue())==null||(txtCotizaciónObligatoriaCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaCaja));
	    	        id.setPorcSena((txtPorcSena.getValue())==null||(txtPorcSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcSena));
	    	        id.setCotizaciónObligatoriaSena((txtCotizaciónObligatoriaSena.getValue())==null||(txtCotizaciónObligatoriaSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaSena));
	    	        id.setPorcIcbf((txtPorcIcbf.getValue())==null||(txtPorcIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcIcbf));
	    	        id.setCotizaciónObligatoriaIcbf((txtCotizaciónObligatoriaIcbf.getValue())==null||(txtCotizaciónObligatoriaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaIcbf));
	    	        id.setDetaPlanPrimeraEps((txtDetaPlanPrimeraEps.getValue())==null||(txtDetaPlanPrimeraEps.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraEps));
	    	        id.setDetaPlanPrimeraArp((txtDetaPlanPrimeraArp.getValue())==null||(txtDetaPlanPrimeraArp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraArp));
	    	        id.setDetaPlanPrimeraAfp((txtDetaPlanPrimeraAfp.getValue())==null||(txtDetaPlanPrimeraAfp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraAfp));
	    	        id.setDetaPlanPrimeraCaja((txtDetaPlanPrimeraCaja.getValue())==null||(txtDetaPlanPrimeraCaja.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraCaja));
	    	        id.setIng((txtIng.getValue())==null||(txtIng.getValue()).equals("")?null: FacesUtils.checkString(txtIng));
	    	        id.setRet((txtRet.getValue())==null||(txtRet.getValue()).equals("")?null: FacesUtils.checkString(txtRet));
	    	        id.setTde((txtTde.getValue())==null||(txtTde.getValue()).equals("")?null: FacesUtils.checkString(txtTde));
	    	        id.setTae((txtTae.getValue())==null||(txtTae.getValue()).equals("")?null: FacesUtils.checkString(txtTae));
	    	        id.setCodiEpsTraslado((txtCodiEpsTraslado.getValue())==null||(txtCodiEpsTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEpsTraslado));
	    	        id.setTdp((txtTdp.getValue())==null||(txtTdp.getValue()).equals("")?null: FacesUtils.checkString(txtTdp));
	    	        id.setTap((txtTap.getValue())==null||(txtTap.getValue()).equals("")?null: FacesUtils.checkString(txtTap));
	    	        id.setCodiAfpTraslado((txtCodiAfpTraslado.getValue())==null||(txtCodiAfpTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfpTraslado));
	    	        id.setTda((txtTda.getValue())==null||(txtTda.getValue()).equals("")?null: FacesUtils.checkString(txtTda));
	    	        id.setTaa((txtTaa.getValue())==null||(txtTaa.getValue()).equals("")?null: FacesUtils.checkString(txtTaa));
	    	        id.setVsp((txtVsp.getValue())==null||(txtVsp.getValue()).equals("")?null: FacesUtils.checkString(txtVsp));
	    	        id.setVte((txtVte.getValue())==null||(txtVte.getValue()).equals("")?null: FacesUtils.checkString(txtVte));
	    	        id.setVst((txtVst.getValue())==null||(txtVst.getValue()).equals("")?null: FacesUtils.checkString(txtVst));
	    	        id.setSln((txtSln.getValue())==null||(txtSln.getValue()).equals("")?null: FacesUtils.checkString(txtSln));
	    	        id.setIge((txtIge.getValue())==null||(txtIge.getValue()).equals("")?null: FacesUtils.checkString(txtIge));
	    	        id.setLma((txtLma.getValue())==null||(txtLma.getValue()).equals("")?null: FacesUtils.checkString(txtLma));
	    	        id.setVac((txtVac.getValue())==null||(txtVac.getValue()).equals("")?null: FacesUtils.checkString(txtVac));
	    	        id.setAvp((txtAvp.getValue())==null||(txtAvp.getValue()).equals("")?null: FacesUtils.checkString(txtAvp));
	    	        id.setVct((txtVct.getValue())==null||(txtVct.getValue()).equals("")?null: FacesUtils.checkString(txtVct));
	    	        id.setIrp((txtIrp.getValue())==null||(txtIrp.getValue()).equals("")?null: FacesUtils.checkString(txtIrp));
	    	        id.setCodUsuario((txtCodUsuario.getValue())==null||(txtCodUsuario.getValue()).equals("")?null: FacesUtils.checkString(txtCodUsuario));
	    
                                    	entity.setId(id);
                                        entity.setTp000003(FacesUtils.checkString(txtCodEps_Tp000003) != null ? businessDelegatorView.getTp000003(FacesUtils.checkString(txtCodEps_Tp000003)) : null );
        	        businessDelegatorView.saveTlp00002(entity);
	        FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYSAVED);
			action_clear();
        } catch (Exception e) {
        	entity = null;
        	FacesUtils.addErrorMessage(e.getMessage());
        }
        return "";
    }
		
	public String action_modify() {
        try {
        	if(entity==null){
		    		        Tlp00002Id id = new Tlp00002Id();
		    		        id.setNumPlanilla(selectedTlp00002.getNumPlanilla());
		    		        id.setCodiEps(selectedTlp00002.getCodiEps());
		    		        id.setCodiArp(selectedTlp00002.getCodiArp());
		    		        id.setCodiAfp(selectedTlp00002.getCodiAfp());
		    		        id.setCodiCaja(selectedTlp00002.getCodiCaja());
		    		        id.setCotizante(selectedTlp00002.getCotizante());
		    		        id.setCodEmpresaEmp(selectedTlp00002.getCodEmpresaEmp());
		    		        id.setCiuLaboralCotizante(selectedTlp00002.getCiuLaboralCotizante());
		    		        id.setDepLaboralCotizante(selectedTlp00002.getDepLaboralCotizante());
		    		        id.setTipocotizante(selectedTlp00002.getTipocotizante());
		    		        id.setSubTipocotizante(selectedTlp00002.getSubTipocotizante());
		    		        id.setDiasCotizados(selectedTlp00002.getDiasCotizados());
		    		        id.setDiasCotizadosArp(selectedTlp00002.getDiasCotizadosArp());
		    		        id.setDiasCotizadosAfp(selectedTlp00002.getDiasCotizadosAfp());
		    		        id.setDiasCotizadosCaja(selectedTlp00002.getDiasCotizadosCaja());
		    		        id.setSalarioBasico(selectedTlp00002.getSalarioBasico());
		    		        id.setSalarioCIntegral(selectedTlp00002.getSalarioCIntegral());
		    		        id.setPlanillaEps(selectedTlp00002.getPlanillaEps());
		    		        id.setPlanillaArp(selectedTlp00002.getPlanillaArp());
		    		        id.setPlanillaAfp(selectedTlp00002.getPlanillaAfp());
		    		        id.setPlanillaCaja(selectedTlp00002.getPlanillaCaja());
		    		        id.setNumAuincapacidad(selectedTlp00002.getNumAuincapacidad());
		    		        id.setValorIncapacidad(selectedTlp00002.getValorIncapacidad());
		    		        id.setNumAulicenciaM(selectedTlp00002.getNumAulicenciaM());
		    		        id.setValorLicenciaM(selectedTlp00002.getValorLicenciaM());
		    		        id.setValorUpcAdicional(selectedTlp00002.getValorUpcAdicional());
		    		        id.setIngresoBaseCotizacion(selectedTlp00002.getIngresoBaseCotizacion());
		    		        id.setIngresoBaseCotizacionArp(selectedTlp00002.getIngresoBaseCotizacionArp());
		    		        id.setIngresoBaseCotizacionAfp(selectedTlp00002.getIngresoBaseCotizacionAfp());
		    		        id.setIngresoBaseCotizacionCaja(selectedTlp00002.getIngresoBaseCotizacionCaja());
		    		        id.setIngresoBaseCotizacionSenaIcbf(selectedTlp00002.getIngresoBaseCotizacionSenaIcbf());
		    		        id.setCotizaciónObligatoria(selectedTlp00002.getCotizaciónObligatoria());
		    		        id.setCotizaciónObligatoriaArp(selectedTlp00002.getCotizaciónObligatoriaArp());
		    		        id.setCodigoCentroTrabajo(selectedTlp00002.getCodigoCentroTrabajo());
		    		        id.setCotizaciónObligatoriaAfp(selectedTlp00002.getCotizaciónObligatoriaAfp());
		    		        id.setValorFpsolidaridad(selectedTlp00002.getValorFpsolidaridad());
		    		        id.setValorFpsubsistencia(selectedTlp00002.getValorFpsubsistencia());
		    		        id.setRiesgos(selectedTlp00002.getRiesgos());
		    		        id.setPorcEps(selectedTlp00002.getPorcEps());
		    		        id.setPorcRiesgo(selectedTlp00002.getPorcRiesgo());
		    		        id.setPorcAfp(selectedTlp00002.getPorcAfp());
		    		        id.setPorcCaja(selectedTlp00002.getPorcCaja());
		    		        id.setCotizaciónObligatoriaCaja(selectedTlp00002.getCotizaciónObligatoriaCaja());
		    		        id.setPorcSena(selectedTlp00002.getPorcSena());
		    		        id.setCotizaciónObligatoriaSena(selectedTlp00002.getCotizaciónObligatoriaSena());
		    		        id.setPorcIcbf(selectedTlp00002.getPorcIcbf());
		    		        id.setCotizaciónObligatoriaIcbf(selectedTlp00002.getCotizaciónObligatoriaIcbf());
		    		        id.setDetaPlanPrimeraEps(selectedTlp00002.getDetaPlanPrimeraEps());
		    		        id.setDetaPlanPrimeraArp(selectedTlp00002.getDetaPlanPrimeraArp());
		    		        id.setDetaPlanPrimeraAfp(selectedTlp00002.getDetaPlanPrimeraAfp());
		    		        id.setDetaPlanPrimeraCaja(selectedTlp00002.getDetaPlanPrimeraCaja());
		    		        id.setIng(selectedTlp00002.getIng());
		    		        id.setRet(selectedTlp00002.getRet());
		    		        id.setTde(selectedTlp00002.getTde());
		    		        id.setTae(selectedTlp00002.getTae());
		    		        id.setCodiEpsTraslado(selectedTlp00002.getCodiEpsTraslado());
		    		        id.setTdp(selectedTlp00002.getTdp());
		    		        id.setTap(selectedTlp00002.getTap());
		    		        id.setCodiAfpTraslado(selectedTlp00002.getCodiAfpTraslado());
		    		        id.setTda(selectedTlp00002.getTda());
		    		        id.setTaa(selectedTlp00002.getTaa());
		    		        id.setVsp(selectedTlp00002.getVsp());
		    		        id.setVte(selectedTlp00002.getVte());
		    		        id.setVst(selectedTlp00002.getVst());
		    		        id.setSln(selectedTlp00002.getSln());
		    		        id.setIge(selectedTlp00002.getIge());
		    		        id.setLma(selectedTlp00002.getLma());
		    		        id.setVac(selectedTlp00002.getVac());
		    		        id.setAvp(selectedTlp00002.getAvp());
		    		        id.setVct(selectedTlp00002.getVct());
		    		        id.setIrp(selectedTlp00002.getIrp());
		    		        id.setCodUsuario(selectedTlp00002.getCodUsuario());
		    	    		entity = businessDelegatorView.getTlp00002(id);
    		}
    		
        	    	    	        entity.setTp000003(FacesUtils.checkString(txtCodEps_Tp000003) != null ? businessDelegatorView.getTp000003(FacesUtils.checkString(txtCodEps_Tp000003)) : null );
	        	        businessDelegatorView.updateTlp00002(entity);
			FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
		   data=null;
           FacesUtils.addErrorMessage(e.getMessage());
        }
        return "";
	}
	
	public String action_delete_datatable(ActionEvent evt){
		try{
        	selectedTlp00002 = (Tlp00002DTO)(evt.getComponent().getAttributes().get("selectedTlp00002"));
    						Tlp00002Id id = new Tlp00002Id();
							id.setNumPlanilla(selectedTlp00002.getNumPlanilla());
							id.setCodiEps(selectedTlp00002.getCodiEps());
							id.setCodiArp(selectedTlp00002.getCodiArp());
							id.setCodiAfp(selectedTlp00002.getCodiAfp());
							id.setCodiCaja(selectedTlp00002.getCodiCaja());
							id.setCotizante(selectedTlp00002.getCotizante());
							id.setCodEmpresaEmp(selectedTlp00002.getCodEmpresaEmp());
							id.setCiuLaboralCotizante(selectedTlp00002.getCiuLaboralCotizante());
							id.setDepLaboralCotizante(selectedTlp00002.getDepLaboralCotizante());
							id.setTipocotizante(selectedTlp00002.getTipocotizante());
							id.setSubTipocotizante(selectedTlp00002.getSubTipocotizante());
							id.setDiasCotizados(selectedTlp00002.getDiasCotizados());
							id.setDiasCotizadosArp(selectedTlp00002.getDiasCotizadosArp());
							id.setDiasCotizadosAfp(selectedTlp00002.getDiasCotizadosAfp());
							id.setDiasCotizadosCaja(selectedTlp00002.getDiasCotizadosCaja());
							id.setSalarioBasico(selectedTlp00002.getSalarioBasico());
							id.setSalarioCIntegral(selectedTlp00002.getSalarioCIntegral());
							id.setPlanillaEps(selectedTlp00002.getPlanillaEps());
							id.setPlanillaArp(selectedTlp00002.getPlanillaArp());
							id.setPlanillaAfp(selectedTlp00002.getPlanillaAfp());
							id.setPlanillaCaja(selectedTlp00002.getPlanillaCaja());
							id.setNumAuincapacidad(selectedTlp00002.getNumAuincapacidad());
							id.setValorIncapacidad(selectedTlp00002.getValorIncapacidad());
							id.setNumAulicenciaM(selectedTlp00002.getNumAulicenciaM());
							id.setValorLicenciaM(selectedTlp00002.getValorLicenciaM());
							id.setValorUpcAdicional(selectedTlp00002.getValorUpcAdicional());
							id.setIngresoBaseCotizacion(selectedTlp00002.getIngresoBaseCotizacion());
							id.setIngresoBaseCotizacionArp(selectedTlp00002.getIngresoBaseCotizacionArp());
							id.setIngresoBaseCotizacionAfp(selectedTlp00002.getIngresoBaseCotizacionAfp());
							id.setIngresoBaseCotizacionCaja(selectedTlp00002.getIngresoBaseCotizacionCaja());
							id.setIngresoBaseCotizacionSenaIcbf(selectedTlp00002.getIngresoBaseCotizacionSenaIcbf());
							id.setCotizaciónObligatoria(selectedTlp00002.getCotizaciónObligatoria());
							id.setCotizaciónObligatoriaArp(selectedTlp00002.getCotizaciónObligatoriaArp());
							id.setCodigoCentroTrabajo(selectedTlp00002.getCodigoCentroTrabajo());
							id.setCotizaciónObligatoriaAfp(selectedTlp00002.getCotizaciónObligatoriaAfp());
							id.setValorFpsolidaridad(selectedTlp00002.getValorFpsolidaridad());
							id.setValorFpsubsistencia(selectedTlp00002.getValorFpsubsistencia());
							id.setRiesgos(selectedTlp00002.getRiesgos());
							id.setPorcEps(selectedTlp00002.getPorcEps());
							id.setPorcRiesgo(selectedTlp00002.getPorcRiesgo());
							id.setPorcAfp(selectedTlp00002.getPorcAfp());
							id.setPorcCaja(selectedTlp00002.getPorcCaja());
							id.setCotizaciónObligatoriaCaja(selectedTlp00002.getCotizaciónObligatoriaCaja());
							id.setPorcSena(selectedTlp00002.getPorcSena());
							id.setCotizaciónObligatoriaSena(selectedTlp00002.getCotizaciónObligatoriaSena());
							id.setPorcIcbf(selectedTlp00002.getPorcIcbf());
							id.setCotizaciónObligatoriaIcbf(selectedTlp00002.getCotizaciónObligatoriaIcbf());
							id.setDetaPlanPrimeraEps(selectedTlp00002.getDetaPlanPrimeraEps());
							id.setDetaPlanPrimeraArp(selectedTlp00002.getDetaPlanPrimeraArp());
							id.setDetaPlanPrimeraAfp(selectedTlp00002.getDetaPlanPrimeraAfp());
							id.setDetaPlanPrimeraCaja(selectedTlp00002.getDetaPlanPrimeraCaja());
							id.setIng(selectedTlp00002.getIng());
							id.setRet(selectedTlp00002.getRet());
							id.setTde(selectedTlp00002.getTde());
							id.setTae(selectedTlp00002.getTae());
							id.setCodiEpsTraslado(selectedTlp00002.getCodiEpsTraslado());
							id.setTdp(selectedTlp00002.getTdp());
							id.setTap(selectedTlp00002.getTap());
							id.setCodiAfpTraslado(selectedTlp00002.getCodiAfpTraslado());
							id.setTda(selectedTlp00002.getTda());
							id.setTaa(selectedTlp00002.getTaa());
							id.setVsp(selectedTlp00002.getVsp());
							id.setVte(selectedTlp00002.getVte());
							id.setVst(selectedTlp00002.getVst());
							id.setSln(selectedTlp00002.getSln());
							id.setIge(selectedTlp00002.getIge());
							id.setLma(selectedTlp00002.getLma());
							id.setVac(selectedTlp00002.getVac());
							id.setAvp(selectedTlp00002.getAvp());
							id.setVct(selectedTlp00002.getVct());
							id.setIrp(selectedTlp00002.getIrp());
							id.setCodUsuario(selectedTlp00002.getCodUsuario());
						entity = businessDelegatorView.getTlp00002(id);
        	action_delete();
        }catch(Exception e ){
		 FacesUtils.addErrorMessage(e.getMessage());
		}    
        return "";
    }
	
	public String action_delete_master(){
		try{
					        Tlp00002Id id = new Tlp00002Id();
		    		        id.setNumPlanilla((txtNumPlanilla.getValue())==null||(txtNumPlanilla.getValue()).equals("")?null: FacesUtils.checkString(txtNumPlanilla));
		    		        id.setCodiEps((txtCodiEps.getValue())==null||(txtCodiEps.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEps));
		    		        id.setCodiArp((txtCodiArp.getValue())==null||(txtCodiArp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiArp));
		    		        id.setCodiAfp((txtCodiAfp.getValue())==null||(txtCodiAfp.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfp));
		    		        id.setCodiCaja((txtCodiCaja.getValue())==null||(txtCodiCaja.getValue()).equals("")?null: FacesUtils.checkString(txtCodiCaja));
		    		        id.setCotizante((txtCotizante.getValue())==null||(txtCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCotizante));
		    		        id.setCodEmpresaEmp((txtCodEmpresaEmp.getValue())==null||(txtCodEmpresaEmp.getValue()).equals("")?null: FacesUtils.checkString(txtCodEmpresaEmp));
		    		        id.setCiuLaboralCotizante((txtCiuLaboralCotizante.getValue())==null||(txtCiuLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtCiuLaboralCotizante));
		    		        id.setDepLaboralCotizante((txtDepLaboralCotizante.getValue())==null||(txtDepLaboralCotizante.getValue()).equals("")?null: FacesUtils.checkString(txtDepLaboralCotizante));
		    		        id.setTipocotizante((txtTipocotizante.getValue())==null||(txtTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtTipocotizante));
		    		        id.setSubTipocotizante((txtSubTipocotizante.getValue())==null||(txtSubTipocotizante.getValue()).equals("")?null: FacesUtils.checkString(txtSubTipocotizante));
		    		        id.setDiasCotizados((txtDiasCotizados.getValue())==null||(txtDiasCotizados.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizados));
		    		        id.setDiasCotizadosArp((txtDiasCotizadosArp.getValue())==null||(txtDiasCotizadosArp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosArp));
		    		        id.setDiasCotizadosAfp((txtDiasCotizadosAfp.getValue())==null||(txtDiasCotizadosAfp.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosAfp));
		    		        id.setDiasCotizadosCaja((txtDiasCotizadosCaja.getValue())==null||(txtDiasCotizadosCaja.getValue()).equals("")?null: FacesUtils.checkInteger(txtDiasCotizadosCaja));
		    		        id.setSalarioBasico((txtSalarioBasico.getValue())==null||(txtSalarioBasico.getValue()).equals("")?null: FacesUtils.checkDouble(txtSalarioBasico));
		    		        id.setSalarioCIntegral((txtSalarioCIntegral.getValue())==null||(txtSalarioCIntegral.getValue()).equals("")?null: FacesUtils.checkString(txtSalarioCIntegral));
		    		        id.setPlanillaEps((txtPlanillaEps.getValue())==null||(txtPlanillaEps.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaEps));
		    		        id.setPlanillaArp((txtPlanillaArp.getValue())==null||(txtPlanillaArp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaArp));
		    		        id.setPlanillaAfp((txtPlanillaAfp.getValue())==null||(txtPlanillaAfp.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaAfp));
		    		        id.setPlanillaCaja((txtPlanillaCaja.getValue())==null||(txtPlanillaCaja.getValue()).equals("")?null: FacesUtils.checkString(txtPlanillaCaja));
		    		        id.setNumAuincapacidad((txtNumAuincapacidad.getValue())==null||(txtNumAuincapacidad.getValue()).equals("")?null: FacesUtils.checkString(txtNumAuincapacidad));
		    		        id.setValorIncapacidad((txtValorIncapacidad.getValue())==null||(txtValorIncapacidad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorIncapacidad));
		    		        id.setNumAulicenciaM((txtNumAulicenciaM.getValue())==null||(txtNumAulicenciaM.getValue()).equals("")?null: FacesUtils.checkString(txtNumAulicenciaM));
		    		        id.setValorLicenciaM((txtValorLicenciaM.getValue())==null||(txtValorLicenciaM.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorLicenciaM));
		    		        id.setValorUpcAdicional((txtValorUpcAdicional.getValue())==null||(txtValorUpcAdicional.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorUpcAdicional));
		    		        id.setIngresoBaseCotizacion((txtIngresoBaseCotizacion.getValue())==null||(txtIngresoBaseCotizacion.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacion));
		    		        id.setIngresoBaseCotizacionArp((txtIngresoBaseCotizacionArp.getValue())==null||(txtIngresoBaseCotizacionArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionArp));
		    		        id.setIngresoBaseCotizacionAfp((txtIngresoBaseCotizacionAfp.getValue())==null||(txtIngresoBaseCotizacionAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionAfp));
		    		        id.setIngresoBaseCotizacionCaja((txtIngresoBaseCotizacionCaja.getValue())==null||(txtIngresoBaseCotizacionCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionCaja));
		    		        id.setIngresoBaseCotizacionSenaIcbf((txtIngresoBaseCotizacionSenaIcbf.getValue())==null||(txtIngresoBaseCotizacionSenaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtIngresoBaseCotizacionSenaIcbf));
		    		        id.setCotizaciónObligatoria((txtCotizaciónObligatoria.getValue())==null||(txtCotizaciónObligatoria.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoria));
		    		        id.setCotizaciónObligatoriaArp((txtCotizaciónObligatoriaArp.getValue())==null||(txtCotizaciónObligatoriaArp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaArp));
		    		        id.setCodigoCentroTrabajo((txtCodigoCentroTrabajo.getValue())==null||(txtCodigoCentroTrabajo.getValue()).equals("")?null: FacesUtils.checkString(txtCodigoCentroTrabajo));
		    		        id.setCotizaciónObligatoriaAfp((txtCotizaciónObligatoriaAfp.getValue())==null||(txtCotizaciónObligatoriaAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaAfp));
		    		        id.setValorFpsolidaridad((txtValorFpsolidaridad.getValue())==null||(txtValorFpsolidaridad.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsolidaridad));
		    		        id.setValorFpsubsistencia((txtValorFpsubsistencia.getValue())==null||(txtValorFpsubsistencia.getValue()).equals("")?null: FacesUtils.checkDouble(txtValorFpsubsistencia));
		    		        id.setRiesgos((txtRiesgos.getValue())==null||(txtRiesgos.getValue()).equals("")?null: FacesUtils.checkInteger(txtRiesgos));
		    		        id.setPorcEps((txtPorcEps.getValue())==null||(txtPorcEps.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcEps));
		    		        id.setPorcRiesgo((txtPorcRiesgo.getValue())==null||(txtPorcRiesgo.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcRiesgo));
		    		        id.setPorcAfp((txtPorcAfp.getValue())==null||(txtPorcAfp.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcAfp));
		    		        id.setPorcCaja((txtPorcCaja.getValue())==null||(txtPorcCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcCaja));
		    		        id.setCotizaciónObligatoriaCaja((txtCotizaciónObligatoriaCaja.getValue())==null||(txtCotizaciónObligatoriaCaja.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaCaja));
		    		        id.setPorcSena((txtPorcSena.getValue())==null||(txtPorcSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcSena));
		    		        id.setCotizaciónObligatoriaSena((txtCotizaciónObligatoriaSena.getValue())==null||(txtCotizaciónObligatoriaSena.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaSena));
		    		        id.setPorcIcbf((txtPorcIcbf.getValue())==null||(txtPorcIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtPorcIcbf));
		    		        id.setCotizaciónObligatoriaIcbf((txtCotizaciónObligatoriaIcbf.getValue())==null||(txtCotizaciónObligatoriaIcbf.getValue()).equals("")?null: FacesUtils.checkDouble(txtCotizaciónObligatoriaIcbf));
		    		        id.setDetaPlanPrimeraEps((txtDetaPlanPrimeraEps.getValue())==null||(txtDetaPlanPrimeraEps.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraEps));
		    		        id.setDetaPlanPrimeraArp((txtDetaPlanPrimeraArp.getValue())==null||(txtDetaPlanPrimeraArp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraArp));
		    		        id.setDetaPlanPrimeraAfp((txtDetaPlanPrimeraAfp.getValue())==null||(txtDetaPlanPrimeraAfp.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraAfp));
		    		        id.setDetaPlanPrimeraCaja((txtDetaPlanPrimeraCaja.getValue())==null||(txtDetaPlanPrimeraCaja.getValue()).equals("")?null: FacesUtils.checkString(txtDetaPlanPrimeraCaja));
		    		        id.setIng((txtIng.getValue())==null||(txtIng.getValue()).equals("")?null: FacesUtils.checkString(txtIng));
		    		        id.setRet((txtRet.getValue())==null||(txtRet.getValue()).equals("")?null: FacesUtils.checkString(txtRet));
		    		        id.setTde((txtTde.getValue())==null||(txtTde.getValue()).equals("")?null: FacesUtils.checkString(txtTde));
		    		        id.setTae((txtTae.getValue())==null||(txtTae.getValue()).equals("")?null: FacesUtils.checkString(txtTae));
		    		        id.setCodiEpsTraslado((txtCodiEpsTraslado.getValue())==null||(txtCodiEpsTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiEpsTraslado));
		    		        id.setTdp((txtTdp.getValue())==null||(txtTdp.getValue()).equals("")?null: FacesUtils.checkString(txtTdp));
		    		        id.setTap((txtTap.getValue())==null||(txtTap.getValue()).equals("")?null: FacesUtils.checkString(txtTap));
		    		        id.setCodiAfpTraslado((txtCodiAfpTraslado.getValue())==null||(txtCodiAfpTraslado.getValue()).equals("")?null: FacesUtils.checkString(txtCodiAfpTraslado));
		    		        id.setTda((txtTda.getValue())==null||(txtTda.getValue()).equals("")?null: FacesUtils.checkString(txtTda));
		    		        id.setTaa((txtTaa.getValue())==null||(txtTaa.getValue()).equals("")?null: FacesUtils.checkString(txtTaa));
		    		        id.setVsp((txtVsp.getValue())==null||(txtVsp.getValue()).equals("")?null: FacesUtils.checkString(txtVsp));
		    		        id.setVte((txtVte.getValue())==null||(txtVte.getValue()).equals("")?null: FacesUtils.checkString(txtVte));
		    		        id.setVst((txtVst.getValue())==null||(txtVst.getValue()).equals("")?null: FacesUtils.checkString(txtVst));
		    		        id.setSln((txtSln.getValue())==null||(txtSln.getValue()).equals("")?null: FacesUtils.checkString(txtSln));
		    		        id.setIge((txtIge.getValue())==null||(txtIge.getValue()).equals("")?null: FacesUtils.checkString(txtIge));
		    		        id.setLma((txtLma.getValue())==null||(txtLma.getValue()).equals("")?null: FacesUtils.checkString(txtLma));
		    		        id.setVac((txtVac.getValue())==null||(txtVac.getValue()).equals("")?null: FacesUtils.checkString(txtVac));
		    		        id.setAvp((txtAvp.getValue())==null||(txtAvp.getValue()).equals("")?null: FacesUtils.checkString(txtAvp));
		    		        id.setVct((txtVct.getValue())==null||(txtVct.getValue()).equals("")?null: FacesUtils.checkString(txtVct));
		    		        id.setIrp((txtIrp.getValue())==null||(txtIrp.getValue()).equals("")?null: FacesUtils.checkString(txtIrp));
		    		        id.setCodUsuario((txtCodUsuario.getValue())==null||(txtCodUsuario.getValue()).equals("")?null: FacesUtils.checkString(txtCodUsuario));
		    		    entity = businessDelegatorView.getTlp00002(id);
        	action_delete();
        }catch(Exception e ){
		 FacesUtils.addErrorMessage(e.getMessage());
		}    
        return "";
    }
    
	public void action_delete() throws Exception{
		try{
			businessDelegatorView.deleteTlp00002(entity);
    		FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
			action_clear();
            data= null;
		}catch(Exception e ){
			throw e;
		}  
	}	
	
    public String action_closeDialog(){
    	setShowDialog(false);
    	action_clear();    	
    	return "";
    }	
		
        public String action_modifyWitDTO(String numPlanilla, String codiEps, String codiArp, String codiAfp, String codiCaja, String cotizante, String codEmpresaEmp, String ciuLaboralCotizante, String depLaboralCotizante, String tipocotizante, String subTipocotizante, Integer diasCotizados, Integer diasCotizadosArp, Integer diasCotizadosAfp, Integer diasCotizadosCaja, Double salarioBasico, String salarioCIntegral, String planillaEps, String planillaArp, String planillaAfp, String planillaCaja, String numAuincapacidad, Double valorIncapacidad, String numAulicenciaM, Double valorLicenciaM, Double valorUpcAdicional, Double ingresoBaseCotizacion, Double ingresoBaseCotizacionArp, Double ingresoBaseCotizacionAfp, Double ingresoBaseCotizacionCaja, Double ingresoBaseCotizacionSenaIcbf, Double cotizaciónObligatoria, Double cotizaciónObligatoriaArp, String codigoCentroTrabajo, Double cotizaciónObligatoriaAfp, Double valorFpsolidaridad, Double valorFpsubsistencia, Integer riesgos, Double porcEps, Double porcRiesgo, Double porcAfp, Double porcCaja, Double cotizaciónObligatoriaCaja, Double porcSena, Double cotizaciónObligatoriaSena, Double porcIcbf, Double cotizaciónObligatoriaIcbf, String detaPlanPrimeraEps, String detaPlanPrimeraArp, String detaPlanPrimeraAfp, String detaPlanPrimeraCaja, String ing, String ret, String tde, String tae, String codiEpsTraslado, String tdp, String tap, String codiAfpTraslado, String tda, String taa, String vsp, String vte, String vst, String sln, String ige, String lma, String vac, String avp, String vct, String irp, String codUsuario, String codEps_Tp000003) throws Exception {
        try {
        
        	            businessDelegatorView.updateTlp00002(entity);
		FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
        //renderManager.getOnDemandRenderer("Tlp00002View").requestRender();
        FacesUtils.addErrorMessage(e.getMessage());
        throw e;
        }
        return "";
        }
								
									
                                          
                                                                                            public InputText getTxtCodEps_Tp000003() {
                                                return txtCodEps_Tp000003;
                                                }
                                                public void setTxtCodEps_Tp000003(InputText txtCodEps_Tp000003) {
                                                this.txtCodEps_Tp000003 = txtCodEps_Tp000003;
                                                }
                                                                                                                                                                                    public InputText getTxtNumPlanilla() {
                                                return txtNumPlanilla;
                                                }
                                                public void setTxtNumPlanilla(InputText txtNumPlanilla) {
                                                this.txtNumPlanilla = txtNumPlanilla;
                                                }
                                                                                            public InputText getTxtCodiEps() {
                                                return txtCodiEps;
                                                }
                                                public void setTxtCodiEps(InputText txtCodiEps) {
                                                this.txtCodiEps = txtCodiEps;
                                                }
                                                                                            public InputText getTxtCodiArp() {
                                                return txtCodiArp;
                                                }
                                                public void setTxtCodiArp(InputText txtCodiArp) {
                                                this.txtCodiArp = txtCodiArp;
                                                }
                                                                                            public InputText getTxtCodiAfp() {
                                                return txtCodiAfp;
                                                }
                                                public void setTxtCodiAfp(InputText txtCodiAfp) {
                                                this.txtCodiAfp = txtCodiAfp;
                                                }
                                                                                            public InputText getTxtCodiCaja() {
                                                return txtCodiCaja;
                                                }
                                                public void setTxtCodiCaja(InputText txtCodiCaja) {
                                                this.txtCodiCaja = txtCodiCaja;
                                                }
                                                                                            public InputText getTxtCotizante() {
                                                return txtCotizante;
                                                }
                                                public void setTxtCotizante(InputText txtCotizante) {
                                                this.txtCotizante = txtCotizante;
                                                }
                                                                                            public InputText getTxtCodEmpresaEmp() {
                                                return txtCodEmpresaEmp;
                                                }
                                                public void setTxtCodEmpresaEmp(InputText txtCodEmpresaEmp) {
                                                this.txtCodEmpresaEmp = txtCodEmpresaEmp;
                                                }
                                                                                            public InputText getTxtCiuLaboralCotizante() {
                                                return txtCiuLaboralCotizante;
                                                }
                                                public void setTxtCiuLaboralCotizante(InputText txtCiuLaboralCotizante) {
                                                this.txtCiuLaboralCotizante = txtCiuLaboralCotizante;
                                                }
                                                                                            public InputText getTxtDepLaboralCotizante() {
                                                return txtDepLaboralCotizante;
                                                }
                                                public void setTxtDepLaboralCotizante(InputText txtDepLaboralCotizante) {
                                                this.txtDepLaboralCotizante = txtDepLaboralCotizante;
                                                }
                                                                                            public InputText getTxtTipocotizante() {
                                                return txtTipocotizante;
                                                }
                                                public void setTxtTipocotizante(InputText txtTipocotizante) {
                                                this.txtTipocotizante = txtTipocotizante;
                                                }
                                                                                            public InputText getTxtSubTipocotizante() {
                                                return txtSubTipocotizante;
                                                }
                                                public void setTxtSubTipocotizante(InputText txtSubTipocotizante) {
                                                this.txtSubTipocotizante = txtSubTipocotizante;
                                                }
                                                                                            public InputText getTxtDiasCotizados() {
                                                return txtDiasCotizados;
                                                }
                                                public void setTxtDiasCotizados(InputText txtDiasCotizados) {
                                                this.txtDiasCotizados = txtDiasCotizados;
                                                }
                                                                                            public InputText getTxtDiasCotizadosArp() {
                                                return txtDiasCotizadosArp;
                                                }
                                                public void setTxtDiasCotizadosArp(InputText txtDiasCotizadosArp) {
                                                this.txtDiasCotizadosArp = txtDiasCotizadosArp;
                                                }
                                                                                            public InputText getTxtDiasCotizadosAfp() {
                                                return txtDiasCotizadosAfp;
                                                }
                                                public void setTxtDiasCotizadosAfp(InputText txtDiasCotizadosAfp) {
                                                this.txtDiasCotizadosAfp = txtDiasCotizadosAfp;
                                                }
                                                                                            public InputText getTxtDiasCotizadosCaja() {
                                                return txtDiasCotizadosCaja;
                                                }
                                                public void setTxtDiasCotizadosCaja(InputText txtDiasCotizadosCaja) {
                                                this.txtDiasCotizadosCaja = txtDiasCotizadosCaja;
                                                }
                                                                                            public InputText getTxtSalarioBasico() {
                                                return txtSalarioBasico;
                                                }
                                                public void setTxtSalarioBasico(InputText txtSalarioBasico) {
                                                this.txtSalarioBasico = txtSalarioBasico;
                                                }
                                                                                            public InputText getTxtSalarioCIntegral() {
                                                return txtSalarioCIntegral;
                                                }
                                                public void setTxtSalarioCIntegral(InputText txtSalarioCIntegral) {
                                                this.txtSalarioCIntegral = txtSalarioCIntegral;
                                                }
                                                                                            public InputText getTxtPlanillaEps() {
                                                return txtPlanillaEps;
                                                }
                                                public void setTxtPlanillaEps(InputText txtPlanillaEps) {
                                                this.txtPlanillaEps = txtPlanillaEps;
                                                }
                                                                                            public InputText getTxtPlanillaArp() {
                                                return txtPlanillaArp;
                                                }
                                                public void setTxtPlanillaArp(InputText txtPlanillaArp) {
                                                this.txtPlanillaArp = txtPlanillaArp;
                                                }
                                                                                            public InputText getTxtPlanillaAfp() {
                                                return txtPlanillaAfp;
                                                }
                                                public void setTxtPlanillaAfp(InputText txtPlanillaAfp) {
                                                this.txtPlanillaAfp = txtPlanillaAfp;
                                                }
                                                                                            public InputText getTxtPlanillaCaja() {
                                                return txtPlanillaCaja;
                                                }
                                                public void setTxtPlanillaCaja(InputText txtPlanillaCaja) {
                                                this.txtPlanillaCaja = txtPlanillaCaja;
                                                }
                                                                                            public InputText getTxtNumAuincapacidad() {
                                                return txtNumAuincapacidad;
                                                }
                                                public void setTxtNumAuincapacidad(InputText txtNumAuincapacidad) {
                                                this.txtNumAuincapacidad = txtNumAuincapacidad;
                                                }
                                                                                            public InputText getTxtValorIncapacidad() {
                                                return txtValorIncapacidad;
                                                }
                                                public void setTxtValorIncapacidad(InputText txtValorIncapacidad) {
                                                this.txtValorIncapacidad = txtValorIncapacidad;
                                                }
                                                                                            public InputText getTxtNumAulicenciaM() {
                                                return txtNumAulicenciaM;
                                                }
                                                public void setTxtNumAulicenciaM(InputText txtNumAulicenciaM) {
                                                this.txtNumAulicenciaM = txtNumAulicenciaM;
                                                }
                                                                                            public InputText getTxtValorLicenciaM() {
                                                return txtValorLicenciaM;
                                                }
                                                public void setTxtValorLicenciaM(InputText txtValorLicenciaM) {
                                                this.txtValorLicenciaM = txtValorLicenciaM;
                                                }
                                                                                            public InputText getTxtValorUpcAdicional() {
                                                return txtValorUpcAdicional;
                                                }
                                                public void setTxtValorUpcAdicional(InputText txtValorUpcAdicional) {
                                                this.txtValorUpcAdicional = txtValorUpcAdicional;
                                                }
                                                                                            public InputText getTxtIngresoBaseCotizacion() {
                                                return txtIngresoBaseCotizacion;
                                                }
                                                public void setTxtIngresoBaseCotizacion(InputText txtIngresoBaseCotizacion) {
                                                this.txtIngresoBaseCotizacion = txtIngresoBaseCotizacion;
                                                }
                                                                                            public InputText getTxtIngresoBaseCotizacionArp() {
                                                return txtIngresoBaseCotizacionArp;
                                                }
                                                public void setTxtIngresoBaseCotizacionArp(InputText txtIngresoBaseCotizacionArp) {
                                                this.txtIngresoBaseCotizacionArp = txtIngresoBaseCotizacionArp;
                                                }
                                                                                            public InputText getTxtIngresoBaseCotizacionAfp() {
                                                return txtIngresoBaseCotizacionAfp;
                                                }
                                                public void setTxtIngresoBaseCotizacionAfp(InputText txtIngresoBaseCotizacionAfp) {
                                                this.txtIngresoBaseCotizacionAfp = txtIngresoBaseCotizacionAfp;
                                                }
                                                                                            public InputText getTxtIngresoBaseCotizacionCaja() {
                                                return txtIngresoBaseCotizacionCaja;
                                                }
                                                public void setTxtIngresoBaseCotizacionCaja(InputText txtIngresoBaseCotizacionCaja) {
                                                this.txtIngresoBaseCotizacionCaja = txtIngresoBaseCotizacionCaja;
                                                }
                                                                                            public InputText getTxtIngresoBaseCotizacionSenaIcbf() {
                                                return txtIngresoBaseCotizacionSenaIcbf;
                                                }
                                                public void setTxtIngresoBaseCotizacionSenaIcbf(InputText txtIngresoBaseCotizacionSenaIcbf) {
                                                this.txtIngresoBaseCotizacionSenaIcbf = txtIngresoBaseCotizacionSenaIcbf;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoria() {
                                                return txtCotizaciónObligatoria;
                                                }
                                                public void setTxtCotizaciónObligatoria(InputText txtCotizaciónObligatoria) {
                                                this.txtCotizaciónObligatoria = txtCotizaciónObligatoria;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoriaArp() {
                                                return txtCotizaciónObligatoriaArp;
                                                }
                                                public void setTxtCotizaciónObligatoriaArp(InputText txtCotizaciónObligatoriaArp) {
                                                this.txtCotizaciónObligatoriaArp = txtCotizaciónObligatoriaArp;
                                                }
                                                                                            public InputText getTxtCodigoCentroTrabajo() {
                                                return txtCodigoCentroTrabajo;
                                                }
                                                public void setTxtCodigoCentroTrabajo(InputText txtCodigoCentroTrabajo) {
                                                this.txtCodigoCentroTrabajo = txtCodigoCentroTrabajo;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoriaAfp() {
                                                return txtCotizaciónObligatoriaAfp;
                                                }
                                                public void setTxtCotizaciónObligatoriaAfp(InputText txtCotizaciónObligatoriaAfp) {
                                                this.txtCotizaciónObligatoriaAfp = txtCotizaciónObligatoriaAfp;
                                                }
                                                                                            public InputText getTxtValorFpsolidaridad() {
                                                return txtValorFpsolidaridad;
                                                }
                                                public void setTxtValorFpsolidaridad(InputText txtValorFpsolidaridad) {
                                                this.txtValorFpsolidaridad = txtValorFpsolidaridad;
                                                }
                                                                                            public InputText getTxtValorFpsubsistencia() {
                                                return txtValorFpsubsistencia;
                                                }
                                                public void setTxtValorFpsubsistencia(InputText txtValorFpsubsistencia) {
                                                this.txtValorFpsubsistencia = txtValorFpsubsistencia;
                                                }
                                                                                            public InputText getTxtRiesgos() {
                                                return txtRiesgos;
                                                }
                                                public void setTxtRiesgos(InputText txtRiesgos) {
                                                this.txtRiesgos = txtRiesgos;
                                                }
                                                                                            public InputText getTxtPorcEps() {
                                                return txtPorcEps;
                                                }
                                                public void setTxtPorcEps(InputText txtPorcEps) {
                                                this.txtPorcEps = txtPorcEps;
                                                }
                                                                                            public InputText getTxtPorcRiesgo() {
                                                return txtPorcRiesgo;
                                                }
                                                public void setTxtPorcRiesgo(InputText txtPorcRiesgo) {
                                                this.txtPorcRiesgo = txtPorcRiesgo;
                                                }
                                                                                            public InputText getTxtPorcAfp() {
                                                return txtPorcAfp;
                                                }
                                                public void setTxtPorcAfp(InputText txtPorcAfp) {
                                                this.txtPorcAfp = txtPorcAfp;
                                                }
                                                                                            public InputText getTxtPorcCaja() {
                                                return txtPorcCaja;
                                                }
                                                public void setTxtPorcCaja(InputText txtPorcCaja) {
                                                this.txtPorcCaja = txtPorcCaja;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoriaCaja() {
                                                return txtCotizaciónObligatoriaCaja;
                                                }
                                                public void setTxtCotizaciónObligatoriaCaja(InputText txtCotizaciónObligatoriaCaja) {
                                                this.txtCotizaciónObligatoriaCaja = txtCotizaciónObligatoriaCaja;
                                                }
                                                                                            public InputText getTxtPorcSena() {
                                                return txtPorcSena;
                                                }
                                                public void setTxtPorcSena(InputText txtPorcSena) {
                                                this.txtPorcSena = txtPorcSena;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoriaSena() {
                                                return txtCotizaciónObligatoriaSena;
                                                }
                                                public void setTxtCotizaciónObligatoriaSena(InputText txtCotizaciónObligatoriaSena) {
                                                this.txtCotizaciónObligatoriaSena = txtCotizaciónObligatoriaSena;
                                                }
                                                                                            public InputText getTxtPorcIcbf() {
                                                return txtPorcIcbf;
                                                }
                                                public void setTxtPorcIcbf(InputText txtPorcIcbf) {
                                                this.txtPorcIcbf = txtPorcIcbf;
                                                }
                                                                                            public InputText getTxtCotizaciónObligatoriaIcbf() {
                                                return txtCotizaciónObligatoriaIcbf;
                                                }
                                                public void setTxtCotizaciónObligatoriaIcbf(InputText txtCotizaciónObligatoriaIcbf) {
                                                this.txtCotizaciónObligatoriaIcbf = txtCotizaciónObligatoriaIcbf;
                                                }
                                                                                            public InputText getTxtDetaPlanPrimeraEps() {
                                                return txtDetaPlanPrimeraEps;
                                                }
                                                public void setTxtDetaPlanPrimeraEps(InputText txtDetaPlanPrimeraEps) {
                                                this.txtDetaPlanPrimeraEps = txtDetaPlanPrimeraEps;
                                                }
                                                                                            public InputText getTxtDetaPlanPrimeraArp() {
                                                return txtDetaPlanPrimeraArp;
                                                }
                                                public void setTxtDetaPlanPrimeraArp(InputText txtDetaPlanPrimeraArp) {
                                                this.txtDetaPlanPrimeraArp = txtDetaPlanPrimeraArp;
                                                }
                                                                                            public InputText getTxtDetaPlanPrimeraAfp() {
                                                return txtDetaPlanPrimeraAfp;
                                                }
                                                public void setTxtDetaPlanPrimeraAfp(InputText txtDetaPlanPrimeraAfp) {
                                                this.txtDetaPlanPrimeraAfp = txtDetaPlanPrimeraAfp;
                                                }
                                                                                            public InputText getTxtDetaPlanPrimeraCaja() {
                                                return txtDetaPlanPrimeraCaja;
                                                }
                                                public void setTxtDetaPlanPrimeraCaja(InputText txtDetaPlanPrimeraCaja) {
                                                this.txtDetaPlanPrimeraCaja = txtDetaPlanPrimeraCaja;
                                                }
                                                                                            public InputText getTxtIng() {
                                                return txtIng;
                                                }
                                                public void setTxtIng(InputText txtIng) {
                                                this.txtIng = txtIng;
                                                }
                                                                                            public InputText getTxtRet() {
                                                return txtRet;
                                                }
                                                public void setTxtRet(InputText txtRet) {
                                                this.txtRet = txtRet;
                                                }
                                                                                            public InputText getTxtTde() {
                                                return txtTde;
                                                }
                                                public void setTxtTde(InputText txtTde) {
                                                this.txtTde = txtTde;
                                                }
                                                                                            public InputText getTxtTae() {
                                                return txtTae;
                                                }
                                                public void setTxtTae(InputText txtTae) {
                                                this.txtTae = txtTae;
                                                }
                                                                                            public InputText getTxtCodiEpsTraslado() {
                                                return txtCodiEpsTraslado;
                                                }
                                                public void setTxtCodiEpsTraslado(InputText txtCodiEpsTraslado) {
                                                this.txtCodiEpsTraslado = txtCodiEpsTraslado;
                                                }
                                                                                            public InputText getTxtTdp() {
                                                return txtTdp;
                                                }
                                                public void setTxtTdp(InputText txtTdp) {
                                                this.txtTdp = txtTdp;
                                                }
                                                                                            public InputText getTxtTap() {
                                                return txtTap;
                                                }
                                                public void setTxtTap(InputText txtTap) {
                                                this.txtTap = txtTap;
                                                }
                                                                                            public InputText getTxtCodiAfpTraslado() {
                                                return txtCodiAfpTraslado;
                                                }
                                                public void setTxtCodiAfpTraslado(InputText txtCodiAfpTraslado) {
                                                this.txtCodiAfpTraslado = txtCodiAfpTraslado;
                                                }
                                                                                            public InputText getTxtTda() {
                                                return txtTda;
                                                }
                                                public void setTxtTda(InputText txtTda) {
                                                this.txtTda = txtTda;
                                                }
                                                                                            public InputText getTxtTaa() {
                                                return txtTaa;
                                                }
                                                public void setTxtTaa(InputText txtTaa) {
                                                this.txtTaa = txtTaa;
                                                }
                                                                                            public InputText getTxtVsp() {
                                                return txtVsp;
                                                }
                                                public void setTxtVsp(InputText txtVsp) {
                                                this.txtVsp = txtVsp;
                                                }
                                                                                            public InputText getTxtVte() {
                                                return txtVte;
                                                }
                                                public void setTxtVte(InputText txtVte) {
                                                this.txtVte = txtVte;
                                                }
                                                                                            public InputText getTxtVst() {
                                                return txtVst;
                                                }
                                                public void setTxtVst(InputText txtVst) {
                                                this.txtVst = txtVst;
                                                }
                                                                                            public InputText getTxtSln() {
                                                return txtSln;
                                                }
                                                public void setTxtSln(InputText txtSln) {
                                                this.txtSln = txtSln;
                                                }
                                                                                            public InputText getTxtIge() {
                                                return txtIge;
                                                }
                                                public void setTxtIge(InputText txtIge) {
                                                this.txtIge = txtIge;
                                                }
                                                                                            public InputText getTxtLma() {
                                                return txtLma;
                                                }
                                                public void setTxtLma(InputText txtLma) {
                                                this.txtLma = txtLma;
                                                }
                                                                                            public InputText getTxtVac() {
                                                return txtVac;
                                                }
                                                public void setTxtVac(InputText txtVac) {
                                                this.txtVac = txtVac;
                                                }
                                                                                            public InputText getTxtAvp() {
                                                return txtAvp;
                                                }
                                                public void setTxtAvp(InputText txtAvp) {
                                                this.txtAvp = txtAvp;
                                                }
                                                                                            public InputText getTxtVct() {
                                                return txtVct;
                                                }
                                                public void setTxtVct(InputText txtVct) {
                                                this.txtVct = txtVct;
                                                }
                                                                                            public InputText getTxtIrp() {
                                                return txtIrp;
                                                }
                                                public void setTxtIrp(InputText txtIrp) {
                                                this.txtIrp = txtIrp;
                                                }
                                                                                            public InputText getTxtCodUsuario() {
                                                return txtCodUsuario;
                                                }
                                                public void setTxtCodUsuario(InputText txtCodUsuario) {
                                                this.txtCodUsuario = txtCodUsuario;
                                                }
                                                                                        											
																						public List<Tlp00002DTO> getData() {
												try{
													if(data==null){
													data = businessDelegatorView.getDataTlp00002();
													}	
												
												}catch(Exception e){
												 e.printStackTrace();
												}
												return data;
											}
																						public void setData(List<Tlp00002DTO> tlp00002DTO){
												this.data=tlp00002DTO;
											}
											
																						
											public Tlp00002DTO getSelectedTlp00002(){
												return selectedTlp00002;
											}
											
											public void setSelectedTlp00002 (Tlp00002DTO tlp00002 ){
												this.selectedTlp00002 = tlp00002;
											}
											
											
                                            public CommandButton getBtnSave() {
                                            return btnSave;
                                            }
                                            public void setBtnSave(CommandButton btnSave) {
                                            this.btnSave = btnSave;
                                            }
                                            public CommandButton getBtnModify() {
                                            return btnModify;
                                            }
                                            public void setBtnModify(CommandButton btnModify) {
                                            this.btnModify = btnModify;
                                            }
                                            public CommandButton getBtnDelete() {
                                            return btnDelete;
                                            }
                                            public void setBtnDelete(CommandButton btnDelete) {
                                            this.btnDelete = btnDelete;
                                            }
                                            public CommandButton getBtnClear() {
                                            return btnClear;
                                            }
                                            public void setBtnClear(CommandButton btnClear) {
                                            this.btnClear = btnClear;
                                            }
                                            
                                            public TimeZone getTimeZone() {
                                             return java.util.TimeZone.getDefault();
                                             }
																							
											 public IBusinessDelegatorView getBusinessDelegatorView() {
											 return businessDelegatorView;
											 }

											public void setBusinessDelegatorView(IBusinessDelegatorView businessDelegatorView) {
											this.businessDelegatorView = businessDelegatorView;
											}
											
											public boolean isShowDialog() {
												return showDialog;
											}
										
											public void setShowDialog(boolean showDialog) {
												this.showDialog = showDialog;
											}											
                                             
									}
