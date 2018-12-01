package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FavoriteTool extends AppCompatActivity {


    private EditText mMessageEditText;
    private Button button;
    Bundle fourthBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_tool);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String character = bundle.getString("name");
        String profession = bundle.getString("profession");
        String favThing = bundle.getString("favThing");

        fourthBundle.putString("name", character);
        fourthBundle.putString("profession", profession);
        fourthBundle.putString("favThing", favThing);

        mMessageEditText = findViewById(R.id.favTool_text);
        button = (Button) findViewById(R.id.favTool_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSomDeliActivity();

            }
        });

    }

    public void launchSomDeliActivity() {

        Intent intent = new Intent(this, SomethingDeliciousActivity.class);
        String message = mMessageEditText.getText().toString();

        fourthBundle.putString("favTool", message);
        intent.putExtras(fourthBundle);

        startActivity(intent);
    }

}
