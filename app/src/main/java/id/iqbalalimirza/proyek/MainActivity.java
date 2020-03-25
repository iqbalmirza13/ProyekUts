package id.iqbalalimirza.proyek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.iqbalalimirza.proyek.adapter.ListPemainAdapter;
import id.iqbalalimirza.proyek.model.model_pemain;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPemain;
    private ArrayList<model_pemain> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPemain = findViewById(R.id.rvbiodata);
        list.addAll(data_dummy.getListData());
        rvPemain.setLayoutManager(new LinearLayoutManager(this));
        ListPemainAdapter listPemainAdapter = new ListPemainAdapter(list);
        rvPemain.setAdapter(listPemainAdapter);


    }
}
