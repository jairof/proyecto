package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tp000001DTO;

import com.utilities.*;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;

import org.primefaces.event.RowEditEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;


/**
 * @author Zathura Code Generator http://zathuracode.org
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class Tp000001View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tp000001View.class);
    private InputText txtAfpActiva;
    private InputText txtArpActiva;
    private InputText txtBasico;
    private InputText txtBeeper;
    private InputText txtCajaActiva;
    private InputText txtCelular;
    private InputText txtCiuCotizante;
    private InputText txtCiuLaboralCotizante;
    private InputText txtCodAsesor;
    private InputText txtCodAsesor2;
    private InputText txtCodCotizante;
    private InputText txtCodIntBarrio;
    private InputText txtCodigoCentroTrabajoC;
    private InputText txtCodigoPostal;
    private InputText txtColombianoExterior;
    private InputText txtCotisanteValorUpc;
    private InputText txtCotizanteEspecial;
    private InputText txtCotizanteValorEsp;
    private InputText txtDirCotizante;
    private InputText txtEmailCotizante;
    private InputText txtEpsActiva;
    private InputText txtEstadoCarnetArp;
    private InputText txtEstadoCarnetCaja;
    private InputText txtEstadoCivil;
    private InputText txtEstadoCotizante;
    private InputText txtEstrato;
    private InputText txtExtranjero;
    private InputText txtIdenCotizante;
    private InputText txtIpsAtencionCotiza;
    private InputText txtIpsDirecionCotiza;
    private InputText txtIpsTelefonosCotiza;
    private InputText txtNafiliacionAfp;
    private InputText txtNafiliacionArp;
    private InputText txtNafiliacionCaja;
    private InputText txtNafiliacionEps;
    private InputText txtNumRadicacion;
    private InputText txtObservacion;
    private InputText txtPagaParafiscales;
    private InputText txtPlanilladoRtAfp;
    private InputText txtPlanilladoRtArp;
    private InputText txtPlanilladoRtCaja;
    private InputText txtPlanilladoRtEps;
    private InputText txtPrimerApeCotizante;
    private InputText txtPrimerNomCotizante;
    private InputText txtPrimeraAfp;
    private InputText txtPrimeraArp;
    private InputText txtPrimeraCaja;
    private InputText txtPrimeraEps;
    private InputText txtQuienRecibeCarnetArp;
    private InputText txtQuienRecibeCarnetCaja;
    private InputText txtRutaFoto;
    private InputText txtSalarioIntegral;
    private InputText txtSegundoApeCotizante;
    private InputText txtSegundoNomCotizante;
    private InputText txtSexo;
    private InputText txtTelCotizante;
    private InputText txtTipoAfiliacion;
    private InputText txtTipoSalario;
    private InputText txtZona;
    private InputText txtCodCiudad_Tg000002;
    private InputText txtCodProfesion_Tg000012;
    private InputText txtCodActividad_Tg000013;
    private InputText txtCodIdentidad_Tg000019;
    private InputText txtCodTipoCotizante_Tg000028;
    private InputText txtCodSubTipoCotizante_Tg000029;
    private InputText txtCodEps_Tp000003;
    private InputText txtCodArp_Tp000004;
    private InputText txtCodAfp_Tp000005;
    private InputText txtCodCaja_Tp000006;
    private InputText txtCodEmpresa;
    private InputText txtCodEmpresaEmp;
    private Calendar txtFcoberTotal;
    private Calendar txtFcoberUrgencia;
    private Calendar txtFecInicioAfp;
    private Calendar txtFecInicioArp;
    private Calendar txtFecInicioCaja;
    private Calendar txtFecInicioEps;
    private Calendar txtFechaAfiliacion;
    private Calendar txtFechaEntregaCarnetArp;
    private Calendar txtFechaEntregaCarnetCaja;
    private Calendar txtFechaIngresoEmp;
    private Calendar txtFechaNacimiento;
    private Calendar txtFechaRadicacion;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tp000001DTO> data;
    private Tp000001DTO selectedTp000001;
    private Tp000001 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tp000001View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTp000001 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTp000001 = null;

        if (txtAfpActiva != null) {
            txtAfpActiva.setValue(null);
            txtAfpActiva.setDisabled(true);
        }

        if (txtArpActiva != null) {
            txtArpActiva.setValue(null);
            txtArpActiva.setDisabled(true);
        }

        if (txtBasico != null) {
            txtBasico.setValue(null);
            txtBasico.setDisabled(true);
        }

        if (txtBeeper != null) {
            txtBeeper.setValue(null);
            txtBeeper.setDisabled(true);
        }

        if (txtCajaActiva != null) {
            txtCajaActiva.setValue(null);
            txtCajaActiva.setDisabled(true);
        }

        if (txtCelular != null) {
            txtCelular.setValue(null);
            txtCelular.setDisabled(true);
        }

        if (txtCiuCotizante != null) {
            txtCiuCotizante.setValue(null);
            txtCiuCotizante.setDisabled(true);
        }

        if (txtCiuLaboralCotizante != null) {
            txtCiuLaboralCotizante.setValue(null);
            txtCiuLaboralCotizante.setDisabled(true);
        }

        if (txtCodAsesor != null) {
            txtCodAsesor.setValue(null);
            txtCodAsesor.setDisabled(true);
        }

        if (txtCodAsesor2 != null) {
            txtCodAsesor2.setValue(null);
            txtCodAsesor2.setDisabled(true);
        }

        if (txtCodCotizante != null) {
            txtCodCotizante.setValue(null);
            txtCodCotizante.setDisabled(true);
        }

        if (txtCodIntBarrio != null) {
            txtCodIntBarrio.setValue(null);
            txtCodIntBarrio.setDisabled(true);
        }

        if (txtCodigoCentroTrabajoC != null) {
            txtCodigoCentroTrabajoC.setValue(null);
            txtCodigoCentroTrabajoC.setDisabled(true);
        }

        if (txtCodigoPostal != null) {
            txtCodigoPostal.setValue(null);
            txtCodigoPostal.setDisabled(true);
        }

        if (txtColombianoExterior != null) {
            txtColombianoExterior.setValue(null);
            txtColombianoExterior.setDisabled(true);
        }

        if (txtCotisanteValorUpc != null) {
            txtCotisanteValorUpc.setValue(null);
            txtCotisanteValorUpc.setDisabled(true);
        }

        if (txtCotizanteEspecial != null) {
            txtCotizanteEspecial.setValue(null);
            txtCotizanteEspecial.setDisabled(true);
        }

        if (txtCotizanteValorEsp != null) {
            txtCotizanteValorEsp.setValue(null);
            txtCotizanteValorEsp.setDisabled(true);
        }

        if (txtDirCotizante != null) {
            txtDirCotizante.setValue(null);
            txtDirCotizante.setDisabled(true);
        }

        if (txtEmailCotizante != null) {
            txtEmailCotizante.setValue(null);
            txtEmailCotizante.setDisabled(true);
        }

        if (txtEpsActiva != null) {
            txtEpsActiva.setValue(null);
            txtEpsActiva.setDisabled(true);
        }

        if (txtEstadoCarnetArp != null) {
            txtEstadoCarnetArp.setValue(null);
            txtEstadoCarnetArp.setDisabled(true);
        }

        if (txtEstadoCarnetCaja != null) {
            txtEstadoCarnetCaja.setValue(null);
            txtEstadoCarnetCaja.setDisabled(true);
        }

        if (txtEstadoCivil != null) {
            txtEstadoCivil.setValue(null);
            txtEstadoCivil.setDisabled(true);
        }

        if (txtEstadoCotizante != null) {
            txtEstadoCotizante.setValue(null);
            txtEstadoCotizante.setDisabled(true);
        }

        if (txtEstrato != null) {
            txtEstrato.setValue(null);
            txtEstrato.setDisabled(true);
        }

        if (txtExtranjero != null) {
            txtExtranjero.setValue(null);
            txtExtranjero.setDisabled(true);
        }

        if (txtIdenCotizante != null) {
            txtIdenCotizante.setValue(null);
            txtIdenCotizante.setDisabled(true);
        }

        if (txtIpsAtencionCotiza != null) {
            txtIpsAtencionCotiza.setValue(null);
            txtIpsAtencionCotiza.setDisabled(true);
        }

        if (txtIpsDirecionCotiza != null) {
            txtIpsDirecionCotiza.setValue(null);
            txtIpsDirecionCotiza.setDisabled(true);
        }

        if (txtIpsTelefonosCotiza != null) {
            txtIpsTelefonosCotiza.setValue(null);
            txtIpsTelefonosCotiza.setDisabled(true);
        }

        if (txtNafiliacionAfp != null) {
            txtNafiliacionAfp.setValue(null);
            txtNafiliacionAfp.setDisabled(true);
        }

        if (txtNafiliacionArp != null) {
            txtNafiliacionArp.setValue(null);
            txtNafiliacionArp.setDisabled(true);
        }

        if (txtNafiliacionCaja != null) {
            txtNafiliacionCaja.setValue(null);
            txtNafiliacionCaja.setDisabled(true);
        }

        if (txtNafiliacionEps != null) {
            txtNafiliacionEps.setValue(null);
            txtNafiliacionEps.setDisabled(true);
        }

        if (txtNumRadicacion != null) {
            txtNumRadicacion.setValue(null);
            txtNumRadicacion.setDisabled(true);
        }

        if (txtObservacion != null) {
            txtObservacion.setValue(null);
            txtObservacion.setDisabled(true);
        }

        if (txtPagaParafiscales != null) {
            txtPagaParafiscales.setValue(null);
            txtPagaParafiscales.setDisabled(true);
        }

        if (txtPlanilladoRtAfp != null) {
            txtPlanilladoRtAfp.setValue(null);
            txtPlanilladoRtAfp.setDisabled(true);
        }

        if (txtPlanilladoRtArp != null) {
            txtPlanilladoRtArp.setValue(null);
            txtPlanilladoRtArp.setDisabled(true);
        }

        if (txtPlanilladoRtCaja != null) {
            txtPlanilladoRtCaja.setValue(null);
            txtPlanilladoRtCaja.setDisabled(true);
        }

        if (txtPlanilladoRtEps != null) {
            txtPlanilladoRtEps.setValue(null);
            txtPlanilladoRtEps.setDisabled(true);
        }

        if (txtPrimerApeCotizante != null) {
            txtPrimerApeCotizante.setValue(null);
            txtPrimerApeCotizante.setDisabled(true);
        }

        if (txtPrimerNomCotizante != null) {
            txtPrimerNomCotizante.setValue(null);
            txtPrimerNomCotizante.setDisabled(true);
        }

        if (txtPrimeraAfp != null) {
            txtPrimeraAfp.setValue(null);
            txtPrimeraAfp.setDisabled(true);
        }

        if (txtPrimeraArp != null) {
            txtPrimeraArp.setValue(null);
            txtPrimeraArp.setDisabled(true);
        }

        if (txtPrimeraCaja != null) {
            txtPrimeraCaja.setValue(null);
            txtPrimeraCaja.setDisabled(true);
        }

        if (txtPrimeraEps != null) {
            txtPrimeraEps.setValue(null);
            txtPrimeraEps.setDisabled(true);
        }

        if (txtQuienRecibeCarnetArp != null) {
            txtQuienRecibeCarnetArp.setValue(null);
            txtQuienRecibeCarnetArp.setDisabled(true);
        }

        if (txtQuienRecibeCarnetCaja != null) {
            txtQuienRecibeCarnetCaja.setValue(null);
            txtQuienRecibeCarnetCaja.setDisabled(true);
        }

        if (txtRutaFoto != null) {
            txtRutaFoto.setValue(null);
            txtRutaFoto.setDisabled(true);
        }

        if (txtSalarioIntegral != null) {
            txtSalarioIntegral.setValue(null);
            txtSalarioIntegral.setDisabled(true);
        }

        if (txtSegundoApeCotizante != null) {
            txtSegundoApeCotizante.setValue(null);
            txtSegundoApeCotizante.setDisabled(true);
        }

        if (txtSegundoNomCotizante != null) {
            txtSegundoNomCotizante.setValue(null);
            txtSegundoNomCotizante.setDisabled(true);
        }

        if (txtSexo != null) {
            txtSexo.setValue(null);
            txtSexo.setDisabled(true);
        }

        if (txtTelCotizante != null) {
            txtTelCotizante.setValue(null);
            txtTelCotizante.setDisabled(true);
        }

        if (txtTipoAfiliacion != null) {
            txtTipoAfiliacion.setValue(null);
            txtTipoAfiliacion.setDisabled(true);
        }

        if (txtTipoSalario != null) {
            txtTipoSalario.setValue(null);
            txtTipoSalario.setDisabled(true);
        }

        if (txtZona != null) {
            txtZona.setValue(null);
            txtZona.setDisabled(true);
        }

        if (txtCodCiudad_Tg000002 != null) {
            txtCodCiudad_Tg000002.setValue(null);
            txtCodCiudad_Tg000002.setDisabled(true);
        }

        if (txtCodProfesion_Tg000012 != null) {
            txtCodProfesion_Tg000012.setValue(null);
            txtCodProfesion_Tg000012.setDisabled(true);
        }

        if (txtCodActividad_Tg000013 != null) {
            txtCodActividad_Tg000013.setValue(null);
            txtCodActividad_Tg000013.setDisabled(true);
        }

        if (txtCodIdentidad_Tg000019 != null) {
            txtCodIdentidad_Tg000019.setValue(null);
            txtCodIdentidad_Tg000019.setDisabled(true);
        }

        if (txtCodTipoCotizante_Tg000028 != null) {
            txtCodTipoCotizante_Tg000028.setValue(null);
            txtCodTipoCotizante_Tg000028.setDisabled(true);
        }

        if (txtCodSubTipoCotizante_Tg000029 != null) {
            txtCodSubTipoCotizante_Tg000029.setValue(null);
            txtCodSubTipoCotizante_Tg000029.setDisabled(true);
        }

        if (txtCodEps_Tp000003 != null) {
            txtCodEps_Tp000003.setValue(null);
            txtCodEps_Tp000003.setDisabled(true);
        }

        if (txtCodArp_Tp000004 != null) {
            txtCodArp_Tp000004.setValue(null);
            txtCodArp_Tp000004.setDisabled(true);
        }

        if (txtCodAfp_Tp000005 != null) {
            txtCodAfp_Tp000005.setValue(null);
            txtCodAfp_Tp000005.setDisabled(true);
        }

        if (txtCodCaja_Tp000006 != null) {
            txtCodCaja_Tp000006.setValue(null);
            txtCodCaja_Tp000006.setDisabled(true);
        }

        if (txtFcoberTotal != null) {
            txtFcoberTotal.setValue(null);
            txtFcoberTotal.setDisabled(true);
        }

        if (txtFcoberUrgencia != null) {
            txtFcoberUrgencia.setValue(null);
            txtFcoberUrgencia.setDisabled(true);
        }

        if (txtFecInicioAfp != null) {
            txtFecInicioAfp.setValue(null);
            txtFecInicioAfp.setDisabled(true);
        }

        if (txtFecInicioArp != null) {
            txtFecInicioArp.setValue(null);
            txtFecInicioArp.setDisabled(true);
        }

        if (txtFecInicioCaja != null) {
            txtFecInicioCaja.setValue(null);
            txtFecInicioCaja.setDisabled(true);
        }

        if (txtFecInicioEps != null) {
            txtFecInicioEps.setValue(null);
            txtFecInicioEps.setDisabled(true);
        }

        if (txtFechaAfiliacion != null) {
            txtFechaAfiliacion.setValue(null);
            txtFechaAfiliacion.setDisabled(true);
        }

        if (txtFechaEntregaCarnetArp != null) {
            txtFechaEntregaCarnetArp.setValue(null);
            txtFechaEntregaCarnetArp.setDisabled(true);
        }

        if (txtFechaEntregaCarnetCaja != null) {
            txtFechaEntregaCarnetCaja.setValue(null);
            txtFechaEntregaCarnetCaja.setDisabled(true);
        }

        if (txtFechaIngresoEmp != null) {
            txtFechaIngresoEmp.setValue(null);
            txtFechaIngresoEmp.setDisabled(true);
        }

        if (txtFechaNacimiento != null) {
            txtFechaNacimiento.setValue(null);
            txtFechaNacimiento.setDisabled(true);
        }

        if (txtFechaRadicacion != null) {
            txtFechaRadicacion.setValue(null);
            txtFechaRadicacion.setDisabled(true);
        }

        if (txtCodEmpresa != null) {
            txtCodEmpresa.setValue(null);
            txtCodEmpresa.setDisabled(false);
        }

        if (txtCodEmpresaEmp != null) {
            txtCodEmpresaEmp.setValue(null);
            txtCodEmpresaEmp.setDisabled(false);
        }

        if (btnSave != null) {
            btnSave.setDisabled(true);
        }

        if (btnDelete != null) {
            btnDelete.setDisabled(true);
        }

        return "";
    }

    public void listener_txtFcoberTotal() {
        Date inputDate = (Date) txtFcoberTotal.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFcoberUrgencia() {
        Date inputDate = (Date) txtFcoberUrgencia.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFecInicioAfp() {
        Date inputDate = (Date) txtFecInicioAfp.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFecInicioArp() {
        Date inputDate = (Date) txtFecInicioArp.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFecInicioCaja() {
        Date inputDate = (Date) txtFecInicioCaja.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFecInicioEps() {
        Date inputDate = (Date) txtFecInicioEps.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaAfiliacion() {
        Date inputDate = (Date) txtFechaAfiliacion.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaEntregaCarnetArp() {
        Date inputDate = (Date) txtFechaEntregaCarnetArp.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaEntregaCarnetCaja() {
        Date inputDate = (Date) txtFechaEntregaCarnetCaja.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaIngresoEmp() {
        Date inputDate = (Date) txtFechaIngresoEmp.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaNacimiento() {
        Date inputDate = (Date) txtFechaNacimiento.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtFechaRadicacion() {
        Date inputDate = (Date) txtFechaRadicacion.getValue();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance()
                    .addMessage("",
            new FacesMessage("Selected Date " + dateFormat.format(inputDate)));
    }

    public void listener_txtId() {
        try {
            Tp000001Id id = new Tp000001Id();
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));
            entity = (id != null) ? businessDelegatorView.getTp000001(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtAfpActiva.setDisabled(false);
            txtArpActiva.setDisabled(false);
            txtBasico.setDisabled(false);
            txtBeeper.setDisabled(false);
            txtCajaActiva.setDisabled(false);
            txtCelular.setDisabled(false);
            txtCiuCotizante.setDisabled(false);
            txtCiuLaboralCotizante.setDisabled(false);
            txtCodAsesor.setDisabled(false);
            txtCodAsesor2.setDisabled(false);
            txtCodCotizante.setDisabled(false);
            txtCodIntBarrio.setDisabled(false);
            txtCodigoCentroTrabajoC.setDisabled(false);
            txtCodigoPostal.setDisabled(false);
            txtColombianoExterior.setDisabled(false);
            txtCotisanteValorUpc.setDisabled(false);
            txtCotizanteEspecial.setDisabled(false);
            txtCotizanteValorEsp.setDisabled(false);
            txtDirCotizante.setDisabled(false);
            txtEmailCotizante.setDisabled(false);
            txtEpsActiva.setDisabled(false);
            txtEstadoCarnetArp.setDisabled(false);
            txtEstadoCarnetCaja.setDisabled(false);
            txtEstadoCivil.setDisabled(false);
            txtEstadoCotizante.setDisabled(false);
            txtEstrato.setDisabled(false);
            txtExtranjero.setDisabled(false);
            txtIdenCotizante.setDisabled(false);
            txtIpsAtencionCotiza.setDisabled(false);
            txtIpsDirecionCotiza.setDisabled(false);
            txtIpsTelefonosCotiza.setDisabled(false);
            txtNafiliacionAfp.setDisabled(false);
            txtNafiliacionArp.setDisabled(false);
            txtNafiliacionCaja.setDisabled(false);
            txtNafiliacionEps.setDisabled(false);
            txtNumRadicacion.setDisabled(false);
            txtObservacion.setDisabled(false);
            txtPagaParafiscales.setDisabled(false);
            txtPlanilladoRtAfp.setDisabled(false);
            txtPlanilladoRtArp.setDisabled(false);
            txtPlanilladoRtCaja.setDisabled(false);
            txtPlanilladoRtEps.setDisabled(false);
            txtPrimerApeCotizante.setDisabled(false);
            txtPrimerNomCotizante.setDisabled(false);
            txtPrimeraAfp.setDisabled(false);
            txtPrimeraArp.setDisabled(false);
            txtPrimeraCaja.setDisabled(false);
            txtPrimeraEps.setDisabled(false);
            txtQuienRecibeCarnetArp.setDisabled(false);
            txtQuienRecibeCarnetCaja.setDisabled(false);
            txtRutaFoto.setDisabled(false);
            txtSalarioIntegral.setDisabled(false);
            txtSegundoApeCotizante.setDisabled(false);
            txtSegundoNomCotizante.setDisabled(false);
            txtSexo.setDisabled(false);
            txtTelCotizante.setDisabled(false);
            txtTipoAfiliacion.setDisabled(false);
            txtTipoSalario.setDisabled(false);
            txtZona.setDisabled(false);
            txtCodCiudad_Tg000002.setDisabled(false);
            txtCodProfesion_Tg000012.setDisabled(false);
            txtCodActividad_Tg000013.setDisabled(false);
            txtCodIdentidad_Tg000019.setDisabled(false);
            txtCodTipoCotizante_Tg000028.setDisabled(false);
            txtCodSubTipoCotizante_Tg000029.setDisabled(false);
            txtCodEps_Tp000003.setDisabled(false);
            txtCodArp_Tp000004.setDisabled(false);
            txtCodAfp_Tp000005.setDisabled(false);
            txtCodCaja_Tp000006.setDisabled(false);
            txtFcoberTotal.setDisabled(false);
            txtFcoberUrgencia.setDisabled(false);
            txtFecInicioAfp.setDisabled(false);
            txtFecInicioArp.setDisabled(false);
            txtFecInicioCaja.setDisabled(false);
            txtFecInicioEps.setDisabled(false);
            txtFechaAfiliacion.setDisabled(false);
            txtFechaEntregaCarnetArp.setDisabled(false);
            txtFechaEntregaCarnetCaja.setDisabled(false);
            txtFechaIngresoEmp.setDisabled(false);
            txtFechaNacimiento.setDisabled(false);
            txtFechaRadicacion.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            txtCodEmpresaEmp.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtAfpActiva.setValue(entity.getAfpActiva());
            txtAfpActiva.setDisabled(false);
            txtArpActiva.setValue(entity.getArpActiva());
            txtArpActiva.setDisabled(false);
            txtBasico.setValue(entity.getBasico());
            txtBasico.setDisabled(false);
            txtBeeper.setValue(entity.getBeeper());
            txtBeeper.setDisabled(false);
            txtCajaActiva.setValue(entity.getCajaActiva());
            txtCajaActiva.setDisabled(false);
            txtCelular.setValue(entity.getCelular());
            txtCelular.setDisabled(false);
            txtCiuCotizante.setValue(entity.getCiuCotizante());
            txtCiuCotizante.setDisabled(false);
            txtCiuLaboralCotizante.setValue(entity.getCiuLaboralCotizante());
            txtCiuLaboralCotizante.setDisabled(false);
            txtCodAsesor.setValue(entity.getCodAsesor());
            txtCodAsesor.setDisabled(false);
            txtCodAsesor2.setValue(entity.getCodAsesor2());
            txtCodAsesor2.setDisabled(false);
            txtCodCotizante.setValue(entity.getCodCotizante());
            txtCodCotizante.setDisabled(false);
            txtCodIntBarrio.setValue(entity.getCodIntBarrio());
            txtCodIntBarrio.setDisabled(false);
            txtCodigoCentroTrabajoC.setValue(entity.getCodigoCentroTrabajoC());
            txtCodigoCentroTrabajoC.setDisabled(false);
            txtCodigoPostal.setValue(entity.getCodigoPostal());
            txtCodigoPostal.setDisabled(false);
            txtColombianoExterior.setValue(entity.getColombianoExterior());
            txtColombianoExterior.setDisabled(false);
            txtCotisanteValorUpc.setValue(entity.getCotisanteValorUpc());
            txtCotisanteValorUpc.setDisabled(false);
            txtCotizanteEspecial.setValue(entity.getCotizanteEspecial());
            txtCotizanteEspecial.setDisabled(false);
            txtCotizanteValorEsp.setValue(entity.getCotizanteValorEsp());
            txtCotizanteValorEsp.setDisabled(false);
            txtDirCotizante.setValue(entity.getDirCotizante());
            txtDirCotizante.setDisabled(false);
            txtEmailCotizante.setValue(entity.getEmailCotizante());
            txtEmailCotizante.setDisabled(false);
            txtEpsActiva.setValue(entity.getEpsActiva());
            txtEpsActiva.setDisabled(false);
            txtEstadoCarnetArp.setValue(entity.getEstadoCarnetArp());
            txtEstadoCarnetArp.setDisabled(false);
            txtEstadoCarnetCaja.setValue(entity.getEstadoCarnetCaja());
            txtEstadoCarnetCaja.setDisabled(false);
            txtEstadoCivil.setValue(entity.getEstadoCivil());
            txtEstadoCivil.setDisabled(false);
            txtEstadoCotizante.setValue(entity.getEstadoCotizante());
            txtEstadoCotizante.setDisabled(false);
            txtEstrato.setValue(entity.getEstrato());
            txtEstrato.setDisabled(false);
            txtExtranjero.setValue(entity.getExtranjero());
            txtExtranjero.setDisabled(false);
            txtFcoberTotal.setValue(entity.getFcoberTotal());
            txtFcoberTotal.setDisabled(false);
            txtFcoberUrgencia.setValue(entity.getFcoberUrgencia());
            txtFcoberUrgencia.setDisabled(false);
            txtFecInicioAfp.setValue(entity.getFecInicioAfp());
            txtFecInicioAfp.setDisabled(false);
            txtFecInicioArp.setValue(entity.getFecInicioArp());
            txtFecInicioArp.setDisabled(false);
            txtFecInicioCaja.setValue(entity.getFecInicioCaja());
            txtFecInicioCaja.setDisabled(false);
            txtFecInicioEps.setValue(entity.getFecInicioEps());
            txtFecInicioEps.setDisabled(false);
            txtFechaAfiliacion.setValue(entity.getFechaAfiliacion());
            txtFechaAfiliacion.setDisabled(false);
            txtFechaEntregaCarnetArp.setValue(entity.getFechaEntregaCarnetArp());
            txtFechaEntregaCarnetArp.setDisabled(false);
            txtFechaEntregaCarnetCaja.setValue(entity.getFechaEntregaCarnetCaja());
            txtFechaEntregaCarnetCaja.setDisabled(false);
            txtFechaIngresoEmp.setValue(entity.getFechaIngresoEmp());
            txtFechaIngresoEmp.setDisabled(false);
            txtFechaNacimiento.setValue(entity.getFechaNacimiento());
            txtFechaNacimiento.setDisabled(false);
            txtFechaRadicacion.setValue(entity.getFechaRadicacion());
            txtFechaRadicacion.setDisabled(false);
            txtIdenCotizante.setValue(entity.getIdenCotizante());
            txtIdenCotizante.setDisabled(false);
            txtIpsAtencionCotiza.setValue(entity.getIpsAtencionCotiza());
            txtIpsAtencionCotiza.setDisabled(false);
            txtIpsDirecionCotiza.setValue(entity.getIpsDirecionCotiza());
            txtIpsDirecionCotiza.setDisabled(false);
            txtIpsTelefonosCotiza.setValue(entity.getIpsTelefonosCotiza());
            txtIpsTelefonosCotiza.setDisabled(false);
            txtNafiliacionAfp.setValue(entity.getNafiliacionAfp());
            txtNafiliacionAfp.setDisabled(false);
            txtNafiliacionArp.setValue(entity.getNafiliacionArp());
            txtNafiliacionArp.setDisabled(false);
            txtNafiliacionCaja.setValue(entity.getNafiliacionCaja());
            txtNafiliacionCaja.setDisabled(false);
            txtNafiliacionEps.setValue(entity.getNafiliacionEps());
            txtNafiliacionEps.setDisabled(false);
            txtNumRadicacion.setValue(entity.getNumRadicacion());
            txtNumRadicacion.setDisabled(false);
            txtObservacion.setValue(entity.getObservacion());
            txtObservacion.setDisabled(false);
            txtPagaParafiscales.setValue(entity.getPagaParafiscales());
            txtPagaParafiscales.setDisabled(false);
            txtPlanilladoRtAfp.setValue(entity.getPlanilladoRtAfp());
            txtPlanilladoRtAfp.setDisabled(false);
            txtPlanilladoRtArp.setValue(entity.getPlanilladoRtArp());
            txtPlanilladoRtArp.setDisabled(false);
            txtPlanilladoRtCaja.setValue(entity.getPlanilladoRtCaja());
            txtPlanilladoRtCaja.setDisabled(false);
            txtPlanilladoRtEps.setValue(entity.getPlanilladoRtEps());
            txtPlanilladoRtEps.setDisabled(false);
            txtPrimerApeCotizante.setValue(entity.getPrimerApeCotizante());
            txtPrimerApeCotizante.setDisabled(false);
            txtPrimerNomCotizante.setValue(entity.getPrimerNomCotizante());
            txtPrimerNomCotizante.setDisabled(false);
            txtPrimeraAfp.setValue(entity.getPrimeraAfp());
            txtPrimeraAfp.setDisabled(false);
            txtPrimeraArp.setValue(entity.getPrimeraArp());
            txtPrimeraArp.setDisabled(false);
            txtPrimeraCaja.setValue(entity.getPrimeraCaja());
            txtPrimeraCaja.setDisabled(false);
            txtPrimeraEps.setValue(entity.getPrimeraEps());
            txtPrimeraEps.setDisabled(false);
            txtQuienRecibeCarnetArp.setValue(entity.getQuienRecibeCarnetArp());
            txtQuienRecibeCarnetArp.setDisabled(false);
            txtQuienRecibeCarnetCaja.setValue(entity.getQuienRecibeCarnetCaja());
            txtQuienRecibeCarnetCaja.setDisabled(false);
            txtRutaFoto.setValue(entity.getRutaFoto());
            txtRutaFoto.setDisabled(false);
            txtSalarioIntegral.setValue(entity.getSalarioIntegral());
            txtSalarioIntegral.setDisabled(false);
            txtSegundoApeCotizante.setValue(entity.getSegundoApeCotizante());
            txtSegundoApeCotizante.setDisabled(false);
            txtSegundoNomCotizante.setValue(entity.getSegundoNomCotizante());
            txtSegundoNomCotizante.setDisabled(false);
            txtSexo.setValue(entity.getSexo());
            txtSexo.setDisabled(false);
            txtTelCotizante.setValue(entity.getTelCotizante());
            txtTelCotizante.setDisabled(false);
            txtTipoAfiliacion.setValue(entity.getTipoAfiliacion());
            txtTipoAfiliacion.setDisabled(false);
            txtTipoSalario.setValue(entity.getTipoSalario());
            txtTipoSalario.setDisabled(false);
            txtZona.setValue(entity.getZona());
            txtZona.setDisabled(false);
            txtCodCiudad_Tg000002.setValue(entity.getTg000002().getCodCiudad());
            txtCodCiudad_Tg000002.setDisabled(false);
            txtCodProfesion_Tg000012.setValue(entity.getTg000012()
                                                    .getCodProfesion());
            txtCodProfesion_Tg000012.setDisabled(false);
            txtCodActividad_Tg000013.setValue(entity.getTg000013()
                                                    .getCodActividad());
            txtCodActividad_Tg000013.setDisabled(false);
            txtCodIdentidad_Tg000019.setValue(entity.getTg000019()
                                                    .getCodIdentidad());
            txtCodIdentidad_Tg000019.setDisabled(false);
            txtCodTipoCotizante_Tg000028.setValue(entity.getTg000028()
                                                        .getCodTipoCotizante());
            txtCodTipoCotizante_Tg000028.setDisabled(false);
            txtCodSubTipoCotizante_Tg000029.setValue(entity.getTg000029()
                                                           .getCodSubTipoCotizante());
            txtCodSubTipoCotizante_Tg000029.setDisabled(false);
            txtCodEps_Tp000003.setValue(entity.getTp000003().getCodEps());
            txtCodEps_Tp000003.setDisabled(false);
            txtCodArp_Tp000004.setValue(entity.getTp000004().getCodArp());
            txtCodArp_Tp000004.setDisabled(false);
            txtCodAfp_Tp000005.setValue(entity.getTp000005().getCodAfp());
            txtCodAfp_Tp000005.setDisabled(false);
            txtCodCaja_Tp000006.setValue(entity.getTp000006().getCodCaja());
            txtCodCaja_Tp000006.setDisabled(false);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            txtCodEmpresaEmp.setValue(entity.getId().getCodEmpresaEmp());
            txtCodEmpresaEmp.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTp000001 = (Tp000001DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTp000001"));
        txtAfpActiva.setValue(selectedTp000001.getAfpActiva());
        txtAfpActiva.setDisabled(false);
        txtArpActiva.setValue(selectedTp000001.getArpActiva());
        txtArpActiva.setDisabled(false);
        txtBasico.setValue(selectedTp000001.getBasico());
        txtBasico.setDisabled(false);
        txtBeeper.setValue(selectedTp000001.getBeeper());
        txtBeeper.setDisabled(false);
        txtCajaActiva.setValue(selectedTp000001.getCajaActiva());
        txtCajaActiva.setDisabled(false);
        txtCelular.setValue(selectedTp000001.getCelular());
        txtCelular.setDisabled(false);
        txtCiuCotizante.setValue(selectedTp000001.getCiuCotizante());
        txtCiuCotizante.setDisabled(false);
        txtCiuLaboralCotizante.setValue(selectedTp000001.getCiuLaboralCotizante());
        txtCiuLaboralCotizante.setDisabled(false);
        txtCodAsesor.setValue(selectedTp000001.getCodAsesor());
        txtCodAsesor.setDisabled(false);
        txtCodAsesor2.setValue(selectedTp000001.getCodAsesor2());
        txtCodAsesor2.setDisabled(false);
        txtCodCotizante.setValue(selectedTp000001.getCodCotizante());
        txtCodCotizante.setDisabled(false);
        txtCodIntBarrio.setValue(selectedTp000001.getCodIntBarrio());
        txtCodIntBarrio.setDisabled(false);
        txtCodigoCentroTrabajoC.setValue(selectedTp000001.getCodigoCentroTrabajoC());
        txtCodigoCentroTrabajoC.setDisabled(false);
        txtCodigoPostal.setValue(selectedTp000001.getCodigoPostal());
        txtCodigoPostal.setDisabled(false);
        txtColombianoExterior.setValue(selectedTp000001.getColombianoExterior());
        txtColombianoExterior.setDisabled(false);
        txtCotisanteValorUpc.setValue(selectedTp000001.getCotisanteValorUpc());
        txtCotisanteValorUpc.setDisabled(false);
        txtCotizanteEspecial.setValue(selectedTp000001.getCotizanteEspecial());
        txtCotizanteEspecial.setDisabled(false);
        txtCotizanteValorEsp.setValue(selectedTp000001.getCotizanteValorEsp());
        txtCotizanteValorEsp.setDisabled(false);
        txtDirCotizante.setValue(selectedTp000001.getDirCotizante());
        txtDirCotizante.setDisabled(false);
        txtEmailCotizante.setValue(selectedTp000001.getEmailCotizante());
        txtEmailCotizante.setDisabled(false);
        txtEpsActiva.setValue(selectedTp000001.getEpsActiva());
        txtEpsActiva.setDisabled(false);
        txtEstadoCarnetArp.setValue(selectedTp000001.getEstadoCarnetArp());
        txtEstadoCarnetArp.setDisabled(false);
        txtEstadoCarnetCaja.setValue(selectedTp000001.getEstadoCarnetCaja());
        txtEstadoCarnetCaja.setDisabled(false);
        txtEstadoCivil.setValue(selectedTp000001.getEstadoCivil());
        txtEstadoCivil.setDisabled(false);
        txtEstadoCotizante.setValue(selectedTp000001.getEstadoCotizante());
        txtEstadoCotizante.setDisabled(false);
        txtEstrato.setValue(selectedTp000001.getEstrato());
        txtEstrato.setDisabled(false);
        txtExtranjero.setValue(selectedTp000001.getExtranjero());
        txtExtranjero.setDisabled(false);
        txtFcoberTotal.setValue(selectedTp000001.getFcoberTotal());
        txtFcoberTotal.setDisabled(false);
        txtFcoberUrgencia.setValue(selectedTp000001.getFcoberUrgencia());
        txtFcoberUrgencia.setDisabled(false);
        txtFecInicioAfp.setValue(selectedTp000001.getFecInicioAfp());
        txtFecInicioAfp.setDisabled(false);
        txtFecInicioArp.setValue(selectedTp000001.getFecInicioArp());
        txtFecInicioArp.setDisabled(false);
        txtFecInicioCaja.setValue(selectedTp000001.getFecInicioCaja());
        txtFecInicioCaja.setDisabled(false);
        txtFecInicioEps.setValue(selectedTp000001.getFecInicioEps());
        txtFecInicioEps.setDisabled(false);
        txtFechaAfiliacion.setValue(selectedTp000001.getFechaAfiliacion());
        txtFechaAfiliacion.setDisabled(false);
        txtFechaEntregaCarnetArp.setValue(selectedTp000001.getFechaEntregaCarnetArp());
        txtFechaEntregaCarnetArp.setDisabled(false);
        txtFechaEntregaCarnetCaja.setValue(selectedTp000001.getFechaEntregaCarnetCaja());
        txtFechaEntregaCarnetCaja.setDisabled(false);
        txtFechaIngresoEmp.setValue(selectedTp000001.getFechaIngresoEmp());
        txtFechaIngresoEmp.setDisabled(false);
        txtFechaNacimiento.setValue(selectedTp000001.getFechaNacimiento());
        txtFechaNacimiento.setDisabled(false);
        txtFechaRadicacion.setValue(selectedTp000001.getFechaRadicacion());
        txtFechaRadicacion.setDisabled(false);
        txtIdenCotizante.setValue(selectedTp000001.getIdenCotizante());
        txtIdenCotizante.setDisabled(false);
        txtIpsAtencionCotiza.setValue(selectedTp000001.getIpsAtencionCotiza());
        txtIpsAtencionCotiza.setDisabled(false);
        txtIpsDirecionCotiza.setValue(selectedTp000001.getIpsDirecionCotiza());
        txtIpsDirecionCotiza.setDisabled(false);
        txtIpsTelefonosCotiza.setValue(selectedTp000001.getIpsTelefonosCotiza());
        txtIpsTelefonosCotiza.setDisabled(false);
        txtNafiliacionAfp.setValue(selectedTp000001.getNafiliacionAfp());
        txtNafiliacionAfp.setDisabled(false);
        txtNafiliacionArp.setValue(selectedTp000001.getNafiliacionArp());
        txtNafiliacionArp.setDisabled(false);
        txtNafiliacionCaja.setValue(selectedTp000001.getNafiliacionCaja());
        txtNafiliacionCaja.setDisabled(false);
        txtNafiliacionEps.setValue(selectedTp000001.getNafiliacionEps());
        txtNafiliacionEps.setDisabled(false);
        txtNumRadicacion.setValue(selectedTp000001.getNumRadicacion());
        txtNumRadicacion.setDisabled(false);
        txtObservacion.setValue(selectedTp000001.getObservacion());
        txtObservacion.setDisabled(false);
        txtPagaParafiscales.setValue(selectedTp000001.getPagaParafiscales());
        txtPagaParafiscales.setDisabled(false);
        txtPlanilladoRtAfp.setValue(selectedTp000001.getPlanilladoRtAfp());
        txtPlanilladoRtAfp.setDisabled(false);
        txtPlanilladoRtArp.setValue(selectedTp000001.getPlanilladoRtArp());
        txtPlanilladoRtArp.setDisabled(false);
        txtPlanilladoRtCaja.setValue(selectedTp000001.getPlanilladoRtCaja());
        txtPlanilladoRtCaja.setDisabled(false);
        txtPlanilladoRtEps.setValue(selectedTp000001.getPlanilladoRtEps());
        txtPlanilladoRtEps.setDisabled(false);
        txtPrimerApeCotizante.setValue(selectedTp000001.getPrimerApeCotizante());
        txtPrimerApeCotizante.setDisabled(false);
        txtPrimerNomCotizante.setValue(selectedTp000001.getPrimerNomCotizante());
        txtPrimerNomCotizante.setDisabled(false);
        txtPrimeraAfp.setValue(selectedTp000001.getPrimeraAfp());
        txtPrimeraAfp.setDisabled(false);
        txtPrimeraArp.setValue(selectedTp000001.getPrimeraArp());
        txtPrimeraArp.setDisabled(false);
        txtPrimeraCaja.setValue(selectedTp000001.getPrimeraCaja());
        txtPrimeraCaja.setDisabled(false);
        txtPrimeraEps.setValue(selectedTp000001.getPrimeraEps());
        txtPrimeraEps.setDisabled(false);
        txtQuienRecibeCarnetArp.setValue(selectedTp000001.getQuienRecibeCarnetArp());
        txtQuienRecibeCarnetArp.setDisabled(false);
        txtQuienRecibeCarnetCaja.setValue(selectedTp000001.getQuienRecibeCarnetCaja());
        txtQuienRecibeCarnetCaja.setDisabled(false);
        txtRutaFoto.setValue(selectedTp000001.getRutaFoto());
        txtRutaFoto.setDisabled(false);
        txtSalarioIntegral.setValue(selectedTp000001.getSalarioIntegral());
        txtSalarioIntegral.setDisabled(false);
        txtSegundoApeCotizante.setValue(selectedTp000001.getSegundoApeCotizante());
        txtSegundoApeCotizante.setDisabled(false);
        txtSegundoNomCotizante.setValue(selectedTp000001.getSegundoNomCotizante());
        txtSegundoNomCotizante.setDisabled(false);
        txtSexo.setValue(selectedTp000001.getSexo());
        txtSexo.setDisabled(false);
        txtTelCotizante.setValue(selectedTp000001.getTelCotizante());
        txtTelCotizante.setDisabled(false);
        txtTipoAfiliacion.setValue(selectedTp000001.getTipoAfiliacion());
        txtTipoAfiliacion.setDisabled(false);
        txtTipoSalario.setValue(selectedTp000001.getTipoSalario());
        txtTipoSalario.setDisabled(false);
        txtZona.setValue(selectedTp000001.getZona());
        txtZona.setDisabled(false);
        txtCodCiudad_Tg000002.setValue(selectedTp000001.getCodCiudad_Tg000002());
        txtCodCiudad_Tg000002.setDisabled(false);
        txtCodProfesion_Tg000012.setValue(selectedTp000001.getCodProfesion_Tg000012());
        txtCodProfesion_Tg000012.setDisabled(false);
        txtCodActividad_Tg000013.setValue(selectedTp000001.getCodActividad_Tg000013());
        txtCodActividad_Tg000013.setDisabled(false);
        txtCodIdentidad_Tg000019.setValue(selectedTp000001.getCodIdentidad_Tg000019());
        txtCodIdentidad_Tg000019.setDisabled(false);
        txtCodTipoCotizante_Tg000028.setValue(selectedTp000001.getCodTipoCotizante_Tg000028());
        txtCodTipoCotizante_Tg000028.setDisabled(false);
        txtCodSubTipoCotizante_Tg000029.setValue(selectedTp000001.getCodSubTipoCotizante_Tg000029());
        txtCodSubTipoCotizante_Tg000029.setDisabled(false);
        txtCodEps_Tp000003.setValue(selectedTp000001.getCodEps_Tp000003());
        txtCodEps_Tp000003.setDisabled(false);
        txtCodArp_Tp000004.setValue(selectedTp000001.getCodArp_Tp000004());
        txtCodArp_Tp000004.setDisabled(false);
        txtCodAfp_Tp000005.setValue(selectedTp000001.getCodAfp_Tp000005());
        txtCodAfp_Tp000005.setDisabled(false);
        txtCodCaja_Tp000006.setValue(selectedTp000001.getCodCaja_Tp000006());
        txtCodCaja_Tp000006.setDisabled(false);
        txtCodEmpresa.setValue(selectedTp000001.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        txtCodEmpresaEmp.setValue(selectedTp000001.getCodEmpresaEmp());
        txtCodEmpresaEmp.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTp000001 == null) && (entity == null)) {
                action_create();
            } else {
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
            entity = new Tp000001();

            Tp000001Id id = new Tp000001Id();
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));

            entity.setAfpActiva(FacesUtils.checkString(txtAfpActiva));
            entity.setArpActiva(FacesUtils.checkString(txtArpActiva));
            entity.setBasico(FacesUtils.checkDouble(txtBasico));
            entity.setBeeper(FacesUtils.checkString(txtBeeper));
            entity.setCajaActiva(FacesUtils.checkString(txtCajaActiva));
            entity.setCelular(FacesUtils.checkString(txtCelular));
            entity.setCiuCotizante(FacesUtils.checkString(txtCiuCotizante));
            entity.setCiuLaboralCotizante(FacesUtils.checkString(
                    txtCiuLaboralCotizante));
            entity.setCodAsesor(FacesUtils.checkString(txtCodAsesor));
            entity.setCodAsesor2(FacesUtils.checkString(txtCodAsesor2));
            entity.setCodCotizante(FacesUtils.checkString(txtCodCotizante));
            entity.setCodIntBarrio(FacesUtils.checkString(txtCodIntBarrio));
            entity.setCodigoCentroTrabajoC(FacesUtils.checkString(
                    txtCodigoCentroTrabajoC));
            entity.setCodigoPostal(FacesUtils.checkString(txtCodigoPostal));
            entity.setColombianoExterior(FacesUtils.checkString(
                    txtColombianoExterior));
            entity.setCotisanteValorUpc(FacesUtils.checkDouble(
                    txtCotisanteValorUpc));
            entity.setCotizanteEspecial(FacesUtils.checkString(
                    txtCotizanteEspecial));
            entity.setCotizanteValorEsp(FacesUtils.checkDouble(
                    txtCotizanteValorEsp));
            entity.setDirCotizante(FacesUtils.checkString(txtDirCotizante));
            entity.setEmailCotizante(FacesUtils.checkString(txtEmailCotizante));
            entity.setEpsActiva(FacesUtils.checkString(txtEpsActiva));
            entity.setEstadoCarnetArp(FacesUtils.checkString(txtEstadoCarnetArp));
            entity.setEstadoCarnetCaja(FacesUtils.checkString(
                    txtEstadoCarnetCaja));
            entity.setEstadoCivil(FacesUtils.checkString(txtEstadoCivil));
            entity.setEstadoCotizante(FacesUtils.checkString(txtEstadoCotizante));
            entity.setEstrato(FacesUtils.checkInteger(txtEstrato));
            entity.setExtranjero(FacesUtils.checkString(txtExtranjero));
            entity.setFcoberTotal(FacesUtils.checkDate(txtFcoberTotal));
            entity.setFcoberUrgencia(FacesUtils.checkDate(txtFcoberUrgencia));
            entity.setFecInicioAfp(FacesUtils.checkDate(txtFecInicioAfp));
            entity.setFecInicioArp(FacesUtils.checkDate(txtFecInicioArp));
            entity.setFecInicioCaja(FacesUtils.checkDate(txtFecInicioCaja));
            entity.setFecInicioEps(FacesUtils.checkDate(txtFecInicioEps));
            entity.setFechaAfiliacion(FacesUtils.checkDate(txtFechaAfiliacion));
            entity.setFechaEntregaCarnetArp(FacesUtils.checkDate(
                    txtFechaEntregaCarnetArp));
            entity.setFechaEntregaCarnetCaja(FacesUtils.checkDate(
                    txtFechaEntregaCarnetCaja));
            entity.setFechaIngresoEmp(FacesUtils.checkDate(txtFechaIngresoEmp));
            entity.setFechaNacimiento(FacesUtils.checkDate(txtFechaNacimiento));
            entity.setFechaRadicacion(FacesUtils.checkDate(txtFechaRadicacion));
            entity.setId(id);
            entity.setIdenCotizante(FacesUtils.checkString(txtIdenCotizante));
            entity.setIpsAtencionCotiza(FacesUtils.checkString(
                    txtIpsAtencionCotiza));
            entity.setIpsDirecionCotiza(FacesUtils.checkString(
                    txtIpsDirecionCotiza));
            entity.setIpsTelefonosCotiza(FacesUtils.checkString(
                    txtIpsTelefonosCotiza));
            entity.setNafiliacionAfp(FacesUtils.checkString(txtNafiliacionAfp));
            entity.setNafiliacionArp(FacesUtils.checkString(txtNafiliacionArp));
            entity.setNafiliacionCaja(FacesUtils.checkString(txtNafiliacionCaja));
            entity.setNafiliacionEps(FacesUtils.checkString(txtNafiliacionEps));
            entity.setNumRadicacion(FacesUtils.checkString(txtNumRadicacion));
            entity.setObservacion(FacesUtils.checkString(txtObservacion));
            entity.setPagaParafiscales(FacesUtils.checkString(
                    txtPagaParafiscales));
            entity.setPlanilladoRtAfp(FacesUtils.checkString(txtPlanilladoRtAfp));
            entity.setPlanilladoRtArp(FacesUtils.checkString(txtPlanilladoRtArp));
            entity.setPlanilladoRtCaja(FacesUtils.checkString(
                    txtPlanilladoRtCaja));
            entity.setPlanilladoRtEps(FacesUtils.checkString(txtPlanilladoRtEps));
            entity.setPrimerApeCotizante(FacesUtils.checkString(
                    txtPrimerApeCotizante));
            entity.setPrimerNomCotizante(FacesUtils.checkString(
                    txtPrimerNomCotizante));
            entity.setPrimeraAfp(FacesUtils.checkString(txtPrimeraAfp));
            entity.setPrimeraArp(FacesUtils.checkString(txtPrimeraArp));
            entity.setPrimeraCaja(FacesUtils.checkString(txtPrimeraCaja));
            entity.setPrimeraEps(FacesUtils.checkString(txtPrimeraEps));
            entity.setQuienRecibeCarnetArp(FacesUtils.checkString(
                    txtQuienRecibeCarnetArp));
            entity.setQuienRecibeCarnetCaja(FacesUtils.checkString(
                    txtQuienRecibeCarnetCaja));
            entity.setRutaFoto(FacesUtils.checkString(txtRutaFoto));
            entity.setSalarioIntegral(FacesUtils.checkString(txtSalarioIntegral));
            entity.setSegundoApeCotizante(FacesUtils.checkString(
                    txtSegundoApeCotizante));
            entity.setSegundoNomCotizante(FacesUtils.checkString(
                    txtSegundoNomCotizante));
            entity.setSexo(FacesUtils.checkString(txtSexo));
            entity.setTelCotizante(FacesUtils.checkString(txtTelCotizante));
            entity.setTipoAfiliacion(FacesUtils.checkString(txtTipoAfiliacion));
            entity.setTipoSalario(FacesUtils.checkString(txtTipoSalario));
            entity.setZona(FacesUtils.checkInteger(txtZona));
            entity.setTg000002((FacesUtils.checkString(txtCodCiudad_Tg000002) != null)
                ? businessDelegatorView.getTg000002(FacesUtils.checkString(
                        txtCodCiudad_Tg000002)) : null);
            entity.setTg000012((FacesUtils.checkString(txtCodProfesion_Tg000012) != null)
                ? businessDelegatorView.getTg000012(FacesUtils.checkString(
                        txtCodProfesion_Tg000012)) : null);
            entity.setTg000013((FacesUtils.checkString(txtCodActividad_Tg000013) != null)
                ? businessDelegatorView.getTg000013(FacesUtils.checkString(
                        txtCodActividad_Tg000013)) : null);
            entity.setTg000019((FacesUtils.checkString(txtCodIdentidad_Tg000019) != null)
                ? businessDelegatorView.getTg000019(FacesUtils.checkString(
                        txtCodIdentidad_Tg000019)) : null);
            entity.setTg000028((FacesUtils.checkString(
                    txtCodTipoCotizante_Tg000028) != null)
                ? businessDelegatorView.getTg000028(FacesUtils.checkString(
                        txtCodTipoCotizante_Tg000028)) : null);
            entity.setTg000029((FacesUtils.checkString(
                    txtCodSubTipoCotizante_Tg000029) != null)
                ? businessDelegatorView.getTg000029(FacesUtils.checkString(
                        txtCodSubTipoCotizante_Tg000029)) : null);
            entity.setTp000003((FacesUtils.checkString(txtCodEps_Tp000003) != null)
                ? businessDelegatorView.getTp000003(FacesUtils.checkString(
                        txtCodEps_Tp000003)) : null);
            entity.setTp000004((FacesUtils.checkString(txtCodArp_Tp000004) != null)
                ? businessDelegatorView.getTp000004(FacesUtils.checkString(
                        txtCodArp_Tp000004)) : null);
            entity.setTp000005((FacesUtils.checkString(txtCodAfp_Tp000005) != null)
                ? businessDelegatorView.getTp000005(FacesUtils.checkString(
                        txtCodAfp_Tp000005)) : null);
            entity.setTp000006((FacesUtils.checkString(txtCodCaja_Tp000006) != null)
                ? businessDelegatorView.getTp000006(FacesUtils.checkString(
                        txtCodCaja_Tp000006)) : null);
            businessDelegatorView.saveTp000001(entity);
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
            if (entity == null) {
                Tp000001Id id = new Tp000001Id();
                id.setCodEmpresa(selectedTp000001.getCodEmpresa());
                id.setCodEmpresaEmp(selectedTp000001.getCodEmpresaEmp());
                entity = businessDelegatorView.getTp000001(id);
            }

            entity.setAfpActiva(FacesUtils.checkString(txtAfpActiva));
            entity.setArpActiva(FacesUtils.checkString(txtArpActiva));
            entity.setBasico(FacesUtils.checkDouble(txtBasico));
            entity.setBeeper(FacesUtils.checkString(txtBeeper));
            entity.setCajaActiva(FacesUtils.checkString(txtCajaActiva));
            entity.setCelular(FacesUtils.checkString(txtCelular));
            entity.setCiuCotizante(FacesUtils.checkString(txtCiuCotizante));
            entity.setCiuLaboralCotizante(FacesUtils.checkString(
                    txtCiuLaboralCotizante));
            entity.setCodAsesor(FacesUtils.checkString(txtCodAsesor));
            entity.setCodAsesor2(FacesUtils.checkString(txtCodAsesor2));
            entity.setCodCotizante(FacesUtils.checkString(txtCodCotizante));
            entity.setCodIntBarrio(FacesUtils.checkString(txtCodIntBarrio));
            entity.setCodigoCentroTrabajoC(FacesUtils.checkString(
                    txtCodigoCentroTrabajoC));
            entity.setCodigoPostal(FacesUtils.checkString(txtCodigoPostal));
            entity.setColombianoExterior(FacesUtils.checkString(
                    txtColombianoExterior));
            entity.setCotisanteValorUpc(FacesUtils.checkDouble(
                    txtCotisanteValorUpc));
            entity.setCotizanteEspecial(FacesUtils.checkString(
                    txtCotizanteEspecial));
            entity.setCotizanteValorEsp(FacesUtils.checkDouble(
                    txtCotizanteValorEsp));
            entity.setDirCotizante(FacesUtils.checkString(txtDirCotizante));
            entity.setEmailCotizante(FacesUtils.checkString(txtEmailCotizante));
            entity.setEpsActiva(FacesUtils.checkString(txtEpsActiva));
            entity.setEstadoCarnetArp(FacesUtils.checkString(txtEstadoCarnetArp));
            entity.setEstadoCarnetCaja(FacesUtils.checkString(
                    txtEstadoCarnetCaja));
            entity.setEstadoCivil(FacesUtils.checkString(txtEstadoCivil));
            entity.setEstadoCotizante(FacesUtils.checkString(txtEstadoCotizante));
            entity.setEstrato(FacesUtils.checkInteger(txtEstrato));
            entity.setExtranjero(FacesUtils.checkString(txtExtranjero));
            entity.setFcoberTotal(FacesUtils.checkDate(txtFcoberTotal));
            entity.setFcoberUrgencia(FacesUtils.checkDate(txtFcoberUrgencia));
            entity.setFecInicioAfp(FacesUtils.checkDate(txtFecInicioAfp));
            entity.setFecInicioArp(FacesUtils.checkDate(txtFecInicioArp));
            entity.setFecInicioCaja(FacesUtils.checkDate(txtFecInicioCaja));
            entity.setFecInicioEps(FacesUtils.checkDate(txtFecInicioEps));
            entity.setFechaAfiliacion(FacesUtils.checkDate(txtFechaAfiliacion));
            entity.setFechaEntregaCarnetArp(FacesUtils.checkDate(
                    txtFechaEntregaCarnetArp));
            entity.setFechaEntregaCarnetCaja(FacesUtils.checkDate(
                    txtFechaEntregaCarnetCaja));
            entity.setFechaIngresoEmp(FacesUtils.checkDate(txtFechaIngresoEmp));
            entity.setFechaNacimiento(FacesUtils.checkDate(txtFechaNacimiento));
            entity.setFechaRadicacion(FacesUtils.checkDate(txtFechaRadicacion));
            entity.setIdenCotizante(FacesUtils.checkString(txtIdenCotizante));
            entity.setIpsAtencionCotiza(FacesUtils.checkString(
                    txtIpsAtencionCotiza));
            entity.setIpsDirecionCotiza(FacesUtils.checkString(
                    txtIpsDirecionCotiza));
            entity.setIpsTelefonosCotiza(FacesUtils.checkString(
                    txtIpsTelefonosCotiza));
            entity.setNafiliacionAfp(FacesUtils.checkString(txtNafiliacionAfp));
            entity.setNafiliacionArp(FacesUtils.checkString(txtNafiliacionArp));
            entity.setNafiliacionCaja(FacesUtils.checkString(txtNafiliacionCaja));
            entity.setNafiliacionEps(FacesUtils.checkString(txtNafiliacionEps));
            entity.setNumRadicacion(FacesUtils.checkString(txtNumRadicacion));
            entity.setObservacion(FacesUtils.checkString(txtObservacion));
            entity.setPagaParafiscales(FacesUtils.checkString(
                    txtPagaParafiscales));
            entity.setPlanilladoRtAfp(FacesUtils.checkString(txtPlanilladoRtAfp));
            entity.setPlanilladoRtArp(FacesUtils.checkString(txtPlanilladoRtArp));
            entity.setPlanilladoRtCaja(FacesUtils.checkString(
                    txtPlanilladoRtCaja));
            entity.setPlanilladoRtEps(FacesUtils.checkString(txtPlanilladoRtEps));
            entity.setPrimerApeCotizante(FacesUtils.checkString(
                    txtPrimerApeCotizante));
            entity.setPrimerNomCotizante(FacesUtils.checkString(
                    txtPrimerNomCotizante));
            entity.setPrimeraAfp(FacesUtils.checkString(txtPrimeraAfp));
            entity.setPrimeraArp(FacesUtils.checkString(txtPrimeraArp));
            entity.setPrimeraCaja(FacesUtils.checkString(txtPrimeraCaja));
            entity.setPrimeraEps(FacesUtils.checkString(txtPrimeraEps));
            entity.setQuienRecibeCarnetArp(FacesUtils.checkString(
                    txtQuienRecibeCarnetArp));
            entity.setQuienRecibeCarnetCaja(FacesUtils.checkString(
                    txtQuienRecibeCarnetCaja));
            entity.setRutaFoto(FacesUtils.checkString(txtRutaFoto));
            entity.setSalarioIntegral(FacesUtils.checkString(txtSalarioIntegral));
            entity.setSegundoApeCotizante(FacesUtils.checkString(
                    txtSegundoApeCotizante));
            entity.setSegundoNomCotizante(FacesUtils.checkString(
                    txtSegundoNomCotizante));
            entity.setSexo(FacesUtils.checkString(txtSexo));
            entity.setTelCotizante(FacesUtils.checkString(txtTelCotizante));
            entity.setTipoAfiliacion(FacesUtils.checkString(txtTipoAfiliacion));
            entity.setTipoSalario(FacesUtils.checkString(txtTipoSalario));
            entity.setZona(FacesUtils.checkInteger(txtZona));
            entity.setTg000002((FacesUtils.checkString(txtCodCiudad_Tg000002) != null)
                ? businessDelegatorView.getTg000002(FacesUtils.checkString(
                        txtCodCiudad_Tg000002)) : null);
            entity.setTg000012((FacesUtils.checkString(txtCodProfesion_Tg000012) != null)
                ? businessDelegatorView.getTg000012(FacesUtils.checkString(
                        txtCodProfesion_Tg000012)) : null);
            entity.setTg000013((FacesUtils.checkString(txtCodActividad_Tg000013) != null)
                ? businessDelegatorView.getTg000013(FacesUtils.checkString(
                        txtCodActividad_Tg000013)) : null);
            entity.setTg000019((FacesUtils.checkString(txtCodIdentidad_Tg000019) != null)
                ? businessDelegatorView.getTg000019(FacesUtils.checkString(
                        txtCodIdentidad_Tg000019)) : null);
            entity.setTg000028((FacesUtils.checkString(
                    txtCodTipoCotizante_Tg000028) != null)
                ? businessDelegatorView.getTg000028(FacesUtils.checkString(
                        txtCodTipoCotizante_Tg000028)) : null);
            entity.setTg000029((FacesUtils.checkString(
                    txtCodSubTipoCotizante_Tg000029) != null)
                ? businessDelegatorView.getTg000029(FacesUtils.checkString(
                        txtCodSubTipoCotizante_Tg000029)) : null);
            entity.setTp000003((FacesUtils.checkString(txtCodEps_Tp000003) != null)
                ? businessDelegatorView.getTp000003(FacesUtils.checkString(
                        txtCodEps_Tp000003)) : null);
            entity.setTp000004((FacesUtils.checkString(txtCodArp_Tp000004) != null)
                ? businessDelegatorView.getTp000004(FacesUtils.checkString(
                        txtCodArp_Tp000004)) : null);
            entity.setTp000005((FacesUtils.checkString(txtCodAfp_Tp000005) != null)
                ? businessDelegatorView.getTp000005(FacesUtils.checkString(
                        txtCodAfp_Tp000005)) : null);
            entity.setTp000006((FacesUtils.checkString(txtCodCaja_Tp000006) != null)
                ? businessDelegatorView.getTp000006(FacesUtils.checkString(
                        txtCodCaja_Tp000006)) : null);
            businessDelegatorView.updateTp000001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTp000001 = (Tp000001DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTp000001"));

            Tp000001Id id = new Tp000001Id();
            id.setCodEmpresa(selectedTp000001.getCodEmpresa());
            id.setCodEmpresaEmp(selectedTp000001.getCodEmpresaEmp());
            entity = businessDelegatorView.getTp000001(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tp000001Id id = new Tp000001Id();
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            id.setCodEmpresaEmp((((txtCodEmpresaEmp.getValue()) == null) ||
                (txtCodEmpresaEmp.getValue()).equals("")) ? null
                                                          : FacesUtils.checkString(
                    txtCodEmpresaEmp));
            entity = businessDelegatorView.getTp000001(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTp000001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYDELETED);
            action_clear();
            data = null;
        } catch (Exception e) {
            throw e;
        }
    }

    public String action_closeDialog() {
        setShowDialog(false);
        action_clear();

        return "";
    }

    public String action_modifyWitDTO(String codEmpresa, String codEmpresaEmp,
        String afpActiva, String arpActiva, Double basico, String beeper,
        String cajaActiva, String celular, String ciuCotizante,
        String ciuLaboralCotizante, String codAsesor, String codAsesor2,
        String codCotizante, String codIntBarrio, String codigoCentroTrabajoC,
        String codigoPostal, String colombianoExterior,
        Double cotisanteValorUpc, String cotizanteEspecial,
        Double cotizanteValorEsp, String dirCotizante, String emailCotizante,
        String epsActiva, String estadoCarnetArp, String estadoCarnetCaja,
        String estadoCivil, String estadoCotizante, Integer estrato,
        String extranjero, Date fcoberTotal, Date fcoberUrgencia,
        Date fecInicioAfp, Date fecInicioArp, Date fecInicioCaja,
        Date fecInicioEps, Date fechaAfiliacion, Date fechaEntregaCarnetArp,
        Date fechaEntregaCarnetCaja, Date fechaIngresoEmp,
        Date fechaNacimiento, Date fechaRadicacion, String idenCotizante,
        String ipsAtencionCotiza, String ipsDirecionCotiza,
        String ipsTelefonosCotiza, String nafiliacionAfp,
        String nafiliacionArp, String nafiliacionCaja, String nafiliacionEps,
        String numRadicacion, String observacion, String pagaParafiscales,
        String planilladoRtAfp, String planilladoRtArp,
        String planilladoRtCaja, String planilladoRtEps,
        String primerApeCotizante, String primerNomCotizante,
        String primeraAfp, String primeraArp, String primeraCaja,
        String primeraEps, String quienRecibeCarnetArp,
        String quienRecibeCarnetCaja, String rutaFoto, String salarioIntegral,
        String segundoApeCotizante, String segundoNomCotizante, String sexo,
        String telCotizante, String tipoAfiliacion, String tipoSalario,
        Integer zona, String codCiudad_Tg000002, String codProfesion_Tg000012,
        String codActividad_Tg000013, String codIdentidad_Tg000019,
        String codTipoCotizante_Tg000028, String codSubTipoCotizante_Tg000029,
        String codEps_Tp000003, String codArp_Tp000004, String codAfp_Tp000005,
        String codCaja_Tp000006) throws Exception {
        try {
            entity.setAfpActiva(FacesUtils.checkString(afpActiva));
            entity.setArpActiva(FacesUtils.checkString(arpActiva));
            entity.setBasico(FacesUtils.checkDouble(basico));
            entity.setBeeper(FacesUtils.checkString(beeper));
            entity.setCajaActiva(FacesUtils.checkString(cajaActiva));
            entity.setCelular(FacesUtils.checkString(celular));
            entity.setCiuCotizante(FacesUtils.checkString(ciuCotizante));
            entity.setCiuLaboralCotizante(FacesUtils.checkString(
                    ciuLaboralCotizante));
            entity.setCodAsesor(FacesUtils.checkString(codAsesor));
            entity.setCodAsesor2(FacesUtils.checkString(codAsesor2));
            entity.setCodCotizante(FacesUtils.checkString(codCotizante));
            entity.setCodIntBarrio(FacesUtils.checkString(codIntBarrio));
            entity.setCodigoCentroTrabajoC(FacesUtils.checkString(
                    codigoCentroTrabajoC));
            entity.setCodigoPostal(FacesUtils.checkString(codigoPostal));
            entity.setColombianoExterior(FacesUtils.checkString(
                    colombianoExterior));
            entity.setCotisanteValorUpc(FacesUtils.checkDouble(
                    cotisanteValorUpc));
            entity.setCotizanteEspecial(FacesUtils.checkString(
                    cotizanteEspecial));
            entity.setCotizanteValorEsp(FacesUtils.checkDouble(
                    cotizanteValorEsp));
            entity.setDirCotizante(FacesUtils.checkString(dirCotizante));
            entity.setEmailCotizante(FacesUtils.checkString(emailCotizante));
            entity.setEpsActiva(FacesUtils.checkString(epsActiva));
            entity.setEstadoCarnetArp(FacesUtils.checkString(estadoCarnetArp));
            entity.setEstadoCarnetCaja(FacesUtils.checkString(estadoCarnetCaja));
            entity.setEstadoCivil(FacesUtils.checkString(estadoCivil));
            entity.setEstadoCotizante(FacesUtils.checkString(estadoCotizante));
            entity.setEstrato(FacesUtils.checkInteger(estrato));
            entity.setExtranjero(FacesUtils.checkString(extranjero));
            entity.setFcoberTotal(FacesUtils.checkDate(fcoberTotal));
            entity.setFcoberUrgencia(FacesUtils.checkDate(fcoberUrgencia));
            entity.setFecInicioAfp(FacesUtils.checkDate(fecInicioAfp));
            entity.setFecInicioArp(FacesUtils.checkDate(fecInicioArp));
            entity.setFecInicioCaja(FacesUtils.checkDate(fecInicioCaja));
            entity.setFecInicioEps(FacesUtils.checkDate(fecInicioEps));
            entity.setFechaAfiliacion(FacesUtils.checkDate(fechaAfiliacion));
            entity.setFechaEntregaCarnetArp(FacesUtils.checkDate(
                    fechaEntregaCarnetArp));
            entity.setFechaEntregaCarnetCaja(FacesUtils.checkDate(
                    fechaEntregaCarnetCaja));
            entity.setFechaIngresoEmp(FacesUtils.checkDate(fechaIngresoEmp));
            entity.setFechaNacimiento(FacesUtils.checkDate(fechaNacimiento));
            entity.setFechaRadicacion(FacesUtils.checkDate(fechaRadicacion));
            entity.setIdenCotizante(FacesUtils.checkString(idenCotizante));
            entity.setIpsAtencionCotiza(FacesUtils.checkString(
                    ipsAtencionCotiza));
            entity.setIpsDirecionCotiza(FacesUtils.checkString(
                    ipsDirecionCotiza));
            entity.setIpsTelefonosCotiza(FacesUtils.checkString(
                    ipsTelefonosCotiza));
            entity.setNafiliacionAfp(FacesUtils.checkString(nafiliacionAfp));
            entity.setNafiliacionArp(FacesUtils.checkString(nafiliacionArp));
            entity.setNafiliacionCaja(FacesUtils.checkString(nafiliacionCaja));
            entity.setNafiliacionEps(FacesUtils.checkString(nafiliacionEps));
            entity.setNumRadicacion(FacesUtils.checkString(numRadicacion));
            entity.setObservacion(FacesUtils.checkString(observacion));
            entity.setPagaParafiscales(FacesUtils.checkString(pagaParafiscales));
            entity.setPlanilladoRtAfp(FacesUtils.checkString(planilladoRtAfp));
            entity.setPlanilladoRtArp(FacesUtils.checkString(planilladoRtArp));
            entity.setPlanilladoRtCaja(FacesUtils.checkString(planilladoRtCaja));
            entity.setPlanilladoRtEps(FacesUtils.checkString(planilladoRtEps));
            entity.setPrimerApeCotizante(FacesUtils.checkString(
                    primerApeCotizante));
            entity.setPrimerNomCotizante(FacesUtils.checkString(
                    primerNomCotizante));
            entity.setPrimeraAfp(FacesUtils.checkString(primeraAfp));
            entity.setPrimeraArp(FacesUtils.checkString(primeraArp));
            entity.setPrimeraCaja(FacesUtils.checkString(primeraCaja));
            entity.setPrimeraEps(FacesUtils.checkString(primeraEps));
            entity.setQuienRecibeCarnetArp(FacesUtils.checkString(
                    quienRecibeCarnetArp));
            entity.setQuienRecibeCarnetCaja(FacesUtils.checkString(
                    quienRecibeCarnetCaja));
            entity.setRutaFoto(FacesUtils.checkString(rutaFoto));
            entity.setSalarioIntegral(FacesUtils.checkString(salarioIntegral));
            entity.setSegundoApeCotizante(FacesUtils.checkString(
                    segundoApeCotizante));
            entity.setSegundoNomCotizante(FacesUtils.checkString(
                    segundoNomCotizante));
            entity.setSexo(FacesUtils.checkString(sexo));
            entity.setTelCotizante(FacesUtils.checkString(telCotizante));
            entity.setTipoAfiliacion(FacesUtils.checkString(tipoAfiliacion));
            entity.setTipoSalario(FacesUtils.checkString(tipoSalario));
            entity.setZona(FacesUtils.checkInteger(zona));
            businessDelegatorView.updateTp000001(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tp000001View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtAfpActiva() {
        return txtAfpActiva;
    }

    public void setTxtAfpActiva(InputText txtAfpActiva) {
        this.txtAfpActiva = txtAfpActiva;
    }

    public InputText getTxtArpActiva() {
        return txtArpActiva;
    }

    public void setTxtArpActiva(InputText txtArpActiva) {
        this.txtArpActiva = txtArpActiva;
    }

    public InputText getTxtBasico() {
        return txtBasico;
    }

    public void setTxtBasico(InputText txtBasico) {
        this.txtBasico = txtBasico;
    }

    public InputText getTxtBeeper() {
        return txtBeeper;
    }

    public void setTxtBeeper(InputText txtBeeper) {
        this.txtBeeper = txtBeeper;
    }

    public InputText getTxtCajaActiva() {
        return txtCajaActiva;
    }

    public void setTxtCajaActiva(InputText txtCajaActiva) {
        this.txtCajaActiva = txtCajaActiva;
    }

    public InputText getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(InputText txtCelular) {
        this.txtCelular = txtCelular;
    }

    public InputText getTxtCiuCotizante() {
        return txtCiuCotizante;
    }

    public void setTxtCiuCotizante(InputText txtCiuCotizante) {
        this.txtCiuCotizante = txtCiuCotizante;
    }

    public InputText getTxtCiuLaboralCotizante() {
        return txtCiuLaboralCotizante;
    }

    public void setTxtCiuLaboralCotizante(InputText txtCiuLaboralCotizante) {
        this.txtCiuLaboralCotizante = txtCiuLaboralCotizante;
    }

    public InputText getTxtCodAsesor() {
        return txtCodAsesor;
    }

    public void setTxtCodAsesor(InputText txtCodAsesor) {
        this.txtCodAsesor = txtCodAsesor;
    }

    public InputText getTxtCodAsesor2() {
        return txtCodAsesor2;
    }

    public void setTxtCodAsesor2(InputText txtCodAsesor2) {
        this.txtCodAsesor2 = txtCodAsesor2;
    }

    public InputText getTxtCodCotizante() {
        return txtCodCotizante;
    }

    public void setTxtCodCotizante(InputText txtCodCotizante) {
        this.txtCodCotizante = txtCodCotizante;
    }

    public InputText getTxtCodIntBarrio() {
        return txtCodIntBarrio;
    }

    public void setTxtCodIntBarrio(InputText txtCodIntBarrio) {
        this.txtCodIntBarrio = txtCodIntBarrio;
    }

    public InputText getTxtCodigoCentroTrabajoC() {
        return txtCodigoCentroTrabajoC;
    }

    public void setTxtCodigoCentroTrabajoC(InputText txtCodigoCentroTrabajoC) {
        this.txtCodigoCentroTrabajoC = txtCodigoCentroTrabajoC;
    }

    public InputText getTxtCodigoPostal() {
        return txtCodigoPostal;
    }

    public void setTxtCodigoPostal(InputText txtCodigoPostal) {
        this.txtCodigoPostal = txtCodigoPostal;
    }

    public InputText getTxtColombianoExterior() {
        return txtColombianoExterior;
    }

    public void setTxtColombianoExterior(InputText txtColombianoExterior) {
        this.txtColombianoExterior = txtColombianoExterior;
    }

    public InputText getTxtCotisanteValorUpc() {
        return txtCotisanteValorUpc;
    }

    public void setTxtCotisanteValorUpc(InputText txtCotisanteValorUpc) {
        this.txtCotisanteValorUpc = txtCotisanteValorUpc;
    }

    public InputText getTxtCotizanteEspecial() {
        return txtCotizanteEspecial;
    }

    public void setTxtCotizanteEspecial(InputText txtCotizanteEspecial) {
        this.txtCotizanteEspecial = txtCotizanteEspecial;
    }

    public InputText getTxtCotizanteValorEsp() {
        return txtCotizanteValorEsp;
    }

    public void setTxtCotizanteValorEsp(InputText txtCotizanteValorEsp) {
        this.txtCotizanteValorEsp = txtCotizanteValorEsp;
    }

    public InputText getTxtDirCotizante() {
        return txtDirCotizante;
    }

    public void setTxtDirCotizante(InputText txtDirCotizante) {
        this.txtDirCotizante = txtDirCotizante;
    }

    public InputText getTxtEmailCotizante() {
        return txtEmailCotizante;
    }

    public void setTxtEmailCotizante(InputText txtEmailCotizante) {
        this.txtEmailCotizante = txtEmailCotizante;
    }

    public InputText getTxtEpsActiva() {
        return txtEpsActiva;
    }

    public void setTxtEpsActiva(InputText txtEpsActiva) {
        this.txtEpsActiva = txtEpsActiva;
    }

    public InputText getTxtEstadoCarnetArp() {
        return txtEstadoCarnetArp;
    }

    public void setTxtEstadoCarnetArp(InputText txtEstadoCarnetArp) {
        this.txtEstadoCarnetArp = txtEstadoCarnetArp;
    }

    public InputText getTxtEstadoCarnetCaja() {
        return txtEstadoCarnetCaja;
    }

    public void setTxtEstadoCarnetCaja(InputText txtEstadoCarnetCaja) {
        this.txtEstadoCarnetCaja = txtEstadoCarnetCaja;
    }

    public InputText getTxtEstadoCivil() {
        return txtEstadoCivil;
    }

    public void setTxtEstadoCivil(InputText txtEstadoCivil) {
        this.txtEstadoCivil = txtEstadoCivil;
    }

    public InputText getTxtEstadoCotizante() {
        return txtEstadoCotizante;
    }

    public void setTxtEstadoCotizante(InputText txtEstadoCotizante) {
        this.txtEstadoCotizante = txtEstadoCotizante;
    }

    public InputText getTxtEstrato() {
        return txtEstrato;
    }

    public void setTxtEstrato(InputText txtEstrato) {
        this.txtEstrato = txtEstrato;
    }

    public InputText getTxtExtranjero() {
        return txtExtranjero;
    }

    public void setTxtExtranjero(InputText txtExtranjero) {
        this.txtExtranjero = txtExtranjero;
    }

    public InputText getTxtIdenCotizante() {
        return txtIdenCotizante;
    }

    public void setTxtIdenCotizante(InputText txtIdenCotizante) {
        this.txtIdenCotizante = txtIdenCotizante;
    }

    public InputText getTxtIpsAtencionCotiza() {
        return txtIpsAtencionCotiza;
    }

    public void setTxtIpsAtencionCotiza(InputText txtIpsAtencionCotiza) {
        this.txtIpsAtencionCotiza = txtIpsAtencionCotiza;
    }

    public InputText getTxtIpsDirecionCotiza() {
        return txtIpsDirecionCotiza;
    }

    public void setTxtIpsDirecionCotiza(InputText txtIpsDirecionCotiza) {
        this.txtIpsDirecionCotiza = txtIpsDirecionCotiza;
    }

    public InputText getTxtIpsTelefonosCotiza() {
        return txtIpsTelefonosCotiza;
    }

    public void setTxtIpsTelefonosCotiza(InputText txtIpsTelefonosCotiza) {
        this.txtIpsTelefonosCotiza = txtIpsTelefonosCotiza;
    }

    public InputText getTxtNafiliacionAfp() {
        return txtNafiliacionAfp;
    }

    public void setTxtNafiliacionAfp(InputText txtNafiliacionAfp) {
        this.txtNafiliacionAfp = txtNafiliacionAfp;
    }

    public InputText getTxtNafiliacionArp() {
        return txtNafiliacionArp;
    }

    public void setTxtNafiliacionArp(InputText txtNafiliacionArp) {
        this.txtNafiliacionArp = txtNafiliacionArp;
    }

    public InputText getTxtNafiliacionCaja() {
        return txtNafiliacionCaja;
    }

    public void setTxtNafiliacionCaja(InputText txtNafiliacionCaja) {
        this.txtNafiliacionCaja = txtNafiliacionCaja;
    }

    public InputText getTxtNafiliacionEps() {
        return txtNafiliacionEps;
    }

    public void setTxtNafiliacionEps(InputText txtNafiliacionEps) {
        this.txtNafiliacionEps = txtNafiliacionEps;
    }

    public InputText getTxtNumRadicacion() {
        return txtNumRadicacion;
    }

    public void setTxtNumRadicacion(InputText txtNumRadicacion) {
        this.txtNumRadicacion = txtNumRadicacion;
    }

    public InputText getTxtObservacion() {
        return txtObservacion;
    }

    public void setTxtObservacion(InputText txtObservacion) {
        this.txtObservacion = txtObservacion;
    }

    public InputText getTxtPagaParafiscales() {
        return txtPagaParafiscales;
    }

    public void setTxtPagaParafiscales(InputText txtPagaParafiscales) {
        this.txtPagaParafiscales = txtPagaParafiscales;
    }

    public InputText getTxtPlanilladoRtAfp() {
        return txtPlanilladoRtAfp;
    }

    public void setTxtPlanilladoRtAfp(InputText txtPlanilladoRtAfp) {
        this.txtPlanilladoRtAfp = txtPlanilladoRtAfp;
    }

    public InputText getTxtPlanilladoRtArp() {
        return txtPlanilladoRtArp;
    }

    public void setTxtPlanilladoRtArp(InputText txtPlanilladoRtArp) {
        this.txtPlanilladoRtArp = txtPlanilladoRtArp;
    }

    public InputText getTxtPlanilladoRtCaja() {
        return txtPlanilladoRtCaja;
    }

    public void setTxtPlanilladoRtCaja(InputText txtPlanilladoRtCaja) {
        this.txtPlanilladoRtCaja = txtPlanilladoRtCaja;
    }

    public InputText getTxtPlanilladoRtEps() {
        return txtPlanilladoRtEps;
    }

    public void setTxtPlanilladoRtEps(InputText txtPlanilladoRtEps) {
        this.txtPlanilladoRtEps = txtPlanilladoRtEps;
    }

    public InputText getTxtPrimerApeCotizante() {
        return txtPrimerApeCotizante;
    }

    public void setTxtPrimerApeCotizante(InputText txtPrimerApeCotizante) {
        this.txtPrimerApeCotizante = txtPrimerApeCotizante;
    }

    public InputText getTxtPrimerNomCotizante() {
        return txtPrimerNomCotizante;
    }

    public void setTxtPrimerNomCotizante(InputText txtPrimerNomCotizante) {
        this.txtPrimerNomCotizante = txtPrimerNomCotizante;
    }

    public InputText getTxtPrimeraAfp() {
        return txtPrimeraAfp;
    }

    public void setTxtPrimeraAfp(InputText txtPrimeraAfp) {
        this.txtPrimeraAfp = txtPrimeraAfp;
    }

    public InputText getTxtPrimeraArp() {
        return txtPrimeraArp;
    }

    public void setTxtPrimeraArp(InputText txtPrimeraArp) {
        this.txtPrimeraArp = txtPrimeraArp;
    }

    public InputText getTxtPrimeraCaja() {
        return txtPrimeraCaja;
    }

    public void setTxtPrimeraCaja(InputText txtPrimeraCaja) {
        this.txtPrimeraCaja = txtPrimeraCaja;
    }

    public InputText getTxtPrimeraEps() {
        return txtPrimeraEps;
    }

    public void setTxtPrimeraEps(InputText txtPrimeraEps) {
        this.txtPrimeraEps = txtPrimeraEps;
    }

    public InputText getTxtQuienRecibeCarnetArp() {
        return txtQuienRecibeCarnetArp;
    }

    public void setTxtQuienRecibeCarnetArp(InputText txtQuienRecibeCarnetArp) {
        this.txtQuienRecibeCarnetArp = txtQuienRecibeCarnetArp;
    }

    public InputText getTxtQuienRecibeCarnetCaja() {
        return txtQuienRecibeCarnetCaja;
    }

    public void setTxtQuienRecibeCarnetCaja(InputText txtQuienRecibeCarnetCaja) {
        this.txtQuienRecibeCarnetCaja = txtQuienRecibeCarnetCaja;
    }

    public InputText getTxtRutaFoto() {
        return txtRutaFoto;
    }

    public void setTxtRutaFoto(InputText txtRutaFoto) {
        this.txtRutaFoto = txtRutaFoto;
    }

    public InputText getTxtSalarioIntegral() {
        return txtSalarioIntegral;
    }

    public void setTxtSalarioIntegral(InputText txtSalarioIntegral) {
        this.txtSalarioIntegral = txtSalarioIntegral;
    }

    public InputText getTxtSegundoApeCotizante() {
        return txtSegundoApeCotizante;
    }

    public void setTxtSegundoApeCotizante(InputText txtSegundoApeCotizante) {
        this.txtSegundoApeCotizante = txtSegundoApeCotizante;
    }

    public InputText getTxtSegundoNomCotizante() {
        return txtSegundoNomCotizante;
    }

    public void setTxtSegundoNomCotizante(InputText txtSegundoNomCotizante) {
        this.txtSegundoNomCotizante = txtSegundoNomCotizante;
    }

    public InputText getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(InputText txtSexo) {
        this.txtSexo = txtSexo;
    }

    public InputText getTxtTelCotizante() {
        return txtTelCotizante;
    }

    public void setTxtTelCotizante(InputText txtTelCotizante) {
        this.txtTelCotizante = txtTelCotizante;
    }

    public InputText getTxtTipoAfiliacion() {
        return txtTipoAfiliacion;
    }

    public void setTxtTipoAfiliacion(InputText txtTipoAfiliacion) {
        this.txtTipoAfiliacion = txtTipoAfiliacion;
    }

    public InputText getTxtTipoSalario() {
        return txtTipoSalario;
    }

    public void setTxtTipoSalario(InputText txtTipoSalario) {
        this.txtTipoSalario = txtTipoSalario;
    }

    public InputText getTxtZona() {
        return txtZona;
    }

    public void setTxtZona(InputText txtZona) {
        this.txtZona = txtZona;
    }

    public InputText getTxtCodCiudad_Tg000002() {
        return txtCodCiudad_Tg000002;
    }

    public void setTxtCodCiudad_Tg000002(InputText txtCodCiudad_Tg000002) {
        this.txtCodCiudad_Tg000002 = txtCodCiudad_Tg000002;
    }

    public InputText getTxtCodProfesion_Tg000012() {
        return txtCodProfesion_Tg000012;
    }

    public void setTxtCodProfesion_Tg000012(InputText txtCodProfesion_Tg000012) {
        this.txtCodProfesion_Tg000012 = txtCodProfesion_Tg000012;
    }

    public InputText getTxtCodActividad_Tg000013() {
        return txtCodActividad_Tg000013;
    }

    public void setTxtCodActividad_Tg000013(InputText txtCodActividad_Tg000013) {
        this.txtCodActividad_Tg000013 = txtCodActividad_Tg000013;
    }

    public InputText getTxtCodIdentidad_Tg000019() {
        return txtCodIdentidad_Tg000019;
    }

    public void setTxtCodIdentidad_Tg000019(InputText txtCodIdentidad_Tg000019) {
        this.txtCodIdentidad_Tg000019 = txtCodIdentidad_Tg000019;
    }

    public InputText getTxtCodTipoCotizante_Tg000028() {
        return txtCodTipoCotizante_Tg000028;
    }

    public void setTxtCodTipoCotizante_Tg000028(
        InputText txtCodTipoCotizante_Tg000028) {
        this.txtCodTipoCotizante_Tg000028 = txtCodTipoCotizante_Tg000028;
    }

    public InputText getTxtCodSubTipoCotizante_Tg000029() {
        return txtCodSubTipoCotizante_Tg000029;
    }

    public void setTxtCodSubTipoCotizante_Tg000029(
        InputText txtCodSubTipoCotizante_Tg000029) {
        this.txtCodSubTipoCotizante_Tg000029 = txtCodSubTipoCotizante_Tg000029;
    }

    public InputText getTxtCodEps_Tp000003() {
        return txtCodEps_Tp000003;
    }

    public void setTxtCodEps_Tp000003(InputText txtCodEps_Tp000003) {
        this.txtCodEps_Tp000003 = txtCodEps_Tp000003;
    }

    public InputText getTxtCodArp_Tp000004() {
        return txtCodArp_Tp000004;
    }

    public void setTxtCodArp_Tp000004(InputText txtCodArp_Tp000004) {
        this.txtCodArp_Tp000004 = txtCodArp_Tp000004;
    }

    public InputText getTxtCodAfp_Tp000005() {
        return txtCodAfp_Tp000005;
    }

    public void setTxtCodAfp_Tp000005(InputText txtCodAfp_Tp000005) {
        this.txtCodAfp_Tp000005 = txtCodAfp_Tp000005;
    }

    public InputText getTxtCodCaja_Tp000006() {
        return txtCodCaja_Tp000006;
    }

    public void setTxtCodCaja_Tp000006(InputText txtCodCaja_Tp000006) {
        this.txtCodCaja_Tp000006 = txtCodCaja_Tp000006;
    }

    public Calendar getTxtFcoberTotal() {
        return txtFcoberTotal;
    }

    public void setTxtFcoberTotal(Calendar txtFcoberTotal) {
        this.txtFcoberTotal = txtFcoberTotal;
    }

    public Calendar getTxtFcoberUrgencia() {
        return txtFcoberUrgencia;
    }

    public void setTxtFcoberUrgencia(Calendar txtFcoberUrgencia) {
        this.txtFcoberUrgencia = txtFcoberUrgencia;
    }

    public Calendar getTxtFecInicioAfp() {
        return txtFecInicioAfp;
    }

    public void setTxtFecInicioAfp(Calendar txtFecInicioAfp) {
        this.txtFecInicioAfp = txtFecInicioAfp;
    }

    public Calendar getTxtFecInicioArp() {
        return txtFecInicioArp;
    }

    public void setTxtFecInicioArp(Calendar txtFecInicioArp) {
        this.txtFecInicioArp = txtFecInicioArp;
    }

    public Calendar getTxtFecInicioCaja() {
        return txtFecInicioCaja;
    }

    public void setTxtFecInicioCaja(Calendar txtFecInicioCaja) {
        this.txtFecInicioCaja = txtFecInicioCaja;
    }

    public Calendar getTxtFecInicioEps() {
        return txtFecInicioEps;
    }

    public void setTxtFecInicioEps(Calendar txtFecInicioEps) {
        this.txtFecInicioEps = txtFecInicioEps;
    }

    public Calendar getTxtFechaAfiliacion() {
        return txtFechaAfiliacion;
    }

    public void setTxtFechaAfiliacion(Calendar txtFechaAfiliacion) {
        this.txtFechaAfiliacion = txtFechaAfiliacion;
    }

    public Calendar getTxtFechaEntregaCarnetArp() {
        return txtFechaEntregaCarnetArp;
    }

    public void setTxtFechaEntregaCarnetArp(Calendar txtFechaEntregaCarnetArp) {
        this.txtFechaEntregaCarnetArp = txtFechaEntregaCarnetArp;
    }

    public Calendar getTxtFechaEntregaCarnetCaja() {
        return txtFechaEntregaCarnetCaja;
    }

    public void setTxtFechaEntregaCarnetCaja(Calendar txtFechaEntregaCarnetCaja) {
        this.txtFechaEntregaCarnetCaja = txtFechaEntregaCarnetCaja;
    }

    public Calendar getTxtFechaIngresoEmp() {
        return txtFechaIngresoEmp;
    }

    public void setTxtFechaIngresoEmp(Calendar txtFechaIngresoEmp) {
        this.txtFechaIngresoEmp = txtFechaIngresoEmp;
    }

    public Calendar getTxtFechaNacimiento() {
        return txtFechaNacimiento;
    }

    public void setTxtFechaNacimiento(Calendar txtFechaNacimiento) {
        this.txtFechaNacimiento = txtFechaNacimiento;
    }

    public Calendar getTxtFechaRadicacion() {
        return txtFechaRadicacion;
    }

    public void setTxtFechaRadicacion(Calendar txtFechaRadicacion) {
        this.txtFechaRadicacion = txtFechaRadicacion;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public InputText getTxtCodEmpresaEmp() {
        return txtCodEmpresaEmp;
    }

    public void setTxtCodEmpresaEmp(InputText txtCodEmpresaEmp) {
        this.txtCodEmpresaEmp = txtCodEmpresaEmp;
    }

    public List<Tp000001DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTp000001();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tp000001DTO> tp000001DTO) {
        this.data = tp000001DTO;
    }

    public Tp000001DTO getSelectedTp000001() {
        return selectedTp000001;
    }

    public void setSelectedTp000001(Tp000001DTO tp000001) {
        this.selectedTp000001 = tp000001;
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

    public void setBusinessDelegatorView(
        IBusinessDelegatorView businessDelegatorView) {
        this.businessDelegatorView = businessDelegatorView;
    }

    public boolean isShowDialog() {
        return showDialog;
    }

    public void setShowDialog(boolean showDialog) {
        this.showDialog = showDialog;
    }
}
