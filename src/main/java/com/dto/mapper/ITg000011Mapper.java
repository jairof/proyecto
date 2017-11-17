package com.dto.mapper;

import com.proyecto.Tg000011;

import com.proyecto.dto.Tg000011DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000011Mapper {
    public Tg000011DTO tg000011ToTg000011DTO(Tg000011 tg000011)
        throws Exception;

    public Tg000011 tg000011DTOToTg000011(Tg000011DTO tg000011DTO)
        throws Exception;

    public List<Tg000011DTO> listTg000011ToListTg000011DTO(
        List<Tg000011> tg000011s) throws Exception;

    public List<Tg000011> listTg000011DTOToListTg000011(
        List<Tg000011DTO> tg000011DTOs) throws Exception;
}
