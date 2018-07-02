package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HasilSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_survey);
    }
    public void back(View view) {
        Intent kembali = new Intent(HasilSurvey.this, Datapripadi.class);
        startActivity(kembali);
    }

}
