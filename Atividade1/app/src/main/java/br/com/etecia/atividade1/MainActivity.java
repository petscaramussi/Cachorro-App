package br.com.etecia.atividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConfirmar = findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtIdade = findViewById(R.id.txtIdade);
                TextView tvMessage = findViewById(R.id.tvMessage);
                String Idade = txtIdade.getText().toString();

                //calculo da idade equivalente

                int result;
                result = Integer.parseInt(Idade) * 7;


                //mensagem final
                tvMessage.setText("A idade do seu cachorro é equivalente a: "+ result + " anos de sua idade.");



            }
        });
    }
}
