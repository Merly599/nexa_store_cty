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
import py.edu.nexa_store.entidades.Pais;
import py.edu.nexa_store.servicios.PaisServicio;

@Controller
@RequestMapping("/paises")
@RequiredArgsConstructor
public class PaisControlador {

    private final PaisServicio paisServicio;

    @GetMapping
    public String listar(@RequestParam(name = "termino", required = false) String termino, Model model) {
        return "pais/form";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Double id, Model model) {
        return "pais/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("pais") Pais pais, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "pais/form";
        }
        try {
            return "redirect:/paises";
        } catch (Exception e) {
            return "pais/form";
        }
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Double id) {
        return "redirect:/paises";
    }
}