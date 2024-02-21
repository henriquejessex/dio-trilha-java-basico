package one.digitalinovation.laboojava.entidade.constantes;

public enum Materiais {
    M2(0.5),
    M5(0.7),
    M10(1.0);

    private double fator;

    Materiais(double fator) {
        this.fator = fator * 100;
    }

    public double getFator() {
        return fator;
    }
}
