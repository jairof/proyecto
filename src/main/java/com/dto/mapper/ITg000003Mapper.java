package com.dto.mapper;

import com.proyecto.Tg000003;

import com.proyecto.dto.Tg000003DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITg000003Mapper {
    public Tg000003DTO tg000003ToTg000003DTO(Tg000003 tg000003)
        throws Exception;

    public Tg000003 tg000003DTOToTg000003(Tg000003DTO tg000003DTO)
        throws Exception;

    public List<Tg000003DTO> listTg000003ToListTg000003DTO(
        List<Tg000003> tg000003s) throws Exception;

    public List<Tg000003> listTg000003DTOToListTg000003(
        List<Tg000003DTO> tg000003DTOs) throws Exception;
}
