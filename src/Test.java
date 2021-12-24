public class Test {
    public static void main(String[] args) {
        String str = "dmksap csajava - developer 123hrt";
        int indexHrt = str.indexOf("hrt");    //ищем 'hrt'  в строке !
        int indexJava = str.indexOf("java");  //ищем 'java' в строке !

        if (indexHrt == -1) {
            System.out.println("Символ \"hrt\" не найден !");
        } else {
            System.out.println("Символ \"hrt\" есть в строке str? Ответ: " + str.contains("hrt")); //проверяем присутствует ли данный символ или слово в строке.
            System.out.println("Символ \"hrt\" найден в индексе " + indexHrt);
        }

        if (indexJava == -1) {
            System.out.println("Слово \"java\" не найден !");
        } else {
            System.out.println("Слово \"java\" присутствует в строке str? Ответ: " + str.contains("java")); //проверяем присутствует ли данный символ или слово в строке.
            System.out.println("Слово \"java\" найден в индексе " + indexJava);
        }

    }
}