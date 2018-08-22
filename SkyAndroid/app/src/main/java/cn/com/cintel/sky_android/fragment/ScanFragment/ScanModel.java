package cn.com.cintel.sky_android.fragment.ScanFragment;

import java.util.ArrayList;
import java.util.List;

import cn.com.cintel.sky_android.bean.ScanFragment.ScanList;

/**
 * Created by sky on 2018/8/22.
 */
public class ScanModel implements ScanContract.Model {

    @Override
    public List<ScanList> initScanListData() {

        List<ScanList> scanLists = new ArrayList<>();

        ScanList scanList1 = new ScanList
                ("龙猫","https://img5q.duitang.com/uploads/item/201203/29/20120329004440_PzhFT.jpeg");
        ScanList scanList2 = new ScanList
                ("魔法小樱","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534950158191&di=5df0a161816600ed67616241b2e7fcf5&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201405%2F13%2F20140513082851_wAYNf.jpeg");
        ScanList scanList3 = new ScanList
                ("柯南","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534951598080&di=af772f4c8a8d69614859c7f27588dbe5&imgtype=0&src=http%3A%2F%2Fcyf-img.bdstatic.com%2Fimg_5944e2e87f22f_03a1c450f81486827f7e66863828838e.jpg");
        ScanList scanList4 = new ScanList
                ("乔巴","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534950183677&di=5caa3194f15be845e8080fdb697e1e23&imgtype=0&src=http%3A%2F%2Fs2.sinaimg.cn%2Fmw690%2F001Rrc37gy70H9OYfvzc1%26690");
        ScanList scanList5 = new ScanList
                ("一休","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534950209738&di=e3c1d922aae5c54d599477fb304a9403&imgtype=0&src=http%3A%2F%2Fimg.ph.126.net%2FIsf-0b2ubLEXJpxtdyS84g%3D%3D%2F3259761705287521743.jpg");

        scanLists.add(scanList1);
        scanLists.add(scanList2);
        scanLists.add(scanList3);
        scanLists.add(scanList4);
        scanLists.add(scanList5);

        return scanLists;
    }

}
