package cn.com.cintel.sky_android.config;

/**
 * 用于配置网络连接地址以及参数名称
 */

public class UrlConfig {
    /**
     * 用于写最基础的url，主要是用于生产环境和开发环境替换
     */
    public static final String BASE_URL = "http://115.159.227.219:8088/";

    /**
     * 该类用于存储url的后半部分
     */
    public static class Path {
        public static final String CAIPU_ITEM = "fanfou-api/cookbook/cate";
    }

    /**
     * 该类用于存储url的参数的键
     */
    public static class Params {
        public static final String ACCESS_TOKEN = "access_token";
    }

    /**
     * 该类用于存储一些默认值
     */
    public static class DefaultVaule {
        public static final String ACCESS_TOKEN = "";
        public static final String SALE_SORT = "ASC";
        public static final int CATEGORY_ID = 43;
        public static final int PAGE_NUM = 1;
        public static final int PAGE_SIZE = 10;
        public static final int MARKET_ID = 6;
        public static final String ACCESS_TOKEN_DETAIL = "defaultValue";

    }

}
