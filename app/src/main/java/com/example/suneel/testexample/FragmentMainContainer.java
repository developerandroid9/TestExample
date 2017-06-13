package com.example.suneel.testexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentMainContainer extends Fragment {

    public static FragmentMainContainer newInstance() {
        return new FragmentMainContainer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View root = inflater.inflate(R.layout.fragment_quick_contact, container, false);
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) root.findViewById(R.id.tabs);
        tabs.setShouldExpand(true);
        ViewPager pager = (ViewPager) root.findViewById(R.id.pager);
        ContactPagerAdapter adapter = new ContactPagerAdapter(getActivity(), getActivity().getSupportFragmentManager());

        pager.setAdapter(adapter);
        tabs.setViewPager(pager);

        return root;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onStart() {
        super.onStart();
    }

    public static class ContactPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.CustomTabProvider {

        private final int[] ICONS = {
                R.mipmap.select_video,
                R.mipmap.select_image,
                R.mipmap.select_milestone,

        };
        private final String[] TITLES = {
                "VIDEOS",
                "IMAGES",
                "MILESTONE"
        };

        private final Context mContext;

        private ContactPagerAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }

        @Override
        public int getCount() {
            return TITLES.length;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                   return FragmentVideos.newInstance();
                case 1:
                    return FragmentImages.newInstance();
                case 2:
                    return FragmentMilstone.newInstance();

                default:
                    return new Fragment();
            }
        }
//        @Override
//        public int getCount() {
//            return ICONS.length;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return TITLES[position];
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            switch (position) {
//                case 0:
//                    return FragmentVideos.newInstance();
//                case 1:
//                    return FragmentImages.newInstance();
//                case 2:
//                    return FragmentMilstone.newInstance();
//            }
//            return null;
//        }
//
//
//        @Override
//        public boolean isViewFromObject(View v, Object o) {
//            return v == o;
//        }

        @Override
        public View getCustomTabView(ViewGroup parent, int position) {
            View tab = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, parent, false);
            ((ImageView) tab.findViewById(R.id.image)).setImageResource(ICONS[position]);
            return tab;
        }

        @Override
        public void tabSelected(View tab) {

        }

        @Override
        public void tabUnselected(View tab) {

        }
    }
}
