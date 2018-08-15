package cn.com.cintel.sky_android.bean.goodsdetail;

import java.util.List;

/**
 * Created by My on 2016/10/20.
 */
public  class MerchantBean {
    private int id;
    private String name;
    private String pic;
    private String booth_no;
    private int selling_goods_cnt;
    private int sold_orders_cnt;
    private Object score;
    private Object market_name;
    private List<?> goods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getBooth_no() {
        return booth_no;
    }

    public void setBooth_no(String booth_no) {
        this.booth_no = booth_no;
    }

    public int getSelling_goods_cnt() {
        return selling_goods_cnt;
    }

    public void setSelling_goods_cnt(int selling_goods_cnt) {
        this.selling_goods_cnt = selling_goods_cnt;
    }

    public int getSold_orders_cnt() {
        return sold_orders_cnt;
    }

    public void setSold_orders_cnt(int sold_orders_cnt) {
        this.sold_orders_cnt = sold_orders_cnt;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public Object getMarket_name() {
        return market_name;
    }

    public void setMarket_name(Object market_name) {
        this.market_name = market_name;
    }

    public List<?> getGoods() {
        return goods;
    }

    public void setGoods(List<?> goods) {
        this.goods = goods;
    }
}