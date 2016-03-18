package za.ac.cput.mydavids;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Yusiry Davids on 3/16/2016.
 */
public class PersonTest {

    @Test
    public void testName(){
        Person person = new Person();
        person.setName("Yusiry");
        Assert.assertEquals(person.getName(), "Yusiry");
    }
}
