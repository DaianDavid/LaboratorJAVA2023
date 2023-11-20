package lab05;

public class Cat {


    private String name;

    private String color;

    private Integer age;

    private Integer energylevel;

    private Integer hungerlevel;

    private Integer moodlevel;

    public Cat(String name,String color, Integer age){

        this .name = name;
        this .color = color;
        this .age = age;
        this .energylevel = 3;
        this .hungerlevel = 3;
        this .moodlevel = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void play(){
        this.moodlevel ++;
        this.energylevel --;
        this.hungerlevel ++;
     }

    public void sleep() {
        this.moodlevel ++;
        this.energylevel ++;
        this.hungerlevel ++;
     }

    public void feed() {
        this.energylevel ++;
        this.hungerlevel --;
      }
    }
