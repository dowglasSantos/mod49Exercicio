package org.example;

import org.example.exercicio2.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void verificar_HappyTest() {
        int result = fibonacci.executar(8);

        Assertions.assertEquals(21, result);
    }

    @Test
    public void verificar_ThrowException() {
        int result = fibonacci.executar(0);

        Assertions.assertThrows(
            ArithmeticException.class,
            () -> {
                fibonacci.executar(-1);
            }
        );
    }

    @Test
    public void verificar_Um() {
        int result = fibonacci.executar(1);

        Assertions.assertEquals(1, result);
    }

    @Test
    public void verificar_Zero() {
        int result = fibonacci.executar(0);

        Assertions.assertEquals(0, result);
    }
}
