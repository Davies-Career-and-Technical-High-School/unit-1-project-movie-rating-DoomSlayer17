import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String Title;
      int a;
      int b;
      int c;
      int d;
      double e;
      double f;
      double g;
      System.out.println("Please input movie title.");
      Title = scan.nextLine();
      System.out.println("Please input movie runtime in minutes.");
      a = scan.nextInt();
      System.out.println("Please input three website movie ratings.");
      b = scan.nextInt();
      c = scan.nextInt();
      d = scan.nextInt();
      System.out.println("Please input two focus group ratings.");
      e = scan.nextDouble();
      f = scan.nextDouble();
      System.out.println("Please input one average rating from a pro movie critic.");
      g = scan.nextDouble();
      int h = a/60;
      int i = a%60;
      double j = (double) (b + c + d)/3;
      double k = (e + f)/2;
      double l = ((j * .2) + (k * .3) + (g * .5));
      System.out.println("Title: " + Title);
      System.out.println("Running time: " + h + "hrs" + i + "mins");
      System.out.println("Average Website Rating: " + j);
      System.out.println("Average Focus Group Rating: " + k);
      System.out.println("Average Critic Rating: " + g);
      System.out.println("Overall Movie Rating: " + l);

        
        /* Write your code here */

    }
}