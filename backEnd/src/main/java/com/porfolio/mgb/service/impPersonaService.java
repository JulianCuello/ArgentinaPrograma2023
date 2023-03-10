package com.porfolio.mgb.service;


import com.porfolio.mgb.Interface.IPersonaService;
import com.porfolio.mgb.entity.Persona;
import com.porfolio.mgb.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class impPersonaService implements IPersonaService {

   @Autowired
   IPersonaRepository iPersonaRepository;

    @Override
    public List<Persona> GetPersona() {
        List<Persona> persona = iPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);

    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }
}
