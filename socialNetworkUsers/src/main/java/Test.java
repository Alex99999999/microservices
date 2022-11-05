import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Test {

    int length;
    int startLeft;
    int endLeft;
    int midLeft;
    int startRight;
    int endRight;
    int midRight;

    public static void main(String[] args) {
//        Test test = new Test();
//        Integer[] arr = {5, 3, 2, 8, 11, 10, 15 -1, -3, 0};
//        Integer res = test.findResult(arr);
//        System.out.println("RESULT -> " + res);
        LocalDate date = null;
    }

    private Integer findResult(Integer[] arr) {
        setStartPoints(arr);
        Integer res = null;
        while (startLeft < startRight && endLeft < endRight) {
            res = arr[startLeft] - Math.abs(arr[endRight]);
            if (res == 0) {
                return arr[startLeft];
            } else if (res > 0) {
                moveRight();
            } else {
                moveLeft();
            }
        }
        return res;

    }

    private void setStartPoints(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        length = arr.length;
        startLeft = 0;
        endLeft = (length - 1) / 2;
        midLeft = (endLeft - startLeft) / 2;
        startRight = endLeft;
        endRight = length - 1;
        midRight = startRight + (endRight - startRight) / 2;
    }

    private void moveRight() {
        startLeft = midLeft;
        midLeft = startLeft + (endLeft - startLeft) / 2;
    }

    private void moveLeft() {
        startRight = midRight;
        midRight = (endRight - startRight) / 2;
    }


    private Integer findResultRemaining(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int mid = length / 2;
        Integer res = null;
//        System.out.println("Equal -> " + 8 % 8);
//        System.out.println("Negative -> " + 8 % -8);
//        System.out.println("Zero -> " + 0 % 8);
////        System.out.println("Divide by 0 -> " + 8%0);
//        System.out.println("Greater -> " + 6 % 5);
//        System.out.println("Smaller -> " + 4 % 5);
        while (start < mid && end > mid) {
            if (arr[start] == 0 && arr[end] == 0) {
                return 0;
            }
            if (arr[start] == 0 || arr[end] == 0) {
                start = start + (mid - start) / 2;
                end = mid + ((end - mid) / 2);
            } else {
                res = arr[start] % arr[end];
                if (res == 0) {
                    return arr[start];
                } else {
                    start = start + (mid - start) / 2;
                    end = mid + ((end - mid) / 2);
                }
            }
        }
        return res;
    }

}
