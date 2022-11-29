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
         System.loadLibrary("nativelib");
         System.loadLibrary("nativelib");
         System.loadLibrary("nativelib");
         System.loadLibrary("nativelib");
         System.loadLibrary("nativelib");
        System.loadLibrary("nativelib");
        System.loadLibrary("nativelib");
        System.loadLibrary("nativelib");
    }
    
    
    public boolean getCategoryId() {
        try {
            String txtA = "Category";
            boolean flag = false;
            if (categoryid > 0)
                flag = true;
            return flag;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
