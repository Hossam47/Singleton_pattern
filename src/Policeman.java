public class Policeman extends Thread {

    private String threadName;

    public Policeman(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        System.out.println("Thread "+threadName+" current OB "+PersonalCardSingleton.getInstance());
    }
}
