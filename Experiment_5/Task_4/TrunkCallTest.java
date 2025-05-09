import java.util.Scanner;

class TrunkCall {
    int duration;

    TrunkCall(int duration) {
        this.duration = duration;
    }

    double computeCharge() {
        return 0;
    }
}

class Ordinary extends TrunkCall {
    Ordinary(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * 2.0; // Rs. 2 per minute
    }
}

class Urgent extends TrunkCall {
    Urgent(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * 4.0; // Rs. 4 per minute
    }
}

class Lightning extends TrunkCall {
    Lightning(int duration) {
        super(duration);
    }

    @Override
    double computeCharge() {
        return duration * 6.0; // Rs. 6 per minute
    }
}

public class TrunkCallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter call duration (minutes): ");
        int duration = scanner.nextInt();

        System.out.print("Enter call type (1-Ordinary, 2-Urgent, 3-Lightning): ");
        int type = scanner.nextInt();

        TrunkCall call;
        switch (type) {
            case 1 -> call = new Ordinary(duration);
            case 2 -> call = new Urgent(duration);
            case 3 -> call = new Lightning(duration);
            default -> {
                System.out.println("Invalid type!");
                return;
            }
        }

        System.out.println("Total charge: Rs. " + call.computeCharge());
        scanner.close();
    }
}

