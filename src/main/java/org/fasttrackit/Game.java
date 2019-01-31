package org.fasttrackit;

public class Game {

private Track[] tracks = new Track[10];

    Vehicle fistComeptitor;
    Vehicle secondCompetitor;

    public void start(){
        addTracks();
        displayAvaibleTracks();

    }



    private void addTracks(){
        Track track1 = new Track("Highway",300);
        Track track2 = new Track("Seaside",100);

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvaibleTracks(){
        System.out.println("AvaibleTracks:");
        System.out.println(tracks[0].getName());
        System.out.println(tracks[1].getName());


    }
}


