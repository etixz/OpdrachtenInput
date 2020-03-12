package eb.egonb.opdrachteninput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnOmzetten;
    private EditText etBedragOmgezet;
    private EditText etBedrag;
    private TextInputLayout ilBedrag;

    private View.OnClickListener omzettenListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String text = etBedrag.getText().toString();
            double textNaarDouble = Double.valueOf(text);

            textNaarDouble *= 1.09;

            etBedragOmgezet.setText(String.format("$%.2f", textNaarDouble));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //verwijzen componenten in UI
        btnOmzetten = findViewById(R.id.btn_omzetten);
        etBedragOmgezet = findViewById(R.id.et_omgezetBedrag);
        etBedrag = findViewById(R.id.et_bedrag);
        ilBedrag = findViewById(R.id.il_bedrag);

        btnOmzetten.setOnClickListener(omzettenListener);

    }
}
