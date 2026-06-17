package org.example;

import org.example.exercicio1.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void somarTest() {
        int resultado = calculadora.somar(1,2);

        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void subtrairTest() {
        int resultado = calculadora.subtrair(2,1);

        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void multiplicarTest() {
        int resultado = calculadora.multiplicar(3,3);

        Assertions.assertEquals(9, resultado);
    }

    @Test
    public void dividirTest() {
        int resultado = calculadora.dividir(3,3);

        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void dividirTest_AZero() {
        int resultado = calculadora.dividir(0,3);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void dividirTest_BZero() {
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(3, 0)
        );
    }
}
