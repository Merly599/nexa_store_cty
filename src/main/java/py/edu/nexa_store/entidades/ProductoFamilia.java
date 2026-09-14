package py.edu.nexa_store.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "producto_familia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoFamilia {

    @Id
    @Column(name = "id_producto_familia")
    private Double idProductoFamilia;

    @Column(name = "descripcion")
    private String descripcion;

}
