//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса двух бойцов " + totalWeight + "кг!");
        var massDifference = firstBoxer - secondBoxer;
        System.out.println("Разница между массами бойцов " + massDifference + "кг!");

        var weightDifference = secondBoxer % firstBoxer;
        System.out.println("Разница между массами бойцов " + weightDifference + "кг!");

        var totalHours = 640;
        var totalEmployees = totalHours / 8;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");





    }
}