package com.example.a1sters06.networkcommunicationreal;

/*
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadActivity extends AppCompatActivity implements View.OnClickListener {

    class MyTask extends AsyncTask<String,Void,String>
    {
        public String doInBackground(String... arguments)
        {
            HttpURLConnection conn = null;
            try
            {
                URL url = new URL("http://www.free-map.org.uk/course/mad/ws/hits.php?artist=Oasis&format=json");
                conn = (HttpURLConnection) url.openConnection();
                InputStream in = conn.getInputStream();
                if(conn.getResponseCode() == 200)
                {
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String result = "", line;
                    while((line = br.readLine()) !=null)
                        result += line;
                    return result;
                }
                else
                    return "HTTP ERROR: " + conn.getResponseCode();

            }
            catch(IOException e)
            {
                return e.toString();
            }
            finally
            {
                if(conn!=null)
                    conn.disconnect();
            }
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        Button download = (Button)findViewById(R.id.downloadSongsButton);
        download.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText urlEditText = (EditText)findViewById(R.id.urlEditText);
        String url = urlEditText.getText().toString();

        EditText artistEditText = (EditText)findViewById(R.id.artistEditText);
        String artist = artistEditText.getText().toString();

        new DownloadSongsAsyncTask().execute(url, artist);


    }

    class DownloadSongsAsyncTask extends AsyncTask<String, Void, String> {

        private  static final int HTTP_OK = 200;


        @Override
        protected String doInBackground(String...params){
            String url = params[0];
            String artist = params[1];

            HttpURLConnection connection;

            try {
                URL urlObject = new URL(url + "?artist=" + artist);
                connection = (HttpURLConnection) urlObject.openConnection();

                if (connection.getResponseCode() == HTTP_OK) {
                    InputStream in = connection.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));

                    String lines = "";
                    String line = br.readLine();
                    while (line != null) {
                        lines += line;
                        line = br.readLine();
                    }

                    return lines;
                }
            }
            catch (IOException e) {
                return "Error: " + e.getMessage();
            }

            return "Error: something went wrong!";

        }

        @Override
        protected void onPostExecute(String songs){
            TextView songsTextView = (TextView) findViewById(R.id.songsTextView);
            songsTextView.setText(songs);
        }
    }
}
*/