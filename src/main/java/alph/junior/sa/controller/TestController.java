package alph.junior.sa.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {

    @GetMapping(path = "string")
    public String getString(){
        return " Chaine de caractère transmise par SA";
    }

    @GetMapping()
    public List<String> getList(){
        return List.of("Chaine de caractère transmise 1", "Chaine de caractère transmise 2");

    }

}



