package hoang.designpattern.UsefulEx;

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/1/2016.
 */

public class Animation extends Fragment  implements View.OnTouchListener {
    ScaleGestureDetector scaleGestureDetector;
    float scale = 1f;
    Matrix max;

    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.animation, v, false);
        final ImageView imageView = (ImageView) view.findViewById(R.id.image);
        final android.view.animation.Animation ani = AnimationUtils.loadAnimation(getContext(), R.anim.image_anim);
        max = new Matrix();
        scaleGestureDetector = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() {

            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                scale *= detector.getScaleFactor();
                scale = Math.max(0.1f, Math.min(scale, 5.0f));
                max.setScale(scale, scale);
                imageView.setImageMatrix(max);
                return true;
            }
        });
        view.setOnTouchListener(this);
        return view;
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.v("HH","" +motionEvent.getX()+"     "+motionEvent.getY());
        return true;
    }
}
