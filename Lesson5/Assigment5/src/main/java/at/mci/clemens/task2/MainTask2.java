/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;
import java.util.Random;

/**
 *
 * @author Clemens
 */
public class MainTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        Article article = new Article();
        APA apa = new APA();
        TirolienDayPaper ttt = new TirolienDayPaper();
        apa.attach(ttt);
        apa.attach(new Krone());
        apa.attach(new FsFe());
        
        apa.releasePaper(article.getArticle(random.nextInt(10)));
        apa.detach(ttt);
        System.out.println("-------------------------------------------------------");
        apa.releasePaper(article.getArticle(random.nextInt(10)));
        System.out.println("-------------------------------------------------------");
        apa.releasePaper(article.getArticle(random.nextInt(10)));
        System.out.println("-------------------------------------------------------");
        apa.releasePaper(article.getArticle(random.nextInt(10)));
        
               
    }
}
