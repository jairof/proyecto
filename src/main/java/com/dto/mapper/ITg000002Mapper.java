package com.dto.mapper;

import com.proyecto.Tg000002;

import com.proyecto.dto.Tg000002DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000002Mapper {
    public Tg000002DTO tg000002ToTg000002DTO(Tg000002 tg000002)
        throws Exception;

    public Tg000002 tg000002DTOToTg000002(Tg000002DTO tg000002DTO)
        throws Exception;

    public List<Tg000002DTO> listTg000002ToListTg000002DTO(
        List<Tg000002> tg000002s) throws Exception;

    public List<Tg000002> listTg000002DTOToListTg000002(
        List<Tg000002DTO> tg000002DTOs) throws Exception;
}
