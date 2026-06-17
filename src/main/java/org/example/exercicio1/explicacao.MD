# Explicação da Classe `Calculadora`

A classe `Calculadora` implementa operações matemáticas básicas utilizando números inteiros (`int`).

```java
package org.example.exercicio1;

public class Calculadora {
```

- `package org.example.exercicio1;` define o pacote onde a classe está localizada.
- `public class Calculadora` declara uma classe pública chamada `Calculadora`.

---

## Método `somar`

```java
public int somar(int a, int b) {
    return a + b;
}
```

### O que faz?

Recebe dois números inteiros e retorna a soma deles.

### Exemplo

```java
Calculadora calc = new Calculadora();
int resultado = calc.somar(5, 3);
```

Resultado:

```text
8
```

---

## Método `subtrair`

```java
public int subtrair(int a, int b) {
    return a - b;
}
```

### O que faz?

Recebe dois números inteiros e retorna a diferença entre eles.

### Exemplo

```java
Calculadora calc = new Calculadora();
int resultado = calc.subtrair(10, 4);
```

Resultado:

```text
6
```

---

## Método `multiplicar`

```java
public int multiplicar(int a, int b) {
    verificarDivisaoPorZero(a, b);
    return a * b;
}
```

### O que faz?

Multiplica dois números inteiros.

### Fluxo de execução

1. Chama o método `verificarDivisaoPorZero(a, b)`.
2. Caso nenhuma exceção seja lançada, retorna o produto de `a` e `b`.

### Exemplo

```java
Calculadora calc = new Calculadora();
int resultado = calc.multiplicar(5, 4);
```

Resultado:

```text
20
```

### Observação

O método `verificarDivisaoPorZero()` não faz sentido aqui, pois multiplicações por zero são válidas:

```java
5 * 0 = 0
0 * 5 = 0
```

Portanto, a chamada:

```java
verificarDivisaoPorZero(a, b);
```

deveria ser removida do método `multiplicar`.

---

## Método `dividir`

```java
public int dividir(int a, int b) {
    return a / b;
}
```

### O que faz?

Realiza a divisão inteira entre dois números.

### Exemplo

```java
Calculadora calc = new Calculadora();
int resultado = calc.dividir(10, 2);
```

Resultado:

```text
5
```

### Divisão inteira

Como o tipo é `int`, o Java descarta a parte decimal:

```java
7 / 2
```

Resultado:

```text
3
```

### Divisão por zero

Se `b` for igual a zero:

```java
calc.dividir(10, 0);
```

O Java lançará automaticamente:

```text
java.lang.ArithmeticException: / by zero
```

---

## Método `verificarDivisaoPorZero`

```java
private void verificarDivisaoPorZero(int a, int b) {
    if(a == 0 || b == 0) {
        System.out.println("Divisão por ZERO");
        throw new ArithmeticException("Divisão por zero");
    }
}
```

### O que faz?

Verifica se algum dos números é zero.

Se for:

1. Exibe a mensagem:

```text
Divisão por ZERO
```

2. Lança uma exceção:

```java
throw new ArithmeticException("Divisão por zero");
```

### Problema na implementação

A condição atual:

```java
if(a == 0 || b == 0)
```

está incorreta para verificar divisão por zero.

Em uma divisão, apenas o divisor (`b`) não pode ser zero.

Por exemplo:

```java
0 / 5
```

é uma operação válida e resulta em:

```text
0
```

A validação correta seria:

```java
if(b == 0)
```

---

## Resumo

| Método | Função |
|----------|----------|
| `somar()` | Soma dois números |
| `subtrair()` | Subtrai dois números |
| `multiplicar()` | Multiplica dois números |
| `dividir()` | Divide dois números |
| `verificarDivisaoPorZero()` | Verifica se há divisão por zero |

### Pontos de melhoria

- Remover a validação de divisão por zero do método `multiplicar()`.
- Validar apenas o divisor (`b`) no método `dividir()`.
- Evitar imprimir mensagens no console dentro da regra de negócio.
- Deixar a responsabilidade do tratamento da exceção para quem chama o método.