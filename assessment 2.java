public class Assignment2 {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / numbers.length;

        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}

