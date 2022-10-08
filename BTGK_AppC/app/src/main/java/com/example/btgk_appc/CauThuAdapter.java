package com.example.btgk_appc;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CauThuAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CauThu> cauThuList;

    public CauThuAdapter(Context context, int layout, List<CauThu> cauThuList) {
        this.context = context;
        this.layout = layout;
        this.cauThuList = cauThuList;
    }

    @Override
    public int getCount() {
        return cauThuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        //ánh xạ
        TextView txtTen = (TextView)  view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView)  view.findViewById(R.id.textviewMoTa);
        ImageView imgHinh = (ImageView)  view.findViewById(R.id.imageviewHinh);
        //gán giá trị
        CauThu cauThu = cauThuList.get(i);

        txtTen.setText(cauThu.getTen());
        txtMoTa.setText(cauThu.getMota());
        imgHinh.setImageResource(cauThu.getHinh());



        return view;
    }
}
