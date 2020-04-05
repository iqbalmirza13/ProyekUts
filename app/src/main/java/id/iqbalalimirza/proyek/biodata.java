package id.iqbalalimirza.proyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

import id.iqbalalimirza.proyek.adapter.ListPemainAdapter;

public class biodata extends AppCompatActivity {

    private TextView textBiodata;
    private ImageView imageView;
    private TextView nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        nama= findViewById(R.id.nama_pemain);
        textBiodata=findViewById(R.id.biodata_pemain);
        imageView=findViewById(R.id.foto_pemain);



        Bundle extras = getIntent().getExtras();
        if (extras != null){
            nama.setText(extras.getString(MainActivity.NAMA_KEY));
            textBiodata.setText(extras.getString(MainActivity.DETAIL_KEY));
            Glide.with(this)
                    .load((extras.getInt(MainActivity.FOTO_KEY)))
                    .apply(new RequestOptions().override(350,550))
                    .into(imageView);
        }
    }
}
