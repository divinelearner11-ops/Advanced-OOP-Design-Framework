public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        AnnotationProcessor.processImportant(service);

        System.out.println("\nDirect call to status() (not @Important, not invoked by processor):");
        System.out.println("  " + service.status());
    }
}
