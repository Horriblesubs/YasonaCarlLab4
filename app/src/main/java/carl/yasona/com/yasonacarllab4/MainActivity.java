package carl.yasona.com.yasonacarllab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Logger", "onCreate() has run");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Logger", "onStart() has run");
    }

    protected void onResume() {
        super.onResume();
        Log.d("Logger", "onResume() has run");
    }

    protected void onPause() {
        super.onPause();
        Log.d("Logger", "onPause() has run");
    }

    protected void onStop() {
        super.onStop();
        Log.d("Logger", "onStop() has run");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Logger", "onRestart() has run");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Logger", "onDestroy() has run");
    }

    public void showToast(View v){
        Toast.makeText(this, "Going Back...", Toast.LENGTH_LONG).show();
    }

    public void showSnackbar(View v){
        Snackbar.make(v,"Going Next...", Snackbar.LENGTH_LONG).show();
    }
}
