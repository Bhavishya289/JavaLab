package p;

public class A {
    public void publicMethod() {
        System.out.println("Public Method in Class A");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method in Class A");
    }

    void defaultMethod() {
        System.out.println("Default Method in Class A");
    }

    private void privateMethod() {
        System.out.println("Private Method in Class A");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
    }
}
