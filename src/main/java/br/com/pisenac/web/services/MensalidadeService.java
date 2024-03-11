package br.com.pisenac.web.services;

import br.com.pisenac.web.entities.Mensalidade;
import br.com.pisenac.web.repositories.MensalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensalidadeService {
    @Autowired
    MensalidadeRepository mensalidadeRepository;
    public String pagar(double valor, String id) {
        Mensalidade mensalidade = new Mensalidade();
        if(valor >= mensalidade.getValor()) {
            mensalidadeRepository.deleteById(id);
            return "Mensalidade paga";
        } else {
            return "Valor insuficiente para o pagamento da mensalidade";
        }
    }
}
