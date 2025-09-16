package com.example.nativelibteste

class NativeLib {

    /**
     * A native method that is implemented by the 'nativelibteste' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'nativelibteste' library on application startup.
        init {
            System.loadLibrary("nativelibteste")
        }
    }
}