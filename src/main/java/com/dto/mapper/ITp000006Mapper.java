package com.dto.mapper;

import com.proyecto.Tp000006;

import com.proyecto.dto.Tp000006DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITp000006Mapper {
    public Tp000006DTO tp000006ToTp000006DTO(Tp000006 tp000006)
        throws Exception;

    public Tp000006 tp000006DTOToTp000006(Tp000006DTO tp000006DTO)
        throws Exception;

    public List<Tp000006DTO> listTp000006ToListTp000006DTO(
        List<Tp000006> tp000006s) throws Exception;

    public List<Tp000006> listTp000006DTOToListTp000006(
        List<Tp000006DTO> tp000006DTOs) throws Exception;
}
