import java.util.ArrayList;

public class TTK_Users {
  public static ArrayList<TTK_Users> userList = new ArrayList<TTK_Users>();

  String username = "";
  String password = "";

  private TTK_Users(String inputUsername, String inputPassword) {
    username = inputUsername;
    password = inputPassword;
  }

  public static void addTTK_User(String inputUsername, String inputPassword) {
    TTK_Users newUser = new TTK_Users(inputUsername, inputPassword);
    userList.add(newUser);
  }

  public static int indexOfUser(String username) {
  int index;
  for (index = 0; index < usersList.size(); index++) {
    if (usersList.get(index).username.equals(username)) {
      break;
    }
  }
return index;
}

public static String passwordOfUser(String username) {
  int index = indexOfUser(username);
  String password = "-1";
  if (index < usersList.size()) {
    password = usersList.get(index).password;
  }
  return password;
  }
}
