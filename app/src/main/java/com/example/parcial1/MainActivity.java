package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    calculations calc = new calculations();

    private EditText numOne;
    private EditText numTwo;
    private TextView calcRes;

    private Button sumar;
    private Button restar;
    private Button multiplicar;
    private Button dividir;

    private Button factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        nums
        numOne = findViewById(R.id.numOne);
        numTwo = findViewById(R.id.numTwo);

//        res
        calcRes = findViewById(R.id.calcRes);

//        btn operations
        sumar = findViewById(R.id.sumData);
        restar = findViewById(R.id.restarData);
        multiplicar = findViewById(R.id.multiData);
        dividir = findViewById(R.id.divData);

//        factorial
        factorial = findViewById(R.id.calcFact);

//        logic
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = getInputs("sumar");
                calcRes.setText(String.valueOf(res));

                numOne.setText("");
                numTwo.setText("");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = getInputs("restar");
                calcRes.setText(String.valueOf(res));

                numOne.setText("");
                numTwo.setText("");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = getInputs("multiplicar");
                calcRes.setText(String.valueOf(res));

                numOne.setText("");
                numTwo.setText("");
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = getInputs("dividir");
                calcRes.setText(String.valueOf(res));

                numOne.setText("");
                numTwo.setText("");
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numOneStr = numOne.getText().toString().trim();
                int parseNumOne = Integer.parseInt(numOneStr);
                int res = calc.calcFactorial(parseNumOne);
                calcRes.setText(String.valueOf(res));

                numOne.setText("");
                numTwo.setText("");
            }
        });
    }
    private int getInputs(String operation) {
        String numOneStr = numOne.getText().toString().trim();
        String numTwoStr = numTwo.getText().toString().trim();

        int numOneInt = Integer.parseInt(numOneStr);
        int numTwoInt = Integer.parseInt(numTwoStr);

        int res = 0;

        if (operation.equals("sumar")) {
            res = numOneInt + numTwoInt;
            return res;
        } else if(operation.equals("restar")) {
            res = numOneInt - numTwoInt;
            return res;
        } else if (operation.equals("multiplicar")) {
            res = numOneInt * numTwoInt;
            return res;
        } else if (operation.equals("dividir")) {
            res = numOneInt / numTwoInt;
            return res;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
}