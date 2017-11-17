package com.presentation.backingBeans;

import com.exceptions.*;

import com.presentation.businessDelegate.*;

import com.proyecto.*;

import com.proyecto.dto.Tg000026DTO;

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
public class Tg000026View implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(Tg000026View.class);
    private InputText txtDesTipodePlanillas;
    private InputText txtCodTipodePlanillas;
    private CommandButton btnSave;
    private CommandButton btnModify;
    private CommandButton btnDelete;
    private CommandButton btnClear;
    private List<Tg000026DTO> data;
    private Tg000026DTO selectedTg000026;
    private Tg000026 entity;
    private boolean showDialog;
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public Tg000026View() {
        super();
    }

    public String action_new() {
        action_clear();
        selectedTg000026 = null;
        setShowDialog(true);

        return "";
    }

    public String action_clear() {
        entity = null;
        selectedTg000026 = null;

        if (txtDesTipodePlanillas != null) {
            txtDesTipodePlanillas.setValue(null);
            txtDesTipodePlanillas.setDisabled(true);
        }

        if (txtCodTipodePlanillas != null) {
            txtCodTipodePlanillas.setValue(null);
            txtCodTipodePlanillas.setDisabled(false);
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
            String codTipodePlanillas = FacesUtils.checkString(txtCodTipodePlanillas);
            entity = (codTipodePlanillas != null)
                ? businessDelegatorView.getTg000026(codTipodePlanillas) : null;
        } catch (Exception e) {
            entity = null;
        }

        if (entity == null) {
            txtDesTipodePlanillas.setDisabled(false);
            txtCodTipodePlanillas.setDisabled(false);
            btnSave.setDisabled(false);
        } else {
            txtDesTipodePlanillas.setValue(entity.getDesTipodePlanillas());
            txtDesTipodePlanillas.setDisabled(false);
            txtCodTipodePlanillas.setValue(entity.getCodTipodePlanillas());
            txtCodTipodePlanillas.setDisabled(true);
            btnSave.setDisabled(false);

            if (btnDelete != null) {
                btnDelete.setDisabled(false);
            }
        }
    }

    public String action_edit(ActionEvent evt) {
        selectedTg000026 = (Tg000026DTO) (evt.getComponent().getAttributes()
                                             .get("selectedTg000026"));
        txtDesTipodePlanillas.setValue(selectedTg000026.getDesTipodePlanillas());
        txtDesTipodePlanillas.setDisabled(false);
        txtCodTipodePlanillas.setValue(selectedTg000026.getCodTipodePlanillas());
        txtCodTipodePlanillas.setDisabled(true);
        btnSave.setDisabled(false);
        setShowDialog(true);

        return "";
    }

    public String action_save() {
        try {
            if ((selectedTg000026 == null) && (entity == null)) {
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
            entity = new Tg000026();

            String codTipodePlanillas = FacesUtils.checkString(txtCodTipodePlanillas);

            entity.setCodTipodePlanillas(codTipodePlanillas);
            entity.setDesTipodePlanillas(FacesUtils.checkString(
                    txtDesTipodePlanillas));
            businessDelegatorView.saveTg000026(entity);
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
                String codTipodePlanillas = new String(selectedTg000026.getCodTipodePlanillas());
                entity = businessDelegatorView.getTg000026(codTipodePlanillas);
            }

            entity.setDesTipodePlanillas(FacesUtils.checkString(
                    txtDesTipodePlanillas));
            businessDelegatorView.updateTg000026(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            data = null;
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_datatable(ActionEvent evt) {
        try {
            selectedTg000026 = (Tg000026DTO) (evt.getComponent().getAttributes()
                                                 .get("selectedTg000026"));

            String codTipodePlanillas = new String(selectedTg000026.getCodTipodePlanillas());
            entity = businessDelegatorView.getTg000026(codTipodePlanillas);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public String action_delete_master() {
        try {
            String codTipodePlanillas = FacesUtils.checkString(txtCodTipodePlanillas);
            entity = businessDelegatorView.getTg000026(codTipodePlanillas);
            action_delete();
        } catch (Exception e) {
            FacesUtils.addErrorMessage(e.getMessage());
        }

        return "";
    }

    public void action_delete() throws Exception {
        try {
            businessDelegatorView.deleteTg000026(entity);
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

    public String action_modifyWitDTO(String codTipodePlanillas,
        String desTipodePlanillas) throws Exception {
        try {
            entity.setDesTipodePlanillas(FacesUtils.checkString(
                    desTipodePlanillas));
            businessDelegatorView.updateTg000026(entity);
            FacesUtils.addInfoMessage(ZMessManager.ENTITY_SUCCESFULLYMODIFIED);
        } catch (Exception e) {
            //renderManager.getOnDemandRenderer("Tg000026View").requestRender();
            FacesUtils.addErrorMessage(e.getMessage());
            throw e;
        }

        return "";
    }

    public InputText getTxtDesTipodePlanillas() {
        return txtDesTipodePlanillas;
    }

    public void setTxtDesTipodePlanillas(InputText txtDesTipodePlanillas) {
        this.txtDesTipodePlanillas = txtDesTipodePlanillas;
    }

    public InputText getTxtCodTipodePlanillas() {
        return txtCodTipodePlanillas;
    }

    public void setTxtCodTipodePlanillas(InputText txtCodTipodePlanillas) {
        this.txtCodTipodePlanillas = txtCodTipodePlanillas;
    }

    public List<Tg000026DTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataTg000026();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<Tg000026DTO> tg000026DTO) {
        this.data = tg000026DTO;
    }

    public Tg000026DTO getSelectedTg000026() {
        return selectedTg000026;
    }

    public void setSelectedTg000026(Tg000026DTO tg000026) {
        this.selectedTg000026 = tg000026;
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
