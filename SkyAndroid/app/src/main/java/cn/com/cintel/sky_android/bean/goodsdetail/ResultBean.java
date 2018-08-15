package cn.com.cintel.sky_android.bean.goodsdetail;

import java.util.List;

/**
 * Created by My on 2016/10/20.
 */
public  class ResultBean {
    private int id;
    private String name;
    private String thumb;
    private String price;
    private int unit;
    private String origin;
    private String description;
    private int quantity;
    private int nature;
    private int score;
    private String goods_sn;
    private String detail_pic;
    private Object weight;
    private Object actual_price;
    private Object actual_weight;
    private String unit_name;
    private int saled_count;
    private String keep_mode_name;
    private String short_intro;
    private int is_fav;
    private String detail_url;
    private String start_time;
    private String end_time;
    private String market_price;
    private int market_unit;
    private String market_unit_name;
    private Object sku_price;
    private int original_price;
    private String original_unit_name;
    private int original_unit;
    private int comment_count;
    private Object has_comment;
    private Object children_goods;
    private int is_group;
    private String merchant_name;
    private int merchant_id;
    /**
     * id : 58
     * name : 鐜夎僵鏋滃洯
     * goods : []
     * pic : http://image.zenmechi.cc/img/a/b2/2b/ab22b57b6bbb6062af.jpg
     * booth_no : 鏂板姞鑺卞洯
     * selling_goods_cnt : 43
     * sold_orders_cnt : 40
     * score : null
     * market_name : null
     */

    private MerchantBean merchant;
    private int shop_cart_count;
    private List<?> supported_services;
    private List<?> activity_label;
    private List<?> nutrition_collocation_lists;
    /**
     * pic : http://image.zenmechi.cc/img/9/81/a1/981a157c8de45b4449.jpg
     */

    private List<PicListBean> pic_list;

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

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public String getDetail_pic() {
        return detail_pic;
    }

    public void setDetail_pic(String detail_pic) {
        this.detail_pic = detail_pic;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    public Object getActual_price() {
        return actual_price;
    }

    public void setActual_price(Object actual_price) {
        this.actual_price = actual_price;
    }

    public Object getActual_weight() {
        return actual_weight;
    }

    public void setActual_weight(Object actual_weight) {
        this.actual_weight = actual_weight;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public int getSaled_count() {
        return saled_count;
    }

    public void setSaled_count(int saled_count) {
        this.saled_count = saled_count;
    }

    public String getKeep_mode_name() {
        return keep_mode_name;
    }

    public void setKeep_mode_name(String keep_mode_name) {
        this.keep_mode_name = keep_mode_name;
    }

    public String getShort_intro() {
        return short_intro;
    }

    public void setShort_intro(String short_intro) {
        this.short_intro = short_intro;
    }

    public int getIs_fav() {
        return is_fav;
    }

    public void setIs_fav(int is_fav) {
        this.is_fav = is_fav;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public int getMarket_unit() {
        return market_unit;
    }

    public void setMarket_unit(int market_unit) {
        this.market_unit = market_unit;
    }

    public String getMarket_unit_name() {
        return market_unit_name;
    }

    public void setMarket_unit_name(String market_unit_name) {
        this.market_unit_name = market_unit_name;
    }

    public Object getSku_price() {
        return sku_price;
    }

    public void setSku_price(Object sku_price) {
        this.sku_price = sku_price;
    }

    public int getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(int original_price) {
        this.original_price = original_price;
    }

    public String getOriginal_unit_name() {
        return original_unit_name;
    }

    public void setOriginal_unit_name(String original_unit_name) {
        this.original_unit_name = original_unit_name;
    }

    public int getOriginal_unit() {
        return original_unit;
    }

    public void setOriginal_unit(int original_unit) {
        this.original_unit = original_unit;
    }

    public int getComment_count() {
        return comment_count;
    }

    public void setComment_count(int comment_count) {
        this.comment_count = comment_count;
    }

    public Object getHas_comment() {
        return has_comment;
    }

    public void setHas_comment(Object has_comment) {
        this.has_comment = has_comment;
    }

    public Object getChildren_goods() {
        return children_goods;
    }

    public void setChildren_goods(Object children_goods) {
        this.children_goods = children_goods;
    }

    public int getIs_group() {
        return is_group;
    }

    public void setIs_group(int is_group) {
        this.is_group = is_group;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public MerchantBean getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantBean merchant) {
        this.merchant = merchant;
    }

    public int getShop_cart_count() {
        return shop_cart_count;
    }

    public void setShop_cart_count(int shop_cart_count) {
        this.shop_cart_count = shop_cart_count;
    }

    public List<?> getSupported_services() {
        return supported_services;
    }

    public void setSupported_services(List<?> supported_services) {
        this.supported_services = supported_services;
    }

    public List<?> getActivity_label() {
        return activity_label;
    }

    public void setActivity_label(List<?> activity_label) {
        this.activity_label = activity_label;
    }

    public List<?> getNutrition_collocation_lists() {
        return nutrition_collocation_lists;
    }

    public void setNutrition_collocation_lists(List<?> nutrition_collocation_lists) {
        this.nutrition_collocation_lists = nutrition_collocation_lists;
    }

    public List<PicListBean> getPic_list() {
        return pic_list;
    }

    public void setPic_list(List<PicListBean> pic_list) {
        this.pic_list = pic_list;
    }




}