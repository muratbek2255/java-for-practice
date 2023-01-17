package lambda;

public class MyClass<T>{
    private T val;

    MyClass(T v) { val = v; }

    MyClass() { val = null; }

    T getVal() { return val; };
}


class MyClass2{
    String str;

    MyClass2(String s) { str = s; }

    MyClass2() { str = " "; }

    String getVal() { return str; }
}


class RefDemo{
    static<R, T> R myClassFactory(MyFunc2<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc2<MyClass<Double>, Double> myClassCoins = MyClass<Double>::new;

        MyClass<Double> mc = myClassFactory(myClassCoins,100.1);
        System.out.println("mc = " + mc.getVal());
    }
}
