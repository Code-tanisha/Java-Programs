import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int noOfrows = sc.nextInt();
    //initializing row count with 1
    int rowcount = 1;
    System.out.println("Here is your pyramid");
    for(int i = noOfrows; i > 0; i--){
      // printing spaces
      for(int j = 1; j < i; j++){
        System.out.println(" ");
      }
      //printing rowcount value "rowcount" times in each row
      for(int j = 1, j < rowcount; j++){
        System.out.println(rowcount+" ")
      }
      System.out.println();
        rowcount++;
    }
  }
}
