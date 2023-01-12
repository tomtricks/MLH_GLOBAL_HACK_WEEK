import java.util.*;
class Main {
  public static void main(String[] args) {
   
    String Smallcase = "abcdefghizklmnopqrstuvwxyz";
    String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String Numbers = "1234567890";
    String Special = "!@#$%^&*()_+=-[]{}|\\'\",<.>/?~`";
    String Mixed = Smallcase+Uppercase+Numbers+Special;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the Password: ");
    int pass_length = sc.nextInt();
    char password[] = new char[pass_length];
    Random rand = new Random();
    for (int i = 0; i < pass_length; i++) {
      password[i]= Mixed.charAt(rand.nextInt(Mixed.length()));
  }
    System.out.println("Generated Password: "+new String(password));
}
}
