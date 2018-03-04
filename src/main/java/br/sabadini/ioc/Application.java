package br.sabadini.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by felipesabadinifacina on 04/03/18.
 */
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan(Application.class.getPackage().getName());
        context.refresh();

        // injeções feitas pelo Spring.
        ClienteService servico = context.getBean(ClienteService.class);
        servico.salvar(new Cliente("Felipe"));

        context.close();
    }
}
