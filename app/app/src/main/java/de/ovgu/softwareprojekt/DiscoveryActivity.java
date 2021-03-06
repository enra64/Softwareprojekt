package de.ovgu.softwareprojekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import de.ovgu.softwareprojekt.server_discovery.Discovery;

public class DiscoveryActivity extends AppCompatActivity implements Discovery.OnDiscoveryListener {

    Button mStartDiscovery;
    ListView mPossibleConnections;
    List<Discovery.Server> mServerList;
    Discovery mDiscovery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discovery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mStartDiscovery = (Button) findViewById(R.id.startDiscovery);
        mStartDiscovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDiscovery.startDiscovery(DiscoveryActivity.this);
            }
        });

        mPossibleConnections = (ListView) findViewById(R.id.possibleConnections);

        mPossibleConnections.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DiscoveryActivity.this, SendActivity.class);
                intent.putExtra("Name", mServerList.get(i).name);
                intent.putExtra("Address" , mServerList.get(i).address);
                intent.putExtra("Port", mServerList.get(i).port);

                DiscoveryActivity.this.startActivity(intent);
            }
        });

    }

}
