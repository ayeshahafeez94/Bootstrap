package training.acn.com.bootstrap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by afnan.khaleel on 26-Mar-18.
 */

public class ListViewAdpater extends BaseAdapter{
    Context context;
    String name[];
    int icons[];
    LayoutInflater inflater;

    public ListViewAdpater(Context applicationContext, String[] name, int[] icons) {
        this.context = context;
        this.name = name;
        this.icons = icons;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return name.length;
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
        view = inflater.inflate(R.layout.activity_list_view,null);
        TextView nameT = (TextView) view.findViewById(R.id.textView);
        ImageView iconT = (ImageView) view.findViewById(R.id.icon);
        //nameT.setText(name[i]);
        iconT.setImageResource(R.drawable.robot1);
        return view;
    }
}
