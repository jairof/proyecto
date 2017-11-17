package com.dto.mapper;

import com.proyecto.Tlp00002;

import com.proyecto.dto.Tlp00002DTO;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org
* www.zathuracode.org
*
*/
public interface ITlp00002Mapper {
    public Tlp00002DTO tlp00002ToTlp00002DTO(Tlp00002 tlp00002)
        throws Exception;

    public Tlp00002 tlp00002DTOToTlp00002(Tlp00002DTO tlp00002DTO)
        throws Exception;

    public List<Tlp00002DTO> listTlp00002ToListTlp00002DTO(
        List<Tlp00002> tlp00002s) throws Exception;

    public List<Tlp00002> listTlp00002DTOToListTlp00002(
        List<Tlp00002DTO> tlp00002DTOs) throws Exception;
}
