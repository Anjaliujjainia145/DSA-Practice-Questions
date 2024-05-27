import java.util.Scanner;

public class App2{

  static void printDecreasing(int n ){

    // base case
    if( n == 1){
      System.out.println(1);
      return;
    }
    //  another base case
    if(n == 0){
      System.out.println(0);
      return;
    }

    // self work

    System.out.println(n);

    // recursion work

    printDecreasing(n - 1);


    

  }

  // static void printDecreasing(int n){

    // base case 
    // if(n == 1){
      // System.out.println(n);
      // return;
    // }
    // self work
    // System.out.println(n);

    // recursive work

    // printDecreasing(n - 1);


  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printDecreasing(n);
    // Scanner sc =  new Scanner(System.in);
    // int n = sc.nextInt();
    // printDecreasing(n);
    
  }
}