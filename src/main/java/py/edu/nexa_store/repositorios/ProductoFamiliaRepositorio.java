package py.edu.nexa_store.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import py.edu.nexa_store.entidades.ProductoFamilia;

public interface ProductoFamiliaRepositorio extends JpaRepository<ProductoFamilia, Double> {

    List<ProductoFamilia> listarTodos();

    List<ProductoFamilia> buscarPorTermino(@Param("termino") String termino);
}
