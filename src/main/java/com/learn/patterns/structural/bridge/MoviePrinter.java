package com.learn.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
  private Movie movie;

  public MoviePrinter(Movie movie) {
    this.movie = movie;
  }

  @Override
  List<Detail> getDetails() {
    List<Detail> details = new ArrayList<>();
    details.add(new Detail("Title", movie.getTitle()));
    details.add(new Detail("Year", movie.getYear()));
    details.add(new Detail("Runtime", movie.getRuntime()));
    return details;
  }

  @Override
  String getHeader() {
    return movie.getClassification();
  }
}