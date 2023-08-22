public class BackGround {
    String login;
    String password;
    String confirmPassword;

    public BackGround(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public Boolean checkPassword(String password, String confirmPassword) {
        if (this.password.equals(this.confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }
    public Boolean checkBackground (String s){
        if (s == null||s.length()>20||s.isEmpty()){
            return false;
        }
        String s1=s.replaceAll("[^a-zA-Z0-9_]","");
        if (s.equals(s1)){
            return true;
        }else {
            return false;
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
