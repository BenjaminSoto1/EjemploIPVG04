package benjaaa.cl.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button btaceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btaceptar=(Button) findViewById(R.id.btAceptar);
        Intent intent= new Intent(this,MainActivity2.class);
        btaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(intent);

            }
        });





    }
}