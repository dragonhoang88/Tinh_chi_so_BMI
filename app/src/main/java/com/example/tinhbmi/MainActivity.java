package com.example.tinhbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed_chieucao, ed_cannang;
    TextView tv_chisobmi;
    ImageButton button;
    RadioButton radio_nam,radio_nu,radio_chaua;

    double bmi;
//    double chisobmi;
    double cannang;
    double chieucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anhxa();
                if (radio_nam.isChecked()){

                    if(ed_cannang.getText().toString().length() != 0 && ed_chieucao.getText().toString().length() != 0){

                        cannang = Double.parseDouble(ed_cannang.getText().toString().trim());
                        chieucao = Double.parseDouble(ed_chieucao.getText().toString().trim());
                        bmi =  cannang  / ( chieucao*0.01 * chieucao*0.01 ) ;

                        if (bmi < 20) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) + "\n"+ "Bạn hơi gầy so với chiều cao");
                        } else if (20 < bmi && bmi <= 25) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) + "\n"+ "Bạn có một cơ thể cân đối");
                        } else if (25 <= bmi && bmi <= 30) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn có nguy cơ trở thành người béo phì");
                        } else if (30 < bmi && bmi < 40) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn đang bị béo phì ở cấp độ 1");
                        } else if (bmi >= 40) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+ "Bạn đang bị béo phì ở cấp độ 2");
                        }

                    }else {
                        tv_chisobmi.setText("Mời bạn đăng nhập thông tin");}

                }else if(radio_nu.isChecked()){
                    if(ed_cannang.getText().toString().length() != 0 && ed_chieucao.getText().toString().length() != 0){

                        cannang = Double.parseDouble(ed_cannang.getText().toString().trim());
                        chieucao = Double.parseDouble(ed_chieucao.getText().toString().trim());
                        bmi =  cannang  / ( chieucao*0.01 * chieucao*0.01 ) ;

                        if (bmi < 18) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) + "\n"+"Bạn hơi gầy so với chiều cao");
                        } else if (18 <= bmi && bmi < 23) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) + "\n"+"Bạn có một cơ thể cân đối");
                        } else if (23 <= bmi && bmi < 25) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn có nguy cơ trở thành người béo phì");
                        } else if (25 <= bmi && bmi <= 30) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn đang bị béo phì ở cấp độ 1");
                        } else if (bmi > 30) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+ "\n"+"Bạn đang bị béo phì ở cấp độ 2");
                        }

                    }else {
                        tv_chisobmi.setText("Mời bạn đăng nhập thông tin");}

                }else if(radio_chaua.isChecked()){
                    if(ed_cannang.getText().toString().length() != 0 && ed_chieucao.getText().toString().length() != 0){

                        cannang = Double.parseDouble(ed_cannang.getText().toString().trim());
                        chieucao = Double.parseDouble(ed_chieucao.getText().toString().trim());
                        bmi =  cannang  / ( chieucao*0.01 * chieucao*0.01 ) ;

                        if (bmi < 18.5) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) + "\n"+"Bạn hơi gầy so với chiều cao");
                        } else if (18.5 <= bmi && bmi < 24.9) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi) +"\n"+ "Bạn có một cơ thể cân đối");
                        } else if (25 <= bmi && bmi < 29.9) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn có nguy cơ trở thành người báo phì");
                        } else if (30 <= bmi && bmi <= 34.9) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+"Bạn đang bị béo phì ở cấp độ 1");
                        } else if (35 <= bmi && bmi <= 39.9) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+ "\n"+"Bạn đang bị béo phì ở cấp độ 2");
                        }else if ( bmi >= 40) {
                            tv_chisobmi.setText("BMI = "+ String.format("%.1f", bmi)+"\n"+ "Bạn đang bị béo phì ở cấp độ 3");
                        }

                    }else {
                        tv_chisobmi.setText("Mời bạn đăng nhập thông tin");}



              }
            }
        });


    }


    private void anhxa() {
        ed_chieucao = findViewById(R.id.editTextNumber_chieucao);
        ed_cannang = findViewById(R.id.editTextNumber2_cannang);
        tv_chisobmi = findViewById(R.id.textView3_chisobmi);
        button = findViewById(R.id.imageButton_btn);
        radio_nam=findViewById(R.id.radiobutton_nam);
        radio_nu=findViewById(R.id.radiobutton_nu);
        radio_chaua=findViewById(R.id.radiobutton_nguoichaua);

    }
}