package com.example.tabpager.information_board;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.tabpager.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment4 extends ListFragment {
    ListViewAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        adapter = new ListViewAdapter();
        setListAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "한국장학재단 인턴 모집", "장학재단에서 인재를 모집함", "지원기간:2021-03-13");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "sk", "sk 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "현대", "현대 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "카카오", "카카오 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "배민", "배민 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "삼성", "삼성 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "sk", "sk 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "현대", "현대 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "카카오", "카카오 인턴 모집", "아무땐 ㄱㄱㄱ");
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background),
                "배민", "배민 인턴 모집", "아무땐 ㄱㄱㄱ");

        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public void addItem(Drawable icon, String title, String explain, String day) {
        adapter.addItem(icon, title, explain, day) ;
    }



}