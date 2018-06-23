package richphan.fragmentdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import richphan.fragmentdemo.R;
import richphan.fragmentdemo.fragment.Frag1;
import richphan.fragmentdemo.fragment.Frag2;
import richphan.fragmentdemo.fragment.Frag3;
import richphan.fragmentdemo.utils.BaseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFrag1, btnFrag2, btnFrag3;
    BaseActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
    }

    private void initLayout() {
        btnFrag1 = findViewById(R.id.btnFrag1);
        btnFrag2 = findViewById(R.id.btnFrag2);
        btnFrag3 = findViewById(R.id.btnFrag3);
        btnFrag1.setOnClickListener(this);
        btnFrag2.setOnClickListener(this);
        btnFrag3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFrag1:
                Frag1 frag1 = new Frag1();
                activity.addFrag(R.id.fragContainer,frag1);
                break;
            case R.id.btnFrag2:
                Frag2 frag2 = new Frag2();
                activity.addFrag(R.id.fragContainer,frag2);
                break;
            case R.id.btnFrag3:
                Frag3 frag3 = new Frag3();
                activity.addFrag(R.id.fragContainer,frag3);
                break;
        }
    }
}
