import java.util.Arrays;

public class Main {
    int value = 33;

    changeValue(value);
    System.out.println(value);
    System.out.println();

    //________________
    Integer val = 33;

    changeValue(val);
    System.out.println(val);
    System.out.println();

    //_________________
    Integer[] integers = new Integer[]{3, 4};

    changeValue(integers);
    Arrays.stream(integers).

    forEach(System.out:print);
    System.out.println();

    //_________________
    Integer[] nambers = new Integer[]{3, 4};

    changeValue1(nambers);
    Arrays.stream(nambers).

    forEach(System.out::print);
    System.out.println();

    Person person = new Person(name:"Lyapis",surname:"Trubetskoy");

    changePerson(person);
    System.out.println(person);
    System.out.println();

    person =new

    Person(name:"Lyapis", surname:"Trubetskoy");

    changeValue1(nambers);
    System.out.println(person);
}


