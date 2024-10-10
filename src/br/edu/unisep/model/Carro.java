package br.edu.unisep.model;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Número de portas: " + numeroDePortas;
    }
}