package com.sau;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Lütfen isminizi giriniz: ");
        String name = sc.nextLine();

        System.out.println("Merhaba, " + name + "! SWE 202 dersine hoş geldin!");

        sc.close();

        }
    }
