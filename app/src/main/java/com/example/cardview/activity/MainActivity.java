package com.example.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.adapter.PostAdapter;
import com.example.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPost;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = (RecyclerView)findViewById(R.id.recyclerPost);

        //Setup Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPost.setLayoutManager(layoutManager);

        // Setup Adapter
        this.preparatePosts();
        PostAdapter adapter = new PostAdapter(posts);
        recyclerPost.setAdapter(adapter);

    }

    public void preparatePosts(){
        Post p = new Post("Antonio Coutinho","#tbt Trip Cool",R.drawable.imagem1);
        this.posts.add(p);

        p = new Post("Antonio Coutinho","#Save Money and enjoy",R.drawable.imagem2);
        this.posts.add(p);

        p = new Post("Antonio Coutinho","#tbt France",R.drawable.imagem3);
        this.posts.add(p);

        p = new Post("Antonio Coutinho","#tbt Beautiful Picture",R.drawable.imagem4);
        this.posts.add(p);

    }
}
