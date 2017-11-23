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

public class MainActivity extends AppCompatActivity {
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

        Button AddButton = (Button)findViewById(R.id.addbutton);
        AddButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView AddText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView AddText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView AddText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING +");
                    }
                });

        Button SubtractButton = (Button)findViewById(R.id.subtractbutton);
        SubtractButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView SubtractText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView SubtractText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView SubtractText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING -");
                    }
                });

        Button MultiplyButton = (Button)findViewById(R.id.multiplybutton);
        MultiplyButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView MultiplyText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView MultiplyText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView MultiplyText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING *");
                    }
                });

        Button DivideButton = (Button)findViewById(R.id.dividebutton);
        DivideButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView DivideText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView DivideText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView DivideText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING / ");
                    }
                });

        Button SqrtButton = (Button)findViewById(R.id.sqrtbutton);
        SqrtButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView SqrtText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView SqrtText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView SqrtText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING sqrt");
                    }
                });

        Button PowerButton = (Button)findViewById(R.id.powerbutton);
        PowerButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView PowerText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView PowerText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView PowerText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING ^");
                    }
                });

        Button ClearButton = (Button)findViewById(R.id.clearbutton);
        ClearButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView AddText = (TextView)findViewById(R.id.operand_1_Text);
                        TextView AddText2 = (TextView)findViewById(R.id.operand_2_Text);
                        TextView AddText3 = (TextView)findViewById(R.id.result_Text);
                        AddText.setText("TESTTING");
                    }
                });



        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
