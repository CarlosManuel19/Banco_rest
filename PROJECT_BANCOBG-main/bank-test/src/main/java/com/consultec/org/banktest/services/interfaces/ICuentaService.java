package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.CuentaDTO;

import java.util.List;

public interface ICuentaService {
    List<CuentaDTO> fetchCuentaList();
   /* CuentaDTO save(CuentaDTO cuentaDto);

    CuentaDTO findById(Integer id);

    void delete(CuentaDTO cuentaDTO);

    boolean existsById(Integer id);*/


}
