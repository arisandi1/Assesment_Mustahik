package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowInfoSpiritual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_info_spiritual);
    }
    public void back(View view) {
        Intent kembali = new Intent(ShowInfoSpiritual.this, InformasiPendSpiritual.class);
        startActivity(kembali);
    }
    public void next(View view) {
        Intent next = new Intent(ShowInfoSpiritual.this, HasilSurvey.class);
        startActivity(next);
    }
}
