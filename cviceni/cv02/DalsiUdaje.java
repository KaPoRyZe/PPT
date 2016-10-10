/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv02;

/**
 *
 * @author kasa02
 */
public class DalsiUdaje 
{
    String vs = ""; //variabilni symbol
    String ks = ""; //konstantni symbol
    String ss = ""; //specificky symbol
    
    public void setVS(String vs)
    {
        this.vs = (vs != "") ? vs : "Zadej variabilní symbol";
    }
    
    public String getVS()
    {
        return vs;
    }
    
    public void setKS(String ks)
    {
        this.ks = (ks != "") ? ks : "Zadej konstantní symbol";
    }
    
    public String getKS()
    {
        return ks;
    }
    
    public void setSS(String ss)
    {
        this.ss = (ss != "") ? ss : "Zadej specifický symbol";
    }
    
    public String getSS()
    {
        return ss;
    }
    
}
