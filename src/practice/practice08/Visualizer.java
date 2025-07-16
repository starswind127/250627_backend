package practice.practice08;

public class Visualizer {
    String getStars( int x ){
        String word = "";
        for( int i = 1 ; i <= x ; i++ ){
            word += "★";
        }
        return word;
    }
}