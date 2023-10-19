import java.util.Scanner;

class Hello {
  public static void main(String[] args) {
    //Bunch of scanners I probably dont need but I used them so...//
    Scanner Name = new Scanner(System.in);
    Scanner Fat = new Scanner(System.in);
    Scanner Carb = new Scanner(System.in);
    Scanner Prot = new Scanner(System.in);
    Scanner Fib = new Scanner(System.in);
    Scanner Iron = new Scanner(System.in);
    Scanner VitC = new Scanner(System.in);
    Scanner Serv = new Scanner(System.in);
    Scanner in = new Scanner(System.in);



    System.out.println("Congratulations on choosing to have some Vegetables!");
    
    //Name of Vegetable//
    System.out.println("\n\nEnter the name of the vegetable:");
    String leafName = Name.nextLine();

    
    //Fat of Item//
    System.out.println("Enter the amount of fat in " + leafName + " (grams): ");
    double gramFats;
    do { 
      try { //Trys to take an integer from input//
        String s = in.nextLine();
        gramFats = Double.parseDouble(s);
        while (gramFats < 0) {
          System.out.println("Please enter a value greater than 0: ");
          gramFats = Fat.nextDouble();
        }
        break;
       }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);

    //Carbs of Item//
    System.out.println("Enter the amount of carbs in " + leafName + " (grams): ");
    double gramCarbs;
    do { 
      try { //Trys to take an integer from input//
        String s = in.nextLine();
        gramCarbs = Double.parseDouble(s);
        while (gramCarbs < 0) {
          System.out.println("Please enter a value greater than 0: ");
          gramCarbs = Carb.nextDouble();
        }
        break;
      }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);
      
    //Protien of Item//
    System.out.println("Enter the amount of protien in " + leafName + " (grams): ");
    double gramProts;
    do { 
      try { //Trys to take an integer from input//
        String s = in.nextLine();
        gramProts = Double.parseDouble(s);
        while (gramProts < 0) {
          System.out.println("Please enter a value greater than 0: ");
          gramProts = Prot.nextDouble();
        }
        break;
      }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);

    //Fiber of Item//
    System.out.println("Enter the amount of fiber in " + leafName + " (grams): ");
    double gramFibs;
    do { 
      try { //Trys to take an integer from input//
        String s = in.nextLine();
        gramFibs = Double.parseDouble(s);
        while (gramFibs < 0) {
          System.out.println("Please enter a value greater than 0: ");
          gramFibs = Fib.nextDouble();
        }
        break;
      }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);

    //Iron of Item//
    System.out.println("Enter the amount of iron in " + leafName + " (mg): ");
    double gramIron;
    do { 
      try { //Trys to take an integer from input//
        String s = in.nextLine();
        gramIron = Double.parseDouble(s);
        while (gramIron < 0) {
          System.out.println("Please enter a value greater than 0: ");
          gramIron = Iron.nextDouble();
        }
        break;
      }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);

    //Servings//
    System.out.println("Enter the amount of Servings: ");
    double servs;
    do { 
      try { //Trys to take an integer out of the input//
        String s = in.nextLine();
        servs = Double.parseDouble(s);
        while (servs < 0) {
          System.out.println("Please enter a value greater than 0: ");
          servs = Serv.nextDouble();
        }
        break;
      }
        catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
          System.out.println("Please enter a valid Ineger: ");
        }
    }
    while (true);
    
    LeafyGreens leaf = new LeafyGreens(leafName, gramFats, gramCarbs, gramProts, servs, gramFibs, gramIron);

    leaf.printLeaf();
    
    
    
    
    //START OF NON VEGTABLE TRACKER CODE//
    Scanner numFoods = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How many food items would you like to input? Hello there");
    int numFood = numFoods.nextInt();

    int counter = numFood;

    // int counter = 1;

    
    double TotalCals = 0;
    
    for (int i = 0; i < counter; i = i + 1) {
      //Name of Food Item//
      System.out.println("\n\nEnter the name of the food item:");
      String foodName = Name.nextLine();

      //Fat of Item//
      System.out.println("Enter the amount of fat in " + foodName + " (grams): ");
      double gramFat;
      do { 
        try { //Trys to take an integer from input//
          String s = in.nextLine();
          gramFat = Double.parseDouble(s);
          while (gramFat < 0) {
            System.out.println("Please enter a value greater than 0: ");
            gramFat = Fat.nextDouble();
          }
          break;
        }
          catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
            System.out.println("Please enter a valid Ineger: ");
          }
      }
      while (true);

      //Carbs of Item//
      System.out.println("Enter the amount of carbs in " + foodName + " (grams): ");

      double gramCarb;
      do { 
        try { //Trys to take an integer from input//
          String s = in.nextLine();
          gramCarb = Double.parseDouble(s);
          while (gramCarb < 0) {
            System.out.println("Please enter a value greater than 0: ");
            gramCarb = Carb.nextDouble();
          }
          break;
        }
          catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
            System.out.println("Please enter a valid Ineger: ");
          }
      }
      while (true);
      
      //Protien of Item//
      System.out.println("Enter the amount of protien in " + foodName + " (grams): ");

      double gramProt;
      do { 
        try { //Trys to take an integer from input//
          String s = in.nextLine();
          gramProt = Double.parseDouble(s);
          while (gramProt < 0) {
            System.out.println("Please enter a value greater than 0: ");
            gramProt = Prot.nextDouble();
          }
          break;
        }
          catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
            System.out.println("Please enter a valid Ineger: ");
          }
      }
      while (true);

      //Servings//
      System.out.println("Enter the amount of Servings: ");

      double serv;
      do { 
        try { //Trys to take an integer out of the input//
          String s = in.nextLine();
          serv = Double.parseDouble(s);
          while (serv < 0) {
            System.out.println("Please enter a value greater than 0: ");
            serv = Serv.nextDouble();
          }
          break;
        }
          catch (Exception e) { //if no integers in input, exception to get them to enter z different value//
            System.out.println("Please enter a valid Ineger: ");
          }
      }
      while (true);
      
      FoodItem Placehold = new FoodItem(foodName, gramFat, gramCarb, gramProt, serv);

      Placehold.totalCal();
      //Adds calories to total for final print//
      TotalCals = TotalCals + Placehold.getCals();
      
      //Output: Print statement in order (Name of food, Grams of Fat, Grams of Carbs, Grams of Protein, Number of Servings, Total Calories from all Nutrients)//
      Placehold.printFood();

    }

    //Printing of combined calorie totals//
    System.out.print("\n\nTotal combined calories for all food items: ");
    System.out.printf("%.2f", TotalCals);
    System.out.println("\nThank you for using the Nutrition Information System!");

  }
}