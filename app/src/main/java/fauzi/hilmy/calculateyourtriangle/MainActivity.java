package fauzi.hilmy.calculateyourtriangle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAlas, etTinggi;
    Button btnSubmit;
    TextView lblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAlas = (EditText)findViewById(R.id.etAlas);
        etTinggi = (EditText)findViewById(R.id.etTinggi);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        lblHasil = (TextView)findViewById(R.id.lblhasil);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aAlas = etAlas.getText().toString();
                String aTinggi = etTinggi.getText().toString();

                if (aAlas.isEmpty()) {
                    etAlas.setError("Fill This Column!!");
                }else if (aTinggi.isEmpty()){
                    etTinggi.setError("Fill This Column!!");
                }else{
                    int nAlas = Integer.parseInt(aAlas);
                    int nTinggi = Integer.parseInt(aTinggi);

                    int Luas = (nAlas * nTinggi) / 2;

                    lblHasil.setText("The Wide Of Your Triangle is " + Luas + " cm2");
                }
            }
        });
    }
}
