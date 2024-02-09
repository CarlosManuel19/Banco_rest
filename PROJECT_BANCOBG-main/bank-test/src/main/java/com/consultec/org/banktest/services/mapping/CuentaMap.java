package com.consultec.org.banktest.services.mapping;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.ClienteEntity;
import com.consultec.org.banktest.repository.entity.CuentaEntity;

public class CuentaMap {

    public static CuentaDTO mapCuenta(CuentaEntity cuentaEntity) {
        CuentaDTO cuentaDTO = new CuentaDTO();
        cuentaDTO.setNumero_cuenta(cuentaEntity.getNumero_cuenta());
        cuentaDTO.setAlias(cuentaEntity.getAlias());
        cuentaDTO.setEstado(cuentaEntity.getEstado());
        cuentaDTO.getTipo_cuenta(cuentaEntity.getTipo_cuenta());
        cuentaDTO.setBalance(cuentaEntity.getBalance());
        cuentaDTO.setInteres(cuentaEntity.getInteres());
        cuentaDTO.setFecha_creacion(cuentaEntity.getFecha_creacion());
        return cuentaDTO;
    }

}
