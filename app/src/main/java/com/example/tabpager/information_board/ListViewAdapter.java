package com.example.tabpager.information_board;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabpager.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    public ListViewAdapter() {

    }

    ArrayList<RecruitingItem> list = new ArrayList<>();
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.recruititem, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageview) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textview1) ;
        TextView explanView = (TextView) convertView.findViewById(R.id.textview2) ;
        TextView deadlineTextView = (TextView) convertView.findViewById(R.id.textview3) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        RecruitingItem listViewItem = list.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        explanView.setText(listViewItem.getExplain());
        deadlineTextView.setText(listViewItem.getDeadline());

        return convertView;
    }

    public void addItem(Drawable icon, String title, String explain, String day){
        RecruitingItem item = new RecruitingItem(icon, title, explain, day);
        list.add(item);
    }
}
