package Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by HP on 06-08-2017.
 */

import ac.nita.advaitam4.R;
public class OrganisersFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	/* *
	* 1. Inflate the xml
	* 2. Setup the UI
	* 3. Return the rootView
	* */
        return inflater.inflate(R.layout.fragment_organisers, container, false);

    }
}
