package info.camposha.retrofitlistviewjson.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.util.List;
import info.camposha.retrofitlistviewjson.R;
import info.camposha.retrofitlistviewjson.models.Spacecraft;

public class ListViewAdapter extends BaseAdapter {

        private List<Spacecraft> spacecrafts;
        private Context context;

        public ListViewAdapter(Context context,List<Spacecraft> spacecrafts){
            this.context = context;
            this.spacecrafts = spacecrafts;
        }

        @Override
        public int getCount() {
            return spacecrafts.size();
        }

        @Override
        public Object getItem(int pos) {
            return spacecrafts.get(pos);
        }

        @Override
        public long getItemId(int pos) {
            return pos;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if(view==null)
            {
                view=LayoutInflater.from(context).inflate(R.layout.model,viewGroup,false);
            }

            TextView nameTxt = view.findViewById(R.id.nameTextView);

            ImageView spacecraftImageView = view.findViewById(R.id.spacecraftImageView);



            TextView clubTxt = view.findViewById(R.id.club);

            TextView footTxt = view.findViewById(R.id.foot);

            JustifiedTextView deskripsiTxt = view.findViewById(R.id.deskripsi);

            final Spacecraft thisSpacecraft= spacecrafts.get(position);

            nameTxt.setText(thisSpacecraft.getName());

            clubTxt.setText("Klub Bermain:" + thisSpacecraft.getClub());
            footTxt.setText("Kaki dominan :" +thisSpacecraft.getFoot());
            deskripsiTxt.setText(thisSpacecraft.getDeskripsi());



            if(thisSpacecraft.getImageURL() != null && thisSpacecraft.getImageURL().length()>0)
            {
                Picasso.get().load(thisSpacecraft.getImageURL()).placeholder(R.drawable.placeholder).into(spacecraftImageView);
            }else {
                Toast.makeText(context, "Empty Image URL", Toast.LENGTH_LONG).show();
                Picasso.get().load(R.drawable.placeholder).into(spacecraftImageView);
            }

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, thisSpacecraft.getName(), Toast.LENGTH_SHORT).show();
                }
            });

            return view;
        }



}