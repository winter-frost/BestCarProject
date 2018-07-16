package car.src;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class SelectInstructions extends AppCompatActivity
{
    private ImageButton btnForward, btnLeft, btnRight, btnBackward;
    private Button btnSubmitPaces, btnGo, btnCancel;
    private EditText noOfPacesFld;
    private TextView txtNoOfPaces;
    private View popupView;
    private String commandString = "";
    private char newDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_instructions);

        btnForward = findViewById(R.id.btnForward);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        btnBackward = findViewById(R.id.btnBack);
        noOfPacesFld = findViewById(R.id.fldNoOfPaces);
        btnSubmitPaces = findViewById(R.id.btnSubmitMove);
        txtNoOfPaces = findViewById(R.id.txtHowMany);
        popupView = findViewById(R.id.addPopup);
        btnGo = findViewById(R.id.btnGo);
        btnCancel = findViewById(R.id.btnCancelEnteringPaces);

        //Set appropriate elements visible when the forwards button is clicked
        btnForward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                newDirection = GenerateCommands.FORWARDS;
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the backwards button is clicked
        btnBackward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                newDirection = GenerateCommands.BACKWARDS;
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the left button is clicked
        btnLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                newDirection = GenerateCommands.LEFT;
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the right button is clicked
        btnRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                newDirection = GenerateCommands.RIGHT;
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
                btnCancel.setVisibility(View.VISIBLE);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.INVISIBLE);
                noOfPacesFld.setVisibility(View.INVISIBLE);
                noOfPacesFld.setText("");
                popupView.setVisibility(View.INVISIBLE);
                btnSubmitPaces.setVisibility(View.INVISIBLE);
                btnCancel.setVisibility(View.INVISIBLE);
            }
        });

        //Set appropriate elements invisible when the submit paces button is clicked
        btnSubmitPaces.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (noOfPacesFld.getText().toString() != null && noOfPacesFld.getText().toString() != "0") {
                    txtNoOfPaces.setVisibility(View.INVISIBLE);
                    noOfPacesFld.setVisibility(View.INVISIBLE);
                    popupView.setVisibility(View.INVISIBLE);
                    btnSubmitPaces.setVisibility(View.INVISIBLE);
                    btnCancel.setVisibility(View.INVISIBLE);
                    int noOfMoves = Integer.valueOf(noOfPacesFld.getText().toString());
                    switch (newDirection) {
                        case GenerateCommands.FORWARDS:
                            GenerateCommands.goForwards(commandString, noOfMoves);
                        case GenerateCommands.BACKWARDS:
                            GenerateCommands.goBackwards(commandString, noOfMoves);
                        case GenerateCommands.LEFT:
                            GenerateCommands.goLeft(commandString, noOfMoves);
                        case GenerateCommands.RIGHT:
                            GenerateCommands.goRight(commandString, noOfMoves);
                    }
                }
            }
        });

        btnGo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),CarRunning.class);
//                startActivity(i);
                Thread thread = new Thread(new Runnable() {
                    public void run()
                    {
                        // code goes here.
                    }});
                thread.start();
            }
        });
    }
}