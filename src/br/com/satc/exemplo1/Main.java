package br.com.satc.exemplo1;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    public static void main(String[] args) {
        //IF
        //switch case
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int idade = entrada.nextInt();

        if (idade <= 13) {
            System.out.println("Você é considerado : Criança");
        }
        if ((idade > 13) && (idade < 18)) {
            System.out.println("Você é considerado : Adolescente");
        } else if ((idade >= 18) && (idade <= 26)) {
            System.out.println("Você é considerado : Jovem adulto");
        } else if ((idade > 26) && (idade < 65)) {
            System.out.println("Você é considerado : Adulto");
        } else if ((idade >= 65) && (idade <= 100)) {
            System.out.println("Você é considerado : Idoso");
        } else if (idade > 100) {
            System.out.println("Ta trollando SAPO?");
        }
    }

}
