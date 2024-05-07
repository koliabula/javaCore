public class Main {
    public static void main(String[] args) {
        System.out.println("------------ЗАДАЧА 1------------");
        FunctionClass.countEvens(TestData.array1);
        FunctionClass.countEvens(TestData.array2);
        FunctionClass.countEvens(TestData.array3);
        FunctionClass.countEvens(TestData.array4);
        FunctionClass.countEvens(TestData.array5);
        System.out.println("------------ЗАДАЧА 2------------");
        FunctionClass.differenceBetweenMinMax(TestData.array1);
        FunctionClass.differenceBetweenMinMax(TestData.array2);
        FunctionClass.differenceBetweenMinMax(TestData.array3);
        FunctionClass.differenceBetweenMinMax(TestData.array4);
        FunctionClass.differenceBetweenMinMax(TestData.array5);
        System.out.println("------------ЗАДАЧА 3------------");
        FunctionClass.doubleNull(TestData.array1);
        FunctionClass.doubleNull(TestData.array2);
        FunctionClass.doubleNull(TestData.array3);
        FunctionClass.doubleNull(TestData.array4);
        FunctionClass.doubleNull(TestData.array5);
        System.out.println("------------ЗАДАЧА 4------------");
        FunctionClass.deepSort(TestData.array1);
        FunctionClass.deepSort(TestData.array2);
        FunctionClass.deepSort(TestData.array3);
        FunctionClass.deepSort(TestData.array4);
        FunctionClass.deepSort(TestData.array5);
    }
}