package py.edu.nexa_store.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import py.edu.nexa_store.servicios.TiendaServicio;
import py.edu.nexa_store.servicios.VendedorServicio;

@Controller
@RequiredArgsConstructor
public class InicioControlador {

    private final TiendaServicio tiendaServicio;
    private final VendedorServicio vendedorServicio;

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

}