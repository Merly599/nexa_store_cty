package py.edu.nexa_store.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import py.edu.nexa_store.entidades.Vendedor;
import py.edu.nexa_store.servicios.TiendaServicio;
import py.edu.nexa_store.servicios.VendedorServicio;

@Controller
@RequestMapping("/vendedores")
@RequiredArgsConstructor
public class VendedorControlador {

    private final VendedorServicio vendedorServicio;
    private final TiendaServicio tiendaServicio;

    @GetMapping
    public String listar(@RequestParam(name = "termino", required = false) String termino, Model model) {
        return "vendedor/form";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        return "vendedor/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("vendedor") Vendedor vendedor, BindingResult result, Model model) {
        if (vendedor.getTiendaId() != null) {
        } else {
        }
        if (result.hasErrors() || vendedor.getTienda() == null) {
            return "vendedor/form";
        }
        try {
            return "redirect:/vendedores";
        } catch (Exception e) {
            return "vendedor/form";
        }
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        return "redirect:/vendedores";
    }
}