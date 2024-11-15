/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clemens
 */
public class Article {
    private List<String> articles = new ArrayList<>();

    public Article() {
        this.articles.add("November 15, 2024\nA new public park officially opened in downtown today, offering green space for locals to relax and exercise. The park features walking trails, a playground, and a small pond. The opening ceremony was attended by city officials and community members. Mayor Elena Clark praised the new park as a step towards improving urban livability.");

        this.articles.add("November 15, 2024\nSweet Treats Bakery, a family-owned business in the heart of the city, has been awarded the title of “Best Bakery in the Country” by the National Culinary Association. Known for their famous chocolate croissants, the bakery’s owners, the Martinez family, expressed their gratitude, saying it’s a dream come true.");

        this.articles.add("November 15, 2024\nA local high school has launched a mental health awareness program, aimed at supporting students through counseling services, peer mentorship, and stress-relief activities. The program, led by school counselor Lisa Daniels, is being praised for addressing the rising need for mental health resources in schools.");

        this.articles.add("November 15, 2024\nThe annual food drive in the city collected over 10,000 pounds of food for local shelters and food banks. Volunteers spent the day packing and distributing the donations, ensuring families in need have enough food this holiday season. The event saw a record turnout, with more than 200 volunteers participating.");

        this.articles.add("November 15, 2024\nCity streets are now home to a stunning new mural, created by local artist James Richards. The mural, which depicts a vibrant sunrise over a city skyline, is part of a public art initiative to enhance the city’s aesthetic. The mural has already become a popular spot for photos and community gatherings.");

        this.articles.add("November 15, 2024\nReaders were thrilled to meet bestselling author Emma Caldwell at the local independent bookstore yesterday. Caldwell signed copies of her latest novel, *Shadows of the Heart*, and discussed her creative process with fans. The event was a hit, drawing hundreds of literature enthusiasts.");

        this.articles.add("November 15, 2024\nA new bus line launched this week, providing a faster route for commuters between the city center and suburban areas. The new line is expected to reduce commute times by up to 25%, making it a popular option for those looking to avoid the morning rush hour.");

        this.articles.add("November 15, 2024\nFitLife Gym is offering free fitness classes to senior citizens every Tuesday and Thursday. The program includes low-impact exercises designed to improve flexibility and strength. “It’s a great way for older adults to stay active and healthy,” said gym owner Carla Peters.");

        this.articles.add("November 15, 2024\nA new recycling program has been introduced in local schools, encouraging students to collect plastic bottles, paper, and cans. The initiative is part of the city’s broader effort to reduce waste and teach environmental responsibility. Students are excited to participate and track their school’s recycling efforts.");

        this.articles.add("November 15, 2024\nA charity event held over the weekend raised $5,000 for the Riverdale Animal Shelter, which helps homeless pets find new homes. The event included a silent auction, bake sale, and pet adoption drive. Shelter director Angela Simmons expressed her gratitude, saying the funds will go toward improving animal care facilities.");

    }

    public String getArticle(int index) {
        return this.articles.get(index);
    }
    
    
}
