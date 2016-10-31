/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv01;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author frant
 */
public class DokladTest02 {
    
    public DokladTest02() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getDoklad() throws Exception
    {
        Doklad doklad = new Doklad();
        Doklad doklad02 = new Doklad(doklad.generateRandomString(), doklad.getZaklad(), doklad.getSazba(), "2016");
        Assert.assertEquals(1200, doklad02);
    }
}
