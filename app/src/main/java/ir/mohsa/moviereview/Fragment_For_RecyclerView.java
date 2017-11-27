package ir.mohsa.moviereview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by 3801261697 on 10/07/2017.
 *
 */

public class Fragment_For_RecyclerView extends Fragment {

    class Movie_Information_View_Holder extends RecyclerView.ViewHolder{

        public TextView TextToDisplay;
        public Movie_Information_View_Holder(View itemView) {
            super(itemView);
            TextToDisplay = (TextView) itemView.findViewById(R.id.textview_inside_simple_for_recyclerview);
        }
    }

    class Movie_Information_Adapter extends RecyclerView.Adapter<Fragment_For_RecyclerView.Movie_Information_View_Holder>{

        List<String> my_items;

        Movie_Information_Adapter(){
            my_items = new ArrayList<>();
            for(int i=0; i<500; i++){
                my_items.add("item number = " + i);
            }
        }

        @Override
        public Movie_Information_View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View Returned_by_adapter = LayoutInflater.from(parent.getContext()).inflate(R.layout.new_layout, parent, false);

            return new Movie_Information_View_Holder(Returned_by_adapter);
        }

        @Override
        public void onBindViewHolder(Movie_Information_View_Holder holder, int position) {
            holder.TextToDisplay.setText(my_items.get(position));

        }

        @Override
        public int getItemCount() {
            return my_items.size();
        }
    }

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View the_view_to_be_returned = inflater.inflate(R.layout.recyclerview_just_layout, container, false);
        RecyclerView the_recycler_view = (RecyclerView) the_view_to_be_returned.findViewById(R.id.my_recycler_view);
        the_recycler_view.setLayoutManager(new LinearLayoutManager(getActivity()));
        the_recycler_view.setAdapter(new Movie_Information_Adapter());
        return the_view_to_be_returned;
    }
}
