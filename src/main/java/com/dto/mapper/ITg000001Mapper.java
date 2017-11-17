package com.dto.mapper;

import com.proyecto.Tg000001;

import com.proyecto.dto.Tg000001DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000001Mapper {
    public Tg000001DTO tg000001ToTg000001DTO(Tg000001 tg000001)
        throws Exception;

    public Tg000001 tg000001DTOToTg000001(Tg000001DTO tg000001DTO)
        throws Exception;

    public List<Tg000001DTO> listTg000001ToListTg000001DTO(
        List<Tg000001> tg000001s) throws Exception;

    public List<Tg000001> listTg000001DTOToListTg000001(
        List<Tg000001DTO> tg000001DTOs) throws Exception;
}
