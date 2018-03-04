package br.sabadini.ioc;

import org.springframework.stereotype.Component;


@Component
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvar(Cliente cliente) {
        repository.salvar(cliente);
    }
}
