package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SomethingDeliciousActivity extends AppCompatActivity {




    private EditText mMessageEditText;
    private Button button;
    Bundle fifthBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_something_delicious);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String character = bundle.getString("name");
        String profession = bundle.getString("profession");
        String favThing = bundle.getString("favThing");
        String favTool = bundle.getString("favTool");

        fifthBundle.putString("name", character);
        fifthBundle.putString("profession", profession);
        fifthBundle.putString("favThing", favThing);
        fifthBundle.putString("favTool", favTool);

        mMessageEditText = findViewById(R.id.somDeli_text);
        button = (Button) findViewById(R.id.someDeli_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVillainActivity();

            }
        });

    }

    public void launchVillainActivity() {

        Intent intent = new Intent(this, VillainActivity.class);
        String message = mMessageEditText.getText().toString();

        fifthBundle.putString("somDeli", message);
        intent.putExtras(fifthBundle);

        startActivity(intent);
    }


}
