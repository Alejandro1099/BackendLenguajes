package hn.unah.backend.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import hn.unah.backend.servicios.impl.ProductoServiceImpl;
import hn.unah.backend.modelos.producto;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    
    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @GetMapping("/obtener/todos")
    public List<producto> obtenerTodos(){
        return this.productoServiceImpl.obtenerTodosProductos();
    }
}
