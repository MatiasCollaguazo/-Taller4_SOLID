public class LogInAdmin extends LogIn {
    @Override
    public void log(User user) {
        super.log(user);
        if (verifyIfTheUserIsAdmin(user)) {
            System.out.println("Has access to the website in admin mode");
            // Lógica adicional para administradores
        }
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Verificar si el usuario es administrador
        return true;
    }
}