public class recursion {
  static int factorial(int num){
    if(num==1){
      return 1;
    }
    return num*factorial(num-1);
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(factorial(n));
  }
}