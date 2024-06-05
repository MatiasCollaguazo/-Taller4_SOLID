public class CloudServicePlatform {
    private CloudServiceProvider provider;

    public CloudServicePlatform(CloudServiceProvider provider) {
        this.provider = provider;
    }

    public void hostingTo(AppWeb app) {
        provider.connect();
        // Lógica adicional relacionada con el hosting
    }
}