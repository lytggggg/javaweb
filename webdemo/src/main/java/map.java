import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class map {
    private  String lnglat[];
     private String url;

    @Override
    public String toString() {
        return "map{" +
                "lnglat=" + Arrays.toString(lnglat) +
                ", url='" + url + '\'' +
                '}';
    }

    public String[] getLnglat() {
        return lnglat;
    }

    public void setLnglat(String[] lnglat) {
        this.lnglat = lnglat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /* public static void main(String[] args) {

    }*/
}
