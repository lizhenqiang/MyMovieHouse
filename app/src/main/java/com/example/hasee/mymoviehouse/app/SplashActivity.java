package com.example.hasee.mymoviehouse.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hasee.mymoviehouse.R;
import com.example.hasee.mymoviehouse.utils.Contacts;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

public class SplashActivity extends Activity {

    private ImageView iv_splash;
    private TextView tv_jump;

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            if(msg.what==1) {
                getDataFromNet(Contacts.AD);
            }else if(msg.what==2) {
                Intent intent  = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

    private void getDataFromNet(String ad) {
        Log.e("TAG", "ad"+ad);
        OkHttpUtils
                .get()
                .url(ad)
                .id(100)
                .build()
                .execute(new MyStringCallback());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv_jump = (TextView) findViewById(R.id.tv_jump);
        iv_splash= (ImageView) findViewById(R.id.iv_splash);
        tv_jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        handler.sendEmptyMessageDelayed(1, 1000);

    }
    class MyStringCallback extends StringCallback{

        @Override
        public void onError(Call call, Exception e, int id) {
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

        @Override
        public void onResponse(String response, int id) {
            Log.e("TAG", "sssssss");
            switch (id) {
                case 100:
//                    Toast.makeText(GoodsListActivity.this, "http", Toast.LENGTH_SHORT).show();
                    if (response != null) {
                        Log.e("TAG", "2222222222");
                        processData(response);
                        tv_jump.setVisibility(View.VISIBLE);
                        handler.sendEmptyMessageDelayed(2,2500);

                    }
                    break;
                case 101:
                    Toast.makeText(SplashActivity.this, "https", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    private void processData(String response) {
        Log.e("TAG", "eeeeeee");
        Gson gson = new Gson();
        adBean adBean = gson.fromJson(response, com.example.hasee.mymoviehouse.app.adBean.class);

        String imgUrl = adBean.getPosters().get(0).getPic();
        Glide.with(this)
                .load(imgUrl)
                .into(iv_splash);
        /*Picasso
                .with(this)
                .load(imgUrl)
                .noFade()
                .into(iv_splash);
*/


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        handler.removeCallbacksAndMessages(null);
    }
}
