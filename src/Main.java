import java.util.*;

public class Main {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount(scan()); // создаём экземпляр wordCount - это "мапа" (словарь из элементов типа "ключ-значение").
        // Аргументом в конструктор передаём метод scan(), возвращающий строку
        wordCount.printResult(); // вывод в консоль содержимого "мапы" wordCount

    }

    public static String scan() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in); // создаем экземпляр класса Scanner из объекта System.in (консольный ввод).
        return scanner.nextLine(); // методом nextLine() получаем строку (тип String).
    }

}


// Аслово Бслово Аслово Вслово Вслово Гслово Аслово Дслово Еслово Жслово Зслово Ислово Ислово Кслово Лслово Лслово Лслово Мслово

