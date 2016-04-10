package fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pedro.myapplication.R;

/**
 * Created by helio on 10/04/16.
 */
public class ThreeFragment extends Fragment {

    public ThreeFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //inflate the layoyt for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);

    }
}