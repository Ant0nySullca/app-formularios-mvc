package pe.edu.idat.app_fomularios_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PromedioController {
    @GetMapping("/frmpromedio")
    public String frmPromedio(){
        return "frmpromedio";
    }

}
