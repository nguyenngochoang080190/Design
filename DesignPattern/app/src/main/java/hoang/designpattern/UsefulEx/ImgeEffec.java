package hoang.designpattern.UsefulEx;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/2/2016.
 */

public class ImgeEffec extends Fragment implements View.OnClickListener {
    Bitmap bitmap;
    ImageView imageView;
    double red = 0.33;
    double green = 0.59;
    double blue = 0.11;
    Button but;

    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.image_effec, v, false);
        imageView = (ImageView) view.findViewById(R.id.image);
        but = (Button) view.findViewById(R.id.gray);

        but.setOnClickListener(this);
        return view;
    }

    public void setGray() {
        int r, b, g, alpha;
        BitmapDrawable dr = (BitmapDrawable) imageView.getDrawable();
        bitmap = dr.getBitmap();
        Bitmap gray = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        for (int i = 0; i < bitmap.getWidth(); i++) {
            for (int j = 0; j < bitmap.getHeight(); ++j) {
                int e = bitmap.getPixel(i, j);
                r = Color.red(e);
                b = Color.blue(e);
                g = Color.green(e);
                alpha = Color.alpha(e);
                b = 0;
                g = 0;

                gray.setPixel(i, j, Color.argb(alpha, r, b, g));

            }
            imageView.setImageBitmap(gray);
        }

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.gray) {
            Log.v("HH", "Click");
            setGray();
            save();
        }
    }
    public void save()
    {
        String filename="anh.jpg";
        File file= new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+"MyImage");
        File file1=new File(file,filename);
        if(!file.mkdir())
            file.mkdirs();
        try {
            FileOutputStream outputStream=new FileOutputStream(file1);
            BitmapDrawable bitmapDrawable=(BitmapDrawable) imageView.getDrawable();
            Bitmap bitmap=bitmapDrawable.getBitmap();
            bitmap.compress(Bitmap.CompressFormat.PNG,100,outputStream);
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2= new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+"MyImage","text.txt");
        try {
            FileOutputStream out1=new FileOutputStream(file2);
            out1.write("hoang yeu ha".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
