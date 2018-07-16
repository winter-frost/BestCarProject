package car.src;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarRunning extends AppCompatActivity {

    private Button btnAbort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_running);

        btnAbort = findViewById(R.id.btnAbort);

        btnAbort.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),SelectInstructions.class);
                startActivity(i);
            }
        });
    }
}
