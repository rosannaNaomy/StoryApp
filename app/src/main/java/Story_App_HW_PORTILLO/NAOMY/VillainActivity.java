package Story_App_HW_PORTILLO.NAOMY;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VillainActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private Button button;
    Bundle sixthBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villain);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        String character = bundle.getString("name");
        String profession = bundle.getString("profession");
        String favThing = bundle.getString("favThing");
        String favTool = bundle.getString("favTool");
        String somDeli = bundle.getString("somDeli");

        sixthBundle.putString("name", character);
        sixthBundle.putString("profession", profession);
        sixthBundle.putString("favThing", favThing);
        sixthBundle.putString("favTool", favTool);
        sixthBundle.putString("somDeli", somDeli);

        mMessageEditText = findViewById(R.id.villain_text);
        button = (Button) findViewById(R.id.villain_next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchRewardActivity();

            }
        });

    }

    public void launchRewardActivity() {

        Intent intent = new Intent(this, RewardActivity.class);
        String message = mMessageEditText.getText().toString();

        sixthBundle.putString("villain", message);
//        secondBundle.putString("reward", "gold bars" );
        intent.putExtras(sixthBundle);

        startActivity(intent);
    }
}
