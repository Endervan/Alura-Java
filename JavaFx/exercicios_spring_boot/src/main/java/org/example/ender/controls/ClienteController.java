package org.example.ender.controls;

import org.example.ender.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "Ana", "123.456.789-00");
    }

    @GetMapping(path = "/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "maria", "999.456.999-00");
    }
}
