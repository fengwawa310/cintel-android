package cn.com.cintel.sky_android.fragment.ScanFragment;

import java.util.List;

import cn.com.cintel.sky_android.bean.ScanFragment.ScanList;

/**
 * Created by sky on 2018/8/22.
 */
public interface ScanContract {

    public interface View{
        void initScanListView(List<ScanList> scanLists);
    }

    public interface Model{
        List<ScanList> initScanListData();
    }

    public interface Presenter{
        void initScanList();
    }

}
