import java.util.*;

public class WordCount {
    private final HashMap<String, Integer> words = new HashMap<>(); // создаем поле words, это экземпляр-коллекция из
    // класса HashMap, изначально пустой

    public WordCount(String string) { // Конструктор класса, создаёт экземпляр с одним только полем words.
        // Такой экземпляр - это "мапа" (словарь из элементов типа "ключ-значение"). Ключ - это слово из строки,
        // а значение - это число, показывающее число повторов этого слова в строке.

        for (String word : string.split("\\s")) { // объявление цикла по массиву слов, полученному из строки с помощью
            // метода split() - это метод из класса String, разбивает строку по шаблону и возвращает массив подстрок (слов).
            if (words.containsKey(word)) { // Проверка условия. Метод containsKey() возвращает значение true, если ключ (слово) существует в мапе,
                words.put(word, words.get(word) + 1); // Если условие true, то добавляем в мапу элемент, при этом ключ перезаписывается,
                // а значение увеличивается на +1. Метод get() — возвращает из поля значение элемента с указанным ключом.

            } else {
                words.put(word, 1); // Добавляем в экземпляр-коллекцию элемент типа "ключ-значение". Метод put() — добавляет один элемент
            }
        }
    }


    public void printResult() { // метод для вывода содержимого "мапы" в консоль. Сортировка найдена в сети: https://ru.stackoverflow.com/questions/330039/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-map-%D0%BF%D0%BE-%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D1%8E-java

        System.out.printf("В тексте %d слов%n", words.size()); // Спецификатор %d предназначен для вывода целого числа
        // Спецификатор %n - переход к следующей строке
        words.entrySet().stream() // метод entrySet() — возвращает множество, состоящее из объектов, реализующих
                // интерфейс Map.Entry<K, V>. Эти объекты содержат метод getKey() для получения ключа и метод getValue() для получения значения.
                // метод stream() — создает из объектов последовательный поток.
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}




//        Integer[] values = words.values().toArray(new Integer[0]); //преобразуем мапу в массив значений
//        System.out.println(Arrays.toString(values));
//        Arrays.sort(values);
//        System.out.println(Arrays.toString(values));







//        List<Integer> valueList = new ArrayList<>(words.values()); // коллекция значений
//        System.out.println(List.sort(valueList));


//        Arrays.sort(new Arrays[]{words.values()});
//        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(words.entrySet());
//        Arrays.sort(valueList);
//        System.out.println(Arrays.toString());








