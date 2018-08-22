package cn.com.cintel.sky_android.fragment.ScanFragment;

import java.util.List;

import cn.com.cintel.sky_android.bean.ScanFragment.ScanList;

/**
 * Created by sky on 2018/8/22.
 */
public class ScanPresenter implements ScanContract.Presenter{

    private ScanContract.Model model;
    private ScanContract.View view;

    public ScanPresenter(ScanContract.View view) {
        this.view = view;
        this.model = new ScanModel();
    }


    @Override
    public void initScanList() {

        List<ScanList> scanLists = model.initScanListData();

        view.initScanListView(scanLists);
    }
}
