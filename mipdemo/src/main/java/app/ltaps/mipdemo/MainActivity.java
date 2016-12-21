package app.ltaps.mipdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ltaps.multipleimagepicker.MIP;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> path = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button findMip = (Button) findViewById(R.id.startMip);
        findMip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MIP.with(MainActivity.this)
                        .setPickerCount(20)
                        .setPickerSpanCount(3)
                        .setActionBarColor(Color.parseColor("#FF5722"), Color.parseColor("#E64A19"))
                        .textOnImagesSelectionLimitReached("Limit Reached!")
                        .textOnNothingSelected("Nothing Selected")
                        .setArrayPaths(path)
                        .setAlbumSpanCount(2, 4)
                        .setButtonInAlbumActivity(true)
                        .setCamera(true)
                        .setReachLimitAutomaticClose(false)
                        .startAlbum();
            }
        });
    }
}
