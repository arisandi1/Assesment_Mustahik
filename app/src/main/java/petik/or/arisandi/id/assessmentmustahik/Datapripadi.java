package petik.or.arisandi.id.assessmentmustahik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Datapripadi extends AppCompatActivity {
    EditText no_id = (EditText) findViewById(R.id.nomor_identitas);
    String nomor_id = String.valueOf(no_id.getText());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datapripadi);
    }
    public void simpan(View view) {
        Intent simpan = new Intent(Datapripadi.this, showpribadi.class);
        startActivity(simpan);
        simpan.putExtra("untuk no id", nomor_id);

    }



}
