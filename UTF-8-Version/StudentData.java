/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    StudentData.java
 *
 *    雛形：学生の情報を格納するクラス
 */

 public class StudentData {

  int id; // ID
  String name; // 名前

  public StudentData(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return ("ID : " + this.id + "\n" + "Name : " + this.name);
  }

  public void print() {
    System.out.println(this.toString());
  }

  public int compareTo(StudentData target) {
    if (this.id < target.id) {
      return -1;
    } else if (this.id == target.id) {
      return 0;
    } else {
      return 1;
    }
  }
}
