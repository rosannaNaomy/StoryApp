package Story_App_HW_PORTILLO.NAOMY;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalStoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_story);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.story_view);
        // textView.setText(message);

        Bundle bundle = intent.getExtras();
        String message = getString(R.string.story_p1) + bundle.getString("profession") + " " + bundle.getString("name")
                + getString(R.string.story_p2) + bundle.get("somDeli") + getString(R.string.story_p3)
                + bundle.getString("villain") + getString(R.string.story_p4) + bundle.getString("name")
                + getString(R.string.story_p5) + bundle.getString("favThing") + getString(R.string.story_p6)
                + bundle.getString("profession") + getString(R.string.story_p7) + bundle.getString("favTool")
                + getString(R.string.story_p8) + bundle.getString("villain") + getString(R.string.story_p9)
                + bundle.getString("reward") + getString(R.string.story_p10);

        textView.setText(message);
    }
}
