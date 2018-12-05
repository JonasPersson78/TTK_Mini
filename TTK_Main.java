public class TTK_Main;{
  public static main(String[] args){

  }

  private static void tryCreateUser() {
    boolean success = false;
    TTK_Create create = new TTK_Create();
    while(!success) {
      boolean validInput = false;
      System.out.print("Choose a username: ");
      while(!validInput) {
        validInput = create.tryUsername(scan.next());
        if(!validInput) {
          System.out.print("Choose another username: ");
        }
      }
      validInput = false;
      while(!validInput) {
        System.out.print("Choose a password: ");
        validInput = create.tryPassword(scan.next());
        if(!validInput) {
          System.out.print("Choose another password: ");
        }
      }
      success = create.tryCreate();
    }
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
