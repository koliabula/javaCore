import java.util.Arrays;

public class FunctionClass {

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static int arrayСheck(int[] array) {
        if (array.length == 0) {
            System.out.println("Пустой массив ");
            return 1;
        }
        return 0;
    }

    static int countEvens(int[] array) {
        /* Написать метод, возвращающий количество чётных элементов массива.
         * countEvens([2, 1, 2, 3, 4]) → 3
         * countEvens([2, 2, 0]) → 3
         * countEvens([1, 3, 5]) → 0
         */

        if (arrayСheck(array) == 1) {
            return -1;
        }
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0 && i != 0) {
                count++;
            }
        }
        System.out.print("Количество чётных элементов массива { ");
        printArray(array);
        System.out.println("} = " + count);
        return count;
    }

    static int differenceBetweenMinMax(int[] array) {
//      **  Написать функцию, возвращающую разницу между самым большим
//      **  и самым маленьким элементами переданного не пустого массива.

        if (arrayСheck(array) == 1) {
            return -1;
        }
        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.print("Разница мин и макс элементов массива { ");
        printArray(array);
        System.out.println("} = " + (max - min));
        return max - min;
    }

    static boolean doubleNull (int [] array) {
//    ** Написать функцию, возвращающую истину, если в переданном массиве
//      **  есть два соседних элемента, с нулевым значением.
        if (arrayСheck(array) == 1) {
            return false;
        }

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == 0){
                if(array[i] == array[i+1]){
                    System.out.print("В массиве { ");
                    printArray(array);
                    System.out.println("} ЕСТЬ два соседних элемента с нулевым значегием");
                    return true;
                }
                i++;
            }
        }
        System.out.print("В массиве { ");
        printArray(array);
        System.out.println("} НЕТ двух соседних элементов с нулевым значегием");
        return false;

    }


    static int [] deepSort(int [] array){
        if (arrayСheck(array) == 1) {
            return array;
        }

        int [] sortArray = new int[array.length];

        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        int [] buffArray = new int[max - min + 1];

        Arrays.fill(buffArray, 0);

        for (int i = 0; i < array.length; i++) {
            buffArray[array[i] - min]++;
        }

        for (int i = 0, j = 0; i < buffArray.length;) {
            if(buffArray[i] == 0){
                i++;
            }
            else {
                sortArray[j] = i + min;
                buffArray[i]--;
                j++;
            }
        }
        printArray(array);
        System.out.println();
        printArray(sortArray);
        System.out.println();
        return sortArray;
    }
}
