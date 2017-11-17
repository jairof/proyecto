package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000010DTO;

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
public class Tg000010View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000010View.class);
    private InputText txtNomSucursal;
    private InputText txtCodEmpresa_Tg000003;
    private InputText txtCodSucursal;
    private InputText txtCodEmpresa;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000010DTO> data;
    private Tg000010DTO selectedTg000010;
    private Tg000010 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000010View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000010 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000010 = null;

        if (txtNomSucursal != null) {
            txtNomSucursal.setValue(null);
            txtNomSucursal.setDisabled(true);
        }

        if (txtCodEmpresa_Tg000003 != null) {
            txtCodEmpresa_Tg000003.setValue(null);
            txtCodEmpresa_Tg000003.setDisabled(true);
        }

        if (txtCodSucursal != null) {
            txtCodSucursal.setValue(null);
            txtCodSucursal.setDisabled(false);
        }

        if (txtCodEmpresa != null) {
            txtCodEmpresa.setValue(null);
            txtCodEmpresa.setDisabled(false);
        }

        if (btnSave != null) {
            btnSave.setDisabled(true);
        }

        if (btnDelete != null) {
            btnDelete.setDisabled(true);
        }

        return "";
    }

    public void listener_txtId() {
        try {
            Tg000010Id id = new Tg000010Id();
            id.setCodSucursal((((txtCodSucursal.getValue()) == null) ||
                (txtCodSucursal.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtCodSucursal));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = (id != null) ? businessDelegatorView.getTg000010(id) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtNomSucursal.setDisabled(false);
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodSucursal.setDisabled(false);
            txtCodEmpresa.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtNomSucursal.setValue(entity.getNomSucursal());
            txtNomSucursal.setDisabled(false);
            txtCodEmpresa_Tg000003.setValue(entity.getTg000003().getCodEmpresa());
            txtCodEmpresa_Tg000003.setDisabled(false);
            txtCodSucursal.setValue(entity.getId().getCodSucursal());
            txtCodSucursal.setDisabled(true);
            txtCodEmpresa.setValue(entity.getId().getCodEmpresa());
            txtCodEmpresa.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000010 = (Tg000010DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000010"));
        txtNomSucursal.setValue(selectedTg000010.getNomSucursal());
        txtNomSucursal.setDisabled(false);
        txtCodEmpresa_Tg000003.setValue(selectedTg000010.getCodEmpresa_Tg000003());
        txtCodEmpresa_Tg000003.setDisabled(false);
        txtCodSucursal.setValue(selectedTg000010.getCodSucursal());
        txtCodSucursal.setDisabled(true);
        txtCodEmpresa.setValue(selectedTg000010.getCodEmpresa());
        txtCodEmpresa.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000010 == null) && (entity == null)) {
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
            entity = new Tg000010();

            Tg000010Id id = new Tg000010Id();
            id.setCodSucursal((((txtCodSucursal.getValue()) == null) ||
                (txtCodSucursal.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtCodSucursal));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));

            entity.setId(id);
            entity.setNomSucursal(FacesUtils.checkString(txtNomSucursal));
            entity.setTg000003(businessDelegatorView.getTg000003(
                    entity.getId().getCodEmpresa()));
            businessDelegatorView.saveTg000010(entity);
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
                Tg000010Id id = new Tg000010Id();
                id.setCodSucursal(selectedTg000010.getCodSucursal());
                id.setCodEmpresa(selectedTg000010.getCodEmpresa());
                entity = businessDelegatorView.getTg000010(id);
            }

            entity.setNomSucursal(FacesUtils.checkString(txtNomSucursal));
            businessDelegatorView.updateTg000010(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000010 = (Tg000010DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000010"));

            Tg000010Id id = new Tg000010Id();
            id.setCodSucursal(selectedTg000010.getCodSucursal());
            id.setCodEmpresa(selectedTg000010.getCodEmpresa());
            entity = businessDelegatorView.getTg000010(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            Tg000010Id id = new Tg000010Id();
            id.setCodSucursal((((txtCodSucursal.getValue()) == null) ||
                (txtCodSucursal.getValue()).equals("")) ? null
                                                        : FacesUtils.checkString(
                    txtCodSucursal));
            id.setCodEmpresa((((txtCodEmpresa.getValue()) == null) ||
                (txtCodEmpresa.getValue()).equals("")) ? null
                                                       : FacesUtils.checkString(
                    txtCodEmpresa));
            entity = businessDelegatorView.getTg000010(id);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000010(entity);
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

    public String action_modifyWitDTO(String codSucursal, String codEmpresa,
        String nomSucursal, String codEmpresa_Tg000003)
        throws Exception {
        try {
            entity.setNomSucursal(FacesUtils.checkString(nomSucursal));
            businessDelegatorView.updateTg000010(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000010View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtNomSucursal() {
        return txtNomSucursal;
    }

    public void setTxtNomSucursal(InputText txtNomSucursal) {
        this.txtNomSucursal = txtNomSucursal;
    }

    public InputText getTxtCodEmpresa_Tg000003() {
        return txtCodEmpresa_Tg000003;
    }

    public void setTxtCodEmpresa_Tg000003(InputText txtCodEmpresa_Tg000003) {
        this.txtCodEmpresa_Tg000003 = txtCodEmpresa_Tg000003;
    }

    public InputText getTxtCodSucursal() {
        return txtCodSucursal;
    }

    public void setTxtCodSucursal(InputText txtCodSucursal) {
        this.txtCodSucursal = txtCodSucursal;
    }

    public InputText getTxtCodEmpresa() {
        return txtCodEmpresa;
    }

    public void setTxtCodEmpresa(InputText txtCodEmpresa) {
        this.txtCodEmpresa = txtCodEmpresa;
    }

    public List<Tg000010DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000010();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000010DTO> tg000010DTO) {
        this.data = tg000010DTO;
    }

    public Tg000010DTO getSelectedTg000010() {
        return selectedTg000010;
    }

    public void setSelectedTg000010(Tg000010DTO tg000010) {
        this.selectedTg000010 = tg000010;
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
