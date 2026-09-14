package py.edu.nexa_store.servicios;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import py.edu.nexa_store.entidades.Cliente;
import py.edu.nexa_store.repositorios.ClienteRepositorio;

@Service
@RequiredArgsConstructor
public class ClienteServicio {

    private final ClienteRepositorio clienteRepository;

    public List<Cliente> listarTodos() {
        return null;
    }

    public Integer obtenerSiguienteId() {
        return null;
    }

    public Cliente buscarPorId(Integer id) {
        return null;
    }

    public Cliente guardar(Cliente cliente) {
        return null;
    }

    public Cliente actualizar(Integer id, Cliente cliente) {
        return null;
    }

    @Transactional
    public void eliminar(Integer id) {
    }

    public List<Cliente> listarPorCiudad(Integer idCiudad) {
        return null;
    }

    public List<Cliente> buscarPorTermino(String termino) {
        return null;
    }
}
