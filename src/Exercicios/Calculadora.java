package Exercicios;

public class Calculadora {

    int dobro(int num) {

        int numero = num;
        return numero + num;
    }
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        int result = calculadora1.dobro(3);
        System.out.println(result);
    }
}
