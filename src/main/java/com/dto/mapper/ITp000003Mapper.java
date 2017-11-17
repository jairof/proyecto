package com.dto.mapper;

import com.proyecto.Tp000003;

import com.proyecto.dto.Tp000003DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITp000003Mapper {
    public Tp000003DTO tp000003ToTp000003DTO(Tp000003 tp000003)
        throws Exception;

    public Tp000003 tp000003DTOToTp000003(Tp000003DTO tp000003DTO)
        throws Exception;

    public List<Tp000003DTO> listTp000003ToListTp000003DTO(
        List<Tp000003> tp000003s) throws Exception;

    public List<Tp000003> listTp000003DTOToListTp000003(
        List<Tp000003DTO> tp000003DTOs) throws Exception;
}
