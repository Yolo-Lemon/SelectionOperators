package selectionoperat;

public class SelectionOperators {

    public static void main(String[] args) {
        SelectOperatorstask1();
        SelectOperatorstask2();
        SelectOperatorstask3();
        SelectOperatorstask4();
        SelectOperatorstask5();
        SelectOperatorstask6();
        SelectOperatorstask7();
        SelectOperatorstask8();
        SelectOperatorstask9();
    }

    //Даны три целых числа. Возвести в квадрат отрицательные числа и прибавить 100 к  положительным, число 0 не изменять.
    private static void SelectOperatorstask1() {
        double a = 13;
        double b = -8;
        double c = 0;
        if (a > 0) {
            a = a + 100;
        } else if (a < 0) {
            a = Math.pow(a, 2);
        }
        if (b > 0) {
            b = b + 100;
        } else if (b < 0) {
            b = Math.pow(b, 2);
        }
        if (c > 0) {
            c = c + 100;
        } else if (c < 0) {
            c = Math.pow(c, 2);
        }
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }

    //Из трех данных чисел выбрать наименьшее и наибольшее.
    private static void SelectOperatorstask2() {
        int a = 1;
        int b = 2;
        int c = -4;
        if (a > b && a > c) {
            System.out.println("Наибольшее число равно: " + a);
        } else if (b > a && b > c) {
            System.out.println("Наибольшее число равно: " + b);
        } else if (c > a && c > b) {
            System.out.println("Наибольшее число равно: " + c);
        }
        if (a < b && a < c) {
            System.out.println("Наибольшее число равно: " + a);
        } else if (b < a && b < c) {
            System.out.println("Наибольшее число равно: " + b);
        } else if (c < a && c < b) {
            System.out.println("Наибольшее число равно: " + c);
        }
    }

    //Даны три числа. Найти сумму наибольших чисел.
    private static void SelectOperatorstask3() {
        int a = 11;
        int b = -7;
        int c = -4;
        if ((a > b || a > c) && (b > a || b > c)) {
            System.out.println("Сумма наибольших чисел равна: " + (a + b));
        } else if ((b > a || b > c) && (c > a || c > b)) {
            System.out.println("Сумма наибольших чисел равна: " + (c + b));
        } else if ((a > b || a > c) && (c > a || c > b)) {
            System.out.println("Сумма наибольших чисел равна: " + (c + a));
        }
    }

    //Даны две переменные целого типа: A и B. Если их значения не равны, то присвоить каждой переменной сумму этих значений, 
    //а если равны, то присвоить переменным нулевые значения.
    private static void SelectOperatorstask4() {
        int a = 12;
        int b = 8;
        if (a != b) {
            a = a + b;
            b = b + a - b;
            System.out.println(" a = " + a + " b = " + b);
        } else if (a == b) {
            a = 0;
            b = 0;
            System.out.println(" a = " + a + " b = " + b);
        }
    }

    //На числовой оси расположены три точки: A, B, C. Определить, какая из двух последних точек (B или C) расположена ближе к A, 
    //и вывести эту точку и ее расстояние от точки A.
    private static void SelectOperatorstask5() {
        int a = 12;
        int b = -8;
        int c = 5;
        if ((a - b) < (a - c)) {
            System.out.println("Точка В ближе к A и находится на растоянии: " + (a - b));
        } else if ((a - c) < (a - b)) {
            System.out.println("Точка C ближе к A и находится на растоянии: " + (a - c));
        }
    }

    //Дан номер некоторого года (положительное целое число). Вывести соответствующий ему номер столетия, учитывая, 
    //что, к примеру, началом 20 столетия был 1901 год.
    private static void SelectOperatorstask6() {
        int year = 1801;
        int century;
        if ((year > 0) && (year % 1 == 0)) {
            if (year % 100 == 0) {
                century = (year / 100);
            } else {
                century = (year / 100) + 1;
            }
            System.out.println("Год " + year + " это " + century + " столетие");
        }
    }

