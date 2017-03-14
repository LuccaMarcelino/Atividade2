package br.com.satc.atividades;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NumberFormat nf = new DecimalFormat("0.00");
        System.out.println("Digite seu nome -> ");
        String nome = input.next();
        System.out.println("Digite sua 1º nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Digite sua 2º nota: ");
        float nota2 = input.nextFloat();
        System.out.println("Digite sua 3° nota: ");
        float nota3 = input.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Qual a média para passar em sua escola?");
        float minima = input.nextFloat();
        if (minima <= media) {
            System.out.println("Você passou " + nome);
            System.out.println("Sua média é " + media);
        } else {
            System.out.println("Você tem direito á uma recuperação? (SIM ou NÃO) ");
            String decisao = input.next();
            if (decisao.toUpperCase().equals("SIM")) {
                System.out.println("Quanto você tirou na recuperação? ");
                float recup = input.nextFloat();

                float nvmedia = (media + recup) / 2;
                if (minima <= nvmedia) {
                    System.out.println("Você passou com a recuperação " + nome);
                    System.out.println("Sua média é " + media);
                } else {
                    System.out.println("Você reprovou " + nome);
                    System.out.println("Sua média é " + media);

                }
            }

        }

    }
}
