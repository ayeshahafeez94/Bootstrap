package training.acn.com.bootstrap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import training.acn.com.bootstrap.adapter.ListAdapter;
import training.acn.com.bootstrap.utils.Configurations;

public class RecyclerViewActivity extends AppCompatActivity implements ListAdapter.ListItemClickListener {

   private RecyclerView mList;
   private   ListAdapter mlistAdapter;
   private Toast mToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mList = (RecyclerView) findViewById(R.id.rv_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mList.setLayoutManager(linearLayoutManager);
        mList.setHasFixedSize(true);

        int noOfListItems = Integer.parseInt(Configurations.properties.getProperty("NO_OF_LIST_ITEMS"));

        mlistAdapter = new ListAdapter(noOfListItems,this);
        mList.setAdapter(mlistAdapter);



    }

    @Override
    public void onClick(int index) {

        if(mToast!=null){
            mToast.cancel();
        }
        mToast= Toast.makeText(this,"Index: "+index+" is clicked",Toast.LENGTH_LONG);
        mToast.show();
    }
}
