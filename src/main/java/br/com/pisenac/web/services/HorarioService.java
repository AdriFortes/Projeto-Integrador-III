package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Horario;
import br.com.pisenac.web.entities.Livro;
import br.com.pisenac.web.repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService {
    @Autowired
    HorarioRepository horarioRepository;

    public Horario createHorario(Horario horario) {
        return horarioRepository.save(horario);
    }
    public Horario updateHorario(Horario horario) {
        return horarioRepository.save(horario);
    }

    public void deleteHorario(String id) {
        horarioRepository.deleteById(id);
    }

}
