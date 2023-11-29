package hn.unah.backend.servicios;

import hn.unah.backend.modelos.producto;
import java.util.List;

public interface ProductoService {
    
    public producto creaProducto(producto nvProducto);//crea un nuevo producto

    public List<producto> obtenerTodosProductos();//Lista todos los productos
}
