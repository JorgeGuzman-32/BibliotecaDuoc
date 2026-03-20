package com.example.DSY110302.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
    public class Controlador_Holamundo {

        @GetMapping("/Hola")
        public String holaMundo() {
            return "!HOLA MUNDO!";
        }
        
        
    public class Controlador_chaoMundo {

        @GetMapping("/Chao")
        public String chaoMundo() {
            return "Chao Mundo Cruel";
        }

    }
}