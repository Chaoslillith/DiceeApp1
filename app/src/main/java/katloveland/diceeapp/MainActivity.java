package katloveland.diceeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.right;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollbutton);
        ImageView leftDice = (ImageView)  findViewById(R.id.image_leftdice);
        ImageView rightdice = (ImageView) findViewById(R.id.image_rightdice);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Ze Button has been pressed!") ;
            }
        });
    }
}
