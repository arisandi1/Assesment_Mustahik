package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DataFisikRumah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_fisik_rumah);
    }
    public void simpan(View view) {
        Intent simpan = new Intent(DataFisikRumah.this, Showfisikrumah.class);
        startActivity(simpan);
    }
}
