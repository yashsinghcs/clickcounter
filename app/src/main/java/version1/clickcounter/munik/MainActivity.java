package version1.clickcounter.munik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    Button btnclick;
    Button btnreset;
    TextView count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclick = (Button) findViewById(R.id.button);
        btnreset=(Button) findViewById(R.id.button2);
        count = (TextView) findViewById(R.id.textView);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String count1=count.getText().toString();
                int countint=Integer.parseInt(count1);
                countint++;
                count.setText(String.valueOf(countint));
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String count1=count.getText().toString();
                int countint=Integer.parseInt(count1);
                countint=0;
                count.setText(String.valueOf(countint));

            }
        });
    }
}