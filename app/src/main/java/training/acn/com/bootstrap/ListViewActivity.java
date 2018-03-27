package training.acn.com.bootstrap;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends Activity {
    private ListView mListView ;

    int icons[]= {R.drawable.robot1, R.drawable.robot1};
    String name[] = {"hamesh", "leo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        mListView = (ListView) findViewById(R.id.listView);

        Context context = this.getApplicationContext();
        ListViewAdpater mListViewAdapter = new ListViewAdpater(this.getApplicationContext(), name, icons);
        mListView.setAdapter(mListViewAdapter);




    }
}
