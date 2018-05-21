package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void formmustahik(View view) {
        Intent form = new Intent(Homepage.this, Datapripadi.class);
        startActivity(form);
    }
}
