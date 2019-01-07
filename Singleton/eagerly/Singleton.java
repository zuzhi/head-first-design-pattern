public class Singleton {

  /**
   * Move to an eagerly created instance rather than a lazily created
   * one.
   */
  private static Singleton uniqueInstance = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return uniqueInstance;
  }

  public static void main(String[] args) {
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
  }
}
