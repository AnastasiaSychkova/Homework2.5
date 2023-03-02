public class Main {
    public static void main(String[] args) {
        finish("ooooooooooooooooooooo", "jfjkjkgR555555555555555555555", "jfjkjkgR");
        finish("ooooooooooooooooooooo", "ojkbnjjnkllkjbggbg655", "ojkbnjjnkllkjbggbg655");
    }

    public static boolean finish(String login, String password, String repeatPassword) {
        try {
            checkLogin(login);
            checkPassword(password, repeatPassword);
            return true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void checkLogin(String login) {
        if (maxLength(login) && symbols(login)) {
            System.out.println("Верный логин");
        } else {
            throw new WrongLoginException("Неправильный логин");
        }
    }

    private static void checkPassword(String password, String repeatPassword) {
        if (symbols(password) && equalsPassword(password, repeatPassword) && maxLength(password)) {
            System.out.println("Верный пароль");
        }else {
            throw new WrongPasswordException("Неправильный пароль");
        }
    }

    private static boolean equalsPassword(String pass1, String pass2) {
        return pass1.equals(pass2);
    }

    private static boolean symbols(String s) {
        final String alphabet = "abcdefghigklmnopqrstuvwxyz0123456789_";
        for (int i = 0; i < s.length(); i++) {
            if (!alphabet.contains(String.valueOf(s.charAt(i)).toLowerCase())) {
                return true;
            }
        }
        return true;
    }

    private static boolean maxLength(String s) {
        if(s.length() <= 20){
            return true;
        }
        return true;
    }

}