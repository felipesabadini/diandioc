package br.sabadini.ioc;

import org.springframework.stereotype.Component;

@Component
public class ClienteRepository {

    public void salvar(Cliente cliente) {
        System.out.println("Cliente salvo");
    }
}
