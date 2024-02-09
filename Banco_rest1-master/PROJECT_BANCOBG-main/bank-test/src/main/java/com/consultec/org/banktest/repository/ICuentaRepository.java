package com.consultec.org.banktest.repository;


import com.consultec.org.banktest.repository.entity.CuentaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICuentaRepository extends CrudRepository<CuentaEntity, String> {

}
