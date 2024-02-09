package com.consultec.org.banktest.services;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.ICuentaRepository;
import com.consultec.org.banktest.services.interfaces.ICuentaService;
import com.consultec.org.banktest.services.mapping.ClienteMap;
import com.consultec.org.banktest.services.mapping.CuentaMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CuentaServiceImple implements ICuentaService {


    @Autowired
    private ICuentaRepository iCuentaRepository;

    @Override
    public List<CuentaDTO> fetchCuentaList() {
        List<CuentaDTO> cuentaDTO = new ArrayList<>();
        iCuentaRepository.findAll().forEach(CuentaEntity -> cuentaDTO.add(CuentaMap.mapCuenta(CuentaEntity)));
        return cuentaDTO;
    }


}
