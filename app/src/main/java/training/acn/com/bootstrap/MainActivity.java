package training.acn.com.bootstrap;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Properties;

import training.acn.com.bootstrap.utils.AssetsPropertyReader;

public class MainActivity extends AppCompatActivity {

    private AssetsPropertyReader mAssetsPropertyReader;
    private Context mContext;
    private Properties mProperties;
    String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        mAssetsPropertyReader = new AssetsPropertyReader(mContext);
        mProperties=mAssetsPropertyReader.getProperties("application.properties");
        Toast.makeText(mContext,mProperties.getProperty("BLOCK_COLOR"),Toast.LENGTH_LONG).show();
        Log.v(TAG,"Block color "+mProperties.getProperty("BLOCK_COLOR"));
        Log.v(TAG,"NO_OF_LIST_ITEMS "+mProperties.getProperty("NO_OF_LIST_ITEMS"));
    }
}
