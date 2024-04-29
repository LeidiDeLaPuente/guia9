import com.guia7.model;
import com.guia7.model.Usuario;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.value;
import org.springframework.web.bind.stereotype.Controller;
import org.springframework.ui.model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    @value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio (Model modelo){
        String mensaje = "Saludos desde sping MVC";
        Usuario u = new Usuario();
        u.setCedula("28288282");
        u.setClave("16171");
        u.setNombre("Leidi");
        u.setEmail("leidi@gmail.com");
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        modelo.addAttribute("alguien", u);
        Usuario u1 = new Usuario();
        u1.setCedula("28288282");
        u1.setClave("16171");
        u1.setNombre("Leidi");
        u1.setEmail("leidi@gmail.com");

        Usuario u2 = new Usuario();
        u2.setCedula("28288282");
        u2.setClave("16171");
        u2.setNombre("Leidi");
        u2.setEmail("leidi@gmail.com");

        List<Usuario> listaUsuarios = Arrays.asList(u1, u2);

        modelo.addAttribute("Usuarios", listaUsuarios);

        log.info("Ejecutando controlador inicio MVC");
        return "index";
    }
}
