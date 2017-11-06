import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

    public class Jolyshka {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> three = new ArrayList<Integer>();
            ArrayList<Integer> two = new ArrayList<Integer>();
            ArrayList<Integer> others = new ArrayList<Integer>();

            for (int i = 0; i < 20; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            for (Integer number : list) {
                if (number % 2 != 0 && number % 3 != 0) {
                    others.add(number);
                } else {
                    if (number % 3 == 0) {
                        three.add(number);
                    }
                    if (number % 2 == 0) {
                        two.add(number);
                    }
                }
            }
            printList(three);
            printList(two);
            printList(others);
        }

        public static void printList(List<Integer> list) {
            for (Integer number : list) {
                System.out.println(number);
            }
        }
    }

}
