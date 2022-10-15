package Controller;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibo.mymoveis.R;

import java.util.List;

import Model.Movie;
import View.DetailsActivity;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    List<Movie>movieList;
    Context context;

    public MoviesAdapter(Context context,List<Movie> movieList) {
        this.movieList = movieList;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list_row,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MyViewHolder myViewHolder, int i) {

        Movie movie=movieList.get(i);
        myViewHolder.titlem.setText(movie.getTitle());
        myViewHolder.genrem.setText(movie.getGenre());
        myViewHolder.yearm.setText(movie.getYear());
        myViewHolder.imagem.setImageResource(movie.getImage());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView titlem,genrem,yearm;
        ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titlem=itemView.findViewById(R.id.title);
            genrem=itemView.findViewById(R.id.genre);
            yearm=itemView.findViewById(R.id.year);
            imagem=itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie=movieList.get(position);
            Intent intent=new Intent(context, DetailsActivity.class);
            intent.putExtra("foto",movie.getImage());
            intent.putExtra("name",movie.getTitle());
            intent.putExtra("year",movie.getYear());
            intent.putExtra("genre",movie.getGenre());
            context.startActivity(intent);

        }
    }
}
