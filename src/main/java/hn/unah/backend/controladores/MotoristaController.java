package hn.unah.backend.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.backend.servicios.impl.MotoristaServiceImpl;
import hn.unah.backend.modelos.motorista;

@RestController
@RequestMapping("/api/motorista")
public class MotoristaController {
    
    @Autowired
    private MotoristaServiceImpl motoristaServiceImpl;

    @GetMapping("/obtener/todos")
    public List<motorista> obtenerTodos(){
        return this.motoristaServiceImpl.obtenerTodosMotoristas();
    }
}
