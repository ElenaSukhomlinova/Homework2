public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

            System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        System.out.println("Задача 6");
        var Boxer1Weight = 78.2;
        var Boxer2Weight = 82.7;
        var TotalBoxersWeight = Boxer1Weight + Boxer2Weight;
        System.out.println("Общая масса бойцов " + TotalBoxersWeight + " кг");
        var DiffBoxersWeight = Boxer2Weight - Boxer1Weight;
        System.out.println("Разница между массами бойцов " + DiffBoxersWeight + " кг");
        System.out.println(" ");

        System.out.println("Задача 7");
        var overloadBoxersWeight = Boxer2Weight % Boxer1Weight;
        System.out.println("Остаток от деления " + overloadBoxersWeight + " кг");
        System.out.println(" ");

        System.out.println("Задача 8");
        var TotalHours = 640;
        var HoursPerEmployee = 8;
        var EmployeesQty = TotalHours / HoursPerEmployee;
        System.out.println("Всего работников в компании - " + EmployeesQty + " человек");
        EmployeesQty = EmployeesQty + 94;
        TotalHours = EmployeesQty * 8;
        System.out.println("Если в компании работает " + EmployeesQty + " человек, то всего " + TotalHours + " часов работы может быть поделено между сотрудниками");
    }
}