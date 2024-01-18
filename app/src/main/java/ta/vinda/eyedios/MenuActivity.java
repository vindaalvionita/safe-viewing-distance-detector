package ta.vinda.eyedios;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class MenuActivity extends Activity {
    ImageView btn_detector, btn_info, btn_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(R.layout.menu_activity);
        btn_detector = (ImageView) findViewById(R.id.btn_detector);
        btn_info = (ImageView) findViewById(R.id.btn_info);
        btn_about = (ImageView) findViewById(R.id.btn_about);


        btn_detector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MenuActivity.this, MeasurementActivity.class);
                startActivity(intent);
            }
        });
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MenuActivity.this, Information.class);
                startActivity(intent);
            }
        });
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(MenuActivity.this, About.class);
                startActivity(intent);
            }
        });


    }
}
