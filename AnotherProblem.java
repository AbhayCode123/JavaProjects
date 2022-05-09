import folder.*;

class c1 extends folderPack{
    public void meth1(){
        System.out.println(pro);
        // System.out.println(def); // def cannot be accessed in sub class

    }
}
public class AnotherProblem{
    public static void main(String[] args) {
        c1 c = new c1();
        // c.meth1();
    }
}    