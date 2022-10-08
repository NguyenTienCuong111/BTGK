package com.example.btgk_appc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class ListFragment extends Fragment {
        private ListView lvCauThu;
        private ArrayList<CauThu> arrayCauThu;
        private CauThuAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        lvCauThu = view.findViewById(R.id.listviewCauThu);
        arrayCauThu = new ArrayList<>();

        arrayCauThu.add(new CauThu("Lionel Messi", "sinh: 24/06/1987",R.drawable.messi));
        arrayCauThu.add(new CauThu("Cristiano Ronaldo", "sinh: 5/2/1985",R.drawable.ronaldo));
        arrayCauThu.add(new CauThu("Neymar", "sinh: 5/2/1992",R.drawable.neymar));
        arrayCauThu.add(new CauThu("Mohamed Salah", "sinh: 15/6/1992",R.drawable.salah));
        arrayCauThu.add(new CauThu("Luis Suárez", "sinh: 24/1/1987",R.drawable.suarez));
        adapter = new CauThuAdapter(getContext(), R.layout.thongtin_cauthu, arrayCauThu);
        lvCauThu.setAdapter(adapter);
        lvCauThu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(getContext(), LionelMessi.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getContext(), Detail.class);
                    CauThu cauthu = arrayCauThu.get(i);
                    intent.putExtra("tencauthu", cauthu.getTen());
                    intent.putExtra("mota", cauthu.getMota());
                    intent.putExtra("hinh", cauthu.getHinh());
                    startActivity(intent);
                }




            }
        });


        return view;
    }
}