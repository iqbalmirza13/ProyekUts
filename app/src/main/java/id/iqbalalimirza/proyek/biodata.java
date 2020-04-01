package id.iqbalalimirza.proyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.iqbalalimirza.proyek.adapter.ListPemainAdapter;

public class biodata extends AppCompatActivity {

    private TextView textBiodata;
    private ImageView imageView;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        name= findViewById(R.id.text_name);
        textBiodata=findViewById(R.id.biodata_pemain);
        imageView=findViewById(R.id.foto_pemain);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            name.setText(extras.getString("detail_nama"));
            textBiodata.setText(extras.getString("detail_biodata"));

        }

    }
}
