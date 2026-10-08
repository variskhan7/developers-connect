public class LinearSearch {
    public static void main(String[] args) {

        int[] array1 = {12, 45, 7, 23, 9};
        int target = 7;
        int foundIndex = -1; 

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == target) {
                 foundIndex = i; 
                 break;          
            }
        } 
        if (foundIndex != -1) {
            System.out.println("Element mil gaya! Index position: " + foundIndex);
        } else {
            System.out.println("Element array me nahi hai.");
        }
    }
}
