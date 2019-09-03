public class FindMinInArrayUseMethod {
    public static void main(String[] args) {
        int[] arr = {12,3,11,54,21,-1,5};
        int index = minValue(arr);
        System.out.println("minvalue in array is: " + arr[index] + " at position: " + (index + 1));
    }

    public static int minValue(int []arr){
        int min = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
