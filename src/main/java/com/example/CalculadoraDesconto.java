package com.example;

public class CalculadoraDesconto {

        public double calcularValorFinal(double valorCompra) {

            if (valorCompra < 0) {
            throw new IllegalArgumentException("Valor da compra não pode ser negativo.");
        }

        if (valorCompra >= 500.0) {
            return valorCompra - (valorCompra * 0.10);
        }
        
        if (valorCompra >= 100.0 && valorCompra < 500.0) {
            return valorCompra - (valorCompra * 0.05);
        }
        
        return valorCompra;
    }
}
