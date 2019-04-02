package com.step.assignments;

import java.util.*;

public class Playlist {


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Song song1 = new Song("song1", "4mins");
        Song song2 = new Song("song2", "4mins 10 secs");
        Song song3 = new Song("song3", "4mins 33 secs");
        Song song4 = new Song("song4", "5mins 12secs");
        Song song5 = new Song("song5", "4mins 45secs");

        LinkedList<Song> songs = new LinkedList<>();

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

        Album album1 = new Album(songs);
        ArrayList<Album> albums = new ArrayList<>();

        LinkedList<Song> playList = new LinkedList<>();

        playList.add(song1);
        playList.add(song2);
        playList.add(song3);
        playList.add(song4);
        playList.add(song5);

        ListIterator<Song> songListIterator = playList.listIterator();

//        Iterator<Song> iterator = playList.listIterator();
//        for (Song song : playList) {
//            if(iterator.hasNext()){
//                Song next = iterator.next();
//
//
//                System.out.println(next.getSongDetail());
//            }
//
//        }

        int choice = 0;

        boolean quit = false;

        while (!quit) {
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    quit = true;
                    break;
                case 1:
                    printPlayList(songListIterator);
                case 2:
                    skipForward(songListIterator);
                    break;
                case 3:
                    skipBackward(songListIterator);
                    break;
//                case 4:
//                    replay();
//                    break;
            }
        }
    }

    private static void printPlayList(ListIterator<Song> songListIterator) {



    }


    public static void skipForward(ListIterator<Song> songListIterator) {

        if (songListIterator.hasNext()){
            Song nextSong = songListIterator.next();
            System.out.println("playing....." + nextSong.getSongDetail());
            return;
        }
        System.out.println("Reached to the end of the playlist");

    }

    public static void skipBackward(ListIterator<Song> songListIterator) {
        if (songListIterator.hasPrevious()){
            Song previousSong = songListIterator.previous();
            System.out.println("playing....." + previousSong.getSongDetail());
            return;
        }
        System.out.println("Reached to the beginning of the playlist");
    }

    public static void replay() {

    }

    public static void printInstructions(){

        System.out.println("Press 0 to quit\n");
        System.out.println("Press 1 to skip forward\n");

    }
}
