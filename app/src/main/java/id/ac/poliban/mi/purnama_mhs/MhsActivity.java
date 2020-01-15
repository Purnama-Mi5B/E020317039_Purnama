package id.ac.poliban.mi.purnama_mhs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

        EditText edYourNim = findViewById(R.id.edNim);
        EditText edYourNama = findViewById(R.id.edNama);
        EditText edYourAlamat = findViewById(R.id.edAlamat);
        EditText edYourTelp = findViewById(R.id.edTelp);
        Button btSend = findViewById(R.id.btSend);


        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String dataNim = edYourNim.getText().toString();
            String dataNama = edYourNama.getText().toString();
            String dataAlamat = edYourAlamat.getText().toString();
            String dataTelp = edYourTelp.getText().toString();

            intent.putExtra("datanim", dataNim);
            intent.putExtra("datanama", dataNama);
            intent.putExtra("dataalamat", dataAlamat);
            intent.putExtra("datatelp", dataTelp);

            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}