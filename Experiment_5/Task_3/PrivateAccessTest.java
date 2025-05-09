class SuperClass {
    protected int privateVar = 10;  // Private member

    // Getter method to access private variable
    public int getPrivateVar() {
        return privateVar;
    }
}

class SubClass extends SuperClass {
    void display() {
        //System.out.println(privateVar); // This will cause an error
        System.out.println("Accessing private variable via method: " + getPrivateVar());
    }
}

public class PrivateAccessTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        //System.out.println(privateVar);
        obj.display();
    }
}

