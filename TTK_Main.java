public class TTK_Main;{
  public static main(String[] args){

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
