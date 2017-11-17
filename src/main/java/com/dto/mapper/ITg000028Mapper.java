package com.dto.mapper;

import com.proyecto.Tg000028;

import com.proyecto.dto.Tg000028DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000028Mapper {
    public Tg000028DTO tg000028ToTg000028DTO(Tg000028 tg000028)
        throws Exception;

    public Tg000028 tg000028DTOToTg000028(Tg000028DTO tg000028DTO)
        throws Exception;

    public List<Tg000028DTO> listTg000028ToListTg000028DTO(
        List<Tg000028> tg000028s) throws Exception;

    public List<Tg000028> listTg000028DTOToListTg000028(
        List<Tg000028DTO> tg000028DTOs) throws Exception;
}
