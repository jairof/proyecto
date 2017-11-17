package com.dto.mapper;

import com.proyecto.Tg000008;

import com.proyecto.dto.Tg000008DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000008Mapper {
    public Tg000008DTO tg000008ToTg000008DTO(Tg000008 tg000008)
        throws Exception;

    public Tg000008 tg000008DTOToTg000008(Tg000008DTO tg000008DTO)
        throws Exception;

    public List<Tg000008DTO> listTg000008ToListTg000008DTO(
        List<Tg000008> tg000008s) throws Exception;

    public List<Tg000008> listTg000008DTOToListTg000008(
        List<Tg000008DTO> tg000008DTOs) throws Exception;
}
