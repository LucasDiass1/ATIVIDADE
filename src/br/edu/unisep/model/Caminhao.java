package br.edu.unisep.model;

public class Caminhao extends Veiculo {
    private String tipoDeCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoDeCarga) {
        super(marca, modelo, ano);
        this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Tipo de carga: " + tipoDeCarga;
    }
}