public class Main {




    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;

        }

        return arr;
    }
      // Задача 1

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int e = 0;e< arr.length;e++){
            sum=arr[e]+sum;
        }
        System.out.println("Задача 1\n");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей\n");


        // Задача 2

        int min=arr[0];
        int max=arr[0];
        for(int y=0;y<arr.length;y++) {
            if (arr[y] < min) {
                min = arr[y];
            }
        }
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] > max) {
                max = arr[y];
            }
        }
        System.out.println("Задача 2\n");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей\n");


       // Задача 3
        System.out.println("Задача 3\n");
        System.out.println("Средняя сумма трат за месяц составила "+sum/arr.length+" рублей\n");



      // Задача 4
        System.out.println("Задача 4\n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int f = reverseFullName.length-1;f>=0;f--) {
            System.out.print(reverseFullName[f]);
        }
        System.out.println();
    }
}