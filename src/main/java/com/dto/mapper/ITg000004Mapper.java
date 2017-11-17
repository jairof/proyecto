package com.dto.mapper;

import com.proyecto.Tg000004;

import com.proyecto.dto.Tg000004DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000004Mapper {
    public Tg000004DTO tg000004ToTg000004DTO(Tg000004 tg000004)
        throws Exception;

    public Tg000004 tg000004DTOToTg000004(Tg000004DTO tg000004DTO)
        throws Exception;

    public List<Tg000004DTO> listTg000004ToListTg000004DTO(
        List<Tg000004> tg000004s) throws Exception;

    public List<Tg000004> listTg000004DTOToListTg000004(
        List<Tg000004DTO> tg000004DTOs) throws Exception;
}
