package q;
import p.A;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();

        obj.publicMethod();   // ✅ Accessible
        // obj.protectedMethod(); //  Not accessible 
        // obj.defaultMethod();   //  Not accessible 
        // obj.privateMethod();   //  Not accessible 

        B bObj = new B();
        bObj.protectedMethod(); 
    }
}
