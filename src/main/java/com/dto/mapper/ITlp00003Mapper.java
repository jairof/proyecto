package com.dto.mapper;

import com.proyecto.Tlp00003;

import com.proyecto.dto.Tlp00003DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITlp00003Mapper {
    public Tlp00003DTO tlp00003ToTlp00003DTO(Tlp00003 tlp00003)
        throws Exception;

    public Tlp00003 tlp00003DTOToTlp00003(Tlp00003DTO tlp00003DTO)
        throws Exception;

    public List<Tlp00003DTO> listTlp00003ToListTlp00003DTO(
        List<Tlp00003> tlp00003s) throws Exception;

    public List<Tlp00003> listTlp00003DTOToListTlp00003(
        List<Tlp00003DTO> tlp00003DTOs) throws Exception;
}
