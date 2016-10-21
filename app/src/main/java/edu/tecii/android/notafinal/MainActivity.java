package edu.tecii.android.notafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText PA1,PA2,PA3,PA4,PB1,PB2,PB3,PB4;
private TextView Res;
private Button Boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PA1=(EditText)findViewById(R.id.txtPA1);
        PA2=(EditText)findViewById(R.id.txtPA2);
        PA3=(EditText)findViewById(R.id.txtPA3);
        PA4=(EditText)findViewById(R.id.txtPA4);
        PB1=(EditText)findViewById(R.id.txtPB1);
        PB2=(EditText)findViewById(R.id.txtPB2);
        PB3=(EditText)findViewById(R.id.txtPB3);
        PB4=(EditText)findViewById(R.id.txtPB4);
        Res=(TextView)findViewById(R.id.TvRes);
        Boton=(Button)findViewById(R.id.button);

        Boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double PPA,PPB,PY;
                String PAU=PA1.getText().toString();
                String PAD=PA2.getText().toString();
                String PAT=PA3.getText().toString();
                String PAC=PA4.getText().toString();
                String PBU=PB1.getText().toString();
                String PBD=PB2.getText().toString();
                String PBT=PB3.getText().toString();
                String PBC=PB4.getText().toString();

                double PAA1=Double.parseDouble(PAU);
                double PAA2=Double.parseDouble(PAD);
                double PAA3=Double.parseDouble(PAT);
                double PAA4=Double.parseDouble(PAC);
                double PBB1=Double.parseDouble(PBU);
                double PBB2=Double.parseDouble(PBD);
                double PBB3=Double.parseDouble(PBT);
                double PBB4=Double.parseDouble(PBC);

               PPA=(0.20*PAA1)+(0.20 * PAA2)+ (0.25 * PAA3) + (0.35 * PAA4); //PPA = 0.20*PA1 + 0.20 * PA2 + 0.25 * PA3 + 0.35 * PA4
               PPB=(0.20 * PBB1)+(0.20 * PBB2)+(0.25 * PBB3)+(0.35 * PBB4);// 0.20 * PB1 + 0.20 * PB2 + 0.25 * PB3 + 0.35 * PB4
               PY=((0.3*PPA)+(0.35*PPB)-10.5/-0.35);//PF = 0.30 * PPA + 0.35 * PB + 0.35 * PY

                String resultado="El alumno debera sacar "+ PY + " en el proyecto para poder aprobar";
                Res.setText(resultado);
            }
        });
    }
}

