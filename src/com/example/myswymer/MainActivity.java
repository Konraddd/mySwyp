package com.example.myswymer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	
//	public int getImageResource(int i){
//	    switch (i){
//	    case 0:
//	        return R.drawable.icon4;
//	    case 1:
//	    	return R.drawable.ic_launcher;
//	    case 2:
//	    	return R.drawable.skipbotton;
//	    case 3:
//	    	return R.drawable.ic_launcher;
//	    case 4:
//	    	return R.drawable.icon4;
//	    case 5:
//	    	return R.drawable.icon4;
//	    case 6:
//	    	return R.drawable.ic_launcher;
//	    default:
//	    	return R.drawable.skipbotton;
//	    }

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
	 * will keep every loaded fragment in memory. If this becomes too memory
	 * intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Create the adapter that will return a fragment for each of the three
		// primary sections of the app.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 6;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return getString(R.string.title_section1).toUpperCase();
			case 1:
				return getString(R.string.title_section2).toUpperCase();
			case 2:
				return getString(R.string.title_section3).toUpperCase();
			case 3:
				return getString(R.string.title_section4).toUpperCase();
			case 4:
				return getString(R.string.title_section5).toUpperCase();
			case 5:
				return getString(R.string.title_section6).toUpperCase();
			case 6:
				return getString(R.string.title_section7).toUpperCase();
			}
			return null;
		}
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// Create a new TextView and set its text to the fragment's section
			// number argument value.
//			TextView textView = new TextView(getActivity());
//			textView.setGravity(Gravity.CENTER);
//			textView.setText(Integer.toString(getArguments().getInt(
//					ARG_SECTION_NUMBER)));
//			return textView;
			
	        ImageView iv = new ImageView(getActivity());
	        iv.setImageResource(getImageResource(getArguments().getInt(ARG_SECTION_NUMBER)));
//	        iv.setImageResource(R.drawable.icon4);
//	        iv.setBackgroundDrawable(getResources().getDrawable(args.getInt("MyImageResource")));
	        return iv; 
		}
	}
	
	
	public Fragment getItem(int i) {

	    Fragment fragment = new DummySectionFragment();
	    Bundle args = new Bundle();
	    args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, i);
	    args.putInt("MyImageResource", getImageResource(i));
	    fragment.setArguments(args);
	    return fragment;
	}

	public static int getImageResource(int i){
	    switch (i){
	    case 0:
	        return R.drawable.icon4;
	    case 1:
	    	return R.drawable.ic_launcher;
	    case 2:
	    	return R.drawable.skipbotton;
	    case 3:
	    	return R.drawable.ic_launcher;
	    case 4:
	    	return R.drawable.icon4;
	    case 5:
	    	return R.drawable.icon4;
	    case 6:
	    	return R.drawable.ic_launcher;
	    default:
	    	return R.drawable.skipbotton;
	    }
	}

}
