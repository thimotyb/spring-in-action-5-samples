package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
  
  private  String id = "";
  private  String name = "";
  private  Type type = null;
  
  public Ingredient(String id, String name, Type type) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
}

  
  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }

}
