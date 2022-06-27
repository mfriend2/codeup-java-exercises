import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] arr, Person pers) {
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = pers;
        return newArr;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];
        Person mike = new Person("Mike");
        Person noelle = new Person("NoNo");
        Person augh = new Person("Augh");
        people[0] = mike;
        people[1] = noelle;
        people[2] = augh;
//        for(int x = 0; x < people.length; x++) {
//            System.out.println(people[x]);
//        }

        people = addPerson(people, new Person("Ange"));
        System.out.println(Arrays.toString(people));
        System.out.println(Arrays.toString(addPerson(people, new Person("Steph"))));
    }
}
