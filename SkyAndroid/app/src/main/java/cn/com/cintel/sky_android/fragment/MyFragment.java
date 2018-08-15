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
public class MyFragment extends Fragment {


    @BindView(R.id.container03)
    TextView container03;
    Unbinder unbinder;
    private View view;

    public static MyFragment newInstance(String param1) {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public MyFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.my_fragment, container, false);

        unbinder = ButterKnife.bind(this, view);
        Bundle bundle = getArguments();
        String agrs1 = (String) bundle.get("agrs1");
        container03.setText(agrs1);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
