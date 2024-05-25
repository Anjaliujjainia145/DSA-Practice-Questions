import java.util.Scanner;

public class App1{

  static void printIncreasing(int n ){
    // base case

    if(n == 1){
      System.out.println(1);
      return;
    }
    if(n == 0){
      System.out.println(0);
      return;
    }


    // recursion work

    printIncreasing(n - 1);

    // self work 
    System.out.println(n);


  }

  // static void printIncreasing(int n){

  //   //  self case

  //   if(n == 1){
  //     System.out.println(n);
  //     return;
    // }


    // recursive work

    // printIncreasing(n - 1);

    // self work

  //   System.out.println(n);

  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printIncreasing(n);
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // printIncreasing(n);
    
  }
}