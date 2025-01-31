public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 4, 7, 8, 9, 8, 9, 23, 24, 10 };

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Non-repeating element: " + arr[i]);
            }
        }
    }
}
