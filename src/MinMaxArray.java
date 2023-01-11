import java.util.Arrays;

public class MinMaxArray {
  public static void main(String[] args) {
    int[] array = {10, 20, 40,30};
    int max = array[0];
    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if(max<array[i]){
        max = array[i];
      }else if(min>array[i]){
        min = array[i];
      }
    }
    System.out.println("배열의 최댓값은 "+max+"입니다.");
    System.out.println("배열의 최솟값은 "+min+"입니다.");

    Arrays.sort(array);
    System.out.println(Arrays.toString(array));



  }
}
