package br.sabadini.di;

/**
 * Created by felipesabadinifacina on 04/03/18.
 */
public class ClienteService {
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvar(Cliente cliente) {
        repository.salvar(cliente);
    }
}
