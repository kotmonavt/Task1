public class Task1 {
    public static void main(String[] args) {
        // 1 деление
        System.out.println("Task 1");
        System.out.println(remainder(3, 4));
        // 2 площадь треугольника
        System.out.println("Task 2");
        System.out.println(triArea(7,4));
        // 3 ноги животных
        System.out.println("Task 3");
        System.out.println(animals(5, 2, 8));
        // 4
        System.out.println("Task 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        // 5 действие
        System.out.println("Task 5");
        System.out.println(operation(24, 15, 9));
        // 6 ascii код
        System.out.println("Task 6");
        System.out.println(ctoa('m'));
        // 7 сумма до числа
        System.out.println("Task 7");
        System.out.println(addUpTo(3));
        // 8 третья сторона треугольника
        System.out.println("Task 8");
        System.out.println(nextEdge(8, 10));
        // 9 сумма кубов
        System.out.println("Task 9");
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        // 10 проверка на деление суммы
        System.out.println("Task 10");
        System.out.println(abcmath(42, 5, 10));
    }
    // Методы

    // 1 Метод, который возвращает остаток от деления
    public static int remainder(int divisible, int divider) {
        return divisible % divider;
    }
    // 2 Метод, который возвращает площадь треугольника
    public static int triArea (int base, int height){
        return base*height / 2;
    }
    // 3 Метод, который возвращает количество ног животных
    public static int animals(int chickensLegs, int cowsLegs, int pigsLegs){
        return chickensLegs * 2 + cowsLegs * 4 + pigsLegs * 4;
    }
    // 4 Метод, который возвращает True или False в зависимости от переменных prob, prize, pay
    public static boolean profitableGamble(double prob, int prize, int pay){
        if (prob * prize > pay) {
            return true;
        }
        else {
            return false;
        }
    }
    // 5 Метод, который возвращает название действия, которое нужно совершить с числами, чтобы получить N
    public static String operation(int N, int a, int b) {
        if (a + b == N){
            return "added";
        }
        if (a - b == N){
            return "subtracted";
        }
        if (a * b == N){
            return "multiplied";
        }
        if (a / b == N){
            return "divided";
        }
        else {
            return "none";
        }
    }
    // 6 Метод, который возвращает ASCII код символа
    public static int ctoa(char a){
        return (int) a;
    }
    // 7 Метод, который возвращает сумму всех чисел до числа, включая его
    public static int addUpTo(int a){
        int summ = 0;
        for (int i = 1; i <= a; i++){
            summ+=i;
        }
        return summ;
    }
    // 8 Метод, который возвращает максимальную третью сторону треугольника
    public static int nextEdge(int a, int b){
        return a+b-1;
    }
    // 9 Метод, который возвращающае сумму кубов масива цифр
    public static int sumOfCubes(int[] args){
        int summ = 0;
        for (int i = 0; i < args.length; i++){
            summ+=Math.pow(args[i], 3);
        }
        return summ;
    }
    // 10 Метод возвращающий true/false по условию задачи (задача на деление суммы а b раз)
    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i < b; i++){
            a+=a;
        }
        if (a % c == 0){
            return true;
        }
        else {
            return false;
        }
    }
}