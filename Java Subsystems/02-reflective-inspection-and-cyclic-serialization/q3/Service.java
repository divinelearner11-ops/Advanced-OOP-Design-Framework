public class Service {

    @Important
    public String start() {
        return "Service started";
    }

    @Important
    public String stop() {
        return "Service stopped";
    }

    public String status() {
        return "Service is running";
    }
}
