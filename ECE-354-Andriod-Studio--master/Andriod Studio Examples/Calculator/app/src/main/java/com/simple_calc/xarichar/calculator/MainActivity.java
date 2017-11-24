package com.simple_calc.xarichar.calculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char POWER = '^';
    private static final char SQRT = '~';
    // CURRENT_ACTION variable, which holds the next operation we intend to perform.

    private char CURRENT_ACTION;



    private ActivityBinding binding;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* setContentView(R.layout.activity_main); */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        decimalFormat = new DecimalFormat("##.#######");


/* Add Button and click operations */
        Button AddButton = (Button)findViewById(R.id.addbutton);
        binding.AddButton.setOnClickListener(new View.OnClickListener(){
       // AddButton.setOnClickListener(
            @Override
        //View.OnClickListener = new Button.OnClickListener() {
            public void onClick(View v) {

                binding.editText.setText(binding.editText.getText() + "Add" );
                //TextView AddText = (TextView) findViewById(R.id.operand_1_Text);
                //TextView AddText2 = (TextView) findViewById(R.id.operand_2_Text);
                //TextView AddText3 = (TextView) findViewById(R.id.result_Text);
                //AddText.setText("TESTTING +");
            }
        });

/* Subtract Button and click operations */
        Button SubtractButton = (Button)findViewById(R.id.subtractbutton);
        //SubtractButton.setOnClickListener(
        binding.SubtractButton.setOnClickListener(new View.OnClickListener(){

                @Override
                // new Button.OnClickListener(){
        public void onClick(View v){
                //TextView SubtractText = (TextView)findViewById(R.id.operand_1_Text);
                //TextView SubtractText2 = (TextView)findViewById(R.id.operand_2_Text);
                //TextView SubtractText3 = (TextView)findViewById(R.id.result_Text);//
                    //AddText.setText("TESTTING -");
                    binding.editText.setText(binding.editText.getText() + "Subtract");
                    }
                });


/* Multiply Button and click operations */
        Button MultiplyButton = (Button)findViewById(R.id.multiplybutton);
        binding.MultiplyButton.setOnClickListener(new View.OnClickListener(){

            @Override
            /* new Button.OnClickListener(){ */

            public void onClick(View v){
                //MultiplyButton.setOnClickListener(

                //TextView MultiplyText = (TextView)findViewById(R.id.operand_1_Text);
                //TextView MultiplyText2 = (TextView)findViewById(R.id.operand_2_Text);
                //TextView MultiplyText3 = (TextView)findViewById(R.id.result_Text);
                //AddText.setText("TESTTING *");
                binding.editText.setText(binding.editText.getText() + "Subtract");
            }
    });



    /* Divide Button and click operations */
        Button DivideButton = (Button)findViewById(R.id.dividebutton);
        binding.DivideButton.setOnClickListener(new View.OnClickListener(){
       // DivideButton.setOnClickListener(
                //new Button.OnClickListener(){
                    public void onClick(View v){
                        //TextView DivideText = (TextView)findViewById(R.id.operand_1_Text);
                        //TextView DivideText2 = (TextView)findViewById(R.id.operand_2_Text);
                        //TextView DivideText3 = (TextView)findViewById(R.id.result_Text);
                        //+AddText.setText("TESTTING / ");
                    binding.editText.setText(binding.editText.getText() + "Divide");
                    }
                });



    /* Sqrt Button and click operations */
        Button SqrtButton = (Button)findViewById(R.id.sqrtbutton);
        binding.SqrtButton.setOnClickListener(new View.OnClickListener(){
        //SqrtButton.setOnClickListener(
                    public void onClick(View v){
                        //TextView SqrtText = (TextView)findViewById(R.id.operand_1_Text);
                        //TextView SqrtText2 = (TextView)findViewById(R.id.operand_2_Text);
                        //TextView SqrtText3 = (TextView)findViewById(R.id.result_Text);
                        //AddText.setText("TESTTING sqrt");
                         binding.editText.setText(binding.editText.getText() + "SQRT");
                    }
                });




      /* Power Button and click operations */
        Button PowerButton = (Button)findViewById(R.id.powerbutton);
        //PowerButton.setOnClickListener(
        binding.PowerButton.setOnClickListener(new View.OnClickListener(){
       //new Button.OnClickListener(){
        public void onClick(View v){
            //TextView PowerText = (TextView)findViewById(R.id.operand_1_Text);
            //TextView PowerText2 = (TextView)findViewById(R.id.operand_2_Text);
            //TextView PowerText3 = (TextView)findViewById(R.id.result_Text);
            //AddText.setText("TESTTING ^");
            binding.editText.setText(binding.editText.getText() + "POWER");
        }
        });




     /* Power Button and click operations */
        Button ClearButton = (Button)findViewById(R.id.clearbutton);
        binding.ClearButton.setOnClickListener(new View.OnClickListener(){
        //ClearButton.setOnClickListener(
                //new Button.OnClickListener(){
                    public void onClick(View v){
                        //TextView PowerText = (TextView)findViewById(R.id.operand_1_Text);
                        //TextView PowerText2 = (TextView)findViewById(R.id.operand_2_Text);
                        //TextView PowerText3 = (TextView)findViewById(R.id.result_Text);
                        //AddText.setText("TESTTING clear");
                        binding.editText.setText(binding.editText.getText() + "CLEAR");
                    }
                });

        public void computeCalculator(){
            if(!Double.isNaN(valueOne)) {
                valueTwo = Double.parseDouble(binding.editText.getText().toString());
                binding.editText.setText(null);

                if(CURRENT_ACTION == ADDITION)
                    valueOne = this.valueOne + valueTwo;
                else if(CURRENT_ACTION == SUBTRACTION)
                    valueOne = this.valueOne - valueTwo;
                else if(CURRENT_ACTION == MULTIPLICATION)
                    valueOne = this.valueOne * valueTwo;
                else if(CURRENT_ACTION == DIVISION)
                    valueOne = this.valueOne / valueTwo;
                    if ( valueTwo == 0 ){
                        System.out.println("You can't divide by 0");
                        return;
                    }
                else if (CURRENT_ACTION == POWER)
                    valueOne = Math.pow(valueOne,valueTwo);
                else if (CURRENT_ACTION== SQRT)
                    valueOne = Math.sqrt(valueOne);
                    valueTwo = Math.sqrt(valueTwo);

            }
            else {
                try {
                    valueOne = Double.parseDouble(binding.editText.getText().toString());
                }
                catch (Exception e){}
            }
        }


        binding.addbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = ADDITION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
            binding.editText.setText(null);
        }
    });

        binding.subtractbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = SUBTRACTION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
            binding.editText.setText(null);
        }
    });

        binding.multiplybutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = MULTIPLICATION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
            binding.editText.setText(null);
        }
    });

        binding.dividebutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = DIVISION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
            binding.editText.setText(null);
        }
    });


            binding.sqrtbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = DIVISION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "~");
            binding.editText.setText(null);
        }
    });

            binding.powerbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = DIVISION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "^");
            binding.editText.setText(null);
        }
    });
        binding.clearbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                    decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
            valueOne = Double.NaN;
            CURRENT_ACTION = '0';
        }
    });


    mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}

}
