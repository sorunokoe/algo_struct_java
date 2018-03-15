package Search;

public class Linear {
    public static void main(String[] args) {
        // Линейный поиск

        // Массив
        int[] arr = {23,54,65,76,87};
        // Число, которое мы ищем
        int search = 87;
        // Индекс элемента, в котором хранится наше число. Если такого элемента нет, индекс будет равен -1
        int index = search(arr, search); // Вызываем метод search и передаем массив и число, которое ищем
        // Выводим индекс
        System.out.println(index);

    }
    static int search(int[] arr, int search){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
            System.out.println("Iteration: "+i);
        }
        // Если программа дошла до этой строки, значит искомое число не было найдено
        // И мы возвращаем какое-то число чтобы дать понять, что элемента c искомым числом не существует
        return -1;
    }
}
