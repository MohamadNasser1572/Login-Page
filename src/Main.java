public class Main {
    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        @SuppressWarnings({
                "unused",
                "unchecked"})
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}
