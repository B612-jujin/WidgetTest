package kr.ac.kopo.widgettest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enable_clickable_test); // 이 친구가 중요하다.
        
       /* rg = findViewById(R.id.rg);



        Button button = (Button) findViewById(R.id.genderbtn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";

                int selectedId = rg.getCheckedRadioButtonId();
                if (selectedId == R.id.rb_female) {
                    result = getResources().getString(R.string.female);
                } else if (selectedId == R.id.rb_male) {
                    result = getResources().getString(R.string.male);
                }

                Toast toast = Toast.makeText(getApplicationContext(), result+"을 선택하셨습니다.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });*/

        //Button btn1 = (Button) findViewById(R.id.btn1);


    }
}