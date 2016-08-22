package com.gjj.administrator.leisidemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gjj.administrator.leisidemo.R;
import com.gjj.administrator.leisidemo.model.VBean;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by Administrator on 2016/8/17.
 */
public class CompanyAdapter extends BaseAdapter{
    private Context mContext;
    private List<VBean.CorporationCompanyBean> data;
    DisplayImageOptions options;

    public CompanyAdapter(Context context, List<VBean.CorporationCompanyBean> data, DisplayImageOptions options) {
        mContext = context;
        this.data = data;
        this.options = options;
    }



    @Override
    public int getCount() {
        int ret = 0;
        if (data != null) {
            ret = 6;
        }
        return ret;
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
        if (convertView != null){
            ret = convertView;
        }else {
            ret = LayoutInflater.from(mContext).inflate(
                    R.layout.gv_item,
                    parent,
                    false
            );
        }
        ViewHolder holder = (ViewHolder) ret.getTag();
        if (holder == null){
            holder = new ViewHolder();

            holder.icon = (ImageView) ret.findViewById(R.id.image);
            holder.name = (TextView) ret.findViewById(R.id.text);

            //TODO: 其他展示数据

            ret.setTag(holder);
        }
        VBean.CorporationCompanyBean info = data.get(position);
        holder.name.setText(info.getDisplayName());
        String companyIcon = info.getCompanyIcon();
        ImageLoader.getInstance().displayImage(companyIcon,holder.icon,options);
        return ret;
    }

    private static class ViewHolder{
        public TextView name;
        public ImageView icon;
    }
}

