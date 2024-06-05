public class LogIn {
    public void log(User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Lógica
    }

    protected void insertUserInDatabase(User user) {
        // Insertar usuario en la base de datos
    }
}