package threads;


class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        t.setName("My Thread");
        System.out.println("После изменения потока: " + t);

        try {
            for (int i = 5; i > 0; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}


class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }
    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i++) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}


class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i++) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен ");
    }
}


class SecondNewThread extends Thread{
    SecondNewThread() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i++) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}


class ThreadDemo2 {
    public static void main(String[] args) {
        new SecondNewThread();

        try {
            for (int i = 5; i > 0; i++) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен ");
    }
}


class Callme {
    void call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.println("]");
    }
}


class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}


class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Welcome");
        Caller obj2 = new Caller(target, "In synchronized world");
        Caller obj3 = new Caller(target, "Friend");

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}


class ThirdNewThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    ThirdNewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток" + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0 ; i--) {
                System.out.println(name + " " + i);
                Thread.sleep(1000);
            }
            synchronized (this) {
                while (suspendFlag){
                    wait();
                };
            }
        }catch (InterruptedException e) {
            System.out.println(name + "прерван");
        }
        System.out.println(name + "завершен");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}


class SuspendResume {
    public static void main(String[] args) {
        ThirdNewThread obj1 = new ThirdNewThread("Один");
        ThirdNewThread obj2 = new ThirdNewThread("Два");

        try {
            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Первый поток остановлен");
            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Первый поток начался");
            Thread.sleep(1000);
            obj2.mysuspend();
            System.out.println("Второй поток остановлен");
            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Второй поток начался");
        }catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }

        try {
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток завершен");
    }
}