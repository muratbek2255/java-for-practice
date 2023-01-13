package annotations2;


class TypeAnnDemo<@What(description = "Данные обобщенного типа") T> {
    public @Unique TypeAnnDemo() {}

    @TypeAnno String str;

    @EmptyOK String test;

    public int f(@TypeAnno TypeAnnDemo<T> this, int x){
        return 10;
    }

    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    public @Recommended Integer f3(String str) {
        return str.length();
    }

    public void f4() throws @TypeAnno NullPointerException {
        //...
    }

    String @MaxLen(10) [] @NotZeroLen [] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        TypeAnnDemo<@TypeAnno Integer> ob = new TypeAnnDemo<@TypeAnno Integer>();
        @Unique TypeAnnDemo<Integer> ob2 = new @Unique TypeAnnDemo<Integer>();
        Object x = new Integer[10];
        Integer y;

        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(18);
    }
    class SomeClass extends @TypeAnno TypeAnnDemo<Boolean> {}
}