public class Singleton {

  /**
   * The volatile keyword ensures that multiple threads handle the
   * uniqueInstance variable correctly when it is being initialized to
   * the Singleton instance.
   */
  private volatile static Singleton uniqueInstance;

  private Singleton() {
  }

  /**
   * Use "double-checked locking" to reduce the use of synchronization
   * in getInstance().
   */
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      // Check for an instance and if there isn't one, enter a
      // synchronized block.
      // Note we only synchronize the first time through!
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          // Once in the block, check again and if still null, create an
          // instance.
          uniqueInstance = new Singleton();
        }
      }
    }
    return uniqueInstance;
  }

  public static void main(String[] args) {
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
  }
}
