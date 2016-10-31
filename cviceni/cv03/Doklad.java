/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv01;

import java.util.Random;
import java.util.HashMap;

/**
 *
 * @author František Kaša, Pavel Zeman, Patrik Rychetský, Marek Pojer
 */
public class Doklad {
    double zaklad; //pro výpocet dane
    double dph; //spoctena hodnota dane
    double celkem; //celkova hodnota (zaklad+dph)
    int sazba; //velikost dane
    String nazevDokladu;
    String datumDokladu;
    
    /**
     * bezparametricky konstruktor
     */
    public Doklad()
    {
        
    }
    /**
     * parametricky konstruktor
     * @param nazevDokladu
     * @param zaklad
     * @param sazba
     * @param datum 
     */
    public Doklad(String nazevDokladu, double zaklad, int sazba, String datum)
    {
        this.nazevDokladu = nazevDokladu;
        this.zaklad = zaklad;
        this.sazba = sazba;
        this.datumDokladu = datum;
    }
    
    /**
     * řetězec znaků pro generátor
     */
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /**
     * nastaveni delky vygenerovaneho retezce
     */
    private static final int RANDOM_STRING_LENGTH = 10;

    /**
     * generator nahodneho retezce
     * @return string
     */
    public String generateRandomString() 
    {
        StringBuilder randStr = new StringBuilder();
        
        for(int i=0; i<RANDOM_STRING_LENGTH; i++)
        {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        
        return randStr.toString();
    }
    
    /**
     * generator nahodneho čísla
     * @return int
     */
    public int getRandomNumber()
    {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        
        if (randomInt - 1 == -1) 
        {
            return randomInt;
        } 
        else 
        {
            return randomInt - 1;
        }
    }

    /**
     * vlozeni zakladu
     * @param zaklad 
     */
    public void setZaklad(double zaklad) {
        this.zaklad = (zaklad > 0.0) ? zaklad : 0.0;
    }

    /**
     * vypsani zakladu
     * @return int
     */
    public double getZaklad()
    {
        return zaklad;
    }
    
    /**
     * vlozeni sazby
     * @param sazba 
     */
    public void setSazba(int sazba)
    {
        this.sazba = (sazba > 0) ? sazba : 0;
    }
    
    /**
     * vypsani sazby
     * @return int
     */
    public int getSazba()
    {
        return sazba;
    }
    
    /**
     * vypsani dph
     * @return double
     */
    public double getDPH()
    {
        return (((double) sazba / 100) * zaklad);
    }
    
    /**
     * vypsani celkove castky
     * @return double
     */
    public double getCelkem()
    {
        return (zaklad + getDPH());
    }
    
    /**
     * vytvoreni mapy s predem zadanymi daty
     * @return hashmap
     */
    public HashMap<Integer, Integer> init()
    {
        HashMap years = new HashMap();
        years.put(2013, 17);
        years.put(2014, 15);
        years.put(2015, 19);
        years.put(2016, 21);
        
        return years;
    }
    
    /**
     * vypis údaju pro doklad
     * @return string
     */
    @Override
    public String toString()
    {
        return "----------Doklad[" + generateRandomString() + "]---------\n"
                + "Základ: " + getZaklad() + "\n"
                + "Sazba: " + getSazba() + "\n"
                + "DPH: " + getDPH() + "\n"
                + "Celkem: " + getCelkem() + "\n";            
    }
}
