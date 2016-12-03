package hoang.designpattern.UsefulEx;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.io.IOException;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/2/2016.
 */

public class MyTextureView extends Fragment implements TextureView.SurfaceTextureListener {
    TextureView textureView;
    Camera mCamera;
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view=inflater.inflate(R.layout.texture_view,v,false);
        textureView=(TextureView) view.findViewById(R.id.textureview);
        textureView.setSurfaceTextureListener(this);
        return view;
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i1) {
        mCamera=Camera.open();
        Camera.Size size=mCamera.getParameters().getPreviewSize();

        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(size.width,size.height);
        textureView.setLayoutParams(params);
        textureView.setRotation(90.0f);
        try {
            mCamera.setPreviewTexture(surfaceTexture);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mCamera.startPreview();

    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i1) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mCamera.stopPreview();
        mCamera.release();
        return true;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {

    }
}
