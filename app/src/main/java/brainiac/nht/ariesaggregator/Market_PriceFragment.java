package brainiac.nht.ariesaggregator;

import android.app.DownloadManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.List;

import brainiac.nht.ariesaggregator.Adapter.CoinAdapter;
import brainiac.nht.ariesaggregator.Entity.Coin;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Market_PriceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Market_PriceFragment extends Fragment {
    List<Coin> items = new ArrayList<>();
    CoinAdapter coinAdapter;
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;

    OkHttpClient client;
    Request request;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Market_PriceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Market_PriceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Market_PriceFragment newInstance(String param1, String param2) {
        Market_PriceFragment fragment = new Market_PriceFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_market__price, container, false);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.rootLayout);
        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
               loadFirst10Coin();
            }


        });
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                items.clear();
                loadFirst10Coin(0);
                setupAdapter();
            }
        });

        recyclerView = (RecyclerView) view.findViewById(R.id.coinList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        setupAdapter();
        return view;
    }
    private void loadFirst10Coin(int i) {
        client = new OkHttpClient();
        request = new Request.Builder().url("");
    }
    private void setupAdapter(){


    }
}