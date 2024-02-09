package com.consultec.org.banktest.controllers;

import com.consultec.org.banktest.modelo.ClienteDTO;
import com.consultec.org.banktest.modelo.CuentaDTO;
import com.consultec.org.banktest.services.ClienteServiceImple;
import com.consultec.org.banktest.services.CuentaServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/banco")
public class ClienteController {

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
        ClienteDTO clientes  = serviceCliente.Encontrarid(id);
        return ResponseEntity.ok(clientes);
    }

    @PostMapping("/Guardar")
    public String GuardarCliente(@RequestBody ClienteDTO clienteDTO){
        String x = serviceCliente.GuardarCliente(clienteDTO);
        return x;
    }






}
