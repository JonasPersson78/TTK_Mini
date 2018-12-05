public class TTK_Login{
  private String tempUsername;
  private boolean usernameIsValid;

  public TTK_Login() {
    tempUsername = "";
    usernameIsValid = false;
  }

  public boolean checkUsername(String username) {
    int index = TTK_Users.indexOfUser(username);
    if (index < TTK_Users.userList.size()) {
      tempUsername = username;
      usernameIsValid = true;
    }
    return usernameIsValid;
  }

  public boolean checkPassword(String password) {
    if (usernameIsValid) {
      return password.equals(TTK_Users.passwordOfUser(tempUsername));
    }
    return false;
  }
  
}
