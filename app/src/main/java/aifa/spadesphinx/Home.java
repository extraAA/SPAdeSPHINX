package aifa.spadesphinx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity implements View.OnClickListener{

    Button app;
// second change
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        app = findViewById(R.id.button4);
        app.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (app==view){
            Intent i = new Intent(Home.this, SignUp.class);
            startActivity(i);
            finish();
        }
    }
}
