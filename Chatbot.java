
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        final String RESET = "\u001B[0m"; // Reset color
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String BLUE = "\u001B[34m";
        final String MAGENTA = "\u001B[35m";
        
        while (true) {
            System.out.print("Chick-Fil-A Bot!:" + RESET);
            String userInput = scanner.nextLine().toLowerCase();

            if (isGreeting(userInput)) {
                System.out.println(RED + "Hello, welcome to Chick-fil-a! How can I help you today?");
            } else if (userInput.contains("menu")) {
                System.out.println(YELLOW + "Our menu includes: sandwiches, salads, sides, desserts, drinks and more.");
            } else if (userInput.contains("popular")) {
                System.out.println(GREEN + "Our most popular items are our chicken sandwiches, waffle fries, and lemonade!");
            } else if (userInput.contains("tasty")) {
                System.out.println(CYAN + "The tastiest item on our menu is our famous chicken sandwich!");
            } else if (userInput.contains("yummy")) {
                System.out.println(BLUE + "The yummiest item on our menu is our famous chicken sandwich!");
            } else if (userInput.contains("favorite")) {
                System.out.println(MAGENTA + "My personal favorite items on the chick-fil-a menu are the chicken nuggets with waffle fries!");
            } else if (userInput.contains("fresh")) {
                System.out.println(RED + "The freshest foods on our menu include our salads and fruit!");
            } else if (userInput.contains("small")) {
                System.out.println(YELLOW + "The smallest item on our menu is our 5 piece chicken nuggets!");
            } else if (userInput.contains("big")) {
                System.out.println(GREEN + "The biggest item on our menu is our famous Chick-fil-A Deluxe Sandwich!");
            } else if (userInput.contains("calorie")) {
                System.out.println(CYAN + "Our food is primarily heavy on calories but if you're looking for something low calorie, try our salads!");
            } else if (userInput.contains("food") || userInput.contains("items")) {
                System.out.println(BLUE + "We offer a variety of delicious food, they are sandwiches, salads, sides, desserts, drinks and more.");
            } else if (userInput.contains("sandwich")) {
                System.out.println(MAGENTA + "The different sandwiches we offer include: Chick-fil-A Chicken Sandwich: chicken on a bun with pickles, Spicy Chicken Sandwich, Chick-fil-A Chicken Deluxe Sandwich: chicken with lettuce, tomato, and mayo. Chick-fil-A Grilled Chicken Sandwich: Grilled chicken on a bun with lettuce and tomato..");
            } else if (userInput.contains("salad")) {
                System.out.println(RED + "A healither choice includes: Market Salad: Grilled chicken, mixed greens, apples, berries, and nuts. Spicy Southwest Salad: Spicy grilled chicken, mixed greens, cheese, corn, black beans, and peppers. Side Salad: Mixed greens, cheese, and tomatoes.");
            } else if (userInput.contains("side")) {
                System.out.println(YELLOW + "We offer many different sides: Waffle Fries Waffle Potato Chips Mac & Cheese Superfood Side.");
            } else if (userInput.contains("kids menu")) {
                System.out.println(GREEN + "Our kids menu includes: Chick-fil-A's Kids' Meal includes 4-count Chick-fil-A Nuggets or 3-count Chicken Tenders, Waffle Fries or Fruit Cup, and a drink (milk or juice box).");
            } else if (userInput.contains("more")) {
                System.out.println(CYAN + "We offer many more food items like desserts, or treats, entres and catering. Was there something more specific you were looking for like our hours, secret menu, sauces?");
            } else if (userInput.contains("job")) {
                System.out.println(BLUE + "Visit the Chick-fil-A Careers Website: Go to https://www.chick-fil-a.com/careers. Search for Job Opportunities: and find job openings in your area. You can filter by location, job type, other criteria, and for example in California you need to be 16+ in age to be hired.");
            } else if (userInput.contains("secret menu")){
                System.out.println(MAGENTA + "Funny enough we don't have our own secret menu but many people have created a few combinations like Buffalo Chicken Sandwich, Spicy Char, Fried Chicken Club, Dirty Soda, Pimento Cheese and the Chicken nugget salad");
            } else if (userInput.contains("sauce")) {
                System.out.println(RED + "We offer many different sauces like our famous Chick-fil-A Sauce, Polynesian Sauce, Honey Mustard Sauce, Barbecue Sauce, Sweet & Spicy Sriracha Sauce, Creamy Salsa, and Garden Herb Ranch.");
            } else if (userInput.contains("hour")) {
                System.out.println(YELLOW + "Our hours are: Monday through Friday 11:00 AM - 9:00 PM, Saturday-Sunday 10:00 AM - 10:00 PM depending on location.");
            } else if (userInput.contains("cater")) {
                System.out.println(GREEN + "For catering we offer packaged meals and food trays. We have 8 different packaged meals and 17 different trays and we can deliver in quantities of 10, 25, 50, or more.");
            } else if (userInput.contains("dessert")) {
                System.out.println(CYAN + "We sell a variety of desserts including frosted drinks, milkshakes, ice cream, brownies, and cookies.");
            } else if (userInput.contains("treat")) {
                System.out.println(BLUE + "We sell a variety of treats including frosted drinks, milkshakes, ice cream, brownies, and cookies.");
            } else if (userInput.contains("entre")) {
                System.out.println(MAGENTA + "The entrées we sell include 8 different sandiches, chicken nuggets, chicken tenders, and cool wraps.");
            } else if (userInput.contains("drink")) {
                System.out.println(RED + "The drinks we sell include iced tea, lemonade, coffee, orange juice, apple juice, and soda.");
            } else if (userInput.contains("no")) {
                System.out.println(YELLOW + "That's okay! Let me know if there's anything else I can help you with.");
            } else if (userInput.contains("can i order") || userInput.contains("order")) {
                System.out.println(GREEN + "Of course! You can place an order directly through our mobile app or at the counter.");
            } else if (userInput.contains("i'm not sure") || userInput.contains("not sure")) {
                System.out.println(CYAN + "No problem! Let me know if you'd like me to recommend something or answer any specific questions.");
            } else if (userInput.contains("how do you work") || userInput.contains("how does this work")) {
                System.out.println(BLUE + "I'm here to help! You can ask me about our menu, hours, or anything else Chick-fil-A related.");
            } else if (userInput.contains("do you deliver")) {
                System.out.println(MAGENTA + "Yes, we deliver through various platforms like DoorDash, Uber Eats, and Grubhub, depending on your location.");
            } else if (userInput.contains("location") || userInput.contains("where are you")) {
                System.out.println(RED + "You can find us at multiple locations. Check our website or app to find the nearest Chick-fil-A.");
            } else if (userInput.contains("deals") || userInput.contains("discounts")) {
                System.out.println(YELLOW + "We occasionally offer deals and promotions through our mobile app. Make sure to download it!");
            } else if (userInput.contains("birthday") || userInput.contains("celebrate")) {
                System.out.println(GREEN + "We love birthdays! Some locations offer free treats on your birthday if you're registered on our app.");
            } else if (userInput.contains("allergy") || userInput.contains("allergies")) {
                System.out.println(CYAN + "We accommodate food allergies and provide allergen information. Please let us know if you have specific needs.");
            } else if (userInput.contains("healthy options") || userInput.contains("healthy")) {
                System.out.println(BLUE + "Our healthy options include the Market Salad, Grilled Chicken Sandwich, and Grilled Nuggets.");
            } else if (userInput.contains("catering")) {
                System.out.println(MAGENTA + "We offer catering services, including packaged meals and trays. Check our website for more details.");
            } else if (userInput.contains("spicy food") || userInput.contains("spicy")) {
                System.out.println(RED + "If you like spicy food, try our Spicy Chicken Sandwich or Spicy Southwest Salad.");
            } else if (userInput.contains("app")) {
                System.out.println(YELLOW + "Our app allows you to place orders, earn rewards, and access exclusive deals. Download it today!");
            } else if (userInput.contains("reward")) {
                System.out.println(GREEN + "Join our rewards program through the Chick-fil-A app to earn points and redeem them for free food.");
            } else if (userInput.isEmpty()) { //|| isGibberish(userInput)) {
                System.out.println(CYAN + "Hmm, I'm not sure what you mean. Try asking me about our menu or services!");
            } else if (isGreeting(userInput)) {
                System.out.println(BLUE + "Hello, welcome to Chick-fil-A! How can I help you today?");
            } else if (userInput.contains("help")) {
                System.out.println(MAGENTA + "How can I assist you? You can ask about our menu, hours, or anything Chick-fil-A related.");
            } else if (userInput.contains("bored")) {
                System.out.println(RED + "I'm sorry you're feeling bored! Maybe ordering some Chick-fil-A will cheer you up?");
            } else if (userInput.contains("sorry")) {
                System.out.println(YELLOW + "No need to apologize! I'm here to help however I can.");
            } else if (userInput.contains("hungry")) {
                System.out.println(GREEN + "You're in the right place! Let me know what you're craving, and I'll recommend something.");
            } else if (userInput.contains("thank you") || userInput.contains("thanks")) {
                System.out.println(CYAN + "You're very welcome! Let me know if you need anything else.");
            } else if (userInput.contains("what's up") || userInput.contains("sup")) {
                System.out.println(BLUE + "Not much! Just here to help you with all your Chick-fil-A questions.");
            } else if (userInput.contains("bye") || userInput.contains("goodbye")) {
                System.out.println(MAGENTA + "Goodbye! Hope to see you again soon.");
            } else if (userInput.contains("love you")) {
                System.out.println(RED + "Aww, thank you! We love our customers too.");
            } else if (userInput.contains("joke")) {
                System.out.println(YELLOW + "Why did the chicken join a band? Because it had the drumsticks!");
            } else if (userInput.contains("how are you")) {
                System.out.println(GREEN + "I'm just a chatbot, but I'm here to make your day better!");
            } else if (userInput.contains("order food")) {
                System.out.println(CYAN + "You can place an order online, in the app, or visit us at the nearest Chick-fil-A location!");
            } else if (userInput.contains("recommend")) {
                System.out.println(BLUE + "I recommend trying our Spicy Chicken Sandwich with Waffle Fries and a Milkshake. It's a classic combo!");
            } else if (userInput.contains("weather")) {
                System.out.println(MAGENTA + "I'm not a weather app, but I can definitely help you with Chick-fil-A menu recommendations!");
            } else if (userInput.contains("how much") || userInput.contains("price")) {
                System.out.println(RED + "Prices vary by location. Check out our website or app for specific menu pricing near you.");
            } else if (userInput.contains("favorite")) {
                System.out.println(YELLOW + "My favorite? I can't eat, but I hear the Mac & Cheese is amazing!");
            } else if (userInput.contains("funny")) {
                System.out.println(GREEN + "Why don’t eggs tell jokes? They’d crack each other up!");
            } else if (userInput.contains("who are you")) {
                System.out.println(CYAN + "I'm your friendly Chick-fil-A chatbot! How can I assist you today?");
            } else if (userInput.contains("eat chicken")) {
                System.out.println(BLUE + "Absolutely! Our chicken is top-notch and prepared fresh daily.");
            } else if (userInput.contains("done") || userInput.contains("get out") || userInput.contains("escape") || userInput.contains("leave")) {
                System.out.println(MAGENTA + "Alright, have a great day! Come back if you have more questions.");    
            } else {
                System.out.println(randomAnswer());
            }
 
 
 
 
          }
        }
 
 
        
 
        public static String randomAnswer() {
   
                String[] ans = new String[14];
                  ans[0] = "\nSorry, can you say that again?";
                  ans[1] = "\nI don't recognize this option, can you try again?";
                  ans[2] = "\nI'm not sure I understand. Can you please rephrase your question?";
                  ans[3] = "\nI'm not sure I follow. Perhaps ask about Chick-fil-A menu items, hours, or locations?";
                  ans[4] = "\nI'm sorry, I didn't catch that. Maybe try rephrasing?";
                  ans[5] = "\nI didn't quite understand that. Can you say it in a different way?";
                  ans[6] = "\nOops! That doesn't seem to match anything I know. Try again?";
                  ans[7] = "\nI don't quite get it. What are you trying to ask?";
                  ans[8] = "\nThat doesn't seem familiar. Could you ask about our menu, hours, or something specific?";
                  ans[9] = "\nHmm, I may need a bit more information to help you. Can you rephrase?";
                  ans[10] = "\nI'm here to help, but I didn't quite understand. Can you provide more details?";
                  ans[11] = "\nIt seems like I missed that. Could you rephrase or ask about our menu or services?";
                  ans[12] = "\nI might need a bit more detail to understand that. Could you ask again?";
                  ans[13] = "\nHmm, I didn't understand that. You can ask about our menu, hours, or services.";
               
                final int NUMBER_OF_RESPONSES = 14;
           
                double r = Math.random(); //
                int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
                String response = "";
           
                if (whichResponse == 0) {
                    response = ans[0];
                } else if (whichResponse == 1) {
                    response = ans[1];
                } else if (whichResponse == 2) {
                    response = ans[2];
                } else if (whichResponse == 3) {
                    response = ans[3];
                } else if (whichResponse == 4) {
                    response = ans[4];
                } else if (whichResponse == 5) {
                    response = ans[5];
                } else if (whichResponse == 6) {
                    response = ans[6];
                } else if (whichResponse == 7) {
                    response = ans[7];
                } else if (whichResponse == 8) {
                    response = ans[8];
                } else if (whichResponse == 9) {
                    response = ans[9];
                } else if (whichResponse == 10) {
                    response = ans[10];
                } else if (whichResponse == 11) {
                    response = ans[11];
                } else if (whichResponse == 12) {
                    response = ans[12];
                } else if (whichResponse == 13) {
                    response = ans[13];
                }
               
                return response;
              }
     
 
            
        
    

    public static boolean isGreeting(String message) {
        return message.contains("hi") || message.contains("hello") || message.contains("Hello") || message.contains("Hi") || message.contains("hey") || message.contains("HEY");
    }
}














































