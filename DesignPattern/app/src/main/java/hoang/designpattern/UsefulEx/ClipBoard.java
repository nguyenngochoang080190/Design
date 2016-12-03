package hoang.designpattern.UsefulEx;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

import hoang.designpattern.R;

/**
 * Created by Administrator on 12/1/2016.
 */

public class ClipBoard extends Fragment implements View.OnClickListener {
    ClipboardManager manager;
    ClipData data;
    EditText ed;
    TextView tv;
    Button b1,b2;
    TextToSpeech textToSpeech;
    public View onCreateView(LayoutInflater inflater, ViewGroup v, Bundle b)
    {
        View view=inflater.inflate(R.layout.clip_bord,v,false);
        ed=(EditText) view.findViewById(R.id.et);
        tv=(TextView) view.findViewById(R.id.tv);
        b1=(Button) view.findViewById(R.id.btco);
        b2=(Button) view.findViewById(R.id.btp);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        manager=(ClipboardManager)  getContext().getSystemService(Context.CLIPBOARD_SERVICE);
//        Typeface ty=Typeface.createFromAsset(getContext().getAssets(),"font/Ministry Script.ttf");
//        ed.setTypeface(ty);
        textToSpeech=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                textToSpeech.setLanguage(Locale.ENGLISH);
            }
        });
        return view;
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btco)
        {
            manager.setText(ed.getText());
            ed.setText(ed.getText()+" "+"hello hello hello hello");
            textToSpeech.speak(ed.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
        }
        else
        {
            ClipData date=manager.getPrimaryClip();
            tv.setText(date.getItemAt(0).getText());
        }
    }
}
