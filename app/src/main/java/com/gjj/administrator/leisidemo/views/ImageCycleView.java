package com.gjj.administrator.leisidemo.views;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gjj.administrator.leisidemo.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/3.
 */
public class ImageCycleView extends LinearLayout{
    TextView tt;
    ArrayList<String> ll;


    private Context mContext;


    private ViewPager mAdvPager = null;


    private ImageCycleAdapter mAdvAdapter;


    private ViewGroup mGroup;


    private ImageView mImageView = null;


    private ImageView[] mImageViews = null;


    private int mImageIndex = 0;


    private float mScale;

    String aaa="";

    public ImageCycleView(Context context) {
        super(context);
    }

    /**
     * @param context
     * @param attrs
     */
    public ImageCycleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        mScale = context.getResources().getDisplayMetrics().density;
        LayoutInflater.from(context).inflate(R.layout.ad_cycle_view, this);
        mAdvPager = (ViewPager) findViewById(R.id.adv_pager);
        mAdvPager.setOnPageChangeListener(new GuidePageChangeListener());
        mAdvPager.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_UP:
                        // �?始图片滚�?
                        startImageTimerTask();
                        break;
                    default:
                        // 停止图片滚动
                        stopImageTimerTask();
                        break;
                }
                return false;
            }
        });
        // 滚动图片右下指示器视�?
        mGroup = (ViewGroup) findViewById(R.id.viewGroup);
    }

    public void setImageResources(ArrayList<String> imageUrlList, ImageCycleViewListener imageCycleViewListener) {

        mGroup.removeAllViews();

        final int imageCount = imageUrlList.size();
        mImageViews = new ImageView[imageCount];
        for (int i = 0; i < imageCount; i++) {
            mImageView = new ImageView(mContext);
            int imageParams = (int) (mScale * 10 + 0.5f);// XP与DP转换，�?�应不同分辨�?
            int imagePadding = (int) (mScale * 5 + 0.5f);
            mImageView.setLayoutParams(new LayoutParams(imageParams, imageParams));
            mImageView.setPadding(imagePadding, imagePadding, imagePadding, imagePadding);
            mImageViews[i] = mImageView;
            if (i == 0) {
                mImageViews[i].setBackgroundResource(R.mipmap.dot_black);
            } else {
                mImageViews[i].setBackgroundResource(R.mipmap.dot_white);
            }

            mGroup.addView(mImageViews[i]);
        }
        mAdvAdapter = new ImageCycleAdapter(mContext, imageUrlList, imageCycleViewListener);
        mAdvPager.setAdapter(mAdvAdapter);
        startImageTimerTask();
    }
    public void startImageCycle() {
        startImageTimerTask();
    }


    public void pushImageCycle() {
        stopImageTimerTask();
    }


    private void startImageTimerTask() {
        stopImageTimerTask();
        // 图片�?3秒滚动一�?
        mHandler.postDelayed(mImageTimerTask, 3000);
    }




    private void stopImageTimerTask() {
        mHandler.removeCallbacks(mImageTimerTask);
    }

    private Handler mHandler = new Handler();


    private Runnable mImageTimerTask = new Runnable() {

        @Override
        public void run() {
            if (mImageViews != null) {

                if ((++mImageIndex) == mImageViews.length) {
                    mImageIndex = 0;
                }
                mAdvPager.setCurrentItem(mImageIndex);
            }
        }
    };


    private final class GuidePageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrollStateChanged(int state) {
            if (state == ViewPager.SCROLL_STATE_IDLE)
                startImageTimerTask();
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            //	LogUtils.d("aaaa",arg2+"yyy"+arg0);

            if("".equals(aaa)){

            }else {
                tt.setText(ll.get(arg0));
            }

        }

        @Override
        public void onPageSelected(int index) {

            mImageIndex = index;

            mImageViews[index].setBackgroundResource(R.mipmap.dot_black);
            for (int i = 0; i < mImageViews.length; i++) {
                if (index != i) {
                    mImageViews[i].setBackgroundResource(R.mipmap.dot_white);
                }
            }

        }

    }

    private class ImageCycleAdapter extends PagerAdapter {


        private ArrayList<ImageView> mImageViewCacheList;


        private ArrayList<String> mAdList = new ArrayList<>();


        private ImageCycleViewListener mImageCycleViewListener;

        private Context mContext;

        public ImageCycleAdapter(Context context, ArrayList<String> adList, ImageCycleViewListener imageCycleViewListener) {
            mContext = context;
            mAdList = adList;
            mImageCycleViewListener = imageCycleViewListener;
            mImageViewCacheList = new ArrayList<>();
        }

        @Override
        public int getCount() {
            return mAdList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            String imageUrl = mAdList.get(position);
            ImageView imageView = null;
            if (mImageViewCacheList.isEmpty()) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);

            } else {
                imageView = mImageViewCacheList.remove(0);
            }

            imageView.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    mImageCycleViewListener.onImageClick(position, v);
                }
            });
            imageView.setTag(imageUrl);
            container.addView(imageView);
            mImageCycleViewListener.displayImage(imageUrl, imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ImageView view = (ImageView) object;
            container.removeView(view);
            mImageViewCacheList.add(view);
        }

    }

    public static interface ImageCycleViewListener {


        public void displayImage(String imageURL, ImageView imageView);

        public void onImageClick(int position, View imageView);
    }


}