// import java.util.Scanner;
// public class Main
// {

//     //May want to create an array of goodbye answers.
//     static String[] goodBye = {"bye"};
   
//        public static void main(String[] args)
//        {
//         Scanner in = new Scanner(System.in);//Creates scanner object.
//         Scanner in2 = new Scanner(System.in);
//         //Scanner in2 = new Scanner (System.in);//Creates a second scanner object.

//         System.out.println("Hello! Welcome to Chick-Fil-A. How can I help you?");
//         String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's responnse as a String
//         //System.out.println(userResp);
//         System.out.println("Would you like to know about our menu, hours, or our most popular food items?");
//         String user2Resp = in2.nextLine();//Gets the user's input as an integer. 
       
             
//        }

       
//        //One method you might need is getRandomResponse()
//        public static String getRandomResponse(){
//             return "";
//        }
//        // It'll generate a random response when the chatbot doesn't understand what to say

//        //Here is an example of a method you might use.
//        public static String getResponse(String statements)
//         {
//                  String response = "";

//                  response = "Our menu includes many things. We sell breakfast, sandwiches, entrees, sides, and even desserts. Would you like to know about anything more specifically?";                 f (statement.indexOf("menu") >= 0)
//                  }                 if (statement.indexOf("sandwich") >= 0
//                                  || statement.indexOf("Sides") >= 0
//                                  || statement.indexOf("sandwiches") >= {
//                                         response = "We sell many different sandwiches, some include our Chicken Sandwich, Spicy Chicken Sandwich, our Chicken Delux Sandwich too, Is there anything else that I could help you with? "; 0
//                         r
//                                                           } else if (statement.indexOf("Deserts") >= 0
//                                  || statement.indexOf("sweets") >= 0
//                                  || statement.indexOf("dessert") >= 0
//                  {
//                          response = "We sell many different Desserts";
// //                   }         || statement.indexOf("desserts") >= 0)
// //                  response = getRandomResponse(); // Call the getRandomResponse method for a generic response
// //     }
// //     return response;
// }