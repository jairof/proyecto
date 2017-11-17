package com.dto.mapper;

import com.proyecto.Tg000029;

import com.proyecto.dto.Tg000029DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000029Mapper {
    public Tg000029DTO tg000029ToTg000029DTO(Tg000029 tg000029)
        throws Exception;

    public Tg000029 tg000029DTOToTg000029(Tg000029DTO tg000029DTO)
        throws Exception;

    public List<Tg000029DTO> listTg000029ToListTg000029DTO(
        List<Tg000029> tg000029s) throws Exception;

    public List<Tg000029> listTg000029DTOToListTg000029(
        List<Tg000029DTO> tg000029DTOs) throws Exception;
}
