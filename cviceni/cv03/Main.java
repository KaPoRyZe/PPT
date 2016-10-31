/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv01;

import static java.lang.System.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author František Kaša, Pavel Zeman, Patrik Rychetský, Marek Pojer
 */
public class Main {

    public static void main(String[] args) {
       
        double zaklad;
        String nazevDokladu;
        int result_year;
        boolean pokracovat = true;
        
        Scanner sc = new Scanner(System.in);
        Doklad d = new Doklad();
        nazevDokladu = d.generateRandomString();
        HashMap<Integer, Integer> years = d.init();
        
        while (pokracovat)
        {
            out.println("----------Seznam sazeb pro konkrétní rok------");
            Iterator<Integer> keyIterator = years.keySet().iterator();
            while (keyIterator.hasNext())
            {
                Integer key = keyIterator.next();
                out.print("Rok: " + key + "\nVelikost DPH: " + years.get(key) + "\n");
            }
            out.println("---------------------------------------------");
            out.println("Chcete editovat sazbu? Stiskněte číslo 1");
            out.println("Chcete vytvořit doklad? Stiskněte číslo 2");
            out.println("Chcete aplikaci ukončit? Stiskněte číslo 0");
            int selected = sc.nextInt();


            switch(selected)
            {
                case 1:
                    out.print("Zadejte rok: ");
                    result_year = sc.nextInt();
                    if (years.containsKey(result_year))
                    {
                        int old_sazba = years.get(result_year);
                        out.print("Stávající sazba: " + old_sazba);
                        out.println();
                        out.print("Zadejte novou sazbu: ");
                        int new_sazba = sc.nextInt();
                        years.put(result_year, new_sazba);
                        out.println("---Sazba byla upravena----");
                       
                    }
                    else
                    {
                        out.println("Zadaný rok není v seznamu.");
                    }
                     pokracovat = true;
                    break;
                case 2:
                    out.print("Zadejte rok: ");
                    result_year = sc.nextInt();
                    if (years.containsKey(result_year)) {
                        out.print("Zadejte základ daně: ");
                        zaklad = sc.nextDouble();
                        d.setZaklad(zaklad);
                        int old_sazba = years.get(result_year);
                        d.setSazba(old_sazba);
                        out.print(d.toString());
                    } else {
                        out.print("Zadej sazbu: ");
                        int new_sazba = sc.nextInt();
                        d.setSazba(new_sazba);
                        years.put(result_year, d.getSazba());
                        out.println("----Rok a sazba byly úspěšně přidané.------");
                        out.print("Zadejte základ daně: ");
                        zaklad = sc.nextDouble();
                        d.setZaklad(zaklad);
                        out.print(d.toString());
                    }
                    pokracovat = true;
                    break;
                case 0:
                    pokracovat = false;
                    break;
                default:
                    out.println("Nebyla vybrána odpovídající volba.");
                    pokracovat = false;
                    break;
            }
        }
    }
    
}
