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
import py.edu.nexa_store.entidades.Ciudad;
import py.edu.nexa_store.servicios.CiudadServicio;
import py.edu.nexa_store.servicios.PaisServicio;

@Controller
@RequestMapping("/ciudades")
@RequiredArgsConstructor
public class CiudadControlador {

    private final CiudadServicio ciudadServicio;
    private final PaisServicio paisServicio;

    @GetMapping
    public String listar(@RequestParam(name = "termino", required = false) String termino, Model model) {
        return null;
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        return null;
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("ciudad") Ciudad ciudad, BindingResult result, Model model) {
        return null;
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        return null;
    }
}