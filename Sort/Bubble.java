package Sort;

public class Bubble {
    public static void main(String[] args) {
        // Sort
        // Bubble

        int[] arr = {12,2,12,3,1};
        arr = sort(arr);
        for(int number : arr){
            System.out.println(number);
        }
    }
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
        return arr;
    }
}
