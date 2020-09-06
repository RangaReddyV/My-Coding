package LetCo.mck;

public class AngleClock {
    public double angleClock(int hour, int minutes) {
        hour = hour == 12 ? 0: hour;
        double totalHours = hour + (double)minutes/60;
        //System.out.println("total houw"+totalHours+" hours "+hour);
        double hourAngle = totalHours*30;
       // System.out.println("hours angle houw"+hourAngle);
        double minutesAngle = (minutes*30)/5;
        System.out.println(minutesAngle+" dgfd "+hourAngle);
        return  Math.abs(minutesAngle - hourAngle) > 180 ? Math.abs(360 - (minutesAngle - hourAngle)) : Math.abs(minutesAngle - hourAngle);


    }

    public static void main(String[] args) {

        AngleClock angleClock = new AngleClock();
        System.out.println(angleClock.angleClock(12, 30));
        System.out.println(angleClock.angleClock(3, 30));
        System.out.println(angleClock.angleClock(3, 15));
        System.out.println(angleClock.angleClock(12, 50));
        System.out.println(angleClock.angleClock(8, 7));
    }
}
