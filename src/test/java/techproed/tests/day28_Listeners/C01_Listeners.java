package techproed.tests.day28_Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;
//Classı Listener ile ilişkilendirmek için ya class başına @Listeners eklenir yada xml dosyasına ekleme yapılır.
@Listeners(techproed.utilities.Listeners.class)//Listener classının bulunduğu yolu belirtiyoruz
public class C01_Listeners {

    @Test
    public void successTest(){
        System.out.println("PASS");
        assertTrue(true);
    }

    @Test
    public void failTest(){
        System.out.println("FAIL");
        assertTrue(false);
    }



}