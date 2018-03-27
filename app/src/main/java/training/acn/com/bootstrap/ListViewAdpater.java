package training.acn.com.bootstrap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import training.acn.com.bootstrap.utils.Utilities;

/**
 * Created by afnan.khaleel on 26-Mar-18.
 */

public class ListViewAdpater extends BaseAdapter{
    Context context;
    int noOfItems;

    LayoutInflater inflater;

    public ListViewAdpater(Context applicationContext,int noOfListItems) {
        this.context = context;
        this.noOfItems=noOfListItems;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return noOfItems;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //this is a case to show one listView .
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item, viewGroup, false);
        TextView nameT = (TextView) view.findViewById(R.id.tv_display);
        ImageView iconT = (ImageView) view.findViewById(R.id.iv_icon);
        nameT.setText("Index: "+i);
        iconT.setImageResource(Utilities.getRandomImage());
        return view;
    }
}
