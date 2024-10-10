package br.edu.unisep.view;

import br.edu.unisep.model.Caminhao;
import br.edu.unisep.model.Carro;
import br.edu.unisep.model.Frota;
import br.edu.unisep.model.Moto;

// Principal.java
public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB500", 2019, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2018, "Carga pesada");

        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);
        frota.adicionarVeiculo(caminhao);

        frota.exibirDetalhesFrota();
    }
}