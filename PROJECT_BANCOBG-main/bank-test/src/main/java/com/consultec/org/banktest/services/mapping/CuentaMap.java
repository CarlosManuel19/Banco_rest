package com.consultec.org.banktest.services.mapping;

import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.repository.entity.CuentaEntity;

public class CuentaMap {

    public static CuentaDTO mapCuentaEntityToDTO(CuentaEntity cuentaEntity) {
        CuentaDTO cuentaDTO = new CuentaDTO();
        cuentaDTO.setNumero_cuenta(cuentaEntity.getNumero_cuenta());
        cuentaDTO.setAlias(cuentaEntity.getAlias());
        cuentaDTO.setEstado(cuentaEntity.getEstado());
        cuentaDTO.getTipo_cuenta();
        cuentaDTO.setBalance(cuentaEntity.getBalance());
        cuentaDTO.setInteres(cuentaEntity.getInteres());
        cuentaDTO.setFecha_creacion(cuentaEntity.getFecha_creacion());
        return cuentaDTO;
    }

    public static CuentaEntity mapCuentaDTOToEntity(CuentaDTO cuentaDTO) {
        CuentaEntity cuentaEntity = new CuentaEntity();
        cuentaEntity.setNumero_cuenta(cuentaDTO.getNumero_cuenta());
        cuentaEntity.setAlias(cuentaDTO.getAlias());
        cuentaEntity.setEstado(cuentaDTO.getEstado());
        cuentaEntity.setTipo_cuenta(cuentaDTO.getTipo_cuenta());
        cuentaEntity.setBalance(cuentaDTO.getBalance());
        cuentaEntity.setInteres(cuentaDTO.getInteres());
        cuentaEntity.setFecha_creacion(cuentaDTO.getFecha_creacion());
        return cuentaEntity;
    }


}
