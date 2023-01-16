package generalizations;


class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Типом T является "+ ob.getClass().getName());
    }
}


class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String>  strOb = new Gen<>("Тест обощений");

        strOb.showType();

        String str = strOb.getob();

        System.out.println("Значение: " + str);
    }
}


class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o){
        nums = o;
    }

    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if(average() == (ob.average())){
            return true;
        }
        return false;
    }
}


class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("Значение равно = " + v);

        Double dnums[] = {1.0, 2.0, 3.0, 4.0, 5.0};

    }
}


class TwoD {
    int x, y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


class ThreeD extends TwoD {

    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}


class FourD extends ThreeD {
    int d;

    FourD(int x, int y, int z, int d) {
        super(x, y, z);
        this.d = d;
    }
}


class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) { coords = o; }
}


class BoundedWildCArd {
    static void showXY(Coords<? extends TwoD> c) {
        System.out.println("Koopдинaты Х У:");
        for(int i=0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        System.out.println();
    }

    static void showThree(Coords<? extends ThreeD> c){
        System.out.println("Koopдинaты Х У Z:");
        for(int i=0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        System.out.println();
    }

    static void showFour(Coords<? extends FourD> c) {
        System.out.println("Koopдинaты Х У Z D:");
        for(int i=0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + c.coords[i].d);
        System.out.println();
    }
}


class GetMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if(isIn(2, nums)) {
            System.out.println("Число 2 содержится в массиве");
        }
        if (!isIn(7, nums)) {
            System.out.println("Число 7 отсутсвует в массиве nums");

            System.out.println();
        }
    }
}


class GenCons {
    private double val;

    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }
}


class MyClass <T extends Comparable<T>> implements MaxMin<T> {
    T[] vals;

    MyClass(T[] o) { vals = o; }

    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }

    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }
}