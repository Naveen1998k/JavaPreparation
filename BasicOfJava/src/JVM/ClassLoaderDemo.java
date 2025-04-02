package JVM;

public class ClassLoaderDemo {

    public static void main(String[] args) {
        // Bootstrap ClassLoader
        System.out.println(String.class.getClassLoader());
        // Extension ClassLoader
       // System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader());
        // Application ClassLoader
        System.out.println(ClassLoaderDemo.class.getClassLoader().getName());
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent().getName());

        //Platform ClassLoader
        System.out.println(ClassLoader.getPlatformClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
    }
}
