package com.xuxe.hello;

import com.jagrosh.jlyrics.Lyrics;
import com.jagrosh.jlyrics.LyricsClient;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Hello {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Hello world!");
        getSong();
    }
    static void getSong() throws ExecutionException, InterruptedException {
        System.out.println("Enter a song name:");
        Scanner sc = new Scanner(System.in);
        LyricsClient client = new LyricsClient();
        Lyrics lyrics = client.getLyrics(sc.nextLine()).get();
        System.out.println(lyrics.getTitle()+" - "+lyrics.getAuthor()+"\n"+lyrics.getURL());
    }
}
