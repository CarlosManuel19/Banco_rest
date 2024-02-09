package com.consultec.org.banktest.services;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.ICuentaRepository;
import com.consultec.org.banktest.repository.entity.CuentaEntity;
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
        iCuentaRepository.findAll().forEach(cuentaEntity -> cuentaDTO.add(CuentaMap.mapCuenta(cuentaEntity)));
        return cuentaDTO;
    }

    /*
    @Override
    public CuentaDTO save(CuentaDTO cuentaDTO) {
        Cuenta  = CuentaDTO
                .idCuenta(cuentaDto.getIdCuenta())
                .nombreCliente(cuentaDto.getNombreCliente())
                .numeroCuenta(cuentaDto.getNumeroCuenta())
                .saldo(cuentaDto.getSaldo())
                .saldo(cuentaDto.getSaldo())
                .build();
        return cuentaDTO.save(cuentaDTO);
    }
*/


}
