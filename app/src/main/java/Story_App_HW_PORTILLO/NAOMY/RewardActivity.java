package Story_App_HW_PORTILLO.NAOMY;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RewardActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private Button button;
    Bundle seventhBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String character = bundle.getString("name");
        String profession = bundle.getString("profession");
        String favThing = bundle.getString("favThing");
        String favTool = bundle.getString("favTool");
        String somDeli = bundle.getString("somDeli");
        String villain = bundle.getString("villain");

        seventhBundle.putString("name", character);
        seventhBundle.putString("profession", profession);
        seventhBundle.putString("favThing", favThing);
        seventhBundle.putString("favTool", favTool);
        seventhBundle.putString("somDeli", somDeli);
        seventhBundle.putString("villain", villain);

        mMessageEditText = findViewById(R.id.reward_text);
        button = (Button) findViewById(R.id.reward_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchFinalActivity();

            }
        });

    }

    public void launchFinalActivity() {

        Intent intent = new Intent(this, FinalStoryActivity.class);
        String message = mMessageEditText.getText().toString();

        seventhBundle.putString("reward", message);
        intent.putExtras(seventhBundle);

        startActivity(intent);
    }
}
