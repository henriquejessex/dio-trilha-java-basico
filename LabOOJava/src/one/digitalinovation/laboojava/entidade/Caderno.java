package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materiais;

public class Caderno extends Produto{

    /**
     * Tipo do caderno.
     */
    private Materiais tipo;

    public Materiais getTipo() {
        return tipo;
    }
    public void setTipo(Materiais tipo) {
        this.tipo = tipo;
    }
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + tipo.getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "tipo=" + tipo + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
