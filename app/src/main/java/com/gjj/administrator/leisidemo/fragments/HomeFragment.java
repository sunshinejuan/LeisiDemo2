package com.gjj.administrator.leisidemo.fragments;


import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.gjj.administrator.leisidemo.R;
import com.gjj.administrator.leisidemo.adapters.CompanyAdapter;
import com.gjj.administrator.leisidemo.adapters.HomeAdapter;
import com.gjj.administrator.leisidemo.adapters.PromotionAdapter;
import com.gjj.administrator.leisidemo.http.HttpUtils;
import com.gjj.administrator.leisidemo.http.Url;
import com.gjj.administrator.leisidemo.model.LogUtils;
import com.gjj.administrator.leisidemo.model.VBean;
import com.gjj.administrator.leisidemo.views.ImageCycleView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;


import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.Callback;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {
    private static ProgressDialog processDia;
    private TextView chuxiao,more;
    private Button find_more,btn_new;
    private View view;
    private Context mContext;
    private GridView mGridView;
    private CompanyAdapter adapter;
    ImageView henghong_logo,tianhong_logo,longsheng_logo;
    //顶部轮播图的实现
    private ImageCycleView mCycleView;
    private ArrayList<String> urlList_image = new ArrayList<>();
    private TextView tv_henghong;
    private TextView tv_tianhong;
    private TextView tv_lonsheng;
    private GridView  home_grid;
    private HomeAdapter homeAdapter,homeAdapter2;
    private PromotionAdapter promotionAdapter,promotionAdapter2;
    List<VBean.CorporationCompanyBean> corporationCompany;
    List<VBean.LatestProductBean> latestProduct;
    List<VBean.HotestProductBean> promotionProduct;
    private boolean isButtonCheck = false;
    DisplayImageOptions options;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = getActivity();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        showLoadingDialog(mContext, "正在加载中", true);
        initView();
        return view;
    }

    private void initView() {
        view = LayoutInflater.from(mContext).inflate(R.layout.home_fragment,null,false);
        mGridView = (GridView) view.findViewById(R.id.host_product);
        mCycleView = (ImageCycleView) view.findViewById(R.id.cycle_image);
        home_grid = (GridView) view.findViewById(R.id.home_grid);
        henghong_logo = (ImageView) view.findViewById(R.id.henghong_logo);
        tianhong_logo = (ImageView) view.findViewById(R.id.tianhong_logo);
        longsheng_logo = (ImageView) view.findViewById(R.id.longsheng_logo);
        tv_henghong = (TextView) view.findViewById(R.id.tv_henghong);
        tv_tianhong = (TextView) view.findViewById(R.id.tv_tianhong);
        tv_lonsheng = (TextView) view.findViewById(R.id.tv_longsheng);
        chuxiao= (TextView) view.findViewById(R.id.chuxiao);
        more = (TextView) view.findViewById(R.id.more);
        find_more = (Button) view.findViewById(R.id.find_more);
        btn_new = (Button) view.findViewById(R.id.btn_new);
        //按钮的点击事件
        chuxiao.setOnClickListener(this);
        chuxiao.setTextColor(getResources().getColor(R.color.main_txtselect));
        more.setOnClickListener(this);
        find_more.setOnClickListener(this);
        btn_new.setOnClickListener(this);
        initData();
        //显示图片的配置
         options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .showImageOnFail(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .build();

    }

    //请求数据
    private void initData() {
        HttpUtils.post(Url.URL, new Callback.CommonCallback<JSONObject>() {
            @Override
            public void onSuccess(JSONObject jsonObject) {
                LogUtils.d("jsonObject", jsonObject.toString());
                if (jsonObject == null) {
                    LogUtils.d("数据为空", "0");
                    return;
                } else {
                    String v = null;
                    String url;
                    try {
                        v = jsonObject.getString("value");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    LogUtils.d("v", v);
                    Gson gson = new Gson();
                    final List<VBean> appList = gson.fromJson("[" + v + "]", new
                            TypeToken<List<VBean>>() {
                            }.getType());
                    for (VBean list : appList) {
                        //解析banner轮播图
                        urlList_image.clear();
                        for (VBean.BannerListBean listBean : list.getBannerList()) {
                            url = listBean.getBanner_imageurl();
                            urlList_image.add(url);
                        }
                        //解析战略合作伙伴
                        jsonZhanlue(list);

                        //解析热门数据
                        jsonHostProduct(list);
                        //解析新上架产品
                        jsonNewProduct(list);
                        //解析三条数据

                        String image1 = list.getCorporationCompany().get(0).getCompanyIcon();
                        String image2 = list.getCorporationCompany().get(1).getCompanyIcon();
                        String image3 = list.getCorporationCompany().get(2).getCompanyIcon();
                        ImageLoader.getInstance().displayImage(image1,henghong_logo,options);
                        ImageLoader.getInstance().displayImage(image2,tianhong_logo,options);
                        ImageLoader.getInstance().displayImage(image3,longsheng_logo,options);
                        //Picasso.with(mContext).load(list.getCorporationCompany().get(0).getCompanyIcon()).fit().into(henghong_logo);
                       /* Picasso.with(mContext).load(list.getCorporationCompany().get(1).getCompanyIcon()).fit().into(tianhong_logo);
                        Picasso.with(mContext).load(list.getCorporationCompany().get(2).getCompanyIcon()).fit().into(longsheng_logo);*/
                        tv_henghong.setText(list.getCorporationCompany().get(0).getDisplayName());
                        tv_tianhong.setText(list.getCorporationCompany().get(1).getDisplayName());
                        tv_lonsheng.setText(list.getCorporationCompany().get(2).getDisplayName());
                    }
                    mCycleView.setImageResources(urlList_image,
                            mAdCycleViewListener);
                }
                closeLoadingDialog();
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    //解析促销产品
    private void jsonNewProduct(VBean list) {
        promotionProduct = new ArrayList<VBean.HotestProductBean>();
         promotionProduct = list.getHotestProduct();
        LogUtils.d("latestProduct", latestProduct.toString());
        promotionAdapter = new PromotionAdapter(mContext, promotionProduct,isButtonCheck,options);
        home_grid.setAdapter(promotionAdapter);
        promotionAdapter.notifyDataSetChanged();

    }
    //解析新上架产品
    private void jsonHostProduct(VBean list) {
        latestProduct = new ArrayList<VBean.LatestProductBean>();
        latestProduct = list.getLatestProduct();
        LogUtils.d("latestProduct", latestProduct.toString());


    }

    private void jsonZhanlue(VBean list) {
        //解析战略合作伙伴
        corporationCompany = new ArrayList<VBean.CorporationCompanyBean>();
//                        corporationCompany.add(list.getCorporationCompany());
        corporationCompany = list.getCorporationCompany();
        LogUtils.d("corporationCompany", corporationCompany.toString());
        adapter = new CompanyAdapter(mContext, corporationCompany,options);
        mGridView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    //对banner进行监听
    private ImageCycleView.ImageCycleViewListener mAdCycleViewListener = new ImageCycleView.ImageCycleViewListener() {
        @Override
        public void displayImage(String imageURL, ImageView imageView) {
            UrlImageViewHelper.setUrlDrawable(imageView, imageURL);
        }

        @Override
        public void onImageClick(int position, View imageView) {
            //TODO:单击图片处理监听

        }
    };
    /**
     * 显示加载中对话框
     *
     * @param context
     */

    public static void showLoadingDialog(Context context,String message,boolean isCancelable) {
        if (processDia == null) {
            processDia= new ProgressDialog(context,R.style.dialog);
            //点击提示框外面是否取消提示框
            processDia.setCanceledOnTouchOutside(false);
            //点击返回键是否取消提示框
            processDia.setCancelable(isCancelable);
            processDia.setIndeterminate(true);
            processDia.setMessage(message);
            processDia.show();
        }
    }

    /**
     * 关闭加载对话框
     */
    public static void closeLoadingDialog() {
        if (processDia != null) {
            if (processDia.isShowing()) {
                processDia.cancel();
            }
            processDia = null;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chuxiao:
               initData();
                btn_new.setVisibility(View.GONE);
                find_more.setVisibility(View.VISIBLE);

                more.setTextColor(getResources().getColor(R.color.main_txtcommon));
                chuxiao.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;
            case R.id.more:
                find_more.setVisibility(View.GONE);
                btn_new.setVisibility(View.VISIBLE);
                homeAdapter = new HomeAdapter(mContext, latestProduct,isButtonCheck,options);
                home_grid.setAdapter(homeAdapter);
                homeAdapter.notifyDataSetChanged();
                chuxiao.setTextColor(getResources().getColor(R.color.main_txtcommon));
                more.setTextColor(getResources().getColor(R.color.main_txtselect));
                break;
            case R.id.find_more:
                isButtonCheck = true;
                promotionAdapter2 = new PromotionAdapter(mContext,promotionProduct,isButtonCheck,options);
                Log.e("==========","=======Main===="+isButtonCheck);
                promotionAdapter2.notifyDataSetChanged();
                home_grid.setAdapter(promotionAdapter2);
                break;
            case R.id.btn_new:
                isButtonCheck = true;
                homeAdapter2 = new HomeAdapter(mContext,latestProduct,isButtonCheck,options);
                Log.e("==========","=======Main===="+isButtonCheck);
                homeAdapter2.notifyDataSetChanged();
                home_grid.setAdapter(homeAdapter2);
                break;
        }
    }
}
