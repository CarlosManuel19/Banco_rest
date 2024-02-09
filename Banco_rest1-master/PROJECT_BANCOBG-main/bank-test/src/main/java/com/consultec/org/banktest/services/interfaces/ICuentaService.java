package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;

import java.util.List;

public interface ICuentaService {
    List<CuentaDTO> fetchCuentaList();

}
