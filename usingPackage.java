// package abhay1.num.num2; --> this only use to put this java file class into the package
import abhay1.num.num2.Abhay5;

class modify extends Abhay5{
    public void meth2(){
        System.out.println(a); // default variables cannot be access outside of any package
        System.out.println(b);
        System.out.println(c); // c has private access in Abhay5 so it can not be access
        System.out.println(d);
    }
}
public class usingPackage {
    public static void main(String[] args) {
        System.out.println("i am in java class");
        Abhay5 ab = new Abhay5();
        // System.out.println(ab.a); // default variables cannot be access outside of any package
        // System.out.println(ab.b); 
        // System.out.println(ab.c); // c has private access in Abhay5 so it can not be access
        // System.out.println(ab.d); // d has protected access in Abhay5 so it can not be access
        modify m1 = new modify();
        m1.meth2();
    }
} 