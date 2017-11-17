package com.dto.mapper;

import com.proyecto.Tg000013;

import com.proyecto.dto.Tg000013DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000013Mapper {
    public Tg000013DTO tg000013ToTg000013DTO(Tg000013 tg000013)
        throws Exception;

    public Tg000013 tg000013DTOToTg000013(Tg000013DTO tg000013DTO)
        throws Exception;

    public List<Tg000013DTO> listTg000013ToListTg000013DTO(
        List<Tg000013> tg000013s) throws Exception;

    public List<Tg000013> listTg000013DTOToListTg000013(
        List<Tg000013DTO> tg000013DTOs) throws Exception;
}
