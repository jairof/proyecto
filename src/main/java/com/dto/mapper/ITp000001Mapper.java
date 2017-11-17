package com.dto.mapper;

import com.proyecto.Tp000001;

import com.proyecto.dto.Tp000001DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITp000001Mapper {
    public Tp000001DTO tp000001ToTp000001DTO(Tp000001 tp000001)
        throws Exception;

    public Tp000001 tp000001DTOToTp000001(Tp000001DTO tp000001DTO)
        throws Exception;

    public List<Tp000001DTO> listTp000001ToListTp000001DTO(
        List<Tp000001> tp000001s) throws Exception;

    public List<Tp000001> listTp000001DTOToListTp000001(
        List<Tp000001DTO> tp000001DTOs) throws Exception;
}
