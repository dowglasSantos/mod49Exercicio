package org.example.exercicio1;

public class Calculadora {
    public int  somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        verificarDivisaoPorZero(a, b);
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    private void verificarDivisaoPorZero(int a, int b) {
        if(a == 0 || b == 0) {
            System.out.println("Divisão por ZERO");
            throw new ArithmeticException("Divisão por zero");
        }
    }
}
