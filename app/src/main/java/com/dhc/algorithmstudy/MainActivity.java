package com.dhc.algorithmstudy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dhc.algorithmstudy.tree.HierarchyTraverse;
import com.dhc.algorithmstudy.tree.TreeBuilder;

public class MainActivity extends AppCompatActivity {
    private Button mPrintHierarchyTraverseTree;
    private TextView mDisplayTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplayTv = findViewById(R.id.tv_display);

        mPrintHierarchyTraverseTree = findViewById(R.id.btn_hierarchyTraverseTree);
        mPrintHierarchyTraverseTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplayTv.setText("");
                HierarchyTraverse.printTree(TreeBuilder.build(), mDisplayTv);
            }
        });
    }
}