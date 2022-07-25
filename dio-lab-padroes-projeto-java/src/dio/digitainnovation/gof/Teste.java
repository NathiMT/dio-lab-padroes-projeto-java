package dio.digitainnovation.gof;

import dio.digitainnovation.gof.facade.Facade;
import dio.digitainnovation.gof.singleton.SingletonEager;
import dio.digitainnovation.gof.singleton.SingletonLazy;
import dio.digitainnovation.gof.singleton.SingletonLazyHolder;
import dio.digitainnovation.gof.strategy.Comportamento;
import dio.digitainnovation.gof.strategy.ComportamentoAgressivo;
import dio.digitainnovation.gof.strategy.ComportamentoDefensivo;
import dio.digitainnovation.gof.strategy.ComportamentoNormal;
import dio.digitainnovation.gof.strategy.Robo;

public class Teste {

    public static void main(String[] args) {

        // Testes Singleton
        System.out.println("--- Teste Singleton ---");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Teste Strategy
        System.out.println("--- Teste Strategy ---");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setEstrategia(normal);
        robo.mover();
        robo.mover();
        robo.setEstrategia(defensivo);
        robo.mover();
        robo.setEstrategia(agressivo);
        robo.mover();

        // Facade
        System.out.println("--- Teste Facade ---");

        Facade facade = new Facade();
        facade.migrarCliente("Nathália", "950000000");
    }




}
