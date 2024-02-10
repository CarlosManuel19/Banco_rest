package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.CuentaDTO;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

public interface ICuentaService {
    List<CuentaDTO> fetchCuentaList();

    String guardarCuenta(CuentaDTO cuentaDto);

    CuentaDTO encontrarCuentaId(Integer id);

    String borrarCuenta(CuentaDTO cuentaDTO);

}
