package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BiayaMakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biaya_makan);
    }
    public void simpan(View view) {
        Intent simpan = new Intent(BiayaMakan.this, Showmakan.class);
        startActivity(simpan);
    }
}
