package Strategy.Classes;

import Strategy.Contrato.MediaStrategy;

public class Aritmetica implements MediaStrategy {
    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2)/2;
    }

    @Override
    public String verificarSituacao(double media) {
        if (media < 5)
            return "Reprovado";
        else
            return "Aprovado";
    }
}
