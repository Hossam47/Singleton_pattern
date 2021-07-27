public class PersonalCardSingleton {

    private static PersonalCardSingleton personalCardSingleton;

    private PersonalCardSingleton() {
    }

    public static PersonalCardSingleton getInstance() {

        synchronized (PersonalCardSingleton.class) {

            if (personalCardSingleton == null) {

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                personalCardSingleton = new PersonalCardSingleton();
            }

        }
        return personalCardSingleton;
    }
}
