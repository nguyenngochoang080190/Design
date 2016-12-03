package hoang.designpattern.UsefulEx.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/2/2016.
 */

public class CustomView extends View implements View.OnTouchListener {
    Paint paint;
    ArrayList<Point> list;
    public CustomView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.parseColor("#ff0088"));
        paint.setStrokeWidth(3);
        list = new ArrayList<>();
        setOnTouchListener(this);
    }

    public CustomView(Context context, AttributeSet attt) {
        super(context, attt);
        paint = new Paint();
        paint.setColor(Color.parseColor("#ff0088"));
        paint.setStrokeWidth(3);
        list = new ArrayList<>();

    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Point p : list
                ) {
            canvas.drawCircle(p.x, p.y, 50, paint);
        }
    }

    public void update(ArrayList<Point> p) {
        list = p;
        invalidate();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int pointIndex = event.getActionIndex();
        int pointId = event.getPointerId(pointIndex);
        int mask = event.getActionMasked();
        switch (mask) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_POINTER_DOWN:
                Point p = new Point();
                p.x = (int) event.getX(pointIndex);
                p.y = (int) event.getY(pointIndex);
                list.add(p);
                break;
            case MotionEvent.ACTION_MOVE:
                for (int size = event.getPointerCount(), i = 0; i < size; i++) {
                    Point point = list.get(event.getPointerId(i));
                    if (point != null) {
                        point.x = (int) event.getX(i);
                        point.y = (int) event.getY(i);
                    }
                }
                break;

        }
        invalidate();
        return true;
    }
}
