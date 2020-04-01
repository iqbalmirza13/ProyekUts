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
            "kartika aji",
            "ciko",
            "alfarizi",
            "jayus",
            "dedik",
            "dendi",
            "elderte",
            "fian",
            "hanif",
            "inkyun",
            "malvino",
            "rafli",
            "ridwan",
            "saiful",
            "teguh"
    };

    public static String biodata[] = {
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
            "LOREN DOLOER IPSUM LOREN DOLOER",
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
            "LOREN DOLOER IPSUM LOREN DOLOER",
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
            "LOREN DOLOER IPSUM LOREN DOLOER",
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
            "LOREN DOLOER IPSUM LOREN DOLOER",
            "IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN D",
            "OLOER IPSUM LOREN DOLOER IPSUM LOREN DOLOER IPSUM LOREN ",
            "DOLOER IPSUM LOREN DOLOER IPSUM ",
    };


    public static int foto_pemain[] = {
            R.drawable.bauman,
            R.drawable.yudo,
            R.drawable.hendro,
            R.drawable.bagas,
            R.drawable.aji,
            R.drawable.ciko,
            R.drawable.alfarizi,
            R.drawable.jayus,
            R.drawable.dedik,
            R.drawable.dendi,
            R.drawable.elderte,
            R.drawable.fian,
            R.drawable.hanif,
            R.drawable.inkyun,
            R.drawable.malvino,
            R.drawable.rafli,
            R.drawable.ridwan,
            R.drawable.saiful,
            R.drawable.teguh



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
