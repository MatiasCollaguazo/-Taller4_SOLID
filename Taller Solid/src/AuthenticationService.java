public class AuthenticationService {
    private LogIn logIn;
    private LogInAdmin logInAdmin;

    public AuthenticationService(LogIn logIn, LogInAdmin logInAdmin) {
        this.logIn = logIn;
        this.logInAdmin = logInAdmin;
    }

    public void authenticate(User user) {
        logIn.log(user);
        logInAdmin.log(user);
        // Lógica adicional de autenticación
    }
}