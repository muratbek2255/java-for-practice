package interfaces;


class A {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}


class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf a = new B();

        boolean b;

        b = a.isNotNegative(89);
        System.out.println("ghj: "  + b);
    }
}