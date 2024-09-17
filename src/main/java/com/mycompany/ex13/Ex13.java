package com.mycompany.ex13;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: R$ ");
        double valorPrestacao = scanner.nextDouble();

        double limitePrestacao = salarioBruto * 0.30;

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("O empréstimo pode ser concedido.");
        } else {
            System.out.println("O empréstimo não pode ser concedido.");
        }

        scanner.close();
    }
}
