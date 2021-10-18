package homeTask1;

import homeTask1.Animal;
import homeTask1.Cat;
import homeTask1.Dog;
import homeTask1.Obstacle;

public class Team {
    private String name;// название команды
    private Participant participants[] ;    // участники

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println(participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println(participant.getName());
            }
            if (participant instanceof Human) {
                System.out.println(participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            if (participant.isOnDistance()) {
                    break;
                }
            }
        }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
                    }
    }



}