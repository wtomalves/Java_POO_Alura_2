package Exercicios;

public class Carro {
    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano do carro: " + ano);
    }

    int idadeCarro() {
        int anoAtual = 2024;
        int anoDoCarro = anoAtual - ano;
        return anoDoCarro;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "HB20";
        carro1.cor = "Cinza";
        carro1.ano = 2022;
        carro1.exibeFichaTecnica();
        int result = carro1.idadeCarro();
        System.out.println("Idade do carro: " + result + " anos");



    }



}
