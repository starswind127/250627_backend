package practice.practice08;
public class ParkingLot {int calculateFee( int time ) {
    int money = 0;
    if (time <= 30) {
        money = 1000;
    } else {
        money = ((time - 30) / 10 * 500) + 1000;
    }
    money = money >= 20000 ? 20000 : money;

    return money;
}
}