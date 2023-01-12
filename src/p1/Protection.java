package p1;


public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n " + n);
        System.out.println("n_pri " + n_pri);
        System.out.println("n_pro " + n_pro);
        System.out.println("n_pub " + n_pub);
    }
}

class Zadacha {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 2};

        for (int i = 0; i < 4; i++) {
            System.out.println("Squart: " + Math.sqrt(arr1[i]));
        }
    }
}