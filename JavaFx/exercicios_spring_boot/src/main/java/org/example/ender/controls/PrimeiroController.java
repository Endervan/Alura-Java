package org.example.ender.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    //    @RequestMapping(method = RequestMethod.GET,path = "/ola")
    @GetMapping(path = {"ola","/saudacao"})
    public String ola() {
        return "Olá Mundo!---";
    }

}
