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
import py.edu.nexa_store.entidades.Tienda;
import py.edu.nexa_store.excepciones.RecursoNoEncontradoException;
import py.edu.nexa_store.servicios.TiendaServicio;

@Controller
@RequestMapping("/tiendas")
@RequiredArgsConstructor
public class TiendaControlador {

    private final TiendaServicio tiendaServicio;

    @GetMapping
    public String listar(@RequestParam(name = "termino", required = false) String termino, Model model) {
        return "tienda/form";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Double id, Model model) {
        return "tienda/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("tienda") Tienda tienda, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "tienda/form";
        }
        try {
            if (tienda.getIdTienda() == null) {
            } else {
                try {
                } catch (RecursoNoEncontradoException e) {
                }
            }
            return "redirect:/tiendas";
        } catch (Exception e) {
            return "tienda/form";
        }
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Double id) {
        return null;
    }
}