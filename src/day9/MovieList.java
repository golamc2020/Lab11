package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args)  

    {
        System.out.println("Welcome to the Movie List Application");
        System.out.println();
        System.out.println("There are 10 movie in the list.");
        System.out.println();
        String choice = "yes";
        Scanner sc = new Scanner(System.in);

        ArrayList<String> animated = new ArrayList<>();
         animated.add("Family Guy");
         animated.add("Up");
         animated.add("Moana");
        


         ArrayList<String>drama = new ArrayList<>();
         drama.add("365 Days");
         drama.add("Joker");
         
         
         
         ArrayList<String> horror = new ArrayList<>();
         horror.add("The Invisible Man");
         horror.add("Halloween");
         horror.add("Truth Or Dare");
         

         ArrayList<String> scifi = new ArrayList<>();
         scifi.add("Guardians Of The Galaxy");
         scifi.add("Mad Max: Fury Road");
         

        while(choice.equals("yes"))
        	
        {
            System.out.println("What category are you interested in? (animated, drama, horror, scifi): ");

                        String movielist = sc.nextLine();
                    switch (movielist) {
                        case "animated":
                            System.out.println(animated);
                            break;
                        case "drama":
                            System.out.println(drama);
                            break;
                        case "horror":
                            System.out.println(horror);
                            break;
                        case "scifi":
                            System.out.println(scifi);
                            break;
                    }

            System.out.print("Continue? yes/no): ");
            choice = sc.nextLine();
            }System.out.println("Goodbye!!!");
                    }
	
}
