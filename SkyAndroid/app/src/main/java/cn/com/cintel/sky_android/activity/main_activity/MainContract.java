package cn.com.cintel.sky_android.activity.main_activity;

import java.util.Map;

import cn.com.cintel.sky_android.bean.goodsdetail.GoodsDetail;
import rx.Subscriber;

/**
 * Created by sky on 2018/8/15.
 */
public class MainContract {

    public interface View{
        public void onSuccess(GoodsDetail goodsDetail);
    }

    public interface Model{
        void getNetworkDate(Subscriber<GoodsDetail> subscriber,
                            String id, Map<String, String> stringMap);
    }

    public interface Presenter{
        void getNetworkDate( String id, Map<String, String> stringMap);
    }

}
