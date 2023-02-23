public class Main {
   public static void main(String[] args) {
      task1();
      task2();
      task3();
      task4();
      task5();
      task6();
      task7();
      task8();
   }
   public static void task1() {
      System.out.println("Задача 1");
      int deposit = 15_000; // Ежемесячный вклад
      int TotalAmount = 2_459_000; //Итоговая сумма
      int month = 0; // Месяц по счёту
      int total = 0; //Сумма текущего накопления

      while (total <= TotalAmount) {
         total = total + deposit; //месячная прибавка
         System.out.println("Месяц " + ++month + ", сумма накоплений равна " + total);
      }
   }
   public static void task2() {
      System.out.println("Задача 2");
      int i = 1;
      while (i <= 10) {
         System.out.print(i + " ");
         i++;
      }
      i -= 1;
      System.out.println();

      for (; i >= 0; i--)
         System.out.print(i + " ");
      System.out.println();
   }
   public static void task3() {
      System.out.println("Задача 3");
      int birthRateBy1000 = 17; // Рождаемость на 1000 человек
      int declineBy1000 = 8; // Убыль на 1000 человек
      int numberOfpeople = 1000; // Количество человек как основа вычислений
      int numberOfPopulation = 12_000_000; // Численность населения в стране
      int year = 0; // Год

      while (++year <= 10) {
         numberOfPopulation = numberOfPopulation + (numberOfPopulation / numberOfpeople) * (birthRateBy1000 - declineBy1000);
         System.out.println("Год " + year + ", численность населения составляет " + numberOfPopulation);
      }
   }
   public static void task4() {
      System.out.println("Задача 4");
      int deposit = 15000; // Ежемесячный вклад
      int percent = 7; // Процент каждого месяца
      int total = 0; // Накопления промежуточные и общее накопление
      int month = 0; // Месяц
      int sum = 12_000_000; // Окончательная сумма накоплений
      int i = 0;

      for (; total <= 12_000_000; i++) {
         total = total + percent * (total / 100);
         total = total + deposit;
         System.out.println("Месяц " + i + ". Итого " + total);
      }
   }
   public static void task5() {
      System.out.println("Задача 5");
      int deposit = 15000; // Ежемесячные вложения, первая сумма
      int percent = 7; // Процент за каждый месяц
      int total = 0; // Накопления промежуточные и общее накопление
      int month = 0; // Месяц
      int sum = 12_000_000; // Окончательная сумма накоплений

      for (; total <= 12_000_000; month++) {
         total = total + percent * (total / 100);
         total = total + deposit;
         if(month % 6 == 0 && month != 0)
            System.out.println("Месяц " + month + ". Итого " + total);
      }
   }
   public static void task6() {
      System.out.println("Задача 6");
      int deposit = 15000; // Ежемесячный вклад
      int percent = 7; // Процент за каждый месяц
      int total = 0; // Накопления промежуточные и общее накопление
      int numberOfMonths = 9 * 12; // Количество месяцев накопления
      int sum; // Окончательная сумма накоплений
      int month = 0;

      for (; month <= numberOfMonths; month++) {
         total = total + percent * (total / 100);
         total = total + deposit;
         if(month % 6 == 0 && month != 0)
            System.out.println("Месяц " + month + ". Итого " + total);
      }
   }
   public static void task7() {
      System.out.println("Задача 7");
      int monthDuration = 31; // Кол-во дней в месяце
      int currentDay = 1; // Текущий день (пятница)
      int daysOfWeek = 7; // Дней в неделе

      while (currentDay <= monthDuration) {
         System.out.println("Сегодня пятница," + currentDay + "-е число. Необходимо подготовить отчет");
         currentDay += daysOfWeek;
      }
   }
   public static void task8() {
      System.out.println("Задача 8");
      int CurrentYear = 2023; // Текущий год
      int yearMin = CurrentYear - 200; // На 200 лет назад
      int yearMax = CurrentYear + 100; // На 100 лет вперёд

      for (int year = 0; year <= yearMax; year += 79) {
         if (year > yearMin && year < yearMax)
            System.out.println(year);
      }
   }
}