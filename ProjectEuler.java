public class ProjectEuler {
   
   public static int problem1() {
    int b = 0;
    int c = 0;
    int d = 0;
      for (int a = 0; a < 1000; a++) {
         if (a % 3 == 0) {
            b = b + a;
         } 
         if (a % 5 == 0) {
            c = c + a;
         } 
         if (a % 15 == 0) {
            d = d + a;
         }
         
      }
      return b+c-d;
   }
   
   public static int problem2() {
   
      return 0;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}