public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] array = new int[]{1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        boolean[] array2 = {true, false, true};
    }

    public static void task2() {
        int[] array = new int[]{1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        boolean[] array2 = {true, false, true};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static void task3() {
        System.out.println();
        int[] array = new int[]{1, 2, 3};
        double[] array1 = {1.57, 7.654, 9.986};
        boolean[] array2 = {true, false, true};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
    }
    public static void task4() {
        System.out.println();
        int[] array = new int[]{1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) array[i] += 1;
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(",");
        }
    }
}