    //Дан номер месяца (1 — январь, 2 — февраль, ...). Вывести название соответствующего времени года ("зима", "весна" и т.д.).
    private static void SelectOperatorstask7() {
        int monthNum = 12;
        if ((monthNum > 0) && (monthNum < 13)) {
            if (monthNum == 12 || monthNum == 2 || monthNum == 1) {
                System.out.println("Указаный номер месяца принадлежит зиме");
            } else if (monthNum >= 3 && monthNum <= 5) {
                System.out.println("Указаный номер месяца принадлежит весне");
            } else if (monthNum >= 6 && monthNum <= 8) {
                System.out.println("Указаный номер месяца принадлежит лету");
            } else if (monthNum >= 9 && monthNum <= 11) {
                System.out.println("Указаный номер месяца принадлежит осени");
            }
        } else {
            System.out.println("Введенное число не соответствует номеру месяца");
        }
    }

    //Арифметические действия над числами пронумерованы следующим образом: 1 — сложение,
    //2— вычитание, 3 — умножение, 4 — деление. Дан номер действия и два числа A и B (В не равно нулю). Выполнить над числами указанное действие и вывести результат.
    private static void SelectOperatorstask8() {
        double a = 200;
        double b = 10;
        int arithmeticOperation = 4;
        switch (arithmeticOperation) {
            case 1:
                System.out.println("Результат сложения: " + (a + b));
                break;
            case 2:
                System.out.println("Результат вычитания: " + (a - b));
                break;
            case 3:
                System.out.println("Результат умножения: " + (a * b));
                break;
            case 4:
                if (b > 0) {
                    System.out.println("Результат деления: " + (a / b));
                    break;
                } else {
                    System.out.println("Не дели на ноль балбес");
                    break;
                }
            default:
                System.out.println("Номер арифметической операции не соответсвует заданным");
        }
    }

    //Локатор ориентирован на одну из сторон света ("С" — север, "З" — запад, "Ю" — юг, "В" — восток) и может принимать три цифровые команды:
    //1 — поворот налево, –1 — поворот направо, 2 — поворот на 180 градусов. Дан символ C — исходная ориентация локатора и числа N1 и N2 — две посланные ему команды. 
    //Вывести ориентацию локатора после выполнения данных команд.
    private static void SelectOperatorstask9() {
        int n1 = -1;
        int n2 = 2;
        char azimut = 'С';
        if (azimut == 'С') {
            switch (n1) {
                case 1:
                    azimut = 'З';
                    break;
                case -1:
                    azimut = 'В';
                    break;
                case 2:
                    azimut = 'Ю';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'Ю') {
            switch (n1) {
                case 1:
                    azimut = 'В';
                    break;
                case -1:
                    azimut = 'З';
                    break;
                case 2:
                    azimut = 'С';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'З') {
            switch (n1) {
                case 1:
                    azimut = 'Ю';
                    break;
                case -1:
                    azimut = 'С';
                    break;
                case 2:
                    azimut = 'В';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'В') {
            switch (n1) {
                case 1:
                    azimut = 'С';
                    break;
                case -1:
                    azimut = 'Ю';
                    break;
                case 2:
                    azimut = 'З';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
        if (azimut == 'С') {
            switch (n2) {
                case 1:
                    azimut = 'З';
                    break;
                case -1:
                    azimut = 'В';
                    break;
                case 2:
                    azimut = 'Ю';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'Ю') {
            switch (n2) {
                case 1:
                    azimut = 'В';
                    break;
                case -1:
                    azimut = 'З';
                    break;
                case 2:
                    azimut = 'С';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'З') {
            switch (n2) {
                case 1:
                    azimut = 'Ю';
                    break;
                case -1:
                    azimut = 'С';
                    break;
                case 2:
                    azimut = 'В';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        } else if (azimut == 'В') {
            switch (n2) {
                case 1:
                    azimut = 'С';
                    break;
                case -1:
                    azimut = 'Ю';
                    break;
                case 2:
                    azimut = 'З';
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
        System.out.println(azimut);
    }
}
