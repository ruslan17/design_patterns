package creational.factory_method;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String makerName = scanner.next();


        WatchMaker watchMaker = getWatchMakerByName(makerName);
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getWatchMakerByName(String makerName) {
        if (makerName.equalsIgnoreCase("rome")) {
            return new RomeWatchMaker();
        } else if (makerName.equalsIgnoreCase("digital")) {
            return new DigitalWatchMaker();
        }
        throw new RuntimeException("Нет такого производителя");
    }

}

//interface WatchMakerCreator {
//    WatchMaker getWatchMakerByName();
//}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {

    @Override
    public void showTime() {
        System.out.println(LocalDateTime.now());
    }
}

class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("XVI - XXX");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class RomeWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}

class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}


