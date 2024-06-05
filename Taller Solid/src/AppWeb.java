public class AppWeb {
    private AuthenticationService authenticationService;
    private DatabaseService databaseService;

    public AppWeb(AuthenticationService authenticationService, DatabaseService databaseService) {
        this.authenticationService = authenticationService;
        this.databaseService = databaseService;
    }

    public void authenticateUser(User user) {
        authenticationService.authenticate(user);
    }

    public void connectToDatabase() {
        databaseService.connectToDatabase();
    }
}