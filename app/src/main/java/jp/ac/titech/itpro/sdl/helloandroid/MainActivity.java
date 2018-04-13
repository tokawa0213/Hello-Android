package jp.ac.titech.itpro.sdl.helloandroid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView outputView;
    private EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputView = findViewById(R.id.output_view);
        inputName = findViewById(R.id.input_name);
    }
    public void greet(View v) {
        String name = inputName.getText().toString().trim();
        if (name.length() > 0) {
            outputView.setText("Hello " + name + "!\nNice to see you!");
        }
    }
}