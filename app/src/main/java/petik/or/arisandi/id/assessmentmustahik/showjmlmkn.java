package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class showjmlmkn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showjmlmkn);
    }
    public void back(View view) {
        Intent kembali = new Intent(showjmlmkn.this, Jmlmknnonmkn.class);
        startActivity(kembali);
    }
    public void next(View view) {
        Intent next = new Intent(showjmlmkn.this, DataKonfirmasi.class);
        startActivity(next);
    }
}
