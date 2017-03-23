package com.example.keith.qrcodescanner;


import android.graphics.Bitmap;


interface Get_String_Callback {
    public abstract void done(String returned_string);
}

interface Get_Bitmap_Callback {
    public abstract void done(Bitmap returned_bitmap);
}
