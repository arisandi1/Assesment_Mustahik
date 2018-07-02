package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Showmakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmakan);
    }
    public void back(View view) {
        Intent kembali = new Intent(Showmakan.this, BiayaMakan.class);
        startActivity(kembali);
    }
    public void next(View view) {
        Intent next = new Intent(Showmakan.this, Nonmakan.class);
        startActivity(next);
    }
}
