package lambda;

public class LambdaAsArgumentDemo {
    static String StringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java";
        String Outstr;

        System.out.println("Исходная строка: " + inStr);

        Outstr = StringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("это строка написана прописными буквами: " + Outstr);

        Outstr = StringOp((str) -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println("Это строка с удаленными пробелами: " + Outstr);
    }
}

