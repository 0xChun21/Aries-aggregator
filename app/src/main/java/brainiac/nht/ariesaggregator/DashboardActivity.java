package brainiac.nht.ariesaggregator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import brainiac.nht.ariesaggregator.fragment.ExploreFragment;
import brainiac.nht.ariesaggregator.fragment.HomeFragment;
import brainiac.nht.ariesaggregator.fragment.MoreFragment;
import brainiac.nht.ariesaggregator.fragment.SearchFragment;
import brainiac.nht.ariesaggregator.fragment.WatchlistFragment;

public class DashboardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        frameLayout = findViewById(R.id.fram_layout);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // 1 2 3 4
                switch (item.getItemId()){
                    case R.id.market:
                        HomeFragment homeFragment = new HomeFragment();
                        selectedFragment(homeFragment);
                        break;

                    case R.id.watchlist:
                        WatchlistFragment watchlistFragment = new WatchlistFragment();
                        selectedFragment(watchlistFragment);
                        break;

                    case R.id.explore:
                        ExploreFragment exploreFragment = new ExploreFragment();
                        selectedFragment(exploreFragment);
                        break;

                    case R.id.bottomSearch:
                        SearchFragment searchFragment = new SearchFragment();
                        selectedFragment(searchFragment);
                        break;

                    case R.id.more:
                        MoreFragment moreFragment = new MoreFragment();
                        selectedFragment(moreFragment);
                        break;
                }

                return false;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.market);
    }
    private void selectedFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction;
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fram_layout, fragment);
        fragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.notification:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                break;

            case R.id.search:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;

            case R.id.account:
                Toast.makeText(this, "Account", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}