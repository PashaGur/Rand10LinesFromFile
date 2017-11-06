import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Rand10LinesFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "Admin" + separator + "Desktop" + separator + "test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine()); //добавляем в список имена из файла
        }
        Set<Integer> randomList = new HashSet<>(); //список, который не может добавить 2 одинаковых элемента
        Random r = new Random();
        while (randomList.size() < 10) { //создаем список из уникальных случайных чисел, пока их не станет 10
            randomList.add(r.nextInt(list.size())); //добавляем случайные числа от 1 до 100 (длина 1го списка)
        }
        Iterator iterator = randomList.iterator(); //итератор для возможности вывести нужный элемент из списка 1
        while (iterator.hasNext()) { //проверка, есть ли еще элементы в итераторе
            System.out.println(list.get((int) iterator.next())); //выводим на экран случайный элемент из списка.
            //берем элемент из списка 1 с индексом случайного списка 2. Радуемся! :)
        }
    }
}