package interfaces2;


import java.util.Arrays;

class FixedStack implements InStack {
    private int stck[];
    private int tos;


    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1){
            System.out.println("Стек заполнен.");
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos > 0){
            System.out.println("Стек не загружен");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}


class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("Стек mystack1");
        for (int i = 0; i < 5; i++) {
            mystack1.pop();
        }

        System.out.println("Stack mystack2");
        for (int i = 0; i < 8; i++) {
            mystack2.pop();
        }
    }
}


class ArraySort {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 3, 6, 0};
        int temp = 0;

        for (int i = 0; i < arr1.length - 1; i++) {
            if(arr1[i] > arr1[i + 1]) {
                temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
        }

        System.out.println("Array" + Arrays.toString(arr1));
    }
}
