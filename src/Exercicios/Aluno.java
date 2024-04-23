package Exercicios;

public class Aluno {
    String nome;
    int idade;
    void exibeinformacao() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Mozartino Cachorrino Tempezino";
        aluno1.idade = 6;
        aluno1.exibeinformacao();
    }
}
