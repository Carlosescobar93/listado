package desarrolloweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import desarrolloweb.model.lista;

@Controller
public class VentaController {

    lista ls = new lista();

    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("titulo", "Ventas del vendedor ");
        model.addAttribute("mensaje","No hay ventas por mostrar");
        return "/vista/index";
    }

    @GetMapping("/2")
    public String postMethodName(@RequestParam String vendedor, Model model) {
        model.addAttribute("titulo", "Ventas del vendedor " + vendedor);
        model.addAttribute("datos", ls.listadonuevo(vendedor));
        model.addAttribute("valor", ls.sumar());
        System.out.println(vendedor);
        return "/vista/index";
    }

    @ModelAttribute("vendedores")
    public List<String> vendedores() {
        List<String> vendedores = new ArrayList<>();
        vendedores.add("Pedro Gonzalez Sanzana");
        vendedores.add("Flor Esilda Bustos Riffo");
        vendedores.add("Mario Escobar Navarro");
        vendedores.add("Isabel Zunilda Encina Bello");
        vendedores.add("Luis Felipe Erazo Castro");
        vendedores.add("Nilda Meza Maldonado");
        vendedores.add("Rene Alberto Camilo Mosquera");
        vendedores.add("Uberlinda Mella Arellano");
        vendedores.add("Rigoberto Caceres Monsalve");
        vendedores.add("Susana Angela Mora Soutullo");
        vendedores.add("Ana Mercedes Perez Perez");
        vendedores.add("Roberto Rivas Avello");
        vendedores.add("Roberto Rivas Avello");
        vendedores.add("Mauricio Javier Bravo Obando");
        return vendedores;
    }
}
