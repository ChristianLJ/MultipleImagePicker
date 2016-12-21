package app.ltaps.mipdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import app.ltaps.multipleimagepicker.MIP;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> path = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tryBtn = (Button) findViewById(R.id.tryBtn);
        tryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MIP.with(MainActivity.this)
                        .setPickerCount(20)
                        .setPickerSpanCount(3)
                        .setProvider("app.ltaps.mipdemo")
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
