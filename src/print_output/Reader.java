package print_output;


import java.io.*;



class Brread {
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы: , 'q' для выхода");

        do {
            c = (char) br.read();
            System.out.println(c);
        }while(c != 'q');
    }
}


class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[100];
        System.out.println("Введите строки текста");
        System.out.println("Введите 'стоп' для завершения");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if(str[i].equals("стоп")) break;
        }
        System.out.println("\n СОдержимое вашего файла");
        for (int i = 0; i < 100; i++) {
            if(str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}


class ShowFile {
    public static void main(String[] args) {
        int i;

        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("./Text.txt");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i != -1);
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }catch (IOException e) {
            System.out.println("Произошла ошибка ввода и вывода");
        }finally {
            try {
                if (fin != null) fin.close();
            }catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}