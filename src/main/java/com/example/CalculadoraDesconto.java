package com.example;

public class CalculadoraDesconto {

        public double calcularValorFinal(double valorCompra) {
        
        // Se a compra for entre 100 e 499.99, aplica 5% de desconto
        if (valorCompra >= 100.0 && valorCompra < 500.0) {
            return valorCompra - (valorCompra * 0.05);
        }
        
        // O código mínimo necessário para fazer o primeiro teste passar!
        return valorCompra;
    }
}
