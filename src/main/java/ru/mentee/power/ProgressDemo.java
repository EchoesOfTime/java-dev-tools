package ru.mentee.power;

public class ProgressDemo {
  public static void main(String[] args) {
    MenteeProgress progress = new MenteeProgress(
        "Иван",
        1,
        7
    );
    System.out.println(progress.summary());
    if (progress.readyForSprint()) {
      System.out.println("Status: sprint ready");
    } else {
      System.out.println("Status: backlog first");
    }
    System.out.println("Текущая ветка: feature/DVT-4");
  }
}
