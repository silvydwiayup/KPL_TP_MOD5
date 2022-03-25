/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod5;

/**
 *
 * @author silvy dwi ayu puspita
 */
import java.util.Random;
public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;

    public SayaTubeVideo(String x) {
        Random y = new Random();
        this.id = y.nextInt(99999);
        this.title = x;
        playCount = 0;
    }

    public void IncreasePlayCount(int x) {
        playCount ++;
        try {
            this.playCount += x;
        }
        catch (Exception exception) {
            System.out.print(exception.toString());
        }
    }

    public void PrintVideoDetails() {
        System.out.println("Id : " + id);
        System.out.println("Title : " + title);
        System.out.println("PlayCount : " + playCount);
    }
}
