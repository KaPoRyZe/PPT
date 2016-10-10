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
public class CastkyDokladu extends Faktury
{
   double sazbaDPH; //ze zakladu
   double velikostDPH; //procenta
   double zaklad; //základ v Kč
   
   public void setVelikostDPH(double sazbaDPH)
   {
       this.sazbaDPH = (sazbaDPH > 0) ? sazbaDPH : 0.0;
   }
   
   public double getVelikostDPH()
   {
       return sazbaDPH;
   }
   
   //TODO dodelat
}
