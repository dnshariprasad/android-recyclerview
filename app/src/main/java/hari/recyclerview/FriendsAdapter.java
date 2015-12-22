package hari.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.ViewHolder> {
    private Context context;
    ArrayList<Friend> friends;

    public FriendsAdapter(ArrayList<Friend> friends, Context context) {
        this.friends = friends;
        this.context = context;
    }

    //involves inflating a layout from XML and returning the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //get context
        Context context = parent.getContext();
        //get layout inflater
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.row_friend, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Friend friend = friends.get(position);
        holder.name_text.setText(friend.getName());
        holder.number_text.setText(friend.getNo());
    }

    // Return the total count of items
    @Override
    public int getItemCount() {
        return friends.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name_text, number_text;

        public ViewHolder(View itemView) {
            super(itemView);
            name_text = (TextView) itemView.findViewById(R.id.name_text);
            number_text = (TextView) itemView.findViewById(R.id.number_text);
        }
    }
}
