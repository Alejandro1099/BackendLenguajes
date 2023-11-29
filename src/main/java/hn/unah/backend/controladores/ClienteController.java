package hn.unah.backend.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.backend.modelos.cliente;
import hn.unah.backend.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;


    @GetMapping("/obtener/todos")
    public List<cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodosClientes();
    }

}
