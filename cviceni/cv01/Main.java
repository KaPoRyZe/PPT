/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv01;

import java.util.Scanner;

/**
 *
 * @author zeman12
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double zaklad;
        double sazba;
        String nazevDokladu = "";
        
        Scanner sc = new Scanner(System.in);
        
        Doklad d = new Doklad();
        nazevDokladu = d.generateRandomString();
        
        System.out.println("Název dokladu: " + nazevDokladu);
        System.out.print("Zadejte základ daně: ");
        zaklad = sc.nextDouble();
        System.out.print("Zadejte sazbu: ");
        sazba = sc.nextDouble();
        Doklad dd = new Doklad(zaklad, sazba);
        System.out.println("Daň činí: " + dd.getDPH());
        System.out.println("Celková částka: " + dd.getCelkem());         
    }
    
}
