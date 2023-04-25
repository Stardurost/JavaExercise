import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        System.out.print("\n 1 задание\n");
        firstTask();  // Вывод простых чисел из массива
        System.out.print("\n");
        System.out.print("\n 2 задание\n");
        secondTask(); // Расчет ср. арифметического и геометрического
        System.out.print("\n");
        System.out.print("\n 3 задание\n");
        thirdTask();  // Вывод н числа ряда фибоначи
        System.out.print("\n");
        System.out.print("\n 4 задание\n");
        fourthTask(); // Разложение на множители
        System.out.print("\n");
        System.out.print("\n 5 задание\n");
        fifthTask();  // Вывод н числа арифметической прогрессии
        System.out.print("\n");
        System.out.print("\n 6 задание\n");
        sixthTask();  // Вывод элементов строки в обратном порядке
        System.out.print("\n");
        System.out.print("\n 7 задание\n");
        seventhTask();// Убирает повторяющиеся символы из строки
        System.out.print("\n");
        System.out.print("\n 8 задание\n");
        eightTask();  // Поиск палиндромов в строке
        System.out.print("\n");
        System.out.print("\n 9 задание\n");
        nineTask();    // Поиск количества вхождений искомого слова в строку
        System.out.print("\n");
        System.out.print("\n 10 задание\n");
        tenTask(); // Удаление необходимого символа из строки
        System.out.print("\n");
        System.out.print("\n 11 задание\n");
        elevenTask(); // Сортировка в алфавтином порядке
        System.out.print("\n");
        System.out.print("\n 12 задание\n");
        twelveTask(); // Проверяет является ли анаграммой
        System.out.print("\n");
        System.out.print("\n 13 задание\n");
        thirteenthTask(); // преобразование в верхний регистр
        System.out.print("\n");
        System.out.print("\n 14 задание\n");
        fourteenthTask(); // Нахождение самого частого слова
        System.out.print("\n");
        System.out.print("\n 15 задание\n");
        fifteenthTask(); // Определение является ли слово падиндромом
        System.out.print("\n");
        System.out.print("\n 16 задание\n");
        sixteenthTask(); // Проверка массива на симметричность
        System.out.print("\n");
        System.out.print("\n 17 задание\n");
        seventeenthTask(); // Поиск пересечений в массивах
        System.out.print("\n");
        System.out.print("\n 20 задание\n");
        twentyTask();      // Алгоритм быстрой сортировки массива
        System.out.print("\n");
        System.out.print("\n 25 задание");
        twentyfiveTask();  // Алгоритм Кнута-Мориса-Плата
        System.out.print("\n");
        System.out.print("\n 27 задание");
        twentysevenTask(); // Алгоритм Симпсона
        System.out.print("\n");
        System.out.print("\n 26 задание");
        twentysixTask();    // Алгоритм Левеншейна
    }
    public static void firstTask(){
        Scanner in = new Scanner(System.in);                // определение класса Scanner для получения значений с клавиатуры
        System.out.print("Введите нижнюю границу массива: ");
        Integer min = Integer.parseInt(in.nextLine());      // получение значения с клавиатуры
        System.out.print("Введите верхнюю границу массива: ");
        Integer max = Integer.parseInt(in.nextLine());      // получение значения с клавиатуры

        if (min == max) {System.out.print("В диапазоне нет чисел");return;}
        if (max < min) {System.out.print("Неверно заданы границы диапазона");return;}

        List<Integer> arrayAllNumbers = new ArrayList<>();
        List<Integer> arraySimpleNumbers = new ArrayList<>();

        for (int i = min; i <= max; i++)
        {
            arrayAllNumbers.add(i);                 // заполнение массива всех чисел
            if (IsSimpleNumber(i))
            {
                arraySimpleNumbers.add(i);          // заполнение массива простых чисел
            }
        }
        System.out.print("Все числа: \n");
        System.out.print(arrayAllNumbers.toString());
        if (arraySimpleNumbers.isEmpty()) {System.out.print("\nПростых чисел в заданном диапазоне нет."); return;}
        System.out.print("\nПростые числа: \n");
        System.out.print(arraySimpleNumbers.toString());
    }
    public static boolean IsSimpleNumber(Integer Number){
        if (Number < 2)     // числа меньшие 2 не могут быть простыми
            return false;
        double s = Math.sqrt(Number);   // получение корня из числа
        for (int i = 2; i <= s; i++) {
            if (Number % i == 0)        // проверка делится ли число на другие числа без остатка
                return false;
        }
        return true;
    }
    public static void secondTask(){
        Scanner in = new Scanner(System.in);                // определение класса Scanner для получения значений с клавиатуры
        System.out.print("\nВведите 2 числа: ");
        double firstNumber = in.nextDouble();
        double secondNumber = in.nextDouble();

        System.out.print("Введённые числа: " + firstNumber + " и " + secondNumber);
        System.out.print("\nСреднее арифметическое: ");
        System.out.printf("%.2f",(firstNumber + secondNumber) / 2);
        System.out.print("\nСреднее геометрическое: ");
        System.out.printf("%.2f", Math.sqrt(firstNumber * secondNumber));
    }
    public static void thirdTask(){
        Scanner in = new Scanner(System.in);
        // ряд Фибоначи: 0 1 1
        // далее: сумма двух предыдущих
        System.out.print("\nВведите номер ряда Фибоначчи:");
        Integer n = in.nextInt();
        Integer firstNumber=0,secondNumber=1,buffer=0;

        for(Integer i =2;i<n;i++){
            buffer = secondNumber;
            secondNumber = secondNumber + firstNumber;
            firstNumber = buffer;
        }
        System.out.print("Значение "+n+" члена ряда Фибоначи: " + secondNumber);
    }
    public static void printPrimeFactors(long n) {
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }
        for (Integer i = 3; i <= Math.sqrt(n); i += 2)
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        if (n > 2)
            System.out.print(n);
    }
    public static void fourthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        Integer number = Integer.parseInt(in.nextLine());
        printPrimeFactors(number);
    }
    public static void fifthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите первый член прогрессии: ");
        Integer a1 = in.nextInt();
        System.out.print("Введите разность (шаг) прогрессии: ");
        Integer d = in.nextInt();
        System.out.print("Введите номер искомого члена прогрессии: ");
        Integer n = in.nextInt();

        System.out.print("Значение "+n+" члена прогрессии: " + (a1 + d * (n-1)));
    }
    public static void sixthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String str = in.nextLine();
        String[] arrayWords = str.split(" ");    // деление строки по пробелу

        System.out.print("Строка в обратном порядке слов: ");
        for (Integer i = arrayWords.length-1; i>=0; i--) // вывод в обратном порядке
        {
            System.out.print(arrayWords[i]+" ");
        }
    }
    public static void seventhTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String str = in.nextLine().toLowerCase();
        var arrayLetter = str.toCharArray();    // преобразование в массив символов

        System.out.print("Строка без повторяющихся символов: ");
        for (Integer i = 0; i < arrayLetter.length; i++) // вывод в обратном порядке
        {
            if (!IsItHaveSimilar(arrayLetter[i],arrayLetter))
                System.out.print(arrayLetter[i]);
        }
    }
    public static boolean IsItHaveSimilar(char symbol, char[] allSymbols){
        Integer count = 0;
        for (var item:allSymbols) {
            if (symbol == item)
                count++;
        }
        if (count >= 2) // есть совпадения кроме самого символа
            return true;
        return false;
    }
    public static void eightTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String str = in.nextLine().toLowerCase();

        var arrayWords = str.split(" ");      // все символы строки
        List<String> polyndroms = new ArrayList<String>();
        Integer countChar = 0;
        for (int i = 0; i < arrayWords.length - countChar; i++) {
            var word = arrayWords[i];
            var arrayCharWord = word.toCharArray();
            if (arraysAreIdentical(arrayCharWord, Reverse(arrayCharWord)))
                polyndroms.add(arrayWords[i]);
        }
        if (polyndroms.isEmpty()) {
            System.out.print("В строке нет палиндромов");
            return;
        }
        System.out.print("Палиндромы в строке:\n");
        for (var word:polyndroms) {
            System.out.print(word+" ");
        }
    }
    public static char[] Reverse(char[] Arr) {
        char[] reverseArray = new char[Arr.length];
        int j = 0;
        for(int i = Arr.length - 1; i >= 0; --i) {
            reverseArray[j] = Arr[i];
            j++;
        }
        return reverseArray;
    }
    public static boolean arraysAreIdentical(char[] arr1, char[] arr2){
        for (int i = 0; i < arr1.length; i++){
            if ( arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void nineTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String strInput = in.nextLine().toLowerCase();
        System.out.print("Введите искомое слово: ");
        String word = in.nextLine();
        var result = countWord(strInput, word);
        System.out.print("Количество слов в строке: "+result);
    }
    public static Integer countWord(String input, String word){
        Integer countLetter = word.length();    // количество символов в слове
        char[] arrayChar = input.toCharArray(); // преобразование строки в массив символов
        Integer countWord = 0;
        if (input == word) return ++countWord;  // если вводимая строка равна искомому слову, количество = 1
        if (input.length() < countLetter) return 0; // если длина строки меньше чем колличество букв в слове, количество = 0

        for (Integer i = 0; i < arrayChar.length;i++)   // поиск совпадений в массиве символов
        {
            if (createWord(i, arrayChar, countLetter).equals(word)) countWord++;
        }
        return countWord;
    }
    public static String createWord(Integer i, char[] arrayChar, Integer countLetter){
        String newWord = "";
        for (int j = i; j < countLetter + i; j++)
        {
            if (j >= arrayChar.length) {return newWord;}
            newWord += arrayChar[j];                        // создание нового слова из символов
        }
        return newWord;
    }
    public static void tenTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите строку: ");
        String str = in.nextLine();
        System.out.print("Введите символ, который необходимо удалить: ");
        String symbol = in.nextLine();
        System.out.print("Результат: " + str.replace(symbol, ""));
    }
    public static void elevenTask(){
        String strInput = "апроумапрупнлнпвжхз";
        var array = strInput.toCharArray(); // инициилизация строки и разбиаение на символы
        Arrays.sort(array);         // сортировка в алфавитном порядке
        System.out.print("\nИсходная строка: "+strInput);
        System.out.print("\nСтрока после сортировки: ");
        for (var item: array) {
            System.out.print(item); // вывод на экран
        }
    }
    public static void twelveTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите первое слово:");
        String firstWord = sc.next().toLowerCase();
        System.out.print("Введите второе слово:");
        String secondWord = sc.next().toLowerCase();

        var arrayFirst = firstWord.toCharArray();   // создание массива символов
        var arraySecond = secondWord.toCharArray();

        Arrays.sort(arrayFirst);        // сортировка массивов
        Arrays.sort(arraySecond);

        boolean result = Arrays.equals(arrayFirst, arraySecond); //  проверка равны ли массивы

        if(result)
            System.out.print("Слова являются анаграммами");
        else System.out.print("Слова не являются анаграммами");
    }
    public static void thirteenthTask(){
        String str = "апрмитfHfXVBмиыдмрро";
        System.out.print("\nИсходная строка: "+str);
        System.out.print("\nПреобразованная строка: "+str.toUpperCase());
    }
    public static void fourteenthTask(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите строку:");
        String stringInput =sc.nextLine().toLowerCase();

        var arrayWord = stringInput.split(" "); // создание массива слов из строки

        int[] arrayCount =new int[arrayWord.length]; // массив для хранения количества повторений слов

        for (int i=0;i<arrayWord.length;i++){
            for(int j=0;j<arrayWord.length;j++){
                if(arrayWord[j].equals(arrayWord[i])){
                    arrayCount[i]++;
                }
            }
        }

        int max=0,index=0;
        for (int i=0;i < arrayWord.length;i++){
            if (arrayCount[i] > max){                 // нахождение максимального элемента в массиве
                max = arrayCount[i];
                index = i;                            // получение индекса максимального массива
            }
        }
        System.out.print("Наиболее встречающееся слово: "+arrayWord[index]);
    }
    public static void fifteenthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите слово: ");
        String word = in.nextLine().toLowerCase();

        var arrayWords = word.split("");
        var arrayReversed = Reverse(arrayWords);

        if (arraysAreIdentical(arrayReversed, arrayWords) == true)
        {
            System.out.print("слово " + word + " является палиндромом");
        }
        else {
            System.out.print("слово " + word + " не является палиндромом");
        }
    }
    public static String[] Reverse(String[] Arr) {
        String[] reverseArray = new String[Arr.length];
        int j = 0;
        for(int i = Arr.length - 1; i >= 0; --i) {
            reverseArray[j] = Arr[i];
            j++;
        }
        return reverseArray;
    }
    public static boolean arraysAreIdentical(String[] arr1, String[] arr2){
        for (int i = 0; i < arr1.length; i++){
            if ( !arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void sixteenthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите массив: ");
        String inputArray = in.nextLine();
        String[] mas = inputArray.split("");
        String[] masr = new String[mas.length];

        for(int i = 0; i < mas.length; i++){
            masr[mas.length-1-i] = mas[i];              //формирование реверсивного массива
        }
        String strmas = String.join("", mas);   // преобразование массива в строку
        String strmasr = String.join("", masr);

        if (strmas.equals(strmasr)){
            System.out.print("Массив симметричен");
        } else {
            System.out.print("Массив несимметричен");
        }

    }
    public static void seventeenthTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите элементы первого массива: ");
        String firstStr = in.nextLine();
        String[] firstArray = firstStr.split(" ");
        System.out.print("Введите элементы второго массива: ");
        String secondStr = in.nextLine();
        String[] secondArray = secondStr.split(" ");
        ArrayList<String> finalmas = new ArrayList<>();  // создание динамического массива

        for(int i = 0; i < firstArray.length; i++){ // перебор всех элементов массивов
            for (int j = 0; j < secondArray.length; j++){
                if(firstArray[i].equals(secondArray[j])){
                    finalmas.add(firstArray[i]);
                }
            }
        }
        if (finalmas.isEmpty())
        {
            System.out.print("Пересечение массивов не найдено.");
            return;
        }
        System.out.print("Пересечение массивов: ");
        for(int i = 0; i < finalmas.size(); i++) {
            String value = finalmas.get(i);
            System.out.print(value + " ");
        }
    }
    public static void twentyTask(){
        int[] x = { 50, 24, 10, 16, -45, 7, 10, 12, 0, 1, 5 };
        System.out.print("\nИсходный массив\n");
        System.out.println(Arrays.toString(x));
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        System.out.print("Массив после сортировки");
        System.out.print(Arrays.toString(x));
    }
    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0
        if (left >= right)
            return;//завершить выполнение если массивы пустые
        // выбрать опорный элемент
        int middle = left + (right - left) / 2;
        int opora = array[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = left, j = right;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        System.out.print(Arrays.toString(array));
        // вызов рекурсии для сортировки левой и правой части
        if (left < j)
            quickSort(array, left, j);
        if (right > i)
            quickSort(array, i, right);
    }

    public static void twentyfiveTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String strInput = in.nextLine();
        System.out.println("Введите искомое слово: ");
        String searchWord = in.nextLine();
        KMP(strInput, searchWord);
    }
    public static void KMP(String text, String pattern)
    {
        // базовый случай 1: шаблон нулевой или пустой
        if (pattern == null || pattern.length() == 0)
        {
            System.out.println("Слово встречается на 1 символе");
            return;
        }

        // базовый случай 2: текст равен NULL или длина текста меньше длины шаблона
        if (text == null || pattern.length() > text.length())
        {
            System.out.println("Слова нет в строке");
            return;
        }

        char[] chars = pattern.toCharArray();

        // next[i] сохраняет индекс следующего лучшего частичного совпадения
        int[] next = new int[pattern.length() + 1];
        for (int i = 1; i < pattern.length(); i++)
        {
            int j = next[i + 1];

            while (j > 0 && chars[j] != chars[i]) {
                j = next[j];
            }

            if (j > 0 || chars[j] == chars[i]) {
                next[i + 1] = j + 1;
            }
        }

        for (int i = 0, j = 0; i < text.length(); i++)
        {
            if (j < pattern.length() && text.charAt(i) == pattern.charAt(j))
            {
                if (++j == pattern.length()) {
                    System.out.println("Слово встречается на " + (i - j + 1)+" символе.");
                }
            }
            else if (j > 0)
            {
                j = next[j];
                i--;    // так как `i` будет увеличен на следующей итерации
            }
        }
    }
    static float func(float x)  // функция интегрирования
    {
        return (float)Math.log(x);
    }
    static float simpson(float ll, float ul, int n)
    {
        // вычисление значения
        float h = (ul - ll) / n;

        float[] x = new float[10];  // массив хранения значений х
        float[] fx= new float[10];  // массив хранения значений функции от х

        for (int i = 0; i <= n; i++) { // вычисление значений х и функции от х
            x[i] = ll + i * h;
            fx[i] = func(x[i]);
        }

        // Вычисление результата
        float res = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0 || i == n)
                res += fx[i];
            else if (i % 2 != 0)
                res += 4 * fx[i];
            else
                res += 2 * fx[i];
        }
        res = res * (h / 3);
        return res;
    }
    public static void twentysevenTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите минимальную границу: ");
        Float min = Float.parseFloat(in.nextLine());
        System.out.print("Введите максимальную границу: ");
        Float max = Float.parseFloat(in.nextLine());
        System.out.print("Введите параметр n: ");
        Integer n = Integer.parseInt(in.nextLine());
        System.out.println("Результат вычисления: "+simpson(min,max, n));
    }
    public static void twentysixTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String firstString = in.nextLine();
        System.out.print("Введите второе слово: ");
        String secondString = in.nextLine();

        double similarity = findSimilarity(firstString, secondString);
        System.out.print("Расстояние между строками: ");
        System.out.printf("%.3f",similarity);
    }
    public static int getLevenshteinDistance(String X, String Y)
    {
        int m = X.length();
        int n = Y.length();

        int[][] T = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            T[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            T[0][j] = j;
        }

        int cost;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                cost = X.charAt(i - 1) == Y.charAt(j - 1) ? 0: 1;
                T[i][j] = Integer.min(Integer.min(T[i - 1][j] + 1, T[i][j - 1] + 1),
                        T[i - 1][j - 1] + cost);
            }
        }
        return T[m][n];
    }
    public static double findSimilarity(String x, String y) {
        if (x == null || y == null) {
            System.out.print("Строки пустые");
        }

        double maxLength = Double.max(x.length(), y.length());
        if (maxLength > 0) {
            return (maxLength - getLevenshteinDistance(x, y)) / maxLength;
        }
        return 1.0;
    }
    
}