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

    public void biodata(View view) {
        Intent biodata = new Intent(Homepage.this, TentangPengembang.class);
        startActivity(biodata);
    }

    public void formmustahik(View view) {
        Intent form = new Intent(Homepage.this, Datapripadi.class);
        startActivity(form);
    }

    public void petik(View view) {
        Intent petik = new Intent(Homepage.this, TentangPeTIK.class);
        startActivity(petik);
    }
}
