package cn.com.cintel.sky_android.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by sky on 2016/10/4.
 */

public abstract  class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initViews();
        initData();
    }
    public abstract void initViews();

    public abstract void initData();

    public abstract  int getLayoutId();

    @Override
    protected void onResume() {
       super.onResume();
     }

     @Override
     protected void onPause() {
       super.onPause();
     }

     @Override
     protected void onStop() {
       super.onStop();
     }

     @Override
     protected void onDestroy() {
       super.onDestroy();
     }

     @Override
     protected void onSaveInstanceState(Bundle outState) {
       super.onSaveInstanceState(outState);
     }
}
