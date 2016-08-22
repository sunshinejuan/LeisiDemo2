package com.gjj.administrator.leisidemo.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gjj.administrator.leisidemo.R;
import com.gjj.administrator.leisidemo.model.LogUtils;
import com.gjj.administrator.leisidemo.model.VBean;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by Administrator on 2016/8/18.
 */
public class HomeAdapter extends BaseAdapter {
    private Context mContext;
    private List<VBean.LatestProductBean> data;
    private boolean isButtonisCheck;
    DisplayImageOptions options;

    public HomeAdapter(Context context, List<VBean.LatestProductBean> data, boolean isButtonisCheck,DisplayImageOptions options) {
        this. isButtonisCheck = isButtonisCheck;
        mContext = context;
        this.data = data;
        this.options = options;
        LogUtils.d("shuju",data.toString());
    }

    @Override
    public int getCount() {
        int ret=3 ;
        if(isButtonisCheck == false) {
            Log.e("=======================","==============false=======");
            return ret ;
        }else if (isButtonisCheck ==true ){
            Log.e("=======================","==============true=======");
            return data.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ret = null;
        if (convertView != null) {
            ret = convertView;
        } else {
            ret = LayoutInflater.from(mContext).inflate(
                    R.layout.gv_item,
                    parent,
                    false
            );
        }
        ViewHolder holder = (ViewHolder) ret.getTag();
        if (holder == null) {
            holder = new ViewHolder();

            holder.icon = (ImageView) ret.findViewById(R.id.image);
            holder.name = (TextView) ret.findViewById(R.id.text);

            //TODO: 其他展示数据

            ret.setTag(holder);
        }
        VBean.LatestProductBean info = data.get(position);
        holder.name.setText(info.getTypeName());
        String imageUrl = info.getImageUrl();
        ImageLoader.getInstance().displayImage(imageUrl,holder.icon,options);
        return ret;
    }

    private static class ViewHolder {
        public ImageView icon;
        public TextView name;
    }
}