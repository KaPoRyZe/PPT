/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv01;

import java.util.Random;

/**
 *
 * @author zeman12
 */
public class Doklad {
    double zaklad; //pro výpocet dane
    double dph; //spoctena hodnota dane
    double celkem; //celkova hodnota (zaklad+dph)
    double sazba; //velikost dane
    int nazevDokladu;
    
    public Doklad()
    {
        
    }
    
    public Doklad(double zaklad, double sazba)
    {
        setZaklad(zaklad);
        setSazba(sazba);
    }
    
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 10;

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

    public void setZaklad(double zaklad) {
        this.zaklad = (zaklad > 0.0) ? zaklad : 0.0;
    }

    public double getZaklad()
    {
        return zaklad;
    }
    
    public void setSazba(double sazba)
    {
        this.sazba = (sazba > 0.0) ? sazba : 0.0;
    }
    
    public double getSazba()
    {
        return sazba;
    }
    
    public double getDPH()
    {
        return ( zaklad * (sazba + 1) ) - zaklad;
    }
    
    public double getCelkem()
    {
        return (zaklad + getDPH());
    }
}
