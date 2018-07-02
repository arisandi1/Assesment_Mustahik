package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TentangPeTIK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_pe_tik);
    }

    public void back(View view) {
        Intent kembali = new Intent(TentangPeTIK.this, Homepage.class);
        startActivity(kembali);
    }
}
