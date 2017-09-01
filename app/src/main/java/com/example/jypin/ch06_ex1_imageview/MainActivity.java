package com.example.jypin.ch06_ex1_imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int [] imgId={R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05, R.drawable.img06};
    String [] detail={"下午那場雷陣雨正是我的傑作\n（隨便說說別當真）\n祝福各位七夕情人節快樂",
    "這難道是傳說中的莫非定律......！",
    "輾轉難眠",
    "市面上的桌曆越來越早上市了呢...（茶）\n......好啦，其實想說ㄇㄚˊ幾今年也會出桌曆手帳，\n想要的朋友先別衝動下手了阿!!\n已在籌備中）",
    "忙的時候",
    "被自己的汗臭味薰倒(☉д⊙)"};

    private Button btnNext;
    private ImageView imgShow;
    private TextView text;

    int indexOfphoto=0;
    int count=imgId.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext=(Button)findViewById(R.id.btnNext);
        imgShow=(ImageView)findViewById(R.id.imgShow);
        text=(TextView)findViewById(R.id.text);

        btnNext.setOnClickListener(btnNextListener);
    }

    private Button.OnClickListener btnNextListener=new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            indexOfphoto++;
            if(indexOfphoto==count)
                indexOfphoto=0;
            imgShow.setImageResource(imgId[indexOfphoto]);
            text.setText(detail[indexOfphoto]);

        }
    };
}
