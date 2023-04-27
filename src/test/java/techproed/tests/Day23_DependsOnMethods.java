package techproed.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Day23_DependsOnMethods {
    /*
    Test NG'de @Test metotları birbirinden bağımsız çalışır.
    Methodları bağımlı çalıştırmak istiyorsak "dependsOnMethods" parametresi kullanılır.
    Aşağıda seachTest() methodu homePageTest() methoduna bağlıdır.
    Eger homePageTest() çalışırsa searchTest() de çalışır.
    Eger homePageTest() fail olursa searchTest() çalışmaz, "ignore" edilir.


     */

    @Test
    public void homePageTest(){
        assertEquals(1,2);//Burada hard assertion kullanıldığı içi Java çalışmayı durdurur ve sonraki kodlar çalışmaz.
        System.out.println("Anasayfaya gidildi");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void seachTest(){
        System.out.println("Arama yapıldı");
    }

    @Test(dependsOnMethods = "homePageTest")
    public void signInTest(){
        System.out.println("Giriş yapıldı");
    }

}
