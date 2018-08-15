package cn.com.cintel.sky_android.activity.main_activity;

import java.util.Map;

import cn.com.cintel.sky_android.bean.goodsdetail.GoodsDetail;
import rx.Subscriber;

/**
 * Created by sky on 2018/8/15.
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.Model model;
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.model = new MainModel();
        this.view = view;
    }

    @Override
    public void getNetworkDate(String id, Map<String, String> stringMap) {
        model.getNetworkDate(new Subscriber<GoodsDetail>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(GoodsDetail goodsDetail) {
                if (goodsDetail!=null)
                    view.onSuccess(goodsDetail);
            }
        },id,stringMap);
    }
}
