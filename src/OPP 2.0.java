class Box2 {
    double width;
    double height;
    double depth;

    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}


class OverloadCoins{
    public static void main(String args[]){
        Box2 mybox = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mybox3 = new Box2(7);

        double vol;

        vol = mybox.volume();
        System.out.println("Обьем первого: " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем второго: " + vol);

        vol = mybox3.volume();
        System.out.println("Обьем третьего" + vol);
    }
}