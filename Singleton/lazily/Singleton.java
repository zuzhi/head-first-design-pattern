public class Singleton {

  private static Singleton uniqueInstance;

  private Singleton() {
  }

  /**
   * By adding the synchronized keyword to getInstance(), we force every
   * thread to wait its turn before it can enter the method. That is, no
   * two threads may enter the method at the same time.
   * But synchronization is expensive. And the only synchronization is
   * relevant is the first time through this method.
   */
  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
      return uniqueInstance;
    } else {
      return uniqueInstance;
    }
  }

  public static void main(String[] args) {
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
  }
}
