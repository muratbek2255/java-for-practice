package lambda;

public class HighTemp {
    private int hTemp;

    HighTemp(int ht) { hTemp = ht; }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}


class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> fc, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if(fc.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(87), new HighTemp(90),
                new HighTemp(67), new HighTemp(76),
                new HighTemp(89), new HighTemp(76)
        };

         count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(83));

        System.out.println("Max temp: " + count);

    }
}
