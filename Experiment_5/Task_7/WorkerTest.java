class Worker {
    String name;
    double salaryRate;

    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    double computePay(int hours) {
        return 0;  // Overridden in subclasses
    }
}

class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return (hours / 8) * salaryRate; // Assuming 8-hour workdays
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return salaryRate * 40;  // Fixed salary for 40 hours
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dWorker = new DailyWorker("John", 500);
        Worker sWorker = new SalariedWorker("Alice", 600);

        System.out.println("Daily Worker Pay (for 48 hours): " + dWorker.computePay(48));
        System.out.println("Salaried Worker Pay: " + sWorker.computePay(48));
    }
}
