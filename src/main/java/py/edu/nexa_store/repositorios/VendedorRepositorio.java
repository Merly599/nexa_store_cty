package py.edu.nexa_store.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.nexa_store.entidades.Vendedor;

public interface VendedorRepositorio extends JpaRepository<Vendedor, Integer> {

}
