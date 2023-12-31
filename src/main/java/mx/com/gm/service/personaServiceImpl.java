package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author tonny
 */
@Service
public class personaServiceImpl implements PersonaService{

     @Autowired
    private PersonaDao personaDao;
    @Override
    
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
       return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
       personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
       personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
      return personaDao.findById(persona.getIdPersona()).orElse(null); 
   }
    
}
