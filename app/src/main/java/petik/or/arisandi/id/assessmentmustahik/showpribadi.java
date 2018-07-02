package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class showpribadi extends AppCompatActivity {

    TextView nama = (TextView) findViewById(R.id.nama);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showpribadi);
    }
    public void back(View view) {
        Intent kembali = new Intent(showpribadi.this, Datapripadi.class);
        startActivity(kembali);
    }
    public void next(View view) {
        Intent next = new Intent(showpribadi.this, Datakeluarga.class);
        startActivity(next);

        Bundle extras = getIntent().getExtras();
        nama.setText(extras.getString("untuk no id"));

    }


}
