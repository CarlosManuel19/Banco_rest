package com.consultec.org.banktest.controllers;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.services.ClienteServiceImple;
import com.consultec.org.banktest.services.CuentaServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/banco")
public class ControllerClienteCuenta {

    @Autowired
    ClienteServiceImple serviceCliente;

    @Autowired
    CuentaServiceImple serviceCuenta;

    @GetMapping("/healthCheck")
    private String healthCheck() {
        return "Saludable";
    }

    @GetMapping("/cuentas")
    public ResponseEntity<List<CuentaDTO>> findCuenta() {
        List<CuentaDTO> cuentas = serviceCuenta.fetchCuentaList();
        return ResponseEntity.ok(cuentas);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDTO>> findCliente() {
        List<ClienteDTO> clientes = serviceCliente.fetchClienteList();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/FindbyId/{id}")
    public ResponseEntity <ClienteDTO> findByid(@PathVariable("id") Long id){
        System.out.println("estoy en el controller"+id);
        ClienteDTO clientes  = serviceCliente.encontrarid(id);
        return ResponseEntity.ok(clientes);
    }

    @PostMapping("/GuardarCliente")
    public String GuardarCliente(@RequestBody ClienteDTO clienteDTO){
        String x = serviceCliente.guardarCliente(clienteDTO);
        return x;
    }

    @PostMapping("/Guardarcuenta")
    public ResponseEntity<String> guardarCuenta(@RequestBody CuentaDTO cuentaDTO) {
        String resultado = serviceCuenta.guardarCuenta(cuentaDTO);
        if (resultado.startsWith("Cuenta guardada")) {
            return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resultado);
        }
    }

    @DeleteMapping("/Eliminar/{id}")
    public ResponseEntity<String> eliminarCliente(@PathVariable("id") Long id) {
        String resultado = serviceCliente.eliminarCliente(id);
        if (resultado.startsWith("Cliente eliminado")) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resultado);
        }
    }


}
