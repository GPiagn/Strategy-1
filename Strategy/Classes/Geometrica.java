package Strategy.Classes;

import Strategy.Contrato.MediaStrategy;

public class Geometrica implements MediaStrategy {

    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String verificarSituacao(double media) {
        if(media < 7)
            return "Reprovado";
        else
            return "Aprovado";
    }
}
