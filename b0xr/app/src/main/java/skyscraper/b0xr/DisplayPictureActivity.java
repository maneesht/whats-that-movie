package skyscraper.b0xr;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DisplayPictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_picture);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent receivedIntent = getIntent();
        Bundle extras = receivedIntent.getExtras();
        Toast.makeText(this, "Image saved to:", Toast.LENGTH_LONG).show();
        Bitmap imageBitmap = (Bitmap) extras.get("data");
        ImageView imageView = (ImageView) findViewById(R.id.previewImage);
        imageView.setImageBitmap(imageBitmap);
    }

}
