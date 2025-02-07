public class Main {
  public static void main(String[] args) {
    VideoGame vg = new VideoGame("God of War", 25);
    vg.setCategory("action");
    System.out.println(vg.getName());
    System.out.println(vg.getCategory());
    System.out.println(vg.getPrice());
  }
}