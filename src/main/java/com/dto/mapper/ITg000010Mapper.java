package com.dto.mapper;

import com.proyecto.Tg000010;

import com.proyecto.dto.Tg000010DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000010Mapper {
    public Tg000010DTO tg000010ToTg000010DTO(Tg000010 tg000010)
        throws Exception;

    public Tg000010 tg000010DTOToTg000010(Tg000010DTO tg000010DTO)
        throws Exception;

    public List<Tg000010DTO> listTg000010ToListTg000010DTO(
        List<Tg000010> tg000010s) throws Exception;

    public List<Tg000010> listTg000010DTOToListTg000010(
        List<Tg000010DTO> tg000010DTOs) throws Exception;
}
