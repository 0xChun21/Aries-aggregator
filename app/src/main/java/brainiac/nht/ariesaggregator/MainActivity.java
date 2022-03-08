package brainiac.nht.ariesaggregator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import brainiac.nht.ariesaggregator.fragment.ExploreFragment;
import brainiac.nht.ariesaggregator.fragment.HomeFragment;
import brainiac.nht.ariesaggregator.fragment.MoreFragment;
import brainiac.nht.ariesaggregator.fragment.SearchFragment;
import brainiac.nht.ariesaggregator.fragment.WatchlistFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


    }


}
