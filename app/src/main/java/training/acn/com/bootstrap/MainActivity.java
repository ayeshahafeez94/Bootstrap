package training.acn.com.bootstrap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import training.acn.com.bootstrap.utils.AssetsPropertyReader;
import training.acn.com.bootstrap.utils.Configurations;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AssetsPropertyReader mAssetsPropertyReader;
    private Context mContext;
    private Configurations configurations;
    String TAG = MainActivity.class.getSimpleName();

    //Buttons
    private Button mLinearLayoutBtn, mRelativeLayoutBtn, mConstraintLayoutBtn;
    private Button mListViewBtn, mRecyclerViewBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        configurations = new Configurations(mContext);

        mLinearLayoutBtn = (Button) findViewById(R.id.btn_linearlayout);
        mRelativeLayoutBtn = (Button) findViewById(R.id.btn_relativelayout);
        mConstraintLayoutBtn = (Button) findViewById(R.id.btn_constraintlayout);
        mListViewBtn = (Button) findViewById(R.id.btn_listview);
        mRecyclerViewBtn = (Button) findViewById(R.id.btn_recyclerview);

        mLinearLayoutBtn.setOnClickListener(this);
        mRelativeLayoutBtn.setOnClickListener(this);
        mConstraintLayoutBtn.setOnClickListener(this);
        mListViewBtn.setOnClickListener(this);
        mRecyclerViewBtn.setOnClickListener(this);


        //  Log.v(TAG,"Block color "+mProperties.getProperty("BLOCK_COLOR"));
        //  Log.v(TAG,"NO_OF_LIST_ITEMS "+mProperties.getProperty("NO_OF_LIST_ITEMS"));
    }

    @Override
    public void onClick(View view) {
        Class destinationClass = null;
        switch (view.getId()) {
            case R.id.btn_linearlayout:
                destinationClass = LinearLayoutActivity.class;
                break;
            case R.id.btn_constraintlayout:
                destinationClass = ConstraintLayoutActivity.class;
                break;
            case R.id.btn_relativelayout:
                destinationClass = RelativeLayoutActivity.class;
                break;
            case R.id.btn_listview:
                destinationClass = ListViewActivity.class;
                break;
            case R.id.btn_recyclerview:
                destinationClass = RecyclerViewActivity.class;
                break;
            default:
                Toast.makeText(mContext, "Not handled", Toast.LENGTH_LONG).show();
        }

        if (destinationClass != null) {
            Intent intent = new Intent(mContext, destinationClass);
            startActivity(intent);
        }
    }
}
