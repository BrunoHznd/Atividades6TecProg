package Dependencia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total da compra: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("tem o o cupom? (S/N): ");
        String possuiCupomStr = scanner.next();

        Cupom cupom = null;
        if (possuiCupomStr.equalsIgnoreCase("S")) {
            System.out.print("Digite o cupom: ");
            String codigoCupom = scanner.next();

            System.out.print("Digite o valor do desconto: ");
            double descontoCupom = scanner.nextDouble();

            cupom = new Cupom(codigoCupom, descontoCupom / 100);
        }

        Compra compra = new Compra(valorTotal);
        compra.setCupom(cupom);

        System.out.println("\nDetalhes da Compra:");
        System.out.println(compra);
        
        scanner.close();
        
    }
}