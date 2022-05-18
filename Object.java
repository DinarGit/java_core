public class Object {

    public static void main(String[] args) {

        class Team {
            /**
             * название команды; название команды;
             * массив из четырех участников — в конструкторе можно сразу всех участников указывать);
             */
            private String nameTeam = "Drug";
            Animal[] zoo = {new Cat("Mops"), new Hen("Irishka"), new Hippo("Hippo")};
            public Animal[] teamAnimal = new Animal[4];
            Random random = new Random();
            // Формируем команду
            public Team(String nameTeam) {
                this.nameTeam = nameTeam;
                for(int i = 0; i < 4; i++){
                    int ran = random.nextInt(3);
                    teamAnimal[i] = zoo[ran];
                }
            }
            // метод вывода информации обо всех членах команды.
            public void printInformationAboutTheTeam() {
                System.out.println("Team: " + nameTeam);
                for(Animal a : teamAnimal) {
                    System.out.println(a);
                    System.out.println("Run limit: " + a.run_limit);
                    if (a instanceof Swimable)
                        System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
                    if (a instanceof Jumpable)
                        System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
                }
                System.out.println();
            }
            // метод для вывода информации о членах команды, прошедших дистанцию;
            public void passedTheDistance(){
                System.out.println(nameTeam + "\n");
                for (Animal a : teamAnimal){
                    if(a.passing){
                        System.out.println(a + " successfully passed the distance.\n");
                    } else {
                        System.out.println(a + " did not pass the distance.\n");
                    }
                }
                System.out.println();
            }
        }
    }

    class Course {
        /**
         *  Добавить класс Course (полоса препятствий), в котором будут находиться:
         */
        Let[] let = new Let[3];
        Random random = new Random();
        // Создаем полосу препятствий
        public Course() {
            Track track = new Track(random.nextInt(100));
            Wall wall = new Wall(random.nextFloat() * 10);
            Water water = new Water(random.nextInt(100));
            let[0] = (Let) track;
            let[1] = (Let) wall;
            let[2] = (Let) water;
        }
        //Вывод информации о полосе препятствий
        public void printInformationAboutTheObstacle() {
            System.out.println("Length track: " + ((Track) let[0]).getLength());
            System.out.println("Height wall: " + ((Wall) let[1]).getHeight());
            System.out.println("Length water: " + ((Water) let[2]).getLength());
            System.out.println();
        }
        // Проходим полосу препятствий
        public void passObstacles(Team team){
            for(Animal animal : team.teamAnimal){
                for(Let l : let){
                    if(!l.doIt(animal)){
                        animal.setPassing(l.doIt(animal));
                        break;
                    }
                    animal.setPassing(true);
                }
            }
        }
    }

}
