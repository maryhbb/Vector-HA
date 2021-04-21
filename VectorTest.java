import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VectorTest {
    Vector2D test1;
    Vector2D test2;

    Vector3D test3;
    Vector3D test4;

    @Before
    public void vor(){
     test1 = new Vector2D(new Point2D(0,5,0,0));
     test2 = new Vector2D(new Point2D(0,9,0,9));

     test3 = new Vector3D(new Point3D(0, 1, 0, 0, 1, 1));
     test4 = new Vector3D(new Point3D(0, 0, 0, 3, 2, 4));
    }

    @Test
    public void derTest1(){
        System.out.println("Test 1:");
        Assert.assertTrue(5 == test1.getVectorLength());
}

    @Test
    public void derTest2(){
        System.out.println("Test 2:");
        double d = Math.pow(10, 2);
        Assert.assertTrue((Math.round(12.727922061357 * d) / d) == (Math.round(test2.getVectorLength() * d) / d));
    }

     @Test
    public void derTest3(){
         System.out.println("Test 3:");
        Assert.assertNotNull(test1.getVectorLength());
     }

    @Test
    public void derTest4(){
        System.out.println("Test 4:");

        Assert.assertTrue(1 == test3.getVectorLength());
    }
    @Test
    public void derTest5(){
        System.out.println("Test 5:");
        double d = Math.pow(10, 2);
        Assert.assertTrue((Math.round(3.605551275463989 * d) / d) == (Math.round(test4.getVectorLength() * d) / d));
    }

}
