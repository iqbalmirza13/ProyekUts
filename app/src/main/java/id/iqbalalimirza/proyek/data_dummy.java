package id.iqbalalimirza.proyek;

import android.media.Image;

import java.util.ArrayList;

import id.iqbalalimirza.proyek.model.model_pemain;

public class data_dummy {

    public static String playername[] = {
            "yudo",
            "bauman",
            "hendro",
            "bagas",
            "kartika aji"
    };

    public static String biodata[] = {
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
            "LOREN DOLOER IPSUM LOREN DOLOER"
    };


    public static int foto_pemain[] = {

    };

    static ArrayList<model_pemain> getListData() {
        ArrayList<model_pemain> List = new ArrayList<>();
        for (int position = 0; position < playername.length; position++) {
            model_pemain pemain = new model_pemain();
            pemain.setNama(playername[position]);
            pemain.setBiodata(biodata[position]);
            pemain.setFoto_pemain(foto_pemain[position]);
            List.add(pemain);
        }
        return List;
    }
}
