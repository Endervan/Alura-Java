package org.example.ender.controls;

import org.example.ender.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
        return new Cliente(id, "joao", "555.111.666-00");
    }
}
