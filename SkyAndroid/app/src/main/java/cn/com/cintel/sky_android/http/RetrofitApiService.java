package cn.com.cintel.sky_android.http;


import java.util.Map;

import cn.com.cintel.sky_android.bean.goodsdetail.GoodsDetail;
import cn.com.cintel.sky_android.config.UrlConfig;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 *
 */

public interface RetrofitApiService {
//    添加接口示例
    @GET(UrlConfig.Path.CAIPU_ITEM+"{type}")
    Observable<GoodsDetail> getGoodsDetail(@Path("type") String type, @QueryMap Map<String, String> map);

}
