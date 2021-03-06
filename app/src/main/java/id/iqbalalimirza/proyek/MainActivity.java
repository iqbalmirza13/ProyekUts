package id.iqbalalimirza.proyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.iqbalalimirza.proyek.adapter.ListPemainAdapter;
import id.iqbalalimirza.proyek.model.model_pemain;

public class MainActivity extends AppCompatActivity implements ListPemainAdapter.OnItemListener{
    private RecyclerView rvPemain;
    private ArrayList<model_pemain> list = new ArrayList<>();
    public static final String NAMA_KEY ="yudo";
    public static final String DETAIL_KEY = "asd";
    public static final String FOTO_KEY = "1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPemain = findViewById(R.id.rvbiodata);
        list.addAll(data_dummy.getListData());

        rvPemain.setLayoutManager(new LinearLayoutManager(this));
        ListPemainAdapter listPemainAdapter = new ListPemainAdapter(list,this);
        rvPemain.setAdapter(listPemainAdapter);
    }

    @Override
    public void onListClicked(int index, model_pemain item) {
        Intent intent = new Intent(this, biodata.class);
        String nama = item.getNama();
        String biodata = item.getBiodata();
        int foto = item.getFoto_pemain();
        intent.putExtra(FOTO_KEY, foto);
        intent.putExtra(NAMA_KEY,nama);
        intent.putExtra(DETAIL_KEY, biodata);
        startActivity(intent);
    }
}
