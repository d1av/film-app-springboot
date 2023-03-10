package io.davi.film.dto;

import io.davi.film.entities.Movie;
import io.davi.film.entities.Review;
import io.davi.film.entities.User;

import javax.validation.constraints.NotBlank;

public class ReviewDTO {
    private Long id;

    @NotBlank(message = "Campo requerido")
    private String text;
    private Long movieId;
    private UserDTO user;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, Long movieId, User user) {
        this.id = id;
        this.text = text;
        this.movieId = movieId;
        this.user = new UserDTO(user);
    }

    public ReviewDTO(Review entity) {
        id = entity.getId();
        text = entity.getText();
        movieId = entity.getMovie().getId();
        user = new UserDTO(entity.getUser());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
