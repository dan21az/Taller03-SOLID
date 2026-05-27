public class LogIn {

    private MySQLUser mysql;

    public void log (User user) {
        System.out.println("Has access to the website");
        mysql.insertUserInDatabase(user);;
        // Logic
    }
}

