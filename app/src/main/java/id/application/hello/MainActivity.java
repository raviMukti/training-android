package id.application.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view){
        TextView textView = findViewById(R.id.txtMessage);
        EditText editText = findViewById(R.id.myNameText);
        String userName = "User";
        userName = editText.getText().toString();
        textView.setText("Hello "+userName+" Selamat Belajar Android");
    }
}