package amazon.com.myamazon.tabs;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import amazon.com.myamazon.Login;
import amazon.com.myamazon.SignUpActivity;

public class TabPagerAdapter extends FragmentPagerAdapter {
   int[] icons;
    String[] tabs;
    Context context;

    public TabPagerAdapter(FragmentManager fm, String[] tabs, int[] icons, FragmentActivity activity) {
        super(fm);
this.tabs=tabs;
        this.icons=icons;
        this.context=activity;
    }
    Fragment fragment;

    @Override
    public Fragment getItem(int index) {
        switch (index) {
            case 0:
                fragment= new Login();

                break;
            case 1:
           fragment=new SignUpActivity();
                break;


        }

return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //for images
//        Drawable drawable=context.getResources().getDrawable(icons[position]);
//        drawable.setBounds(0,0,36,36);
//        ImageSpan imageSpan=new ImageSpan(drawable);
//        SpannableString spannableString=new SpannableString(" ");
//        spannableString.setSpan(imageSpan,0,spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//        return spannableString;

        return tabs[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}