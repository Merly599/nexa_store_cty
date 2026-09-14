package py.edu.nexa_store.repositorios;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import py.edu.nexa_store.entidades.Ciudad;

public interface CiudadRepositorio extends JpaRepository<Ciudad, Integer> {

    List<Ciudad> listarTodos();

    List<Ciudad> buscarPorPais(@Param("idPais") Double idPais, Pageable pageable);

    List<Ciudad> buscarPorTermino(@Param("termino") String termino);
}
