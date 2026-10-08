public class BinarySearch {
    public static void main(String[] args) {
        int[] array1 = {3, 7, 9, 12, 23, 45}; 
        int target = 9;

        int low = 0;
        int high = array1.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = (high + low) / 2; 

            if (array1[mid] == target) {
                foundIndex = mid;
                break; 
            }
            if (array1[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Element mil gaya Index position: " + foundIndex);
        } else {
            System.out.println("Element array me nahi hai.");
        }
    }
}
