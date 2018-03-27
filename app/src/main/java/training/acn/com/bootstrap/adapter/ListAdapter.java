package training.acn.com.bootstrap.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import training.acn.com.bootstrap.R;

/**
 * Created by ayesha.hafeez on 3/26/2018.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ItemViewHolder> {
    private int mItemCount;
    private int viewHolderCount;
    private final ListItemClickListener mOnClickListener;
    private String TAG = ListAdapter.class.getSimpleName();
    private String[] imageResources;

    public ListAdapter(int noOfItems, ListItemClickListener adapterOnClickListener) {
        mItemCount = noOfItems;
        mOnClickListener = adapterOnClickListener;
        viewHolderCount = 0;

    }

    public interface ListItemClickListener {
        void onClick(int index);
    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        ItemViewHolder viewHolder = new ItemViewHolder(view);


        //COMEPLETE get the images

        viewHolder.viewHolderImage.setBackgroundResource(getRandomImage());

        viewHolderCount++;
        Log.d(TAG, "onCreateViewHolder: number of ViewHolders created: "
                + viewHolderCount);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mItemCount;
    }

    private int getRandomImage() {
        Random random = new Random();
        int resourceId;

        int index = random.nextInt() % 3;
        switch (index) {
            case 0:
                resourceId = R.drawable.pic2;
                break;
            case 1:
                resourceId = R.drawable.pic3;
                break;
            case 2:
                resourceId = R.drawable.pic4;
                break;
            default:
                resourceId = R.drawable.pic2;

        }
        return resourceId;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView viewHolderImage;
        private TextView viewHolderIndex;


        public ItemViewHolder(View itemView) {
            super(itemView);
            viewHolderImage = itemView.findViewById(R.id.iv_icon);
            viewHolderIndex = itemView.findViewById(R.id.tv_display);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickedItemIndex = getAdapterPosition();
            mOnClickListener.onClick(clickedItemIndex);
        }

        public void bind(int listIndex) {
            viewHolderIndex.setText("Index: " + listIndex);
        }
    }


}
