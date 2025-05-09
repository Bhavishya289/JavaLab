class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void play() {
        System.out.println(name + " is playing.");
    }
}

class Cricket_Player extends Player {
    Cricket_Player(String name, int age) {  // function :
        super(name, age);
    }

    @Override
    void play() {
        System.out.println(name + " is playing cricket.");
    }
}

class Football_Player extends Player {
    Football_Player(String name, int age) {
        super(name, age);
    }

    @Override
    void play() {
        System.out.println(name + " is playing football.");
    }
}

class Hockey_Player extends Player {
    Hockey_Player(String name, int age) {
        super(name, age);
    }

    @Override
    void play() {
        System.out.println(name + " is playing hockey.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
        Cricket_Player cp = new Cricket_Player("Virat", 35);
        Football_Player fp = new Football_Player("Messi", 36);
        Hockey_Player hp = new Hockey_Player("Dhyan Chand", 40);

        cp.play();
        fp.play();
        hp.play();
    }
}

