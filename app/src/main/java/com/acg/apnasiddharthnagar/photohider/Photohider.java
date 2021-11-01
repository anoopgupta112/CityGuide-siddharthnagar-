package com.acg.apnasiddharthnagar.photohider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.acg.apnasiddharthnagar.R;
import com.acg.apnasiddharthnagar.user.UserDashboard;
//This activity is under process
public class Photohider extends AppCompatActivity {
EditText t1,t2;
TextView tv;
Button setdata,viewdata,deletedata,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photohider);
        t1 = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textviewp);
        setdata = (Button) findViewById(R.id.Setdata);
        viewdata = (Button) findViewById(R.id.Viewdata);
        deletedata = (Button) findViewById(R.id.DeleteData);
        t2 = (EditText) findViewById(R.id.editText2);
        next = (Button) findViewById(R.id.next);

        SharedPreferences sp = getSharedPreferences("datafiles", MODE_PRIVATE);
if (sp.equals("new"))
{
    Toast.makeText(this,"text successfull",Toast.LENGTH_SHORT).show();
}
        setdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setdata();

            }
        });
        viewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Viewdata();

            }
        });
        deletedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletedata();

            }
        });

    }


    public void setdata() {

        SharedPreferences sp = getSharedPreferences("datafiles",MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
         ed.putString("username",t1.getText().toString());
        ed.commit();
        if (sp.getString("username","")=="new"){
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 tv.setText("hello");
                }
            });
        }


        t1.setText("");
        Toast.makeText(this,"data saved",Toast.LENGTH_SHORT).show();

    }
    public void Viewdata(){

        SharedPreferences sp = getSharedPreferences("datafiles",MODE_PRIVATE);
if (sp.contains("username")){
    tv.setText(sp.getString("username",""));
}
else {
    tv.setText("");
    Toast.makeText(this, "data is not found", Toast.LENGTH_SHORT).show();

}



  }
    public void deletedata(){
        SharedPreferences sp = getSharedPreferences("datafile",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        if (sp.contains("username")){
            ed.remove("username");
            ed.commit();
            tv.setText("");
            Toast.makeText(this,"deleted successfull",Toast.LENGTH_SHORT).show();
        }

    }



}