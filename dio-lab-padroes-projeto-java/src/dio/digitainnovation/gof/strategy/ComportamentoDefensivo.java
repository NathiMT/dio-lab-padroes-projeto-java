package dio.digitainnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Está se movendo de maneira defensiva!");
    }
}
