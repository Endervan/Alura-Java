package org.example.ender.controls;

import org.example.ender.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "Ana", "123.456.789-00");
    }
}
