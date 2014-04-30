package cl.apiandroid.ucentral.bo;

import cl.apiandroid.ucentral.dto.Persona;
import cl.apiandroid.ucentral.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by xfce on 29-04-14.
 */
@Component
public class PersonaBO implements IPersonaBO {

    @Autowired
    private PersonaMapper personaMapper;

    @Override
    public Persona personaId(Persona persona) {
        return personaMapper.personaId(persona);
    }

    @Override
    public List<Persona> selectAll() {
        return personaMapper.selectAll();
    }

    @Override
    public void save(Persona persona) {
        personaMapper.save(persona);
    }

    @Override
    public void delete(Persona persona) {
        personaMapper.delete(persona);
    }
}
