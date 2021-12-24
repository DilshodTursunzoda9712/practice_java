# Нахождение символа или слова в строке
## Метода indexOf().

### Ищем символ "hrt" в строке с помощью метода indexOf(). Метод вернет индекс первого вхождения, если символ не будет найдено, то метод вернет -1.


``` sql
public class Test {
    public static void main(String[] args) {
        String str = "dmksap csajava - developer 123hrt";
        int indexHrt = str.indexOf("hrt");

        if (indexHrt == -1) {
            System.out.println("символ \"hrt\" не найден !");
        } else {
            System.out.println("символ \"hrt\" найден в индексе " + indexHrt);
        }
    }
}
```

### Результат
``` sql
символ "hrt" найден в индексе 30
```
## Метод contains().

### Метод contains() позволяет узнать есть ли в строке данный символ или слово, если символ или слово будет найдено, то метод вернет true.

``` sql
public class Test {
    public static void main(String[] args) {
        String str = "dmksap csajava - developer 123hrt";
        System.out.println("Символ \"hrt\" присутствует в строке str? Ответ: " + str.contains("hrt"));
    }
}
```

### Результат
``` sql
Символ "hrt" присутствует в строке str? Ответ: true
```
