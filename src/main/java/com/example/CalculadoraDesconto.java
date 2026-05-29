package com.example;

public class CalculadoraDesconto {

        public double calcularValorFinal(double valorCompra) {

            if (valorCompra < 0) {
            throw new IllegalArgumentException("Valor da compra não pode ser negativo.");
        }

            // Regra 3: Compras a partir de 500 recebem 10% de desconto
        if (valorCompra >= 500.0) {
            return valorCompra - (valorCompra * 0.10);
        }
        
        // Se a compra for entre 100 e 499.99, aplica 5% de desconto
        if (valorCompra >= 100.0 && valorCompra < 500.0) {
            return valorCompra - (valorCompra * 0.05);
        }
        
        // O código mínimo necessário para fazer o primeiro teste passar!
        return valorCompra;
    }
}
