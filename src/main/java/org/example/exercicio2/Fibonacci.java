package org.example.exercicio2;

public class Fibonacci {
    public int executar(int n) {
        verificar(n);

        if(n <= 1) {
            return n;
        }

        return executar(n - 1) + executar(n - 2);
    }

    private void verificar(int n) {
        if(n < 0) {
            throw new ArithmeticException("N é menor que 1: " + n);
        }
    }
}
