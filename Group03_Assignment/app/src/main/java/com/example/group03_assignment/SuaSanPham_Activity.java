package com.example.group03_assignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.group03_assignment.dao.Database;
import com.example.group03_assignment.model.SanPham;

import java.util.ArrayList;

public class SuaSanPham_Activity extends AppCompatActivity {
    Database database;



    ArrayList<SanPham> mangBS;
    SanPhamAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sua_san_pham);
        mangBS = new ArrayList<>();

        adapter = new SanPhamAdapter(this, mangBS, true);

        database = new Database(this, "banhang.db", null, 1);
        database.QueryData("CREATE TABLE IF NOT EXISTS sanpham(masp INTEGER PRIMARY KEY AUTOINCREMENT, tensp NVARCHAR(200),dongia FLOAT,mota TEXT,ghichu TEXT,soluongkho INTEGER,maso INTEGER , anh BLOB)");

    }
}