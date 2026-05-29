package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    public void testCompraAbaixoDeCemReaisSemDesconto() {
        // 1. DADO (Arrange)
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 50.0;

        // 2. QUANDO (Act)
        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        // 3. ENTÃO (Assert)
        double resultadoEsperado = 50.0;
        
        // Agora o Java sabe exatamente de onde vem esse método!
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComCincoPorCentoDeDesconto() {
        // 1. DADO
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 200.0;

        // 2. QUANDO
        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        // 3. ENTÃO (200 - 5% = 190.0)
        double resultadoEsperado = 190.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComDezPorCentoDeDesconto() {
        // 1. DADO
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 1000.0;

        // 2. QUANDO
        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        // 3. ENTÃO (1000 - 10% = 900.0)
        double resultadoEsperado = 900.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraExatamenteCemReais() {
        // 1. DADO
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 100.0;

        // 2. QUANDO
        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        // 3. ENTÃO (100 - 5% = 95.0)
        double resultadoEsperado = 95.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraExatamenteQuinhentosReais() {
        // 1. DADO
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 500.0;

        // 2. QUANDO
        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        // 3. ENTÃO (500 - 10% = 450.0)
        double resultadoEsperado = 450.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComValorNegativoDeveLancarExcecao() {
        // 1. DADO
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompraInvalido = -50.0;

        // 2 e 3. QUANDO / ENTÃO
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(valorCompraInvalido);
        });
    }
}
