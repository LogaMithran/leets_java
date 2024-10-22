package arrays_1;

public class CheckSorting {

    /**
     * Brute force method
     *
     * @param arr
     * @return
     */
    static boolean checkSorting(int[] arr) {
        int firstLoopSteps = 0;
        int secondLoopSteps = 0;

        for (int i : arr) {
            firstLoopSteps++;
            for (int j : arr) {
                secondLoopSteps++;
                if (i < j) {
                    System.out.print("Number of steps i ::: " + firstLoopSteps + "\n");
                    System.out.print("Number of steps j ::: " + secondLoopSteps + "\n");
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * optimal approch
     *
     * @param arr
     * @return
     */
    static boolean checkSorting2(int[] arr) {
        int steps = 0;
        for (int i = 1; i < arr.length; i++) {
            steps++;
            if (arr[i] < arr[i - 1]) {
                System.out.print("Number of steps i ::: " + steps + "\n");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 7, 8, 9};
        System.out.println(checkSorting(arr));
        System.out.println(checkSorting2(arr));
    }
}
