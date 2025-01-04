
public class SortStrings {
  public static void main(String args[]) {
    String arr[] = { "pomegranate", "banana", "cherry", "mango", "papaya", "apple", "grapes", "Apple", "ApplE" };
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; (j < arr.length - 1 - i); j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          final String temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (String fruit : arr) {
      System.out.print(fruit + " ");
    }
  }
}