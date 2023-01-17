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


class MyStringOp {
    static String strReverse(String str) {
        String result = "";
        int i;

        for (i = 0; i < str.length() - 1; i--)
            result += str.charAt(i);

        return result;
    }
}


class MethodRefDemo {
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func2(s);
    }
    public static void main(String[] args) {
        String inStr = "HHJ";
        String outStr;

        outStr = stringOp(MyStringOp::strReverse, inStr);
    }
}