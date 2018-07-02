package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TentangPengembang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang_pengembang);
    }

    public void back(View view) {
        Intent kembali = new Intent(TentangPengembang.this, Homepage.class);
        startActivity(kembali);
    }
}
