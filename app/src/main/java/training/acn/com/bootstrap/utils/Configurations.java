package training.acn.com.bootstrap.utils;

import android.content.Context;

import java.util.Properties;

/**
 * Created by ayesha.hafeez on 3/26/2018.
 */

public class Configurations {

    public static Properties properties;

    private Context mContext;

    public Configurations(Context context) {

        AssetsPropertyReader assetsPropertyReader = new AssetsPropertyReader(context);
        properties = assetsPropertyReader.getProperties("application.properties");

    }


}
