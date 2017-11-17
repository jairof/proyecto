package com.dto.mapper;

import com.proyecto.Tg000006;

import com.proyecto.dto.Tg000006DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000006Mapper {
    public Tg000006DTO tg000006ToTg000006DTO(Tg000006 tg000006)
        throws Exception;

    public Tg000006 tg000006DTOToTg000006(Tg000006DTO tg000006DTO)
        throws Exception;

    public List<Tg000006DTO> listTg000006ToListTg000006DTO(
        List<Tg000006> tg000006s) throws Exception;

    public List<Tg000006> listTg000006DTOToListTg000006(
        List<Tg000006DTO> tg000006DTOs) throws Exception;
}
