package com.example.a1sters06.networkcommunicationreal;

/*
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.net.URL;

public class AddSongActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_song);

        Button addSongButton = (Button) findViewById(R.id.addSongButton);
        addSongButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText songTitleEditText = (EditText) findViewById(R.id.songTitleEditText);
        String songTitle = songTitleEditText.getText().toString();

        EditText artistEditText = (EditText) findViewById(R.id.artistEditText);
        String artist = artistEditText.getText().toString();

        EditText yearEditText = (EditText) findViewById(R.id.yearEditText);
        String year = yearEditText.getText().toString();

        (new AddSongAsyncTask()).execute(songTitle, artist, year);

    }

    class AddSongAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            String postData = "songs=" + params[0] + "&artist=" + params[1] + "&years=" + params[2];

            try {
                URL urlObject = new URL("bhttp://www.free-map.org.uk/course/mad/ws/addhit.php");
            } catch (IOException e) {
                return "Error";
            }

            return null;
        }

    }

}


*/