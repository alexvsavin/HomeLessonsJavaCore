package homeTask1;

import homeTask1.Cat;
import homeTask1.Dog;
import homeTask1.Obstacle;

    public class Main {

        public static void main(String[] args) {

            Course c = new Course(new Obstacle[] {
                    new Cross(6),
                    new Wall(5),
                    new Water(9)
            }); // Создаем полосу препятствий
            Team team = new Team("Дримтим",
                    new Cat("Кот Пушистый", 10, 12, 0),
                    new Dog("Пес Преданный", 20, 5, 15),
                    new Cat("Кот Прыгучий", 9, 14, 0),
                    new Human ("Человек Иван", 50, 4, 50));  // Создаем команду
            team.getTeamInfo();

            c.doIt(team);
            team.showResults();
        }
    }


