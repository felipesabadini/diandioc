package br.sabadini.di;

/**
 * Created by felipesabadinifacina on 04/03/18.
 */
public class Application {

    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService(new ClienteRepository());
        clienteService.salvar(new Cliente("Felipe"));
    }
}
