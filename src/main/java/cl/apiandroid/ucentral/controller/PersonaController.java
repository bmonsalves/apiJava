package cl.apiandroid.ucentral.controller;

import cl.apiandroid.ucentral.delegate.DelegateLocator;
import cl.apiandroid.ucentral.dto.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by xfce on 29-04-14.
 */

@Controller
@RequestMapping(value = "/base")
public class PersonaController {

    @RequestMapping(value= "/personas/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Persona> getPersonas() {
        return DelegateLocator.getInstance().getPersonaDelegate().selectAll();
    }

    @RequestMapping(value = "/persona/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Persona getPersona(@PathVariable Long id){
        Persona persona = new Persona();
        persona.setId(id);

        return DelegateLocator.getInstance().getPersonaDelegate().personaId(persona);
    }
}