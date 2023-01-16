package lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber mynum;

        mynum = () -> 123.45;
        System.out.println("Value: " + mynum.getValue());

        mynum = () -> Math.random() * 100;
        System.out.println("Value of random: " + mynum.getValue());
        System.out.println("Value of random: "+ mynum.getValue());
    }
}
