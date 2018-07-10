package myasynctaskloader.com.example.syifaa.pdfreader;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

ListView listView;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rootView = inflater.inflate(R.layout.fragment_list, container, false);
       listView =(ListView) rootView.findViewById(R.id.list);
       String [] values = new String[] {
               "Animasi Menggunakan Blender Editing Object Kursi",
               "Animasi Menggunakan Blender Editing Object Gelas dan Pewarnaannya",
               "Animasi Menggunakan Blender Animasi dengan Physicys"
       };
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView.getItemAtPosition(position);
                if (position == 0){
                    PDF_Blender_Fragment Blender_fragment = new PDF_Blender_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("key" , 0);
                    Blender_fragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, Blender_fragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 1) {
                    PDF_Blender_Fragment Blender_fragment = new PDF_Blender_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("key" , 1);
                    Blender_fragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, Blender_fragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 2){
                    PDF_Blender_Fragment Blender_fragment = new PDF_Blender_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("key" , 2);
                    Blender_fragment.setArguments(args);
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, Blender_fragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
            }
        });
       return rootView;
    }

}
