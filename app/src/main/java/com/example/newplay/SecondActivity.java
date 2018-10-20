package com.example.newplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.newplay.fragment.FindFragment;
import com.example.newplay.fragment.FirstPageFragment;
import com.example.newplay.fragment.MyFragment;
import com.example.newplay.fragment.ShopCarFragment;
import com.example.newplay.fragment.TypeFragment;

public class SecondActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {


    private FrameLayout frame;
    private RadioGroup radio_group;
    private RadioButton btn_1;
    private RadioButton btn_2;
    private RadioButton btn_3;
    private RadioButton btn_4;
    private RadioButton btn_5;
    private FirstPageFragment fragmentPageFragment;
    private TypeFragment typeFragment;
    private FindFragment findFragment;
    private ShopCarFragment shopCarFragment;
    private MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        radio_group.setOnCheckedChangeListener(this);
    }

    public void initView(){
        frame = findViewById(R.id.frame);
        radio_group = findViewById(R.id.radio_group);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        fragmentPageFragment = new FirstPageFragment();
        typeFragment = new TypeFragment();
        findFragment = new FindFragment();
        shopCarFragment = new ShopCarFragment();
        myFragment = new MyFragment();
        btn_1.setBackgroundResource(R.mipmap.firstpage_2);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentPageFragment).commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.btn_1:
                btn_1.setBackgroundResource(R.mipmap.firstpage_2);
                btn_2.setBackgroundResource(R.mipmap.type_1);
                btn_3.setBackgroundResource(R.mipmap.find_1);
                btn_4.setBackgroundResource(R.mipmap.shoping);
                btn_5.setBackgroundResource(R.mipmap.my_1);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, fragmentPageFragment).commit();
                break;
            case R.id.btn_2:
                btn_1.setBackgroundResource(R.mipmap.firstpage_1);
                btn_2.setBackgroundResource(R.mipmap.type_2);
                btn_3.setBackgroundResource(R.mipmap.find_1);
                btn_4.setBackgroundResource(R.mipmap.shoping);
                btn_5.setBackgroundResource(R.mipmap.my_1);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, typeFragment).commit();
                break;
            case R.id.btn_3:
                btn_1.setBackgroundResource(R.mipmap.firstpage_1);
                btn_2.setBackgroundResource(R.mipmap.type_1);
                btn_3.setBackgroundResource(R.mipmap.find_2);
                btn_4.setBackgroundResource(R.mipmap.shoping);
                btn_5.setBackgroundResource(R.mipmap.my_1);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, findFragment).commit();
                break;
            case R.id.btn_4:
                btn_1.setBackgroundResource(R.mipmap.firstpage_1);
                btn_2.setBackgroundResource(R.mipmap.type_1);
                btn_3.setBackgroundResource(R.mipmap.find_1);
                btn_4.setBackgroundResource(R.mipmap.shoping_2);
                btn_5.setBackgroundResource(R.mipmap.my_1);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, shopCarFragment).commit();
                break;
            case R.id.btn_5:
                btn_1.setBackgroundResource(R.mipmap.firstpage_1);
                btn_2.setBackgroundResource(R.mipmap.type_1);
                btn_3.setBackgroundResource(R.mipmap.find_1);
                btn_4.setBackgroundResource(R.mipmap.shoping);
                btn_5.setBackgroundResource(R.mipmap.my_2);
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, myFragment).commit();
                break;
        }
    }
}
