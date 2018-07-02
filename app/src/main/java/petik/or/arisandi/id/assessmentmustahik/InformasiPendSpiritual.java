package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InformasiPendSpiritual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informasi_pend_spiritual);
    }
    public void simpan(View view) {
        Intent simpan = new Intent(InformasiPendSpiritual.this, ShowInfoSpiritual.class);
        startActivity(simpan);
    }
}
