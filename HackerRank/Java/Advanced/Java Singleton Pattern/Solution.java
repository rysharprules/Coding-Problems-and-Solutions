import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

// TAG: singleton
class Singleton {

    public static final Singleton INSTANCE = new Singleton();
    public String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return INSTANCE;
    }

}

// for multithreaded systems we need to acquire a lock (synchronize) when creating the instance
class SingletonForMultiThreaded {
    private volatile static Singleton instance;
    public static String str;
    private Singleton() {}

    static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // lazy initialization
                }
            }
        }
        return instance;
    }

}

// as above but more concise
class Singleton{
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

// as above but even more concise - recommended by J. Bloch in Essential Java (alternatively use a framework to
// handle dependencies via Dependency Injection (DI), e.g. Spring
enum SingletonAsEnum {
    INSTANCE;

    public static getInstance() {
        return INSTANCE;
    }
}