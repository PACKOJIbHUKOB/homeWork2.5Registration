public class BackGround {
    private String login;
    private String password;
    private String confirmPassword;

    public BackGround(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Boolean checkPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean checkString(String s) {
        if (s == null || s.length() > 20 || s.isEmpty()) {
            return false;
        }
        String s1 = s.replaceAll("[^a-zA-Z0-9_]", "");
        if (s.equals(s1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkBackground(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!checkString(login)) {
            throw new WrongLoginException("Логин не верный!");
        }
        if (!checkString(password)) {
            throw new WrongPasswordException("Пароль не верный!");
        }
        if (!checkPassword(password, confirmPassword)) {
            throw new WrongPasswordException("Подтверждение пароля не совпадает!");
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
