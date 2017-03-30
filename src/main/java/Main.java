import java.util.ArrayList;
import java.util.List;

public class Main {

        public static final int MIN=1;
        public static final int MAX=100;

        public static void main(String[] args) {
            List oddList = new ArrayList<Integer>();
            System.out.println("Нечетные числа:");
            for (int i=MIN;i<MAX;i+=2){
                oddList.add(i);
                System.out.print(i+" ");
            }
            System.out.println();

            Integer[] oddNumbers = new Integer [oddList.size()];
            oddList.toArray(oddNumbers);
            System.out.println("Нечетные числа в обратном порядке:");
            for(int i=oddNumbers.length-1;i>=0 ;i--){
                System.out.print(oddNumbers[i]+ " ");
            }
        }
    }
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число \"от\":");
//        int a = sc.nextInt();
//        System.out.println("Теперь введите число \"до\":");
//        int b = sc.nextInt();
//        System.out.println("Нечетные числа:");
//
//        for (int i = a; i < b; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//    }


//    public void main2(String[] args) {
//        //чтобы узнать размер массива, вычислим его циклом
//        int count = 0; //индекс массива
//        int n = 1; //значение индекса массива
//        while (n <= 99) { //на выходе из этого цикла имеем count когда в него записано 99
//            count++;
//            n = n + 2;
//        }
//
//        int[] massiv = new int[count]; //объявляем массив
//        int number = 1; //начальное значение ячейки с индексом 0
//        for (int i = 0; i < massiv.length; i++) {
//            massiv[i] = number;
//            System.out.println("Нечетные числа:");
//            System.out.print(massiv[i] + " ");
//            number = number + 2;
//        }
//    }



