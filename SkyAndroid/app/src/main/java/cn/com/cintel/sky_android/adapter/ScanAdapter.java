package cn.com.cintel.sky_android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.com.cintel.sky_android.R;
import cn.com.cintel.sky_android.bean.ScanFragment.ScanList;

/**
 * Created by sky on 2018/8/22.
 */
public class ScanAdapter extends BaseAdapter {

    private List<ScanList> scanLists;
    private Context context;

    public ScanAdapter(List<ScanList> scanLists, Context context) {
        this.scanLists = scanLists;
        this.context = context;
    }


    @Override
    public int getCount() {
        return scanLists.size();
    }

    @Override
    public Object getItem(int i) {
        return scanLists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.scan_list_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.scanListText.setText(scanLists.get(i).getScanText());
        Glide.with(context).load(scanLists.get(i).getScanImage()).into(viewHolder.scanListImage);

        return view;
    }

    static class ViewHolder {
        @BindView(R.id.scan_list_image)
        ImageView scanListImage;
        @BindView(R.id.scan_list_text)
        TextView scanListText;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
