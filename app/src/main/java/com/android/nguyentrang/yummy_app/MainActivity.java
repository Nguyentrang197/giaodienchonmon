package com.android.nguyentrang.yummy_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Menu>image_details= getListData();
        final GridView gridView=(GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomGridAdapter(this,image_details));
        //khi click vào các GridItem
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o= gridView.getItemAtPosition(position);
                Menu menu= (Menu) o;
                Toast.makeText(MainActivity.this,"Đã chọn "+""+menu,Toast.LENGTH_LONG).show();
            }
        });
        }



    private List<Menu> getListData() {
        List<Menu> list= new ArrayList<Menu>();
        Menu americanSalad =new Menu("American Salad", "image1","80000VND");
        Menu grekSalad =new Menu("Grek Salad", "image2","50000VND");
        Menu SeaSalad =new Menu("Sea Salad", "image3","70000VND");
        Menu WinterSalad =new Menu("Winter Salad", "image4","80000VND");
        Menu americanSalad1 =new Menu("American Salad", "image5","90000VND");
        Menu americanSalad2 =new Menu("American Salad", "image6","570000VND");
        list.add(americanSalad);
        list.add(grekSalad);
        list.add(SeaSalad);
        list.add(WinterSalad);
        list.add(americanSalad1);
        list.add(americanSalad2);
        return list;
    }
}
