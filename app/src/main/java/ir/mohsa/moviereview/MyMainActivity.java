package ir.mohsa.moviereview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;



/**
 * Created by 3801261697 on 09/07/2017.
 * this is the first activity in this project
 * and it hosts the fragment created here; new_my_fragment_layout.xml
 */

public class MyMainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_constraint_layout);
        //FragmentTransaction my_transaction = getSupportFragmentManager().beginTransaction();
        //my_transaction.replace(R.id.Container, new Fragment_For_RecyclerView());
        //my_transaction.commit();
    }
}
