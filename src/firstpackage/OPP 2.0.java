package firstpackage;

;


class Box2 {
    double width;
    double height;
    double depth;

    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}


class OverloadCoins{
    public static void main(String args[]){
        Box2 mybox = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mybox3 = new Box2(7);

        double vol;

        vol = mybox.volume();
        System.out.println("Обьем первого: " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем второго: " + vol);

        vol = mybox3.volume();
        System.out.println("Обьем третьего" + vol);
    }
}


class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}


class PassObjRe {
    public static void main(String args[]){
        Test ob = new Test(15, 20);
        System.out.println("o.a и o.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("o.a и o.b до вызова: " + ob.a + " " + ob.b);
    }
}


class Factorial {

    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}


class Recursion {
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("firstpackage.Factorial = " + f.fact(4));
    }
}


class Test2 {
    int a;
    public int b;
    private int c;


    void setc(int i) {
        c = i;
    }

    int gets() {
        return c;
    }
}


class AccessTest {
    public static void main(String args[]) {
        Test2 ob = new Test2();

        ob.a = 10;
        ob.b = 20;

        ob.setc(200);
        System.out.println("a, b и с: " + ob.a + " " + ob.b + " " + ob.gets());
    }
}


class StringDemo2 {
    public static void main(String args[]) {
        String obj1 = "Первая строка";
        String obj2 = "Second str";
        String obj3 = obj1;

        System.out.println("Length of obj1 = " + obj1.length());
        System.out.println("Char ar of strobj1 = " + obj1.charAt(3));

        if (obj1.equals(obj2)) System.out.println("Str1 == Str2");
        else if (obj1.equals(obj3)) System.out.println("Str1 == Str3");
        else System.out.println("Nothing");
    }
}


class CommandLine {
    public static void main(String args[]) {
        for (int i=0; i < args.length; i++) {
            System.out.println("Args[ " + i + " ]" + args[i]);
        }
    }
}


class A {
    int i, j;

    void snowij() {
        System.out.println("i: " + i + " and j: " + j);
    }
}


class B extends A {
    int k;

    void snowk() {
        System.out.println("K: " + k);
    }

    void sum() {
        System.out.println("sum of 3 = " + (i+j+k));
    }
}


class SimpleInheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("SUperob: ");
        superOb.snowij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("SubOb: ");
        subOb.snowij();
        subOb.snowk();
        System.out.println();

        System.out.println("Sum: ");
        subOb.sum();
    }
}


class Box3 {
    private double width;
    private double height;
    private double depth;

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}


class BoxWeight extends Box3 {
    double weight;

    BoxWeight(BoxWeight ob) {
        super();
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double kg) {
        super(w, h, d);
        weight = kg;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}


class DemoSuper {
    public static void main(String args[]) {
        BoxWeight mybox = new BoxWeight(10,20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(10, 23, 32, 32.4);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycude = new BoxWeight(2, 3);
        BoxWeight myclone = new BoxWeight(mybox);

        double vol;

        vol = mybox.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + mybox.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + mybox3.weight);

        vol = mycude.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + mycude.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box" + myclone.weight);
    }
}


class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}


class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(15, 20, 10, 24.2, 43);
        Shipment shipment2 = new Shipment(7, 8, 9, 9.5, 12.4);

        double vol;

        vol = shipment1.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + shipment1.weight);
        System.out.println("Cost of box: " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Обьем равен: " + vol);
        System.out.println("Weight of box: " + shipment2.weight);
        System.out.println("Cost of box: " + shipment2.cost);
    }
}


abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}


class Triangle extends Figure {
    Triangle (double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника");
        return dim1 * dim2 / 2;
    }
}


class DemoTriangle {
    public static void main(String[] args) {
        Triangle trian = new Triangle(3, 4);

        Figure figref;

        figref = trian;

        System.out.println("Площадь: " + figref.area());
    }
}