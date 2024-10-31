package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")   //caminho localhost:8080/hello pelo tomcat
@RestController //lidar com requisições http (rodar o servidor)
public class HelloController {

    @GetMapping
    public String OlaMundo(){
        return "Hello World";
    }
}
