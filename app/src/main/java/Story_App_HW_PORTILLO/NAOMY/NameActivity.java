package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent intent = getIntent();
        //find editText
        mMessageEditText = findViewById(R.id.name_text);

        button = (Button) findViewById(R.id.characte_next_buttom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchProfessionActivity();

            }
        });

    }

    public void launchProfessionActivity() {
        String inputCharacter = mMessageEditText.getText().toString();
        Intent intent = new Intent(this, ProfessionActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("name", inputCharacter);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
