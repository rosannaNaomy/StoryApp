package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfessionActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private Button button;
    Bundle secondBundle = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profession);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String message = bundle.getString("name");

        secondBundle.putString("name", message);

        mMessageEditText = findViewById(R.id.profession_text);
        button = (Button) findViewById(R.id.profession_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFavThingActivity();

            }
        });

    }

    public void launchFavThingActivity() {

        Intent intent = new Intent(this, FavoriteThingActivity.class);
        String message = mMessageEditText.getText().toString();

        secondBundle.putString("profession", message);
        intent.putExtras(secondBundle);

        startActivity(intent);
    }
}
