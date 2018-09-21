package com.android.nguyentrang.yummy_app;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomGridAdapter extends BaseAdapter {
    private List<Menu> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomGridAdapter(Context acontext,List<Menu> listData) {
        this.listData = listData;
        this.context = context;
        layoutInflater= LayoutInflater.from(acontext);
    }

    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null)
        {
            convertView= layoutInflater.inflate(R.layout.row_listview,null);
            holder= new ViewHolder();
            holder.image= (ImageView) convertView.findViewById(R.id.gr_image);
            holder.name= (TextView) convertView.findViewById(R.id.gr_name);
            holder.price= (TextView) convertView.findViewById(R.id.gr_price);
            convertView.setTag(holder);
        }else
        {
            holder= (ViewHolder) convertView.getTag();
        }
        Menu menu=this.listData.get(position);
        holder.name.setText(menu.getmName());
        holder.price.setText(menu.getmPrice());
        int imageld= this.getImagebyName(menu.getmImage());
        holder.image.setImageResource(imageld);
        return convertView;
    }

    private class ViewHolder {
        ImageView image;
        TextView name;
        TextView price;
    }
    //Tìm id của image ứng với tên ảnh trong Drawable
    public int getImagebyName(String resName)
    {
        String pkgName=context.getPackageName();
        //Trả về 0 nếu không tìm thấy
        int resID=context.getResources().getIdentifier(resName,"drawable",pkgName);
        Log.i("CustomGridView","Res Name"+resName+"==>Res ID= "+resID);
        return resID;
    }
}
