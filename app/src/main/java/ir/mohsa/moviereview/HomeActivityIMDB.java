package ir.mohsa.moviereview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import ir.mohsa.moviereview.RequestsAndReplies.IMDBimageListFragment;

/**f
 * Created by 3801261697 on 21/08/2017.
 */

public class HomeActivityIMDB extends FragmentActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeimdb);
        FragmentTransaction IMDBHomeTransaction = getSupportFragmentManager().beginTransaction();
        IMDBHomeTransaction.replace(R.id.Home_Fragment_ContainerIMDB,new IMDBimageListFragment());
        IMDBHomeTransaction.commit();
    }
}
