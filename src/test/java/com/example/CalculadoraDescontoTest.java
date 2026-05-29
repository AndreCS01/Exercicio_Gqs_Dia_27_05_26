package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
