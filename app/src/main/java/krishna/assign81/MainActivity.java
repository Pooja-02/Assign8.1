package krishna.assign81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.Arrays;
import java.util.Collections;





public class MainActivity extends AppCompatActivity {
        //defing two button
        Button ascending,descending;
        ListView List;
    final String[] months = {"January", "Febrary", "March", "April", "June", "July", "August", "September", "October", "November", "December"
    };
        //using adapter in which string array is passed
       // ArrayAdapter<String> adapter;
       // ArrayList<String> list;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //passing months into a string array

            //defining a list viewList = (ListView) findViewById(R.id.list);
            //initialising button,listview
           adapter();//
           ascending=(Button)findViewById(R.id.button);
            descending=(Button)findViewById(R.id.button2);
            //adding onclick functions
            ascending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Arrays.sort(months);//sorts of string elements in alphabtical order
                    adapter();//calling adapter method
                }
            });
            descending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Arrays.sort(months, Collections.<String>reverseOrder());//sorts of string elements in reverse alphabtical order
                    adapter();//calling adapter method
                }
            });
        }
        //creating a new adapter method
        public void adapter(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        //defining a list view

        List=(ListView)findViewById(R.id.list);
        List.setAdapter(adapter);
    }

        public boolean onCreateOptionsMenu(Menu menu) {
            /* Inflate the menu; this adds items to the action bar if it is present. */
            getMenuInflater().inflate(R.menu.main, menu);
            return true;



        }


}

