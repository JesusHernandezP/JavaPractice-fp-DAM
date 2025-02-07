import java.text.NumberFormat;

public class VideoGame {

  String name;
  double price;
  String category;

  VideoGame(String name, double price){
    this.name = name;
    if (price < 10) {
      this.price = 10;

    }else {
      this.price = price;
    }
  }

  static String[] categories = {"action", "rpg", "adventure", "racing"};

  public String getName() {
    return this.name.toUpperCase() + "$";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return nf.format(this.price);
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getCategory() {
    return this.category.toUpperCase() + ".";
  }

  public void setCategory(String category) {
    boolean isInlist = false;
    for (String cat : VideoGame.categories){
      if (cat == category){
        isInlist = true;
        break;
      }
    }
if (isInlist){
  this.category = category;
}else {
  System.out.println("No existe :(");
}

    this.category = category;
  }


}