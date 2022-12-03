import java.util.Scanner;

interface PayAble {
    public double pay() throws PayException;
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        double price = sc.nextDouble();

        double pay2 = 0;

        MobilePhone phone1 = new MobilePhone("13899999999", times, price);

        try {
            pay2 = phone1.pay();
        } catch (PayException e) {
            System.out.println("Exception  is" + e);
        }
        System.out.println("Fee=" + pay2);


    }
}

abstract class Phone {
    private String code;

    public Phone(String code) {
        this.code = code;
    }

    public abstract void display();

}

class MobilePhone extends Phone implements PayAble {
    private int time;
    private double price;

    public MobilePhone(String code, int time, double price) {
        super(code);
        this.time = time;
        this.price = price;
    }


    public double pay() throws PayException {
        double p;
        p = time * price;
        if (p <= 0) {
            throw new PayException("Fee  is  0");
        }
        return p;
    }


    public void display() {
    }

}

// User Modified Area
class PayException extends Exception {
    public PayException() {
        super();
    }

    public PayException(String e) {
        super(e);
    }
}
