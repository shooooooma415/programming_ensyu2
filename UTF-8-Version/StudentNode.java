/*
 *    プログラミング演習２
 *
 *    第8回演習
 *
 *    StudentNode.java
 *
 *    雛形：学生の情報を格納する二分探索木のノード
 */

 public class StudentNode {
  
  private StudentData data ;   // 学生の情報
  StudentNode left ;   // 左の子
  StudentNode right ;  // 右の子
  
  public StudentNode(StudentData data){
    this.data  = data ;
    this.left  = null ;
    this.right = null ;
  }

  public StudentData getData() {
    return data;
  }

  public String toString() {
    return "ID: " + data.id + ", Name: " + data.name;
  }
  
}

