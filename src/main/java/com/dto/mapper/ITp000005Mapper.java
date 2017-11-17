package com.dto.mapper;

import com.proyecto.Tp000005;

import com.proyecto.dto.Tp000005DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITp000005Mapper {
    public Tp000005DTO tp000005ToTp000005DTO(Tp000005 tp000005)
        throws Exception;

    public Tp000005 tp000005DTOToTp000005(Tp000005DTO tp000005DTO)
        throws Exception;

    public List<Tp000005DTO> listTp000005ToListTp000005DTO(
        List<Tp000005> tp000005s) throws Exception;

    public List<Tp000005> listTp000005DTOToListTp000005(
        List<Tp000005DTO> tp000005DTOs) throws Exception;
}
