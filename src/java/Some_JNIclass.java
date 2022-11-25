public class Some_JNIclass {

    public String getstringvalue(int x) {
        if (x > 0) {
            return "hey";
        }
        return "hi";
    }
    public Some_JNIclass() {
        System.loadLibrary("nativelib");
    }

    static {
        System.loadLibrary("nativelib");
    }

    public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
        System.loadLibrary("nativelib");
    }
}