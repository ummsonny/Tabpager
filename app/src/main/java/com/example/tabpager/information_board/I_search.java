package com.example.tabpager.information_board;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.tabpager.R;

public class I_search extends AppCompatActivity {
    ListView listView;
    ListViewAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_search);
        adapter = new ListViewAdapter();
        listView = findViewById(R.id.srchlistview);
        listView.setVisibility(View.INVISIBLE);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "한국장학재단 인턴 모집", "장학재단에서 인재를 모집함", "지원기간:2021-03-13");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "sk", "sk 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "현대", "현대 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "카카오", "카카오 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "배민", "배민 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "삼성", "삼성 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "sk", "sk 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "현대", "현대 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "카카오", "카카오 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher_background),
                "배민", "배민 인턴 모집", "아무땐 ㄱㄱㄱ");


        EditText editText = findViewById(R.id.srcheditText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable edit) {
                String filterText = edit.toString() ;
                if (filterText.length() > 0) {
                    listView.setVisibility(View.VISIBLE);
                    ((ListViewAdapter)listView.getAdapter()).getFilter().filter(filterText);
                } else {
                    listView.setVisibility(View.VISIBLE);
                    listView.clearTextFilter() ;
                }
            }
        });
    }
}
