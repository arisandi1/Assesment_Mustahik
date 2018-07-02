package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shownonmakan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shownonmakan);
    }
    public void back(View view) {
        Intent kembali = new Intent(Shownonmakan.this, Nonmakan.class);
        startActivity(kembali);
    }
    public void next(View view) {
        Intent next = new Intent(Shownonmakan.this, showjmlmkn.class);
        startActivity(next);
    }
}
