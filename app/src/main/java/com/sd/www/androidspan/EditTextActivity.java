package com.sd.www.androidspan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sd.lib.span.FImageSpan;
import com.sd.lib.span.view.FSpannableEditText;

/**
 * Created by Administrator on 2017/7/18.
 */
public class EditTextActivity extends AppCompatActivity
{
    private FSpannableEditText et;
    private Button btn_add, btn_remove;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_edittext);
        et = findViewById(R.id.et);
        btn_add = findViewById(R.id.btn_add);
        btn_remove = findViewById(R.id.btn_remove);

        btn_add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FImageSpan span = new FImageSpan(getApplicationContext(), R.drawable.face);
                et.insertSpan(span, "face"); //插入span
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.removeSpan(); //删除span
            }
        });
    }
}
