package com.android.kocsistem.jvsk.singleton;

public final class JSingleton {

  private static volatile JSingleton INSTANCE;

  private JSingleton() {
    // Empty const
  }

  public static synchronized JSingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (JSingleton.class) {
        INSTANCE = new JSingleton();
      }
    }

    return INSTANCE;
  }
}
