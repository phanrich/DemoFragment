package richphan.fragmentdemo.utils;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.widget.Toast;

public class BaseActivity extends Fragment {
    public void customTost(Context context , String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
    public void addFrag(int resouce , Fragment fragment){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(resouce,fragment).commit();
    }
}
