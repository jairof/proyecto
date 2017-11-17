package com.dto.mapper;

import com.proyecto.Tg000012;

import com.proyecto.dto.Tg000012DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000012Mapper {
    public Tg000012DTO tg000012ToTg000012DTO(Tg000012 tg000012)
        throws Exception;

    public Tg000012 tg000012DTOToTg000012(Tg000012DTO tg000012DTO)
        throws Exception;

    public List<Tg000012DTO> listTg000012ToListTg000012DTO(
        List<Tg000012> tg000012s) throws Exception;

    public List<Tg000012> listTg000012DTOToListTg000012(
        List<Tg000012DTO> tg000012DTOs) throws Exception;
}
