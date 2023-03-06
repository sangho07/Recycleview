package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data_model [] my_data = new Data_model[]{
          new Data_model("Ông Võ Văn Thưởng làm Chủ tịch nước" , "Sáng 2/3, Quốc hội thông qua nghị quyết bầu ông Võ Văn Thưởng, Ủy viên Bộ Chính trị, Thường trực Ban Bí thư, giữ chức Chủ tịch nước nhiệm kỳ 2021-2026.", R.drawable.chutich),
          new Data_model("G20 bất đồng về chiến sự UKRAINE", "Hội nghị Bộ trưởng Tài chính G20 không thể ra tuyên bố chung vì bất đồng về thông điệp lên án chiến dịch của Nga tại Ukraine.\n" +
                  "\n",R.drawable.g20),
                new Data_model("U.20 Việt Nam  vững bước" , "U.20 Việt Nam đang tiến những bước vững chắc ở giải U.20 châu Á nhờ lứa cầu thủ đồng đều, tiềm năng và giàu tính kỷ luật.", R.drawable.u20),
                new Data_model("Văn Toàn cùng CLB mới", "Cựu tiền đạo HAGL - Nguyễn Văn Toàn có trận thứ 2 liên tiếp được ra sân trong màu áo của CLB Seoul E-Land tại K-League 2.", R.drawable.vantoan),
        };


        myrecycler_view = findViewById(R.id.my_recycler_view);
        Data_Adapter myadapter= new Data_Adapter(my_data);
        myrecycler_view.setLayoutManager(new LinearLayoutManager(this));
        myrecycler_view.setAdapter(myadapter);
    }
}