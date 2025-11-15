public class Loader implements Runnable {
    public void run() {
        System.out.println("Loading.....");
        try { Thread.sleep(1000); } catch (Exception e) {}
    }
}
