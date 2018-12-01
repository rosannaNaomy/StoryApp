package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FavoriteThingActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private Button button;
    Bundle thirdBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_thing);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String character = bundle.getString("name");
        String profession = bundle.getString("profession");

        thirdBundle.putString("name", character);
        thirdBundle.putString("profession", profession);

        mMessageEditText = findViewById(R.id.favThing_text);
        button = (Button) findViewById(R.id.favThing_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFavToolActivity();

            }
        });

    }

    public void launchFavToolActivity() {

        Intent intent = new Intent(this, FavoriteTool.class);
        String message = mMessageEditText.getText().toString();

        thirdBundle.putString("favThing", message);
        intent.putExtras(thirdBundle);

        startActivity(intent);
    }

}
