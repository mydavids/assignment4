package za.ac.cput.mydavids;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Yusiry Davids on 3/16/2016.
 */
public class StaffTest {

    @Test
    public void testName(){
        Staff staff = new Staff();
        staff.setName("Ruby");
        Assert.assertSame(staff.getName(), "Ruby");
    }

    @Test
    public void testStaffID(){
        Staff staff = new Staff();
        staff.setStaffID("123");
        Assert.assertEquals(staff.getStaffID(), "123");
    }

    @Test
    public void testAge(){
        Staff staff = new Staff();
        Person person = new Staff();
        Assert.assertEquals(staff.getAge(), person.getAge());

    }

}
