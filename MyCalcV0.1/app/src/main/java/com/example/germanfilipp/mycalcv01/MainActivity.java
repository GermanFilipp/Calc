package com.example.germanfilipp.mycalcv01;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity implements View.OnClickListener {

   double firstValue = 0;
   String operation = "+";
   int chekDot = 0;
   TextView editText3;
   Button button0;
   Button button1;
   Button button2;
   Button button3;
   Button button4;
   Button button5;
   Button button6;
   Button button7;
   Button button8;
   Button button9;
   Button buttonMult;
   Button buttonClear;
   Button buttonDivide;
   Button buttonDel;
   Button buttonPlus;
   Button buttonEqual;
   Button buttonDot;
   Button buttonMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        editText3    = (TextView) findViewById(R.id.editText3);
        button0      = (Button)   findViewById(R.id.button0);
        button1      = (Button)   findViewById(R.id.button1);
        button2      = (Button)   findViewById(R.id.button2);
        button3      = (Button)   findViewById(R.id.button3);
        button4      = (Button)   findViewById(R.id.button4);
        button5      = (Button)   findViewById(R.id.button5);
        button6      = (Button)   findViewById(R.id.button6);
        button7      = (Button)   findViewById(R.id.button7);
        button8      = (Button)   findViewById(R.id.button8);
        button9      = (Button)   findViewById(R.id.button9);
        buttonMult   = (Button)   findViewById(R.id.buttonMult);
        buttonClear  = (Button)   findViewById(R.id.buttonClear);
        buttonDivide = (Button)   findViewById(R.id.buttonDivide);
        buttonDel    = (Button)   findViewById(R.id.buttonDEL);
        buttonPlus   = (Button)   findViewById(R.id.buttonPlus);
        buttonEqual  = (Button)   findViewById(R.id.buttonEqual);
        buttonDot    = (Button)   findViewById(R.id.buttonDot);
        buttonMinus  = (Button)   findViewById(R.id.buttonMinus);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonDel.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
    }


    public void onClick(View v) {



        switch (v.getId()) {
            case R.id.button0:
                editText3.setText(editText3.getText() + "0");
                break;
            case R.id.button1:
                editText3.setText( editText3.getText()+"1");
                break;
            case R.id.button2:
                editText3.setText( editText3.getText()+"2");
                break;
            case R.id.button3:
                editText3.setText( editText3.getText()+"3");
                break;
            case R.id.button4:
                editText3.setText( editText3.getText()+"4");
                break;
            case R.id.button5:
                editText3.setText( editText3.getText()+"5");
                break;
            case R.id.button6:
                editText3.setText( editText3.getText()+"6");
                break;
            case R.id.button7:
                editText3.setText( editText3.getText()+"7");
                break;
            case R.id.button8:
                editText3.setText( editText3.getText()+"8");
                break;
            case R.id.button9:
                editText3.setText( editText3.getText()+"9");
                break;
            case R.id.buttonClear:
               /* String temp = editText3.getText();
                editText3.setText(temp.substring(0,temp.length()-1));*/
                break;
            case R.id.buttonDEL:
            case R.id.buttonDivide:
            case R.id.buttonDot:
                if (chekDot == 0) {
                    editText3.setText(editText3.getText() + ".");
                    chekDot=1;
                    break;
                }
                else{break;}
            case R.id.buttonEqual:
            case R.id.buttonMinus:
            case R.id.buttonMult:
            case R.id.buttonPlus:
                /*firstValue = Double.valueOf(editText3.getText());
                editText3.setText("");
                operation = "+";*/
                break;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
