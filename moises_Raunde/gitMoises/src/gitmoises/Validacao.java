/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gitmoises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nhabomba
 */
public class Validacao {
      BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
    
    public int validarInt (int min, int max, String msg) {
        int valor = 0;
        System.out.print(msg);
        
        do {
            try {
                valor = Integer.parseInt(w.readLine());
            } catch (IOException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
            if (valor < min || valor > max) {
                    System.out.println("Valor invalido. Tente Novamente");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    
    public float validarFloat (float min, float max, String msg) {
        float valor = 0;
        System.out.print(msg);
        
        do {
            try {
                valor = Float.parseFloat(w.readLine());
            } catch (IOException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
            if (valor < min || valor > max) {
                    System.out.println("Valor invalido. Tente Novamente");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    
    public String validarString (String msg) {
        String palavra = "";
        System.out.print(msg);
        
        do {
            try {
                palavra = w.readLine();
            } catch (IOException ex) {
                System.out.println("error: " + ex.getMessage());
            }
            if (palavra.trim().isEmpty()) {
                System.out.println("Esperava uma Sring. Tente novamente!!!");
            }
        } while (palavra.trim().isEmpty());
        return palavra;
    }
    
    public char validarChar (char a, char b, char c, char d, String msg) {
        char palavra = ' ';
        System.out.print(msg);
        
        do {
            try {
                palavra = w.readLine().charAt(0);
            } catch (IOException ex) {
                System.out.println("error: " + ex.getMessage());
            }
            if (palavra != a && palavra != b && palavra != c && palavra != d) {
                System.out.println("Esperava uma Sring. Tente novamente!!!");
            }
        } while (palavra != a && palavra != b && palavra != c && palavra != d);
        return palavra;
    }
}


