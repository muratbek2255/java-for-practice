import java.util.Arrays;
import java.util.Random;

class OOP {
    public static void main(String args[]) {
        int array[][] = new int[2][2];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println("Array: "
                + Arrays.deepToString(array));
    }
}


class Box {
    double width;
    double height;
    double depth;
}


class BoxDemo {
    public static void main(String args[]){
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 25;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Response: " + vol);
    }
}