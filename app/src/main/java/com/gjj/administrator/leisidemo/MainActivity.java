package com.gjj.administrator.leisidemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gjj.administrator.leisidemo.base.BaseActivity;
import com.gjj.administrator.leisidemo.fragments.GongqiuFragment;
import com.gjj.administrator.leisidemo.fragments.HomeFragment;
import com.gjj.administrator.leisidemo.fragments.InfoFragment;
import com.gjj.administrator.leisidemo.fragments.MineFragment;
import com.gjj.administrator.leisidemo.fragments.ShopFragment;


/**
 * 主界面fragment的切换
 */
public class MainActivity extends BaseActivity {
    TextView tv_home;
    TextView tv_shop;
    TextView tv_gongqiu;
    TextView tv_info;
    TextView tv_mine;
    LinearLayout ll_home,ll_shop,ll_gongqiu,ll_info,ll_mine;
    private HomeFragment homeFragment;
    private ShopFragment shopFragment;
    private InfoFragment infoFragment;
    //	private ClassFragment classFragment;
    private MineFragment personalFragment;
    private GongqiuFragment helpFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initView();
        resView(1);
    }

    private void initView() {
        tv_home= (TextView) findViewById(R.id.tv_home);
        tv_shop= (TextView) findViewById(R.id.tv_shop);
        tv_gongqiu= (TextView) findViewById(R.id.tv_gongqiu);
        tv_info= (TextView) findViewById(R.id.tv_info);
        tv_mine= (TextView) findViewById(R.id.tv_mine);

        ll_home=(LinearLayout)findViewById(R.id.ll_home);
        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifYuJiaZai(1);
            }
        });
        ll_shop=(LinearLayout)findViewById(R.id.ll_shop);
        ll_gongqiu=(LinearLayout)findViewById(R.id.ll_gongqiu);
        ll_info=(LinearLayout)findViewById(R.id.ll_info);
        ll_mine = (LinearLayout) findViewById(R.id.ll_ourself);
        ll_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifYuJiaZai(2);
            }
        });
        ll_gongqiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifYuJiaZai(3);
            }
        });
        ll_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifYuJiaZai(4);
            }
        });
        ll_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ifYuJiaZai(5);
            }
        });
    }

    private void ifYuJiaZai(final int i) {
        resView(i);
    }

    private void resView(int i) {
        FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        //显示第一个
        homeFragment=new HomeFragment();
        shopFragment=new ShopFragment();
        helpFragment = new GongqiuFragment();
        infoFragment=new InfoFragment();
        personalFragment=new MineFragment();

        // ll.setVisibility(View.VISIBLE);
        // manager=getFragmentManager();

        // transaction=manager.beginTransaction();
        switch (i){
            case 1:
                //   test_post();

                transaction.replace(R.id.fragment, homeFragment);
                setCommon();
                tv_home.setTextColor(getResources().getColor(R.color.main_txtselect));

                break;
            case 2:
                transaction.replace(R.id.fragment, shopFragment);
                setCommon();
                tv_shop.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;
            case 3:
                transaction.replace(R.id.fragment, helpFragment);
                setCommon();
                tv_gongqiu.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;
            case 4:
                transaction.replace(R.id.fragment, infoFragment);
                setCommon();
                tv_info.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;
            case 5:
                transaction.replace(R.id.fragment,personalFragment);
                setCommon();
                tv_mine.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;

        }
        transaction.commit();
    }

    private void setCommon() {
        tv_home.setTextColor(getResources().getColor(R.color.main_txtcommon));
        tv_shop.setTextColor(getResources().getColor(R.color.main_txtcommon));
        tv_gongqiu.setTextColor(getResources().getColor(R.color.main_txtcommon));
        tv_info.setTextColor(getResources().getColor(R.color.main_txtcommon));
        tv_mine.setTextColor(getResources().getColor(R.color.main_txtcommon));
    }
}
