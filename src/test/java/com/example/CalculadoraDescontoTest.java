package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraDescontoTest {

    @Test
    public void testCompraAbaixoDeCemReaisSemDesconto() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 50.0;

        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        double resultadoEsperado = 50.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComCincoPorCentoDeDesconto() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 200.0;

        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        double resultadoEsperado = 190.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComDezPorCentoDeDesconto() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 1000.0;

        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        double resultadoEsperado = 900.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraExatamenteCemReais() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 100.0;

        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        double resultadoEsperado = 95.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraExatamenteQuinhentosReais() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompra = 500.0;

        double resultadoObtido = calculadora.calcularValorFinal(valorCompra);

        double resultadoEsperado = 450.0;
        
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    @Test
    public void testCompraComValorNegativoDeveLancarExcecao() {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double valorCompraInvalido = -50.0;

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(valorCompraInvalido);
        });
    }
}
