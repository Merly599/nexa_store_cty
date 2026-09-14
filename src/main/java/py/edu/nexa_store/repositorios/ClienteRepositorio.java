package py.edu.nexa_store.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.nexa_store.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
