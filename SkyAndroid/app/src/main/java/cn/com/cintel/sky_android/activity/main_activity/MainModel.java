package cn.com.cintel.sky_android.activity.main_activity;

import java.util.Map;

import cn.com.cintel.sky_android.bean.goodsdetail.GoodsDetail;
import cn.com.cintel.sky_android.http.HttpHelper;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by sky on 2018/8/15.
 */
public class MainModel implements MainContract.Model {

    @Override
    public void getNetworkDate(Subscriber<GoodsDetail> subscriber, String id, Map<String, String> stringMap) {
        HttpHelper.getInstance().getGoodsDetail(id,stringMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
