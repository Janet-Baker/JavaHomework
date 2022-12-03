# 【修改】手机话费异常

## 【问题描述】

定义了一个接口PayAble，包含计算电话话费的方法pay()。在手机类定义中增加计算话费异常，如果话费小于0则抛出异常。

要点提示：1)  自定义一个异常类，表示话费小于0的异常；2)  计算话费时如果小于0则抛出异常，在测试类中处理异常。

## 【输入形式】

无

## 【输出形式】

话费结果或者异常

## 【样例输入】
```
10 0.5
```
## 【样例输出】

Fee=5.0

## 【样例输入】
```
0 0.7
```
## 【样例输出】

Exception isPayException: Fee is 0！

Fee=0.0

## 【样例说明】

## 【评分标准】


```
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
```