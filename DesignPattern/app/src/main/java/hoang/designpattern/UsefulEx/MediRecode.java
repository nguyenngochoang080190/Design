package hoang.designpattern.UsefulEx;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.File;
import java.io.IOException;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/1/2016.
 */

public class MediRecode extends Fragment implements View.OnClickListener {
    Button ghi, stop, nghe;
    MediaRecorder mediaRecorder;
    MediaPlayer mediaPlayer;
    String out;
    String folder="myGiam";
    AudioManager audioManager;
    File file;
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b) {
        View view = inflater.inflate(R.layout.media_recoder, v, false);
        ghi = (Button) view.findViewById(R.id.ghiam);
        stop = (Button) view.findViewById(R.id.dung);
        nghe = (Button) view.findViewById(R.id.nghe);
        ghi.setOnClickListener(this);
        stop.setOnClickListener(this);
        nghe.setOnClickListener(this);
        mediaRecorder=new MediaRecorder();
        audioManager=(AudioManager) getContext().getSystemService(Context.AUDIO_SERVICE);
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        out= Environment.getExternalStorageDirectory().getAbsolutePath()+"/"+folder;
        mediaPlayer=new MediaPlayer();
        file=new File(out);
        if(!file.mkdir())
            file.mkdirs();
        mediaRecorder.setOutputFile(file.getPath()+"/"+"ghiam.3gp");
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.ghiam) {
            audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            try {
                mediaRecorder.prepare();
                mediaRecorder.start();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else if (view.getId() == R.id.dung) {
            mediaRecorder.stop();
            mediaRecorder.release();

        } else {
            try {
                mediaPlayer.setDataSource(file.getPath()+"/"+"ghiam.3gp");
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
