package cn.com.cintel.sky_android.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.com.cintel.sky_android.R;

/**
 * @Author: sky
 * @Description:
 * @Date: Create in 11:34 2018/8/15
 */
public class ScanFragment extends Fragment {


    @BindView(R.id.container02)
    TextView container02;
    Unbinder unbinder;
    private View view;

    public static ScanFragment newInstance(String param1) {
        ScanFragment fragment = new ScanFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public ScanFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.scan_fragment, container, false);

        unbinder = ButterKnife.bind(this, view);
        Bundle bundle = getArguments();
        String agrs1 = (String) bundle.get("agrs1");
        container02.setText(agrs1);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
