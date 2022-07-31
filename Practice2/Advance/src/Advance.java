import java.util.Arrays;

public class Advance {

    public static void main(String[] args) {
        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
//        double increment = 0.01123;
//        double result = 0;
//        int count = 0;
//        do {
//            if (increment < 0) {
//                break;
//            }
//            result += increment;
//            count ++;
//            if (result >= 1_000_000) {
//                System.out.println(count);
//            }
//
//        } while (result < 1_000_000);
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.


        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

//        int[] array = {1,1,1,1,1};
//        for (int i =0; i < array.length; i++)
//            if (i % 2 == 0) {
//                array[i] = 0;
//            }
//        System.out.println(Arrays.toString(array));
        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
//        int totalChek = 0;
//        int numberServisec = 0;
//        double discont = 0;
//        if (!hasFuel && (!hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
//            totalChek = 1000;
//            numberServisec += 1;
//        } else {
//            if (hasMotorProblem) {
//                totalChek += 10000;
//                numberServisec += 1;
//            }
//            if (hasElectricsProblem) {
//                totalChek += 5000;
//                numberServisec += 1;
//            }
//            if (hasTransmissionProblem) {
//                totalChek += 4000;
//                numberServisec += 1;
//            }
//            if (hasWheelsProblem) {
//                totalChek += 2000;
//                numberServisec += 1;
//            }
//            if (numberServisec > 1) {
//                discont = (totalChek * 0.1);
//            }
//            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
//                discont = (totalChek * 0.2);
//            }
//            if (!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem) {
//                totalChek = 0;
//            }
//        }
//            System.out.println(totalChek - discont);

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.
Storage vodkaStorage = new Storage();
        Worker worker1 = new Worker(vodkaStorage);
        Worker worker2 = new Worker(vodkaStorage);
        Worker worker3 = new Worker(vodkaStorage);

        worker1.brokeVodka();
        worker2.brokeVodka();

    }
}