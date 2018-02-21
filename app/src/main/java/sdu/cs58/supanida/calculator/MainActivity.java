package sdu.cs58.supanida.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1.Explicit ประกาศตัวแปรบน java
    EditText number1EditText, number2EditText;
    Button addButton,DeleteButton,PlusButton,DivideButton;
    TextView resultTextView;

    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //2.Initial view ผูกตัวแปรบน java กับอิลิเม้นท์บน XML
    number1EditText = findViewById(R.id.edtNumber1);
    number2EditText = findViewById(R.id.edtNumber2);
    addButton = findViewById(R.id.btnAdd);
    DeleteButton = findViewById(R.id.btnDel);
    PlusButton = findViewById(R.id.btnPlus);
    DivideButton = findViewById(R.id.btnDivide);

    resultTextView = findViewById(R.id.txvResult);
    //3.สั่งให้ปุ่มดักฟังว่าเมื่อ user คลิกที่ปุ่ม Login
    addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิด Int
        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
        result = num1+num2;
        //4.แสดงผลลัพธ์การคำนวณ
            resultTextView.setText(result+"");

    DeleteButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิด Int
         num1 = Integer.parseInt(number1EditText.getText().toString().trim());
         num2 = Integer.parseInt(number2EditText.getText().toString().trim());
         result = num1-num2;
            //4.แสดงผลลัพธ์การคำนวณ
            resultTextView.setText(result+"");

    PlusButton.setOnClickListener(new View.OnClickListener() {
         @Override
          public void onClick(View view) {
           //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิด Int
           num1 = Integer.parseInt(number1EditText.getText().toString().trim());
            num2 = Integer.parseInt(number2EditText.getText().toString().trim());
             result = num1*num2;
              //4.แสดงผลลัพธ์การคำนวณ
              resultTextView.setText(result+"");
    DivideButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปรชนิด Int
            num1 = Integer.parseInt(number1EditText.getText().toString().trim());
            num2 = Integer.parseInt(number2EditText.getText().toString().trim());
            result = num1 / num2;
            //4.แสดงผลลัพธ์การคำนวณ
            resultTextView.setText(result + "");
        }
    });

        }
        });
        }
    });


        }
    }); //end setOnClickListener

    } //end Method onCreate

}//end Class
