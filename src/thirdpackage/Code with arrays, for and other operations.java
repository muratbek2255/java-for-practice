package thirdpackage;

class Example {
    public static void main(String[] args){
        System.out.println("Это программа что то делает");
    }
}


class Example2 {
    public static void main(String[] args){
        int num;

        num = 100;

        System.out.println("Это переменная num: " + num);

        num = num * 2;

        System.out.print("Значение переменной num * 2 равно: ");
        System.out.println(num);
    }
}


class ifSample {
    public static void main(String[] args){
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше у");

        x = x * 2;

        if (x > y) System.out.println("x теперь больше x");

        if(x == y) System.out.println("не увидите этого");
    }
}


class ForTest{
    public static void main(String args[]){
        int x;

        for(x = 0; x < 10; x++){
            System.out.println("x: "+ x);
        }
    }
}


class BlockTest {
    public static void main(String args[]){
        int x, y;

        y = 20;

        for(x=0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение у: " + y);
            y = y - 2;
        }
    }
}


class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("Days: " + days);
        System.out.print("прошел ");
        System.out.println(distance + "милью");
    }
}


class Area {
    public static void main(String args[]){
        double pi, r, a;

        r = 10.8;
        pi = 3.1416;

        a = pi * r * r;

        System.out.println("Square = " + a);
    }
}


class CharDemo {
    public static void main(String args[]) {
        char ch1, ch2;

        ch1 = 88;
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);
    }
}


class CharDemo2 {
    public static void main(String args[]){
        char ch1;

        ch1 = 'X';
        System.out.println("ch1 содержит: " + ch1);

        ch1++;
        System.out.println("ch1 теперь содержит: "+ ch1);
    }
}


class BoolTest {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b равно: " + b);
        b = true;
        System.out.println("b равно: " + b);

        if(b) System.out.println("Этот код выполняется.");
        b = false;
        if(b) System.out.println("Этот окд не выполняется");

        System.out.println("10 > 9 равно" + (10>9));
    }
}


class Conversation {
    public static void main(String args[]) {
        byte b;

        int i = 257;
        double d = 323.142;

        System.out.println("\n Преобразование типа int в тип byte");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\n Преобразование типа double в тип int. ");
        i = (int) d;

        System.out.println("d and i" + i + " " + d);
    }
}


class Average {
    public static void main(String args[]) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;

        for(i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("thirdpackage.Average: " + result/5);
        }
    }
}


class TwoDArray {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int k = 0;

        for(int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++){
                twoD[i][j] = k;
                k++;
            }


        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(twoD[i][j] + " ");
            System.out.println();
            }
        }
    }
}


class BitLogic {
    public static void display(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value) + "Integer: " + value);
    }
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        int a = 3;

        int b = 6;

        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        display(c);
        display(d);
        display(e);
        display(f);
        display(g);
    }
}


class Ternary {
    public static void main(String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;

        System.out.print("Абсолютное значение ");
        System.out.println(i + "равно" + k);

        i = -10;

        k = i < 0 ? -i: i;

        System.out.print("Абсолютное значение ");
        System.out.println(i + "равно" + k);

    }
}


class SampleSwitch {
    public static void main(String args[]) {
        for(int i = 0; i < 6; i++){
            switch (i)
            {
                case 0:
                    System.out.print("i=0");
                    break;
                case 1:
                    System.out.print("i = 1");
                    break;
                case 2:
                    System.out.print("i=2");
                    break;
                default:
                    System.out.println("Java is bullshit");
            }
        }
    }
}


class CircleWhile {
    public static void main(String args[])
    {
        int n = 10;
        while(n > 0){
            System.out.println("N:" + n);
            n--;
        }
    }
}


class Menu {
    public static void main(String args[])
            throws java.io.IOException{
        char choice;

        do{
            System.out.println("Справка по оператору");
            System.out.println("   1.if");
            System.out.println("   1.switch");
            System.out.println("   1.while");
            System.out.println("   1.do-while");
            System.out.println("   1.for");
            System.out.println("   1.Выберите нужный пункт");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice)
        {
            case '1':
                System.out.println("   1.if");
                break;
            case '2':
                System.out.println("   1.switch");
                break;
            case '3':
                System.out.println("   1.while");
                break;
            case '4':
                System.out.println("   1.do-while");
                break;
            case '5':
                System.out.println("   1.for");
                break;
        }
    }
}


class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x: nums) {
            System.out.println("Значение равно " + x);
            sum += x;
        }

        System.out.println("Сумма равно: " + sum);
    }
}


class Search {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for(int x: nums){
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Значение найдено !!!");
        }
    }
}
