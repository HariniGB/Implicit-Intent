package balakrishnan.harini.assignment2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText urlInput;
    EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchURL(View v) {
        Intent implicit = null, chooser = null;
        urlInput = (EditText) findViewById(R.id.editTextUrl);
        String url = urlInput.getText().toString();
//        if (!url.contains("http://")) {
//            url = "http://" + url;
//        }
        Log.i("URL value", url);
        implicit = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        chooser = Intent.createChooser(implicit, "Choose browser of your choice");
        startActivity(chooser);
    }

    public void ringPhone(View v) {
        phoneNumber = (EditText) findViewById(R.id.editTextPhone);
        Log.i("Phone number", phoneNumber.getText().toString());
        String phoneNo = phoneNumber.getText().toString();
        Intent implicit = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNo));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(implicit);
    }

    public void closeApp(View v){
        MainActivity.this.finish();
    }

}
