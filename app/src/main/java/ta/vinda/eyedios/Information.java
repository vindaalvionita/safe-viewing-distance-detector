package ta.vinda.eyedios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity {

    Button btn_ind, btn_eng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        btn_ind=(Button) findViewById(R.id.btn_ind);
        btn_ind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Information.this,InformationInd.class);
                startActivity(i);
            }
        });

        btn_eng=(Button) findViewById(R.id.btn_eng);
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Information.this,InformationEng.class);
                startActivity(i);
            }
        });
    }
}