package a.finalexamapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r;
    int a;
    int b;

    private TextView header;
    private TextView txt;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private EditText ed;
    private EditText ed2;
    private EditText ed3;
    private Button bt;
    private Button bt2;
    private ImageView st1;
    private ImageView st2;
    private ImageView st3;

    int ans1= 0;
    int ans2=0;
    int ans3=0;
    int score;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        header = (TextView) findViewById(R.id.header);
        txt = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView3);
        txt4 = (TextView) findViewById(R.id.textView4);
        ed = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        bt = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button2);
        st1 = (ImageView) findViewById(R.id.imageView);
        st2 = (ImageView) findViewById(R.id.imageView2);
        st3 = (ImageView) findViewById(R.id.imageView3);

        st1.setVisibility(View.GONE);
        st2.setVisibility(View.GONE);
        st2.setVisibility(View.GONE);


        Button.OnClickListener btl = new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                score=0;
                 if(ans1 == (a+b)) {score++;  st1.setVisibility(View.VISIBLE);}
                 if (ans2== (a-b)) {score++;  st2.setVisibility(View.VISIBLE);}
                 if (ans3 == (a*b)) {score++; st3.setVisibility(View.VISIBLE);}

                 txt4.setText("You got " +score +" out of 3 right!");



             }
         };

        Button.OnClickListener btl2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newnum();

            }
        };
        bt.setOnClickListener(btl);
        bt2.setOnClickListener(btl2);
        ed.addTextChangedListener(tx1watch);
        ed2.addTextChangedListener(tx2watch);
        ed3.addTextChangedListener(tx3watch);

        newnum();






    }

    private TextWatcher tx1watch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            ans1 = Integer.parseInt(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {


        }
    };

    private TextWatcher tx2watch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ans2 = Integer.parseInt(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        };

        private TextWatcher tx3watch = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                ans3 = Integer.parseInt(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        }   ;

private void newnum(){
    Random r = new Random();
    int a = r.nextInt(11);
    int b = r.nextInt(11);


    txt.setText(a+ " +  "+b);
    txt2.setText(a+"  -  "+b);
    txt3.setText(a+"  x  "+b);
    txt4.setText(" ");

    st1.setVisibility(View.GONE);
    st2.setVisibility(View.GONE);
    st3.setVisibility(View.GONE);
}

    private void setscore()
    {

    }


}

