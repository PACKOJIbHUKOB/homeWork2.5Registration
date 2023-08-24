public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        BackGround backGround = new BackGround("master", "qwerty", "qwerty");
        BackGround backGround2 = new BackGround("vas9I_", "qwerty1", "qwerty3");
        BackGround backGround3 = new BackGround("Сергей", "qwerty1", "qwerty1");

        try {
            BackGround.checkBackground(backGround.getLogin(), backGround.getPassword(), backGround.getConfirmPassword());
           BackGround.checkBackground(backGround2.getLogin(), backGround2.getPassword(), backGround2.getConfirmPassword());
            BackGround.checkBackground(backGround3.getLogin(), backGround3.getPassword(), backGround3.getConfirmPassword());

        }catch (WrongPasswordException | WrongLoginException e ){
            throw new RuntimeException(e);

        }finally {
            System.out.println("работа программы выполнена");
        }
    }
}

