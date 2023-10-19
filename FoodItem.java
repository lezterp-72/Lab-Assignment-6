//https://codegym.cc/groups/posts/java-extends-keyword-with-examples//

class FoodItem {
  protected String name;
  protected double fat;
  protected double carbs;
  protected double protein;
  protected double serving;
  protected double totalCal;

  private static final double CALORIES_PER_GRAM_FAT = 9.0;
  private static final double CALORIES_PER_GRAM_CARBS = 4.0;
  private static final double CALORIES_PER_GRAM_PROTEIN = 4.0;

  public FoodItem (){}

  public FoodItem(String name, double fat, double carbs, double protein, double serving) {
    this.name = name;
    this.serving = serving;
    this.fat = fat;
    this.carbs = carbs;
    this.protein = protein;
  }

  public void totalCal() {
    double totalPro = (protein * serving * CALORIES_PER_GRAM_PROTEIN);
    double totalCar = (carbs * serving * CALORIES_PER_GRAM_CARBS);
    double totalFat = (fat * serving * CALORIES_PER_GRAM_FAT);
    double totalCalories = (totalPro + totalCar + totalFat);
    totalCal = totalCalories;
  }

  public double getCals() {
    return totalCal;
  }


  public void printFood() {
    System.out.print("\nNutritional information per serving of " + name + ":\n\tFat: ");
    System.out.printf("%.2f", fat);
    System.out.print(" g\n\tCarbohydrates: ");
    System.out.printf("%.2f", carbs);
    System.out.print(" g\n\tProtein: ");
    System.out.printf("%.2f", protein);
  }

  public void printCal() {
    double[] Macro = new double[3];
    Macro[0] = fat;
    Macro[1] = carbs;
    Macro[2] = protein;
    String Highest = "Hello there";
    for (double i : Macro) {
      double max = 0;
      if (i > max && i == 0) {
       max = i;
        Highest = "Fat";
      }
      else if (i > max && i == 1) {
        max = i;
        Highest = "Carbohydrates";
      }
      else if (i > max && i == 2) {
        max = i;
        Highest = "Protein";
      }
      
    }

    System.out.print("\n\tTotal Calories for ");
    System.out.printf("%.2f", serving);
    System.out.print(" servings of " + name + ": ");
    System.out.printf("%.2f", totalCal);
    System.out.print("\n\tDominant Macronutrient: " + Highest);
    
  }

}


class VegetableItem extends FoodItem {
  protected double fiber;

  public VegetableItem(){}
  
  public VegetableItem(String name, double fat, double carbs, double protein, double serving, double fiber) {
    super(name,fat,carbs,protein,serving);
    this.fiber = fiber;
  }

}

class LeafyGreens extends VegetableItem {
  protected double iron;

  public LeafyGreens(String name, double fat, double carbs, double protein, double serving, double fiber, double iron) {
    super(name,fat,carbs,protein,serving,fiber);
    this.iron = iron;
  }

  public void printLeaf() {
    super.printFood();
    System.out.printf("%.2f", fiber);
    System.out.print("g\n\tIron: ");
    System.out.printf("%.2f", iron);
    System.out.print(" mg");
    super.printCal();
    
  }
  
}

class RootVegetable extends VegetableItem {
  protected double vitaminC;

  public RootVegetable(String name, double fat, double carbs, double protein, double serving, double fiber, double vitaminC) {
    super(name,fat,carbs,protein,serving,fiber);
    this.vitaminC = vitaminC;
  }

  public void printRoot() {
    super.printFood();
    System.out.printf("%.2f", fiber);
    System.out.print("g\n\tVitaman C: ");
    System.out.printf("%.2f", vitaminC);
    System.out.print(" mg");
    super.printCal();
    
  }

}

  
  
