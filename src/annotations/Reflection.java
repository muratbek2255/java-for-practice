package annotations;


import java.lang.reflect.Method;

class Meta {
    @Nano(str="Пример аннотации", val = 123)

    public static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("MyMeth");

            Nano my_anno = m.getAnnotation(Nano.class);

            System.out.println(my_anno.str() + " " + my_anno.val());
        }catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}