package hn.unah.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comercio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class comercio {
    
    @Id
    @Column(name = "idcomercio")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idcomercio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    //mas tarde hago el ManyTOMany con la tabla pedido
}
