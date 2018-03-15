package Sort;

public class Insertion {
    public static void main(String[] args) {
        // Сортировка
        // Insertion
        int[] arr = {5,3,1,0,3553, 12, 9, 45,6,8};
        arr  = sort(arr);
        for(int number : arr){
            System.out.println(number);
        }
    }
    static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i;j>0 && (arr[j]<arr[j-1]);j--){
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        return arr;
    }
}
