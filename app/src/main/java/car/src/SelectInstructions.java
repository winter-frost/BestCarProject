package car.src;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectInstructions extends AppCompatActivity
{
    private ImageButton btnForward, btnLeft, btnRight, btnBackward;
    private Button btnSubmitPaces;
    private EditText noOfPacesFld;
    private TextView txtNoOfPaces;
    private View popupView;

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

        //Set appropriate elements visible when the backwards button is clicked
        btnForward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the backwards button is clicked
        btnBackward.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the left button is clicked
        btnLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements visible when the right button is clicked
        btnRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.VISIBLE);
                noOfPacesFld.setVisibility(View.VISIBLE);
                popupView.setVisibility(View.VISIBLE);
                btnSubmitPaces.setVisibility(View.VISIBLE);
            }
        });

        //Set appropriate elements invisible when the submit paces button is clicked
        btnSubmitPaces.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txtNoOfPaces.setVisibility(View.INVISIBLE);
                noOfPacesFld.setVisibility(View.INVISIBLE);
                popupView.setVisibility(View.INVISIBLE);
                btnSubmitPaces.setVisibility(View.INVISIBLE);
            }
        });
    }
}
