package com.dto.mapper;

import com.proyecto.Tlp00001;

import com.proyecto.dto.Tlp00001DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITlp00001Mapper {
    public Tlp00001DTO tlp00001ToTlp00001DTO(Tlp00001 tlp00001)
        throws Exception;

    public Tlp00001 tlp00001DTOToTlp00001(Tlp00001DTO tlp00001DTO)
        throws Exception;

    public List<Tlp00001DTO> listTlp00001ToListTlp00001DTO(
        List<Tlp00001> tlp00001s) throws Exception;

    public List<Tlp00001> listTlp00001DTOToListTlp00001(
        List<Tlp00001DTO> tlp00001DTOs) throws Exception;
}
