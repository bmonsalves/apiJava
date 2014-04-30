package cl.apiandroid.ucentral.delegate.persona;

import cl.apiandroid.ucentral.bo.IPersonaBO;
import cl.apiandroid.ucentral.dto.Persona;

import java.util.List;

/**
 * Created by xfce on 29-04-14.
 */
public class PersonaDelegate implements IPersonaDelegate{

    private IPersonaBO personaBO;

    @Override
    public Persona personaId(Persona persona) {
        return personaBO.personaId(persona);
    }

    @Override
    public List<Persona> selectAll() {
        return personaBO.selectAll();
    }

    @Override
    public void save(Persona persona) {
        personaBO.save(persona);
    }

    @Override
    public void delete(Persona persona) {
        personaBO.delete(persona);
    }
}
