public class AppWeb {
    private AuthenticationService authenticationService;
    private DatabaseService databaseService;
    private Database database;

    public AppWeb(AuthenticationService authenticationService, DatabaseService databaseService, Database database) {
        this.authenticationService = authenticationService;
        this.databaseService = databaseService;
        this.database = database;
    }

    public void authenticateUser(User user) {
        authenticationService.authenticate(user);
    }

    public void connectToDatabase() {
        databaseService.connectToDatabase();
    }

    public AppWeb(Database database) {
        this.database = database;
    }
}