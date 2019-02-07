package tw.tcnr01.custom_dialog_user_pwd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewUsername;
    private TextView textViewPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupVIewComponent();
    }

    private void setupVIewComponent() {
        textViewUsername = (TextView) findViewById(R.id.textview_username);
        textViewPassword = (TextView) findViewById(R.id.textview_password);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //開啓dialog
        openDialog();
    }

    private void openDialog() {

    }
}
