package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Datakeluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datakeluarga);
    }
    public void simpan(View view) {
        Intent simpan = new Intent(Datakeluarga.this, ShowKeluarga.class);
        startActivity(simpan);
    }
}
