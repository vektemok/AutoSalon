package Welcome;

import java.util.Scanner;

public class Entrance implements CheckData{
    @Override
    public void checkDataUser() {
        Scanner sc = new Scanner(System.in);

        DataUser dataUser = new DataUser();
        System.out.println("Для запуска программы, пожалуйста введите тип аккаунта >>> Director, Seller");
        System.out.println("Введите логин");
        String login = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        while(true){
            if (dataUser.getDirecorLogin().equals(login) && dataUser.getDirecorPassword().equals(password)){
                System.out.println("Приветствую дорогой, Директор \n" +
                        "Пожалуйста наберите номер для работы с программой, если закончили введите 8\n" +
                        "1. Показать список всех автомобилей \n" +
                        "2. Показать самый дорогой автомобиль \n" +
                        "3.Показать самый дешевый автомобиль \n" );
                break;
            } else if (dataUser.getSellerLogin().equals(login) && dataUser.getSellerPassword().equals(password)){
                System.out.println("Приветствую дорогой, Продавец!" +
                        "Пожалуйста наберите номер для работы с программой, если закончили введите 8\n" +
                        "\n" +
                        "1. Показать весь список автомобилей \n" +
                        "2. Искать автомобиль \n" +
                        ">> По названию бренда\n" +
                        " >>По типу кузова \n" +
                        "3. Напишите тип кузова для поиска >>> Седан, Внедорожник Пикап\n" +
                        "4.ПО типу АКПП \n " +
                        ">>Автоматическая \n " +
                        ">>Ручная АКПП");
                break;

            }
        }
    }
}
