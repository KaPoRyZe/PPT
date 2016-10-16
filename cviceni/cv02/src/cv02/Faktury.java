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
public class Faktury extends DalsiUdaje
{
    String datum; //datum zaúčtování dokladu
    String poznamka; //doplnujici informace
    double castka; //částka dokladu
    
    public void setPrijmovaFaktura(char datum, char poznamka, double castka, DalsiUdaje vs, DalsiUdaje ks, DalsiUdaje ss)
    {
        //todo - dat get?
    }
    
    public void setVydajovaFaktura(char datum, char poznamka, double castka, DalsiUdaje vs, DalsiUdaje ks, DalsiUdaje ss)
    {
        //todo - dat get?
    }
    
    /**
     * vrací částku dokladu se znaménkem: pro přijatou fakturu kladná hodnota, pro vydanou fakturu záporná hodnota celkové částky dokladu
     * @return 
     */
    public double getCastkaDokladuZauct()
    {
        
    }
}
