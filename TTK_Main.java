public class TTK_Main;{
  public static main(String[] args){

  }
  private static boolean tryLoginUser() {
      TTK_Login login = new TTK_Login();
      System.out.print("Username: ");
      String tempUsername = scan.next();
      login.checkUsername(tempUsername);
      System.out.print("Password: ");
      boolean success = login.checkPassword(scan.next());
      if (success) {
        currentUser = tempUsername;
      }
      return success;
    }

    private static void printMenu() {
      System.out.println("1. Create user");
      System.out.println("2. Login existing user");
      System.out.println("3. Exit");
    }
  private static int scanInt() {
    int inputInt;
    while(true){
      try {
        inputInt = scan.nextInt();
        break;
      }
      catch (InputMismatchException e) {
        System.out.print("Select your option: ");
        scan.next();
      }
    }
    return inputInt;
  }
}
