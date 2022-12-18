package prac32;

import java.util.Scanner;

public class JohnsonTrotter {
    // Находим самый большой движущийся элемент
    public static int maxK(int n, int[] array, boolean[] f) {
        // k хранит индекс самого большого движущегося элемента
        int k = -1, max = 0;
        for (int i = 0; i < n; i++) {
            // Направление текущего элемента - влево, затем сравниваем с левым элементом, чтобы увидеть, можно ли его переместить
            // Если он подвижный, сравнить с текущим максимальным подвижным значением
            if (!f[i]) {
                if (i > 0 && array[i] > array[i - 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
            //Правильно
            else {
                if (i < n - 1 && array[i] > array[i + 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
        }
        return k;
    }

    // Обмен элементами и направлениями
    public static void swap2(int[] array, boolean[] f, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        boolean temp1 = f[i];
        f[i] = f[j];
        f[j] = temp1;
    }

    //Изменить направление
    public static void ReverseId(int[] array, int k, boolean[] f) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[k]) {
                f[i] = !f[i];
            }
        }
    }

    public static void Jt(int n) {
        // Массив направлений, false - слева, true - справа
        boolean[] flag = new boolean[n];
        // Числовой массив
        int[] iData = new int[n];
        // k - максимальное значение текущего подвижного элемента
        int k;
        // Инициализируем два массива
        for (int i = 0; i < n; i++) {
            iData[i] = i + 1;
            flag[i] = false;
        }
        // Выводим первую инициализированную аранжировку, она не будет автоматически сгенерирована
        for (int i = 0; i < n; i++) {
            System.out.print(iData[i]);
            System.out.print(flag[i]);
        }
        System.out.println();
        // Инициализируем k, получаем первый самый большой подвижный элемент
        k = maxK(n, iData, flag);
        // Цикл, пока не останется подвижных элементов
        while (k != -1) {
            // Может двигаться вправо
            if (flag[k]) {
                // При движении меняем местами элементы и направления
                swap2(iData, flag, k, k + 1);
                // В это время элемент k был переставлен вправо, и k необходимо соответственно увеличить на 1
                k++;
            }
            // Может двигаться влево
            else {
                swap2(iData, flag, k, k - 1);
                k--;
            }
            ReverseId(iData, k, flag);// Изменение направления всех элементов больше k
            // Выводим текущее расположение
            for (int i = 0; i < n; i++) {
                System.out.print(iData[i]);
                System.out.print(flag[i]);
            }
            System.out.println();
            k = maxK(n, iData, flag); // Получить следующие k
        }
    }

    public static void main(String[] args) {
        System.out.print("Please put in n :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // ввод n
        Jt(n); // Алгоритм вызова
        scan.close();
    }
}