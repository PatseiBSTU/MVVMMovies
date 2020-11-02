package by.bstu.patsei.mvvmmovies.model;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface MovieDao {

    @Insert
    void insert(Movie movie);

    @Update
    void update(Movie movie);

    @Delete
    void delete(Movie movie);

    @Query("select * from movies_table")
    LiveData<List<Movie>> getAllMovies();

    @Query("select * from movies_table where genre_id==:genreId")
    LiveData<List<Movie>> getGenreMovies(int genreId);

}
