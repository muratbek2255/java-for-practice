package secondpackage;

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
        };
        System.out.println("Array: "
                + Arrays.deepToString(array));
    }
}


class Box {
    double width;
    double height;
    double depth;

    double volume(){
       return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
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


class BoxDemo3 {
    public static void main(String args[]){
        Box mybox = new Box();
        Box mybox2 = new Box();

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.width = 3;
        mybox2.height = 4;
        mybox2.depth = 5;

        mybox.volume();
        mybox2.volume();
    }
}


class BoxDemo4 {
    public static void main(String args[]){
        Box mybox = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        mybox2.width = 3;
        mybox2.height = 4;
        mybox2.depth = 5;

        vol = mybox.volume();
        System.out.println("Значение пераого параллепипеда равен: " + vol);
        vol = mybox2.volume();
        System.out.println("Значение второго параллепипеда равен: " + vol);
    }
}


class BoxDemo5 {
    public static void main(String args[]) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox.setDim(10, 15, 20);
        mybox2.setDim(3, 6, 18);

        vol = mybox.volume();
        System.out.println("Значение пераого параллепипеда равен: " + vol);
        vol = mybox2.volume();
        System.out.println("Значение второго параллепипеда равен: " + vol);
    }
}


class Stack {
    int stck[] = new int[10];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos == 9) System.out.println("Стек заполнен");
        else stck[++tos] = item;
    }

    int pop(){
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stck[tos--];
    }
}


class TestStack {
    public static void main(String args[]) {
        Stack mystack = new Stack();
        Stack mystack2 = new Stack();

        for(int i = 0; i < 10; i++) mystack.push(i);
        for(int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Содержимое стека mystack1:");
        for(int i = 0; i<10; i++)
            System.out.println(mystack.pop());

        System.out.println("Содержимое стека mystack2:");
        for(int i = 0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}
