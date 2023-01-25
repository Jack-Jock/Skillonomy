object Skillnomy {
  def main(args: Array[String]): Unit =
  {


    var student1 = new Student("Дехта","Горислав", 17, new Address("Україна","Київ",
      "Григорія Сковороди", 5), new Wallet(700,0), 156);

    var student2 = new Student("Андрієць","Будивид", 24, new Address("Монако","Монако-Віль",
      "Рампар", 34), new Wallet(0,0), 472);

    var student3 = new Student("Гончар","Родослав", 20, new Address("Франція","Париж",
      "Луврська", 97), new Wallet(0,2050), 211);

    var student4 = new Student("Старовойт","Єгор", 19, new Address("США","Нью-Йорк",
      "Бруклінська", 3), new Wallet(550,100), 324);

    var student5 = new Student("Литвин","Юрій", 18, new Address("Латвія","Рига",
      "Григорія Сковороди", 5), new Wallet(200,0), 852);

    var student6 = new Student("Пономарьов","Нагнибіда", 21, new Address("Канада","Ванкувер",
      "Кіокушинська", 10), new Wallet(50,100), 165);

    var student7 = new Student("Хрієнко","Цвітан", 19, new Address("Испанія","Памплона",
      "Ернеста Хемінгуея", 60), new Wallet(500,300), 275);


    var teacher1 = new Teacher("Рудик","Єгор", 30, new Address("Україна", "Львів",
      "Степана Бендери", 7), new Wallet(2000,900), 700);
    var teacher2 = new Teacher("Гулевич","Флор", 54, new Address("Україна", "Харків",
      "Танкобудування", 145), new Wallet(400,100), 300);



    var listStudents1:List[Student]=List(student1, student5, student7);
    var listStudents2:List[Student]=List(student4, student6, student2, student3);
    var courseCost1:Int = 700;
    var courseCost2:Int = 300;


    println("Викладач : \n" + teacher1.toString() + ",\nСписок студентів викладача : " + "\n");
    OutPut(listStudents1, courseCost1);

    println("Викладач : \n" + teacher2.toString() + ",\nСписок студентів викладача : " + "\n");
    OutPut(listStudents2, courseCost2);


  }


  def OutPut(list:List[Student], courseCost:Int):Unit=
  {
    for(i <- 0 until list.length)
    {
      println(list(i).toString());
      var k: Double = 0;
      var money: Double = 0;
      var grade: Int = scala.util.Random.nextInt(100)
      println("Оцінка у 100 бальній системі : " + grade + "\nУ п'ятибальній системі");
      if (0 <= grade && grade <= 34) {
        println("1 з 5")
        k = courseCost * 0
        money = k - courseCost
        println("Стипендія студента : 0")
        println("Вам потрібно сплатити навчання повністю - " + money * -1 + ".Обміняйте валюту на токени на біржі, щоб сплатити навчання")
      }

      else if (35 <= grade && grade <= 59) {
        println("2 з 5")
        k = courseCost * 0.4
        money = k - courseCost
        println("Стипендія студента : 0")
        println("Вам потрібно сплатити навчання частково - " + money * -1 + ".Обміняйте валюту на токени на біржі, щоб сплатити навчання")
      }

      else if (60 <= grade && grade <= 74) {
        println("3 з 5")
        k = courseCost * 0.8
        money = k - courseCost
        println("Стипендія студента : 0")
        println("Вам потрібно сплатити навчання частково - " + money * -1 + ".Обміняйте валюту на токени на біржі, щоб сплатити навчання")
      }

      else if (75 <= grade && grade <= 89) {
        println("4 з 5")
        println("Стипендія студента : 0")
        println("Оплата за навчання не потрібна, через задовільні бали")
      }

      else if (90 <= grade && grade <= 100) {
        println("5 з 5")
        k = courseCost * 1.2
        money = k - courseCost
        println("Стипендія студента : " + money)
      }
    }
  }
}