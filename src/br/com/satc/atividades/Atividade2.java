/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do produto comprado? ");
        float valor = input.nextFloat();
        System.out.println("O produto é nacional ou importado? (N ou I)");
        String decisao = input.next();
        System.out.println("O valor do produto sem imposto é " + valor + " .");
        if (decisao.toUpperCase().equals("N") && (valor < 1000)) {
            System.out.println("O valor a ser pago é de " + (valor * 1.10) + " com imposto de 10%.");
            System.out.println("O imposto foi de "+((valor*1.10)-valor));           
        } else if (decisao.toUpperCase().equals("N") && (valor >= 1000)) {
            System.out.println("O valor a ser pago é de " + (valor * 1.15) + " com imposto de 15%.");
            System.out.println("O imposto foi de "+((valor*1.15)-valor));
        } else if (decisao.toUpperCase().equals("I")) {
            System.out.println("O valor a ser pago é de " + (valor * 1.50) + " com imposto de 50%.");
            System.out.println("O imposto foi de "+((valor*1.50)-valor));
        }

    }
}
