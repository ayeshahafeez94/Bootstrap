package training.acn.com.bootstrap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import training.acn.com.bootstrap.utils.Configurations;

public class ListViewActivity extends Activity {
    private ListView mListView ;

    int icons[]= {R.drawable.robot1, R.drawable.robot1};
    String name[] = {"hamesh", "leo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setMinimumHeight(100);



        ListViewAdpater mListViewAdapter = new ListViewAdpater(getApplicationContext(),Integer.parseInt(Configurations.properties.getProperty("NO_OF_LIST_ITEMS")));
        mListView.setAdapter(mListViewAdapter);




    }
}
