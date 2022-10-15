package View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibo.mymoveis.R;

public class DetailsActivity extends AppCompatActivity {
    TextView textView,textView1,textView2;
    ImageView imageView;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        bundle=getIntent().getExtras();

        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView2);
        textView2=findViewById(R.id.textView3);
        imageView=findViewById(R.id.imageView2);

        textView.setText(bundle.getString("name"));
        textView1.setText(bundle.getString("year"));
        textView2.setText(bundle.getString("genre"));
        imageView.setImageResource(bundle.getInt("foto"));
    }
}