package br.edu.unisep.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Cilindradas: " + cilindradas;
    }
}
