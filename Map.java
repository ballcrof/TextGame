import java.util.ArrayList;

public class Map{

  int[] position = {0, 0};

  public int[] Map_pos(){
    return position;
  }

  public void north(){
    position[0] = position[0] + 1;
  }
  public void south(){
    position[0] = position[0] - 1;
  }
  public void east(){
    position[1] = position[1] + 1;
  }
  public void west(){
    position[1] = position[1] - 1;
  }

}
