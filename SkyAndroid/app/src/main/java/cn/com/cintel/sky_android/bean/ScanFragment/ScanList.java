package cn.com.cintel.sky_android.bean.ScanFragment;

/**
 * Created by sky on 2018/8/22.
 */
public class ScanList {

    private String scanText;
    private String scanImage;

    public ScanList() {
    }

    public ScanList(String scanText, String scanImage) {
        this.scanText = scanText;
        this.scanImage = scanImage;
    }

    public String getScanText() {
        return scanText;
    }

    public void setScanText(String scanText) {
        this.scanText = scanText;
    }

    public String getScanImage() {
        return scanImage;
    }

    public void setScanImage(String scanImage) {
        this.scanImage = scanImage;
    }
}
