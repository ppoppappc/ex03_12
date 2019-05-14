package tku.cs2c.ex03_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private TextView mTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView1 = (TextView)findViewById(R.id.mTextView1);
        mButton1 = (Button) findViewById(R.id.myButton1);
        mButton1.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(R.string.app_about)
                        .setMessage(R.string.app_about_msg)
                        .setPositiveButton(R.string.str_ok,
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialoginterface, int i)
                                    {
                                        /* do something here */
                                        mTextView1.setText("Change");
                                    }
                                }
                        ).show();
            }
        });

    }
}
